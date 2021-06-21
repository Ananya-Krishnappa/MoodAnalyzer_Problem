package bridgelabz.MoodAnalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MoodAnalyzerTest {
	MoodAnalyzer moodAnalyzer;
	MoodAnalyzer moodAnalyzer1;
	MoodAnalyzer moodAnalyzer2;

	@Before
	public void init() {
		moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
		moodAnalyzer1 = new MoodAnalyzer("I am in Happy Mood");
		moodAnalyzer2 = new MoodAnalyzer(null);
	}

	@Test
	public void shouldReturnSadWhenStringContainsSad() throws Exception {
		Mood result = moodAnalyzer.analyseMood();
		assertEquals(Mood.SAD, result);
	}

	@Test
	public void shouldReturnHappyWhenStringNotContainsSad() throws Exception {
		Mood result = moodAnalyzer1.analyseMood();
		assertEquals(Mood.HAPPY, result);
	}

	@Test
	public void shouldReturnHappyWhenStringIsNull() throws Exception {
		Mood result = moodAnalyzer2.analyseMood();
		assertEquals(Mood.HAPPY, result);
	}
}
