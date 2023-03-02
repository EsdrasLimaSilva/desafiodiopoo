package br.com.dio.dominio;

import java.util.*;

public class Developer {
    private String name;
    private Set<Content> subscribeContents = new LinkedHashSet<>();
    private Set<Content> finishedContents = new LinkedHashSet<>();

    public Developer(String name) {
        this.name = name;
    }

    public void signUpForBootcamp(Bootcamp bootcamp) {
        this.subscribeContents.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDevelopers().add(this);
    }

    public void advance() {
        Optional<Content> content = this.subscribeContents.stream().findFirst();
        if (content.isPresent()) {
            this.finishedContents.add(content.get());
            this.subscribeContents.remove(content.get());
        } else {
            System.err.println("Você não está escrito em nenhum conteúdo");
        }

    }

    public double calculateTotalXp() {
        return this.finishedContents.stream().mapToDouble(Content::calculateXp).sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribedContents() {
        return subscribeContents;
    }

    public void setSubscribedContents(Set<Content> subscribedContents) {
        this.subscribeContents = subscribedContents;
    }

    public Set<Content> getFinishedContents() {
        return finishedContents;
    }

    public void setFinishedContents(Set<Content> finishedContents) {
        this.finishedContents = finishedContents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || this.getClass() != o.getClass())
            return false;

        Developer dev = (Developer) o;

        return Objects.equals(this.name, dev.name) && Objects.equals(this.subscribeContents, dev.subscribeContents)
                && Objects.equals(this.finishedContents, dev.finishedContents);

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.subscribeContents, this.finishedContents);
    }

}
