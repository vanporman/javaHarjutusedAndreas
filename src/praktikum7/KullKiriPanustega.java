package praktikum7;

import praktikum6.Meetodid;

public class KullKiriPanustega {

	public static void main(String[] args) {
		//Kull või kiri
		// 0    =   1
		
		int kasutajaRaha = 100;
		
		while (kasutajaRaha > 0) {
			System.out.println("Sul on: " + kasutajaRaha + " raha");
			int maxPanus = Math.min(25, kasutajaRaha);
			int kasutajaPanus = Meetodid.kasutajaSisestus("Sisesta panus, max " + maxPanus + " raha", 1, maxPanus);
			kasutajaRaha -= kasutajaPanus;
			
			int kasutajaPakub = Meetodid.kasutajaSisestus("Kas kull või kiri?", 0, 1);
			int myndiVise = Meetodid.suvalineArv(0, 1);
			
			System.out.println("Kasutaja pakub: " + kasutajaPakub);
			System.out.println("Myndivise: " + myndiVise);
			
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
