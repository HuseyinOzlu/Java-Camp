package oop_odev1;


public class Main {
	
	public static void main(String[] args) {
	
	
	
	Lessons lesson1 = new Lessons();	
		lesson1.id = 1;
		lesson1.name = "Yazýlým Geliþtirici Yetiþtirme Kampý(C# + Angular)";
		lesson1.details = "2 Ay Sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn takip, döküman ve duyurularýný..";
		lesson1.teacher = "Engin Demirog";
		lesson1.cost = "Ücretsiz";
	
	Lessons lesson2 = new Lessons();	
		lesson2.id = 2;
		lesson2.name = "Yazýlým Geliþtirici Yetiþtirme Kampý(Java + React)";
		lesson2.details = "2 Ay Sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn takip, döküman ve duyurularýný..";
		lesson2.teacher = "Engin Demirog";
		lesson2.cost = "Ücretsiz";
	
	Lessons lesson3 = new Lessons();	
		lesson3.id = 3;
		lesson3.name = "Programlamaya Giriþ için Temel Kurs";
		lesson3.details = "PYTHON, JAVA, C# gibi tüm programalama dilleri için temel programlama mantýðýný anlaþýlr";
		lesson3.teacher = "Engin Demirog";
		lesson3.cost = "Ücretsiz";

	Lessons[] lessons = {lesson1,lesson2,lesson3};
	
	for (Lessons lessonDetail : lessons) {
		System.out.println("--------------------");
		System.out.println("Ders Adý : "+lessonDetail.name);
		System.out.println("Detaylar : "+lessonDetail.details);
		System.out.println("Eðitim veren : "+lessonDetail.teacher);
		System.out.println("Fiyatý : "+lessonDetail.cost);
	}
	Filter filterCategory = new Filter();
		filterCategory.id = 1;
		filterCategory.type = "Kategori";
		filterCategory.All = "Tümü";
		filterCategory.filter = "Programlama("+lessons.length+")";

	Filter filterTeacher = new Filter();
		filterTeacher.id = 2;
		filterTeacher.type = "Eðitmen";
		filterTeacher.All = "Tümü";
		filterTeacher.filter = "Engin Demirog";
	
	Filter[] filter = {filterTeacher,filterCategory};
	
	for (Filter filterDetail : filter) {
		System.out.println("-----------------");
		System.out.println("Filtre türü : "+filterDetail.type);
		System.out.println("» "+filterDetail.All);
		System.out.println("» "+filterDetail.filter);
	}
System.out.println("//-------------------JOB----------------------//");
	IsSinifi Front_end = new IsSinifi();
		Front_end.id = 1;
		Front_end.name = "Fron-end Devoloper";
		Front_end.salary = 15000;
	IsSinifi Back_end = new IsSinifi();
		Back_end.id = 2;
		Back_end.name = "Back-end Devoloper";
		Back_end.salary = 20000;
	IsSinifi[] isler = {Front_end,Back_end};	
	for (IsSinifi IsSinifi : isler) {
		System.out.println("Mesleðin adý :"+IsSinifi.name);
		System.out.println("Maaþý :"+IsSinifi.salary);
		System.out.println("------------------");
		
	}
	}
	
}
