package br.com.dio.dominio;

public class Course {
    private String title;
    private String description;
    private int workload;

    // constructors (overloading)
    public Course() {

    }

    public Course(String title) {
        this.title = title;
    }

    public Course(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Course(String title, String description, int workload) {
        this.title = title;
        this.description = description;
        this.workload = workload;
    }

    // getters
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getWorkload() {
        return workload;
    }

    // setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Mentoring => Title: " + title + " | Description: " + description + " | Workload: " + workload
                + " hours";
    }
}
