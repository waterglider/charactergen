package thingies;

import java.util.ArrayList;
import java.util.Random;

public class RiverZora implements NPCInterface{
	private Random rand = new Random();
	private String eyecolor;
	private String skincolor;
	private String features;
	private String mutations;
	private String eartype;
	


	private ArrayList<String> scars = new ArrayList<String>();

	@Override
	public void initEyeColors() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initSkinColors() {
		int choice;
		String skinColors[] = {"red", "blue", "yellow", "green", "black", "brown", "purple",
				"orange", "cream", "pink", "grey"};
		String skintypes[] = {"spotted", "speckled", "streaked", "solid", "underbelly"};
		choice = rand.nextInt(11);
		skincolor = skintypes[rand.nextInt(4)] + " " +  skinColors[choice];
		
	}

	@Override
	public void initFeatures() {
		int choice;
		String featureType[] = {"fangs", "claws", "brow fins", "wider face", "heterochromia" };
		
	}

	@Override
	public void initEartype() {
		String eartypes[] = {"floppy", "bulbs", "webs", "fleshy"};
		eartype = eartypes[rand.nextInt(3)];
		
	}

	@Override
	public void initScars() {
		int choice;
		int hasScars = rand.nextInt(2);
		if (hasScars > 0) {
		int numberOfScars = rand.nextInt(5);
		String bodyparts[] = {"left eye", "right eye",  "ear", "back", "abdomen",
				"right leg","cheek", "nose", "mouth",
				"left leg", "hand", "foot", "headfin", "poison sac"};
		for (int i = 0; i < numberOfScars; i++) {
			choice = rand.nextInt(13);
			String size[] = {"small", "medium", "large"};
			String scartype[] = {"burn", "rift", "monster/animal", "puncture", "punishment/fight", 
	};
			scars.add(size[rand.nextInt(2)] + " " + scartype[rand.nextInt(4)] + " scar on " + bodyparts[choice]);
		}
			
		}
		
	}
	
	public void initMutations() {
		if (rand.nextBoolean() == true) {
		String mutation[] = {"extra eyes", "extra limbs", "tail", "longer snout", "shorter snout",
				"no headfin", "scales", "bulging eyes", "extra fins", "stronger poison"};
		mutations = mutation[rand.nextInt(mutation.length)];
		}
		else {
			mutations = "no mutations";
		}
		
	}
	

	public String getEyecolor() {
		return eyecolor;
	}

	public String getSkincolor() {
		return skincolor;
	}

	public String getFeatures() {
		return features;
	}

	public String getMutations() {
		return mutations;
	}

	public String getEartype() {
		return eartype;
	}

	public ArrayList<String> getScars() {
		return scars;
	}
	
	public String toString() {
		return "River Zora[eyecolor" + eyecolor + ", skincolor=" + skincolor + ", features=" + features + " ,mutations"
				+ mutations + ", ear type =" + eartype + ", scars" + scars + " ]";
	}
	

}
