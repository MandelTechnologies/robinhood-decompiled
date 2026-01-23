package com.robinhood.android.eventcontracts.sharedeventui.animation;

import android.annotation.SuppressLint;
import androidx.compose.p011ui.util.MathHelpers;
import com.robinhood.android.lib.formats.Formats;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: MovingDeltasAnimation.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00112\b\b\u0003\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0016J\u001a\u0010 \u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0018R\u0017\u0010&\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001dR\u0017\u0010)\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/animation/Delta;", "", "", "signedValue", "j$/time/Instant", "timeCalculated", "<init>", "(ILj$/time/Instant;)V", "now", "", "elapsedTime", "(Lj$/time/Instant;)J", "", "progress", "(Lj$/time/Instant;)F", "alpha", "(F)F", "", "isComplete", "(Lj$/time/Instant;)Z", "passedDelay", "component1", "()I", "component2", "()Lj$/time/Instant;", "copy", "(ILj$/time/Instant;)Lcom/robinhood/android/eventcontracts/sharedeventui/animation/Delta;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getSignedValue", "Lj$/time/Instant;", "getTimeCalculated", "value", "Ljava/lang/String;", "getValue", "isPositive", "Z", "()Z", "Companion", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"NowWithoutClock"})
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class Delta {
    public static final int $stable = 0;
    private static final float ALPHA_PROGRESS_BREAKPOINT = 0.3f;
    private static final float ALPHA_PROGRESS_SECOND_HALF = 0.7f;
    private static final long DELTA_VISIBLE_TIME = 500;
    private final boolean isPositive;
    private final int signedValue;
    private final Instant timeCalculated;
    private final String value;

    public static /* synthetic */ Delta copy$default(Delta delta, int i, Instant instant, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = delta.signedValue;
        }
        if ((i2 & 2) != 0) {
            instant = delta.timeCalculated;
        }
        return delta.copy(i, instant);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSignedValue() {
        return this.signedValue;
    }

    /* renamed from: component2, reason: from getter */
    public final Instant getTimeCalculated() {
        return this.timeCalculated;
    }

    public final Delta copy(int signedValue, Instant timeCalculated) {
        Intrinsics.checkNotNullParameter(timeCalculated, "timeCalculated");
        return new Delta(signedValue, timeCalculated);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Delta)) {
            return false;
        }
        Delta delta = (Delta) other;
        return this.signedValue == delta.signedValue && Intrinsics.areEqual(this.timeCalculated, delta.timeCalculated);
    }

    public int hashCode() {
        return (Integer.hashCode(this.signedValue) * 31) + this.timeCalculated.hashCode();
    }

    public String toString() {
        return "Delta(signedValue=" + this.signedValue + ", timeCalculated=" + this.timeCalculated + ")";
    }

    public Delta(int i, Instant timeCalculated) {
        Intrinsics.checkNotNullParameter(timeCalculated, "timeCalculated");
        this.signedValue = i;
        this.timeCalculated = timeCalculated;
        this.value = Formats.getIntegerDeltaFormat().format(Integer.valueOf(i));
        this.isPositive = i > 0;
    }

    public final int getSignedValue() {
        return this.signedValue;
    }

    public /* synthetic */ Delta(int i, Instant instant, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? Instant.now() : instant);
    }

    public final Instant getTimeCalculated() {
        return this.timeCalculated;
    }

    public final String getValue() {
        return this.value;
    }

    /* renamed from: isPositive, reason: from getter */
    public final boolean getIsPositive() {
        return this.isPositive;
    }

    public static /* synthetic */ float progress$default(Delta delta, Instant instant, int i, Object obj) {
        if ((i & 1) != 0) {
            instant = Instant.now();
        }
        return delta.progress(instant);
    }

    public final float progress(Instant now) {
        Intrinsics.checkNotNullParameter(now, "now");
        return RangesKt.coerceIn(elapsedTime(now) / 3000.0f, 0.0f, 1.0f);
    }

    public final float alpha(float progress) {
        if (progress < 0.3f) {
            return MathHelpers.lerp(0.25f, 1.0f, progress / 0.3f);
        }
        return MathHelpers.lerp(1.0f, 0.0f, (progress - 0.3f) / ALPHA_PROGRESS_SECOND_HALF);
    }

    public static /* synthetic */ boolean isComplete$default(Delta delta, Instant instant, int i, Object obj) {
        if ((i & 1) != 0) {
            instant = Instant.now();
        }
        return delta.isComplete(instant);
    }

    public final boolean isComplete(Instant now) {
        Intrinsics.checkNotNullParameter(now, "now");
        return ((float) elapsedTime(now)) >= 3000.0f;
    }

    public static /* synthetic */ boolean passedDelay$default(Delta delta, Instant instant, int i, Object obj) {
        if ((i & 1) != 0) {
            instant = Instant.now();
        }
        return delta.passedDelay(instant);
    }

    public final boolean passedDelay(@SuppressLint({"NowWithoutClock"}) Instant now) {
        Intrinsics.checkNotNullParameter(now, "now");
        return elapsedTime(now) > 500;
    }

    static /* synthetic */ long elapsedTime$default(Delta delta, Instant instant, int i, Object obj) {
        if ((i & 1) != 0) {
            instant = Instant.now();
        }
        return delta.elapsedTime(instant);
    }

    private final long elapsedTime(Instant now) {
        Duration durationBetween = Duration.between(this.timeCalculated, now);
        Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
        return durationBetween.toMillis();
    }
}
