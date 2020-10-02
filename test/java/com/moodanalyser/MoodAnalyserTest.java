package com.moodanalyser;
import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest {
      
	@Test 
  	public void giveMessage_WhenSad_ShouldReturnSad() {
     		MoodAnalyser moodAnalyser = new MoodAnalyser();
	  	String mood=moodAnalyser.analyseMood("This is a Sad Message");  
      		Assert.assertEquals("SAD",mood);
 }
	
	@Test
	public void giveMessage_WhenNotSad_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood=moodAnalyser.analyseMood("This is a Happy Message");
		Assert.assertEquals("HAPPY",mood);
   }


}	
	
