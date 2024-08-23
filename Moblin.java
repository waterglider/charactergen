package thingies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Moblin implements NPCInterface {
	private Random rand = new Random();
	private String eyecolor; 


	private String skincolor;
	private String eartype;
	private String feature;
	private ArrayList<String> scars = new ArrayList<String>();
	private int choice;
	
	public Moblin() {
		this.initEartype();
		this.initEyeColors();
		this.initFeatures();
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
		//String[] skincolors = {"brown", "red", "gold", "yellow", "cream", "black", "blue", "gray", "white", "tan"};
		ArrayList<String> skincolors = new ArrayList<>(Arrays.asList("brown", "red", "gold", "yellow", "cream", "black", "blue", "gray", "white", "tan"));
		String[] modifiers = {"solid",  "tricolor",  "bicolor", "merle", "spotted", "speckled", "sable"};
		choice = rand.nextInt(6);
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
			default:
				skincolor = modifiers[choice] + " " + skincolors.get(rand.nextInt(skincolors.size()));
				break;
				
		}
	
	}

	@Override
	public void initFeatures() {
		String features[] = {"freckles", "longer snout", "longer whiskers", "shorter snout", "birthmark",
				"smaller eyes", "farsighted", "nearsighted", "thicker eyebrows", "thicker eyelashes",
				"twisted leg", "tusks", "longer fangs", "longer fur", "slouches", 
				"heterochromia"};
		choice = rand.nextInt(features.length);
		feature =  features[choice];

	}

	@Override
	public void initEartype() {
	String eartypes[] = {"floppy", "pointed", "long"};
	eartype = eartypes[rand.nextInt(2)];
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
	
	public String toString() {
		return "Moblin [eyecolor=" + eyecolor + ", skincolor=" + skincolor + ", eartype=" + eartype + ", features="
				+ feature + ", scars=" + scars + "]";
	}

	public String getEyecolor() {
		return eyecolor;
	}

	public String getSkincolor() {
		return skincolor;
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
