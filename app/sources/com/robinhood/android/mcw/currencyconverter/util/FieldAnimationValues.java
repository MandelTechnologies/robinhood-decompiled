package com.robinhood.android.mcw.currencyconverter.util;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVectors2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Animations.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BW\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003Ja\u0010\u0014\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/mcw/currencyconverter/util/FieldAnimationValues;", "", "fromAlpha", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "fromYOffsetPx", "toAlpha", "toYOffsetPx", "<init>", "(Landroidx/compose/animation/core/Animatable;Landroidx/compose/animation/core/Animatable;Landroidx/compose/animation/core/Animatable;Landroidx/compose/animation/core/Animatable;)V", "getFromAlpha", "()Landroidx/compose/animation/core/Animatable;", "getFromYOffsetPx", "getToAlpha", "getToYOffsetPx", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-mcw-currency-converter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class FieldAnimationValues {
    public static final int $stable = Animatable.$stable;
    private final Animatable<Float, AnimationVectors2> fromAlpha;
    private final Animatable<Float, AnimationVectors2> fromYOffsetPx;
    private final Animatable<Float, AnimationVectors2> toAlpha;
    private final Animatable<Float, AnimationVectors2> toYOffsetPx;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FieldAnimationValues copy$default(FieldAnimationValues fieldAnimationValues, Animatable animatable, Animatable animatable2, Animatable animatable3, Animatable animatable4, int i, Object obj) {
        if ((i & 1) != 0) {
            animatable = fieldAnimationValues.fromAlpha;
        }
        if ((i & 2) != 0) {
            animatable2 = fieldAnimationValues.fromYOffsetPx;
        }
        if ((i & 4) != 0) {
            animatable3 = fieldAnimationValues.toAlpha;
        }
        if ((i & 8) != 0) {
            animatable4 = fieldAnimationValues.toYOffsetPx;
        }
        return fieldAnimationValues.copy(animatable, animatable2, animatable3, animatable4);
    }

    public final Animatable<Float, AnimationVectors2> component1() {
        return this.fromAlpha;
    }

    public final Animatable<Float, AnimationVectors2> component2() {
        return this.fromYOffsetPx;
    }

    public final Animatable<Float, AnimationVectors2> component3() {
        return this.toAlpha;
    }

    public final Animatable<Float, AnimationVectors2> component4() {
        return this.toYOffsetPx;
    }

    public final FieldAnimationValues copy(Animatable<Float, AnimationVectors2> fromAlpha, Animatable<Float, AnimationVectors2> fromYOffsetPx, Animatable<Float, AnimationVectors2> toAlpha, Animatable<Float, AnimationVectors2> toYOffsetPx) {
        Intrinsics.checkNotNullParameter(fromAlpha, "fromAlpha");
        Intrinsics.checkNotNullParameter(fromYOffsetPx, "fromYOffsetPx");
        Intrinsics.checkNotNullParameter(toAlpha, "toAlpha");
        Intrinsics.checkNotNullParameter(toYOffsetPx, "toYOffsetPx");
        return new FieldAnimationValues(fromAlpha, fromYOffsetPx, toAlpha, toYOffsetPx);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FieldAnimationValues)) {
            return false;
        }
        FieldAnimationValues fieldAnimationValues = (FieldAnimationValues) other;
        return Intrinsics.areEqual(this.fromAlpha, fieldAnimationValues.fromAlpha) && Intrinsics.areEqual(this.fromYOffsetPx, fieldAnimationValues.fromYOffsetPx) && Intrinsics.areEqual(this.toAlpha, fieldAnimationValues.toAlpha) && Intrinsics.areEqual(this.toYOffsetPx, fieldAnimationValues.toYOffsetPx);
    }

    public int hashCode() {
        return (((((this.fromAlpha.hashCode() * 31) + this.fromYOffsetPx.hashCode()) * 31) + this.toAlpha.hashCode()) * 31) + this.toYOffsetPx.hashCode();
    }

    public String toString() {
        return "FieldAnimationValues(fromAlpha=" + this.fromAlpha + ", fromYOffsetPx=" + this.fromYOffsetPx + ", toAlpha=" + this.toAlpha + ", toYOffsetPx=" + this.toYOffsetPx + ")";
    }

    public FieldAnimationValues(Animatable<Float, AnimationVectors2> fromAlpha, Animatable<Float, AnimationVectors2> fromYOffsetPx, Animatable<Float, AnimationVectors2> toAlpha, Animatable<Float, AnimationVectors2> toYOffsetPx) {
        Intrinsics.checkNotNullParameter(fromAlpha, "fromAlpha");
        Intrinsics.checkNotNullParameter(fromYOffsetPx, "fromYOffsetPx");
        Intrinsics.checkNotNullParameter(toAlpha, "toAlpha");
        Intrinsics.checkNotNullParameter(toYOffsetPx, "toYOffsetPx");
        this.fromAlpha = fromAlpha;
        this.fromYOffsetPx = fromYOffsetPx;
        this.toAlpha = toAlpha;
        this.toYOffsetPx = toYOffsetPx;
    }

    public final Animatable<Float, AnimationVectors2> getFromAlpha() {
        return this.fromAlpha;
    }

    public final Animatable<Float, AnimationVectors2> getFromYOffsetPx() {
        return this.fromYOffsetPx;
    }

    public final Animatable<Float, AnimationVectors2> getToAlpha() {
        return this.toAlpha;
    }

    public final Animatable<Float, AnimationVectors2> getToYOffsetPx() {
        return this.toYOffsetPx;
    }
}
