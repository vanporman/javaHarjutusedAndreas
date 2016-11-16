package praktikum7;

import praktikum6.Meetodid;

/**
 * Programm, mis kysib inimeste hulka, nende nimesid ja siis valib nende hulgast yhe v6itja
 *
 */
public class LiisuHeitmine {

	public static void main(String[] args) {
		System.out.println("Sisesta inimeste arv!");
		int arv = 0;
		int inimesteHulk = Meetodid.sisestaNumber(arv);
		System.out.println(inimesteHulk);
		
		//Massiiv, mille suuruseks on kasutaja poolt sisestatud inimeste hulk
		String[] nimed = new String[inimesteHulk];
		for (int i = 0; i < nimed.length; i++){
			System.out.println("sisesta nimi, indeksiga " + (i + 1));
			String nimi = "";
			nimed[i] = Meetodid.sisestaTekst(nimi);
		}
		
		int suvalineIndeks = Meetodid.suvalineArv(0, inimesteHulk);
		
		System.out.println("V6itja on (indeksiga: " + (suvalineIndeks + 1) + ")" + nimed[suvalineIndeks]);

	}

}
