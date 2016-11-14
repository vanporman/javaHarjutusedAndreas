package praktikum8;

import praktikum6.Meetodid;

public class Arvud {

	public static void main(String[] args) {
		int[] arvud = new int[3];
		
		for (int i = 0; i < arvud.length; i++) {
			System.out.println("Sisesta väärtus indeksile " + i);
			arvud[i] = Meetodid.sisestaNumber(i);
		}

//		for (int i = arvud.length - 1; i >= 0; i--) {
//			System.out.println(arvud[i]);
//		}
		
		for (int i = 0; i < arvud.length; i++) {
			System.out.println(arvud[arvud.length - i - 1]);
		}

		
	}

}
