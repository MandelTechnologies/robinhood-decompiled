package com.robinhood.shared.ticker.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TickerTextAnimationState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/ticker/internal/AnimatedTextState;", "", "previous", "", "current", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPrevious", "()Ljava/lang/String;", "getCurrent", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-ticker-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AnimatedTextState {
    public static final int $stable = 0;
    private final String current;
    private final String previous;

    public static /* synthetic */ AnimatedTextState copy$default(AnimatedTextState animatedTextState, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = animatedTextState.previous;
        }
        if ((i & 2) != 0) {
            str2 = animatedTextState.current;
        }
        return animatedTextState.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPrevious() {
        return this.previous;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCurrent() {
        return this.current;
    }

    public final AnimatedTextState copy(String previous, String current) {
        Intrinsics.checkNotNullParameter(current, "current");
        return new AnimatedTextState(previous, current);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimatedTextState)) {
            return false;
        }
        AnimatedTextState animatedTextState = (AnimatedTextState) other;
        return Intrinsics.areEqual(this.previous, animatedTextState.previous) && Intrinsics.areEqual(this.current, animatedTextState.current);
    }

    public int hashCode() {
        String str = this.previous;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.current.hashCode();
    }

    public String toString() {
        return "AnimatedTextState(previous=" + this.previous + ", current=" + this.current + ")";
    }

    public AnimatedTextState(String str, String current) {
        Intrinsics.checkNotNullParameter(current, "current");
        this.previous = str;
        this.current = current;
    }

    public final String getPrevious() {
        return this.previous;
    }

    public final String getCurrent() {
        return this.current;
    }
}
