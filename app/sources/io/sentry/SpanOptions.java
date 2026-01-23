package io.sentry;

/* loaded from: classes14.dex */
public class SpanOptions {
    private boolean trimStart = false;
    private boolean trimEnd = false;
    private boolean isIdle = false;

    public boolean isTrimStart() {
        return this.trimStart;
    }

    public boolean isTrimEnd() {
        return this.trimEnd;
    }

    public boolean isIdle() {
        return this.isIdle;
    }

    public void setTrimEnd(boolean z) {
        this.trimEnd = z;
    }
}
