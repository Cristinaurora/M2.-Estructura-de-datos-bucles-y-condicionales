import java.util.Arrays;

import java.util.List;

import java.util.ArrayList;


public class Fase2 {

	public static void main(String[] args) {

	    List<Character> nombre = Arrays. asList('a', '1', 'r', 'o', 'r', 'a');
	    
		for (int i = 0; i < nombre.size(); i++) {
			if (Character.isDigit(nombre.get(i))) {
				System.out.println("els noms de persones no contenen números!");
			}
			if ("aeiou".indexOf(nombre.get(i)) < 0) {
				System.out.println("VOCAL");
			}
			else {
				System.out.println("CONSONANT");
			}
				
		}

	}

}
