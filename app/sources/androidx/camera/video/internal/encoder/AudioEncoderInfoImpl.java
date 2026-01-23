package androidx.camera.video.internal.encoder;

import android.media.MediaCodecInfo;
import java.util.Objects;

/* loaded from: classes4.dex */
public class AudioEncoderInfoImpl extends EncoderInfoImpl implements EncoderInfo {
    private final MediaCodecInfo.AudioCapabilities mAudioCapabilities;

    AudioEncoderInfoImpl(MediaCodecInfo mediaCodecInfo, String str) throws InvalidConfigException {
        super(mediaCodecInfo, str);
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.mCodecCapabilities.getAudioCapabilities();
        Objects.requireNonNull(audioCapabilities);
        this.mAudioCapabilities = audioCapabilities;
    }
}
