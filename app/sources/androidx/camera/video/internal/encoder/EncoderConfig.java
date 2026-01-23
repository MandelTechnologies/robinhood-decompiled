package androidx.camera.video.internal.encoder;

import android.media.MediaFormat;
import androidx.camera.core.impl.Timebase;

/* loaded from: classes4.dex */
public interface EncoderConfig {
    Timebase getInputTimebase();

    String getMimeType();

    MediaFormat toMediaFormat() throws InvalidConfigException;
}
