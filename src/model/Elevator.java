package model;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Elevator {
	
	private PriorityQueue<Person> peoplePQ;
	
	public Elevator() {
		setPeoplePQ(new PriorityQueue<>());
	}

	public PriorityQueue<Person> getPeoplePQ() {
		return peoplePQ;
	}

	public void setPeoplePQ(PriorityQueue<Person> peoplePQ) {
		this.peoplePQ = peoplePQ;
	}
}
