package model;

public class Person {

	private String name;
	private int position;
	private int office;
	
	
	
	public Person(String name, int position, int office) {
		this.name = name;
		this.position = position;
		this.office = office;
	}
	
	
	public int getOffice() {
		return office;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}	

}
