package model;

public class CommandCenter {
	private Building building;
	private Elevator elevator;
	private Person person;
	
	
	public CommandCenter() {
		building = new Building();
		elevator = new Elevator();
		person = new Person();
		
	}
	
}
