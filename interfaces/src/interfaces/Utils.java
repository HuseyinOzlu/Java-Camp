package interfaces;

public class Utils {
		public static void runLoggers(Logger[] loggers, String message) { // Static Tan�mlad���n�z her yeri bellekte tutar 
			//--> ama �ok fazla bellek t�ketimi yapar // S�rekli kullan�lan yerde kulllan
			for(Logger logger: loggers) {
				logger.log(message);
			}
		}
		
	 
}
