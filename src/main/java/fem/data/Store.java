package fem.data;

import fem.dto.CommaSeparatedValue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Store<T extends CommaSeparatedValue> {
    private List<T> objects;
    private File file;

    public Store(File file) {
        this.file = file;
        this.objects = new ArrayList<>();
    }

    public void add(T object) {
        this.objects.add(object);
        this.save();
    }

    public void delete(T object) {
        this.objects.remove(object);
        this.save();
    }

    public List<T> getAll() {
        return objects;
    }

    public abstract T newInstance();

    public void save()  {
        String csv = "";
        for (T obj : objects) {
            csv += obj.getCommaSeparateValue() + System.lineSeparator();
        }
        try {
            Files.writeString(file.toPath(), csv);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void load() throws IOException {
        this.objects = Files.lines(file.toPath()).map(line -> {
            T instance = newInstance();
            instance.loadCommaSeparateValue(line);
            return instance;
        }).collect(Collectors.toList());
    }

}
