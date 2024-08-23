package thingies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Pol implements NPCInterface {

	private Random rand = new Random();
	private String eyecolor;
	private String skincolor;
	private String tailtype;
	private String eartype;
	private String feature;
	private ArrayList<String> scars = new ArrayList<String>();
	int choice;
	
	public Pol () {
		this.initEyeColors();
		this.initEartype();
		this.initSkinColors();
		this.initTail();
		this.initFeatures();
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
	public String toString() {
		return "Pol [eyecolor=" + eyecolor + ", skincolor=" + skincolor + ", tailtype=" + tailtype + ", eartype="
				+ eartype + ", feature=" + feature + ", scars=" + scars + "]";
	}

	@Override
	public void initSkinColors() {
	ArrayList<String> skincolors = new ArrayList<>(Arrays.asList("white", "black", "chocolate", "light grey", "red", "champagne", "blue", "gray", "white", "tan"));
	String[] modifiers = {"solid", "albino",  "tricolor",  "bicolor", "broken marked", "hereford", "speckled", "siamese", "rumpwhite"};
	choice = rand.nextInt(7);
	switch(modifiers[choice]) {
		case "bicolor":
			int a = rand.nextInt(skincolors.size());
			String skin1 = skincolors.get(a);
			skincolors.remove(a);
			skincolor = modifiers[choice] + " " + skincolors.get(rand.nextInt(skincolors.size())) + " and " + skin1;
			break;
		case "tricolor":
			int b = rand.nextInt(skincolors.size());
			String skin2 = skincolors.get(b);
			skincolors.remove(b);
			int c = rand.nextInt(skincolors.size());
			String skin3 = skincolors.get(c);
			skincolors.remove(c);
			skincolor = modifiers[choice] + " " + skincolors.get(rand.nextInt(skincolors.size())) + " " + skin2 + " and " + skin3;
			break;
		case "albino": 
			skincolor = modifiers[choice];
			break;
		default:
			skincolor = modifiers[choice] + " " + skincolors.get(rand.nextInt(skincolors.size()));
			break;
			
	}
	}
	
	public void initTail() {
		String tailtypes[] = {"short", "very long", "long"};
		tailtype = tailtypes[rand.nextInt(2)];
	}

	@Override
	public void initFeatures() {
		String features[] = {"freckles", "longer snout", "longer whiskers", "birthmark",
				"smaller eyes", "farsighted", "nearsighted", "thicker eyebrows", "thicker eyelashes",
				"twisted leg", "visible buck tooth", "longer fur", "slouches", 
				"heterochromia", "cheek spots", "missing tail", "matted fur", "mouse nose"};
		choice = rand.nextInt(features.length);
		feature =  features[choice];
	}

	@Override
	public void initEartype() {
		eartype = "large, round";

	}

	@Override
	public void initScars() {
		int hasScars = rand.nextInt(2);
		if (hasScars > 0) {
		int numberOfScars = rand.nextInt(5);
		String bodyparts[] = {"left eye", "right eye",  "left ear", "right ear", "back", "abdomen",
				"right leg","right cheek", "left cheek", "nose", "snout",
				"left leg", "hand", "foot"};
		for (int i = 0; i < numberOfScars; i++) {
			choice = rand.nextInt(12);
			String size[] = {"small", "medium", "large"};
			String scartype[] = {"burn", "rift", "monster/animal", "puncture", "punishment/fight", 
	};
			scars.add(size[rand.nextInt(3)] + " " + scartype[rand.nextInt(5)] + " scar on " + bodyparts[choice]);
		}
			
		}
	}

	public String getEyecolor() {
		return eyecolor;
	}

	public String getSkincolor() {
		return skincolor;
	}

	public String getTailtype() {
		return tailtype;
	}

	public String getEartype() {
		return eartype;
	}

	public String getFeature() {
		return feature;
	}

	public ArrayList<String> getScars() {
		return scars;
	}
	
	

}
