package praktikum6;

/**
 * Kull ja kiri: kasutaja sisestab oma arvamuse ja seej2rel v6rreldakse seda arvuti visatud myndiga.
 *
 */
public class KullJaKiri {

	public static void main(String[] args) {
		//Kull v6i kiri
		// 0 = kull
		// 1 = kiri
		
		int kasutajaArvab = Meetodid.kasutajaSisestus("Sisesta kull (0) v6i kiri (1)", 0, 1);
		int myndiVise = Meetodid.suvalineArv(0, kasutajaArvab);
		
		System.out.println("Kasutaja pakub: " + kasutajaArvab);
		System.out.println("Myndivise: " + myndiVise);
		
		if (kasutajaArvab == myndiVise){
			System.out.println("Luck");
		} else {
			System.out.println("Better luck next time");
		}
		
		//System.out.println(myndiVise);

	}

}
