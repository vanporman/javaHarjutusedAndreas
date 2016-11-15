package praktikum9;

import java.util.ArrayList;

import lib.TextIO;

public class Inimesed {

	public static void main(String[] args) {
		ArrayList<Inimene> inimesed = new ArrayList<Inimene>();
		while (true) {
			System.out.println("Palun sisesta nimi (tühi nimi lõpetab sisestamise)");
			String nimi = TextIO.getlnString();
			if (nimi.equals("")) {
				break;
			}
			System.out.println("Palun sisesta vanus");
			int vanus = TextIO.getlnInt();
			inimesed.add(new Inimene(nimi, vanus));
		}
		
		for (Inimene inimene : inimesed) {
		    inimene.tervita();
		}

	}

}
