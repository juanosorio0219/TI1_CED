package model;


public class Building {

	private char id;
	private int floors;
	private int offices;
	private HashTable<Integer, Person> list;
	
	public Building(char c, int floors, int offices) {
		this.id = c;		
		this.floors = floors;
		this.offices = offices*floors;	
		list = new HashTable<>(this.offices);


	}


	public char getId() {
		return id;
	}

	public void setId(char id) {
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
	
	public HashTable<Integer, Person> getList() {
        return list;
    }

	
	

}
