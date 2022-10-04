package com.google.lesson_07;

import java.util.ArrayList;
import java.io.Serializable;
public class Project implements Serializable, Cloneable {
    private String projectName;
    private ArrayList<User> developers = new ArrayList<>();

    public Project(String projectName, ArrayList<User> developers) {
        this.projectName = projectName;
        this.developers = developers;
    }
    @Override
    public Project clone() {
        try {
            return (Project) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectName='" + projectName + '\'' +
                ", developers=" + developers +
                '}';
    }

    public Project(Project project) {
        this.projectName = project.projectName;
        for (int i = 0; i < project.developers.size(); i++) {
            this.developers.add(new User(project.developers.get(i)));
        }
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ArrayList<User> getDevelopers() {
        return developers;
    }

    public void setDevelopers(ArrayList<User> developers) {
        this.developers = developers;
    }
}
