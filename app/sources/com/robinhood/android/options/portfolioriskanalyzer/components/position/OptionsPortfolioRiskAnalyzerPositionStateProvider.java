package com.robinhood.android.options.portfolioriskanalyzer.components.position;

import android.content.res.Resources;
import androidx.compose.p011ui.state.ToggleableState;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.options.calculation.greeks.OptionsGreekAggregationCalculation;
import com.robinhood.android.options.calculation.greeks.OptionsGreeks;
import com.robinhood.android.options.calculation.simulatedreturn.greeks.OptionSimulatedReturnThetaCalculation;
import com.robinhood.android.options.calculation.simulatedreturn.greeks.OptionsSimulatedReturnDeltaCalculation;
import com.robinhood.android.options.calculation.simulatedreturn.greeks.OptionsSimulatedReturnGammaCalculation;
import com.robinhood.android.options.calculation.simulatedreturn.greeks.OptionsSimulatedReturnOptionPriceCalculation;
import com.robinhood.android.options.calculation.simulatedreturn.greeks.OptionsSimulatedReturnVegaCalculation;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDataState4;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderLaunchMode;
import com.robinhood.android.options.optionsstring.common.OptionExtensions2;
import com.robinhood.android.options.optionsstring.common.OptionInstrumentDetails2;
import com.robinhood.android.options.optionsstring.common.UiOptionStrategyDisplays;
import com.robinhood.android.options.portfolioriskanalyzer.C23462R;
import com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowViewState;
import com.robinhood.android.options.portfolioriskanalyzer.extensions.UtilsKt;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionPositionType;
import com.robinhood.models.p320db.OptionUnderlying;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Position5;
import com.robinhood.models.p320db.simulatedreturns.OptionPricingParams;
import com.robinhood.models.p355ui.EquityPositionBundle;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle3;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle5;
import com.robinhood.models.p355ui.OptionSimulatedChartLegBundle;
import com.robinhood.models.p355ui.UiAggregateOptionPosition;
import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import com.robinhood.models.p355ui.UiAggregateOptionPositionLeg;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionInstrumentPosition;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlin.time.DurationUnitJvm;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.datetime.Instant;
import p479j$.time.Clock;
import p479j$.time.LocalDate;

/* compiled from: OptionsPortfolioRiskAnalyzerPositionStateProvider.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00132\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!J!\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b'\u0010(J!\u0010+\u001a\u00020*2\u0006\u0010\n\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020-2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0002H\u0016¢\u0006\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionViewState;", "Landroid/content/res/Resources;", "resources", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Landroid/content/res/Resources;Lj$/time/Clock;)V", "ds", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerEquityPositionRowViewState;", "getEquityPositionRowViewState", "(Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;)Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerEquityPositionRowViewState;", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "position", "Ljava/math/BigDecimal;", "getAndSetAggregateSimulatedQuantity", "(Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;)Ljava/math/BigDecimal;", "", "Lcom/robinhood/models/ui/UiAggregateOptionPositionLeg;", "getSimulatedLegsForOptionPosition", "(Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;)Ljava/util/List;", "aggregatePosition", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerOptionPositionRowViewState$Leg;", "getOptionLegPositionRowViewStates", "(Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;)Ljava/util/List;", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerOptionPositionRowViewState$Aggregate;", "getOptionPositionRowViewStates", "(Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;)Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/OptionSimulatedChartBundle;", "getChartBundle", "(Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;)Lcom/robinhood/models/ui/OptionSimulatedChartBundle;", "chartBundle", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartLaunchMode$PortfolioRiskAnalyzer;", "getProfitLossLaunchMode", "(Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;Lcom/robinhood/models/ui/OptionSimulatedChartBundle;)Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartLaunchMode$PortfolioRiskAnalyzer;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode$Time;", "getSliderLaunchMode", "(Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;)Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode$Time;", "equityPositionRow", "Lcom/robinhood/android/options/calculation/greeks/OptionsGreeks;", "getAggregatedGreeks", "(Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerEquityPositionRowViewState;)Lcom/robinhood/android/options/calculation/greeks/OptionsGreeks;", "", "getHeaderCtaString", "(Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;)Ljava/lang/String;", "dataState", "reduce", "(Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;)Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionViewState;", "Landroid/content/res/Resources;", "Lj$/time/Clock;", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionsPortfolioRiskAnalyzerPositionStateProvider implements StateProvider<OptionsPortfolioRiskAnalyzerPositionDataState, OptionsPortfolioRiskAnalyzerPositionViewState> {
    public static final int $stable = 8;
    private final Clock clock;
    private final Resources resources;

    /* compiled from: OptionsPortfolioRiskAnalyzerPositionStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionPositionType.values().length];
            try {
                iArr[OptionPositionType.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionPositionType.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OptionsPortfolioRiskAnalyzerPositionStateProvider(Resources resources, Clock clock) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.resources = resources;
        this.clock = clock;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final OptionsPortfolioRiskAnalyzerEquityPositionRowViewState getEquityPositionRowViewState(OptionsPortfolioRiskAnalyzerPositionDataState ds) throws Resources.NotFoundException {
        String str;
        BigDecimal bigDecimal;
        BigDecimal totalReturnPercentage;
        String str2;
        String str3;
        if (ds.getInstrument() == null || ds.getEquityPosition() == null || !Intrinsics.areEqual(ds.getInstrument().getId(), ds.getEquityPosition().getInstrument())) {
            return null;
        }
        BigDecimal first = UtilsKt.getQuantityToAverageCost(ds.getEquityPosition()).getFirst();
        if (first.compareTo(BigDecimal.ZERO) == 0) {
            return null;
        }
        String string2 = this.resources.getString(C11048R.string.general_label_long_dash);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        if (ds.getUnrealizedProfitAndLoss() != null) {
            Money totalReturn = ds.getUnrealizedProfitAndLoss().getTotalReturn();
            bigDecimalCompat = totalReturn != null ? Money3.getBigDecimalCompat(totalReturn) : null;
            totalReturnPercentage = ds.getUnrealizedProfitAndLoss().getTotalReturnPercentage();
            Money averageCostBasis = ds.getEquityPosition().getAverageCostBasis();
            if (averageCostBasis != null && !Position5.isBoxed(ds.getEquityPosition())) {
                string2 = Money.format$default(averageCostBasis, null, false, null, false, 0, null, false, RoundingMode.HALF_UP, false, false, 895, null);
            }
        } else if (ds.getQuote() != null) {
            if (ds.getEquityPosition().getDisplayAverageBuyPrice().isZero()) {
                Money totalReturnAmount = ds.getEquityPosition().getTotalReturnAmount(ds.getQuote());
                BigDecimal bigDecimalCompat = totalReturnAmount != null ? Money3.getBigDecimalCompat(totalReturnAmount) : null;
                totalReturnPercentage = null;
                bigDecimalCompat = bigDecimalCompat;
            } else {
                Money totalReturnAmount2 = ds.getEquityPosition().getTotalReturnAmount(ds.getQuote());
                bigDecimalCompat = totalReturnAmount2 != null ? Money3.getBigDecimalCompat(totalReturnAmount2) : null;
                totalReturnPercentage = ds.getEquityPosition().getTotalReturnPercentage(ds.getQuote());
            }
            if (!Position5.isShortPosition(ds.getEquityPosition())) {
                string2 = Money.format$default(ds.getEquityPosition().getDisplayAverageBuyPrice(), null, false, null, false, 0, null, false, null, false, false, 1023, null);
            }
        } else {
            str = string2;
            bigDecimal = null;
            OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2 pnlColorType = UtilsKt.toPnlColorType(bigDecimalCompat);
            UUID instrument = ds.getEquityPosition().getInstrument();
            String symbol = ds.getInstrument().getSymbol();
            String bigDecimalQuantityString = com.robinhood.android.common.util.extensions.Resources.getBigDecimalQuantityString(this.resources, C11048R.plurals.general_number_of_shares, first, Formats.getShareQuantityFormat().format(first));
            Boolean bool = ds.getRowIdToChecked().get(ds.getEquityPosition().getInstrument().toString());
            return new OptionsPortfolioRiskAnalyzerEquityPositionRowViewState(instrument, symbol, bigDecimalQuantityString, bool == null ? bool.booleanValue() : true, (bigDecimal != null || (str3 = Formats.getPriceDeltaWithHundredthDecimalFormat().format(bigDecimal)) == null) ? "-" : str3, (bigDecimalCompat != null || (str2 = Formats.getPercentDeltaWithHundredthDecimalFormat().format(bigDecimalCompat)) == null) ? "-" : str2, pnlColorType, str);
        }
        str = string2;
        bigDecimal = bigDecimalCompat;
        bigDecimalCompat = totalReturnPercentage;
        OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2 pnlColorType2 = UtilsKt.toPnlColorType(bigDecimalCompat);
        UUID instrument2 = ds.getEquityPosition().getInstrument();
        String symbol2 = ds.getInstrument().getSymbol();
        String bigDecimalQuantityString2 = com.robinhood.android.common.util.extensions.Resources.getBigDecimalQuantityString(this.resources, C11048R.plurals.general_number_of_shares, first, Formats.getShareQuantityFormat().format(first));
        Boolean bool2 = ds.getRowIdToChecked().get(ds.getEquityPosition().getInstrument().toString());
        return new OptionsPortfolioRiskAnalyzerEquityPositionRowViewState(instrument2, symbol2, bigDecimalQuantityString2, bool2 == null ? bool2.booleanValue() : true, (bigDecimal != null || (str3 = Formats.getPriceDeltaWithHundredthDecimalFormat().format(bigDecimal)) == null) ? "-" : str3, (bigDecimalCompat != null || (str2 = Formats.getPercentDeltaWithHundredthDecimalFormat().format(bigDecimalCompat)) == null) ? "-" : str2, pnlColorType2, str);
    }

    private final BigDecimal getAndSetAggregateSimulatedQuantity(OptionsPortfolioRiskAnalyzerPositionDataState ds, UiAggregateOptionPositionFull position) {
        String string2 = position.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        BigDecimal bigDecimal = ds.getRowIdToSimulatedQuantity().get(string2);
        if (bigDecimal == null) {
            BigDecimal quantity = position.getQuantity();
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            bigDecimal = (BigDecimal) RangesKt.coerceAtLeast(quantity, ZERO);
            ds.getRowIdToSimulatedQuantity().put(string2, bigDecimal);
        }
        Intrinsics.checkNotNull(bigDecimal);
        return bigDecimal;
    }

    private final List<UiAggregateOptionPositionLeg> getSimulatedLegsForOptionPosition(OptionsPortfolioRiskAnalyzerPositionDataState ds, UiAggregateOptionPositionFull position) {
        if (getAndSetAggregateSimulatedQuantity(ds, position).compareTo(BigDecimal.ZERO) <= 0) {
            return CollectionsKt.emptyList();
        }
        List<UiAggregateOptionPositionLeg> uiLegs = position.getUiLegs();
        ArrayList arrayList = new ArrayList();
        for (Object obj : uiLegs) {
            if (!Intrinsics.areEqual(ds.getRowIdToChecked().get(OptionsPortfolioRiskAnalyzerOptionPositionRowViewState2.getRowIdForLegPosition(position.getId(), ((UiAggregateOptionPositionLeg) obj).getOptionPositionId())), Boolean.FALSE)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final List<OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Leg> getOptionLegPositionRowViewStates(UiAggregateOptionPositionFull aggregatePosition, OptionsPortfolioRiskAnalyzerPositionDataState ds) {
        List<UiAggregateOptionPositionLeg> uiLegs = aggregatePosition.getUiLegs();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(uiLegs, 10));
        for (UiAggregateOptionPositionLeg uiAggregateOptionPositionLeg : uiLegs) {
            String rowIdForLegPosition = OptionsPortfolioRiskAnalyzerOptionPositionRowViewState2.getRowIdForLegPosition(aggregatePosition.getId(), uiAggregateOptionPositionLeg.getOptionPositionId());
            UUID optionPositionId = uiAggregateOptionPositionLeg.getOptionPositionId();
            UUID id = aggregatePosition.getId();
            UUID id2 = uiAggregateOptionPositionLeg.getOptionInstrument().getId();
            String formattedTitleString = OptionInstrumentDetails2.getFormattedTitleString(uiAggregateOptionPositionLeg, this.resources, aggregatePosition.getUiOptionChain().getUnderlyingType());
            Resources resources = this.resources;
            BigDecimal bigDecimalMultiply = uiAggregateOptionPositionLeg.getRatioQuantity().multiply(aggregatePosition.getQuantity());
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            String formattedSubtitleStringWithDte = OptionInstrumentDetails2.getFormattedSubtitleStringWithDte(uiAggregateOptionPositionLeg, resources, bigDecimalMultiply, uiAggregateOptionPositionLeg.getPositionType(), null, this.clock);
            Boolean bool = ds.getRowIdToChecked().get(rowIdForLegPosition);
            ToggleableState toggleableState = bool != null ? bool.booleanValue() : true ? ToggleableState.f174On : ToggleableState.Off;
            Boolean bool2 = ds.getRowIdToCollapsed().get(rowIdForLegPosition);
            boolean zBooleanValue = bool2 != null ? bool2.booleanValue() : true;
            List<UiAggregateOptionPositionLeg> uiLegs2 = aggregatePosition.getUiLegs();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(uiLegs2, 10));
            Iterator<T> it = uiLegs2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((UiAggregateOptionPositionLeg) it.next()).getOptionPositionId());
            }
            arrayList.add(new OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Leg(id, optionPositionId, id2, arrayList2, formattedTitleString, formattedSubtitleStringWithDte, toggleableState, zBooleanValue, new OptionsGreeks(null, null, null, null, null)));
        }
        return arrayList;
    }

    private final ImmutableList<OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Aggregate> getOptionPositionRowViewStates(OptionsPortfolioRiskAnalyzerPositionDataState ds) {
        ToggleableState toggleableState;
        List<UiAggregateOptionPositionFull> aggregateOptionPositions = ds.getAggregateOptionPositions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(aggregateOptionPositions, 10));
        for (UiAggregateOptionPositionFull uiAggregateOptionPositionFull : aggregateOptionPositions) {
            String string2 = uiAggregateOptionPositionFull.getId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            BigDecimal andSetAggregateSimulatedQuantity = getAndSetAggregateSimulatedQuantity(ds, uiAggregateOptionPositionFull);
            List<OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Leg> optionLegPositionRowViewStates = getOptionLegPositionRowViewStates(uiAggregateOptionPositionFull, ds);
            String string3 = OptionExtensions2.getStrategyTitle((UiAggregateOptionPosition) uiAggregateOptionPositionFull, this.resources, true, uiAggregateOptionPositionFull.getUiOptionChain().getUnderlyingType()).toString();
            String string4 = UiOptionStrategyDisplays.getSubtitleStringWithDte(uiAggregateOptionPositionFull, this.resources, true, this.clock).toString();
            UUID id = uiAggregateOptionPositionFull.getId();
            BigDecimal bigDecimalSubtract = andSetAggregateSimulatedQuantity.subtract(uiAggregateOptionPositionFull.getQuantity());
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            List<OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Leg> list = optionLegPositionRowViewStates;
            boolean z = list instanceof Collection;
            if (z && list.isEmpty()) {
                toggleableState = ToggleableState.f174On;
            } else {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Leg) it.next()).getCheckState() != ToggleableState.f174On) {
                        if (z && list.isEmpty()) {
                            toggleableState = ToggleableState.Off;
                        } else {
                            Iterator<T> it2 = list.iterator();
                            while (it2.hasNext()) {
                                if (((OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Leg) it2.next()).getCheckState() != ToggleableState.Off) {
                                    toggleableState = ToggleableState.Indeterminate;
                                    break;
                                }
                            }
                            toggleableState = ToggleableState.Off;
                        }
                    }
                }
                toggleableState = ToggleableState.f174On;
            }
            ToggleableState toggleableState2 = toggleableState;
            Boolean bool = ds.getRowIdToCollapsed().get(string2);
            arrayList.add(new OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Aggregate(id, uiAggregateOptionPositionFull, string3, string4, toggleableState2, bool != null ? bool.booleanValue() : true, new OptionsGreeks(null, null, null, null, null), bigDecimalSubtract, optionLegPositionRowViewStates));
        }
        return extensions2.toPersistentList(arrayList);
    }

    private final OptionSimulatedChartBundle getChartBundle(OptionsPortfolioRiskAnalyzerPositionDataState ds) {
        EquityPositionBundle equityPositionBundle;
        OrderSide orderSide;
        UiOptionChain uiOptionChain;
        List<OptionUnderlying> underlyings;
        OptionsPortfolioRiskAnalyzerPositionStateProvider optionsPortfolioRiskAnalyzerPositionStateProvider = this;
        if (ds.getEquityPosition() == null || Intrinsics.areEqual(ds.getRowIdToChecked().get(ds.getEquityPosition().getInstrument().toString()), Boolean.FALSE)) {
            equityPositionBundle = null;
        } else {
            Tuples2<BigDecimal, BigDecimal> quantityToAverageCost = UtilsKt.getQuantityToAverageCost(ds.getEquityPosition());
            equityPositionBundle = new EquityPositionBundle(quantityToAverageCost.component2(), quantityToAverageCost.component1());
        }
        UiAggregateOptionPositionFull uiAggregateOptionPositionFull = (UiAggregateOptionPositionFull) CollectionsKt.firstOrNull((List) ds.getAggregateOptionPositions());
        OptionSimulatedChartBundle5 optionSimulatedChartUnderlying = (uiAggregateOptionPositionFull == null || (uiOptionChain = uiAggregateOptionPositionFull.getUiOptionChain()) == null || (underlyings = uiOptionChain.getUnderlyings()) == null) ? null : OptionSimulatedChartBundle3.toOptionSimulatedChartUnderlying(underlyings);
        Position equityPosition = ds.getEquityPosition();
        OptionSimulatedChartBundle5.Equity equity = equityPosition != null ? new OptionSimulatedChartBundle5.Equity(equityPosition.getInstrument()) : null;
        List<UiAggregateOptionPositionFull> aggregateOptionPositions = ds.getAggregateOptionPositions();
        ArrayList arrayList = new ArrayList();
        for (UiAggregateOptionPositionFull uiAggregateOptionPositionFull2 : aggregateOptionPositions) {
            BigDecimal andSetAggregateSimulatedQuantity = optionsPortfolioRiskAnalyzerPositionStateProvider.getAndSetAggregateSimulatedQuantity(ds, uiAggregateOptionPositionFull2);
            List<UiAggregateOptionPositionLeg> simulatedLegsForOptionPosition = optionsPortfolioRiskAnalyzerPositionStateProvider.getSimulatedLegsForOptionPosition(ds, uiAggregateOptionPositionFull2);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(simulatedLegsForOptionPosition, 10));
            for (UiAggregateOptionPositionLeg uiAggregateOptionPositionLeg : simulatedLegsForOptionPosition) {
                OptionChain optionChain = uiAggregateOptionPositionFull2.getOptionChain();
                OptionInstrument optionInstrument = uiAggregateOptionPositionLeg.getOptionInstrument();
                BigDecimal bigDecimalMultiply = uiAggregateOptionPositionLeg.getRatioQuantity().multiply(andSetAggregateSimulatedQuantity);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                int iIntValue = bigDecimalMultiply.intValue();
                int i = WhenMappings.$EnumSwitchMapping$0[uiAggregateOptionPositionLeg.getPositionType().ordinal()];
                if (i == 1) {
                    orderSide = OrderSide.BUY;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    orderSide = OrderSide.SELL;
                }
                arrayList2.add(new OptionSimulatedChartLegBundle(optionChain, optionInstrument, iIntValue, orderSide));
            }
            CollectionsKt.addAll(arrayList, arrayList2);
            optionsPortfolioRiskAnalyzerPositionStateProvider = this;
        }
        ImmutableList3 persistentList = extensions2.toPersistentList(arrayList);
        if (optionSimulatedChartUnderlying == null) {
            optionSimulatedChartUnderlying = equity;
        }
        return new OptionSimulatedChartBundle(optionSimulatedChartUnderlying, persistentList, equityPositionBundle);
    }

    private final OptionsProfitAndLossChartDataState4.PortfolioRiskAnalyzer getProfitLossLaunchMode(OptionsPortfolioRiskAnalyzerPositionDataState ds, OptionSimulatedChartBundle chartBundle) {
        BigDecimal bigDecimalMultiply;
        BigDecimal bigDecimalAdd;
        BigDecimal bigDecimalMultiply2;
        BigDecimal bigDecimalMultiply3;
        OptionChain optionChain;
        UiAggregateOptionPositionFull uiAggregateOptionPositionFull = (UiAggregateOptionPositionFull) CollectionsKt.firstOrNull((List) ds.getAggregateOptionPositions());
        BigDecimal bigDecimalOrZero = BigDecimals7.orZero((uiAggregateOptionPositionFull == null || (optionChain = uiAggregateOptionPositionFull.getOptionChain()) == null) ? null : optionChain.getTradeValueMultiplier());
        List<UiAggregateOptionPositionFull> aggregateOptionPositions = ds.getAggregateOptionPositions();
        BigDecimal bigDecimalAdd2 = BigDecimal.ZERO;
        for (Object obj : aggregateOptionPositions) {
            Intrinsics.checkNotNull(bigDecimalAdd2);
            UiAggregateOptionPositionFull uiAggregateOptionPositionFull2 = (UiAggregateOptionPositionFull) obj;
            BigDecimal andSetAggregateSimulatedQuantity = getAndSetAggregateSimulatedQuantity(ds, uiAggregateOptionPositionFull2);
            List<UiAggregateOptionPositionLeg> simulatedLegsForOptionPosition = getSimulatedLegsForOptionPosition(ds, uiAggregateOptionPositionFull2);
            if (simulatedLegsForOptionPosition.size() == uiAggregateOptionPositionFull2.getUiLegs().size()) {
                if (uiAggregateOptionPositionFull2.getClearingRunningQuantity() == null || uiAggregateOptionPositionFull2.getClearingCostBasis() == null) {
                    BigDecimal bigDecimalAbs = uiAggregateOptionPositionFull2.getAverageStrategyPrice().abs();
                    Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
                    bigDecimalMultiply3 = bigDecimalAbs.multiply(bigDecimalOrZero);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply3, "multiply(...)");
                } else {
                    bigDecimalMultiply3 = BigDecimals7.safeDivide(uiAggregateOptionPositionFull2.getClearingCostBasis(), uiAggregateOptionPositionFull2.getClearingRunningQuantity()).abs();
                }
                BigDecimal multiplier = uiAggregateOptionPositionFull2.getDirection().getMultiplier();
                Intrinsics.checkNotNull(bigDecimalMultiply3);
                BigDecimal bigDecimalMultiply4 = bigDecimalMultiply3.multiply(multiplier);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply4, "multiply(...)");
                bigDecimalAdd = bigDecimalMultiply4.multiply(andSetAggregateSimulatedQuantity);
                Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "multiply(...)");
            } else {
                bigDecimalAdd = BigDecimal.ZERO;
                for (Object obj2 : simulatedLegsForOptionPosition) {
                    Intrinsics.checkNotNull(bigDecimalAdd);
                    UiAggregateOptionPositionLeg uiAggregateOptionPositionLeg = (UiAggregateOptionPositionLeg) obj2;
                    UiOptionInstrumentPosition uiOptionInstrumentPosition = ds.getOptionPositionIdToInstrumentPositions().get(uiAggregateOptionPositionLeg.getOptionPositionId());
                    if (uiOptionInstrumentPosition == null) {
                        return null;
                    }
                    if (uiOptionInstrumentPosition.getClearingRunningQuantity() == null || uiOptionInstrumentPosition.getClearingCostBasis() == null) {
                        BigDecimal bigDecimalAbs2 = uiOptionInstrumentPosition.getAverageStrategyPrice().abs();
                        Intrinsics.checkNotNullExpressionValue(bigDecimalAbs2, "abs(...)");
                        bigDecimalMultiply2 = bigDecimalAbs2.multiply(bigDecimalOrZero);
                        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
                    } else {
                        bigDecimalMultiply2 = BigDecimals7.safeDivide(uiOptionInstrumentPosition.getClearingCostBasis(), uiOptionInstrumentPosition.getClearingRunningQuantity()).abs();
                    }
                    BigDecimal multiplier2 = uiOptionInstrumentPosition.getDirection().getMultiplier();
                    Intrinsics.checkNotNull(bigDecimalMultiply2);
                    BigDecimal bigDecimalMultiply5 = bigDecimalMultiply2.multiply(multiplier2);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply5, "multiply(...)");
                    BigDecimal bigDecimalMultiply6 = bigDecimalMultiply5.multiply(uiAggregateOptionPositionLeg.getRatioQuantity());
                    Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply6, "multiply(...)");
                    BigDecimal bigDecimalMultiply7 = bigDecimalMultiply6.multiply(andSetAggregateSimulatedQuantity);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply7, "multiply(...)");
                    bigDecimalAdd = bigDecimalAdd.add(bigDecimalMultiply7);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
                }
                Intrinsics.checkNotNull(bigDecimalAdd);
            }
            bigDecimalAdd2 = bigDecimalAdd2.add(bigDecimalAdd);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, "add(...)");
        }
        Intrinsics.checkNotNull(bigDecimalAdd2);
        Money money$default = Money3.toMoney$default(bigDecimalAdd2, null, 1, null);
        EquityPositionBundle equityPositionBundle = chartBundle.getEquityPositionBundle();
        if (equityPositionBundle != null) {
            bigDecimalMultiply = equityPositionBundle.getQuantity().multiply(equityPositionBundle.getAverageCost());
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        } else {
            bigDecimalMultiply = null;
        }
        return new OptionsProfitAndLossChartDataState4.PortfolioRiskAnalyzer(money$default.abs().plus(Money3.toMoney$default(BigDecimals7.orZero(bigDecimalMultiply), null, 1, null).abs()), Money3.toMoney$default(BigDecimals7.safeDivide(money$default.getDecimalValue(), bigDecimalOrZero), null, 1, null));
    }

    private final OptionsSimulatedReturnSliderLaunchMode.Time getSliderLaunchMode(OptionsPortfolioRiskAnalyzerPositionDataState ds) {
        List<UiAggregateOptionPositionFull> aggregateOptionPositions = ds.getAggregateOptionPositions();
        ArrayList arrayList = new ArrayList();
        for (UiAggregateOptionPositionFull uiAggregateOptionPositionFull : aggregateOptionPositions) {
            List<UiAggregateOptionPositionLeg> simulatedLegsForOptionPosition = getSimulatedLegsForOptionPosition(ds, uiAggregateOptionPositionFull);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(simulatedLegsForOptionPosition, 10));
            Iterator<T> it = simulatedLegsForOptionPosition.iterator();
            while (it.hasNext()) {
                arrayList2.add(Tuples4.m3642to(uiAggregateOptionPositionFull.getOptionChain(), ((UiAggregateOptionPositionLeg) it.next()).getExpirationDate()));
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (hashSet.add((LocalDate) ((Tuples2) obj).getSecond())) {
                    arrayList3.add(obj);
                }
            }
            CollectionsKt.addAll(arrayList, arrayList3);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            OptionChain optionChain = (OptionChain) ((Tuples2) obj2).getFirst();
            Object arrayList4 = linkedHashMap.get(optionChain);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(optionChain, arrayList4);
            }
            ((List) arrayList4).add(obj2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList5.add((LocalDate) ((Tuples2) it2.next()).getSecond());
            }
            linkedHashMap2.put(key, arrayList5);
        }
        return new OptionsSimulatedReturnSliderLaunchMode.Time.PortfolioRiskAnalyzer(linkedHashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final OptionsGreeks getAggregatedGreeks(OptionsPortfolioRiskAnalyzerPositionDataState ds, OptionsPortfolioRiskAnalyzerEquityPositionRowViewState equityPositionRow) {
        Tuples2 tuples2M3642to;
        Instant instant;
        Double sliderPosition;
        Double underlyingPrice;
        OptionsGreeks optionsGreeks;
        BigDecimal first;
        OptionChain optionChain;
        if (ds.getEquityPosition() == null || equityPositionRow == null) {
            tuples2M3642to = null;
        } else {
            if (equityPositionRow.getChecked()) {
                first = UtilsKt.getQuantityToAverageCost(ds.getEquityPosition()).getFirst();
            } else {
                first = BigDecimal.ZERO;
            }
            UiAggregateOptionPositionFull uiAggregateOptionPositionFull = (UiAggregateOptionPositionFull) CollectionsKt.firstOrNull((List) ds.getAggregateOptionPositions());
            BigDecimal bigDecimalSafeDivide = BigDecimals7.safeDivide(BigDecimal.ONE, BigDecimals7.orZero((uiAggregateOptionPositionFull == null || (optionChain = uiAggregateOptionPositionFull.getOptionChain()) == null) ? null : optionChain.getTradeValueMultiplier()));
            BigDecimal bigDecimal = BigDecimal.ZERO;
            tuples2M3642to = Tuples4.m3642to(new OptionsGreeks(bigDecimalSafeDivide, bigDecimal, bigDecimal, bigDecimal, bigDecimal), first);
        }
        List<UiAggregateOptionPositionFull> aggregateOptionPositions = ds.getAggregateOptionPositions();
        ArrayList arrayList = new ArrayList();
        for (UiAggregateOptionPositionFull uiAggregateOptionPositionFull2 : aggregateOptionPositions) {
            BigDecimal andSetAggregateSimulatedQuantity = getAndSetAggregateSimulatedQuantity(ds, uiAggregateOptionPositionFull2);
            List<UiAggregateOptionPositionLeg> simulatedLegsForOptionPosition = getSimulatedLegsForOptionPosition(ds, uiAggregateOptionPositionFull2);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(simulatedLegsForOptionPosition, 10));
            for (UiAggregateOptionPositionLeg uiAggregateOptionPositionLeg : simulatedLegsForOptionPosition) {
                OptionPricingParams optionPricingParams = ds.getSimulatedReturnsConfigs().get(uiAggregateOptionPositionLeg.getOptionInstrument().getId());
                if (optionPricingParams != null && (instant = ds.getOptionInstrumentIdToExpirationTimes().get(uiAggregateOptionPositionLeg.getOptionInstrument().getId())) != null && (sliderPosition = ds.getSliderPosition()) != null) {
                    Instant instantFromEpochSeconds$default = Instant.Companion.fromEpochSeconds$default(Instant.INSTANCE, (long) sliderPosition.doubleValue(), 0L, 2, null);
                    if (instantFromEpochSeconds$default == null || (underlyingPrice = ds.getUnderlyingPrice()) == null) {
                        optionsGreeks = null;
                    } else {
                        OptionPricingParams optionPricingParamsCopy = optionPricingParams.copy((1919 & 1) != 0 ? optionPricingParams.optionId : null, (1919 & 2) != 0 ? optionPricingParams.impliedVolatility : 0.0d, (1919 & 4) != 0 ? optionPricingParams.isValidIv : false, (1919 & 8) != 0 ? optionPricingParams.markPrice : 0.0d, (1919 & 16) != 0 ? optionPricingParams.spotPrice : underlyingPrice.doubleValue(), (1919 & 32) != 0 ? optionPricingParams.strikePrice : 0.0d, (1919 & 64) != 0 ? optionPricingParams.tau : Duration.m28758toDoubleimpl(instant.m28850minus5sfh64U(instantFromEpochSeconds$default), DurationUnitJvm.DAYS) / 365.0d, (1919 & 128) != 0 ? optionPricingParams.interestRate : 0.0d, (1919 & 256) != 0 ? optionPricingParams.dividendYield : 0.0d, (1919 & 512) != 0 ? optionPricingParams.isPut : false, (1919 & 1024) != 0 ? optionPricingParams.isEuropean : false);
                        optionsGreeks = new OptionsGreeks(UtilsKt.toValidBigDecimal(OptionsSimulatedReturnDeltaCalculation.calculateDelta(optionPricingParamsCopy)), UtilsKt.toValidBigDecimal(OptionsSimulatedReturnGammaCalculation.calculateGamma(optionPricingParamsCopy)), UtilsKt.toValidBigDecimal(OptionSimulatedReturnThetaCalculation.calculateTheta(optionPricingParamsCopy, OptionsSimulatedReturnOptionPriceCalculation.calculateOptionPrice(optionPricingParamsCopy))), UtilsKt.toValidBigDecimal(OptionsSimulatedReturnVegaCalculation.calculateVega(optionPricingParamsCopy)), null);
                    }
                }
                if (optionsGreeks == null) {
                    optionsGreeks = new OptionsGreeks(null, null, null, null, null);
                }
                BigDecimal bigDecimalMultiply = uiAggregateOptionPositionLeg.getPositionType().getDirection().getMultiplier().multiply(uiAggregateOptionPositionLeg.getRatioQuantity());
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                BigDecimal bigDecimalMultiply2 = bigDecimalMultiply.multiply(andSetAggregateSimulatedQuantity);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
                arrayList2.add(Tuples4.m3642to(optionsGreeks, bigDecimalMultiply2));
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        return OptionsGreekAggregationCalculation.getAggregateGreeks(CollectionsKt.plus((Collection) arrayList, (Iterable) CollectionsKt.listOfNotNull(tuples2M3642to)));
    }

    private final String getHeaderCtaString(OptionsPortfolioRiskAnalyzerPositionDataState ds) throws Resources.NotFoundException {
        UUID instrument;
        Position equityPosition = ds.getEquityPosition();
        String string2 = (equityPosition == null || (instrument = equityPosition.getInstrument()) == null) ? null : instrument.toString();
        List<UiAggregateOptionPositionFull> aggregateOptionPositions = ds.getAggregateOptionPositions();
        ArrayList arrayList = new ArrayList();
        for (UiAggregateOptionPositionFull uiAggregateOptionPositionFull : aggregateOptionPositions) {
            List<UiAggregateOptionPositionLeg> uiLegs = uiAggregateOptionPositionFull.getUiLegs();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(uiLegs, 10));
            Iterator<T> it = uiLegs.iterator();
            while (it.hasNext()) {
                arrayList2.add(OptionsPortfolioRiskAnalyzerOptionPositionRowViewState2.getRowIdForLegPosition(uiAggregateOptionPositionFull.getId(), ((UiAggregateOptionPositionLeg) it.next()).getOptionPositionId()));
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        if (OptionsPortfolioRiskAnalyzerPositionStateProvider2.allPositionRowsChecked(string2, arrayList, ds.getRowIdToChecked())) {
            String string3 = this.resources.getString(C23462R.string.options_pra_position_header_cta_deselect_all);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        String string4 = this.resources.getString(C23462R.string.options_pra_position_header_cta_select_all);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return string4;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public OptionsPortfolioRiskAnalyzerPositionViewState reduce(OptionsPortfolioRiskAnalyzerPositionDataState dataState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        OptionSimulatedChartBundle chartBundle = getChartBundle(dataState);
        OptionsPortfolioRiskAnalyzerEquityPositionRowViewState equityPositionRowViewState = getEquityPositionRowViewState(dataState);
        return new OptionsPortfolioRiskAnalyzerPositionViewState(getAggregatedGreeks(dataState, equityPositionRowViewState), chartBundle, getHeaderCtaString(dataState), getProfitLossLaunchMode(dataState, chartBundle), getSliderLaunchMode(dataState), equityPositionRowViewState, getOptionPositionRowViewStates(dataState));
    }
}
