package thingies;

import java.util.ArrayList;
import java.util.Random;

public class Subrosian implements NPCInterface {
	private String eyecolor; 
	private String skincolor;
	private String eartype;
	private String feature;
	private ArrayList<String> scars = new ArrayList<String>();
	int choice;
	private Random rand = new Random();
	
	public Subrosian() {
		this.initEartype();
		this.initEyeColors();
		this.initFeatures();
		this.initScars();
		this.initSkinColors();
	}
	
	


	@Override
	public String toString() {
		return "Subrosian [eyecolor=" + eyecolor + ", skincolor=" + skincolor + ", eartype=" + eartype + ", feature="
				+ feature + ", scars=" + scars + "]";
	}


	@Override
	public void initEyeColors() {
		eyecolor = "white";

	}

	@Override
	public void initSkinColors() {
		String [] containers = {"pot", "armor", "robe"};
		choice = rand.nextInt(containers.length);
		
		switch (containers[choice]) {
		
		case "pot":
			String [] pots = {"long", "large", "squat"};
			String [] pottype = {"metal", "clay", "wood"};
			skincolor = pots[rand.nextInt(pots.length)] + " " + pottype[rand.nextInt(pottype.length)] + " pot";
			break;
		case "armor":
			String [] metals = {"iron", "silver", "gold", "copper", "rusted"};
			String [] armor = {"helmet", "armor"};
			skincolor = metals[rand.nextInt(metals.length)] + " " + armor[rand.nextInt(armor.length)];
			break;
		case "robe":
			String [] colors = {"white", "grey", "black", "red", "orange", "yellow", "green", "blue", "indigo", "violet"};
			skincolor = colors[rand.nextInt(colors.length)] + " robe";
			break;
		}
		
		

	}

	@Override
	public void initFeatures() {
		String features[] = {"broken/torn", "bells", "ribbons", "tassels", "feathers", "stronger eyeglow", "unstable", "patterned" };
		feature = features[rand.nextInt(features.length)];
	}

	@Override
	public void initEartype() {
		// TODO Auto-generated method stub
		eartype = "none";
	}

	@Override
	public void initScars() {
		// TODO Auto-generated method stub

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
