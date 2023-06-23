import src.br.com.dio.desafio.dominio.Bootcamp;
import src.br.com.dio.desafio.dominio.Curso;
import src.br.com.dio.desafio.dominio.Dev;
import src.br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main{
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de POO em Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Curso de JavaScript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("descricao mentoria Java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devFelipe = new Dev();
        devFelipe.setNome("Felipe");
        devFelipe.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: "+ devFelipe.getConteudosInscritos());
        devFelipe.progredir();
        System.out.println("---");
        System.out.println("Conteúdos inscritos: "+ devFelipe.getConteudosInscritos());
        devFelipe.progredir();
        System.out.println("---");
        System.out.println("Conteúdos inscritos: "+ devFelipe.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: "+ devFelipe.getConteudosConcluidos());
        System.out.println("XP: " + devFelipe.calcularTotalXp());

        System.out.println("\n#############################################################################################\n");
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: "+ devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("---");
        System.out.println("Conteúdos inscritos: "+ devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("---");
        System.out.println("Conteúdos inscritos: "+ devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: "+ devJoao.getConteudosConcluidos());
        System.out.println("XP: "+ devJoao.calcularTotalXp());
    }
}