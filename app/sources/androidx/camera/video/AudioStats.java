package androidx.camera.video;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class AudioStats {
    private static final Set<Integer> ERROR_STATES = Collections.unmodifiableSet(new HashSet(Arrays.asList(2, 3, 4)));

    abstract double getAudioAmplitudeInternal();

    public abstract int getAudioState();

    public abstract Throwable getErrorCause();

    AudioStats() {
    }

    /* renamed from: of */
    static AudioStats m79of(int i, Throwable th, double d) {
        return new AutoValue_AudioStats(i, d, th);
    }
}
