package br.com.dio.desafio.dominio;

import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
 
	public static void main(String[] args) {
	Curso curso1 = new Curso();
	curso1.setTitulo("curso java");
	curso1.setDescricao("descrição curso java ");
	curso1.setCargaHoraria(8);
	
	Curso curso2 = new Curso();
	curso2.setTitulo("curso js");
	curso2.setDescricao("descrição curso js ");			
	curso2.setCargaHoraria(4);
	
	Conteudo conteudo = new Curso();
	Conteudo conteudo1 = new Mentoria();
	
	List<String> palavras = new ArrayList<>();																							
	
	Mentoria mentoria = new Mentoria();
	mentoria.setTitulo("mentoria de Java");
	mentoria.setDescricao("descrição mentoria java");
	mentoria.setData(LocalDate.now());
	
	
	/*System.out.println(curso1);
	System.out.println(curso2);
	System.out.println(mentoria);*/
	
	Bootcamp bootcamp = new Bootcamp();
	bootcamp.setNome("Bootcamp Java Developer");
	bootcamp.setDescricao("Descrição Bootcamp Java Developer");
	bootcamp.getConteudos().add(curso1);
	bootcamp.getConteudos().add(curso2);
	bootcamp.getConteudos().add(mentoria);
	
	Dev devJaqueline = new Dev();
	devJaqueline.setNome("Jaqueline");
	devJaqueline.inscreverBootcamp(bootcamp);
	System.out.println("Conteudos Inscritos" + devJaqueline.getConteudosInscritos());
	devJaqueline.progredir();
	devJaqueline.progredir();
	System.out.println("-");
	System.out.println("Conteudos Inscritos" + devJaqueline.getConteudosInscritos());
	System.out.println("Conteudos Concluidos" + devJaqueline.getConteudosConcluidos());
	System.out.println("XP:" + devJaqueline.calcularTotalXp());
	
	
	System.out.println("------------");
					
	Dev devJefson = new Dev();
	devJefson.setNome("Jefson");
	devJefson.inscreverBootcamp(bootcamp);
	System.out.println(" Inscritos" + devJefson.getConteudosInscritos());
	devJefson.progredir();
	devJefson.progredir();
	devJefson.progredir();
	System.out.println("-");
	System.out.println(" Inscritos" + devJefson.getConteudosInscritos());
	System.out.println("Conteudos Concluidos" + devJefson.getConteudosConcluidos());
	System.out.println("XP:" + devJefson.calcularTotalXp());

	}

}
