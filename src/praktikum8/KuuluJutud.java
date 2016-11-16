package praktikum8;

import praktikum6.Meetodid;

/**
 * Programm, mis v2ljastab kolmest massiivist juhuslikud s6ned ja moodustab nendest lause.
 *
 */
public class KuuluJutud {

	public static void main(String[] args) {
		
		//Kolm massiivi
		String[] meheNimed = {"Juku", "Kalle", "Raid"};
		String[] naiseNimed = {"Triin", "Tuula", "Mari", "Maali"};
		String[] tegevused = {"laulavad", "jooksevad", "tegutsevad"};
		
		//Edastab ekraanile kolmest s6nest lause
		System.out.format("%s ja %s %s.", suvalineElement(meheNimed), suvalineElement(naiseNimed), suvalineElement(tegevused));

	}
	
	//Meetid mis valib massiivist suvalise s6ne, mida kasutatakse ekraanile trykkimiseks
	public static String suvalineElement(String[] s6nad){
		int suvalineIndeks = Meetodid.suvalineArv(0, s6nad.length - 1);
		return s6nad[suvalineIndeks];
	}
	
}
