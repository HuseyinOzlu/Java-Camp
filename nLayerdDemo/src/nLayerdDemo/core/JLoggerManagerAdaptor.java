package nLayerdDemo.core;

import nLayerdDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdaptor implements LoggerService {

	@Override
	public void logToSystem(String message) {
		JLoggerManager manager = new JLoggerManager();
		manager.log(message);
	}

}
