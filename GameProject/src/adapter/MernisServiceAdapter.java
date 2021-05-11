package adapter;


import java.rmi.RemoteException;

import abstracts.GamerCheckServices;
import entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckServices{
	
	@Override
	public Boolean gameCheckService(Gamer gamer)  {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		Boolean gamerIsReal = false;
			
			try {
				gamerIsReal = proxy.TCKimlikNoDogrula(gamer.getNationalityId(), gamer.getFirstName(),
						gamer.getLastName(), gamer.getAge());
			} catch (RemoteException e) {
				gamerIsReal = false;
			}
			return gamerIsReal;
		
		
		
	}

}
