package com.robinhood.android.options.calculation.greeks;

import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p355ui.UiAggregateOptionPositionLeg;
import com.robinhood.models.p355ui.UiOptionStrategyLeg;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsGreekAggregationCalculation.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00040\u0003\u001a \u0010\u0005\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00040\u0003\u001a(\u0010\u0005\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u001a(\u0010\u000e\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¨\u0006\u0011"}, m3636d2 = {"getAggregatedGreek", "Ljava/math/BigDecimal;", "greekToSignedRatioList", "", "Lkotlin/Pair;", "getAggregateGreeks", "Lcom/robinhood/android/options/calculation/greeks/OptionsGreeks;", "greeksToSignedRatioList", "uiStrategyLegs", "Lcom/robinhood/models/ui/UiOptionStrategyLeg;", "optionInstrumentIdToQuoteMap", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "getAggregateGreeksWithUiAggregatePositionLegs", "uiPositionLegs", "Lcom/robinhood/models/ui/UiAggregateOptionPositionLeg;", "lib-options-calculation_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.calculation.greeks.OptionsGreekAggregationCalculationKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsGreekAggregationCalculation {
    public static final BigDecimal getAggregatedGreek(List<? extends Tuples2<? extends BigDecimal, ? extends BigDecimal>> greekToSignedRatioList) {
        Intrinsics.checkNotNullParameter(greekToSignedRatioList, "greekToSignedRatioList");
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        Iterator<T> it = greekToSignedRatioList.iterator();
        while (it.hasNext()) {
            Tuples2 tuples2 = (Tuples2) it.next();
            BigDecimal bigDecimal = (BigDecimal) tuples2.component1();
            BigDecimal bigDecimal2 = (BigDecimal) tuples2.component2();
            Intrinsics.checkNotNull(bigDecimalAdd);
            BigDecimal bigDecimalMultiply = bigDecimal.multiply(bigDecimal2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            bigDecimalAdd = bigDecimalAdd.add(bigDecimalMultiply);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        }
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "fold(...)");
        return bigDecimalAdd;
    }

    public static final OptionsGreeks getAggregateGreeks(List<? extends Tuples2<OptionsGreeks, ? extends BigDecimal>> greeksToSignedRatioList) {
        Intrinsics.checkNotNullParameter(greeksToSignedRatioList, "greeksToSignedRatioList");
        BigDecimal element = BigDecimal.ZERO;
        Iterator it = greeksToSignedRatioList.iterator();
        BigDecimal element2 = element;
        BigDecimal element3 = element2;
        BigDecimal element4 = element3;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        BigDecimal element5 = element4;
        while (it.hasNext()) {
            Tuples2 tuples2 = (Tuples2) it.next();
            OptionsGreeks optionsGreeks = (OptionsGreeks) tuples2.component1();
            BigDecimal bigDecimal = (BigDecimal) tuples2.component2();
            if (optionsGreeks.getDelta() == null) {
                z = true;
            }
            if (optionsGreeks.getGamma() == null) {
                z2 = true;
            }
            if (optionsGreeks.getTheta() == null) {
                z3 = true;
            }
            if (optionsGreeks.getVega() == null) {
                z4 = true;
            }
            if (optionsGreeks.getRho() == null) {
                z5 = true;
            }
            Intrinsics.checkNotNullExpressionValue(element, "element");
            BigDecimal delta = optionsGreeks.getDelta();
            if (delta == null) {
                delta = BigDecimal.ZERO;
            }
            Intrinsics.checkNotNull(delta);
            BigDecimal bigDecimalMultiply = delta.multiply(bigDecimal);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            element = element.add(bigDecimalMultiply);
            Intrinsics.checkNotNullExpressionValue(element, "add(...)");
            Intrinsics.checkNotNullExpressionValue(element5, "element");
            BigDecimal gamma = optionsGreeks.getGamma();
            if (gamma == null) {
                gamma = BigDecimal.ZERO;
            }
            BigDecimal bigDecimal2 = gamma;
            Intrinsics.checkNotNull(bigDecimal2);
            Iterator it2 = it;
            BigDecimal bigDecimalMultiply2 = bigDecimal2.multiply(bigDecimal);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
            element5 = element5.add(bigDecimalMultiply2);
            Intrinsics.checkNotNullExpressionValue(element5, "add(...)");
            Intrinsics.checkNotNullExpressionValue(element2, "element");
            BigDecimal theta = optionsGreeks.getTheta();
            if (theta == null) {
                theta = BigDecimal.ZERO;
            }
            Intrinsics.checkNotNull(theta);
            BigDecimal bigDecimalMultiply3 = theta.multiply(bigDecimal);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply3, "multiply(...)");
            element2 = element2.add(bigDecimalMultiply3);
            Intrinsics.checkNotNullExpressionValue(element2, "add(...)");
            Intrinsics.checkNotNullExpressionValue(element3, "element");
            BigDecimal vega = optionsGreeks.getVega();
            if (vega == null) {
                vega = BigDecimal.ZERO;
            }
            Intrinsics.checkNotNull(vega);
            BigDecimal bigDecimalMultiply4 = vega.multiply(bigDecimal);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply4, "multiply(...)");
            element3 = element3.add(bigDecimalMultiply4);
            Intrinsics.checkNotNullExpressionValue(element3, "add(...)");
            Intrinsics.checkNotNullExpressionValue(element4, "element");
            BigDecimal rho = optionsGreeks.getRho();
            if (rho == null) {
                rho = BigDecimal.ZERO;
            }
            Intrinsics.checkNotNull(rho);
            BigDecimal bigDecimalMultiply5 = rho.multiply(bigDecimal);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply5, "multiply(...)");
            element4 = element4.add(bigDecimalMultiply5);
            Intrinsics.checkNotNullExpressionValue(element4, "add(...)");
            it = it2;
        }
        return new OptionsGreeks(z ? null : element, z2 ? null : element5, z3 ? null : element2, z4 ? null : element3, z5 ? null : element4);
    }

    public static final OptionsGreeks getAggregateGreeks(List<UiOptionStrategyLeg> uiStrategyLegs, Map<UUID, OptionInstrumentQuote> optionInstrumentIdToQuoteMap) {
        Intrinsics.checkNotNullParameter(uiStrategyLegs, "uiStrategyLegs");
        Intrinsics.checkNotNullParameter(optionInstrumentIdToQuoteMap, "optionInstrumentIdToQuoteMap");
        List<UiOptionStrategyLeg> list = uiStrategyLegs;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (UiOptionStrategyLeg uiOptionStrategyLeg : list) {
            OptionInstrumentQuote optionInstrumentQuote = optionInstrumentIdToQuoteMap.get(uiOptionStrategyLeg.getOptionInstrument().getId());
            BigDecimal rho = null;
            BigDecimal delta = optionInstrumentQuote != null ? optionInstrumentQuote.getDelta() : null;
            BigDecimal gamma = optionInstrumentQuote != null ? optionInstrumentQuote.getGamma() : null;
            BigDecimal theta = optionInstrumentQuote != null ? optionInstrumentQuote.getTheta() : null;
            BigDecimal vega = optionInstrumentQuote != null ? optionInstrumentQuote.getVega() : null;
            if (optionInstrumentQuote != null) {
                rho = optionInstrumentQuote.getRho();
            }
            OptionsGreeks optionsGreeks = new OptionsGreeks(delta, gamma, theta, vega, rho);
            BigDecimal bigDecimalMultiply = uiOptionStrategyLeg.getRatioQuantity().multiply(uiOptionStrategyLeg.getPositionType().getDirection().getMultiplier());
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            arrayList.add(Tuples4.m3642to(optionsGreeks, bigDecimalMultiply));
        }
        return getAggregateGreeks(arrayList);
    }

    public static final OptionsGreeks getAggregateGreeksWithUiAggregatePositionLegs(List<UiAggregateOptionPositionLeg> uiPositionLegs, Map<UUID, OptionInstrumentQuote> optionInstrumentIdToQuoteMap) {
        Intrinsics.checkNotNullParameter(uiPositionLegs, "uiPositionLegs");
        Intrinsics.checkNotNullParameter(optionInstrumentIdToQuoteMap, "optionInstrumentIdToQuoteMap");
        List<UiAggregateOptionPositionLeg> list = uiPositionLegs;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (UiAggregateOptionPositionLeg uiAggregateOptionPositionLeg : list) {
            OptionInstrumentQuote optionInstrumentQuote = optionInstrumentIdToQuoteMap.get(uiAggregateOptionPositionLeg.getOptionInstrument().getId());
            BigDecimal rho = null;
            BigDecimal delta = optionInstrumentQuote != null ? optionInstrumentQuote.getDelta() : null;
            BigDecimal gamma = optionInstrumentQuote != null ? optionInstrumentQuote.getGamma() : null;
            BigDecimal theta = optionInstrumentQuote != null ? optionInstrumentQuote.getTheta() : null;
            BigDecimal vega = optionInstrumentQuote != null ? optionInstrumentQuote.getVega() : null;
            if (optionInstrumentQuote != null) {
                rho = optionInstrumentQuote.getRho();
            }
            OptionsGreeks optionsGreeks = new OptionsGreeks(delta, gamma, theta, vega, rho);
            BigDecimal bigDecimalMultiply = uiAggregateOptionPositionLeg.getRatioQuantity().multiply(uiAggregateOptionPositionLeg.getPositionType().getDirection().getMultiplier());
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            arrayList.add(Tuples4.m3642to(optionsGreeks, bigDecimalMultiply));
        }
        return getAggregateGreeks(arrayList);
    }
}
