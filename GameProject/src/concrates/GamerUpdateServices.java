package concrates;



public class GamerUpdateServices {
		
	public void updateGame(String choose,String change) {
		if (choose == "firstName") {
			System.out.println("Isminiz g�ncellendi : " + change);
		}else if (choose == "lastName") {
			System.out.println("Soyad�n�z g�ncellendi : "+ change);
		}else if(choose == "age") {
			System.out.println("Ya��n�z g�ncellendi : " + change);
		}else if(choose == "nick") {
			System.out.println("Nickiniz g�ncellendi : " + change);
		}else {
			System.out.println("Hatal� bilgi girdiniz.");
		}
}}
