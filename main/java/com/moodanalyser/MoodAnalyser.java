package com.moodanalyser;

public class MoodAnalyser{
	
	//Variable
	private String message;
	
	//Constructor
	public MoodAnalyser(String message) {
		this.message=message;
	}
	
	public String analyseMood(String message) throws MoodAnalysisException{
		this.message=message;
		return analyseMood();
	}
	
	public String analyseMood() throws MoodAnalysisException {
		try{
			if(message.length()==0) {
				throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, "Empty Mood");
			}
			else if(message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (NullPointerException e) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL, "Please enter proper message");
		}

}
}		
