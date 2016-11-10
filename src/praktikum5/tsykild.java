package praktikum5;

public class tsykild {

	public static void main(String[] args) {
		
		if (true){
			System.out.println("lause on tõene");
		}
		
		int muutuja = 0;
		while(muutuja < 2){
			System.out.println("tingimus on tõene (while), arv: " + muutuja);
			muutuja = muutuja + 1;
			//break; // katkestab tsükli töö
			//continue; // läheb tsükli algusesse 
		}
		
		for (int i = 0; i < 10; i++ /* i = i + 1 */) {
			System.out.println(i);
		}

	}

}
