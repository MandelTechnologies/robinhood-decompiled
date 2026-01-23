package com.robinhood.android.mcw.currencyconverter.util;

import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Animations.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/mcw/currencyconverter/util/IconFlipAnimationValues;", "", "isFlipped", "Landroidx/compose/runtime/MutableState;", "", "rotationX", "Landroidx/compose/runtime/State;", "", "<init>", "(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/State;)V", "()Landroidx/compose/runtime/MutableState;", "getRotationX", "()Landroidx/compose/runtime/State;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-mcw-currency-converter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class IconFlipAnimationValues {
    public static final int $stable = 0;
    private final SnapshotState<Boolean> isFlipped;
    private final SnapshotState4<Float> rotationX;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IconFlipAnimationValues copy$default(IconFlipAnimationValues iconFlipAnimationValues, SnapshotState snapshotState, SnapshotState4 snapshotState4, int i, Object obj) {
        if ((i & 1) != 0) {
            snapshotState = iconFlipAnimationValues.isFlipped;
        }
        if ((i & 2) != 0) {
            snapshotState4 = iconFlipAnimationValues.rotationX;
        }
        return iconFlipAnimationValues.copy(snapshotState, snapshotState4);
    }

    public final SnapshotState<Boolean> component1() {
        return this.isFlipped;
    }

    public final SnapshotState4<Float> component2() {
        return this.rotationX;
    }

    public final IconFlipAnimationValues copy(SnapshotState<Boolean> isFlipped, SnapshotState4<Float> rotationX) {
        Intrinsics.checkNotNullParameter(isFlipped, "isFlipped");
        Intrinsics.checkNotNullParameter(rotationX, "rotationX");
        return new IconFlipAnimationValues(isFlipped, rotationX);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconFlipAnimationValues)) {
            return false;
        }
        IconFlipAnimationValues iconFlipAnimationValues = (IconFlipAnimationValues) other;
        return Intrinsics.areEqual(this.isFlipped, iconFlipAnimationValues.isFlipped) && Intrinsics.areEqual(this.rotationX, iconFlipAnimationValues.rotationX);
    }

    public int hashCode() {
        return (this.isFlipped.hashCode() * 31) + this.rotationX.hashCode();
    }

    public String toString() {
        return "IconFlipAnimationValues(isFlipped=" + this.isFlipped + ", rotationX=" + this.rotationX + ")";
    }

    public IconFlipAnimationValues(SnapshotState<Boolean> isFlipped, SnapshotState4<Float> rotationX) {
        Intrinsics.checkNotNullParameter(isFlipped, "isFlipped");
        Intrinsics.checkNotNullParameter(rotationX, "rotationX");
        this.isFlipped = isFlipped;
        this.rotationX = rotationX;
    }

    public final SnapshotState<Boolean> isFlipped() {
        return this.isFlipped;
    }

    public final SnapshotState4<Float> getRotationX() {
        return this.rotationX;
    }
}
