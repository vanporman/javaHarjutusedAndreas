package javaHarjutusedAndreas;

import java.util.Scanner;

/**
 * Juhuslikkus
 *
 * 1. Kirjutada m‰ng kull ja kiri.
 *    Programm k√ºsib kasutajalt: kas kull vıi kiri? "Viskab" m√ºndi ja
 *    teatab, kas kasutaja arvas ıigesti vıi mitte.
 *    Vihje: ‰ra hakka j‰ndama Stringidega, k√ºsi kasutajalt number.
 *
 * 2. Kirjutada liisu tımbamise programm.
 *    K√ºsida kasutajalt inimeste arv. V‰ljastada juhuslik number vahemikus 1
 *    kuni arv (kaasaarvatud).
 *    NB! Kontrollida, et t√∂√∂tab ıigesti: st. √∂eldes mitu korda j‰rjest
 *    arvuks 3, peab vıimalike vastuste hulgas olema nii √ºhtesid, kahtesid kui kolmi.
 *
 * 3. Kirjutada t‰ringum‰ng:
 *    Programm viskab kaks t‰ringut m‰ngijale ja kaks t‰ringut endale
 *    (arvutile), arvutab mılema m‰ngija silmade summad ja teatab,
 *    kellel oli rohkem.
 */
public class Harjutus3_Juhuslikkus {
    public static void main(String[] args) {
    	
    	//Kull vıi kiri
    	/*
    	System.out.println("Kull vıi kiri?");
    	
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
    			System.out.println("T‰istabamus!");
    		}
    		else{
    			System.out.println("Better luck nex time");
    		}
    	}
    	else if (mynt == 1){
    		System.out.println("Kiri!");
    		if(minuValik2 == 1){
    			System.out.println("T‰istabamus!");
    		}
    		else{
    			System.out.println("Better luck nex time");
    		}
    	}*/
    	
    	//Liisu tımbamine
    	/*
    	System.out.println("Kui palju on inimesi?");
    	
    	Scanner valikuSisestus = new Scanner(System.in);
    	int minuValik = valikuSisestus.nextInt();
    	
    	int liisk = (int) (1 + Math.random() * minuValik);
    	
    	System.out.println(liisk);
    	*/
    	/*
    	//T‰ringum‰ng
    	int mangijaSumma = 0;
    	int arvutiSumma = 0;;
    	
    	int mt = 2;
    	while (mt < 3){
    		mangijaSumma = ((int) (1 + Math.random() * 6)) + ((int) (1 + Math.random() * 6));
    		System.out.println("m‰ngija: "+mangijaSumma);
    		mt++;
    	}
    	
    	int at = 2;
    	while (at < 3){
    		arvutiSumma = ((int) (1 + Math.random() * 6)) + ((int) (1 + Math.random() * 6));
    		System.out.println("arvuti: "+arvutiSumma);
    		at++;
    	}
    	if (mangijaSumma > arvutiSumma){
    		System.out.println("M‰ngija vıitis, summa oli: " + mangijaSumma);
    	}
    	else if (mangijaSumma < arvutiSumma){
    		System.out.println("Arvuti viskas, summa oli: " + arvutiSumma);
    	}
    	else {
    		System.out.println("Viiiiiiik");
    	}*/
    }
}