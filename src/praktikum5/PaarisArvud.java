package praktikum5;

public class PaarisArvud {

	public static void main(String[] args) {

		int count = 0;
		while (count <= 10){
			System.out.println(count);
			count = count + 2;
		}
		
		for (int i = 0; i <= 10; i++) {
			if(i % 2 == 0){
				System.out.println(i);
			}
		}
		
	}

}
