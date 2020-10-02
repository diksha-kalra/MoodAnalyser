package com.moodanalyser;
import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest {
      
	@Test 
	public void giveMessage_WhenSad_ShouldReturnSad() { 
		MoodAnalyser moodAnalyser = new MoodAnalyser("This is a Sad Message");  
		String mood="This is a Sad Message";
		try {
			mood = moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
		Assert.assertEquals("SAD",mood);
	}
	
	@Test
	public void giveMessage_WhenNotSad_ShouldReturnHappy() {
       		MoodAnalyser moodAnalyser = new MoodAnalyser("This is a Happy Message");
       		String mood="This is a Happy Message";
		try {
			mood = moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
			}
		Assert.assertEquals("HAPPY",mood);
	}
	

	@Test
	public void givenNullMood_ShouldThrowException() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);	
		try {
			moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL,e.type);
		}

	}
}	
	
