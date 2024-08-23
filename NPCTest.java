package thingies;

public class NPCTest {

	public static void main(String[] args) {
		Npc person = new Npc();
		
		person.initRace("hylia");
		person.initAppearance(person.getRace());
		person.initAge();
		person.initMagicAffinity(person.getRace());
		System.out.println(person.initHyliaOccupation());
		//person.initMagicAffinity();
		//person.initOccupation();
		
	}

}
