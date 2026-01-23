package com.robinhood.android.trade.options.bidaskbar;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: OptionOrderBidAskBarViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/trade/options/bidaskbar/LimitPriceTickState;", "", "<init>", "()V", "ArrowStart", "ArrowEnd", "None", "TickPosition", "Lcom/robinhood/android/trade/options/bidaskbar/LimitPriceTickState$ArrowEnd;", "Lcom/robinhood/android/trade/options/bidaskbar/LimitPriceTickState$ArrowStart;", "Lcom/robinhood/android/trade/options/bidaskbar/LimitPriceTickState$None;", "Lcom/robinhood/android/trade/options/bidaskbar/LimitPriceTickState$TickPosition;", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.options.bidaskbar.LimitPriceTickState, reason: use source file name */
/* loaded from: classes9.dex */
public abstract class OptionOrderBidAskBarViewState5 {
    public static final int $stable = 0;

    public /* synthetic */ OptionOrderBidAskBarViewState5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OptionOrderBidAskBarViewState5() {
    }

    /* compiled from: OptionOrderBidAskBarViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/trade/options/bidaskbar/LimitPriceTickState$ArrowStart;", "Lcom/robinhood/android/trade/options/bidaskbar/LimitPriceTickState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.bidaskbar.LimitPriceTickState$ArrowStart */
    public static final /* data */ class ArrowStart extends OptionOrderBidAskBarViewState5 {
        public static final int $stable = 0;
        public static final ArrowStart INSTANCE = new ArrowStart();

        public boolean equals(Object other) {
            return this == other || (other instanceof ArrowStart);
        }

        public int hashCode() {
            return -929662138;
        }

        public String toString() {
            return "ArrowStart";
        }

        private ArrowStart() {
            super(null);
        }
    }

    /* compiled from: OptionOrderBidAskBarViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/trade/options/bidaskbar/LimitPriceTickState$ArrowEnd;", "Lcom/robinhood/android/trade/options/bidaskbar/LimitPriceTickState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.bidaskbar.LimitPriceTickState$ArrowEnd */
    public static final /* data */ class ArrowEnd extends OptionOrderBidAskBarViewState5 {
        public static final int $stable = 0;
        public static final ArrowEnd INSTANCE = new ArrowEnd();

        public boolean equals(Object other) {
            return this == other || (other instanceof ArrowEnd);
        }

        public int hashCode() {
            return 378906815;
        }

        public String toString() {
            return "ArrowEnd";
        }

        private ArrowEnd() {
            super(null);
        }
    }

    /* compiled from: OptionOrderBidAskBarViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/trade/options/bidaskbar/LimitPriceTickState$None;", "Lcom/robinhood/android/trade/options/bidaskbar/LimitPriceTickState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.bidaskbar.LimitPriceTickState$None */
    public static final /* data */ class None extends OptionOrderBidAskBarViewState5 {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        public boolean equals(Object other) {
            return this == other || (other instanceof None);
        }

        public int hashCode() {
            return -2026077595;
        }

        public String toString() {
            return "None";
        }

        private None() {
            super(null);
        }
    }

    /* compiled from: OptionOrderBidAskBarViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/trade/options/bidaskbar/LimitPriceTickState$TickPosition;", "Lcom/robinhood/android/trade/options/bidaskbar/LimitPriceTickState;", "percent", "", "<init>", "(F)V", "getPercent", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.bidaskbar.LimitPriceTickState$TickPosition, reason: from toString */
    public static final /* data */ class TickPosition extends OptionOrderBidAskBarViewState5 {
        public static final int $stable = 0;
        private final float percent;

        public static /* synthetic */ TickPosition copy$default(TickPosition tickPosition, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = tickPosition.percent;
            }
            return tickPosition.copy(f);
        }

        /* renamed from: component1, reason: from getter */
        public final float getPercent() {
            return this.percent;
        }

        public final TickPosition copy(float percent) {
            return new TickPosition(percent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TickPosition) && Float.compare(this.percent, ((TickPosition) other).percent) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.percent);
        }

        public String toString() {
            return "TickPosition(percent=" + this.percent + ")";
        }

        public TickPosition(float f) {
            super(null);
            this.percent = f;
        }

        public final float getPercent() {
            return this.percent;
        }
    }
}
