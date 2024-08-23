package probability;

import java.util.Random;

public class ProbabilityPicker {
	
	private Random rand = new Random();
	
	public ProbabilityPicker() {
		
		
	}
	
	public Outcome getProbability(Outcome[] outcomes) {
int random = rand.nextInt(100);
		
		double percentage = 0;
		this.sortOutcomeList(outcomes);
		for ( int i = 0; i < outcomes.length; i++) {
			percentage += outcomes[i].getProbability() * 100;
			if (percentage > random) {
				return outcomes[i];
				
			}
		}
		return null;
	}
	
	private Outcome[] sortOutcomeList(Outcome[] outcomes) {
		Outcome max = outcomes[0];
		for (int i = 0; i < outcomes.length - 1; i++) {
			if (max.getProbability() < outcomes[i].getProbability()) {
				Outcome out = max;
				max = outcomes[i];
				outcomes[0] = max;
				outcomes[i] = out;
			}
		} 
		return outcomes;
		
	}

}
