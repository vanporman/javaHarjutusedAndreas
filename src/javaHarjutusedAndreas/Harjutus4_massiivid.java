package javaHarjutusedAndreas;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 1. Salvesta kasutajalt 10 numbrit ja sorteeri suuruse järgi. (int[])
 * 2. Salvesta kasutajalt 10 sõne ja sorteeri tähestikulises järjekorras. (String[])
 * 3. Salvesta kasutajalt x arv numbreid, lõpeta küsimine kui number on 0
 *    ja sorteeri tulemus suuruse järgi. (ArrayList)
 *
 * main() meetodi saad lühendiga psvm.
 */

public class Harjutus4_massiivid {
	public static void main(String[] args){
		/*int[] numbrit10 = new int[10];
		
		
		int counter = 11;
		
		for (int i = 0; i < 10; i++){
			counter--;
			System.out.println("Sisesta numbrit " + counter + " korda");
	
			Scanner sc = new Scanner(System.in);
			int userInput = sc.nextInt();
		
			numbrit10[i] = userInput;
		}
		
		
		for (int j = 0; j < 10; j++) {
			numbrit10[j] = (int) (Math.random() * 100);
			//System.out.println(Arrays.toString(numbrit10));
		}
		Arrays.sort(numbrit10);
		System.out.println(Arrays.toString(numbrit10));*/
		
		/*
		String[] sone10 = new String[10];
		
		int counter = 11;
		
		for (int i = 0; i < 10; i++){
			counter--;
			System.out.println("Sisesta s6nesid " + counter + " korda");
	
			Scanner sc = new Scanner(System.in);
			String userInput = sc.nextLine();
		
			sone10[i] = userInput;
		}
		Arrays.sort(sone10);
		System.out.println(Arrays.toString(sone10));*/
		
		ArrayList<Integer> suvalineArvNumbreid = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		while(true){ //lõpamtuse tsükkel!!!!! <- seda otsissin
			System.out.println("Sisesta number:");
			int userInput = sc.nextInt();
			suvalineArvNumbreid.add(userInput);
			
			if(userInput == 0){
				System.out.println("0 will no do!");
				break;
			}
		}
		
		System.out.println("here is what you entered:");
		Collections.sort(suvalineArvNumbreid);
		suvalineArvNumbreid.remove(0);
		System.out.println(suvalineArvNumbreid);
	}
}
