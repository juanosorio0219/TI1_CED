package model;

import collection.HashTable;

public class Building {

	private String id;
	private int people;
	private int floors;
	private int offices;
	
	private HashTable<Integer, Person> oficinas;
	
	private Building next;
	private Building prev;
	

	public Building(String id, int people, int floors, int offices) {
		this.id = id;
		this.people = people;
		this.floors = floors;
		this.offices = offices;	
		
		setOficinas(new HashTable<>(this.floors * this.offices));
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

	public Building getNext() {
		return next;
	}
	public void setNext(Building next) {
		this.next = next;
	}

	public Building getPrev() {
		return prev;
	}
	public void setPrev(Building prev) {
		this.prev = prev;
	}


	public HashTable<Integer, Person> getOficinas() {
		return oficinas;
	}
	public void setOficinas(HashTable<Integer, Person> oficinas) {
		this.oficinas = oficinas;
	}
	
	

}
