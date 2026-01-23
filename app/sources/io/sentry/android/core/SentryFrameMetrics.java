package io.sentry.android.core;

/* loaded from: classes14.dex */
final class SentryFrameMetrics {
    private int frozenFrameCount;
    private long frozenFrameDelayNanos;
    private int normalFrameCount;
    private int slowFrameCount;
    private long slowFrameDelayNanos;
    private long totalDurationNanos;

    public void addFrame(long j, long j2, boolean z, boolean z2) {
        this.totalDurationNanos += j;
        if (z2) {
            this.frozenFrameDelayNanos += j2;
            this.frozenFrameCount++;
        } else if (z) {
            this.slowFrameDelayNanos += j2;
            this.slowFrameCount++;
        } else {
            this.normalFrameCount++;
        }
    }

    public int getSlowFrameCount() {
        return this.slowFrameCount;
    }

    public int getFrozenFrameCount() {
        return this.frozenFrameCount;
    }

    public long getSlowFrameDelayNanos() {
        return this.slowFrameDelayNanos;
    }

    public long getFrozenFrameDelayNanos() {
        return this.frozenFrameDelayNanos;
    }

    public int getTotalFrameCount() {
        return this.normalFrameCount + this.slowFrameCount + this.frozenFrameCount;
    }

    public long getTotalDurationNanos() {
        return this.totalDurationNanos;
    }
}
