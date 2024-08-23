package thingies;

import java.util.Random;

import probability.Outcome;
import probability.ProbabilityPicker;

public class Npc {
	// chooses a location first, then has a rarity chart for that area to determine
	// race. generates age based on race.
	// uses race location, and age to determine class and magic type.
	// demeanor is then determined.
	// 1: Hylian 2: Subrosian 3: Goron 4: Lynel 5: River Zora 6: Wizzrobe 7: Pol 8:
	// Moblin 9:Fairy
	private String race;
	private String age;
	private int height;
	private String personality;
	private String location;
	private String occupation;
	private String magicType;
	Random rand = new Random();
	ProbabilityPicker p = new ProbabilityPicker();

	public Npc() {

	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {

	}


	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}


	public String getPersonality() {
		return personality;
	}

	public void setPersonality(String personality) {
		this.personality = personality;
	}

	

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public void initLocation() {
		String[] districts = { "hylia" 
		, "viriko", "dodoron", "kotome", "kattea", "alpenrall",
		"eldin"};
		location = districts[rand.nextInt(districts.length)];
		System.out.println(location);
	}
	
	public void initAppearance(String race) {
		switch(race) {
		case "hylian":
			Hylian hylian = new Hylian();
			System.out.println(hylian.toString());
		break;
		case "goron":
			Goron goron = new Goron();
			System.out.println(goron.toString());
			break;
		case "subrosian":
			Subrosian sub = new Subrosian();
			System.out.println(sub.toString());
			break;
		case "pol": 
			Pol pol = new Pol();
			System.out.println(pol.toString());
			break;
		case "lynel": 
			Lynel lynel = new Lynel(true);
			System.out.println(lynel.toString());
			break;
		case "moblin":
			Moblin moblin = new Moblin();
			System.out.println(moblin.toString());
		break;
		case "wizzrobe":
			Wizzrobe wizz = new Wizzrobe();
			System.out.println(wizz.toString());
				break;
		case "river zora":
			RiverZora rz = new RiverZora();
			System.out.println(rz.toString());
			break;
		default:
			System.out.println("Race not specified.");	
		
		}
	}

	public void initRace(String npcLocation) {
		switch (npcLocation) {
		case "hylia":
			Outcome[] hyliaRaces = { new Outcome("hylian", 0.57), new Outcome("goron", 0.10),
					new Outcome("wizzrobe", 0.10), new Outcome("pol", 0.10), new Outcome("subrosian", 0.05),
					new Outcome("moblin", 0.03), new Outcome("lynel", 0.02), new Outcome("river zora",0.04)};
			race = (p.getProbability(hyliaRaces)).getId();
			break;
		case "alpenrall":
			Outcome[] alpenRaces = { new Outcome("hylian", 0.20), new Outcome("goron", 0.02),
					new Outcome("wizzrobe", 0.15), new Outcome("pol", 0.20), new Outcome("subrosian", 0.15),
					new Outcome("moblin", 0.15), new Outcome("lynel", 0.08), new Outcome("river zora", 0.05) };
			race = (p.getProbability(alpenRaces)).getId();
			break;
		case "viriko":
			Outcome[] virikoRaces = { new Outcome("hylian", 0.53), new Outcome("goron", 0.02),
					new Outcome("wizzrobe", 0.01), new Outcome("pol", 0.06), new Outcome("subrosian", 0.02),
					new Outcome("moblin", 0.30), new Outcome("lynel", 0.01), new Outcome("river zora", 0.05) };
			race = (p.getProbability(virikoRaces)).getId();
			break;
			
		case "eldin":
			Outcome[] eldinRaces = { new Outcome("hylian", 0.20), new Outcome("goron", 0.35),
					new Outcome("wizzrobe", 0.05), new Outcome("pol", 0.05), new Outcome("subrosian", 0.15),
					new Outcome("moblin", 0.15), new Outcome("lynel", 0.05), new Outcome("river zora", 0) };
			race = (p.getProbability(eldinRaces)).getId();
			break;
			
		case "kotome":
			Outcome[] kotomeRaces = { new Outcome("hylian", 0.05), new Outcome("goron", 0.25),
					new Outcome("wizzrobe", 0.20), new Outcome("pol", 0.05), new Outcome("subrosian", 0.25),
					new Outcome("moblin", 0.05), new Outcome("lynel", 0.15), new Outcome("river zora", 0) };
			race = (p.getProbability(kotomeRaces)).getId();
			break;
			
		case "kattea":
			Outcome[] katteaRaces = { new Outcome("hylian", 0.30), new Outcome("goron", 0.10),
					new Outcome("wizzrobe", 0.05), new Outcome("pol", 0.1), new Outcome("subrosian", 0.05),
					new Outcome("moblin", 0.30), new Outcome("lynel", 0.10) };
			race = (p.getProbability(katteaRaces)).getId();
			break;
		case "dodoron":
			Outcome[] dodoRaces = { new Outcome("hylian", 0.15), new Outcome("goron", 0.15),
					new Outcome("wizzrobe", 0.1), new Outcome("pol", 0.05), new Outcome("subrosian", 0.1),
					new Outcome("moblin", 0.30), new Outcome("lynel", 0.15) };
			race = (p.getProbability(dodoRaces)).getId();
			break;
			
		}
		System.out.println(race);
		System.out.println(npcLocation);
		
	}
	
	public void initAge() {
		if (location == "hylia" || location == "dodoron") {
			Outcome[] ageDist =  {new Outcome("young child", 0.1), new Outcome("child", 0.1), 
					new Outcome("young adult", 0.25), new Outcome("adult", 0.45), new Outcome("elderly", 0.1)};
			age = (p.getProbability(ageDist).getId());
		}
		else {
			Outcome[] ageDist =  {new Outcome("young child", 0.2), new Outcome("child", 0.05), 
					new Outcome("young adult", 0.33), new Outcome("adult", 0.40), new Outcome("elderly", 0.02)};
			age = (p.getProbability(ageDist).getId());
		}
		System.out.println(age);
		
	}
	
	public void initMagicAffinity(String race) {
		magicType = "nonsavant";
		switch(race) {
		case "hylian":
			if (rand.nextInt(80) == 0) {
				Outcome[] hylianSavantDist = {new Outcome("forest", 0.25), new Outcome("water", 0.20), 
						new Outcome("shadow", 0.15), new Outcome("fire", 0.25), new Outcome("spirit", 0.15) };
				magicType = p.getProbability(hylianSavantDist).getId();
			}
		break;
		case "goron":
			if (rand.nextInt(100) == 0) {
				Outcome[] goronSavantDist = {new Outcome("light", 0.25), new Outcome("forest", 0.20), 
						new Outcome("shadow", 0.15), new Outcome("spirit", 0.25), new Outcome("water", 0.15) };
				magicType = p.getProbability(goronSavantDist).getId();
			}
			break;
		case "subrosian":
			if (rand.nextInt(20) == 0) {
				Outcome[] subSavantDist = {new Outcome("light", 0.05), new Outcome("forest", 0.20), 
						new Outcome("shadow", 0.25), new Outcome("spirit", 0.35), new Outcome("water", 0.15) };
				magicType = p.getProbability(subSavantDist).getId();
			}
			break;
		case "pols voice": 
			if (rand.nextInt(100) == 0) {
				Outcome[] polSavantDist = {new Outcome("forest", 0.25), new Outcome("fire", 0.20), 
						new Outcome("shadow", 0.15), new Outcome("spirit", 0.15), new Outcome("light", 0.25) };
				magicType = p.getProbability(polSavantDist).getId();
			}
			break;
		case "lynel": 
			if (rand.nextInt(50) == 0) {
				Outcome[] lynelSavantDist = {new Outcome("forest", 0.60), new Outcome("water", 0.10), 
						new Outcome("shadow", 0.05), new Outcome("spirit", 0.10), new Outcome("light", 0.05) };
				magicType = p.getProbability(lynelSavantDist).getId();
			}
			break;
		case "moblin":
			if (rand.nextInt(70) == 0) {
				Outcome[] mobSavantDist = {new Outcome("forest", 0.25), new Outcome("water", 0.30), 
						new Outcome("shadow", 0.15), new Outcome("spirit", 0.15), new Outcome("light", 0.15) };
				magicType = p.getProbability(mobSavantDist).getId();
			}
		break;
		case "wizzrobe":
			Outcome[] wizzSavantDist = {new Outcome("forest", 0.22), new Outcome("water", 0.22), 
					new Outcome("shadow", 0.12), new Outcome("spirit", 0.22), new Outcome("light", 0.07), new Outcome ("fire", 0.17) };
				magicType = p.getProbability(wizzSavantDist).getId();
				break;
		case "river zora":
			if (rand.nextInt(40) == 0) {
				Outcome[] zorSavantDist = {new Outcome("forest", 0.25), new Outcome("fire", 0.30), 
						new Outcome("shadow", 0.20), new Outcome("spirit", 0.10), new Outcome("light", 0.15) };
				magicType = p.getProbability(zorSavantDist).getId();
			}
		}
		
		
		System.out.println(magicType);
	}
	
	public void initOccupation() {
		occupation = "none";
		if (age != "young child") {
		switch(location) {
		
		case "hylia":
			
			System.out.println(this.initHyliaOccupation());
			
			break;
		}
		}
		
		if (occupation == "soldier" && age == "child") {
			this.initOccupation();
		}
	}
	
	public String initHyliaOccupation() {
		switch(race) {
		case "hylian": 
			if (magicType != "nonsavant") {
				Outcome[] savantoccupations = {new Outcome("mage", 0.7), new Outcome("craftsman", 0.05), new Outcome("merchant", 0.05), 
						new Outcome("soldier", 0.05), new Outcome("thief", 0.05), new Outcome("freedman", 0.05), new Outcome("traveller", 0.05)};
				occupation = p.getProbability(savantoccupations).getId();
			}
			else {
				Outcome[] occupations = {new Outcome("mage", 0.05), new Outcome("craftsman", 0.3), new Outcome("merchant", 0.2), 
						new Outcome("soldier", 0.2), new Outcome("thief", 0.02), new Outcome("freedman", 0.05), new Outcome("traveller", 0.05),
						new Outcome("peasant", 0.13)};
				occupation = p.getProbability(occupations).getId();
			}
			break;
		case "subrosian":
			
		case "goron": 
			if (magicType != "nonsavant") {
				Outcome[] savantoccupations = {new Outcome("mage", 0.3), new Outcome("craftsman", 0.3), new Outcome("merchant", 0.05), 
						new Outcome("soldier", 0.05), new Outcome("thief", 0.05), new Outcome("freedman", 0.05), new Outcome("traveller", 0.05)};
				occupation = p.getProbability(savantoccupations).getId();
			}
			else {
				Outcome[] occupations = {new Outcome("mage", 0.05), new Outcome("craftsman", 0.3), new Outcome("merchant", 0.05), 
						new Outcome("soldier", 0.05), new Outcome("thief", 0.02), new Outcome("freedman", 0.05), new Outcome("traveller", 0.05),
						new Outcome("miner", 0.43)};
				occupation = p.getProbability(occupations).getId();
			}
			break;
			
		case "pols voice": 
			if (magicType != "nonsavant") {
				Outcome[] savantoccupations = {new Outcome("mage", 0.2), new Outcome("craftsman", 0.4), new Outcome("merchant", 0.05), 
						new Outcome("soldier", 0.05), new Outcome("thief", 0.05), new Outcome("freedman", 0.05), new Outcome("traveller", 0.05)};
				occupation = p.getProbability(savantoccupations).getId();
			}
			else {
				Outcome[] occupations = {new Outcome("mage", 0.02), new Outcome("craftsman", 0.1), new Outcome("merchant", 0.08), 
						new Outcome("soldier", 0.05), new Outcome("thief", 0.02), new Outcome("freedman", 0.05), new Outcome("traveller", 0.05),
						new Outcome("peasant", 0.43)};
				occupation = p.getProbability(occupations).getId();
			}
			break;
			
		}
		
		return occupation;
		
		
	}

}
