package javaHarjutusedAndreas;

import java.util.Arrays;

/**
 * Kasutades while() {} tsükleid, lahendada järgmised ülesanded:
 * 1. Trükkida ekraanile numbrid 10 kuni 1
 * 2. Trükkida ekraanile paaritud arvud vahemikus 0 kuni 10
 * 3. Trükkida ekraanile liitmise tabel:
 *    0  1  2  3  4  5  6  7  8  9
 *    1  2  3  4  5  6  7  8  9 10
 *    2  3  4  5  6  7  8  9 10 11
 *    3  4  5  6  7  8  9 10 11 12
 *    4  5  6  7  8  9 10 11 12 13
 *    5  6  7  8  9 10 11 12 13 14
 *    6  7  8  9 10 11 12 13 14 15
 *    7  8  9 10 11 12 13 14 15 16
 *    8  9 10 11 12 13 14 15 16 17
 *    9 10 11 12 13 14 15 16 17 18
 */
public class Harjutus1_tsyklid {
	
	public static void main(String []args){
//		int count = 10;
//		while (count > 0){
//			System.out.println(count);
//			count--;
//		}
//		
//		System.out.println("---");
//		
//		int count2 = 1;
//		while (count2 < 10){
//			System.out.println(count2);
//			count2 = count2 + 2;
//		}
//		
//		System.out.println("---");
		
		int [][] tabel = new int [10][10];
		int count3 = 0;
		int count4 = 0;
		
		while (count3 < 10){
			count4 = 0;
			while (count4 < 10){
				tabel[count3][count4] = count3 + count4;
				count4++;
			}
			count3++;
		}
		
		int count5 = 0;
		while (count5 < 10){
			String finalTabel = Arrays.toString(tabel[count5]);
			//System.out.println(Arrays.toString(tabel[count5]));
			System.out.printf("%s\n", finalTabel);
			//System.out.println(Arrays.deepToString(tabel));
			count5++;
		}
	}
}
