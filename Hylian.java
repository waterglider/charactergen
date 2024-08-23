package thingies;

import java.util.ArrayList;
import java.util.Random;

public class Hylian implements NPCInterface{
	private Random rand = new Random();
	private String eyecolor;
	private String haircolor;
	private String skincolor;
	private String earlength;
	private String features;
	private ArrayList<String> scars = new ArrayList<String>();
	private int choice;
	
	public Hylian() {
		this.initEartype();
		this.initEyeColors();
		this.initFeatures();
		this.initHairtype();
		this.initSkinColors();
		this.initScars();
	}
	
	public void initEyeColors() {
	 String[] eyecolors = {"yellow", "red", "pink", "hazel", "brown", "dark brown", "grey", "blue-grey", "light grey", 
			 "dark grey","orange", "light brown", "golden brown", "light green", "blue-green", "bright green",
			 "dark green", "purple", "blue", "light blue", "dark blue"};
	 choice = rand.nextInt(20);
	 eyecolor = eyecolors[choice];
		
	}

	@Override
	public void initSkinColors() {
		String skincolors[] = {"pale", "fair", "light brown", "medium brown", "dark brown", "very dark brown"};
		choice = rand.nextInt(5);
		skincolor = skincolors[choice];
		
	}

	@Override
	public void initFeatures() {
		String feature[] = {"freckles", "beauty mark", "larger nose", "piercings", "tattoo", 
				"birthmark", "smaller eyes", "farsighted", "nearsighted", "thicker eyebrows",
				"thicker eyelashes", "long nails", "wider face", "dimples", "slouches",
				"gap toothed", "missing teeth", "sharp teeth", "limps", "bandadged limb/hand",
				"acne", "hair covers eyes", "balding/bald", "heterochromia"};
		choice = rand.nextInt(23);
		features =  feature[choice];
	}

	@Override
	public void initEartype() {
		String eartypes[] = { "short", "average", "long", "very long"};
		choice = rand.nextInt(3);
		earlength = eartypes[choice];
	}

	@Override
	public void initScars() {
		int hasScars = rand.nextInt(2);
		if (hasScars > 0) {
		int numberOfScars = rand.nextInt(5);
		String bodyparts[] = {"left eye", "right eye",  "ear", "back", "abdomen",
				"right leg","right cheek", "left cheek", "nose", "mouth",
				"left leg", "hand", "foot"};
		for (int i = 0; i < numberOfScars; i++) {
			choice = rand.nextInt(12);
			String size[] = {"small", "medium", "large"};
			String scartype[] = {"burn", "rift", "monster/animal", "puncture", "punishment/fight", 
	};
			scars.add(size[rand.nextInt(2)] + " " + scartype[rand.nextInt(4)] + " scar on " + bodyparts[choice]);
		}
			
		}
		
		
	}
	
	public void initHairtype() {
		choice = rand.nextInt(4);
		int curl = rand.nextInt(6);
		int color = rand.nextInt(18);
		
		String hairtype[] =  {"very short", "short", "medium", "long", "very long"};
		String haircurl[] = {"straight", "slightly wavy", "wavy", "curly", "corkscrew curly",
							"tight curls", "very tight curls" };
		String haircolors[] = {"black", "dark brown", "brown", "light brown", "dirty blonde",
								"dark blonde", "blonde", "light blonde", "white", "strawberry blonde",
								"light red", "red", "ginger", "pink",
								"maroon", "dark blue", "orange", "dark purple", "dark green",
								};
		haircolor = hairtype[choice] + " " + haircurl[curl] + " " + haircolors[color];
		
		
		
		
	}
	
	@Override
	public String toString() {
		return "Hylian [eyecolor=" + eyecolor + ", haircolor=" + haircolor + ", skincolor=" + skincolor + ", earlength="
				+ earlength + ", features=" + features + ", scars=" + scars + "]";
	}

	public String getEyecolor() {
		return eyecolor;
	}


	
	public String getSkincolor() {
		return skincolor;
		
	}


	public String getEarlength() {
		return earlength;
	}


	public String getFeatures() {
		return features;
	}



	public ArrayList<String> getScars() {
		return scars;
	}



	
}


