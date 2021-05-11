package concrates;

import abstracts.GameServices;
import entities.Game;

public class GameManager implements GameServices{
	
	@Override
	public void add(Game gameCost) {
			System.out.println("Oyun Eklendi : " + gameCost.getGameName());
	}
	@Override
	public void delete(Game gameCost) {
			System.out.println("Oyun Silindi : " + gameCost.getGameName());		
	}
}
