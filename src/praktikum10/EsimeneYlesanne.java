package praktikum10;

import java.util.ArrayList;

/**
 * 1. V2ljasta massiivi suurim number
 * 2. V2ljasta massiivide maatriksi suurim number
 */
public class EsimeneYlesanne {

	public static void main(String[] args) {
		
		//Leiab massiivist suurima numbri
//		int[] massiiv = {1, 3, 6, 7, 8, 3, 5, 7, 21, 3};
//		int suurim = Integer.MIN_VALUE;
//		for (int i = 0; i < massiiv.length; i++) {
//			if (suurim < massiiv[i]){
//				suurim = massiiv[i];
//			}
//		}
//		System.out.println(suurim);
		
		int[][] neo = {
				{1, 3, 6, 7},
				{2, 33, 3, 1},
				{17, 4, 5, 0},
				{-20, 13, 16, 17}
		};
		
		//ArryList kuhu lisatakse iga rea suurim number
		ArrayList<Integer> suurimad = new ArrayList();
		for (int i = 0; i < neo.length; i++) {
			suurimad.add(suurimNumber(neo[i]));
		}
		
		//ArryList -> Massiiviks
		int[] suurimadMassiiv = new int[suurimad.size()];
		for (int i = 0; i < suurimad.size(); i++) {
			suurimadMassiiv[i] = (int) suurimad.get(i);
		}
		
		//L6ppvastus - kasutab uuesti suurimNumber meetodit
		int suurim = suurimNumber(suurimadMassiiv);
		
		System.out.println("Iga rea suurim number " + suurimad);
		System.out.println("Suurim number nendest neljast: " + suurim);
		
	}

	//Massiivi suurim number
	private static int suurimNumber(int[] massiiv) {
		int suurim = Integer.MIN_VALUE;
		for (int i = 0; i < massiiv.length; i++) {
			if (suurim < massiiv[i]){
				suurim = massiiv[i];
			}
		}
		return suurim;
	}

}
