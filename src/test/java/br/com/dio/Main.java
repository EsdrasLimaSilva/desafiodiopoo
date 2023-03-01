package br.com.dio;

import java.time.LocalDate;

import br.com.dio.dominio.*;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Curso java", "Descrição do curso", 110);
        Course course2 = new Course("Curso javascript", "Descrição do curso", 110);

        Mentoring mentoring1 = new Mentoring("Mentoria de java", "Descrição da mentoria de java", LocalDate.now());
        System.out.println(course1);
        System.out.println(mentoring1);
    }
}
