package concrates;



public class GamerUpdateServices {
		
	public void updateGame(String choose,String change) {
		if (choose == "firstName") {
			System.out.println("Isminiz güncellendi : " + change);
		}else if (choose == "lastName") {
			System.out.println("Soyadınız güncellendi : "+ change);
		}else if(choose == "age") {
			System.out.println("Yaşınız güncellendi : " + change);
		}else if(choose == "nick") {
			System.out.println("Nickiniz güncellendi : " + change);
		}else {
			System.out.println("Hatalı bilgi girdiniz.");
		}
}}
