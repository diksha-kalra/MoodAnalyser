package com.moodanalyser;
import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest {
      
	@Test 
	public void giveMessage_WhenSad_ShouldReturnSad() { 
		MoodAnalyser moodAnalyser = new MoodAnalyser("This is a Sad Message");  
		String mood=moodAnalyser.analyseMood();
		Assert.assertEquals("SAD",mood);
	}
	
	@Test
	public void giveMessage_WhenNotSad_ShouldReturnHappy() {
       		MoodAnalyser moodAnalyser = new MoodAnalyser("This is a Happy Message");
       		String mood=moodAnalyser.analyseMood();
       		Assert.assertEquals("HAPPY",mood);
   }


}	
	
