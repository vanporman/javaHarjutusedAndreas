package testimine;

import java.util.Scanner;

public class Meetodid {
	 public static String minuValik;
	 public static int aegStardini;
	
	public static void valiHarjutus(String kysimus){
		System.out.println(kysimus);
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			String usrInpt = sc.nextLine();
			minuValik = usrInpt;
			if (usrInpt.equals("stopper")) {
				//start stopper meetod
				System.out.println("valisid: " + usrInpt);
				Stopper stopper = new Stopper();
				stopper.start();
				break;
			} else if (usrInpt.equals("wall sit")) {
				//start harjutus1 meetod
				System.out.println("valisid " + usrInpt);
				sisesta("Mitu sekundit stardini?");
				
				AllaLugemine allaLugemine = new AllaLugemine();
				allaLugemine.start();
				break;
			} else if (usrInpt.equals("plank")) {
				//start harjutus2 meetod
				System.out.println("valisid " + usrInpt);
				sisesta("Mitu sekundit stardini?");
				
				AllaLugemine allaLugemine = new AllaLugemine();
				allaLugemine.start();
				break;
			} else if (usrInpt.equals("side plank")) {
				//start harjutus3 meetod
				Harjutus harjutus3 = new Harjutus();
				sisesta("Mitu sekundit stardini?");
				
				AllaLugemine allaLugemine = new AllaLugemine();
				allaLugemine.start();
				break;
			} else {
				System.out.println("Sellist harjutust pole olemas");
				System.out.println("Vali uuest: |wall sit|plank|side plank|");
			} 
		}
	}
	
	public static void sisesta(String kysimus){
		System.out.println(kysimus);
		Scanner sc = new Scanner(System.in);
		int usrInpt = sc.nextInt();
		aegStardini = usrInpt;
	}
}
