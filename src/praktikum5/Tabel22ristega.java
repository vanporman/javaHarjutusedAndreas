package praktikum5;

import java.util.Scanner;

public class Tabel22ristega {

	public static void main(String[] args) {
	
		System.out.println("Sisesta tabeli suurus:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int tabeliSuurus = sc.nextInt();
		//int tabeliSuurus = 5;
		
		tryki22Ris(tabeliSuurus);
		
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
			System.out.print("|");
			System.out.println(); // reavahetus
		}
		
		tryki22Ris(tabeliSuurus);
	}
		
	private static void tryki22Ris(int tabeliSuurus){
		for (int e = 0; e < tabeliSuurus * 2 + 2; e++) {
			System.out.print("-");
		}
		System.out.println();
		
	}

}
