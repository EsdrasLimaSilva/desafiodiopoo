package br.com.dio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoring {
    private String title;
    private String description;
    private String date;
    private final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // constructors (overloading)
    public Mentoring() {

    }

    public Mentoring(String title) {
        this.title = title;
    }

    public Mentoring(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Mentoring(String title, String description, LocalDate date) {
        this.title = title;
        this.description = description;
        setFormatedDate(date);
    }

    // getters
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    // setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(LocalDate date) {
        setFormatedDate(date);
    }

    private void setFormatedDate(LocalDate date) {
        this.date = date.format(DATE_FORMATTER);
    }

    @Override
    public String toString() {
        return "Mentoring => Title: " + title + " | Description: " + description + " | Date: " + date;
    }

}