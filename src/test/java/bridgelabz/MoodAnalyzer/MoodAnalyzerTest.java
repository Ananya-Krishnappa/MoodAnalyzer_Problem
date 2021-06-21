package bridgelabz.MoodAnalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyzerTest {
	MoodAnalyzer moodAnalyzer;
	MoodAnalyzer moodAnalyzer1;
	MoodAnalyzer moodAnalyzer2;
	MoodAnalyzer moodAnalyzer3;

	@Before
	public void init() {
		moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
		moodAnalyzer1 = new MoodAnalyzer("I am in Happy Mood");
		moodAnalyzer2 = new MoodAnalyzer(null);
		moodAnalyzer3 = new MoodAnalyzer("");
	}

	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();

	@Test
	public void shouldReturnSadWhenStringContainsSad() throws MoodAnalysisException {
		Mood result = moodAnalyzer.analyseMood();
		assertEquals(Mood.SAD, result);
	}

	@Test
	public void shouldReturnHappyWhenStringNotContainsSad() throws MoodAnalysisException {
		Mood result = moodAnalyzer1.analyseMood();
		assertEquals(Mood.HAPPY, result);
	}

	@Test(expected = MoodAnalysisException.class)
	public void shouldThrowCustomExceptionWhenStringIsNull() throws MoodAnalysisException {
		moodAnalyzer2.analyseMood();
	}

	@Test(expected = MoodAnalysisException.class)
	public void shouldThrowCustomExceptionWhenStringIsEmpty() throws MoodAnalysisException {
		moodAnalyzer3.analyseMood();
	}

	@Test
	public void whenExceptionThrown_thenRuleNullIsApplied() throws MoodAnalysisException {
		exceptionRule.expect(MoodAnalysisException.class);
		exceptionRule.expectMessage("Entered Mood is NULL");
		moodAnalyzer2.analyseMood();
	}

	@Test
	public void whenExceptionThrown_thenRuleEmptyIsApplied() throws MoodAnalysisException {
		exceptionRule.expect(MoodAnalysisException.class);
		exceptionRule.expectMessage("Entered Mood is EMPTY");
		moodAnalyzer3.analyseMood();
	}
}
