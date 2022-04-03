package model;

public class Person {
	
	private String name;
	private String office;
	
	
	public Person(String name, String office) {
		this.name = name;
		this.office = office;
	}
	
	
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
