package model;

public class Building {

	private String id;
	private int floors;
	private int office;
	
	
	public void Building(String id, int floors, int office) {
		this.id = id;
		this.floors = floors;
		this.office = office;
		
		
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
	
	
	
}
