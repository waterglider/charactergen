package thingies;

import java.util.Scanner;

public class NPCCreatorInterface {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("*****************************ALT CHARACTER GENERATOR*****************************");
		System.out.println("1. Generate a character by race");
		System.out.println("2. Generate a character by location");
		System.out.println("3. Generate a completely random character\n");
		int option = in.nextInt();
		switch(option) {
		case 1:
			System.out.println("************************GENERATE CHARACTER BY RACE**************************");
			System.out.println("Enter race:\n");
			String input = in.nextLine();
			input = in.nextLine();
			System.out.println(input);
			createNPCbyRace(input);
			break;
		case 2: 
			System.out.println("************************GENERATE CHARACTER BY LOCATION**************************");
			System.out.println("Enter location:\n");
			in.nextLine();
			input = in.nextLine();
			createNPCbyLocation(input);
			break;
			
			
		}
		
	}
	
	public static void createNPCbyRace(String race) {
		
		Npc npc = new Npc();
		npc.initAppearance(race);
		npc.initLocation();
		npc.initAge();
		npc.initMagicAffinity(race);
		
	}
	
	public static void createNPCbyLocation(String location) {
		Npc npc = new Npc();
		npc.initRace(location);
		npc.initAppearance(npc.getRace());
		npc.initAge();
		npc.initMagicAffinity(npc.getRace());
	}

}
