package br.com.erickfreire.escopo;

/**
 * Programa em Java que testa variáveis locais e globais
 * @author Erick Freire
 * @version 1 - Criado em 26-04-2021 as 22:31
 */

public class Escopo {
	
	private static int x = 1;
	
	
	public static void main(String[] args) {
		
		int x = 5;
		
		System.out.printf("Variável Local no método principal é : %d%n", x);
		
		useVariavelLocal();
		useCampo();
		useVariavelLocal();
		useCampo();
		
		System.out.printf("%n Variável Local no méto principal é: %d%n", x);
		
	}
	
	public static void useVariavelLocal() {
		int x = 25;
		
		System.out.printf("%nVariável local no método useVariavelLocal é: %d%n", x);
		
		++x;
		
		System.out.printf("%nVariável local no método useVariavelLocal antes de sair é: %d%n", x);
	}
	
	public static void useCampo() {
		System.out.printf("%nVariável local no método useCampo inicialmente é: %d%n", x);
		
		x *= 10;
		
		System.out.printf("%nVariável local no método useCampo saindo é: %d%n", x);
	}

}
