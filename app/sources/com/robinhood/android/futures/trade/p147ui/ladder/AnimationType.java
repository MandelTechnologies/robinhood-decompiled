package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AnimatedPendingOrderPillStack.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\t\n\u000b\f\r\u000eB\u0019\b\u0004\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0006\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/AnimationType;", "", "tweenSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "<init>", "(Landroidx/compose/animation/core/TweenSpec;)V", "getTweenSpec", "()Landroidx/compose/animation/core/TweenSpec;", "Shuffle", "Split", "Group", "MoveIn", "MoveOut", "DragDeleteInProgress", "Lcom/robinhood/android/futures/trade/ui/ladder/AnimationType$DragDeleteInProgress;", "Lcom/robinhood/android/futures/trade/ui/ladder/AnimationType$Group;", "Lcom/robinhood/android/futures/trade/ui/ladder/AnimationType$MoveIn;", "Lcom/robinhood/android/futures/trade/ui/ladder/AnimationType$MoveOut;", "Lcom/robinhood/android/futures/trade/ui/ladder/AnimationType$Shuffle;", "Lcom/robinhood/android/futures/trade/ui/ladder/AnimationType$Split;", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class AnimationType {
    public static final int $stable = 0;
    private final TweenSpec<Float> tweenSpec;

    public /* synthetic */ AnimationType(TweenSpec tweenSpec, DefaultConstructorMarker defaultConstructorMarker) {
        this(tweenSpec);
    }

    private AnimationType(TweenSpec<Float> tweenSpec) {
        this.tweenSpec = tweenSpec;
    }

    public final TweenSpec<Float> getTweenSpec() {
        return this.tweenSpec;
    }

    /* compiled from: AnimatedPendingOrderPillStack.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/AnimationType$Shuffle;", "Lcom/robinhood/android/futures/trade/ui/ladder/AnimationType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Shuffle extends AnimationType {
        public static final int $stable = 0;
        public static final Shuffle INSTANCE = new Shuffle();

        public boolean equals(Object other) {
            return this == other || (other instanceof Shuffle);
        }

        public int hashCode() {
            return 35164475;
        }

        public String toString() {
            return "Shuffle";
        }

        private Shuffle() {
            super(AnimationSpecKt.tween$default(500, 0, AnimatedPendingOrderPillStackKt.pillShuffleEasing, 2, null), null);
        }
    }

    /* compiled from: AnimatedPendingOrderPillStack.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/AnimationType$Split;", "Lcom/robinhood/android/futures/trade/ui/ladder/AnimationType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Split extends AnimationType {
        public static final int $stable = 0;
        public static final Split INSTANCE = new Split();

        public boolean equals(Object other) {
            return this == other || (other instanceof Split);
        }

        public int hashCode() {
            return 2056130012;
        }

        public String toString() {
            return "Split";
        }

        private Split() {
            super(AnimationSpecKt.tween$default(200, 0, AnimatedPendingOrderPillStackKt.pillShuffleEasing, 2, null), null);
        }
    }

    /* compiled from: AnimatedPendingOrderPillStack.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/AnimationType$Group;", "Lcom/robinhood/android/futures/trade/ui/ladder/AnimationType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Group extends AnimationType {
        public static final int $stable = 0;
        public static final Group INSTANCE = new Group();

        public boolean equals(Object other) {
            return this == other || (other instanceof Group);
        }

        public int hashCode() {
            return 2045110593;
        }

        public String toString() {
            return "Group";
        }

        private Group() {
            super(AnimationSpecKt.tween$default(200, 0, AnimatedPendingOrderPillStackKt.pillShuffleEasing, 2, null), null);
        }
    }

    /* compiled from: AnimatedPendingOrderPillStack.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/AnimationType$MoveIn;", "Lcom/robinhood/android/futures/trade/ui/ladder/AnimationType;", "isInSplitState", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MoveIn extends AnimationType {
        public static final int $stable = 0;
        private final boolean isInSplitState;

        public static /* synthetic */ MoveIn copy$default(MoveIn moveIn, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = moveIn.isInSplitState;
            }
            return moveIn.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsInSplitState() {
            return this.isInSplitState;
        }

        public final MoveIn copy(boolean isInSplitState) {
            return new MoveIn(isInSplitState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MoveIn) && this.isInSplitState == ((MoveIn) other).isInSplitState;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isInSplitState);
        }

        public String toString() {
            return "MoveIn(isInSplitState=" + this.isInSplitState + ")";
        }

        public final boolean isInSplitState() {
            return this.isInSplitState;
        }

        public MoveIn(boolean z) {
            super(AnimationSpecKt.tween$default(300, 0, AnimatedPendingOrderPillStackKt.pillMoveInOutEasing, 2, null), null);
            this.isInSplitState = z;
        }
    }

    /* compiled from: AnimatedPendingOrderPillStack.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/AnimationType$MoveOut;", "Lcom/robinhood/android/futures/trade/ui/ladder/AnimationType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MoveOut extends AnimationType {
        public static final int $stable = 0;
        public static final MoveOut INSTANCE = new MoveOut();

        public boolean equals(Object other) {
            return this == other || (other instanceof MoveOut);
        }

        public int hashCode() {
            return -793614337;
        }

        public String toString() {
            return "MoveOut";
        }

        private MoveOut() {
            super(AnimationSpecKt.tween$default(300, 0, AnimatedPendingOrderPillStackKt.pillMoveInOutEasing, 2, null), null);
        }
    }

    /* compiled from: AnimatedPendingOrderPillStack.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/AnimationType$DragDeleteInProgress;", "Lcom/robinhood/android/futures/trade/ui/ladder/AnimationType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DragDeleteInProgress extends AnimationType {
        public static final int $stable = 0;
        public static final DragDeleteInProgress INSTANCE = new DragDeleteInProgress();

        public boolean equals(Object other) {
            return this == other || (other instanceof DragDeleteInProgress);
        }

        public int hashCode() {
            return 2068660431;
        }

        public String toString() {
            return "DragDeleteInProgress";
        }

        /* JADX WARN: Multi-variable type inference failed */
        private DragDeleteInProgress() {
            super(null, 0 == true ? 1 : 0);
        }
    }
}
