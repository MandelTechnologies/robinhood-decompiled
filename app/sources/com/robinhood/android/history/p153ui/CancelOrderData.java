package com.robinhood.android.history.p153ui;

import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.OrderSide;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderDetailViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/history/ui/CancelOrderData;", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "symbol", "", "sharesQuantity", "Ljava/math/BigDecimal;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Ljava/lang/String;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OrderSide;)V", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getSymbol", "()Ljava/lang/String;", "getSharesQuantity", "()Ljava/math/BigDecimal;", "getOrderSide", "()Lcom/robinhood/models/db/OrderSide;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CancelOrderData {
    public static final int $stable = 8;
    private final BrokerageAccountType brokerageAccountType;
    private final OrderSide orderSide;
    private final BigDecimal sharesQuantity;
    private final String symbol;

    public static /* synthetic */ CancelOrderData copy$default(CancelOrderData cancelOrderData, BrokerageAccountType brokerageAccountType, String str, BigDecimal bigDecimal, OrderSide orderSide, int i, Object obj) {
        if ((i & 1) != 0) {
            brokerageAccountType = cancelOrderData.brokerageAccountType;
        }
        if ((i & 2) != 0) {
            str = cancelOrderData.symbol;
        }
        if ((i & 4) != 0) {
            bigDecimal = cancelOrderData.sharesQuantity;
        }
        if ((i & 8) != 0) {
            orderSide = cancelOrderData.orderSide;
        }
        return cancelOrderData.copy(brokerageAccountType, str, bigDecimal, orderSide);
    }

    /* renamed from: component1, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getSharesQuantity() {
        return this.sharesQuantity;
    }

    /* renamed from: component4, reason: from getter */
    public final OrderSide getOrderSide() {
        return this.orderSide;
    }

    public final CancelOrderData copy(BrokerageAccountType brokerageAccountType, String symbol, BigDecimal sharesQuantity, OrderSide orderSide) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(sharesQuantity, "sharesQuantity");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        return new CancelOrderData(brokerageAccountType, symbol, sharesQuantity, orderSide);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CancelOrderData)) {
            return false;
        }
        CancelOrderData cancelOrderData = (CancelOrderData) other;
        return this.brokerageAccountType == cancelOrderData.brokerageAccountType && Intrinsics.areEqual(this.symbol, cancelOrderData.symbol) && Intrinsics.areEqual(this.sharesQuantity, cancelOrderData.sharesQuantity) && this.orderSide == cancelOrderData.orderSide;
    }

    public int hashCode() {
        return (((((this.brokerageAccountType.hashCode() * 31) + this.symbol.hashCode()) * 31) + this.sharesQuantity.hashCode()) * 31) + this.orderSide.hashCode();
    }

    public String toString() {
        return "CancelOrderData(brokerageAccountType=" + this.brokerageAccountType + ", symbol=" + this.symbol + ", sharesQuantity=" + this.sharesQuantity + ", orderSide=" + this.orderSide + ")";
    }

    public CancelOrderData(BrokerageAccountType brokerageAccountType, String symbol, BigDecimal sharesQuantity, OrderSide orderSide) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(sharesQuantity, "sharesQuantity");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        this.brokerageAccountType = brokerageAccountType;
        this.symbol = symbol;
        this.sharesQuantity = sharesQuantity;
        this.orderSide = orderSide;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final BigDecimal getSharesQuantity() {
        return this.sharesQuantity;
    }

    public final OrderSide getOrderSide() {
        return this.orderSide;
    }
}
