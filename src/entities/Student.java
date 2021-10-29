package entities;

public class Student {

	public String name;
	public double scoreOne;
	public double scoreTwo;
	public double scoreThree;

	public Double calculateTotalScore() {
		return scoreOne + scoreTwo + scoreThree;
	}

	public Double missingScore() {
		if (calculateTotalScore() < 60.0) {
			return 60.0 - calculateTotalScore();
		} else {
			return 0.0;
		}
	}
}
