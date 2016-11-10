package javaHarjutusedAndreas;

import java.util.Scanner;

/**
 * Juhuslikkus
 *
 * 1. Kirjutada mäng kull ja kiri.
 *    Programm küsib kasutajalt: kas kull või kiri? "Viskab" mündi ja
 *    teatab, kas kasutaja arvas õigesti või mitte.
 *    Vihje: ära hakka jändama Stringidega, küsi kasutajalt number.
 *
 * 2. Kirjutada liisu tõmbamise programm.
 *    Küsida kasutajalt inimeste arv. Väljastada juhuslik number vahemikus 1
 *    kuni arv (kaasaarvatud).
 *    NB! Kontrollida, et töötab õigesti: st. öeldes mitu korda järjest
 *    arvuks 3, peab võimalike vastuste hulgas olema nii ühtesid, kahtesid kui kolmi.
 *
 * 3. Kirjutada täringumäng:
 *    Programm viskab kaks täringut mängijale ja kaks täringut endale
 *    (arvutile), arvutab mõlema mängija silmade summad ja teatab,
 *    kellel oli rohkem.
 */
public class Harjutus3_Juhuslikkus {
    public static void main(String[] args) {
    	
    	//Kull või kiri
    	/*
    	System.out.println("Kull või kiri?");
    	
    	Scanner valikuSisestus = new Scanner(System.in);
    	String minuValik = valikuSisestus.next();
    	
    	int minuValik2;
    	if (minuValik.equals("Kull")){
    		minuValik2 = 0;
    	}
    	else if (minuValik.equals("Kiri")) {
    		minuValik2 = 1;
    	}
    	
    	//System.out.println(minuValik2);
    	System.out.println("------VISE!--------");
    	
    	
    	int mynt = 0;
    	
    	mynt = (int) (Math.random() * 2);
    	//System.out.println(mynt);
    	
    	if (mynt == 0){
    		System.out.println("Kull!");
    		if(minuValik.equals("Kull")){
    			System.out.println("Täistabamus!");
    		}
    		else{
    			System.out.println("Better luck nex time");
    		}
    	}
    	else if (mynt == 1){
    		System.out.println("Kiri!");
    		if(minuValik2 == 1){
    			System.out.println("Täistabamus!");
    		}
    		else{
    			System.out.println("Better luck nex time");
    		}
    	}*/
    	
    	//Liisu tõmbamine
    	/*
    	System.out.println("Kui palju on inimesi?");
    	
    	Scanner valikuSisestus = new Scanner(System.in);
    	int minuValik = valikuSisestus.nextInt();
    	
    	int liisk = (int) (1 + Math.random() * minuValik);
    	
    	System.out.println(liisk);
    	*/
    	/*
    	//Täringumäng
    	int mangijaSumma = 0;
    	int arvutiSumma = 0;;
    	
    	int mt = 2;
    	while (mt < 3){
    		mangijaSumma = ((int) (1 + Math.random() * 6)) + ((int) (1 + Math.random() * 6));
    		System.out.println("mängija: "+mangijaSumma);
    		mt++;
    	}
    	
    	int at = 2;
    	while (at < 3){
    		arvutiSumma = ((int) (1 + Math.random() * 6)) + ((int) (1 + Math.random() * 6));
    		System.out.println("arvuti: "+arvutiSumma);
    		at++;
    	}
    	if (mangijaSumma > arvutiSumma){
    		System.out.println("Mängija võitis, summa oli: " + mangijaSumma);
    	}
    	else if (mangijaSumma < arvutiSumma){
    		System.out.println("Arvuti viskas, summa oli: " + arvutiSumma);
    	}
    	else {
    		System.out.println("Viiiiiiik");
    	}*/
    }
}