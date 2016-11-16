package praktikum11;

/**
 * 1. rekursiivsus - meetod kutsub ennast ise v2lja (astendaja meetodi naitel)
 * 2. fibonacci number
 */
public class Rekursiivus {

	public static void main(String[] args) {
//		//Rekursiivsus
//		System.out.println(astenda(2, 4));
//		System.out.println(astenda(3, 4));
		
		//Fibonacci number
		System.out.println(fibb(6));

	}

	private static int fibb(int i) {
		if (i <= 1){
			return i;
		}
		return fibb(i -1) + fibb (i - 2);
	}

//	private static int astenda(int a, int b) {
//		int tulemus = a;
//		for (int i = 0; i < b - 1; i++){
//			tulemus = tulemus * a;
//		}
//
//		return tulemus;
//	}
//	private static int astenda(int a, int b){
//		if ( b == 1) {
//			return a;
//		}
//		return a * astenda(a, b - 1);
//	}

}
