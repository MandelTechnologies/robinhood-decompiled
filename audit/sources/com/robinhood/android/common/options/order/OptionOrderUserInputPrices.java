package com.robinhood.android.common.options.order;

import com.robinhood.models.p320db.OptionOrderType;
import com.robinhood.models.p320db.OrderTrigger;
import com.robinhood.models.p320db.OrderType;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: OptionOrderUserInputPrices.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004*+,-B/\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000eR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0010R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0010R\u0013\u0010 \u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0010R\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)\u0082\u0001\u0004./01¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/common/options/order/OptionOrderUserInputPrices;", "", "optionOrderType", "Lcom/robinhood/models/db/OptionOrderType;", "absoluteLimitPriceWithSource", "Lcom/robinhood/android/common/options/order/LimitPriceWithSource;", "absoluteStopPriceForStopLimit", "Ljava/math/BigDecimal;", "absoluteStopPriceOrDefaultForStopMarket", "<init>", "(Lcom/robinhood/models/db/OptionOrderType;Lcom/robinhood/android/common/options/order/LimitPriceWithSource;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getOptionOrderType", "()Lcom/robinhood/models/db/OptionOrderType;", "getAbsoluteLimitPriceWithSource", "()Lcom/robinhood/android/common/options/order/LimitPriceWithSource;", "getAbsoluteStopPriceForStopLimit", "()Ljava/math/BigDecimal;", "getAbsoluteStopPriceOrDefaultForStopMarket", "setLimitPriceWithSource", "limitPriceWithSource", "setStopPriceForStopLimitOrder", "stopPrice", "setStopPriceTextForStopMarket", "stopMarketPriceText", "", "limitPriceWithSourceInViewState", "getLimitPriceWithSourceInViewState", "absoluteUserLimitPriceByOrderType", "absoluteLimitPriceFromBidAskBarToUpdateTextInput", "getAbsoluteLimitPriceFromBidAskBarToUpdateTextInput", "absoluteLimitPriceForAnalytics", "getAbsoluteLimitPriceForAnalytics", "absoluteLimitPriceForMarketability", "getAbsoluteLimitPriceForMarketability", "trigger", "Lcom/robinhood/models/db/OrderTrigger;", "getTrigger", "()Lcom/robinhood/models/db/OrderTrigger;", "type", "Lcom/robinhood/models/db/OrderType;", "getType", "()Lcom/robinhood/models/db/OrderType;", "Limit", "StopLimit", "StopMarket", "Market", "Lcom/robinhood/android/common/options/order/OptionOrderUserInputPrices$Limit;", "Lcom/robinhood/android/common/options/order/OptionOrderUserInputPrices$Market;", "Lcom/robinhood/android/common/options/order/OptionOrderUserInputPrices$StopLimit;", "Lcom/robinhood/android/common/options/order/OptionOrderUserInputPrices$StopMarket;", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class OptionOrderUserInputPrices {
    public static final int $stable = 8;
    private final BigDecimal absoluteLimitPriceForAnalytics;
    private final BigDecimal absoluteLimitPriceForMarketability;
    private final BigDecimal absoluteLimitPriceFromBidAskBarToUpdateTextInput;
    private final LimitPriceWithSource absoluteLimitPriceWithSource;
    private final BigDecimal absoluteStopPriceForStopLimit;
    private final BigDecimal absoluteStopPriceOrDefaultForStopMarket;
    private final BigDecimal absoluteUserLimitPriceByOrderType;
    private final LimitPriceWithSource limitPriceWithSourceInViewState;
    private final OptionOrderType optionOrderType;
    private final OrderTrigger trigger;
    private final OrderType type;

    /* compiled from: OptionOrderUserInputPrices.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OptionOrderType.values().length];
            try {
                iArr[OptionOrderType.LIMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionOrderType.STOP_LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionOrderType.MARKET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OptionOrderType.STOP_MARKET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OptionOrderLimitPrice.values().length];
            try {
                iArr2[OptionOrderLimitPrice.TEXT_INPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[OptionOrderLimitPrice.BID_ASK_BAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public /* synthetic */ OptionOrderUserInputPrices(OptionOrderType optionOrderType, LimitPriceWithSource limitPriceWithSource, BigDecimal bigDecimal, BigDecimal bigDecimal2, DefaultConstructorMarker defaultConstructorMarker) {
        this(optionOrderType, limitPriceWithSource, bigDecimal, bigDecimal2);
    }

    private OptionOrderUserInputPrices(OptionOrderType optionOrderType, LimitPriceWithSource limitPriceWithSource, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        BigDecimal limitPrice;
        this.optionOrderType = optionOrderType;
        this.absoluteLimitPriceWithSource = limitPriceWithSource;
        this.absoluteStopPriceForStopLimit = bigDecimal;
        this.absoluteStopPriceOrDefaultForStopMarket = bigDecimal2;
        this.limitPriceWithSourceInViewState = limitPriceWithSource;
        int i = WhenMappings.$EnumSwitchMapping$0[optionOrderType.ordinal()];
        BigDecimal limitPrice2 = null;
        if (i != 1) {
            if (i == 2) {
                limitPrice = limitPriceWithSource != null ? limitPriceWithSource.getLimitPrice() : limitPrice;
            } else if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            limitPrice = limitPriceWithSource != null ? limitPriceWithSource.getLimitPrice() : null;
        }
        this.absoluteUserLimitPriceByOrderType = limitPrice;
        OptionOrderLimitPrice source = limitPriceWithSource != null ? limitPriceWithSource.getSource() : null;
        int i2 = source == null ? -1 : WhenMappings.$EnumSwitchMapping$1[source.ordinal()];
        if (i2 != -1 && i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            limitPrice2 = limitPriceWithSource.getLimitPrice();
        }
        this.absoluteLimitPriceFromBidAskBarToUpdateTextInput = limitPrice2;
        this.absoluteLimitPriceForAnalytics = limitPrice;
        this.absoluteLimitPriceForMarketability = limitPrice;
        this.trigger = OptionOrderType2.toOrderConfiguration(optionOrderType).getTrigger();
        this.type = OptionOrderType2.toOrderConfiguration(optionOrderType).getType();
    }

    public final OptionOrderType getOptionOrderType() {
        return this.optionOrderType;
    }

    public final LimitPriceWithSource getAbsoluteLimitPriceWithSource() {
        return this.absoluteLimitPriceWithSource;
    }

    public final BigDecimal getAbsoluteStopPriceForStopLimit() {
        return this.absoluteStopPriceForStopLimit;
    }

    public final BigDecimal getAbsoluteStopPriceOrDefaultForStopMarket() {
        return this.absoluteStopPriceOrDefaultForStopMarket;
    }

    /* compiled from: OptionOrderUserInputPrices.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0015\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/options/order/OptionOrderUserInputPrices$Limit;", "Lcom/robinhood/android/common/options/order/OptionOrderUserInputPrices;", "limitPriceWithSource", "Lcom/robinhood/android/common/options/order/LimitPriceWithSource;", "<init>", "(Lcom/robinhood/android/common/options/order/LimitPriceWithSource;)V", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Limit extends OptionOrderUserInputPrices {
        public static final int $stable = 8;
        private final LimitPriceWithSource limitPriceWithSource;

        /* renamed from: component1, reason: from getter */
        private final LimitPriceWithSource getLimitPriceWithSource() {
            return this.limitPriceWithSource;
        }

        public static /* synthetic */ Limit copy$default(Limit limit, LimitPriceWithSource limitPriceWithSource, int i, Object obj) {
            if ((i & 1) != 0) {
                limitPriceWithSource = limit.limitPriceWithSource;
            }
            return limit.copy(limitPriceWithSource);
        }

        public final Limit copy(LimitPriceWithSource limitPriceWithSource) {
            return new Limit(limitPriceWithSource);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Limit) && Intrinsics.areEqual(this.limitPriceWithSource, ((Limit) other).limitPriceWithSource);
        }

        public int hashCode() {
            LimitPriceWithSource limitPriceWithSource = this.limitPriceWithSource;
            if (limitPriceWithSource == null) {
                return 0;
            }
            return limitPriceWithSource.hashCode();
        }

        public String toString() {
            return "Limit(limitPriceWithSource=" + this.limitPriceWithSource + ")";
        }

        public Limit(LimitPriceWithSource limitPriceWithSource) {
            super(OptionOrderType.LIMIT, limitPriceWithSource, null, null, null);
            this.limitPriceWithSource = limitPriceWithSource;
        }
    }

    /* compiled from: OptionOrderUserInputPrices.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0005HÂ\u0003J!\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/common/options/order/OptionOrderUserInputPrices$StopLimit;", "Lcom/robinhood/android/common/options/order/OptionOrderUserInputPrices;", "limitPriceWithSource", "Lcom/robinhood/android/common/options/order/LimitPriceWithSource;", "stopPriceForStopLimit", "Ljava/math/BigDecimal;", "<init>", "(Lcom/robinhood/android/common/options/order/LimitPriceWithSource;Ljava/math/BigDecimal;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StopLimit extends OptionOrderUserInputPrices {
        public static final int $stable = 8;
        private final LimitPriceWithSource limitPriceWithSource;
        private final BigDecimal stopPriceForStopLimit;

        /* renamed from: component1, reason: from getter */
        private final LimitPriceWithSource getLimitPriceWithSource() {
            return this.limitPriceWithSource;
        }

        /* renamed from: component2, reason: from getter */
        private final BigDecimal getStopPriceForStopLimit() {
            return this.stopPriceForStopLimit;
        }

        public static /* synthetic */ StopLimit copy$default(StopLimit stopLimit, LimitPriceWithSource limitPriceWithSource, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                limitPriceWithSource = stopLimit.limitPriceWithSource;
            }
            if ((i & 2) != 0) {
                bigDecimal = stopLimit.stopPriceForStopLimit;
            }
            return stopLimit.copy(limitPriceWithSource, bigDecimal);
        }

        public final StopLimit copy(LimitPriceWithSource limitPriceWithSource, BigDecimal stopPriceForStopLimit) {
            return new StopLimit(limitPriceWithSource, stopPriceForStopLimit);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StopLimit)) {
                return false;
            }
            StopLimit stopLimit = (StopLimit) other;
            return Intrinsics.areEqual(this.limitPriceWithSource, stopLimit.limitPriceWithSource) && Intrinsics.areEqual(this.stopPriceForStopLimit, stopLimit.stopPriceForStopLimit);
        }

        public int hashCode() {
            LimitPriceWithSource limitPriceWithSource = this.limitPriceWithSource;
            int iHashCode = (limitPriceWithSource == null ? 0 : limitPriceWithSource.hashCode()) * 31;
            BigDecimal bigDecimal = this.stopPriceForStopLimit;
            return iHashCode + (bigDecimal != null ? bigDecimal.hashCode() : 0);
        }

        public String toString() {
            return "StopLimit(limitPriceWithSource=" + this.limitPriceWithSource + ", stopPriceForStopLimit=" + this.stopPriceForStopLimit + ")";
        }

        public StopLimit(LimitPriceWithSource limitPriceWithSource, BigDecimal bigDecimal) {
            super(OptionOrderType.STOP_LIMIT, limitPriceWithSource, bigDecimal, null, null);
            this.limitPriceWithSource = limitPriceWithSource;
            this.stopPriceForStopLimit = bigDecimal;
        }
    }

    /* compiled from: OptionOrderUserInputPrices.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/common/options/order/OptionOrderUserInputPrices$StopMarket;", "Lcom/robinhood/android/common/options/order/OptionOrderUserInputPrices;", "stopPriceText", "", "stopPriceHint", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getStopPriceText", "()Ljava/lang/String;", "getStopPriceHint", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class StopMarket extends OptionOrderUserInputPrices {
        public static final int $stable = 8;
        private final String stopPriceHint;
        private final String stopPriceText;

        public static /* synthetic */ StopMarket copy$default(StopMarket stopMarket, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stopMarket.stopPriceText;
            }
            if ((i & 2) != 0) {
                str2 = stopMarket.stopPriceHint;
            }
            return stopMarket.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getStopPriceText() {
            return this.stopPriceText;
        }

        /* renamed from: component2, reason: from getter */
        public final String getStopPriceHint() {
            return this.stopPriceHint;
        }

        public final StopMarket copy(String stopPriceText, String stopPriceHint) {
            Intrinsics.checkNotNullParameter(stopPriceText, "stopPriceText");
            Intrinsics.checkNotNullParameter(stopPriceHint, "stopPriceHint");
            return new StopMarket(stopPriceText, stopPriceHint);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StopMarket)) {
                return false;
            }
            StopMarket stopMarket = (StopMarket) other;
            return Intrinsics.areEqual(this.stopPriceText, stopMarket.stopPriceText) && Intrinsics.areEqual(this.stopPriceHint, stopMarket.stopPriceHint);
        }

        public int hashCode() {
            return (this.stopPriceText.hashCode() * 31) + this.stopPriceHint.hashCode();
        }

        public String toString() {
            return "StopMarket(stopPriceText=" + this.stopPriceText + ", stopPriceHint=" + this.stopPriceHint + ")";
        }

        public final String getStopPriceText() {
            return this.stopPriceText;
        }

        public final String getStopPriceHint() {
            return this.stopPriceHint;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StopMarket(String stopPriceText, String stopPriceHint) {
            super(OptionOrderType.STOP_MARKET, null, null, StringsKt.toBigDecimalOrNull(stopPriceText.length() == 0 ? stopPriceHint : stopPriceText), null);
            Intrinsics.checkNotNullParameter(stopPriceText, "stopPriceText");
            Intrinsics.checkNotNullParameter(stopPriceHint, "stopPriceHint");
            this.stopPriceText = stopPriceText;
            this.stopPriceHint = stopPriceHint;
        }
    }

    /* compiled from: OptionOrderUserInputPrices.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/options/order/OptionOrderUserInputPrices$Market;", "Lcom/robinhood/android/common/options/order/OptionOrderUserInputPrices;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Market extends OptionOrderUserInputPrices {
        public static final Market INSTANCE = new Market();
        public static final int $stable = 8;

        public boolean equals(Object other) {
            return this == other || (other instanceof Market);
        }

        public int hashCode() {
            return 56674939;
        }

        public String toString() {
            return "Market";
        }

        private Market() {
            super(OptionOrderType.MARKET, null, null, null, null);
        }
    }

    public final OptionOrderUserInputPrices setLimitPriceWithSource(LimitPriceWithSource limitPriceWithSource) {
        if (this instanceof Limit) {
            return ((Limit) this).copy(limitPriceWithSource);
        }
        if (this instanceof StopLimit) {
            return StopLimit.copy$default((StopLimit) this, limitPriceWithSource, null, 2, null);
        }
        if ((this instanceof Market) || (this instanceof StopMarket)) {
            return this;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final OptionOrderUserInputPrices setStopPriceForStopLimitOrder(BigDecimal stopPrice) {
        if (this instanceof StopLimit) {
            return StopLimit.copy$default((StopLimit) this, null, stopPrice, 1, null);
        }
        if ((this instanceof Limit) || (this instanceof Market) || (this instanceof StopMarket)) {
            return this;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final OptionOrderUserInputPrices setStopPriceTextForStopMarket(String stopMarketPriceText) {
        Intrinsics.checkNotNullParameter(stopMarketPriceText, "stopMarketPriceText");
        if (this instanceof Limit) {
            throw new IllegalStateException("Cannot set stop price on Limit order type.");
        }
        if (this instanceof StopLimit) {
            throw new IllegalStateException("Cannot set this stop price on StopLimit order type.");
        }
        if (this instanceof Market) {
            throw new IllegalStateException("Cannot set stop price on Market order type.");
        }
        if (this instanceof StopMarket) {
            return StopMarket.copy$default((StopMarket) this, stopMarketPriceText, null, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final LimitPriceWithSource getLimitPriceWithSourceInViewState() {
        return this.limitPriceWithSourceInViewState;
    }

    public final BigDecimal getAbsoluteLimitPriceFromBidAskBarToUpdateTextInput() {
        return this.absoluteLimitPriceFromBidAskBarToUpdateTextInput;
    }

    public final BigDecimal getAbsoluteLimitPriceForAnalytics() {
        return this.absoluteLimitPriceForAnalytics;
    }

    public final BigDecimal getAbsoluteLimitPriceForMarketability() {
        return this.absoluteLimitPriceForMarketability;
    }

    public final OrderTrigger getTrigger() {
        return this.trigger;
    }

    public final OrderType getType() {
        return this.type;
    }
}
