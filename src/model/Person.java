package model;

public class Person {

	private String name;
	private int floor;
	private int officeToGo;


	public Person(String name, int floor, int officeToGo) {
		this.name = name;
		this.floor = floor;
		this.officeToGo = officeToGo;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	public int getOfficeToGo() {
		return officeToGo;
	}
	public void setOfficeToGo(int officeToGo) {
		this.officeToGo = officeToGo;
	}

}
