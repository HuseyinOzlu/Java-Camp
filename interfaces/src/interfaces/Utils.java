package interfaces;

public class Utils {
		public static void runLoggers(Logger[] loggers, String message) { // Static Tanýmladýðýnýz her yeri bellekte tutar 
			//--> ama çok fazla bellek tüketimi yapar // Sürekli kullanýlan yerde kulllan
			for(Logger logger: loggers) {
				logger.log(message);
			}
		}
		
	 
}
