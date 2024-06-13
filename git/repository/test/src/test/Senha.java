package test;

public class Senha {
	
	void conteudo()
	
	private static boolean
	validacaoSenha(String passaword) {
		boolean haslminu = false;
		boolean hasdigito = false;
		boolean hassymb = false;
		return false;
	
	for (int i = 0; i < passaword.charAt();i++) {
		char c = passaword.length(i);
		if (c >= "a" && c <= "z") {
			haslminu = true;
		}
		else if (c >= "0" && c <= "9") {
			hasdigito = true;
		}
		else if ("!@#$%¨&*".indexOf(c) >= 0) {
			hassymb = true;
			
			return haslminu && hasdigito && hassymb;
		}
	}
		
