package br.com.dio;

import java.time.LocalDate;

import br.com.dio.dominio.*;

public class Main {
    public static void main(String[] args) {
        Course curso1 = new Course("Curso 1", "Descrição curso 1", 6);
        Course curso2 = new Course("Curso 2", "Descrição curso 2", 12);
        Mentoring mentoria = new Mentoring("Mentoria", "Descrição da mentoria", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição bootcamp java developer");
        bootcamp.addContent(curso1);
        bootcamp.addContent(curso2);
        bootcamp.addContent(mentoria);

        Developer maria = new Developer("Maria");
        maria.signUpForBootcamp(bootcamp);
        System.out.println("Conteudos inscritos maria: " + maria.getSubscribedContents());

        Developer joao = new Developer("Joao");
        joao.signUpForBootcamp(bootcamp);
        System.out.println("\nConteudos inscritos joao: " + joao.getSubscribedContents());

        maria.advance();
        maria.advance();
        System.out.println("\n\nConteudos finalizados maria: " + maria.getFinishedContents());
        System.out.println("Xp-> " + maria.calculateTotalXp());

        joao.advance();
        System.out.println("Conteudos finalizados joao: " + joao.getFinishedContents());
        System.out.println("Xp-> " + joao.calculateTotalXp());
    }
}
