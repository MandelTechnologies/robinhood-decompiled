package com.robinhood.android.futures.trade.p147ui.ladder;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct5;
import com.robinhood.android.models.futures.p189db.UiFuturesOrder;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: LadderPriceLevels.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 02\u00020\u0001:\u00010B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0007J\u0018\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001b\u001a\u00020\u0003¢\u0006\u0002\u0010\u001fJ\u000e\u0010 \u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0007J\u0018\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u0007J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0007J\t\u0010'\u001a\u00020\u0003HÂ\u0003J\t\u0010(\u001a\u00020\u0003HÂ\u0003J\t\u0010)\u001a\u00020\u0003HÂ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J1\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010,\u001a\u00020#2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0007HÖ\u0001J\t\u0010/\u001a\u00020\u0017HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/LadderPriceLevels;", "", "topPrice", "Ljava/math/BigDecimal;", "bottomPrice", "priceIncrement", "scale", "", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;I)V", "getScale", "()I", "displayPriceIncrement", "getDisplayPriceIncrement", "()Ljava/math/BigDecimal;", "displayTopPrice", "getDisplayTopPrice", "displayBottomPrice", "getDisplayBottomPrice", "numRows", "getNumRows", "priceDisplayCache", "", "", "getPrice", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "getRowIndexFromPriceScaled", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "roundingMode", "Lcom/robinhood/android/futures/trade/ui/ladder/PriceLevelScaledRoundingMode;", "getExactRowIndexFromPrice", "(Ljava/math/BigDecimal;)Ljava/lang/Integer;", "getPriceDisplay", AnalyticsStrings.BUTTON_PROFIT_LOSS_CHART_EXPAND, "expandOnTop", "", "defaultRowsPerSide", "copyForZoom", "newZoomScale", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "Companion", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class LadderPriceLevels {
    public static final int DEFAULT_ROWS_PER_SIDE = 200;
    private final BigDecimal bottomPrice;
    private final BigDecimal displayBottomPrice;
    private final BigDecimal displayPriceIncrement;
    private final BigDecimal displayTopPrice;
    private final int numRows;
    private final Map<Integer, String> priceDisplayCache;
    private final BigDecimal priceIncrement;
    private final int scale;
    private final BigDecimal topPrice;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: LadderPriceLevels.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LadderPriceLevels3.values().length];
            try {
                iArr[LadderPriceLevels3.f4167UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LadderPriceLevels3.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LadderPriceLevels3.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final BigDecimal getTopPrice() {
        return this.topPrice;
    }

    /* renamed from: component2, reason: from getter */
    private final BigDecimal getBottomPrice() {
        return this.bottomPrice;
    }

    /* renamed from: component3, reason: from getter */
    private final BigDecimal getPriceIncrement() {
        return this.priceIncrement;
    }

    public static /* synthetic */ LadderPriceLevels copy$default(LadderPriceLevels ladderPriceLevels, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bigDecimal = ladderPriceLevels.topPrice;
        }
        if ((i2 & 2) != 0) {
            bigDecimal2 = ladderPriceLevels.bottomPrice;
        }
        if ((i2 & 4) != 0) {
            bigDecimal3 = ladderPriceLevels.priceIncrement;
        }
        if ((i2 & 8) != 0) {
            i = ladderPriceLevels.scale;
        }
        return ladderPriceLevels.copy(bigDecimal, bigDecimal2, bigDecimal3, i);
    }

    /* renamed from: component4, reason: from getter */
    public final int getScale() {
        return this.scale;
    }

    public final LadderPriceLevels copy(BigDecimal topPrice, BigDecimal bottomPrice, BigDecimal priceIncrement, int scale) {
        Intrinsics.checkNotNullParameter(topPrice, "topPrice");
        Intrinsics.checkNotNullParameter(bottomPrice, "bottomPrice");
        Intrinsics.checkNotNullParameter(priceIncrement, "priceIncrement");
        return new LadderPriceLevels(topPrice, bottomPrice, priceIncrement, scale);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LadderPriceLevels)) {
            return false;
        }
        LadderPriceLevels ladderPriceLevels = (LadderPriceLevels) other;
        return Intrinsics.areEqual(this.topPrice, ladderPriceLevels.topPrice) && Intrinsics.areEqual(this.bottomPrice, ladderPriceLevels.bottomPrice) && Intrinsics.areEqual(this.priceIncrement, ladderPriceLevels.priceIncrement) && this.scale == ladderPriceLevels.scale;
    }

    public int hashCode() {
        return (((((this.topPrice.hashCode() * 31) + this.bottomPrice.hashCode()) * 31) + this.priceIncrement.hashCode()) * 31) + Integer.hashCode(this.scale);
    }

    public String toString() {
        return "LadderPriceLevels(topPrice=" + this.topPrice + ", bottomPrice=" + this.bottomPrice + ", priceIncrement=" + this.priceIncrement + ", scale=" + this.scale + ")";
    }

    public LadderPriceLevels(BigDecimal topPrice, BigDecimal bottomPrice, BigDecimal priceIncrement, int i) {
        Intrinsics.checkNotNullParameter(topPrice, "topPrice");
        Intrinsics.checkNotNullParameter(bottomPrice, "bottomPrice");
        Intrinsics.checkNotNullParameter(priceIncrement, "priceIncrement");
        this.topPrice = topPrice;
        this.bottomPrice = bottomPrice;
        this.priceIncrement = priceIncrement;
        this.scale = i;
        BigDecimal bigDecimalMultiply = priceIncrement.multiply(new BigDecimal(i));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        this.displayPriceIncrement = bigDecimalMultiply;
        BigDecimal bigDecimalRoundToInterval = BigDecimals7.roundToInterval(topPrice, bigDecimalMultiply, RoundingMode.CEILING);
        this.displayTopPrice = bigDecimalRoundToInterval;
        BigDecimal bigDecimalRoundToInterval2 = BigDecimals7.roundToInterval(bottomPrice, bigDecimalMultiply, RoundingMode.FLOOR);
        this.displayBottomPrice = bigDecimalRoundToInterval2;
        BigDecimal bigDecimalSubtract = bigDecimalRoundToInterval.subtract(bigDecimalRoundToInterval2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        this.numRows = BigDecimals7.safeDivide(bigDecimalSubtract, bigDecimalMultiply).intValueExact() + 1;
        this.priceDisplayCache = new LinkedHashMap();
    }

    public /* synthetic */ LadderPriceLevels(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, bigDecimal2, bigDecimal3, (i2 & 8) != 0 ? 1 : i);
    }

    public final int getScale() {
        return this.scale;
    }

    public final BigDecimal getDisplayPriceIncrement() {
        return this.displayPriceIncrement;
    }

    public final BigDecimal getDisplayTopPrice() {
        return this.displayTopPrice;
    }

    public final BigDecimal getDisplayBottomPrice() {
        return this.displayBottomPrice;
    }

    public final int getNumRows() {
        return this.numRows;
    }

    public final BigDecimal getPrice(int index) {
        if (index >= this.numRows) {
            throw new IllegalStateException("Attempting to get price outside of the ladder's price range!");
        }
        BigDecimal bigDecimal = this.displayTopPrice;
        BigDecimal bigDecimalMultiply = this.displayPriceIncrement.multiply(new BigDecimal(index));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimalMultiply);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return bigDecimalSubtract;
    }

    public static /* synthetic */ int getRowIndexFromPriceScaled$default(LadderPriceLevels ladderPriceLevels, BigDecimal bigDecimal, LadderPriceLevels3 ladderPriceLevels3, int i, Object obj) {
        if ((i & 2) != 0) {
            ladderPriceLevels3 = LadderPriceLevels3.DEFAULT;
        }
        return ladderPriceLevels.getRowIndexFromPriceScaled(bigDecimal, ladderPriceLevels3);
    }

    public final int getRowIndexFromPriceScaled(BigDecimal price, LadderPriceLevels3 roundingMode) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        BigDecimal bigDecimalSubtract = this.displayTopPrice.subtract(price);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(this.displayPriceIncrement, RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        int i = WhenMappings.$EnumSwitchMapping$0[roundingMode.ordinal()];
        if (i == 1) {
            return BigDecimals7.toIntRoundUp(bigDecimalDivide);
        }
        if (i == 2) {
            return BigDecimals7.toIntRoundDown(bigDecimalDivide);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return BigDecimals7.toIntRounded(bigDecimalDivide);
    }

    public final Integer getExactRowIndexFromPrice(BigDecimal price) {
        Intrinsics.checkNotNullParameter(price, "price");
        BigDecimal bigDecimalSubtract = this.displayTopPrice.subtract(price);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(this.displayPriceIncrement, RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        try {
            return Integer.valueOf(bigDecimalDivide.intValueExact());
        } catch (ArithmeticException unused) {
            return null;
        }
    }

    public final String getPriceDisplay(int index) {
        Map<Integer, String> map = this.priceDisplayCache;
        Integer numValueOf = Integer.valueOf(index);
        String withPriceIncrement$default = map.get(numValueOf);
        if (withPriceIncrement$default == null) {
            withPriceIncrement$default = FuturesProduct5.formatWithPriceIncrement$default(this.priceIncrement, getPrice(index), null, 4, null);
            map.put(numValueOf, withPriceIncrement$default);
        }
        return withPriceIncrement$default;
    }

    public static /* synthetic */ LadderPriceLevels expand$default(LadderPriceLevels ladderPriceLevels, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 200;
        }
        return ladderPriceLevels.expand(z, i);
    }

    public final LadderPriceLevels expand(boolean expandOnTop, int defaultRowsPerSide) {
        BigDecimal bigDecimalAdd;
        BigDecimal bigDecimalSubtract;
        BigDecimal bigDecimalMultiply = this.displayPriceIncrement.multiply(new BigDecimal(defaultRowsPerSide));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        if (expandOnTop) {
            bigDecimalAdd = this.topPrice.add(bigDecimalMultiply);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        } else {
            bigDecimalAdd = this.topPrice;
        }
        if (!expandOnTop) {
            bigDecimalSubtract = this.bottomPrice.subtract(bigDecimalMultiply);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        } else {
            bigDecimalSubtract = this.bottomPrice;
        }
        return new LadderPriceLevels(bigDecimalAdd, bigDecimalSubtract, this.priceIncrement, this.scale);
    }

    public final LadderPriceLevels copyForZoom(int newZoomScale) {
        BigDecimal bigDecimalMultiply = copy$default(this, null, null, null, newZoomScale, 7, null).displayPriceIncrement.multiply(new BigDecimal(MathKt.roundToInt(Math.ceil(RangesKt.coerceAtLeast(this.numRows - r8.numRows, 0) / 2.0d))));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalAdd = this.topPrice.add(bigDecimalMultiply);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        BigDecimal bigDecimalSubtract = this.bottomPrice.subtract(bigDecimalMultiply);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return copy$default(this, bigDecimalAdd, bigDecimalSubtract, null, newZoomScale, 4, null);
    }

    /* compiled from: LadderPriceLevels.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/LadderPriceLevels$Companion;", "", "<init>", "()V", "DEFAULT_ROWS_PER_SIDE", "", "updateLadderPriceLevels", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderPriceLevels;", "oldLadderPriceLevels", "newLadderPriceData", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderPriceData;", "newProduct", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;", "newPendingOrders", "", "Lcom/robinhood/android/models/futures/db/UiFuturesOrder;", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LadderPriceLevels updateLadderPriceLevels(LadderPriceLevels oldLadderPriceLevels, LadderPriceData newLadderPriceData, FuturesProduct newProduct, List<UiFuturesOrder> newPendingOrders) {
            Intrinsics.checkNotNullParameter(newLadderPriceData, "newLadderPriceData");
            List listSorted = null;
            BigDecimal bigDecimalAdd = oldLadderPriceLevels != null ? oldLadderPriceLevels.topPrice : null;
            BigDecimal bigDecimalSubtract = oldLadderPriceLevels != null ? oldLadderPriceLevels.bottomPrice : null;
            BigDecimal priceIncrements = oldLadderPriceLevels != null ? oldLadderPriceLevels.priceIncrement : null;
            BigDecimal lastTradePrice = newLadderPriceData.getLastTradePrice();
            if (lastTradePrice != null) {
                if (bigDecimalAdd == null) {
                    priceIncrements = newProduct != null ? newProduct.getPriceIncrements() : null;
                    if (priceIncrements != null) {
                        BigDecimal bigDecimalMultiply = priceIncrements.multiply(new BigDecimal(200));
                        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                        bigDecimalAdd = lastTradePrice.add(bigDecimalMultiply);
                        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
                        bigDecimalSubtract = lastTradePrice.subtract(bigDecimalMultiply);
                        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                    }
                } else if (lastTradePrice.compareTo(bigDecimalAdd) > 0) {
                    bigDecimalAdd = lastTradePrice;
                } else if (lastTradePrice.compareTo(bigDecimalSubtract) < 0) {
                    bigDecimalSubtract = lastTradePrice;
                }
            }
            if (bigDecimalAdd != null) {
                if (newPendingOrders != null) {
                    ArrayList arrayList = new ArrayList();
                    for (UiFuturesOrder uiFuturesOrder : newPendingOrders) {
                        BigDecimal limitPrice = uiFuturesOrder.getOrder().getLimitPrice();
                        if (limitPrice == null) {
                            limitPrice = uiFuturesOrder.getOrder().getStopPrice();
                        }
                        if (limitPrice != null) {
                            arrayList.add(limitPrice);
                        }
                    }
                    listSorted = CollectionsKt.sorted(arrayList);
                }
                if (listSorted != null && (!listSorted.isEmpty())) {
                    if (((BigDecimal) CollectionsKt.first(listSorted)).compareTo(bigDecimalSubtract) < 0) {
                        BigDecimal bigDecimal = (BigDecimal) CollectionsKt.first(listSorted);
                        BigDecimal bigDecimal2 = priceIncrements == null ? BigDecimal.ZERO : priceIncrements;
                        Intrinsics.checkNotNull(bigDecimal2);
                        bigDecimalSubtract = bigDecimal.subtract(bigDecimal2);
                        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                    }
                    if (((BigDecimal) CollectionsKt.last(listSorted)).compareTo(bigDecimalAdd) > 0) {
                        BigDecimal bigDecimal3 = (BigDecimal) CollectionsKt.last(listSorted);
                        BigDecimal bigDecimal4 = priceIncrements == null ? BigDecimal.ZERO : priceIncrements;
                        Intrinsics.checkNotNull(bigDecimal4);
                        bigDecimalAdd = bigDecimal3.add(bigDecimal4);
                        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
                    }
                }
            }
            if (bigDecimalAdd == null || bigDecimalSubtract == null || priceIncrements == null) {
                return oldLadderPriceLevels;
            }
            return new LadderPriceLevels(bigDecimalAdd, bigDecimalSubtract, priceIncrements, oldLadderPriceLevels != null ? oldLadderPriceLevels.getScale() : 1);
        }
    }
}
