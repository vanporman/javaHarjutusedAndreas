package praktikum7;

import java.util.Scanner;

/**
 * Kasutaja sisestatud s6na p88ratakse tagurpidi
 *
 */
public class TagurpidiS6na {
	
	public static void main(String[] args){
		
		System.out.println("Sisesta sõna:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String s6na = sc.nextLine();
		
		System.out.println(tagurpidi(s6na));
		
	}
	
	//Meetod mis p88rab s6na tagurpidi
	public static String tagurpidi(String oigetpidi){
		//Tyhi muutuja, millele hakatakse liitma t2hti vastupidises j2rjekorras
		String tagurpidi = "";
		for (int i = oigetpidi.length() - 1; i >= 0; i--){
			tagurpidi += oigetpidi.charAt(i);
		}
		return tagurpidi;
	}
		

}
