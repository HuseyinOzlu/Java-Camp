package inheretinceV2;

public class CustomerManager {
	public void add(Logger logger) {
		//m��teri ekleme kodlar�
		System.out.println("M��teri eklendi");
	//	DatabaseLogger logger = new DatabaseLogger(); ==> new lersen ileriye d�n�kte hata ��kar s�rd�r�lemez
		logger.log();
	}
}
