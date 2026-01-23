package com.withpersona.sdk2.camera;

import kotlin.Metadata;

/* compiled from: AudioConfiguration.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/AudioConfiguration;", "", "", "sampleRateInHz", "channelConfig", "audioFormat", "bufferSizeInBytes", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getSampleRateInHz", "getChannelConfig", "getAudioFormat", "getBufferSizeInBytes", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class AudioConfiguration {
    private final int audioFormat;
    private final int bufferSizeInBytes;
    private final int channelConfig;
    private final int sampleRateInHz;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioConfiguration)) {
            return false;
        }
        AudioConfiguration audioConfiguration = (AudioConfiguration) other;
        return this.sampleRateInHz == audioConfiguration.sampleRateInHz && this.channelConfig == audioConfiguration.channelConfig && this.audioFormat == audioConfiguration.audioFormat && this.bufferSizeInBytes == audioConfiguration.bufferSizeInBytes;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.sampleRateInHz) * 31) + Integer.hashCode(this.channelConfig)) * 31) + Integer.hashCode(this.audioFormat)) * 31) + Integer.hashCode(this.bufferSizeInBytes);
    }

    public String toString() {
        return "AudioConfiguration(sampleRateInHz=" + this.sampleRateInHz + ", channelConfig=" + this.channelConfig + ", audioFormat=" + this.audioFormat + ", bufferSizeInBytes=" + this.bufferSizeInBytes + ")";
    }

    public AudioConfiguration(int i, int i2, int i3, int i4) {
        this.sampleRateInHz = i;
        this.channelConfig = i2;
        this.audioFormat = i3;
        this.bufferSizeInBytes = i4;
    }

    public final int getSampleRateInHz() {
        return this.sampleRateInHz;
    }
}
