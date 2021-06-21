package bridgelabz.MoodAnalyzer;

public class MoodAnalysisException extends Exception {

	public MoodAnalysisException(String errorMessage) {
		super("Entered Mood is " + errorMessage);
	}
}
