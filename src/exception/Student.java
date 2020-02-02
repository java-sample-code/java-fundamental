package exception;

public class Student {
	private int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score) throws ScoreFormatException {
		if(score<0||score>100) {
			throw new ScoreFormatException("Invalid score");
		}
		
		this.score = score;
	}
	
	
}
