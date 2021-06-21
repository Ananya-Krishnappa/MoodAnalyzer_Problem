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
	 * @throws Exception
	 */
	public Mood analyseMood() throws MoodAnalysisException {
		try {
			if (message.toLowerCase().indexOf(Mood.HAPPY.name().toLowerCase()) != -1) {
				return Mood.HAPPY;
			} else if (message.toLowerCase().indexOf(Mood.SAD.name().toLowerCase()) != -1) {
				return Mood.SAD;
			} else if (message == "") {
				throw new MoodAnalysisException(Mood.EMPTY.name());
			}
			return Mood.HAPPY;
		} catch (NullPointerException e) {
			if (message == null) {
				throw new MoodAnalysisException(Mood.NULL.name());
			}
			throw new MoodAnalysisException(e.getMessage());
		} catch (Exception e) {
			throw new MoodAnalysisException(e.getMessage());
		}
	}
}
