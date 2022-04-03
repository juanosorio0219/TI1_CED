package model;

import collection.LinkedList;

public class CommandCenter {
	private Building building;
	private Elevator elevator;
	private Person person;
	
	private LinkedList<Building> buildingsList;
	
	
	public CommandCenter() {
		building = new Building(null, 0, 0);
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
	
	public void addToLinktedList(String id, int floors, int offices) {
		building = new Building(id, floors, offices);
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
