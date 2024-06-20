package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(87);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição do curso Js");
        curso2.setCargaHoraria(80);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição da mentoria Java");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java DIO");
        bootcamp.setDescricao("Descrição do bootcamp Java DIO");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devMateus = new Dev();
        devMateus.setNome("Mateus");
        devMateus.inscreverBootcamp(bootcamp);
        System.out.println("Mateus, você se inscreveu no " + devMateus.getConteudoInscritos());
        devMateus.progredir();
        devMateus.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos: " + devMateus.getConteudoInscritos());
        System.out.println("Mateus, conteudos concluido: "+ devMateus.getConteudoConcluido() );
        System.out.println("XP: " + devMateus.calcularXpTotal());

        System.out.println("=======================================");

        Dev devSonia = new Dev();
        devSonia.setNome("Sonia");
        devSonia.inscreverBootcamp(bootcamp);
        System.out.println("Sonia, você se inscreveu no " + devSonia.getConteudoInscritos());
        devSonia.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos: " + devSonia.getConteudoInscritos());
        System.out.println("Sonia, conteudos concluido: "+ devSonia.getConteudoConcluido() );
        System.out.println("XP: " + devSonia.calcularXpTotal());
    }
}
