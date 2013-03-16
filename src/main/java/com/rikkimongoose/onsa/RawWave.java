package com.rikkimongoose.onsa;

public class RawWave {

    public RawWave(int length)
    {
    	WaveData = new char[length];
    }
    public int getWaveDataLength()
    {
    	return WaveData != null ? WaveData.length : 0;
    }
    private char[] WaveData = null;
}
