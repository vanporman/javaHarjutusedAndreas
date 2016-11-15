package praktikum9;

import praktikum6.Meetodid;

public class S6naT88tlus {

	public static void main(String[] args) {
		
		System.out.println("Sisesta sõna");
		String s6na = Meetodid.sisestaTekst(null);
		System.out.println(tryki(s6na));

	}

	public static String tryki(String sisend){
//		System.out.println(sisend.toUpperCase());
		String t88deldud = "";
		for (int i = 0; i < sisend.length(); i++) {
			if (i > 0){
				t88deldud += "-";
//				System.out.println(sisend.charAt(i));
			}
			t88deldud += sisend.toUpperCase().charAt(i);
		}
		return t88deldud;
	}
}
