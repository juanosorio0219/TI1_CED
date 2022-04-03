package model;

import collection.LinkedList;

public class CommandCenter {
	
	private LinkedList<Building> buildings;
	private Building building;
	private Elevator elevator;
	private Person person;
	
	private LinkedList<Building> buildingsList;
	
	
	public CommandCenter() {
		building = new Building(null, 0, 0, 0);
		elevator = new Elevator();
		person = new Person(null, null);
		
		buildingsList = new LinkedList<>();
	}


	public LinkedList<Building> getBuildingsList() {
		return buildingsList;
	}
	public void setBuildingsList(LinkedList<Building> buildingsList) {
		this.buildingsList = buildingsList;
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
	
	
}
