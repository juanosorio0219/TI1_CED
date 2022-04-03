package model;

public class Building {

	private String id;
	private int people;
	private int floors;
	private int offices;
	
	
	public Building(String id, int people, int floors, int offices) {
		this.id = id;
		this.people = people;
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


	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

}
