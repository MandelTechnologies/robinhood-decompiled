package com.robinhood.android.search.highlights.p249ui.sportherocarousel.delta;

import androidx.compose.p011ui.util.MathHelpers;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: FloatingOpenInterestDelta.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00132\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/sportherocarousel/delta/FloatingOpenInterestDelta;", "", "Ljava/math/BigDecimal;", "value", "j$/time/Instant", "timeCalculated", "<init>", "(Ljava/math/BigDecimal;Lj$/time/Instant;)V", "now", "", "elapsedTime", "(Lj$/time/Instant;)J", "", "progress", "(Lj$/time/Instant;)F", "startAlpha", "endAlpha", "alpha", "(FFF)F", "", "isComplete", "(Lj$/time/Instant;)Z", "component1", "()Ljava/math/BigDecimal;", "component2", "()Lj$/time/Instant;", "copy", "(Ljava/math/BigDecimal;Lj$/time/Instant;)Lcom/robinhood/android/search/highlights/ui/sportherocarousel/delta/FloatingOpenInterestDelta;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/math/BigDecimal;", "getValue", "Lj$/time/Instant;", "getTimeCalculated", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final /* data */ class FloatingOpenInterestDelta {
    public static final int $stable = 8;
    private final Instant timeCalculated;
    private final BigDecimal value;

    public static /* synthetic */ FloatingOpenInterestDelta copy$default(FloatingOpenInterestDelta floatingOpenInterestDelta, BigDecimal bigDecimal, Instant instant, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = floatingOpenInterestDelta.value;
        }
        if ((i & 2) != 0) {
            instant = floatingOpenInterestDelta.timeCalculated;
        }
        return floatingOpenInterestDelta.copy(bigDecimal, instant);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final Instant getTimeCalculated() {
        return this.timeCalculated;
    }

    public final FloatingOpenInterestDelta copy(BigDecimal value, Instant timeCalculated) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(timeCalculated, "timeCalculated");
        return new FloatingOpenInterestDelta(value, timeCalculated);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FloatingOpenInterestDelta)) {
            return false;
        }
        FloatingOpenInterestDelta floatingOpenInterestDelta = (FloatingOpenInterestDelta) other;
        return Intrinsics.areEqual(this.value, floatingOpenInterestDelta.value) && Intrinsics.areEqual(this.timeCalculated, floatingOpenInterestDelta.timeCalculated);
    }

    public int hashCode() {
        return (this.value.hashCode() * 31) + this.timeCalculated.hashCode();
    }

    public String toString() {
        return "FloatingOpenInterestDelta(value=" + this.value + ", timeCalculated=" + this.timeCalculated + ")";
    }

    public FloatingOpenInterestDelta(BigDecimal value, Instant timeCalculated) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(timeCalculated, "timeCalculated");
        this.value = value;
        this.timeCalculated = timeCalculated;
    }

    public final BigDecimal getValue() {
        return this.value;
    }

    public final Instant getTimeCalculated() {
        return this.timeCalculated;
    }

    public final float progress(Instant now) {
        Intrinsics.checkNotNullParameter(now, "now");
        return RangesKt.coerceIn(elapsedTime(now) / 3000.0f, 0.0f, 1.0f);
    }

    public static /* synthetic */ float alpha$default(FloatingOpenInterestDelta floatingOpenInterestDelta, float f, float f2, float f3, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.25f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        return floatingOpenInterestDelta.alpha(f, f2, f3);
    }

    public final float alpha(float progress, float startAlpha, float endAlpha) {
        if (progress < 0.3f) {
            return MathHelpers.lerp(startAlpha, 1.0f, progress / 0.3f);
        }
        return MathHelpers.lerp(1.0f, endAlpha, (progress - 0.3f) / 0.7f);
    }

    public final boolean isComplete(Instant now) {
        Intrinsics.checkNotNullParameter(now, "now");
        return ((float) elapsedTime(now)) >= 3000.0f;
    }

    private final long elapsedTime(Instant now) {
        Duration durationBetween = Duration.between(this.timeCalculated, now);
        Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
        return durationBetween.toMillis();
    }
}
