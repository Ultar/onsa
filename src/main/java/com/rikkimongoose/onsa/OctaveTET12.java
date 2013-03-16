package com.rikkimongoose.onsa;

import java.util.ArrayList;
import java.util.List;

public class OctaveTET12 implements IOctave {
	private static List<OctaveTET12> items = new ArrayList<OctaveTET12>();;
	
	public static OctaveTET12 Subsubcontra = new OctaveTET12("Subsubcontra", -1);
	public static OctaveTET12 Subcontra = new OctaveTET12("Subcontra", 0);
	public static OctaveTET12 Contra = new OctaveTET12("Contra", 1);
	public static OctaveTET12 Great = new OctaveTET12("Great", 2);
	public static OctaveTET12 Small = new OctaveTET12("Small", 3);
	public static OctaveTET12 Lined1 = new OctaveTET12("Lined 1", 4);
	public static OctaveTET12 Lined2 = new OctaveTET12("Lined 2", 5);
	public static OctaveTET12 Lined3 = new OctaveTET12("Lined 3", 6);
	public static OctaveTET12 Lined4 = new OctaveTET12("Lined 4", 7);;
	
	public String getTitle() {
		return Title;
	}

	public int getNumber() {
		return Number;
	}
	
	public static OctaveTET12 getElement(int number)
	{
		for(OctaveTET12 element : items)
			if(element.getNumber() == number)
				return element;
		return null;
	}
	public static OctaveTET12 getElement(String title)
	{
		for(OctaveTET12 element : items)
			if(element.getTitle() == title)
				return element;
		return null;
	}
	
	private OctaveTET12(String title, int number)
	{
		Title = title;
		Number = number;
		items.add(this);
	}
	private String Title;
	private int Number;
	
}
