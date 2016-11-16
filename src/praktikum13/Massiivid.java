package praktikum13;

public class Massiivid {

	public static void main(String[] args) {

		int[] arvud = {3, 4, 6, 98};
		
		int[][] neo = {
				{1, 1, 1, 1, 1},
				{2, 3, 4, 5, 6},
				{3, 4, 5, 6, 7},
				{4, 5, 6, 7, 8},
				{5, 6, 7, 8, 9},
		};
		
		tryki(ridadeMaksimumid(neo));
	}

	/*
	 * Kirjutada meetod, mis trykib ekraanile yhel real parameetrina etteantud
	 * yhem66tmelise t2isarvumassiivi elemendid
	 */
	public static void tryki(int[] massiiv) {
		for (int arv : massiiv) {
			System.out.print(arv + " ");
		}
		System.out.println();
	}

	/*
	 * Kirjutada meetod, mis trykib ekraanile parameetrina etteantud
	 * kahem66tmelise massiivi (maatriksi)
	 * 
	 * Kasuta maatriksi rea trykkimiseks kindlasti eelnevalt kirjutatud
	 * meetodit!
	 */
	public static void tryki(int[][] maatriks) {
		for (int[] rida : maatriks) {
			tryki(rida);
		}
	}

	/*
	 * Arvutada maatriksi iga rea elementide summa
	 */
	public static int[] ridadeSummad(int[][] maatriks) {
		int[] summad = new int[maatriks.length];
		for (int i = 0; i < maatriks.length; i++) {
			summad[i] = reaSumma(maatriks[i]);
		}
		return summad;
	}
	
	/*
	 * Arvutab ühe rea summa
	 */
	public static int reaSumma(int[] massiiv) {
		int summa = 0;
		for (int arv : massiiv) {
			summa += arv;
		}
		return summa;
	}

	/*
	 * Arvutada k6rvaldiagonaali elementide summa (k6rvaldiagonaal on see, mis
	 * jookseb ylevalt paremast nurgast alla vasakusse nurka)
	 */
	public static int korvalDiagonaaliSumma(int[][] maatriks) {
		int summa = 0;
		for (int i = 0; i < maatriks.length; i++) {
			summa += maatriks[i][maatriks.length - 1 - i];
		}
		return summa;
	}

	public static int peaDiagonaaliSumma(int[][] maatriks) {
		int summa = 0;

		for (int i = 0; i < maatriks.length; i++) {
			for (int j = 0; j < maatriks[i].length; j++) {
				if (i == j)
					summa += maatriks[i][j];
				// System.out.print(maatriks[i][j] + "(i=" + i + " j=" + j + ")
				// ");
			}
			// System.out.println();
		}

		return summa;
	}

	public static int peaDiagonaaliSummaEfektiivsem(int[][] maatriks) {
		int summa = 0;
		for (int i = 0; i < maatriks.length; i++) {
			summa += maatriks[i][i];
		}
		return summa;
	}

	/*
	 * Leida iga rea suurim element
	 */
	public static int[] ridadeMaksimumid(int[][] maatriks) {
		int[] maksimumid = new int[maatriks.length];
		for (int i = 0; i < maatriks.length; i++) {
			maksimumid[i] = reaMaksimum(maatriks[i]);
		}
		return maksimumid;
	}

	public static int reaMaksimum(int[] massiiv) {
		int maksimum = Integer.MIN_VALUE;
		for (int arv : massiiv) {
			if (arv > maksimum)
				maksimum = arv;
		}
		return maksimum;
	}
}








