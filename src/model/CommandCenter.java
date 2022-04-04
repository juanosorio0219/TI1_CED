package model;
import collection.*;

public class CommandCenter {
	
	private Building building;
	private Elevator elevator;
	private Person person;
	
	private LinkedList<Building> buildingsList;
	private QueueList<Person> peopleQueueList;
	private StackList<Person> peopleStackList;
	
	
	
	/*private static BufferedReader br;
    private static Edifice[] edifice;
    private static Queue<Person> personQueue;
    private static PersonPriorityQueue<Person> personPriorityQueue;
    private static Stack<Person> personStack;*/
	
	
	public CommandCenter() {
		building = new Building(null, 0, 0, 0);
		elevator = new Elevator();
		person = new Person(null, 0, 0);
		
		buildingsList = new LinkedList<>();
		peopleQueueList = new QueueList<>();
		peopleStackList = new StackList<>();
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

	public void addToQueueLis(String name, int floor, int officeToGo) {
		person = new Person(name, floor, officeToGo);
		peopleQueueList.enqueue(person);
	}
	
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
