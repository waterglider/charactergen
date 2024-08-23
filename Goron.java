package thingies;

import java.util.ArrayList;
import java.util.Random;

public class Goron implements NPCInterface {
	private Random rand = new Random();
	private String eyecolor;
	private String skincolor;
	private String features;
	private String eartype;
	private String hairtype;
	private ArrayList<String> scars = new ArrayList<String>();
	private int choice;
	

	public Goron () {
		this.initEartype();
		this.initEyeColors();
		this.initFeatures();
		this.initHairType();
		this.initSkinColors();
		this.initScars();
	
	}

	@Override
	public String toString() {
		return "Goron [eyecolor=" + eyecolor + ", skincolor=" + skincolor + ", features=" + features + ", eartype="
				+ eartype + ", hairtype=" + hairtype + ", scars=" + scars + "]";
	}

	@Override
	public void initEyeColors() {
		eyecolor = "black";

	}
	
	public void initHairType() {
		String hairlength[] = {"no hair", "small tufts", "short facial hair", "long facial hair", "very hairy"};
		choice = rand.nextInt(4);
		hairtype = hairlength[choice];
	}

	@Override
	public void initSkinColors() {
		String skintextures[] = {"granite", "sandstone", "limestone", "shale", "schist",
				"basalt"};
		String skintones[] = {"reddish", "sandy", "orange", "grey", "brown"};
		choice = rand.nextInt(5);
		skincolor = skintones[rand.nextInt(4)] +  " " +  skintextures[choice] ;

	}

	@Override
	public void initFeatures() {
		String feature[] = { "ore in shell", "glass in shell", "freckles", "two-toned shell", "longer crystals/rocks",
				"larger nose", "body paint/tattoo", "thicker eyebrows", "longer nails", "steam vents", 
				"mossy"};
		choice = rand.nextInt(10);
		features =  feature[choice];

	}

	@Override
	public void initEartype() {
		eartype = "no ears";

	}

	@Override
	public void initScars() {
		int hasScars = rand.nextInt(2);
		if (hasScars > 0) {
		int numberOfScars = rand.nextInt(5);
		String bodyparts[] = {"left eye", "right eye", "back", "abdomen",
				"right leg","right cheek", "left cheek", "nose", "mouth",
				"left leg", "hand", "foot"};
		for (int i = 0; i < numberOfScars; i++) {
			choice = rand.nextInt(11);
			String size[] = {"small", "medium", "large"};
			String scartype[] = {"cracking", "rift", "monster/animal", "puncture", "punishment/fight"};
			scars.add(size[rand.nextInt(2)] + " " + scartype[rand.nextInt(4)] + " scar on " + bodyparts[choice]);
		}}

	}

}
