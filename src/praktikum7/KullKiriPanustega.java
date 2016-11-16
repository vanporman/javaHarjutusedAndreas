package praktikum7;

import praktikum6.Meetodid;

/**
 * M2ng, kus kasutajal on kindel kogus raha, mida ta saab maximum 25 kaupa maha mängida. Kui kasutajal on v2hem raha kui 25
 * siis saab ta panustada maksimaalselt oma raha v22rtuses. Rahaga nulli j6udes l6ppeb programm.
 */
public class KullKiriPanustega {

	public static void main(String[] args) {
		//Kull või kiri
		// 0    =   1
		
		int kasutajaRaha = 100;
		
		//Kestab kuni kasutajal on raha rohkem kui null
		while (kasutajaRaha > 0) {
			//Kasutaja sisestab oma panuse
			System.out.println("Sul on: " + kasutajaRaha + " raha");
			//Kasutaja saab sisestada max 25 või kui tal on v2hem raha, siis oma raha piires
			int maxPanus = Math.min(25, kasutajaRaha);
			int kasutajaPanus = Meetodid.kasutajaSisestus("Sisesta panus, max " + maxPanus + " raha", 1, maxPanus);
			kasutajaRaha -= kasutajaPanus;
			
			int kasutajaPakub = Meetodid.kasutajaSisestus("Kas kull või kiri?", 0, 1);
			int myndiVise = Meetodid.suvalineArv(0, 1);
			
			System.out.println("Kasutaja pakub: " + kasutajaPakub);
			System.out.println("Myndivise: " + myndiVise);
			
			//Myndiviske loogika
			if (kasutajaPakub == myndiVise) {
				System.out.println("Panid täppi, saad raha topelt tagasi");
				kasutajaRaha += kasutajaPanus * 2;
				System.out.println("Sul on nyyd " + kasutajaRaha + " raha");
			} else {
				System.out.println("Kaotus! Kaotasid " + kasutajaPanus);
			} 
		}
		System.out.println("Kõik, raha otsas");
	}
}
