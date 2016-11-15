package praktikum9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import praktikum6.Meetodid;

public class KymmeS6na {

	public static void main(String[] args) {

		String[] s6nad = new String[1];
		
		for (int i = 0; i < s6nad.length; i++) {
			System.out.println("Sisesta sõna nr " + (i+1));
			String s6nadSisse = Meetodid.sisestaTekst(null);
			s6nad[i] = s6nadSisse;
		}
		
		for (int i = 0; i < s6nad.length; i++) {
			System.out.println(s6nad[i].length() + " " + s6nad[i]);
		}
		
		System.out.println(Arrays.toString(s6nad));
		

//		ArrayList<String> s6nadeList = new ArrayList<>();
	}

}

