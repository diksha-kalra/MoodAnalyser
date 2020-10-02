package com.moodanalyser;

public class MoodAnalyser{
	
	
	//TC1.1 TC1.2
//	public String analyseMood(String message) {
//		if(message.contains("Sad"))
//			return "SAD";
//		else
//			return "HAPPY";
//	}
	
	//Constructor Refactor Code
	private String message;
	public MoodAnalyser(String message) {
		this.message=message;
	}
	
	public String analyseMood(String message) {
		this.message=message;
		return analyseMood();
	}
	
	public String analyseMood(){
		try {
			if(message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
		}catch(NullPointerException e) {
			return "HAPPY";
		}
	}
		
	
//	public String analyseMood(String message) throws MoodAnalysisException{
//		this.message=message;
//		return analyseMood();
//	}
//	
//	public String analyseMood() throws MoodAnalysisException {
//		try{
//			if(message.length()==0) {
//				throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, "Empty Mood");
//			}
//			if(message.contains("Sad"))
//				return "SAD";
//			else
//				return "HAPPY";
//		} catch (NullPointerException e) {
//			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL, "Please enter proper message");
//		}
//			
}
		
