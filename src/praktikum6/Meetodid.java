package praktikum6;

import java.util.Scanner;

public class Meetodid {
	
	public static void main(String[] args){
		//int arv = 3;
		
		//int kuubis = kuup(arv);
		//System.out.println(kuubis);
		
		//int ruudus = ruut(arv);
		//System.out.println(ruudus);
		
		int kasutajaSisestatudArv = Meetodid.kasutajaSisestus(0, 10);
		System.out.println("Kasutaja siestas: " + kasutajaSisestatudArv);
		
		//for (int i = 0; i < 10; i++) {
		//	System.out.println(suvalineArv(-10, 10));
		//}
	}
	
	public static int kasutajaSisestus(String kysimus, int min, int max){
		while (true){
			System.out.println(kysimus);
			Scanner sc = new Scanner(System.in);
			int sisestus = sc.nextInt();
			if (sisestus < min || sisestus > max){
				System.out.println("See arv ei sobi");
			} else {
				return sisestus;							
			}
		}
	}
	
	public static int kasutajaSisestus(int min, int max){
		String kysimus = "Sisesta arv vahemikus " + min + " kuni " + max;
		return kasutajaSisestus(kysimus, min, max);
	}
	
	public static int ruut(int i){
		return i *i;
	}
	
	public static int kuup(int i){
		return (int) Math.pow(i, 3);
	}
	
	public static int suvalineArv(int min, int max){
		int vahemik = max - min + 1;
		return min + (int) (Math.random() * vahemik);
	}
	
	public static int sisestaNumber(int i){
		Scanner sc = new Scanner(System.in);
		int yksNumber = sc.nextInt();
		return yksNumber;
	}
	
	public static String sisestaTekst(String i){
		Scanner sc = new Scanner(System.in);
		String yksText = sc.nextLine();
		return yksText;
	}
	
}
