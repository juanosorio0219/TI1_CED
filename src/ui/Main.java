package ui;

import java.util.Scanner;
import model.CommandCenter;

public class Main {
	private static CommandCenter controller = new CommandCenter();
	
	public static Scanner LECTOR = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Write the number of buildings");
		int numBuildings = LECTOR.nextInt();
		LECTOR.nextLine();
		
		for(int m = 0; m < numBuildings; m++) {
			System.out.println("Write the building identifier");
			String idBuilding = LECTOR.nextLine();
			
			System.out.println("Write the number of people currently in the building ( " + idBuilding + " )");
			int numPeople = LECTOR.nextInt();	
			
			System.out.println("Write the number of floors (Building " + idBuilding + ")");
			int numFloors = LECTOR.nextInt();
			
			if(numFloors <= 1) {
				System.out.println("");
				System.out.println("ERROR: the number of floor must be greater than one");
				break;
			}
			
			System.out.println("Write the number of offices per floor (Building " + idBuilding + ")");
			int numOffices = LECTOR.nextInt();
			
			controller.addToLinktedList(idBuilding, numPeople, numFloors, numOffices); //edificio
			
			
			for(int n = 0; n < numPeople; n++) {
				
			}
			
			
			
			
			LECTOR.nextLine();
		}
		
		System.out.println(controller.printBuildingInfo());
		
	}
}
