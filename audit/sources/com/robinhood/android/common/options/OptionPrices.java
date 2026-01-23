package com.robinhood.android.common.options;

import com.robinhood.models.Decimals4;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.OptionSimulatedChartLegBundle;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionPrices.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a6\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, m3636d2 = {"getOptionStrategyPrice", "Ljava/math/BigDecimal;", "legBundles", "", "Lcom/robinhood/models/ui/OptionSimulatedChartLegBundle;", "optionQuotes", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "defaultPricingSetting", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "feature-lib-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.options.OptionPricesKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class OptionPrices {
    public static final BigDecimal getOptionStrategyPrice(List<OptionSimulatedChartLegBundle> list, Map<UUID, OptionInstrumentQuote> optionQuotes, OptionSettings.DefaultPricingSetting defaultPricingSetting) {
        OptionSettings.DefaultPricingSetting defaultPricingSetting2;
        Intrinsics.checkNotNullParameter(optionQuotes, "optionQuotes");
        if (list != null) {
            List<OptionSimulatedChartLegBundle> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (optionQuotes.get(((OptionSimulatedChartLegBundle) it.next()).getOptionInstrument().getId()) == null) {
                    }
                }
            }
            BigDecimal bigDecimalAdd = BigDecimal.ZERO;
            for (Object obj : list2) {
                Intrinsics.checkNotNull(bigDecimalAdd);
                OptionSimulatedChartLegBundle optionSimulatedChartLegBundle = (OptionSimulatedChartLegBundle) obj;
                OptionInstrumentQuote optionInstrumentQuote = optionQuotes.get(optionSimulatedChartLegBundle.getOptionInstrument().getId());
                OrderSide side = optionSimulatedChartLegBundle.getSide();
                BigDecimal multiplier = side.getDirection().getMultiplier();
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(optionSimulatedChartLegBundle.getQuantity());
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                if (optionInstrumentQuote != null) {
                    defaultPricingSetting2 = defaultPricingSetting;
                    Decimals4 price$default = OptionInstrumentQuote.getPrice$default(optionInstrumentQuote, defaultPricingSetting2, side, false, 4, null);
                    BigDecimal unsignedValue = price$default != null ? price$default.getUnsignedValue() : null;
                    BigDecimal bigDecimalMultiply = BigDecimals7.orZero(unsignedValue).multiply(multiplier);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                    BigDecimal bigDecimalMultiply2 = bigDecimalMultiply.multiply(bigDecimalValueOf);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
                    bigDecimalAdd = bigDecimalAdd.add(bigDecimalMultiply2);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
                    defaultPricingSetting = defaultPricingSetting2;
                } else {
                    defaultPricingSetting2 = defaultPricingSetting;
                }
                BigDecimal bigDecimalMultiply3 = BigDecimals7.orZero(unsignedValue).multiply(multiplier);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply3, "multiply(...)");
                BigDecimal bigDecimalMultiply22 = bigDecimalMultiply3.multiply(bigDecimalValueOf);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply22, "multiply(...)");
                bigDecimalAdd = bigDecimalAdd.add(bigDecimalMultiply22);
                Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
                defaultPricingSetting = defaultPricingSetting2;
            }
            Intrinsics.checkNotNull(bigDecimalAdd);
            return bigDecimalAdd;
        }
        return null;
    }
}
