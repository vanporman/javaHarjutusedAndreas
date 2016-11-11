package praktikum6;

import java.util.Scanner;

public class LiisuT6mbamine {

	public static void main(String[] args) {
		System.out.println("Kui palju on inimesi?");
    	
    	Scanner valikuSisestus = new Scanner(System.in);
    	int minuValik = valikuSisestus.nextInt();
    	
    	int liisk = Meetodid.suvalineArv(0, minuValik);
    	
    	//System.out.println(liisk);
    	
    	for (int i = 0; i < 2; i++) { // for tsükkel testimiseks
			System.out.println("Võtija on inimene nr: " + Meetodid.suvalineArv(1, minuValik));	
		}

	}

}
