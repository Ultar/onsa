package com.rikkimongoose.onsa;

public interface IGamma {
    Tuning ParseTuning(String tuningTitle, String code);
    double PitchByNote(Note noteBase, int octave);
}
