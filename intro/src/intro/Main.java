package intro;



public class Main {

	public static void main(String[] args) {
		// CTRL+SPACE(oto tamamla)
		//camelCase (ilk harf küçük sonrasý Büyük)
		//Don't repeat yourself
		
		String internetSubeButonu = "Ýnternet Þubesi";
		
		double dolarDun = 8.25;
		int dolar = 8;
		boolean yukarý = true;
		double dolarBugun = 8.15;

		
		System.out.println(dolarDun);
		System.out.println(dolar);
		System.out.println(yukarý);
		System.out.println(internetSubeButonu);
		System.out.println("Hello world");
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar düþtü");
		}
		else if (dolarBugun==dolarDun) {
			System.out.println("Dolar eþitlendi");
		}
		else {
			System.out.println("Dolar yükseldi");
		}
		/////////////////////
		String kredi1 = "Hýzlý kredi";
		String kredi2 = "Mutlu emekli kredi";
		String kredi3 = "Konut kredi";
		String kredi4 = "Çiftçi kredi";
		String kredi5 = "MSB kredi";
		String kredi6 = "Meb kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		System.out.println("---------");
		
		
		String[] krediler = 
		{
				"Hýzlý Kredi",
				"Mutlu emekli kredisi",
				"Konut kredisi",
				"Çiftçi kredisi",
				"Msb Kredisi",
				"Meb kredisi",
				"Kültür Bakanlýðý kredisi"
		};
		System.out.println(krediler[0]);
		//foreach ===
		for (String kredi: krediler) {
			System.out.println(kredi);
		}
		for (int i = 0; i<krediler.length;i++) {
			System.out.println("----------");
			System.out.println(krediler[i]);
		}
		//------------------- Java homework ------------------------------//
		System.out.println("-------------- Java Homework ---------------------");
		System.out.println("Hello world");
		String[] Liste = {
				"Deneme 1",
				"Deneme 2",
				"Deneme 3",
				"Deneme 4"
		};
		//Deðiþkenler -> 
		boolean a = true;   // True or false     | 1 byte
		double b = 5.1;     // number dot number | 8 bytes 
		char c = 'H';       // Unicode char      | 2 bytes
		byte d = 127;       // -128 to 127       | 1 byte
		short e = -32768;   // -32.768 to 32.767 | 2 bytes
		int f = 2147483647; // -2.147.483.648    | 4 bytes
		long g = 922337254; // çoh uzun          | 8 bytes
		float h = 4;        // double gibi       | 4 bytes
		String j = "Hello world!"; 
		
		System.out.println(a + " -> a deðeri");
		System.out.println(b + " -> b deðeri");
		System.out.println(c + " -> c deðeri");
		System.out.println(d + " -> d deðeri");
		System.out.println(e + " -> e deðeri");
		System.out.println(f + " -> f deðeri");
		System.out.println(g + " -> g deðeri");
		System.out.println(h + " -> h deðeri");
		System.out.println(j + " -> j deðeri");
		
		// Ornek
		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 2;
		if(sayi1>sayi2 && sayi1>sayi3) {
		
			System.out.println("sayi1 sayýsý en büyüktür");
			
		}else if(sayi2>sayi1 && sayi2>sayi3) {
		
			System.out.println("sayi2 sayýsý en büyüktür");
		
		}else { System.out.println("sayi3 sayýsý en büyüktür");
		
		}
		char grade = 'A';
		switch(grade) {
			case 'A':
				System.out.println("Mükemmel, Geçtiniz");
				break;
			case 'B':
				System.out.println("Çok güzel, Geçtiniz");
				break;
			case 'C':
				System.out.println("Ýyi, Geçtiniz");
				break;
			case 'D':	
				System.out.println("Fena deðil, Geçtiniz");
				break;
			case 'F':
				System.out.println("Maalesef, Kaldýnýz");
				break;
			default:
				System.out.println("Yanlýþ deðer girdiniz");
		}
		
		for(String listeyaz: Liste) {
			
			System.out.println(listeyaz);
		
		}
		for(int i= 0; i<Liste.length;i+=1) {
		
			System.out.println(Liste[i]);
		}
		for(int i = 1;i<10;i+=2) {
			System.out.println(i);
		}
		int i = 0;
		
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		// Do-While Döngüsü
		do {
			i+=2;
		} while (i<50);
		// Arrays Demo
		String[] ogrenci = new String[4];
		ogrenci[0] = "Engin";
		ogrenci[1] = "Derin";
		ogrenci[2] = "Salih";
		ogrenci[3] = "Ahmet";
			    
		for(int ogr=0;ogr<ogrenci.length;ogr++) {
			System.out.println(ogrenci[ogr]);
		}
		System.out.println("-------------------------------");
		for(String ogr:ogrenci) {
			System.out.println(ogr);
		}
		System.out.println("-----------MultiDiementionalArray-----");
		String[][] sehirler =new String[3][3];
		sehirler[0][0]= "Ýstanbul";
		sehirler[0][1]= "Bursa";
		sehirler[0][2]= "Bilecik";
		sehirler[1][0]= "Ankara";
		sehirler[1][1]= "Konya";
		sehirler[1][2]= "Kayseri";
		sehirler[2][0]= "Diyarbakýr";
		sehirler[2][1]= "Þanlýurfa";
		sehirler[2][2]= "Gaziantep";
		
		for(int k = 0; k<=2;k++) {
			System.out.println("----------------------");
			for(int s =0;s<=2;s++) {
				System.out.println(sehirler[k][s]);
			}
		}
	
	
	
	
	}	
			

}
