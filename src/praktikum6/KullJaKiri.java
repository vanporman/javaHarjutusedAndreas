package praktikum6;

public class KullJaKiri {

	public static void main(String[] args) {
		//Kull v�i kiri
		// 0 = kull
		// 1 = kiri
		
		int kasutajaArvab = Meetodid.kasutajaSisestus("Sisesta kull (0) v�i kiri (1)", 0, 1);
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
