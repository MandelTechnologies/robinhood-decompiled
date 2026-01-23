package com.robinhood.android.trade.equity.p261ui.configuration.timeinforce;

import com.robinhood.android.equities.tradesettings.utils.TimeInForceUtils;
import com.robinhood.android.trade.equity.p261ui.configuration.toolbar.OrderConfigurationToolbar;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderTimeInForceDataState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÂ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fHÆ\u0003J\t\u0010,\u001a\u00020\u000eHÂ\u0003Ja\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010.\u001a\u00020\u000e2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0006HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010 \u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u0011\u0010\"\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u001dR\u0013\u0010$\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u001d¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceDataState;", "", "nextMarketHours", "Lcom/robinhood/models/db/MarketHours;", "todaysMarketHours", "brokebackOrderExpireDateString", "", "orderConfiguration", "Lcom/robinhood/models/db/Order$Configuration;", "selectedTimeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "defaultTimeInForceUiEvent", "Lcom/robinhood/udf/UiEvent;", "isOrderReplacement", "", "<init>", "(Lcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/db/MarketHours;Ljava/lang/String;Lcom/robinhood/models/db/Order$Configuration;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/udf/UiEvent;Z)V", "getOrderConfiguration", "()Lcom/robinhood/models/db/Order$Configuration;", "getSelectedTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getDefaultTimeInForceUiEvent", "()Lcom/robinhood/udf/UiEvent;", "continueButtonEnabled", "getContinueButtonEnabled", "()Z", "timeInForceDetail", "Lcom/robinhood/utils/resource/StringResource;", "getTimeInForceDetail", "()Lcom/robinhood/utils/resource/StringResource;", "goodForDayTitle", "getGoodForDayTitle", "goodForDayDetailText", "getGoodForDayDetailText", "gtcTitle", "getGtcTitle", "toolbarTitle", "getToolbarTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OrderTimeInForceDataState {
    public static final int $stable = 8;
    private final String brokebackOrderExpireDateString;
    private final boolean continueButtonEnabled;
    private final UiEvent<OrderTimeInForce> defaultTimeInForceUiEvent;
    private final boolean isOrderReplacement;
    private final MarketHours nextMarketHours;
    private final Order.Configuration orderConfiguration;
    private final OrderTimeInForce selectedTimeInForce;
    private MarketHours todaysMarketHours;

    /* renamed from: component1, reason: from getter */
    private final MarketHours getNextMarketHours() {
        return this.nextMarketHours;
    }

    /* renamed from: component2, reason: from getter */
    private final MarketHours getTodaysMarketHours() {
        return this.todaysMarketHours;
    }

    /* renamed from: component3, reason: from getter */
    private final String getBrokebackOrderExpireDateString() {
        return this.brokebackOrderExpireDateString;
    }

    /* renamed from: component7, reason: from getter */
    private final boolean getIsOrderReplacement() {
        return this.isOrderReplacement;
    }

    public static /* synthetic */ OrderTimeInForceDataState copy$default(OrderTimeInForceDataState orderTimeInForceDataState, MarketHours marketHours, MarketHours marketHours2, String str, Order.Configuration configuration, OrderTimeInForce orderTimeInForce, UiEvent uiEvent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            marketHours = orderTimeInForceDataState.nextMarketHours;
        }
        if ((i & 2) != 0) {
            marketHours2 = orderTimeInForceDataState.todaysMarketHours;
        }
        if ((i & 4) != 0) {
            str = orderTimeInForceDataState.brokebackOrderExpireDateString;
        }
        if ((i & 8) != 0) {
            configuration = orderTimeInForceDataState.orderConfiguration;
        }
        if ((i & 16) != 0) {
            orderTimeInForce = orderTimeInForceDataState.selectedTimeInForce;
        }
        if ((i & 32) != 0) {
            uiEvent = orderTimeInForceDataState.defaultTimeInForceUiEvent;
        }
        if ((i & 64) != 0) {
            z = orderTimeInForceDataState.isOrderReplacement;
        }
        UiEvent uiEvent2 = uiEvent;
        boolean z2 = z;
        OrderTimeInForce orderTimeInForce2 = orderTimeInForce;
        String str2 = str;
        return orderTimeInForceDataState.copy(marketHours, marketHours2, str2, configuration, orderTimeInForce2, uiEvent2, z2);
    }

    /* renamed from: component4, reason: from getter */
    public final Order.Configuration getOrderConfiguration() {
        return this.orderConfiguration;
    }

    /* renamed from: component5, reason: from getter */
    public final OrderTimeInForce getSelectedTimeInForce() {
        return this.selectedTimeInForce;
    }

    public final UiEvent<OrderTimeInForce> component6() {
        return this.defaultTimeInForceUiEvent;
    }

    public final OrderTimeInForceDataState copy(MarketHours nextMarketHours, MarketHours todaysMarketHours, String brokebackOrderExpireDateString, Order.Configuration orderConfiguration, OrderTimeInForce selectedTimeInForce, UiEvent<OrderTimeInForce> defaultTimeInForceUiEvent, boolean isOrderReplacement) {
        return new OrderTimeInForceDataState(nextMarketHours, todaysMarketHours, brokebackOrderExpireDateString, orderConfiguration, selectedTimeInForce, defaultTimeInForceUiEvent, isOrderReplacement);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderTimeInForceDataState)) {
            return false;
        }
        OrderTimeInForceDataState orderTimeInForceDataState = (OrderTimeInForceDataState) other;
        return Intrinsics.areEqual(this.nextMarketHours, orderTimeInForceDataState.nextMarketHours) && Intrinsics.areEqual(this.todaysMarketHours, orderTimeInForceDataState.todaysMarketHours) && Intrinsics.areEqual(this.brokebackOrderExpireDateString, orderTimeInForceDataState.brokebackOrderExpireDateString) && this.orderConfiguration == orderTimeInForceDataState.orderConfiguration && this.selectedTimeInForce == orderTimeInForceDataState.selectedTimeInForce && Intrinsics.areEqual(this.defaultTimeInForceUiEvent, orderTimeInForceDataState.defaultTimeInForceUiEvent) && this.isOrderReplacement == orderTimeInForceDataState.isOrderReplacement;
    }

    public int hashCode() {
        MarketHours marketHours = this.nextMarketHours;
        int iHashCode = (marketHours == null ? 0 : marketHours.hashCode()) * 31;
        MarketHours marketHours2 = this.todaysMarketHours;
        int iHashCode2 = (iHashCode + (marketHours2 == null ? 0 : marketHours2.hashCode())) * 31;
        String str = this.brokebackOrderExpireDateString;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Order.Configuration configuration = this.orderConfiguration;
        int iHashCode4 = (iHashCode3 + (configuration == null ? 0 : configuration.hashCode())) * 31;
        OrderTimeInForce orderTimeInForce = this.selectedTimeInForce;
        int iHashCode5 = (iHashCode4 + (orderTimeInForce == null ? 0 : orderTimeInForce.hashCode())) * 31;
        UiEvent<OrderTimeInForce> uiEvent = this.defaultTimeInForceUiEvent;
        return ((iHashCode5 + (uiEvent != null ? uiEvent.hashCode() : 0)) * 31) + Boolean.hashCode(this.isOrderReplacement);
    }

    public String toString() {
        return "OrderTimeInForceDataState(nextMarketHours=" + this.nextMarketHours + ", todaysMarketHours=" + this.todaysMarketHours + ", brokebackOrderExpireDateString=" + this.brokebackOrderExpireDateString + ", orderConfiguration=" + this.orderConfiguration + ", selectedTimeInForce=" + this.selectedTimeInForce + ", defaultTimeInForceUiEvent=" + this.defaultTimeInForceUiEvent + ", isOrderReplacement=" + this.isOrderReplacement + ")";
    }

    public OrderTimeInForceDataState(MarketHours marketHours, MarketHours marketHours2, String str, Order.Configuration configuration, OrderTimeInForce orderTimeInForce, UiEvent<OrderTimeInForce> uiEvent, boolean z) {
        this.nextMarketHours = marketHours;
        this.todaysMarketHours = marketHours2;
        this.brokebackOrderExpireDateString = str;
        this.orderConfiguration = configuration;
        this.selectedTimeInForce = orderTimeInForce;
        this.defaultTimeInForceUiEvent = uiEvent;
        this.isOrderReplacement = z;
        this.continueButtonEnabled = orderTimeInForce != null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OrderTimeInForceDataState(MarketHours marketHours, MarketHours marketHours2, String str, Order.Configuration configuration, OrderTimeInForce orderTimeInForce, UiEvent uiEvent, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z2;
        UiEvent uiEvent2;
        marketHours = (i & 1) != 0 ? null : marketHours;
        marketHours2 = (i & 2) != 0 ? null : marketHours2;
        str = (i & 4) != 0 ? null : str;
        configuration = (i & 8) != 0 ? null : configuration;
        orderTimeInForce = (i & 16) != 0 ? null : orderTimeInForce;
        if ((i & 32) != 0) {
            z2 = z;
            uiEvent2 = null;
        } else {
            z2 = z;
            uiEvent2 = uiEvent;
        }
        this(marketHours, marketHours2, str, configuration, orderTimeInForce, uiEvent2, z2);
    }

    public final Order.Configuration getOrderConfiguration() {
        return this.orderConfiguration;
    }

    public final OrderTimeInForce getSelectedTimeInForce() {
        return this.selectedTimeInForce;
    }

    public final UiEvent<OrderTimeInForce> getDefaultTimeInForceUiEvent() {
        return this.defaultTimeInForceUiEvent;
    }

    public final boolean getContinueButtonEnabled() {
        return this.continueButtonEnabled;
    }

    public final StringResource getTimeInForceDetail() {
        return TimeInForceUtils.timeInForceDetail$default(TimeInForceUtils.INSTANCE, this.orderConfiguration, null, this.todaysMarketHours, null, 8, null);
    }

    public final StringResource getGoodForDayTitle() {
        return TimeInForceUtils.getGfdTitle$default(TimeInForceUtils.INSTANCE, this.orderConfiguration, null, this.todaysMarketHours, this.nextMarketHours, null, 16, null);
    }

    public final StringResource getGoodForDayDetailText() {
        return TimeInForceUtils.INSTANCE.getGfdDetailText(null);
    }

    public final StringResource getGtcTitle() {
        return TimeInForceUtils.getGtcTitle$default(TimeInForceUtils.INSTANCE, this.brokebackOrderExpireDateString, null, null, 6, null);
    }

    public final StringResource getToolbarTitle() {
        return OrderConfigurationToolbar.INSTANCE.toolbarTitle(this.orderConfiguration, this.isOrderReplacement);
    }
}
