package com.bridgelabz.Mood_Analyzer;

public class MoodAnalyzerMain {

    private String message;

    public MoodAnalyzerMain(String message)
    {
        this.message = message;
    }
    public String returnEmotion()
    {
        if(message == "I am in sad mood")
        {
            System.out.println("Sad");
            return "sad";
        }
        else if(message == "I am in any mood")
        {
            System.out.println("Happy");
            return "Happy";
        }
        System.out.println("Happy");
        return "Happy";
    }
}
