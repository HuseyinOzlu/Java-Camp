package entities;

public class Game {
	private int ýd;
	private	String gameName;
	private	Double gameCost;

	
	public Game() {
		
	}
	public Game(int id, String gameName, Double gameCost) {
		super();
		ýd = id;
		this.gameName = gameName;
		this.gameCost = gameCost;
	}
	public int getId() {
		return ýd;
	}
	public void setId(int id) {
		ýd = id;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public Double getGameCost() {
		return gameCost;
	}
	public void setGameCost(Double gameCost) {
		this.gameCost = gameCost;
	}

}
