package praktikum7;

import praktikum6.Meetodid;

public class Arva2Ra {

	public static void main(String[] args) {
		
		int arvutiArv = Meetodid.suvalineArv(1, 100);
		
		while (true) {
			int kasutajaArv = Meetodid.kasutajaSisestus("Palun sisesta arv ühest sajani", 1, 100);
			if (kasutajaArv == arvutiArv) {
				System.out.println("Arvasid üra!");
				break;
			} else if (kasutajaArv > arvutiArv) {
				System.out.println("Arvuti müeldud arv on vüiksem");
			} else {
				System.out.println("Arvuti müeldud arv on suurem");
			} 
		}
	}

}
