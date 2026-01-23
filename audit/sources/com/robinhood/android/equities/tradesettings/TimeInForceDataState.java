package com.robinhood.android.equities.tradesettings;

import com.robinhood.android.equities.tradesettings.p120ui.SelectionRowState;
import com.robinhood.android.equities.tradesettings.utils.TimeInForceUtils;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: TimeInForceDataState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003JE\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00180\u00178F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/TimeInForceDataState;", "", "orderTimeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "orderTradingSession", "Lcom/robinhood/models/db/OrderMarketHours;", "marketHours", "Lcom/robinhood/models/db/MarketHours;", "nextMarketHours", "brokebackOrderExpireDateString", "", "<init>", "(Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/db/MarketHours;Ljava/lang/String;)V", "getOrderTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getOrderTradingSession", "()Lcom/robinhood/models/db/OrderMarketHours;", "getMarketHours", "()Lcom/robinhood/models/db/MarketHours;", "getNextMarketHours", "getBrokebackOrderExpireDateString", "()Ljava/lang/String;", "selectionOptions", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/equities/tradesettings/ui/SelectionRowState;", "getSelectionOptions", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TimeInForceDataState {
    public static final int $stable = 8;
    private final String brokebackOrderExpireDateString;
    private final MarketHours marketHours;
    private final MarketHours nextMarketHours;
    private final OrderTimeInForce orderTimeInForce;
    private final OrderMarketHours orderTradingSession;

    public TimeInForceDataState() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ TimeInForceDataState copy$default(TimeInForceDataState timeInForceDataState, OrderTimeInForce orderTimeInForce, OrderMarketHours orderMarketHours, MarketHours marketHours, MarketHours marketHours2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            orderTimeInForce = timeInForceDataState.orderTimeInForce;
        }
        if ((i & 2) != 0) {
            orderMarketHours = timeInForceDataState.orderTradingSession;
        }
        if ((i & 4) != 0) {
            marketHours = timeInForceDataState.marketHours;
        }
        if ((i & 8) != 0) {
            marketHours2 = timeInForceDataState.nextMarketHours;
        }
        if ((i & 16) != 0) {
            str = timeInForceDataState.brokebackOrderExpireDateString;
        }
        String str2 = str;
        MarketHours marketHours3 = marketHours;
        return timeInForceDataState.copy(orderTimeInForce, orderMarketHours, marketHours3, marketHours2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final OrderTimeInForce getOrderTimeInForce() {
        return this.orderTimeInForce;
    }

    /* renamed from: component2, reason: from getter */
    public final OrderMarketHours getOrderTradingSession() {
        return this.orderTradingSession;
    }

    /* renamed from: component3, reason: from getter */
    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    /* renamed from: component4, reason: from getter */
    public final MarketHours getNextMarketHours() {
        return this.nextMarketHours;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBrokebackOrderExpireDateString() {
        return this.brokebackOrderExpireDateString;
    }

    public final TimeInForceDataState copy(OrderTimeInForce orderTimeInForce, OrderMarketHours orderTradingSession, MarketHours marketHours, MarketHours nextMarketHours, String brokebackOrderExpireDateString) {
        return new TimeInForceDataState(orderTimeInForce, orderTradingSession, marketHours, nextMarketHours, brokebackOrderExpireDateString);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeInForceDataState)) {
            return false;
        }
        TimeInForceDataState timeInForceDataState = (TimeInForceDataState) other;
        return this.orderTimeInForce == timeInForceDataState.orderTimeInForce && this.orderTradingSession == timeInForceDataState.orderTradingSession && Intrinsics.areEqual(this.marketHours, timeInForceDataState.marketHours) && Intrinsics.areEqual(this.nextMarketHours, timeInForceDataState.nextMarketHours) && Intrinsics.areEqual(this.brokebackOrderExpireDateString, timeInForceDataState.brokebackOrderExpireDateString);
    }

    public int hashCode() {
        OrderTimeInForce orderTimeInForce = this.orderTimeInForce;
        int iHashCode = (orderTimeInForce == null ? 0 : orderTimeInForce.hashCode()) * 31;
        OrderMarketHours orderMarketHours = this.orderTradingSession;
        int iHashCode2 = (iHashCode + (orderMarketHours == null ? 0 : orderMarketHours.hashCode())) * 31;
        MarketHours marketHours = this.marketHours;
        int iHashCode3 = (iHashCode2 + (marketHours == null ? 0 : marketHours.hashCode())) * 31;
        MarketHours marketHours2 = this.nextMarketHours;
        int iHashCode4 = (iHashCode3 + (marketHours2 == null ? 0 : marketHours2.hashCode())) * 31;
        String str = this.brokebackOrderExpireDateString;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "TimeInForceDataState(orderTimeInForce=" + this.orderTimeInForce + ", orderTradingSession=" + this.orderTradingSession + ", marketHours=" + this.marketHours + ", nextMarketHours=" + this.nextMarketHours + ", brokebackOrderExpireDateString=" + this.brokebackOrderExpireDateString + ")";
    }

    public TimeInForceDataState(OrderTimeInForce orderTimeInForce, OrderMarketHours orderMarketHours, MarketHours marketHours, MarketHours marketHours2, String str) {
        this.orderTimeInForce = orderTimeInForce;
        this.orderTradingSession = orderMarketHours;
        this.marketHours = marketHours;
        this.nextMarketHours = marketHours2;
        this.brokebackOrderExpireDateString = str;
    }

    public /* synthetic */ TimeInForceDataState(OrderTimeInForce orderTimeInForce, OrderMarketHours orderMarketHours, MarketHours marketHours, MarketHours marketHours2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : orderTimeInForce, (i & 2) != 0 ? null : orderMarketHours, (i & 4) != 0 ? null : marketHours, (i & 8) != 0 ? null : marketHours2, (i & 16) != 0 ? null : str);
    }

    public final OrderTimeInForce getOrderTimeInForce() {
        return this.orderTimeInForce;
    }

    public final OrderMarketHours getOrderTradingSession() {
        return this.orderTradingSession;
    }

    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    public final MarketHours getNextMarketHours() {
        return this.nextMarketHours;
    }

    public final String getBrokebackOrderExpireDateString() {
        return this.brokebackOrderExpireDateString;
    }

    public final ImmutableList<SelectionRowState<OrderTimeInForce>> getSelectionOptions() {
        TimeInForceUtils timeInForceUtils = TimeInForceUtils.INSTANCE;
        StringResource gfdTitle$default = TimeInForceUtils.getGfdTitle$default(timeInForceUtils, null, this.orderTradingSession, this.marketHours, this.nextMarketHours, null, 16, null);
        if (gfdTitle$default == null) {
            return extensions2.persistentListOf();
        }
        return extensions2.persistentListOf(new SelectionRowState(OrderTimeInForce.GFD, gfdTitle$default, timeInForceUtils.getGfdDetailText(this.orderTradingSession), false, 8, null), new SelectionRowState(OrderTimeInForce.GTC, TimeInForceUtils.getGtcTitle$default(timeInForceUtils, this.brokebackOrderExpireDateString, null, null, 6, null), timeInForceUtils.getGtcDetailText(), false, 8, null));
    }
}
