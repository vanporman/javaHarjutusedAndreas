package praktikum7;

import praktikum6.Meetodid;

public class Arva2Ra {

	public static void main(String[] args) {
		
		int arvutiArv = Meetodid.suvalineArv(1, 100);
		
		while (true) {
			int kasutajaArv = Meetodid.kasutajaSisestus("Palun sisesta arv �hest sajani", 1, 100);
			if (kasutajaArv == arvutiArv) {
				System.out.println("Arvasid �ra!");
				break;
			} else if (kasutajaArv > arvutiArv) {
				System.out.println("Arvuti m�eldud arv on v�iksem");
			} else {
				System.out.println("Arvuti m�eldud arv on suurem");
			} 
		}
	}

}
