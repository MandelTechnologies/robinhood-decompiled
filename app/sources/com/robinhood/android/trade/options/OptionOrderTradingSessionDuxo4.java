package com.robinhood.android.trade.options;

import com.robinhood.android.equities.tradesettings.TradingSessionViewState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderTradingSessionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderTradingSessionViewState;", "", "<init>", "()V", "Loading", "Loaded", "Lcom/robinhood/android/trade/options/OptionOrderTradingSessionViewState$Loaded;", "Lcom/robinhood/android/trade/options/OptionOrderTradingSessionViewState$Loading;", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.options.OptionOrderTradingSessionViewState, reason: use source file name */
/* loaded from: classes9.dex */
public abstract class OptionOrderTradingSessionDuxo4 {
    public static final int $stable = 0;

    public /* synthetic */ OptionOrderTradingSessionDuxo4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: OptionOrderTradingSessionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderTradingSessionViewState$Loading;", "Lcom/robinhood/android/trade/options/OptionOrderTradingSessionViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.OptionOrderTradingSessionViewState$Loading */
    public static final /* data */ class Loading extends OptionOrderTradingSessionDuxo4 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 318015450;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    private OptionOrderTradingSessionDuxo4() {
    }

    /* compiled from: OptionOrderTradingSessionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderTradingSessionViewState$Loaded;", "Lcom/robinhood/android/trade/options/OptionOrderTradingSessionViewState;", "tradingSessionViewState", "Lcom/robinhood/android/equities/tradesettings/TradingSessionViewState;", "<init>", "(Lcom/robinhood/android/equities/tradesettings/TradingSessionViewState;)V", "getTradingSessionViewState", "()Lcom/robinhood/android/equities/tradesettings/TradingSessionViewState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.OptionOrderTradingSessionViewState$Loaded, reason: from toString */
    public static final /* data */ class Loaded extends OptionOrderTradingSessionDuxo4 {
        public static final int $stable = TradingSessionViewState.$stable;
        private final TradingSessionViewState tradingSessionViewState;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, TradingSessionViewState tradingSessionViewState, int i, Object obj) {
            if ((i & 1) != 0) {
                tradingSessionViewState = loaded.tradingSessionViewState;
            }
            return loaded.copy(tradingSessionViewState);
        }

        /* renamed from: component1, reason: from getter */
        public final TradingSessionViewState getTradingSessionViewState() {
            return this.tradingSessionViewState;
        }

        public final Loaded copy(TradingSessionViewState tradingSessionViewState) {
            Intrinsics.checkNotNullParameter(tradingSessionViewState, "tradingSessionViewState");
            return new Loaded(tradingSessionViewState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.tradingSessionViewState, ((Loaded) other).tradingSessionViewState);
        }

        public int hashCode() {
            return this.tradingSessionViewState.hashCode();
        }

        public String toString() {
            return "Loaded(tradingSessionViewState=" + this.tradingSessionViewState + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(TradingSessionViewState tradingSessionViewState) {
            super(null);
            Intrinsics.checkNotNullParameter(tradingSessionViewState, "tradingSessionViewState");
            this.tradingSessionViewState = tradingSessionViewState;
        }

        public final TradingSessionViewState getTradingSessionViewState() {
            return this.tradingSessionViewState;
        }
    }
}
