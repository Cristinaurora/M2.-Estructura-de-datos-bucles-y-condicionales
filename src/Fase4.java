import java.util.Arrays;

import java.util.List;

import java.util.ArrayList;


public class Fase4 {

	public static void main(String[] args) {

	    List<Character> name = Arrays.asList('A', 'u', 'r', 'o', 'r', 'a');
	    List<Character> surname = Arrays.asList('L', 'e', 'o', 'n');
	    
        List<Character> fullName = new ArrayList(name);
        fullName.add(' ');
        fullName.addAll(surname);
        
		for (char c:fullName) {
			System.out.println(c);
		}

	}

}
