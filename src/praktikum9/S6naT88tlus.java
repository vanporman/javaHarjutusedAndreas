package praktikum9;

import praktikum6.Meetodid;

/**
 * Kysib kasutajalt s6na, muudab t2hed suurtekst2htedeks ja lisab iga t2he vahele sidekriipsu
 *
 */
public class S6naT88tlus {

	public static void main(String[] args) {
		
		System.out.println("Sisesta s�na");
		String s6na = Meetodid.sisestaTekst(null);
		System.out.println(tryki(s6na));

	}
	
	public static String tryki(String sisend){
//		System.out.println(sisend.toUpperCase());
		String t88deldud = "";
		//Lisab s6nade t2htede vahele sidekriipsud
		for (int i = 0; i < sisend.length(); i++) {
			if (i > 0){
				t88deldud += "-";
//				System.out.println(sisend.charAt(i));
			}
			//Muudab tähed suurteks t2htedeks
			t88deldud += sisend.toUpperCase().charAt(i);
		}
		return t88deldud;
	}
}
