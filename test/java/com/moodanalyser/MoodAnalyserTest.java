package com.moodanalyser;
//import com.moodanalyser.MoodAnalyser;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Assert;

public class MoodAnalyserTest {
    
//    @Test 
//    public void giveMessage_WhenSad_ShouldReturnSad() {
//        MoodAnalyser moodAnalyser = new MoodAnalyser();  --- uc 1
//		  String mood=moodAnalyser.analyseMood("This is a Sad Message");  ---uc 1
//		  MoodAnalyser moodAnalyser = new MoodAnalyser("This is a Sad Message");  
//        String mood=moodAnalyser.analyseMood();
//        Assert.assertEquals("SAD",mood);
//    }
//	
//	 @Test
//	 public void giveMessage_WhenNotSad_ShouldReturnHappy() {
//		  MoodAnalyser moodAnalyser = new MoodAnalyser();
//		  String mood=moodAnalyser.analyseMood("This is a Happy Message");
//        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a Happy Message");
//        String mood=moodAnalyser.analyseMood();
//        Assert.assertEquals("HAPPY",mood);
//    }
	
	 //UC-2
 	 @Test
	 public void givenNullMood_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);	
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY",mood);
 	 }
	
	//UC-3
//	@Test
//	public void givenNullMood_ShouldThrowException() {
//		MoodAnalyser moodAnalyser = new MoodAnalyser(null);	
//		try {
//			//ExpectedException exceptionRule=ExpectedException.none();
//			//exceptionRule.expect(MoodAnalysisException.class);
//			moodAnalyser.analyseMood();
//		} catch (MoodAnalysisException e) {
//			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL,e.type);
//		}
//	}
//		
//		@Test
//		public void givenEmptyMood_ShouldThrowException() {
//			MoodAnalyser moodAnalyser = new MoodAnalyser(" ");	
//			try {
//				//ExpectedException exceptionRule=ExpectedException.none();
//				//exceptionRule.expect(MoodAnalysisException.class);
//				moodAnalyser.analyseMood();
//			} catch (MoodAnalysisException e) {
//				Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,e.type);
//			}
//	}
	
}	
	
