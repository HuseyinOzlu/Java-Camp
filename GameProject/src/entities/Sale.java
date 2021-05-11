package entities;

public class Sale {
	private int Id;
	private Gamer gamer;
	private	Game game;
	private Double firstCost;
	private Double discountPercent;
	private GameCampaign campaign;
	
	public Sale() {
		
	}
	
	public Sale(int id, Gamer gamer, Game game, Double firstCost, Double discountPercent, GameCampaign campaign) {
		super();
		Id = id;
		this.gamer = gamer;
		this.game = game;
		this.firstCost = firstCost;
		this.discountPercent = discountPercent;
		this.campaign = campaign;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Gamer getGamer() {
		return gamer;
	}

	public void setGamer(Gamer gamer) {
		this.gamer = gamer;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Double getFirstCost() {
		return firstCost;
	}

	public void setFirstCost(Double firstCost) {
		this.firstCost = firstCost;
	}

	public Double getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(Double discountPercent) {
		this.discountPercent = discountPercent;
	}

	public GameCampaign getCampaign() {
		return campaign;
	}

	public void setCampaign(GameCampaign campaign) {
		this.campaign = campaign;
	}
	
	
	
}
