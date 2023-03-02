package br.com.dio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate startDate = LocalDate.now();
    private final LocalDate endDate = startDate.plusDays(45);

    private Set<Developer> subscribedDevelopers = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

    public Bootcamp() {

    }

    public Bootcamp(String name) {
        this.name = name;
    }

    public Bootcamp(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void addContent(Content content) {
        contents.add(content);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Set<Developer> getSubscribedDevelopers() {
        return subscribedDevelopers;
    }

    public void setSubscribedDevelopers(Set<Developer> subscribedDevelopers) {
        this.subscribedDevelopers = subscribedDevelopers;
    }

    public Set<Content> getContents() {
        return this.contents;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || this.getClass() != o.getClass())
            return false;

        Bootcamp bootcamp = (Bootcamp) o;

        return Objects.equals(this.name, bootcamp.getName())
                && Objects.equals(this.description, bootcamp.getDescription())
                && Objects.equals(this.startDate, bootcamp.getStartDate())
                && Objects.equals(this.endDate, bootcamp.getEndDate())
                && Objects.equals(this.subscribedDevelopers, bootcamp.getSubscribedDevelopers())
                && Objects.equals(this.contents, bootcamp.getContents());

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, startDate, endDate, subscribedDevelopers, contents);
    }

}
