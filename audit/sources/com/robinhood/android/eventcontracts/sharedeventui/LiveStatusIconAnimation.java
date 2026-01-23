package com.robinhood.android.eventcontracts.sharedeventui;

import androidx.compose.p011ui.util.MathHelpers;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.Range2;

/* compiled from: LiveStatusIcon.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0007J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J\u0019\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/LiveStatusIconAnimation;", "", "steps", "Landroidx/compose/runtime/State;", "", "<init>", "(Landroidx/compose/runtime/State;)V", "soothingAlpha", "alphaRange", "Lkotlin/ranges/ClosedRange;", "soothingRadius", "radiusRange", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LiveStatusIconAnimation {
    public static final int $stable = 0;
    private final SnapshotState4<Float> steps;

    private final SnapshotState4<Float> component1() {
        return this.steps;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveStatusIconAnimation copy$default(LiveStatusIconAnimation liveStatusIconAnimation, SnapshotState4 snapshotState4, int i, Object obj) {
        if ((i & 1) != 0) {
            snapshotState4 = liveStatusIconAnimation.steps;
        }
        return liveStatusIconAnimation.copy(snapshotState4);
    }

    public final LiveStatusIconAnimation copy(SnapshotState4<Float> steps) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        return new LiveStatusIconAnimation(steps);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LiveStatusIconAnimation) && Intrinsics.areEqual(this.steps, ((LiveStatusIconAnimation) other).steps);
    }

    public int hashCode() {
        return this.steps.hashCode();
    }

    public String toString() {
        return "LiveStatusIconAnimation(steps=" + this.steps + ")";
    }

    public LiveStatusIconAnimation(SnapshotState4<Float> steps) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.steps = steps;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float soothingAlpha$lambda$0(Range2 range2, LiveStatusIconAnimation liveStatusIconAnimation) {
        return MathHelpers.lerp(((Number) range2.getStart()).floatValue(), ((Number) range2.getEndInclusive()).floatValue(), liveStatusIconAnimation.steps.getValue().floatValue());
    }

    public final SnapshotState4<Float> soothingAlpha(final Range2<Float> alphaRange) {
        Intrinsics.checkNotNullParameter(alphaRange, "alphaRange");
        return SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.eventcontracts.sharedeventui.LiveStatusIconAnimation$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(LiveStatusIconAnimation.soothingAlpha$lambda$0(alphaRange, this));
            }
        });
    }

    public final SnapshotState4<Float> soothingRadius(final Range2<Float> radiusRange) {
        Intrinsics.checkNotNullParameter(radiusRange, "radiusRange");
        return SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.eventcontracts.sharedeventui.LiveStatusIconAnimation$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(LiveStatusIconAnimation.soothingRadius$lambda$1(radiusRange, this));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float soothingRadius$lambda$1(Range2 range2, LiveStatusIconAnimation liveStatusIconAnimation) {
        return MathHelpers.lerp(((Number) range2.getStart()).floatValue(), ((Number) range2.getEndInclusive()).floatValue(), liveStatusIconAnimation.steps.getValue().floatValue());
    }
}
