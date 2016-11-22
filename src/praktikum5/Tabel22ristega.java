package praktikum5;

import java.util.Scanner;

/*
 * Koosta selline tabel. Kasutaja annab ette tabeli suuruse.
 * --------------
 * |x o o o o x |
 * |o x o o x o |
 * |o o x x o o |
 * |o o x x o o |
 * |o x o o x o |
 * |x o o o o x |
 * --------------
*/

public class Tabel22ristega {

	public static void main(String[] args) {
	
		System.out.println("Sisesta tabeli suurus:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int tabeliSuurus = sc.nextInt();
		//int tabeliSuurus = 5;
		
		tryki22Ris(tabeliSuurus);
		
		//Prindib tabeli ette vertikaalse kriipsu
		for (int i = 0; i < tabeliSuurus; i++) {
			System.out.print("|");
			for (int j = 0; j < tabeliSuurus; j++) {
				if(i +1 == j +1 || i + j == tabeliSuurus - 1){
					System.out.print("x ");					
				}
				else {
					System.out.print("o ");
				}
				//System.out.print("i:" + i + "j:" + j);
			}
			//Prindib tabeli taha vertikaalse kriipsu
			System.out.print("|");
			System.out.println(); // reavahetus
		}
		
		tryki22Ris(tabeliSuurus);
	}
	
	//Meetod mis trykib r6htkriipsud tabeli algusesse ja l6ppu
	private static void tryki22Ris(int tabeliSuurus){
		//Tabeli suurus korda 2 pluss 2
		for (int e = 0; e < tabeliSuurus * 2 + 2; e++) {
			System.out.print("-");
		}
		//Reavahetus
		System.out.println();
		
	}

}
