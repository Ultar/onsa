package com.rikkimongoose.onsa;

public class Note {
	public Note(String title)
	{
		Title = title;
	}
	
	public String getTitle()
	{
		return Title;
	}

	public double getPitch()
	{
		return Pitch;
	}
	
	private String Title;
	private double Pitch;
}
