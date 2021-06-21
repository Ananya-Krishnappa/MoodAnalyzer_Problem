package bridgelabz.MoodAnalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MoodAnalyzerTest {
	MoodAnalyzer moodAnalyzer;
	MoodAnalyzer moodAnalyzer1;

	@Before
	public void init() {
		moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
		moodAnalyzer1 = new MoodAnalyzer("I am in Happy Mood");
	}

	@Test
	public void shouldReturnSadWhenStringContainsSad() {
		Mood result = moodAnalyzer.analyseMood();
		assertEquals(Mood.SAD, result);
	}

	@Test
	public void shouldReturnHappyWhenStringNotContainsSad() {
		Mood result = moodAnalyzer1.analyseMood();
		assertEquals(Mood.HAPPY, result);
	}
}
