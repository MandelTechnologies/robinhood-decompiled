package com.robinhood.android.optionchain.chainsettings;

import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.options.aggregatequotes.ClientAggregateOptionStrategyQuote;
import com.robinhood.models.Decimals;
import com.robinhood.models.Decimals3;
import com.robinhood.models.Decimals4;
import com.robinhood.models.p320db.OptionChainAvailableMetrics;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionQuote;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.UnderlyingQuote;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainMetricValueConverter.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a \u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a\u001c\u0010\f\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u000e"}, m3636d2 = {"getChainMetricValue", "", "Lcom/robinhood/models/db/OptionChainAvailableMetrics$MetricType;", "optionQuote", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "underlyingQuote", "Lcom/robinhood/models/ui/UnderlyingQuote;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "getStrategyBuilderMetricValue", "strategyQuote", "Lcom/robinhood/android/options/aggregatequotes/ClientAggregateOptionStrategyQuote;", "getBreakevenDisplay", "Lcom/robinhood/models/db/OptionQuote;", "feature-lib-option-chain_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionchain.chainsettings.OptionChainMetricValueConverterKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class OptionChainMetricValueConverter {

    /* compiled from: OptionChainMetricValueConverter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionchain.chainsettings.OptionChainMetricValueConverterKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionChainAvailableMetrics.MetricType.values().length];
            try {
                iArr[OptionChainAvailableMetrics.MetricType.BREAKEVEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionChainAvailableMetrics.MetricType.TO_BREAKEVEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionChainAvailableMetrics.MetricType.BID_PRICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OptionChainAvailableMetrics.MetricType.BID_SIZE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OptionChainAvailableMetrics.MetricType.ASK_PRICE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OptionChainAvailableMetrics.MetricType.ASK_SIZE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OptionChainAvailableMetrics.MetricType.MARK_PRICE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[OptionChainAvailableMetrics.MetricType.LAST_TRADE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[OptionChainAvailableMetrics.MetricType.IMPLIED_VOLATILITY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[OptionChainAvailableMetrics.MetricType.PREVIOUS_CLOSE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[OptionChainAvailableMetrics.MetricType.HIGH_PRICE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[OptionChainAvailableMetrics.MetricType.LOW_PRICE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[OptionChainAvailableMetrics.MetricType.CHANCE_OF_PROFIT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[OptionChainAvailableMetrics.MetricType.VOLUME.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[OptionChainAvailableMetrics.MetricType.OPEN_INTEREST.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[OptionChainAvailableMetrics.MetricType.DELTA.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[OptionChainAvailableMetrics.MetricType.GAMMA.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[OptionChainAvailableMetrics.MetricType.THETA.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[OptionChainAvailableMetrics.MetricType.VEGA.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[OptionChainAvailableMetrics.MetricType.RHO.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[OptionChainAvailableMetrics.MetricType.PERCENT_CHANGE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[OptionChainAvailableMetrics.MetricType.NET_CHANGE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[OptionChainAvailableMetrics.MetricType.UNSUPPORTED.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getChainMetricValue(OptionChainAvailableMetrics.MetricType metricType, OptionInstrumentQuote optionInstrumentQuote, UnderlyingQuote underlyingQuote, OrderSide orderSide) {
        Intrinsics.checkNotNullParameter(metricType, "<this>");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        if (optionInstrumentQuote == null) {
            return null;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[metricType.ordinal()]) {
            case 1:
                return getBreakevenDisplay(optionInstrumentQuote, underlyingQuote);
            case 2:
                return Formats.getPercentDeltaWithHundredthDecimalFormat().format(optionInstrumentQuote.getBreakevenPercentage(underlyingQuote));
            case 3:
                return Formats.getPriceFormat().format(optionInstrumentQuote.getBidPrice().getUnsignedValue());
            case 4:
                return Formats.getShareQuantityFormat().format(optionInstrumentQuote.getBidSize());
            case 5:
                return Formats.getPriceFormat().format(optionInstrumentQuote.getAskPrice().getUnsignedValue());
            case 6:
                return Formats.getShareQuantityFormat().format(optionInstrumentQuote.getAskSize());
            case 7:
                return Formats.getPriceFormat().format(optionInstrumentQuote.getAdjustedMarkPrice().getUnsignedValue());
            case 8:
                NumberFormatter priceFormat = Formats.getPriceFormat();
                Decimals4 lastTradePrice = optionInstrumentQuote.getLastTradePrice();
                return NumberFormatter.DefaultImpls.formatNullable$default(priceFormat, lastTradePrice != null ? lastTradePrice.getUnsignedValue() : null, null, 2, null);
            case 9:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPercentDeltaWithHundredthDecimalFormat(), optionInstrumentQuote.getImpliedVolatility(), null, 2, null);
            case 10:
                return Formats.getPriceFormat().format(optionInstrumentQuote.getPreviousClosePrice().getUnsignedValue());
            case 11:
                NumberFormatter priceFormat2 = Formats.getPriceFormat();
                Decimals4 highPrice = optionInstrumentQuote.getHighPrice();
                return NumberFormatter.DefaultImpls.formatNullable$default(priceFormat2, highPrice != null ? highPrice.getUnsignedValue() : null, null, 2, null);
            case 12:
                NumberFormatter priceFormat3 = Formats.getPriceFormat();
                Decimals4 lowPrice = optionInstrumentQuote.getLowPrice();
                return NumberFormatter.DefaultImpls.formatNullable$default(priceFormat3, lowPrice != null ? lowPrice.getUnsignedValue() : null, null, 2, null);
            case 13:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPercentDeltaWithHundredthDecimalFormat(), optionInstrumentQuote.getChanceOfProfit(orderSide), null, 2, null);
            case 14:
                return Formats.getIntegerFormat().format(optionInstrumentQuote.getVolume());
            case 15:
                return Formats.getIntegerFormat().format(optionInstrumentQuote.getOpenInterest());
            case 16:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), optionInstrumentQuote.getDelta(), null, 2, null);
            case 17:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), optionInstrumentQuote.getGamma(), null, 2, null);
            case 18:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), optionInstrumentQuote.getTheta(), null, 2, null);
            case 19:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), optionInstrumentQuote.getVega(), null, 2, null);
            case 20:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), optionInstrumentQuote.getRho(), null, 2, null);
            case 21:
                return Formats.getPercentDeltaWithHundredthDecimalFormat().format(optionInstrumentQuote.getTodaysPercentChange());
            case 22:
                return Formats.getPriceFormat().format(optionInstrumentQuote.getTodaysNetChange());
            case 23:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String getStrategyBuilderMetricValue(OptionChainAvailableMetrics.MetricType metricType, ClientAggregateOptionStrategyQuote clientAggregateOptionStrategyQuote, UnderlyingQuote underlyingQuote) {
        Decimals bidPrice;
        Decimals3 askPrice;
        Decimals adjustedMarkPrice;
        Decimals lastTradePrice;
        Decimals previousClosePrice;
        Decimals highPrice;
        Decimals lowPrice;
        Intrinsics.checkNotNullParameter(metricType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[metricType.ordinal()]) {
            case 1:
                return getBreakevenDisplay(clientAggregateOptionStrategyQuote, underlyingQuote);
            case 2:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPercentDeltaWithHundredthDecimalFormat(), clientAggregateOptionStrategyQuote != null ? clientAggregateOptionStrategyQuote.getBreakevenPercentage(underlyingQuote) : null, null, 2, null);
            case 3:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), (clientAggregateOptionStrategyQuote == null || (bidPrice = clientAggregateOptionStrategyQuote.getBidPrice()) == null) ? null : bidPrice.getRawValue(), null, 2, null);
            case 4:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getShareQuantityFormat(), clientAggregateOptionStrategyQuote != null ? clientAggregateOptionStrategyQuote.getBidSize() : null, null, 2, null);
            case 5:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), (clientAggregateOptionStrategyQuote == null || (askPrice = clientAggregateOptionStrategyQuote.getAskPrice()) == null) ? null : askPrice.getRawValue(), null, 2, null);
            case 6:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getShareQuantityFormat(), clientAggregateOptionStrategyQuote != null ? clientAggregateOptionStrategyQuote.getAskSize() : null, null, 2, null);
            case 7:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), (clientAggregateOptionStrategyQuote == null || (adjustedMarkPrice = clientAggregateOptionStrategyQuote.getAdjustedMarkPrice()) == null) ? null : adjustedMarkPrice.getUnsignedValue(), null, 2, null);
            case 8:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), (clientAggregateOptionStrategyQuote == null || (lastTradePrice = clientAggregateOptionStrategyQuote.getLastTradePrice()) == null) ? null : lastTradePrice.getUnsignedValue(), null, 2, null);
            case 9:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPercentDeltaWithHundredthDecimalFormat(), clientAggregateOptionStrategyQuote != null ? clientAggregateOptionStrategyQuote.getImpliedVolatility() : null, null, 2, null);
            case 10:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), (clientAggregateOptionStrategyQuote == null || (previousClosePrice = clientAggregateOptionStrategyQuote.getPreviousClosePrice()) == null) ? null : previousClosePrice.getUnsignedValue(), null, 2, null);
            case 11:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), (clientAggregateOptionStrategyQuote == null || (highPrice = clientAggregateOptionStrategyQuote.getHighPrice()) == null) ? null : highPrice.getUnsignedValue(), null, 2, null);
            case 12:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), (clientAggregateOptionStrategyQuote == null || (lowPrice = clientAggregateOptionStrategyQuote.getLowPrice()) == null) ? null : lowPrice.getUnsignedValue(), null, 2, null);
            case 13:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPercentDeltaWithHundredthDecimalFormat(), clientAggregateOptionStrategyQuote != null ? clientAggregateOptionStrategyQuote.getChanceOfProfit() : null, null, 2, null);
            case 14:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getIntegerFormat(), clientAggregateOptionStrategyQuote != null ? clientAggregateOptionStrategyQuote.getVolume() : null, null, 2, null);
            case 15:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getIntegerFormat(), clientAggregateOptionStrategyQuote != null ? clientAggregateOptionStrategyQuote.getOpenInterest() : null, null, 2, null);
            case 16:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), clientAggregateOptionStrategyQuote != null ? clientAggregateOptionStrategyQuote.getDelta() : null, null, 2, null);
            case 17:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), clientAggregateOptionStrategyQuote != null ? clientAggregateOptionStrategyQuote.getGamma() : null, null, 2, null);
            case 18:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), clientAggregateOptionStrategyQuote != null ? clientAggregateOptionStrategyQuote.getTheta() : null, null, 2, null);
            case 19:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), clientAggregateOptionStrategyQuote != null ? clientAggregateOptionStrategyQuote.getVega() : null, null, 2, null);
            case 20:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), clientAggregateOptionStrategyQuote != null ? clientAggregateOptionStrategyQuote.getRho() : null, null, 2, null);
            case 21:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPercentDeltaWithHundredthDecimalFormat(), clientAggregateOptionStrategyQuote != null ? clientAggregateOptionStrategyQuote.getTodaysPercentChange() : null, null, 2, null);
            case 22:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), clientAggregateOptionStrategyQuote != null ? clientAggregateOptionStrategyQuote.getTodaysNetChange() : null, null, 2, null);
            case 23:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String getBreakevenDisplay(OptionQuote optionQuote, UnderlyingQuote underlyingQuote) {
        Decimals breakEvenPrice;
        Decimals breakEvenPrice2;
        if (underlyingQuote instanceof UnderlyingQuote.EquityQuote) {
            return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), (optionQuote == null || (breakEvenPrice2 = optionQuote.getBreakEvenPrice()) == null) ? null : breakEvenPrice2.getUnsignedValue(), null, 2, null);
        }
        if (underlyingQuote instanceof UnderlyingQuote.IndexQuote) {
            return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getValueFormat(), (optionQuote == null || (breakEvenPrice = optionQuote.getBreakEvenPrice()) == null) ? null : breakEvenPrice.getUnsignedValue(), null, 2, null);
        }
        if (underlyingQuote == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
