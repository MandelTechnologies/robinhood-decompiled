package com.robinhood.android.futures.trade.p147ui.ladder;

import com.robinhood.android.futures.trade.p147ui.ladder.AnimationType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnimatedPendingOrderPillStack.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J5\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/StackStateTracker;", "", "lastPillStackState", "Lcom/robinhood/android/futures/trade/ui/ladder/PillStackState;", "currentPillStackState", "isAnimating", "", "progress", "", "<init>", "(Lcom/robinhood/android/futures/trade/ui/ladder/PillStackState;Lcom/robinhood/android/futures/trade/ui/ladder/PillStackState;ZF)V", "getLastPillStackState", "()Lcom/robinhood/android/futures/trade/ui/ladder/PillStackState;", "getCurrentPillStackState", "()Z", "getProgress", "()F", "animationType", "Lcom/robinhood/android/futures/trade/ui/ladder/AnimationType;", "getAnimationType", "()Lcom/robinhood/android/futures/trade/ui/ladder/AnimationType;", "next", "newState", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class StackStateTracker {
    public static final int $stable = 0;
    private final AnimationType animationType;
    private final PillStackState currentPillStackState;
    private final boolean isAnimating;
    private final PillStackState lastPillStackState;
    private final float progress;

    public static /* synthetic */ StackStateTracker copy$default(StackStateTracker stackStateTracker, PillStackState pillStackState, PillStackState pillStackState2, boolean z, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            pillStackState = stackStateTracker.lastPillStackState;
        }
        if ((i & 2) != 0) {
            pillStackState2 = stackStateTracker.currentPillStackState;
        }
        if ((i & 4) != 0) {
            z = stackStateTracker.isAnimating;
        }
        if ((i & 8) != 0) {
            f = stackStateTracker.progress;
        }
        return stackStateTracker.copy(pillStackState, pillStackState2, z, f);
    }

    /* renamed from: component1, reason: from getter */
    public final PillStackState getLastPillStackState() {
        return this.lastPillStackState;
    }

    /* renamed from: component2, reason: from getter */
    public final PillStackState getCurrentPillStackState() {
        return this.currentPillStackState;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsAnimating() {
        return this.isAnimating;
    }

    /* renamed from: component4, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    public final StackStateTracker copy(PillStackState lastPillStackState, PillStackState currentPillStackState, boolean isAnimating, float progress) {
        return new StackStateTracker(lastPillStackState, currentPillStackState, isAnimating, progress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StackStateTracker)) {
            return false;
        }
        StackStateTracker stackStateTracker = (StackStateTracker) other;
        return Intrinsics.areEqual(this.lastPillStackState, stackStateTracker.lastPillStackState) && Intrinsics.areEqual(this.currentPillStackState, stackStateTracker.currentPillStackState) && this.isAnimating == stackStateTracker.isAnimating && Float.compare(this.progress, stackStateTracker.progress) == 0;
    }

    public int hashCode() {
        PillStackState pillStackState = this.lastPillStackState;
        int iHashCode = (pillStackState == null ? 0 : pillStackState.hashCode()) * 31;
        PillStackState pillStackState2 = this.currentPillStackState;
        return ((((iHashCode + (pillStackState2 != null ? pillStackState2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isAnimating)) * 31) + Float.hashCode(this.progress);
    }

    public String toString() {
        return "StackStateTracker(lastPillStackState=" + this.lastPillStackState + ", currentPillStackState=" + this.currentPillStackState + ", isAnimating=" + this.isAnimating + ", progress=" + this.progress + ")";
    }

    public StackStateTracker(PillStackState pillStackState, PillStackState pillStackState2, boolean z, float f) {
        this.lastPillStackState = pillStackState;
        this.currentPillStackState = pillStackState2;
        this.isAnimating = z;
        this.progress = f;
        AnimationType moveIn = null;
        moveIn = null;
        if (pillStackState2 != null) {
            if (pillStackState2.isTransitioningFromGroupedToSinglePillSelectionState(pillStackState)) {
                moveIn = AnimationType.Split.INSTANCE;
            } else if (pillStackState2.m2028xe74f6289(pillStackState)) {
                moveIn = AnimationType.MoveOut.INSTANCE;
            } else if (pillStackState2.isTransitioningFromSinglePillSelectionToGroupedState(pillStackState)) {
                moveIn = AnimationType.Group.INSTANCE;
            } else if (pillStackState2.isPushingNewPillToTopWhenThereAreTwoOrMoreOrdersInStack(pillStackState)) {
                moveIn = AnimationType.Shuffle.INSTANCE;
            } else if (pillStackState2.isPushingNewPillToTopButOnlyOnePillIsVisibleInStack(pillStackState)) {
                moveIn = new AnimationType.MoveIn((pillStackState != null ? pillStackState.getSelectedIndex() : null) != null);
            } else if (pillStackState2.isDraggingToDeleteAndOnlyBottomPillShouldShowUp()) {
                moveIn = AnimationType.DragDeleteInProgress.INSTANCE;
            }
        }
        this.animationType = moveIn;
    }

    public final PillStackState getLastPillStackState() {
        return this.lastPillStackState;
    }

    public final PillStackState getCurrentPillStackState() {
        return this.currentPillStackState;
    }

    public final boolean isAnimating() {
        return this.isAnimating;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final AnimationType getAnimationType() {
        return this.animationType;
    }

    public final StackStateTracker next(PillStackState newState) {
        return Intrinsics.areEqual(this.currentPillStackState, newState) ? this : copy$default(this, this.currentPillStackState, newState, false, 0.0f, 12, null);
    }
}
