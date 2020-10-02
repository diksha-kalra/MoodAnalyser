package com.moodanalyser;

public class MoodAnalyser{
	
	//Variable
	private String message;
	
	//Constructor
	public MoodAnalyser(String message) {
		this.message=message;
	}
	
	public String analyseMood(String message) {
		this.message=message;
		return analyseMood();
	}
	
	public String analyseMood(){
			if(message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
	}

}
		
