package praktikum9;

import praktikum6.Meetodid;
import praktikum7.TagurpidiS6na;

public class Palindroom {

	public static void main(String[] args) {
		System.out.println("Sisesta s�na");
		String s6na = Meetodid.sisestaTekst(null);
		System.out.println(TagurpidiS6na.tagurpidi(s6na));
		if (onPalindroom(s6na)){
			System.out.println("See s�na on palindroom");
		} else {
			System.out.println("See s�na ei ole palindroom");
		}

	}
	
	public static boolean onPalindroom(String s6na){
		return s6na.equals(TagurpidiS6na.tagurpidi(s6na));
	}

}
