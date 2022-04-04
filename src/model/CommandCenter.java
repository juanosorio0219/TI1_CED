package model;
import collection.*;

public class CommandCenter {
	
	private LinkedList<Building> buildings;
	private Building building;
	private Elevator elevator;
	private Person person;
	
	private LinkedList<Building> buildingsList;

	
	public CommandCenter() {
		building = new Building(null, 0, 0, 0);
		elevator = new Elevator();
		person = new Person(null, 0);
		
		buildingsList = new LinkedList<>();
	}

	
	public void addToLinkedList(String id, int floors, int people, int offices) {
		building = new Building(id, floors, people, offices);
		buildingsList.add(building);
	}


	public String printBuildingInfo() {
		String info = "";
		
		for(int m = 0; m < buildingsList.size(); m++) {
			info += buildingsList.get(m) + "\n";
		}
		
		return info;
		
	}

	
	public String printHashMapInfo() {
		String info = "";
		
		
		
		return info;
	}
	

	public LinkedList<Building> getBuildings() {
		return buildings;
	}
	public void setBuildings(LinkedList<Building> buildings) {
		this.buildings = buildings;
	}


	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
