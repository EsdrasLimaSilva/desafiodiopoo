package br.com.dio.dominio;

public class Course extends Content {
    private int workload;

    // constructors (overloading)
    public Course() {

    }

    public Course(String title) {
        setTitle(title);
    }

    public Course(String title, String description) {
        setTitle(title);
        setDescription(description);
    }

    public Course(String title, String description, int workload) {
        setTitle(title);
        setDescription(description);
        this.workload = workload;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    public double calculateXp() {
        return (double) STANDART_XP * workload;
    }

    @Override
    public String toString() {
        return "\nCourse => Title: " + getTitle() + " | Description: " + getDescription() + " | Workload: " + workload
                + " hours";
    }
}
