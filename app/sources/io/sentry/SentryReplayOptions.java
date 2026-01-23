package io.sentry;

import com.robinhood.transfers.models.p406db.AchTransfer;
import io.sentry.util.SampleRateUtils;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes21.dex */
public final class SentryReplayOptions {
    private Double errorSampleRate;
    private Double sessionSampleRate;
    private boolean redactAllText = true;
    private boolean redactAllImages = true;
    private Set<String> redactClasses = new CopyOnWriteArraySet();
    private SentryReplayQuality quality = SentryReplayQuality.MEDIUM;
    private int frameRate = 1;
    private long errorReplayDuration = 30000;
    private long sessionSegmentDuration = 5000;
    private long sessionDuration = 3600000;

    public enum SentryReplayQuality {
        LOW(0.8f, AchTransfer.MAX_DEPOSIT_LIMIT),
        MEDIUM(1.0f, 75000),
        HIGH(1.0f, 100000);

        public final int bitRate;
        public final float sizeScale;

        SentryReplayQuality(float f, int i) {
            this.sizeScale = f;
            this.bitRate = i;
        }
    }

    public Double getErrorSampleRate() {
        return this.errorSampleRate;
    }

    public void setErrorSampleRate(Double d) {
        if (!SampleRateUtils.isValidSampleRate(d)) {
            throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
        }
        this.errorSampleRate = d;
    }

    public Double getSessionSampleRate() {
        return this.sessionSampleRate;
    }

    public void setSessionSampleRate(Double d) {
        if (!SampleRateUtils.isValidSampleRate(d)) {
            throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
        }
        this.sessionSampleRate = d;
    }

    public boolean getRedactAllText() {
        return this.redactAllText;
    }

    public void setRedactAllText(boolean z) {
        this.redactAllText = z;
    }

    public boolean getRedactAllImages() {
        return this.redactAllImages;
    }

    public void setRedactAllImages(boolean z) {
        this.redactAllImages = z;
    }
}
