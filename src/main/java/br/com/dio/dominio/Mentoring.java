package br.com.dio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoring extends Content {
    private String date;
    private final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // constructors (overloading)
    public Mentoring() {

    }

    public Mentoring(String title) {
        setTitle(title);
    }

    public Mentoring(String title, String description) {
        setTitle(title);
        setDescription(description);
    }

    public Mentoring(String title, String description, LocalDate date) {
        setTitle(title);
        setDescription(description);
        setFormatedDate(date);
    }

    public String getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        setFormatedDate(date);
    }

    private void setFormatedDate(LocalDate date) {
        this.date = date.format(DATE_FORMATTER);
    }

    // ==

    public double calculateXp() {
        return (double) STANDART_XP + 40;
    }

    @Override
    public String toString() {
        return "\nMentoring => Title: " + getTitle() + " | Description: " + getDescription() + " | Date: " + date;
    }

}