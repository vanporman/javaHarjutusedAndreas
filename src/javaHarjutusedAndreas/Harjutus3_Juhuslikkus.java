package javaHarjutusedAndreas;

import java.util.Scanner;

/**
 * Juhuslikkus
 *
 * 1. Kirjutada m�ng kull ja kiri.
 *    Programm küsib kasutajalt: kas kull v�i kiri? "Viskab" mündi ja
 *    teatab, kas kasutaja arvas �igesti v�i mitte.
 *    Vihje: �ra hakka j�ndama Stringidega, küsi kasutajalt number.
 *
 * 2. Kirjutada liisu t�mbamise programm.
 *    Küsida kasutajalt inimeste arv. V�ljastada juhuslik number vahemikus 1
 *    kuni arv (kaasaarvatud).
 *    NB! Kontrollida, et töötab �igesti: st. öeldes mitu korda j�rjest
 *    arvuks 3, peab v�imalike vastuste hulgas olema nii ühtesid, kahtesid kui kolmi.
 *
 * 3. Kirjutada t�ringum�ng:
 *    Programm viskab kaks t�ringut m�ngijale ja kaks t�ringut endale
 *    (arvutile), arvutab m�lema m�ngija silmade summad ja teatab,
 *    kellel oli rohkem.
 */
public class Harjutus3_Juhuslikkus {
    public static void main(String[] args) {
    	
    	//Kull v�i kiri
    	/*
    	System.out.println("Kull v�i kiri?");
    	
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
    			System.out.println("T�istabamus!");
    		}
    		else{
    			System.out.println("Better luck nex time");
    		}
    	}
    	else if (mynt == 1){
    		System.out.println("Kiri!");
    		if(minuValik2 == 1){
    			System.out.println("T�istabamus!");
    		}
    		else{
    			System.out.println("Better luck nex time");
    		}
    	}*/
    	
    	//Liisu t�mbamine
    	/*
    	System.out.println("Kui palju on inimesi?");
    	
    	Scanner valikuSisestus = new Scanner(System.in);
    	int minuValik = valikuSisestus.nextInt();
    	
    	int liisk = (int) (1 + Math.random() * minuValik);
    	
    	System.out.println(liisk);
    	*/
    	/*
    	//T�ringum�ng
    	int mangijaSumma = 0;
    	int arvutiSumma = 0;;
    	
    	int mt = 2;
    	while (mt < 3){
    		mangijaSumma = ((int) (1 + Math.random() * 6)) + ((int) (1 + Math.random() * 6));
    		System.out.println("m�ngija: "+mangijaSumma);
    		mt++;
    	}
    	
    	int at = 2;
    	while (at < 3){
    		arvutiSumma = ((int) (1 + Math.random() * 6)) + ((int) (1 + Math.random() * 6));
    		System.out.println("arvuti: "+arvutiSumma);
    		at++;
    	}
    	if (mangijaSumma > arvutiSumma){
    		System.out.println("M�ngija v�itis, summa oli: " + mangijaSumma);
    	}
    	else if (mangijaSumma < arvutiSumma){
    		System.out.println("Arvuti viskas, summa oli: " + arvutiSumma);
    	}
    	else {
    		System.out.println("Viiiiiiik");
    	}*/
    }
}