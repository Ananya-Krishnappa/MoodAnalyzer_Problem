/**
 * Purpose:Mood Analyzer Problem
 * @author Ananya K
 * @version 1.0
 * @since 21/06/2021
 * 
 */
package bridgelabz.MoodAnalyzer;

public class MoodAnalyzer {
	private String message;

	public MoodAnalyzer() {

	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	/**
	 * This method compares the message and returns if present or not
	 * 
	 * @return Happy or sad
	 */
	public Mood analyseMood() {
		if (message.toLowerCase().indexOf(Mood.HAPPY.name().toLowerCase()) != -1) {
			return Mood.HAPPY;
		} else if (message.toLowerCase().indexOf(Mood.SAD.name().toLowerCase()) != -1) {
			return Mood.SAD;
		}
		return Mood.HAPPY;
	}
}
