package br.com.dio.dominio;

public abstract class Content {
    protected static final double STANDART_XP = 10d;
    private String title;
    private String description;

    public abstract double calculateXp();

    // getters
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    // setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
