package com.bridgelabz.Mood_Analyzer;

public class MoodAnalyzerMain
{

    private String message;

    public MoodAnalyzerMain()
    {

    }

    public MoodAnalyzerMain(String message)
    {
        this.message = message;
    }
    public String returnEmotion()
    {
        if(message == "I am in sad mood")
        {
            return "sad";
        }
        else if(message == "I am in any mood")
        {
            return "Happy";
        }
        return "Happy";
    }
}