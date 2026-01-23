package com.robinhood.android.options.lib.simulatedreturn.slider;

import android.content.res.Resources;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.options.lib.simulatedreturn.C23151R;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderViewState5;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p355ui.UnderlyingQuote;
import com.robinhood.models.util.Money;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: OptionsSimulatedReturnPriceSliderStateProvider.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u001d\u0010\u001a\u001a\u00020\u000e*\u0004\u0018\u00010\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnPriceSliderStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnPriceSliderDataState;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "reduce", "dataState", "getQuotePillState", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderQuotePillState;", "ds", "formatBigTickNumber", "", "bigTickNumberToFormat", "", "coarseIncrement", "getTicks", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderTick;", "getSliderTooltip", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderTooltip;", "getTooltipPercentText", "percent", "Ljava/math/BigDecimal;", "formatPriceText", "currencySymbol", "(Ljava/lang/Double;Ljava/lang/String;)Ljava/lang/String;", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnPriceSliderStateProvider implements StateProvider<OptionsSimulatedReturnPriceSliderDataState, OptionsSimulatedReturnSliderViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    /* compiled from: OptionsSimulatedReturnPriceSliderStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionChain.UnderlyingType.values().length];
            try {
                iArr[OptionChain.UnderlyingType.INDEX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionChain.UnderlyingType.EQUITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OptionsSimulatedReturnPriceSliderStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public OptionsSimulatedReturnSliderViewState reduce(OptionsSimulatedReturnPriceSliderDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        SliderQuotePillState quotePillState = getQuotePillState(dataState);
        return new OptionsSimulatedReturnSliderViewState(false, dataState.getDragState(), dataState.getLaunchMode(), (quotePillState == null || quotePillState.getAnchor() != OptionsSimulatedReturnSliderViewState3.START) ? null : quotePillState, (quotePillState == null || quotePillState.getAnchor() != OptionsSimulatedReturnSliderViewState3.END) ? null : quotePillState, getTicks(dataState), getSliderTooltip(dataState), dataState.getSnappedPointerPosition(), dataState.getLoggingState());
    }

    private final SliderQuotePillState getQuotePillState(OptionsSimulatedReturnPriceSliderDataState ds) {
        String str;
        OptionsSimulatedReturnSliderViewState3 optionsSimulatedReturnSliderViewState3;
        BigDecimal currentValue;
        UnderlyingQuote underlyingQuote = ds.getUnderlyingQuote();
        Double dValueOf = (underlyingQuote == null || (currentValue = underlyingQuote.getCurrentValue()) == null) ? null : Double.valueOf(currentValue.doubleValue());
        if (ds.getSnappedPointerPosition() != null && ds.getRangeLength() != null && dValueOf != null && ds.getCoarseIncrement() != null) {
            double dDoubleValue = ds.getSnappedPointerPosition().doubleValue() - dValueOf.doubleValue();
            String nullable$default = NumberFormatter.DefaultImpls.formatNullable$default(Formats.getAmountFormat(), dValueOf, null, 2, null);
            if (dDoubleValue >= 0.0d) {
                str = "< " + nullable$default;
            } else {
                str = nullable$default + " >";
            }
            if (dDoubleValue > 0.0d) {
                optionsSimulatedReturnSliderViewState3 = OptionsSimulatedReturnSliderViewState3.START;
            } else if (dDoubleValue < 0.0d) {
                optionsSimulatedReturnSliderViewState3 = OptionsSimulatedReturnSliderViewState3.END;
            }
            return new SliderQuotePillState(optionsSimulatedReturnSliderViewState3, str, Math.abs(dDoubleValue) > ds.getRangeLength().doubleValue() / ((double) 2));
        }
        return null;
    }

    private final String formatBigTickNumber(double bigTickNumberToFormat, double coarseIncrement) {
        String str = String.format("%,." + Math.abs(RangesKt.coerceAtMost(MathKt.roundToInt(Math.log10(coarseIncrement)), 0)) + "f", Arrays.copyOf(new Object[]{Double.valueOf(bigTickNumberToFormat)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private final ImmutableList<OptionsSimulatedReturnSliderViewState5> getTicks(OptionsSimulatedReturnPriceSliderDataState ds) {
        double d;
        Double d2;
        Double d3;
        BigDecimal currentValue;
        Double rangeLength = ds.getRangeLength();
        UnderlyingQuote underlyingQuote = ds.getUnderlyingQuote();
        Double dValueOf = (underlyingQuote == null || (currentValue = underlyingQuote.getCurrentValue()) == null) ? null : Double.valueOf(currentValue.doubleValue());
        if (rangeLength == null || ds.getSnappedPointerPosition() == null || ds.getMaxPointerPosition() == null || ds.getFineIncrement() == null || ds.getCoarseIncrement() == null || dValueOf == null) {
            return extensions2.toImmutableList(CollectionsKt.emptyList());
        }
        double d4 = 2;
        double dDoubleValue = ds.getSnappedPointerPosition().doubleValue() - (rangeLength.doubleValue() / d4);
        double dDoubleValue2 = ds.getSnappedPointerPosition().doubleValue() + (rangeLength.doubleValue() / d4);
        Double fineIncrement = ds.getFineIncrement();
        Double coarseIncrement = ds.getCoarseIncrement();
        double minPointerPosition = ds.getMinPointerPosition();
        Double maxPointerPosition = ds.getMaxPointerPosition();
        ArrayList arrayList = new ArrayList();
        double dDoubleValue3 = fineIncrement.doubleValue();
        double d5 = dDoubleValue % dDoubleValue3;
        if (d5 != 0.0d && Math.signum(d5) != Math.signum(dDoubleValue3)) {
            d5 += dDoubleValue3;
        }
        double dDoubleValue4 = dDoubleValue - d5;
        while (dDoubleValue4 <= dDoubleValue2) {
            if (dDoubleValue4 < minPointerPosition || dDoubleValue4 > maxPointerPosition.doubleValue()) {
                d2 = rangeLength;
                d3 = dValueOf;
            } else {
                d2 = rangeLength;
                d3 = dValueOf;
                arrayList.add(new OptionsSimulatedReturnSliderViewState5.SmallTick((float) ((dDoubleValue4 - dDoubleValue) / rangeLength.doubleValue())));
            }
            dDoubleValue4 += fineIncrement.doubleValue();
            rangeLength = d2;
            dValueOf = d3;
        }
        Double d6 = rangeLength;
        Double d7 = dValueOf;
        double dDoubleValue5 = coarseIncrement.doubleValue();
        double d8 = dDoubleValue % dDoubleValue5;
        if (d8 != 0.0d && Math.signum(d8) != Math.signum(dDoubleValue5)) {
            d8 += dDoubleValue5;
        }
        double dDoubleValue6 = dDoubleValue - d8;
        while (dDoubleValue6 <= dDoubleValue2) {
            if (minPointerPosition > dDoubleValue6 || dDoubleValue6 > maxPointerPosition.doubleValue()) {
                d = dDoubleValue;
            } else {
                d = dDoubleValue;
                arrayList.add(new OptionsSimulatedReturnSliderViewState5.BigTick((float) ((dDoubleValue6 - dDoubleValue) / d6.doubleValue()), formatBigTickNumber(dDoubleValue6, ds.getCoarseIncrement().doubleValue())));
            }
            dDoubleValue6 += coarseIncrement.doubleValue();
            dDoubleValue = d;
        }
        arrayList.add(new OptionsSimulatedReturnSliderViewState5.CurrentPriceTick((float) ((d7.doubleValue() - dDoubleValue) / d6.doubleValue())));
        return extensions2.toImmutableList(arrayList);
    }

    private final SliderTooltip getSliderTooltip(OptionsSimulatedReturnPriceSliderDataState ds) throws Resources.NotFoundException {
        String symbol;
        OptionChain.UnderlyingType underlyingType;
        int i;
        int i2;
        String str;
        Money lastRegularHoursTradePrice;
        Currency currency;
        if (ds.getUnderlyingQuote() == null || ds.getSnappedPointerPosition() == null || ds.getFineIncrement() == null) {
            return new SliderTooltip("-", "-", "-", "", "");
        }
        Quote equityQuote = ds.getEquityQuote();
        if (equityQuote == null || (lastRegularHoursTradePrice = equityQuote.getLastRegularHoursTradePrice()) == null || (currency = lastRegularHoursTradePrice.getCurrency()) == null || (symbol = currency.getSymbol()) == null) {
            symbol = "";
        }
        String symbol2 = ds.getUnderlyingQuote().getSymbol();
        BigDecimal sliderDisplayPrice = OptionsSimulatedReturnPriceSliderStateProvider2.getSliderDisplayPrice(ds.getUnderlyingQuote().getCurrentValue().doubleValue());
        BigDecimal sliderDisplayPrice2 = OptionsSimulatedReturnPriceSliderStateProvider2.getSliderDisplayPrice(ds.getSnappedPointerPosition().doubleValue());
        String priceText = formatPriceText(ds.getSnappedPointerPosition(), symbol);
        BigDecimal bigDecimalSubtract = sliderDisplayPrice2.subtract(sliderDisplayPrice);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        String str2 = priceText + " (" + getTooltipPercentText(BigDecimals7.safeDivide(bigDecimalSubtract, sliderDisplayPrice, 7, RoundingMode.HALF_EVEN)) + ")";
        String strRepeat = StringsKt.repeat("8", str2.length());
        UnderlyingQuote underlyingQuote = ds.getUnderlyingQuote();
        if (underlyingQuote instanceof UnderlyingQuote.EquityQuote) {
            underlyingType = OptionChain.UnderlyingType.EQUITY;
        } else {
            if (!(underlyingQuote instanceof UnderlyingQuote.IndexQuote)) {
                throw new NoWhenBranchMatchedException();
            }
            underlyingType = OptionChain.UnderlyingType.INDEX;
        }
        Resources resources = this.resources;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i3 = iArr[underlyingType.ordinal()];
        if (i3 == 1) {
            i = C23151R.string.options_simulated_return_slider_current_symbol_value_text;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C23151R.string.options_simulated_return_slider_current_symbol_price_text;
        }
        String string2 = resources.getString(i, symbol2);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        if (sliderDisplayPrice.compareTo(sliderDisplayPrice2) == 0) {
            str = string2;
        } else {
            Resources resources2 = this.resources;
            int i4 = iArr[underlyingType.ordinal()];
            if (i4 == 1) {
                i2 = C23151R.string.options_simulated_return_slider_symbol_value_text;
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = C23151R.string.options_simulated_return_slider_symbol_price_text;
            }
            String string3 = resources2.getString(i2, symbol2);
            Intrinsics.checkNotNull(string3);
            str = string3;
        }
        return new SliderTooltip(priceText, str2, strRepeat, str, string2);
    }

    private final String getTooltipPercentText(BigDecimal percent) {
        String str = Formats.getPercentDeltaWithHundredthDecimalFormat().format(percent);
        return (Intrinsics.areEqual(str, "+0.00%") || Intrinsics.areEqual(str, "-0.00%")) ? "0.00%" : str;
    }

    private final String formatPriceText(Double d, String str) {
        if (d == null || str == null) {
            return "-";
        }
        String str2 = String.format("%,.2f", Arrays.copyOf(new Object[]{d}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str + str2;
    }
}
