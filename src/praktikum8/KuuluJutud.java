package praktikum8;

import praktikum6.Meetodid;

public class KuuluJutud {

	public static void main(String[] args) {

		String[] meheNimed = {"Juku", "Kalle", "Raid"};
		String[] naiseNimed = {"Triin", "Tuula", "Mari", "Maali"};
		String[] tegevused = {"laulavad", "jooksevad", "tegutsevad"};
		
		System.out.format("%s ja %s %s.", suvalineElement(meheNimed), suvalineElement(naiseNimed), suvalineElement(tegevused));

	}
	
	public static String suvalineElement(String[] s6nad){
		int suvalineIndeks = Meetodid.suvalineArv(0, s6nad.length - 1);
		return s6nad[suvalineIndeks];
	}
	
}
