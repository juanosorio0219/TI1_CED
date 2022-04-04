package model;

public class Person {
	
	private String name;
	private int office;
	
	
	public Person(String name, int office) {
		this.name = name;
		this.office = office;
	}
	
	
	public int getOffice() {
		return office;
	}
	public void setOffice(int office) {
		this.office = office;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
    public String toString() {
        return "Person [name=" + name + ", office=" + office + "]";
    }

}
