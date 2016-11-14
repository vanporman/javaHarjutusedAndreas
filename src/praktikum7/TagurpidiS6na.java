package praktikum7;

import java.util.Scanner;

public class TagurpidiS6na {
	
	public static void main(String[] args){
		
		System.out.println("Sisesta sõna:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String s6na = sc.nextLine();
		
		System.out.println(tagurpidi(s6na));
		
	}
	
	public static String tagurpidi(String oigetpidi){
		String tagurpidi = "";
		for (int i = oigetpidi.length() - 1; i >= 0; i--){
			tagurpidi += oigetpidi.charAt(i);
		}
		return tagurpidi;
	}
		

}
