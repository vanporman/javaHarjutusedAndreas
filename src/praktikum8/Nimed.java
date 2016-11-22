package praktikum8;

import java.util.ArrayList;
import java.util.Collections;

import praktikum6.Meetodid;

/**
 * Programm, mis kysib kasutajalt nimed ja lisab need massiivi ja v2ljastab tulemuse ekraanile.
 * Programm l6petab tegevuse kui nime asemel sisestatakse tyhi v22rtus
 */
public class Nimed {

	public static void main(String[] args) {
		ArrayList<String> nimed = new ArrayList<>();
		while (true){
			System.out.println("Sisesta nimed");
			String sisestus = Meetodid.sisestaTekst(null);
			if (sisestus.equals("")){
				break;
			}
			else {
				nimed.add(sisestus);
			}
		}
		
		Collections.sort(nimed);
		System.out.println(nimed);
	}

}
