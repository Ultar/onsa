/**
 * 
 */
package com.rikkimongoose.onsa;

import java.util.List;

/**
 * @author rikki
 *
 */
public interface IWaveIO {
    RawWave RecordWave(IWaveDeviceIn device, IWaveInOptions options);
    void PlayWave(IWaveDeviceOut device, IWaveOutOptions options);

    List<IWaveDeviceIn> GetInDevices();
    List<IWaveDeviceOut> GetOutDevices();
}
