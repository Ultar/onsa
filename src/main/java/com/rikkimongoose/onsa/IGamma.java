package com.rikkimongoose.onsa;

public interface IGamma {
    Tuning ParseTuning(String tuningTitle, String code);
    double PitchByNote(double NoteBase, int octave);
}
