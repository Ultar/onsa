package com.rikkimongoose.onsa;

import java.util.ArrayList;
import java.util.List;

public class NoteTET12 implements INote{
	private static List<NoteTET12> items = new ArrayList<NoteTET12>();
	
	private NoteTET12(String title, double pitch)
	{
		Title = title;
		Pitch = pitch;
		items.add(this);
	}
	
	public static NoteTET12 A =      new NoteTET12("A",  27.500);
	public static NoteTET12 ADiez =  new NoteTET12("A#", 29.135);
	public static NoteTET12 B =      new NoteTET12("B",  30.868);
	public static NoteTET12 C =      new NoteTET12("C",  16.352);
	public static NoteTET12 CDiez =  new NoteTET12("C#", 17.324);
	public static NoteTET12 D =      new NoteTET12("D",  18.354);
	public static NoteTET12 DDiez =  new NoteTET12("D#", 19.445);
	public static NoteTET12 E =      new NoteTET12("E",  20.602);
	public static NoteTET12 F =      new NoteTET12("F",  21.827);
	public static NoteTET12 FDiez =  new NoteTET12("F#", 23.152);
	public static NoteTET12 G =      new NoteTET12("G",  24.500);
	public static NoteTET12 GDiez =  new NoteTET12("G#", 25.957);
	
	public static NoteTET12 getElement(double pitch)
	{
		for(NoteTET12 element : items)
			if(element.getPitch() == pitch)
				return element;
		return null;
	}
	
	public static NoteTET12 getElement(String title)
	{
		for(NoteTET12 element : items)
			if(element.getTitle() == title)
				return element;
		return null;
	}
	
	public String getTitle() {
		return Title;
	}

	public double getPitch() {
		return Pitch;
	}
	private String Title;
	private double Pitch;
}
