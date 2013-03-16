package com.rikkimongoose.onsa;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	Tuning myTuning = GammaTET12.getInstance().ParseTuning("boo","A1B2");
    	for(NoteItem noteItem : myTuning.getLinkedNotes())
    		System.out.println( noteItem.toString() );
    }
}
