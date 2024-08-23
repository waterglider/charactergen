package probability;

public class Outcome {
	private String id;
	private double probability;
	
	//id is the name of the item, probability is a percentage converted to decimal form
public Outcome (String id, double probability) {
	this.id = id;
	this.probability = probability;
	
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public double getProbability() {
	return probability;
}

public void setProbability(double probability) {
	this.probability = probability;
}


}
