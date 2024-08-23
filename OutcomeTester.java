package probability;

public class OutcomeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outcome a = new Outcome("1", 0.1);
		Outcome b = new Outcome("2", 0.5);
		Outcome c = new Outcome ("3", 0.3);
		Outcome d = new Outcome("4", 0.1);
		Outcome[] outcomes = {a, b, c, d};
		ProbabilityPicker p = new ProbabilityPicker();
		Outcome out = p.getProbability(outcomes);
		System.out.println(out.getId());

	}

}
