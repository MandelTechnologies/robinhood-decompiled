package com.robinhood.android.welcome;

import kotlin.Metadata;

/* compiled from: WelcomeAnimationFrames.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/welcome/WelcomeAnimationFrames;", "", "backgroundColor", "", "dotIndicatorBackgroundColor", "dotIndicatorBackgroundAlpha", "", "initialFrame", "initialLoopingFrame", "finalLoopingFrame", "<init>", "(IIFIII)V", "getBackgroundColor", "()I", "getDotIndicatorBackgroundColor", "getDotIndicatorBackgroundAlpha", "()F", "getInitialFrame", "getInitialLoopingFrame", "getFinalLoopingFrame", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class WelcomeAnimationFrames {
    private final int backgroundColor;
    private final float dotIndicatorBackgroundAlpha;
    private final int dotIndicatorBackgroundColor;
    private final int finalLoopingFrame;
    private final int initialFrame;
    private final int initialLoopingFrame;

    public static /* synthetic */ WelcomeAnimationFrames copy$default(WelcomeAnimationFrames welcomeAnimationFrames, int i, int i2, float f, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = welcomeAnimationFrames.backgroundColor;
        }
        if ((i6 & 2) != 0) {
            i2 = welcomeAnimationFrames.dotIndicatorBackgroundColor;
        }
        if ((i6 & 4) != 0) {
            f = welcomeAnimationFrames.dotIndicatorBackgroundAlpha;
        }
        if ((i6 & 8) != 0) {
            i3 = welcomeAnimationFrames.initialFrame;
        }
        if ((i6 & 16) != 0) {
            i4 = welcomeAnimationFrames.initialLoopingFrame;
        }
        if ((i6 & 32) != 0) {
            i5 = welcomeAnimationFrames.finalLoopingFrame;
        }
        int i7 = i4;
        int i8 = i5;
        return welcomeAnimationFrames.copy(i, i2, f, i3, i7, i8);
    }

    /* renamed from: component1, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDotIndicatorBackgroundColor() {
        return this.dotIndicatorBackgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final float getDotIndicatorBackgroundAlpha() {
        return this.dotIndicatorBackgroundAlpha;
    }

    /* renamed from: component4, reason: from getter */
    public final int getInitialFrame() {
        return this.initialFrame;
    }

    /* renamed from: component5, reason: from getter */
    public final int getInitialLoopingFrame() {
        return this.initialLoopingFrame;
    }

    /* renamed from: component6, reason: from getter */
    public final int getFinalLoopingFrame() {
        return this.finalLoopingFrame;
    }

    public final WelcomeAnimationFrames copy(int backgroundColor, int dotIndicatorBackgroundColor, float dotIndicatorBackgroundAlpha, int initialFrame, int initialLoopingFrame, int finalLoopingFrame) {
        return new WelcomeAnimationFrames(backgroundColor, dotIndicatorBackgroundColor, dotIndicatorBackgroundAlpha, initialFrame, initialLoopingFrame, finalLoopingFrame);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WelcomeAnimationFrames)) {
            return false;
        }
        WelcomeAnimationFrames welcomeAnimationFrames = (WelcomeAnimationFrames) other;
        return this.backgroundColor == welcomeAnimationFrames.backgroundColor && this.dotIndicatorBackgroundColor == welcomeAnimationFrames.dotIndicatorBackgroundColor && Float.compare(this.dotIndicatorBackgroundAlpha, welcomeAnimationFrames.dotIndicatorBackgroundAlpha) == 0 && this.initialFrame == welcomeAnimationFrames.initialFrame && this.initialLoopingFrame == welcomeAnimationFrames.initialLoopingFrame && this.finalLoopingFrame == welcomeAnimationFrames.finalLoopingFrame;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.backgroundColor) * 31) + Integer.hashCode(this.dotIndicatorBackgroundColor)) * 31) + Float.hashCode(this.dotIndicatorBackgroundAlpha)) * 31) + Integer.hashCode(this.initialFrame)) * 31) + Integer.hashCode(this.initialLoopingFrame)) * 31) + Integer.hashCode(this.finalLoopingFrame);
    }

    public String toString() {
        return "WelcomeAnimationFrames(backgroundColor=" + this.backgroundColor + ", dotIndicatorBackgroundColor=" + this.dotIndicatorBackgroundColor + ", dotIndicatorBackgroundAlpha=" + this.dotIndicatorBackgroundAlpha + ", initialFrame=" + this.initialFrame + ", initialLoopingFrame=" + this.initialLoopingFrame + ", finalLoopingFrame=" + this.finalLoopingFrame + ")";
    }

    public WelcomeAnimationFrames(int i, int i2, float f, int i3, int i4, int i5) {
        this.backgroundColor = i;
        this.dotIndicatorBackgroundColor = i2;
        this.dotIndicatorBackgroundAlpha = f;
        this.initialFrame = i3;
        this.initialLoopingFrame = i4;
        this.finalLoopingFrame = i5;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getDotIndicatorBackgroundColor() {
        return this.dotIndicatorBackgroundColor;
    }

    public final float getDotIndicatorBackgroundAlpha() {
        return this.dotIndicatorBackgroundAlpha;
    }

    public final int getInitialFrame() {
        return this.initialFrame;
    }

    public final int getInitialLoopingFrame() {
        return this.initialLoopingFrame;
    }

    public final int getFinalLoopingFrame() {
        return this.finalLoopingFrame;
    }
}
