package intro;



public class Main {

	public static void main(String[] args) {
		// CTRL+SPACE(oto tamamla)
		//camelCase (ilk harf k���k sonras� B�y�k)
		//Don't repeat yourself
		
		String internetSubeButonu = "�nternet �ubesi";
		
		double dolarDun = 8.25;
		int dolar = 8;
		boolean yukar� = true;
		double dolarBugun = 8.15;

		
		System.out.println(dolarDun);
		System.out.println(dolar);
		System.out.println(yukar�);
		System.out.println(internetSubeButonu);
		System.out.println("Hello world");
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar d��t�");
		}
		else if (dolarBugun==dolarDun) {
			System.out.println("Dolar e�itlendi");
		}
		else {
			System.out.println("Dolar y�kseldi");
		}
		/////////////////////
		String kredi1 = "H�zl� kredi";
		String kredi2 = "Mutlu emekli kredi";
		String kredi3 = "Konut kredi";
		String kredi4 = "�ift�i kredi";
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
				"H�zl� Kredi",
				"Mutlu emekli kredisi",
				"Konut kredisi",
				"�ift�i kredisi",
				"Msb Kredisi",
				"Meb kredisi",
				"K�lt�r Bakanl��� kredisi"
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
		//De�i�kenler -> 
		boolean a = true;   // True or false     | 1 byte
		double b = 5.1;     // number dot number | 8 bytes 
		char c = 'H';       // Unicode char      | 2 bytes
		byte d = 127;       // -128 to 127       | 1 byte
		short e = -32768;   // -32.768 to 32.767 | 2 bytes
		int f = 2147483647; // -2.147.483.648    | 4 bytes
		long g = 922337254; // �oh uzun          | 8 bytes
		float h = 4;        // double gibi       | 4 bytes
		String j = "Hello world!"; 
		
		System.out.println(a + " -> a de�eri");
		System.out.println(b + " -> b de�eri");
		System.out.println(c + " -> c de�eri");
		System.out.println(d + " -> d de�eri");
		System.out.println(e + " -> e de�eri");
		System.out.println(f + " -> f de�eri");
		System.out.println(g + " -> g de�eri");
		System.out.println(h + " -> h de�eri");
		System.out.println(j + " -> j de�eri");
		
		// Ornek
		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 2;
		if(sayi1>sayi2 && sayi1>sayi3) {
		
			System.out.println("sayi1 say�s� en b�y�kt�r");
			
		}else if(sayi2>sayi1 && sayi2>sayi3) {
		
			System.out.println("sayi2 say�s� en b�y�kt�r");
		
		}else { System.out.println("sayi3 say�s� en b�y�kt�r");
		
		}
		char grade = 'A';
		switch(grade) {
			case 'A':
				System.out.println("M�kemmel, Ge�tiniz");
				break;
			case 'B':
				System.out.println("�ok g�zel, Ge�tiniz");
				break;
			case 'C':
				System.out.println("�yi, Ge�tiniz");
				break;
			case 'D':	
				System.out.println("Fena de�il, Ge�tiniz");
				break;
			case 'F':
				System.out.println("Maalesef, Kald�n�z");
				break;
			default:
				System.out.println("Yanl�� de�er girdiniz");
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
		// Do-While D�ng�s�
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
		sehirler[0][0]= "�stanbul";
		sehirler[0][1]= "Bursa";
		sehirler[0][2]= "Bilecik";
		sehirler[1][0]= "Ankara";
		sehirler[1][1]= "Konya";
		sehirler[1][2]= "Kayseri";
		sehirler[2][0]= "Diyarbak�r";
		sehirler[2][1]= "�anl�urfa";
		sehirler[2][2]= "Gaziantep";
		
		for(int k = 0; k<=2;k++) {
			System.out.println("----------------------");
			for(int s =0;s<=2;s++) {
				System.out.println(sehirler[k][s]);
			}
		}
	
	
	
	
	}	
			

}
