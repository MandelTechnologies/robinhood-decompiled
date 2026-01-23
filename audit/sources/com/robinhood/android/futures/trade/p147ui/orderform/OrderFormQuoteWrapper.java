package com.robinhood.android.futures.trade.p147ui.orderform;

import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct5;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesQuote;
import com.robinhood.referral.SingularAttributionManager;
import com.robinhood.websocket.p410dx.models.BigDecimalWithNaN;
import com.robinhood.websocket.p410dx.models.DxFeedData;
import com.robinhood.websocket.p410dx.models.DxResponse;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: FuturesOrderFormDuxo.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J4\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u0019R\u0013\u0010-\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010/\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0013\u00101\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b0\u0010,R\u0013\u00105\u001a\u0004\u0018\u0001028F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormQuoteWrapper;", "", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;", "mdQuote", "Lcom/robinhood/websocket/dx/models/DxResponse$DomSnapshot;", "dxDom", "Lcom/robinhood/websocket/dx/models/DxFeedData$Trade;", "dxLastTrade", "<init>", "(Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;Lcom/robinhood/websocket/dx/models/DxResponse$DomSnapshot;Lcom/robinhood/websocket/dx/models/DxFeedData$Trade;)V", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "side", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;", SingularAttributionManager.PRODUCT_PARAM_KEY, "", "getSuggestedPriceDisplay", "(Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;)Ljava/lang/String;", "Ljava/math/BigDecimal;", "getSuggestedPrice", "(Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;)Ljava/math/BigDecimal;", "component1", "()Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;", "component2", "()Lcom/robinhood/websocket/dx/models/DxResponse$DomSnapshot;", "component3", "()Lcom/robinhood/websocket/dx/models/DxFeedData$Trade;", "copy", "(Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;Lcom/robinhood/websocket/dx/models/DxResponse$DomSnapshot;Lcom/robinhood/websocket/dx/models/DxFeedData$Trade;)Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormQuoteWrapper;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;", "getMdQuote", "Lcom/robinhood/websocket/dx/models/DxResponse$DomSnapshot;", "getDxDom", "Lcom/robinhood/websocket/dx/models/DxFeedData$Trade;", "getDxLastTrade", "getBidPrice", "()Ljava/math/BigDecimal;", "bidPrice", "getAskPrice", "askPrice", "getLastTradePrice", "lastTradePrice", "j$/time/Instant", "getReceivedAt", "()Lj$/time/Instant;", "receivedAt", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class OrderFormQuoteWrapper {
    public static final int $stable = 8;
    private final DxResponse.DomSnapshot dxDom;
    private final DxFeedData.Trade dxLastTrade;
    private final FuturesQuote mdQuote;

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FuturesOrderSide.values().length];
            try {
                iArr[FuturesOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FuturesOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OrderFormQuoteWrapper() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ OrderFormQuoteWrapper copy$default(OrderFormQuoteWrapper orderFormQuoteWrapper, FuturesQuote futuresQuote, DxResponse.DomSnapshot domSnapshot, DxFeedData.Trade trade, int i, Object obj) {
        if ((i & 1) != 0) {
            futuresQuote = orderFormQuoteWrapper.mdQuote;
        }
        if ((i & 2) != 0) {
            domSnapshot = orderFormQuoteWrapper.dxDom;
        }
        if ((i & 4) != 0) {
            trade = orderFormQuoteWrapper.dxLastTrade;
        }
        return orderFormQuoteWrapper.copy(futuresQuote, domSnapshot, trade);
    }

    /* renamed from: component1, reason: from getter */
    public final FuturesQuote getMdQuote() {
        return this.mdQuote;
    }

    /* renamed from: component2, reason: from getter */
    public final DxResponse.DomSnapshot getDxDom() {
        return this.dxDom;
    }

    /* renamed from: component3, reason: from getter */
    public final DxFeedData.Trade getDxLastTrade() {
        return this.dxLastTrade;
    }

    public final OrderFormQuoteWrapper copy(FuturesQuote mdQuote, DxResponse.DomSnapshot dxDom, DxFeedData.Trade dxLastTrade) {
        return new OrderFormQuoteWrapper(mdQuote, dxDom, dxLastTrade);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderFormQuoteWrapper)) {
            return false;
        }
        OrderFormQuoteWrapper orderFormQuoteWrapper = (OrderFormQuoteWrapper) other;
        return Intrinsics.areEqual(this.mdQuote, orderFormQuoteWrapper.mdQuote) && Intrinsics.areEqual(this.dxDom, orderFormQuoteWrapper.dxDom) && Intrinsics.areEqual(this.dxLastTrade, orderFormQuoteWrapper.dxLastTrade);
    }

    public int hashCode() {
        FuturesQuote futuresQuote = this.mdQuote;
        int iHashCode = (futuresQuote == null ? 0 : futuresQuote.hashCode()) * 31;
        DxResponse.DomSnapshot domSnapshot = this.dxDom;
        int iHashCode2 = (iHashCode + (domSnapshot == null ? 0 : domSnapshot.hashCode())) * 31;
        DxFeedData.Trade trade = this.dxLastTrade;
        return iHashCode2 + (trade != null ? trade.hashCode() : 0);
    }

    public String toString() {
        return "OrderFormQuoteWrapper(mdQuote=" + this.mdQuote + ", dxDom=" + this.dxDom + ", dxLastTrade=" + this.dxLastTrade + ")";
    }

    public OrderFormQuoteWrapper(FuturesQuote futuresQuote, DxResponse.DomSnapshot domSnapshot, DxFeedData.Trade trade) {
        this.mdQuote = futuresQuote;
        this.dxDom = domSnapshot;
        this.dxLastTrade = trade;
    }

    public /* synthetic */ OrderFormQuoteWrapper(FuturesQuote futuresQuote, DxResponse.DomSnapshot domSnapshot, DxFeedData.Trade trade, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : futuresQuote, (i & 2) != 0 ? null : domSnapshot, (i & 4) != 0 ? null : trade);
    }

    public final FuturesQuote getMdQuote() {
        return this.mdQuote;
    }

    public final DxResponse.DomSnapshot getDxDom() {
        return this.dxDom;
    }

    public final DxFeedData.Trade getDxLastTrade() {
        return this.dxLastTrade;
    }

    public final BigDecimal getBidPrice() {
        List<DxResponse.DomSnapshot.PriceAndSize> bids;
        BigDecimal bigDecimal;
        DxResponse.DomSnapshot domSnapshot = this.dxDom;
        if (domSnapshot != null && (bids = domSnapshot.getBids()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = bids.iterator();
            while (it.hasNext()) {
                BigDecimalWithNaN price = ((DxResponse.DomSnapshot.PriceAndSize) it.next()).getPrice();
                BigDecimal bigDecimal2 = price != null ? price.getBigDecimal() : null;
                if (bigDecimal2 != null) {
                    arrayList.add(bigDecimal2);
                }
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                bigDecimal = (BigDecimal) it2.next();
                while (it2.hasNext()) {
                    BigDecimal bigDecimal3 = (BigDecimal) it2.next();
                    if (bigDecimal.compareTo(bigDecimal3) < 0) {
                        bigDecimal = bigDecimal3;
                    }
                }
            } else {
                bigDecimal = null;
            }
            if (bigDecimal != null) {
                return bigDecimal;
            }
        }
        FuturesQuote futuresQuote = this.mdQuote;
        if (futuresQuote != null) {
            return futuresQuote.getBidPrice();
        }
        return null;
    }

    public final BigDecimal getAskPrice() {
        List<DxResponse.DomSnapshot.PriceAndSize> asks;
        BigDecimal bigDecimal;
        DxResponse.DomSnapshot domSnapshot = this.dxDom;
        if (domSnapshot != null && (asks = domSnapshot.getAsks()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = asks.iterator();
            while (it.hasNext()) {
                BigDecimalWithNaN price = ((DxResponse.DomSnapshot.PriceAndSize) it.next()).getPrice();
                BigDecimal bigDecimal2 = price != null ? price.getBigDecimal() : null;
                if (bigDecimal2 != null) {
                    arrayList.add(bigDecimal2);
                }
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                bigDecimal = (BigDecimal) it2.next();
                while (it2.hasNext()) {
                    BigDecimal bigDecimal3 = (BigDecimal) it2.next();
                    if (bigDecimal.compareTo(bigDecimal3) > 0) {
                        bigDecimal = bigDecimal3;
                    }
                }
            } else {
                bigDecimal = null;
            }
            if (bigDecimal != null) {
                return bigDecimal;
            }
        }
        FuturesQuote futuresQuote = this.mdQuote;
        if (futuresQuote != null) {
            return futuresQuote.getAskPrice();
        }
        return null;
    }

    public final BigDecimal getLastTradePrice() {
        BigDecimalWithNaN price;
        BigDecimal bigDecimal;
        DxFeedData.Trade trade = this.dxLastTrade;
        if (trade != null && (price = trade.getPrice()) != null && (bigDecimal = price.getBigDecimal()) != null) {
            return bigDecimal;
        }
        FuturesQuote futuresQuote = this.mdQuote;
        if (futuresQuote != null) {
            return futuresQuote.getLastTradePrice();
        }
        return null;
    }

    public final Instant getReceivedAt() {
        Long time;
        Instant instantOfEpochMilli;
        DxFeedData.Trade trade = this.dxLastTrade;
        if (trade != null && (time = trade.getTime()) != null && (instantOfEpochMilli = Instant.ofEpochMilli(time.longValue())) != null) {
            return instantOfEpochMilli;
        }
        FuturesQuote futuresQuote = this.mdQuote;
        if (futuresQuote != null) {
            return futuresQuote.getReceivedAt();
        }
        return null;
    }

    public final String getSuggestedPriceDisplay(FuturesOrderSide side, FuturesProduct product) {
        Intrinsics.checkNotNullParameter(side, "side");
        String nullable$default = FuturesProduct5.formatNullable$default(product, getSuggestedPrice(side), null, 2, null);
        return nullable$default == null ? "" : nullable$default;
    }

    public final BigDecimal getSuggestedPrice(FuturesOrderSide side) {
        Intrinsics.checkNotNullParameter(side, "side");
        int i = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
        if (i == 1) {
            return getAskPrice();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return getBidPrice();
    }
}
