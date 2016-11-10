package praktikum5;

public class Tabel {

	public static void main(String[] args) {
		
		int tabeliSuurus = 6;
		
		for (int i = 0; i < tabeliSuurus; i++) {
			for (int j = 0; j < tabeliSuurus; j++) {
				if(i == j){
					System.out.print("0 ");					
				}
				else {
					System.out.print("1 ");
				}
			}
			System.out.println(); // reavahetus
		}
		
	}

}
