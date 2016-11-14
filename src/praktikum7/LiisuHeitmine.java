package praktikum7;

import praktikum6.Meetodid;

public class LiisuHeitmine {

	public static void main(String[] args) {
		System.out.println("Sisesta inimeste arv!");
		int arv = 0;
		int inimesteHulk = Meetodid.sisestaNumber(arv);
		System.out.println(inimesteHulk);
		
		String[] nimed = new String[inimesteHulk];
		for (int i = 0; i < nimed.length; i++){
			System.out.println("sisesta nimi, indeksiga " + i);
			String nimi = "";
			nimed[i] = Meetodid.sisestaTekst(nimi);
		}
		
		int suvalineIndeks = Meetodid.suvalineArv(0, inimesteHulk);
		
		System.out.println("Suvaline nimi on (indeksiga: " + suvalineIndeks + ")" + nimed[suvalineIndeks]);

	}

}
