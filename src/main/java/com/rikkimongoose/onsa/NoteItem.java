package com.rikkimongoose.onsa;

public class NoteItem extends Note{

	public NoteItem(String title, double pitch, String publicTitle, IOctave octave) {
		super(title, pitch);
		PublicTitle = publicTitle;
	}
	
	public String getPublicTitle()
	{
		return PublicTitle;
	}

	public IOctave getOctave()
	{
		return Octave;
	}

	private IOctave Octave;
	private String PublicTitle;
	
	public String toString()
	{
		return PublicTitle;
	}
}
