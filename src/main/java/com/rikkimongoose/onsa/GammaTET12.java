package com.rikkimongoose.onsa;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class GammaTET12 implements IGamma {

	private Pattern TuningStringRegEx;
	private String TuningStringRegExStr = "([A-G]#?)(\\d*)";
	public Tuning ParseTuning(String tuningTitle, String code) {
		Matcher matcher = TuningStringRegEx.matcher(code);
		Tuning newTuning = new Tuning(tuningTitle, code);
		while(matcher.find())
		{
			Note note = (Note)NoteTET12.getElement(matcher.group(1));
			int octaveNum = Integer.parseInt(matcher.group(2));
			IOctave octave = (IOctave)OctaveTET12.getElement(octaveNum);
			double pitch = PitchByNote(note, octaveNum);
			newTuning.getLinkedNotes().add(new NoteItem(matcher.group(1), pitch, matcher.group(0), octave));
		}
		return newTuning;
	}
	
	public double PitchByNote(Note noteBase, int octave) {
		return Math.pow(2.0, octave)*noteBase.getPitch();
	}
	
	private GammaTET12() {
		TuningStringRegEx = Pattern.compile(TuningStringRegExStr);
	}
	
	private static GammaTET12 Instance = null;
	public static GammaTET12 getInstance()
	{
		if(Instance == null)
			Instance = new GammaTET12();
		return Instance;
	}

}
