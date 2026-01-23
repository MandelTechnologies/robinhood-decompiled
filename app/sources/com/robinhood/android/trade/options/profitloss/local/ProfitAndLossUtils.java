package com.robinhood.android.trade.options.profitloss.local;

import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.options.aggregatequotes.OptionQuoteAggregator;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ProfitAndLossUtils.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001c\n\u0000\u001aJ\u0010\b\u001a\u0004\u0018\u00010\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0000\u001a\"\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u001a \u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0002\u001a\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b*\b\u0012\u0004\u0012\u00020\u00030\u001cH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"DIVISION_SCALE", "", "OPTION_QUANTIZE_UNIT_MULTI_LEG", "Ljava/math/BigDecimal;", "getOPTION_QUANTIZE_UNIT_MULTI_LEG", "()Ljava/math/BigDecimal;", "STOCK_QUANTIZE_UNIT_ABOVE_ONE", "STOCK_QUANTIZE_UNIT_BELOW_ONE", "newtonsMethod", "f", "Lkotlin/Function1;", "derivative", "x0", "epsilon", "maxIteration", "equityPriceQuantization", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "optionPriceQuantization", "minTicks", "Lcom/robinhood/models/db/OptionChain$TickRequirements;", "isSingleLeg", "", "quantize", "quantizeUnit", "roundingMode", "Ljava/math/RoundingMode;", "bigDecimalDistinct", "", "", "feature-options-pl-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.trade.options.profitloss.local.ProfitAndLossUtilsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ProfitAndLossUtils {
    public static final int DIVISION_SCALE = 8;
    private static final BigDecimal OPTION_QUANTIZE_UNIT_MULTI_LEG = new BigDecimal("0.0001");
    private static final BigDecimal STOCK_QUANTIZE_UNIT_ABOVE_ONE = new BigDecimal("0.01");
    private static final BigDecimal STOCK_QUANTIZE_UNIT_BELOW_ONE = new BigDecimal("0.0001");

    public static final BigDecimal getOPTION_QUANTIZE_UNIT_MULTI_LEG() {
        return OPTION_QUANTIZE_UNIT_MULTI_LEG;
    }

    public static final BigDecimal newtonsMethod(Function1<? super BigDecimal, ? extends BigDecimal> f, Function1<? super BigDecimal, ? extends BigDecimal> derivative, BigDecimal x0, BigDecimal epsilon, int i) {
        Intrinsics.checkNotNullParameter(f, "f");
        Intrinsics.checkNotNullParameter(derivative, "derivative");
        Intrinsics.checkNotNullParameter(x0, "x0");
        Intrinsics.checkNotNullParameter(epsilon, "epsilon");
        for (int i2 = 0; i2 < i; i2++) {
            BigDecimal bigDecimalInvoke = f.invoke(x0);
            if (bigDecimalInvoke.abs().compareTo(epsilon) < 0) {
                return x0;
            }
            BigDecimal bigDecimalInvoke2 = derivative.invoke(x0);
            BigDecimal bigDecimal = BigDecimal.ZERO;
            if (Intrinsics.areEqual(bigDecimalInvoke2, bigDecimal)) {
                return null;
            }
            x0 = x0.subtract(BigDecimals7.safeDivide(bigDecimalInvoke, bigDecimalInvoke2, 8, RoundingMode.HALF_UP));
            Intrinsics.checkNotNullExpressionValue(x0, "subtract(...)");
            if (x0.compareTo(bigDecimal) < 0) {
                return null;
            }
        }
        return null;
    }

    public static final BigDecimal equityPriceQuantization(BigDecimal price) {
        Intrinsics.checkNotNullParameter(price, "price");
        if (price.compareTo(BigDecimal.ONE) < 0) {
            return quantize(price, STOCK_QUANTIZE_UNIT_BELOW_ONE, RoundingMode.CEILING);
        }
        return quantize(price, STOCK_QUANTIZE_UNIT_ABOVE_ONE, RoundingMode.CEILING);
    }

    public static final BigDecimal optionPriceQuantization(BigDecimal price, OptionChain.TickRequirements tickRequirements, boolean z) {
        Intrinsics.checkNotNullParameter(price, "price");
        if (z) {
            return tickRequirements == null ? price : OptionQuoteAggregator.INSTANCE.getInternalMinTickedPrice(price, tickRequirements);
        }
        return quantize(price, OPTION_QUANTIZE_UNIT_MULTI_LEG, RoundingMode.CEILING);
    }

    private static final BigDecimal quantize(BigDecimal bigDecimal, BigDecimal bigDecimal2, RoundingMode roundingMode) {
        BigDecimal bigDecimalMultiply = BigDecimals7.safeDivide$default(bigDecimal, bigDecimal2, 8, null, 4, null).setScale(0, roundingMode).multiply(bigDecimal2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return bigDecimalMultiply;
    }

    public static final List<BigDecimal> bigDecimalDistinct(Iterable<? extends BigDecimal> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (BigDecimal bigDecimal : iterable) {
            if (hashSet.add(zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimal))) {
                arrayList.add(bigDecimal);
            }
        }
        return arrayList;
    }
}
