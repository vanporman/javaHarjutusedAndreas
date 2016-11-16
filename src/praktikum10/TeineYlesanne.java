package praktikum10;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * Kasuaja sisestab numbreid, konsooli prinditakse sisestatud numbrid 
 * Sisestatud numbrite taha lisatakse numbrite v22rtuses x-e
 */
public class TeineYlesanne {

	public static void main(String[] args) {
		
		//ArrayList kuhu tsykkliga loetakse numbrid sisse ja tsykkel katkestatakse alles siis, kui kasutaja sisestab nulli
		ArrayList<Integer> numbrid = new ArrayList<>();
		while (true){
			System.out.println("Ütle number");
			Scanner sc = new Scanner(System.in);
			int kasutajaNumber = sc.nextInt();
			if (kasutajaNumber == 0){
				break;
			}
			numbrid.add(kasutajaNumber);
		}
		//tsykkel numbrite ja ikside välajtrykkimiseks
//		System.out.println(iksid(numbrid.get(1)));
		for (int i = 0; i < numbrid.size(); i++) {
			int nr = numbrid.get(i);
			System.out.printf("%2d %s\n", nr, iksid(nr));
		}
	}
	
	//Muudab numbri iksideks
	public static String iksid(int num){
		String iksid = "";
		for (int i = 0; i < num; i++) {
			iksid = iksid + "x";
		}
		return iksid;
	}

}
