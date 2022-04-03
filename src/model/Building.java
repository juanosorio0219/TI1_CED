package model;


public class Building {

	private String id;
	private int numberOfPeople;
	private int floors;
	private int offices;
	
	
	public Building(String id, int floors, int offices) {
		this.id = id;
		this.floors = floors;
		this.offices = offices;	
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}


	public int getOffices() {
		return offices;
	}


	public void setOffice(int offices) {
		this.offices = offices;
	}
	
	
}
