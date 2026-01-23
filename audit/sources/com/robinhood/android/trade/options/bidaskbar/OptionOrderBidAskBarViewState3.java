package com.robinhood.android.trade.options.bidaskbar;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: OptionOrderBidAskBarViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/trade/options/bidaskbar/BidAskBarMotionEvent;", "", "<init>", "()V", "isTouching", "", "Down", "Move", "Up", "Other", "Lcom/robinhood/android/trade/options/bidaskbar/BidAskBarMotionEvent$Down;", "Lcom/robinhood/android/trade/options/bidaskbar/BidAskBarMotionEvent$Move;", "Lcom/robinhood/android/trade/options/bidaskbar/BidAskBarMotionEvent$Other;", "Lcom/robinhood/android/trade/options/bidaskbar/BidAskBarMotionEvent$Up;", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.options.bidaskbar.BidAskBarMotionEvent, reason: use source file name */
/* loaded from: classes9.dex */
public abstract class OptionOrderBidAskBarViewState3 {
    public static final int $stable = 0;

    public /* synthetic */ OptionOrderBidAskBarViewState3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: OptionOrderBidAskBarViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/trade/options/bidaskbar/BidAskBarMotionEvent$Down;", "Lcom/robinhood/android/trade/options/bidaskbar/BidAskBarMotionEvent;", "x", "", "<init>", "(F)V", "getX", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.bidaskbar.BidAskBarMotionEvent$Down, reason: from toString */
    public static final /* data */ class Down extends OptionOrderBidAskBarViewState3 {
        public static final int $stable = 0;
        private final float x;

        public static /* synthetic */ Down copy$default(Down down, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = down.x;
            }
            return down.copy(f);
        }

        /* renamed from: component1, reason: from getter */
        public final float getX() {
            return this.x;
        }

        public final Down copy(float x) {
            return new Down(x);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Down) && Float.compare(this.x, ((Down) other).x) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.x);
        }

        public String toString() {
            return "Down(x=" + this.x + ")";
        }

        public Down(float f) {
            super(null);
            this.x = f;
        }

        public final float getX() {
            return this.x;
        }
    }

    private OptionOrderBidAskBarViewState3() {
    }

    /* compiled from: OptionOrderBidAskBarViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/trade/options/bidaskbar/BidAskBarMotionEvent$Move;", "Lcom/robinhood/android/trade/options/bidaskbar/BidAskBarMotionEvent;", "x", "", "<init>", "(F)V", "getX", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.bidaskbar.BidAskBarMotionEvent$Move, reason: from toString */
    public static final /* data */ class Move extends OptionOrderBidAskBarViewState3 {
        public static final int $stable = 0;
        private final float x;

        public static /* synthetic */ Move copy$default(Move move, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = move.x;
            }
            return move.copy(f);
        }

        /* renamed from: component1, reason: from getter */
        public final float getX() {
            return this.x;
        }

        public final Move copy(float x) {
            return new Move(x);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Move) && Float.compare(this.x, ((Move) other).x) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.x);
        }

        public String toString() {
            return "Move(x=" + this.x + ")";
        }

        public Move(float f) {
            super(null);
            this.x = f;
        }

        public final float getX() {
            return this.x;
        }
    }

    /* compiled from: OptionOrderBidAskBarViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/trade/options/bidaskbar/BidAskBarMotionEvent$Up;", "Lcom/robinhood/android/trade/options/bidaskbar/BidAskBarMotionEvent;", "x", "", "<init>", "(F)V", "getX", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.bidaskbar.BidAskBarMotionEvent$Up, reason: from toString */
    public static final /* data */ class Up extends OptionOrderBidAskBarViewState3 {
        public static final int $stable = 0;
        private final float x;

        public static /* synthetic */ Up copy$default(Up up, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = up.x;
            }
            return up.copy(f);
        }

        /* renamed from: component1, reason: from getter */
        public final float getX() {
            return this.x;
        }

        public final Up copy(float x) {
            return new Up(x);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Up) && Float.compare(this.x, ((Up) other).x) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.x);
        }

        public String toString() {
            return "Up(x=" + this.x + ")";
        }

        public Up(float f) {
            super(null);
            this.x = f;
        }

        public final float getX() {
            return this.x;
        }
    }

    /* compiled from: OptionOrderBidAskBarViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/trade/options/bidaskbar/BidAskBarMotionEvent$Other;", "Lcom/robinhood/android/trade/options/bidaskbar/BidAskBarMotionEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.bidaskbar.BidAskBarMotionEvent$Other */
    public static final /* data */ class Other extends OptionOrderBidAskBarViewState3 {
        public static final int $stable = 0;
        public static final Other INSTANCE = new Other();

        public boolean equals(Object other) {
            return this == other || (other instanceof Other);
        }

        public int hashCode() {
            return 1874880180;
        }

        public String toString() {
            return "Other";
        }

        private Other() {
            super(null);
        }
    }

    public final boolean isTouching() {
        return (this instanceof Down) || (this instanceof Move);
    }
}
