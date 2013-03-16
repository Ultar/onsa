package com.rikkimongoose.onsa;

import java.util.LinkedList;
import java.util.List;

public class Tuning {
	public Tuning(String title, String code)
	{
		Title = title;
		Code = code;
		Notes = new LinkedList<NoteItem>();
	}
	public String getTitle()
	{
		return Title;
	}
    private String Title;
	public String getCode()
	{
		return Code;
	}
    private String Code;
    
    public LinkedList<NoteItem> getLinkedNotes()
    {
    	return (LinkedList<NoteItem>)Notes;
    }
    private List<NoteItem> Notes;
}
