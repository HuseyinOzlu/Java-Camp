package concrates;

import adapter.MernisServiceAdapter;
import entities.Gamer;

public class GamerCheckManager {
	

	public static boolean checkIfRealPerson(Gamer gamer) {
		boolean realGamer = false;
		MernisServiceAdapter mernisServiceAdapter = new MernisServiceAdapter();
		if(mernisServiceAdapter.gameCheckService(gamer)){
			realGamer = true;
		}
		else {
			realGamer = false;
	}
		return realGamer;}
}
