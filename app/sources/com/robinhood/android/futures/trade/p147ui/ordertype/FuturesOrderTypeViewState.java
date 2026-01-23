package com.robinhood.android.futures.trade.p147ui.ordertype;

import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesOrderTypeDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeViewState;", "", "marketOrder", "Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeViewState$OrderTypeConfig;", "limitOrder", "stopOrder", "<init>", "(Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeViewState$OrderTypeConfig;Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeViewState$OrderTypeConfig;Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeViewState$OrderTypeConfig;)V", "getMarketOrder", "()Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeViewState$OrderTypeConfig;", "getLimitOrder", "getStopOrder", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "OrderTypeConfig", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FuturesOrderTypeViewState {
    public static final int $stable = StringResource.$stable;
    private final OrderTypeConfig limitOrder;
    private final OrderTypeConfig marketOrder;
    private final OrderTypeConfig stopOrder;

    public static /* synthetic */ FuturesOrderTypeViewState copy$default(FuturesOrderTypeViewState futuresOrderTypeViewState, OrderTypeConfig orderTypeConfig, OrderTypeConfig orderTypeConfig2, OrderTypeConfig orderTypeConfig3, int i, Object obj) {
        if ((i & 1) != 0) {
            orderTypeConfig = futuresOrderTypeViewState.marketOrder;
        }
        if ((i & 2) != 0) {
            orderTypeConfig2 = futuresOrderTypeViewState.limitOrder;
        }
        if ((i & 4) != 0) {
            orderTypeConfig3 = futuresOrderTypeViewState.stopOrder;
        }
        return futuresOrderTypeViewState.copy(orderTypeConfig, orderTypeConfig2, orderTypeConfig3);
    }

    /* renamed from: component1, reason: from getter */
    public final OrderTypeConfig getMarketOrder() {
        return this.marketOrder;
    }

    /* renamed from: component2, reason: from getter */
    public final OrderTypeConfig getLimitOrder() {
        return this.limitOrder;
    }

    /* renamed from: component3, reason: from getter */
    public final OrderTypeConfig getStopOrder() {
        return this.stopOrder;
    }

    public final FuturesOrderTypeViewState copy(OrderTypeConfig marketOrder, OrderTypeConfig limitOrder, OrderTypeConfig stopOrder) {
        Intrinsics.checkNotNullParameter(marketOrder, "marketOrder");
        Intrinsics.checkNotNullParameter(limitOrder, "limitOrder");
        Intrinsics.checkNotNullParameter(stopOrder, "stopOrder");
        return new FuturesOrderTypeViewState(marketOrder, limitOrder, stopOrder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesOrderTypeViewState)) {
            return false;
        }
        FuturesOrderTypeViewState futuresOrderTypeViewState = (FuturesOrderTypeViewState) other;
        return Intrinsics.areEqual(this.marketOrder, futuresOrderTypeViewState.marketOrder) && Intrinsics.areEqual(this.limitOrder, futuresOrderTypeViewState.limitOrder) && Intrinsics.areEqual(this.stopOrder, futuresOrderTypeViewState.stopOrder);
    }

    public int hashCode() {
        return (((this.marketOrder.hashCode() * 31) + this.limitOrder.hashCode()) * 31) + this.stopOrder.hashCode();
    }

    public String toString() {
        return "FuturesOrderTypeViewState(marketOrder=" + this.marketOrder + ", limitOrder=" + this.limitOrder + ", stopOrder=" + this.stopOrder + ")";
    }

    public FuturesOrderTypeViewState(OrderTypeConfig marketOrder, OrderTypeConfig limitOrder, OrderTypeConfig stopOrder) {
        Intrinsics.checkNotNullParameter(marketOrder, "marketOrder");
        Intrinsics.checkNotNullParameter(limitOrder, "limitOrder");
        Intrinsics.checkNotNullParameter(stopOrder, "stopOrder");
        this.marketOrder = marketOrder;
        this.limitOrder = limitOrder;
        this.stopOrder = stopOrder;
    }

    public final OrderTypeConfig getMarketOrder() {
        return this.marketOrder;
    }

    public final OrderTypeConfig getLimitOrder() {
        return this.limitOrder;
    }

    public final OrderTypeConfig getStopOrder() {
        return this.stopOrder;
    }

    /* compiled from: FuturesOrderTypeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeViewState$OrderTypeConfig;", "", ResourceTypes.DRAWABLE, "", "description", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(ILcom/robinhood/utils/resource/StringResource;)V", "getDrawable", "()I", "getDescription", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OrderTypeConfig {
        public static final int $stable = StringResource.$stable;
        private final StringResource description;
        private final int drawable;

        public static /* synthetic */ OrderTypeConfig copy$default(OrderTypeConfig orderTypeConfig, int i, StringResource stringResource, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = orderTypeConfig.drawable;
            }
            if ((i2 & 2) != 0) {
                stringResource = orderTypeConfig.description;
            }
            return orderTypeConfig.copy(i, stringResource);
        }

        /* renamed from: component1, reason: from getter */
        public final int getDrawable() {
            return this.drawable;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getDescription() {
            return this.description;
        }

        public final OrderTypeConfig copy(int drawable, StringResource description) {
            return new OrderTypeConfig(drawable, description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderTypeConfig)) {
                return false;
            }
            OrderTypeConfig orderTypeConfig = (OrderTypeConfig) other;
            return this.drawable == orderTypeConfig.drawable && Intrinsics.areEqual(this.description, orderTypeConfig.description);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.drawable) * 31;
            StringResource stringResource = this.description;
            return iHashCode + (stringResource == null ? 0 : stringResource.hashCode());
        }

        public String toString() {
            return "OrderTypeConfig(drawable=" + this.drawable + ", description=" + this.description + ")";
        }

        public OrderTypeConfig(int i, StringResource stringResource) {
            this.drawable = i;
            this.description = stringResource;
        }

        public final int getDrawable() {
            return this.drawable;
        }

        public final StringResource getDescription() {
            return this.description;
        }
    }
}
