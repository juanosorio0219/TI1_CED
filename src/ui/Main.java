package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import model.CommandCenter;

public class Main {

	private static CommandCenter controller = new CommandCenter();
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	
	public static void main(String[] args) throws IOException {
	
		String numB = br.readLine();	
		int numBuildings = Integer.parseInt(numB);
		for(int m = 0; m < numBuildings; m++) {
			
			String input = br.readLine();
			String [] parts = input.split(" ");
			String part1 = parts[0];
			int part2 = Integer.parseInt(parts[1]);
			int part3 = Integer.parseInt(parts[2]);
			int part4 = Integer.parseInt(parts[3]);
			
			controller.addToLinkedList(part1, part2, part3, part4);
			
			System.out.println(controller.printBuildingInfo());			
			
			if(part4 <= 1) {
				System.out.println("");
				System.out.println("ERROR: the number of floor must be greater than one");
				break;
			}
			
			for(int i = 0; i < part2; i++) {
				String [] parts2 = input.split(" ");
				String name = parts2[0];
				int floor = Integer.parseInt(parts2[1]);
				int office = Integer.parseInt(parts2[2]);
				controller.addToMap(name, office);
			}	
		}		
	}
}
