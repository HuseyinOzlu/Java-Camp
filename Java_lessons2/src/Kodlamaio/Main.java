package Kodlamaio;

public class Main {

	public static void main(String[] args) {
		
		Student Huseyin = new Student();
		Huseyin.setAddress(null);
		Huseyin.setEmail("hozlu509@gmail.com");
		Huseyin.setFirstName("Hüseyin");
		Huseyin.setId(1);
		Huseyin.setHomeworkAdd(1);
		Huseyin.setKartBilgisi(null);
		Huseyin.setLastName("Ozlu");
		Huseyin.setSelectCourse("JAVA Course");
		
		Instructor Engin = new Instructor();
		Engin.setFirstName("Engin");
		Engin.setLastName("Demirog");
		Engin.setAddCourse("JAVA Course");
		Engin.setAddress(null);
		Engin.setEmail(null);
		Engin.setHomeworkName("JAVA day 3 ");
		Engin.setHomeworkId(1);
		Engin.setId(1);
		Engin.setKartBilgisi(null);
		Engin.setVideoId(1);
		Engin.setVideoInfo("Info ýnfo...");
		Engin.setVideoName("Java");
				
	}

}
