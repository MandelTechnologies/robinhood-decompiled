package com.robinhood.android.trade.options;

import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OrderMarketHours;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderTradingSessionDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderTradingSessionDataState;", "", "tradingSession", "Lcom/robinhood/models/db/OrderMarketHours;", "marketHours", "Lcom/robinhood/models/db/MarketHours;", "shouldShowNewTagOnExtendedHours", "", "<init>", "(Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/MarketHours;Z)V", "getTradingSession", "()Lcom/robinhood/models/db/OrderMarketHours;", "getMarketHours", "()Lcom/robinhood/models/db/MarketHours;", "getShouldShowNewTagOnExtendedHours", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OptionOrderTradingSessionDataState {
    public static final int $stable = 8;
    private final MarketHours marketHours;
    private final boolean shouldShowNewTagOnExtendedHours;
    private final OrderMarketHours tradingSession;

    public OptionOrderTradingSessionDataState() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ OptionOrderTradingSessionDataState copy$default(OptionOrderTradingSessionDataState optionOrderTradingSessionDataState, OrderMarketHours orderMarketHours, MarketHours marketHours, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            orderMarketHours = optionOrderTradingSessionDataState.tradingSession;
        }
        if ((i & 2) != 0) {
            marketHours = optionOrderTradingSessionDataState.marketHours;
        }
        if ((i & 4) != 0) {
            z = optionOrderTradingSessionDataState.shouldShowNewTagOnExtendedHours;
        }
        return optionOrderTradingSessionDataState.copy(orderMarketHours, marketHours, z);
    }

    /* renamed from: component1, reason: from getter */
    public final OrderMarketHours getTradingSession() {
        return this.tradingSession;
    }

    /* renamed from: component2, reason: from getter */
    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShouldShowNewTagOnExtendedHours() {
        return this.shouldShowNewTagOnExtendedHours;
    }

    public final OptionOrderTradingSessionDataState copy(OrderMarketHours tradingSession, MarketHours marketHours, boolean shouldShowNewTagOnExtendedHours) {
        return new OptionOrderTradingSessionDataState(tradingSession, marketHours, shouldShowNewTagOnExtendedHours);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOrderTradingSessionDataState)) {
            return false;
        }
        OptionOrderTradingSessionDataState optionOrderTradingSessionDataState = (OptionOrderTradingSessionDataState) other;
        return this.tradingSession == optionOrderTradingSessionDataState.tradingSession && Intrinsics.areEqual(this.marketHours, optionOrderTradingSessionDataState.marketHours) && this.shouldShowNewTagOnExtendedHours == optionOrderTradingSessionDataState.shouldShowNewTagOnExtendedHours;
    }

    public int hashCode() {
        OrderMarketHours orderMarketHours = this.tradingSession;
        int iHashCode = (orderMarketHours == null ? 0 : orderMarketHours.hashCode()) * 31;
        MarketHours marketHours = this.marketHours;
        return ((iHashCode + (marketHours != null ? marketHours.hashCode() : 0)) * 31) + Boolean.hashCode(this.shouldShowNewTagOnExtendedHours);
    }

    public String toString() {
        return "OptionOrderTradingSessionDataState(tradingSession=" + this.tradingSession + ", marketHours=" + this.marketHours + ", shouldShowNewTagOnExtendedHours=" + this.shouldShowNewTagOnExtendedHours + ")";
    }

    public OptionOrderTradingSessionDataState(OrderMarketHours orderMarketHours, MarketHours marketHours, boolean z) {
        this.tradingSession = orderMarketHours;
        this.marketHours = marketHours;
        this.shouldShowNewTagOnExtendedHours = z;
    }

    public /* synthetic */ OptionOrderTradingSessionDataState(OrderMarketHours orderMarketHours, MarketHours marketHours, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : orderMarketHours, (i & 2) != 0 ? null : marketHours, (i & 4) != 0 ? false : z);
    }

    public final OrderMarketHours getTradingSession() {
        return this.tradingSession;
    }

    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    public final boolean getShouldShowNewTagOnExtendedHours() {
        return this.shouldShowNewTagOnExtendedHours;
    }
}
