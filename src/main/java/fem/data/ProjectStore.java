package fem.data;

import fem.dto.Project;

import java.io.File;

public class ProjectStore extends Store<Project> {

    public ProjectStore(File file) {
        super(file);
    }

    @Override
    public Project newInstance() {
        return new Project();
    }
}
