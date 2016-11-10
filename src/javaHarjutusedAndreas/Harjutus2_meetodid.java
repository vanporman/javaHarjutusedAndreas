package javaHarjutusedAndreas;

import java.util.Scanner;


/**
 * 1. Kirjutada meetod, mis tagastab parameetrina etteantud arvu kuubi.
 * 2. Kirjutada meetod, mis saab parameetritena kaks arvu (vahemiku) ning
 *    tagastab kasutaja sisestatud arvu, juhul kui see on lubatud vahemikus.
 *    Senikaua, kui kasutaja sisestab midagi ebasobivat, käseb meetod kasutajal
 *    arvu uuesti sisestada.
 */
public class Harjutus2_meetodid {

    public static void main(String[] args) {
    	
    	//System.out.println("Sisesta arv:");
    	//Scanner sisestaArv = new Scanner(System.in);
    	//int minuArv = sisestaArv.nextInt();
    	//tostaKuupi(minuArv);
    	
    	String kysimusKasutajale = "Sisesta siia üks arv vahemikus ";
    	int min = 5;
    	int max = 15;
    	kasutajaSisestus(kysimusKasutajale, min, max);
    	
    }

    public static void tostaKuupi(int arv) {
    	int uusArv = arv*arv*arv;
    	System.out.println("kuup sellest on: " + uusArv);
    }

    public static void kasutajaSisestus(String kysimus, int min, int max) {
    	int minuArv;
    	while(true){
    		System.out.println(kysimus + min + " ja " + max);
    		Scanner sisestaArv = new Scanner(System.in);
	    	minuArv = sisestaArv.nextInt();
			//if (min < minuArv && minuArv < max){
	    	if (minuArv < max && minuArv > min){
	    		System.out.println("Sobib. Su arv on "+minuArv);
	    		break;
	    	} else {
	    		System.out.println("See ei sobi vahemikku, proovi uuesti");	    		
	    	}
    	}
    }
}
