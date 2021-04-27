package br.com.erickfreire.escopo;

/**
 * Programa em Java que testa vari�veis locais e globais
 * @author Erick Freire
 * @version 1 - Criado em 26-04-2021 as 22:31
 */

public class Escopo {
	
	private static int x = 1;
	
	
	public static void main(String[] args) {
		
		int x = 5;
		
		System.out.printf("Vari�vel Local no m�todo principal � : %d%n", x);
		
		useVariavelLocal();
		useCampo();
		useVariavelLocal();
		useCampo();
		
		System.out.printf("%n Vari�vel Local no m�to principal �: %d%n", x);
		
	}
	
	public static void useVariavelLocal() {
		int x = 25;
		
		System.out.printf("%nVari�vel local no m�todo useVariavelLocal �: %d%n", x);
		
		++x;
		
		System.out.printf("%nVari�vel local no m�todo useVariavelLocal antes de sair �: %d%n", x);
	}
	
	public static void useCampo() {
		System.out.printf("%nVari�vel local no m�todo useCampo inicialmente �: %d%n", x);
		
		x *= 10;
		
		System.out.printf("%nVari�vel local no m�todo useCampo saindo �: %d%n", x);
	}

}
