package Entities;

public class Game {
	private int id;
	private String name;
	private String details;
	private double gamePrice;
	private double discount;
	
	
	public Game(int id, String name, String details, double gamePrice, double discount) {
		this.id = id;
		this.name = name;
		this.details = details;
		this.gamePrice = gamePrice;
		this.discount = discount;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDetails() {
		return details;
	}


	public void setDetails(String details) {
		this.details = details;
	}


	public double getGamePrice() {
		return gamePrice;
	}


	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public double getGamePriceAfterDiscount() {
		return this.gamePrice-(this.gamePrice * this.discount / 100);
	}

}
