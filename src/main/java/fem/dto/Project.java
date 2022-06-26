package com.example.javaprojekt226b.fem.dto;

import java.util.Objects;

public class Project implements CommaSeparatedValue {
    private String name;

    public Project() {
    }

    public Project(String name) {
        this.name = name;
    }

    @Override
    public String getCommaSeparateValue() {
        return name + DELIMITER;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void loadCommaSeparateValue(String commaSeparatedValue) {
        String[] split = commaSeparatedValue.split(DELIMITER);
        setName(split[0]);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(name, project.name);
    }

}
