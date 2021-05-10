package inheretinceV2;

public class CustomerManager {
	public void add(Logger logger) {
		//müþteri ekleme kodlarý
		System.out.println("Müþteri eklendi");
	//	DatabaseLogger logger = new DatabaseLogger(); ==> new lersen ileriye dönükte hata çýkar sürdürülemez
		logger.log();
	}
}
