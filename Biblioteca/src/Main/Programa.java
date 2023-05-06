package Main;

import java.util.Scanner;

import classes.Livro;

public class Programa {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		String autor, titulo;
		int ano;
		
		System.out.println("---Sistema Biblioteca---");
		System.out.println("Insira Titulo:");
		autor = input.next();
		System.out.println("Insira o nome do Autor: ");
		titulo = input.next();
		System.out.println("Ano de publicação: ");
		ano = input.nextInt();
		input.close();
		Livro livro1 = new Livro(titulo, autor, ano);
		
		
		livro1.emprestar();
		livro1.devolver();
		System.out.println(livro1.exibirInformacao());
	}

}
