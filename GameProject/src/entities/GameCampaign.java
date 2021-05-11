package entities;

public class GameCampaign {
	private int Id;
	private String campaignName;
	private Double discountpercent;
	
	public GameCampaign() {
		
	}
	public GameCampaign(int id, String campaignName, Double discountpercent) {
		super();
		Id = id;
		this.campaignName = campaignName;
		this.discountpercent = discountpercent;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public Double getDiscountpercent() {
		return discountpercent;
	}
	public void setDiscountpercent(Double discountpercent) {
		this.discountpercent = discountpercent;
	}
	
}
