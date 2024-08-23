package thingies;

import java.util.ArrayList;
import java.util.Random;

public class Lynel implements NPCInterface {
	
	private Random rand = new Random();
	private String eyecolor;
	private String skincolor;
	private String hairtype;
	private String eartype;
	private String feature;
	private String horntype;
	private int choice;
	private boolean isBigCat;
	private ArrayList<String> scars = new ArrayList<String>();
	
	public Lynel(boolean isBigCat) {
		
		this.isBigCat = isBigCat;
		this.initEartype();
		this.initEyeColors();
		this.initFeatures();
		this.initSkinColors();
		this.initHairtype();
		this.initHorntype();
		this.initScars();
		
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "Lynel [eyecolor=" + eyecolor + ", skincolor=" + skincolor + ", hairtype=" + hairtype + ", eartype="
				+ eartype + ", feature=" + feature + ", horntype=" + horntype + ", isBigCat=" + isBigCat + ", scars="
				+ scars + "]";
	}




	public void initHorntype() {
		
		String horntypes[] = {"ramlike", "stubs", "buffalo-like", "antelope-like", "antler-like", "none"};
		horntype = horntypes[rand.nextInt(horntypes.length)];
		
	}
	
	public void initHairtype() {
		String bigCatMane[] = {"full mane/beard", "no mane/beard", "back only", "partial beard"};
		String littleCatMane[] = {"no mane",  "small beard", "back mane"};
		String[] colors = {"tan", "dark brown", "golden", "white", "yellow", "orange", "black", "brown", "red" }; 
		if (isBigCat) {
			hairtype = bigCatMane[rand.nextInt(bigCatMane.length)]  + " " + colors[rand.nextInt(colors.length)];
		}
		else {
			hairtype = littleCatMane[rand.nextInt(littleCatMane.length)]; 
		}
		
	}
	
	@Override
	public void initEyeColors() {
		String[] eyecolors = {"yellow", "red", "pink", "hazel", "brown", "dark brown", "grey", "blue-grey", "light grey", 
				 "dark grey","orange", "light brown", "golden brown", "light green", "blue-green", "bright green",
				 "dark green", "purple", "blue", "light blue", "dark blue"};
		 eyecolor = eyecolors[rand.nextInt(eyecolors.length)];

	}

	@Override
	public void initSkinColors() {
		String[] colors = {"tan", "brown", "golden", "white", "yellow", "orange", "black", "chestnut", "red", "buckskin" }; 
		String [] patterns = {"roan", "spots", "rosette", "paint", "dun", "stripes"};
		skincolor = colors[rand.nextInt(colors.length)] + " " + patterns[rand.nextInt(patterns.length)];

	}

	@Override
	public void initFeatures() {
		String features[] = {"mohawk mane", "prominent whiskers", "socks", "cropped tail", "farsighted/nearsighted", "multicolored mane", 
				"longer fangs", "longer arm/leg fur", "white belly", "ear fur", "longer claws"};
		feature = features[rand.nextInt(features.length)];

	}

	@Override
	public void initEartype() {
		if (isBigCat) {
			eartype = "round, short";
		}
		
		else {
			String [] eartypes = {"lynxlike", "catlike", "Pallas Cat-like", "lionlike"};
			eartype = eartypes[rand.nextInt(eartypes.length)];
		}
		

	}

	@Override
	public void initScars() {
		int numberOfScars = rand.nextInt(10);
		String bodyparts[] = {"left eye", "right eye",  "left ear", "right ear", "back", "abdomen",
				"right front leg","right cheek", "left cheek", "nose", "muzzle",
				"left front leg", "hand", "left back leg", "right back leg", "rump", "shoulder", "barrel"};
		for (int i = 0; i < numberOfScars; i++) {
			choice = rand.nextInt(bodyparts.length);
			String size[] = {"small", "medium", "large"};
			String scartype[] = {"burn", "rift", "monster/animal", "puncture", "fight", 
	};
			scars.add(size[rand.nextInt(3)] + " " + scartype[rand.nextInt(5)] + " scar on " + bodyparts[choice]);
		}	
		}




	public String getEyecolor() {
		return eyecolor;
	}




	public String getSkincolor() {
		return skincolor;
	}




	public String getHairtype() {
		return hairtype;
	}




	public String getEartype() {
		return eartype;
	}




	public String getFeature() {
		return feature;
	}




	public String getHorntype() {
		return horntype;
	}




	public boolean isBigCat() {
		return isBigCat;
	}




	public ArrayList<String> getScars() {
		return scars;
	}

	
}
