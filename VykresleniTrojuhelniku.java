package ppa1;

import java.util.*;

public class VykresleniTrojuhelniku {

	final static String VERZE_APLIKACE = "V3.1.4";
	final static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("Start (" + VERZE_APLIKACE + ")");
		
		vykresliTrojuhelnik(7);

		System.out.println("Konec");
	}
	
	public static void vykresliTrojuhelnik(int pocetRadek) {
		
		for(int i = 1; i <= pocetRadek; i++) {
			
			vypisZnaky(' ', pocetRadek - i);
			vypisZnaky('*', i);
			System.out.println();	
		}
	}
	
	public static void vypisZnaky(char znak, int pocet) {
		
		for(int i = 0; i < pocet; i++) {
			System.out.print(znak);
		}
		
		/*if(znak == '*') {
			
			System.out.println(VERZE_APLIKACE);
		}*/
	}
}