package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import model.CommandCenter;



public class Main {

	private static CommandCenter controller = new CommandCenter();	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
	public static void main(String[] args) throws Exception {

		System.out.println("*****************************");
		System.out.println("*    TAREA INTEGRADORA 1    *");
		System.out.println("*                           *");
		System.out.println("* - Carlos Villegas         *");
		System.out.println("* - Juan José Osorio        *");
		System.out.println("*****************************");
		System.out.println("");		
		int building = Integer.parseInt(br.readLine());
		controller.createBuilding(building);
		System.out.println("");
		createAll(building);
		askOffice();

	}

	public static void createAll(int building) throws Exception {
		for (int i = 0; i < building; i++) {
			String[] prop = br.readLine().split(" ");
			controller.addBuilding(prop, i);
			int countPerson = Integer.parseInt(prop[1]);
			fillPersonQueue(countPerson);
			fillPriorityQueue(countPerson);
			fillPersonStack(countPerson);
			assignOffice(countPerson, i);
			if (i != building - 1) {
				br.readLine();
				System.out.println("");				
			}
		}
	}

	public static void fillPersonQueue(int count) throws IOException {
		for (int i = 0; i < count; i++) {
			String[] person = br.readLine().split(" ");
			controller.addPerson(person);           

		}

	}

	public static void fillPriorityQueue(int count) throws Exception {
		controller.createPriorityQueue(count);
	}

	public static void fillPersonStack(int count) throws Exception {
		controller.fillPersonStack(count);

	}

	public static void assignOffice(int count, int building) {
		String message = controller.assignOffice(count, building);
		System.out.print(message);
	}

	public static void askOffice() throws NumberFormatException, IOException {
		System.out.println("\nDesea buscar a alguien en las oficinas?\n1. Si\n2. No");
		if (Integer.parseInt(br.readLine()) == 1) {
			System.out.println("Ingrese el identificador del edificio (Ej: A)");
			int indexBuilding = controller.validateBuilding(br.readLine().charAt(0));
			System.out.println("Ingrese el numero de la oficina");		
			int office = Integer.parseInt(br.readLine());
			String message=controller.askOffice(indexBuilding, office);
			System.out.print(message);
			askOffice();
		}
	}




}

