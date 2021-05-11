package concrates;



public class GamerUpdateServices {
		
	public void updateGame(String choose,String change) {
		if (choose == "firstName") {
			System.out.println("Isminiz güncellendi : " + change);
		}else if (choose == "lastName") {
			System.out.println("Soyadýnýz güncellendi : "+ change);
		}else if(choose == "age") {
			System.out.println("Yaþýnýz güncellendi : " + change);
		}else if(choose == "nick") {
			System.out.println("Nickiniz güncellendi : " + change);
		}else {
			System.out.println("Hatalý bilgi girdiniz.");
		}
}}
