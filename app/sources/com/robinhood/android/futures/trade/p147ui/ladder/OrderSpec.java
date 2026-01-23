package com.robinhood.android.futures.trade.p147ui.ladder;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.models.futures.api.order.FuturesOrderTrigger;
import com.robinhood.android.models.futures.api.order.FuturesOrderType;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesLadderDuxo.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \t2\u00020\u0001:\u0004\u0006\u0007\b\tR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/OrderSpec;", "", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "getSide", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "MarketOrderSpec", "LimitOrderSpec", "StopMarketOrderSpec", "Companion", "Lcom/robinhood/android/futures/trade/ui/ladder/OrderSpec$LimitOrderSpec;", "Lcom/robinhood/android/futures/trade/ui/ladder/OrderSpec$MarketOrderSpec;", "Lcom/robinhood/android/futures/trade/ui/ladder/OrderSpec$StopMarketOrderSpec;", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface OrderSpec {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    FuturesOrderSide getSide();

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/OrderSpec$MarketOrderSpec;", "Lcom/robinhood/android/futures/trade/ui/ladder/OrderSpec;", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "<init>", "(Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;)V", "getSide", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MarketOrderSpec implements OrderSpec {
        public static final int $stable = 0;
        private final FuturesOrderSide side;

        public static /* synthetic */ MarketOrderSpec copy$default(MarketOrderSpec marketOrderSpec, FuturesOrderSide futuresOrderSide, int i, Object obj) {
            if ((i & 1) != 0) {
                futuresOrderSide = marketOrderSpec.side;
            }
            return marketOrderSpec.copy(futuresOrderSide);
        }

        /* renamed from: component1, reason: from getter */
        public final FuturesOrderSide getSide() {
            return this.side;
        }

        public final MarketOrderSpec copy(FuturesOrderSide side) {
            Intrinsics.checkNotNullParameter(side, "side");
            return new MarketOrderSpec(side);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MarketOrderSpec) && this.side == ((MarketOrderSpec) other).side;
        }

        public int hashCode() {
            return this.side.hashCode();
        }

        public String toString() {
            return "MarketOrderSpec(side=" + this.side + ")";
        }

        public MarketOrderSpec(FuturesOrderSide side) {
            Intrinsics.checkNotNullParameter(side, "side");
            this.side = side;
        }

        @Override // com.robinhood.android.futures.trade.p147ui.ladder.OrderSpec
        public FuturesOrderSide getSide() {
            return this.side;
        }
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/OrderSpec$LimitOrderSpec;", "Lcom/robinhood/android/futures/trade/ui/ladder/OrderSpec;", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "limitPriceIndex", "", "<init>", "(Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;I)V", "getSide", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "getLimitPriceIndex", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LimitOrderSpec implements OrderSpec {
        public static final int $stable = 0;
        private final int limitPriceIndex;
        private final FuturesOrderSide side;

        public static /* synthetic */ LimitOrderSpec copy$default(LimitOrderSpec limitOrderSpec, FuturesOrderSide futuresOrderSide, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                futuresOrderSide = limitOrderSpec.side;
            }
            if ((i2 & 2) != 0) {
                i = limitOrderSpec.limitPriceIndex;
            }
            return limitOrderSpec.copy(futuresOrderSide, i);
        }

        /* renamed from: component1, reason: from getter */
        public final FuturesOrderSide getSide() {
            return this.side;
        }

        /* renamed from: component2, reason: from getter */
        public final int getLimitPriceIndex() {
            return this.limitPriceIndex;
        }

        public final LimitOrderSpec copy(FuturesOrderSide side, int limitPriceIndex) {
            Intrinsics.checkNotNullParameter(side, "side");
            return new LimitOrderSpec(side, limitPriceIndex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LimitOrderSpec)) {
                return false;
            }
            LimitOrderSpec limitOrderSpec = (LimitOrderSpec) other;
            return this.side == limitOrderSpec.side && this.limitPriceIndex == limitOrderSpec.limitPriceIndex;
        }

        public int hashCode() {
            return (this.side.hashCode() * 31) + Integer.hashCode(this.limitPriceIndex);
        }

        public String toString() {
            return "LimitOrderSpec(side=" + this.side + ", limitPriceIndex=" + this.limitPriceIndex + ")";
        }

        public LimitOrderSpec(FuturesOrderSide side, int i) {
            Intrinsics.checkNotNullParameter(side, "side");
            this.side = side;
            this.limitPriceIndex = i;
        }

        public final int getLimitPriceIndex() {
            return this.limitPriceIndex;
        }

        @Override // com.robinhood.android.futures.trade.p147ui.ladder.OrderSpec
        public FuturesOrderSide getSide() {
            return this.side;
        }
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/OrderSpec$StopMarketOrderSpec;", "Lcom/robinhood/android/futures/trade/ui/ladder/OrderSpec;", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "stopPriceIndex", "", "<init>", "(Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;I)V", "getSide", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "getStopPriceIndex", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StopMarketOrderSpec implements OrderSpec {
        public static final int $stable = 0;
        private final FuturesOrderSide side;
        private final int stopPriceIndex;

        public static /* synthetic */ StopMarketOrderSpec copy$default(StopMarketOrderSpec stopMarketOrderSpec, FuturesOrderSide futuresOrderSide, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                futuresOrderSide = stopMarketOrderSpec.side;
            }
            if ((i2 & 2) != 0) {
                i = stopMarketOrderSpec.stopPriceIndex;
            }
            return stopMarketOrderSpec.copy(futuresOrderSide, i);
        }

        /* renamed from: component1, reason: from getter */
        public final FuturesOrderSide getSide() {
            return this.side;
        }

        /* renamed from: component2, reason: from getter */
        public final int getStopPriceIndex() {
            return this.stopPriceIndex;
        }

        public final StopMarketOrderSpec copy(FuturesOrderSide side, int stopPriceIndex) {
            Intrinsics.checkNotNullParameter(side, "side");
            return new StopMarketOrderSpec(side, stopPriceIndex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StopMarketOrderSpec)) {
                return false;
            }
            StopMarketOrderSpec stopMarketOrderSpec = (StopMarketOrderSpec) other;
            return this.side == stopMarketOrderSpec.side && this.stopPriceIndex == stopMarketOrderSpec.stopPriceIndex;
        }

        public int hashCode() {
            return (this.side.hashCode() * 31) + Integer.hashCode(this.stopPriceIndex);
        }

        public String toString() {
            return "StopMarketOrderSpec(side=" + this.side + ", stopPriceIndex=" + this.stopPriceIndex + ")";
        }

        public StopMarketOrderSpec(FuturesOrderSide side, int i) {
            Intrinsics.checkNotNullParameter(side, "side");
            this.side = side;
            this.stopPriceIndex = i;
        }

        @Override // com.robinhood.android.futures.trade.p147ui.ladder.OrderSpec
        public FuturesOrderSide getSide() {
            return this.side;
        }

        public final int getStopPriceIndex() {
            return this.stopPriceIndex;
        }
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/OrderSpec$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/android/futures/trade/ui/ladder/OrderSpec;", "type", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderType;", "trigger", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderTrigger;", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final OrderSpec from(FuturesOrderType type2, FuturesOrderTrigger trigger, FuturesOrderSide side, int index) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            Intrinsics.checkNotNullParameter(side, "side");
            FuturesOrderType futuresOrderType = FuturesOrderType.MARKET;
            if (type2 == futuresOrderType && trigger == FuturesOrderTrigger.IMMEDIATE) {
                return new MarketOrderSpec(side);
            }
            if (type2 == futuresOrderType && trigger == FuturesOrderTrigger.STOP) {
                return new StopMarketOrderSpec(side, index);
            }
            if (type2 == FuturesOrderType.LIMIT && trigger == FuturesOrderTrigger.IMMEDIATE) {
                return new LimitOrderSpec(side, index);
            }
            throw new IllegalStateException(("Unsupported order spec configuration: " + type2 + PlaceholderUtils.XXShortPlaceholderText + trigger).toString());
        }
    }
}
