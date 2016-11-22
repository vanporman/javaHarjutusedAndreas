package praktikum8;

import praktikum6.Meetodid;

/**
 * Kysib kasutajalt kindla koguse arve ja v2ljastab need tagurpidises j2rjekorras konsooli
 *
 */
public class Arvud {

	public static void main(String[] args) {
		int[] arvud = new int[3];
		
		//Kysib kasutajalt numbreid
		for (int i = 0; i < arvud.length; i++) {
			System.out.println("Sisesta väärtus indeksile " + i);
			arvud[i] = Meetodid.sisestaNumber(i);
		}
		
		//Trykib sisestatud numbrid vastupidises j2rjekorras v2lja
		for (int i = arvud.length - 1; i >= 0; i--) {
			System.out.println(arvud[i]);
		}
		
//		for (int i = 0; i < arvud.length; i++) {
//			System.out.println(arvud[arvud.length - i - 1]);
//		}

		
	}

}
