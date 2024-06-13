package test;

import java.util.Scanner;

public class javateste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner  sc = new Scanner(System.in);
		
		//entrada
		System.out.print("DIGITE SUA SENHA:");
		
		
		
		String passaword = sc.nextLine();
		
		if (validacaoSenha(passaword)) {
			System.out.print("Senha valida!");
		}else {
			System.out.println("Senha invalida! a senha deve conter letras minusculas, numeros e simbolos");
		}
		
		sc.close();
		
		
		
		
	}

}
