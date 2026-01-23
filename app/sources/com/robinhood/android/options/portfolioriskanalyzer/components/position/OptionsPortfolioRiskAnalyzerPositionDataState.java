package com.robinhood.android.options.portfolioriskanalyzer.components.position;

import com.robinhood.android.portfolio.pnl.UnrealizedProfitAndLossData;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.simulatedreturns.OptionPricingParams;
import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import com.robinhood.models.p355ui.UiOptionInstrumentPosition;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.Instant;

/* compiled from: OptionsPortfolioRiskAnalyzerPositionDataState.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bå\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u000e\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00180\u0014\u0012\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00180\u0014\u0012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001b0\u000e\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eHÆ\u0003J\u0015\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u000eHÆ\u0003J\u0015\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014HÆ\u0003J\u0015\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00180\u0014HÆ\u0003J\u0015\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00180\u0014HÆ\u0003J\u0015\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001b0\u000eHÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010B\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0002\u00103Jì\u0001\u0010C\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u000e2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00180\u00142\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00180\u00142\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001b0\u000e2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÆ\u0001¢\u0006\u0002\u0010DJ\u0013\u0010E\u001a\u00020\u00182\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020HHÖ\u0001J\t\u0010I\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u000e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00180\u0014¢\u0006\b\n\u0000\u001a\u0004\b/\u0010,R\u001d\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00180\u0014¢\u0006\b\n\u0000\u001a\u0004\b0\u0010,R\u001d\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001b0\u000e¢\u0006\b\n\u0000\u001a\u0004\b1\u0010,R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\n\n\u0002\u00104\u001a\u0004\b5\u00103¨\u0006J"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;", "", "aggregateOptionPositions", "", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "equityPosition", "Lcom/robinhood/models/db/Position;", "unrealizedProfitAndLoss", "Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossData;", "quote", "Lcom/robinhood/models/db/Quote;", "instrument", "Lcom/robinhood/models/db/Instrument;", "optionInstrumentIdToExpirationTimes", "", "Ljava/util/UUID;", "Lkotlinx/datetime/Instant;", "optionPositionIdToInstrumentPositions", "Lcom/robinhood/models/ui/UiOptionInstrumentPosition;", "rowIdToSimulatedQuantity", "", "", "Ljava/math/BigDecimal;", "rowIdToChecked", "", "rowIdToCollapsed", "simulatedReturnsConfigs", "Lcom/robinhood/models/db/simulatedreturns/OptionPricingParams;", "sliderPosition", "", "underlyingPrice", "<init>", "(Ljava/util/List;Lcom/robinhood/models/db/Position;Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossData;Lcom/robinhood/models/db/Quote;Lcom/robinhood/models/db/Instrument;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Double;Ljava/lang/Double;)V", "getAggregateOptionPositions", "()Ljava/util/List;", "getEquityPosition", "()Lcom/robinhood/models/db/Position;", "getUnrealizedProfitAndLoss", "()Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossData;", "getQuote", "()Lcom/robinhood/models/db/Quote;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getOptionInstrumentIdToExpirationTimes", "()Ljava/util/Map;", "getOptionPositionIdToInstrumentPositions", "getRowIdToSimulatedQuantity", "getRowIdToChecked", "getRowIdToCollapsed", "getSimulatedReturnsConfigs", "getSliderPosition", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getUnderlyingPrice", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/util/List;Lcom/robinhood/models/db/Position;Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossData;Lcom/robinhood/models/db/Quote;Lcom/robinhood/models/db/Instrument;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Double;Ljava/lang/Double;)Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;", "equals", "other", "hashCode", "", "toString", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsPortfolioRiskAnalyzerPositionDataState {
    public static final int $stable = 8;
    private final List<UiAggregateOptionPositionFull> aggregateOptionPositions;
    private final Position equityPosition;
    private final Instrument instrument;
    private final Map<UUID, Instant> optionInstrumentIdToExpirationTimes;
    private final Map<UUID, UiOptionInstrumentPosition> optionPositionIdToInstrumentPositions;
    private final Quote quote;
    private final Map<String, Boolean> rowIdToChecked;
    private final Map<String, Boolean> rowIdToCollapsed;
    private final Map<String, BigDecimal> rowIdToSimulatedQuantity;
    private final Map<UUID, OptionPricingParams> simulatedReturnsConfigs;
    private final Double sliderPosition;
    private final Double underlyingPrice;
    private final UnrealizedProfitAndLossData unrealizedProfitAndLoss;

    public OptionsPortfolioRiskAnalyzerPositionDataState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public static /* synthetic */ OptionsPortfolioRiskAnalyzerPositionDataState copy$default(OptionsPortfolioRiskAnalyzerPositionDataState optionsPortfolioRiskAnalyzerPositionDataState, List list, Position position, UnrealizedProfitAndLossData unrealizedProfitAndLossData, Quote quote, Instrument instrument, Map map, Map map2, Map map3, Map map4, Map map5, Map map6, Double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = optionsPortfolioRiskAnalyzerPositionDataState.aggregateOptionPositions;
        }
        return optionsPortfolioRiskAnalyzerPositionDataState.copy(list, (i & 2) != 0 ? optionsPortfolioRiskAnalyzerPositionDataState.equityPosition : position, (i & 4) != 0 ? optionsPortfolioRiskAnalyzerPositionDataState.unrealizedProfitAndLoss : unrealizedProfitAndLossData, (i & 8) != 0 ? optionsPortfolioRiskAnalyzerPositionDataState.quote : quote, (i & 16) != 0 ? optionsPortfolioRiskAnalyzerPositionDataState.instrument : instrument, (i & 32) != 0 ? optionsPortfolioRiskAnalyzerPositionDataState.optionInstrumentIdToExpirationTimes : map, (i & 64) != 0 ? optionsPortfolioRiskAnalyzerPositionDataState.optionPositionIdToInstrumentPositions : map2, (i & 128) != 0 ? optionsPortfolioRiskAnalyzerPositionDataState.rowIdToSimulatedQuantity : map3, (i & 256) != 0 ? optionsPortfolioRiskAnalyzerPositionDataState.rowIdToChecked : map4, (i & 512) != 0 ? optionsPortfolioRiskAnalyzerPositionDataState.rowIdToCollapsed : map5, (i & 1024) != 0 ? optionsPortfolioRiskAnalyzerPositionDataState.simulatedReturnsConfigs : map6, (i & 2048) != 0 ? optionsPortfolioRiskAnalyzerPositionDataState.sliderPosition : d, (i & 4096) != 0 ? optionsPortfolioRiskAnalyzerPositionDataState.underlyingPrice : d2);
    }

    public final List<UiAggregateOptionPositionFull> component1() {
        return this.aggregateOptionPositions;
    }

    public final Map<String, Boolean> component10() {
        return this.rowIdToCollapsed;
    }

    public final Map<UUID, OptionPricingParams> component11() {
        return this.simulatedReturnsConfigs;
    }

    /* renamed from: component12, reason: from getter */
    public final Double getSliderPosition() {
        return this.sliderPosition;
    }

    /* renamed from: component13, reason: from getter */
    public final Double getUnderlyingPrice() {
        return this.underlyingPrice;
    }

    /* renamed from: component2, reason: from getter */
    public final Position getEquityPosition() {
        return this.equityPosition;
    }

    /* renamed from: component3, reason: from getter */
    public final UnrealizedProfitAndLossData getUnrealizedProfitAndLoss() {
        return this.unrealizedProfitAndLoss;
    }

    /* renamed from: component4, reason: from getter */
    public final Quote getQuote() {
        return this.quote;
    }

    /* renamed from: component5, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final Map<UUID, Instant> component6() {
        return this.optionInstrumentIdToExpirationTimes;
    }

    public final Map<UUID, UiOptionInstrumentPosition> component7() {
        return this.optionPositionIdToInstrumentPositions;
    }

    public final Map<String, BigDecimal> component8() {
        return this.rowIdToSimulatedQuantity;
    }

    public final Map<String, Boolean> component9() {
        return this.rowIdToChecked;
    }

    public final OptionsPortfolioRiskAnalyzerPositionDataState copy(List<UiAggregateOptionPositionFull> aggregateOptionPositions, Position equityPosition, UnrealizedProfitAndLossData unrealizedProfitAndLoss, Quote quote, Instrument instrument, Map<UUID, Instant> optionInstrumentIdToExpirationTimes, Map<UUID, UiOptionInstrumentPosition> optionPositionIdToInstrumentPositions, Map<String, BigDecimal> rowIdToSimulatedQuantity, Map<String, Boolean> rowIdToChecked, Map<String, Boolean> rowIdToCollapsed, Map<UUID, OptionPricingParams> simulatedReturnsConfigs, Double sliderPosition, Double underlyingPrice) {
        Intrinsics.checkNotNullParameter(aggregateOptionPositions, "aggregateOptionPositions");
        Intrinsics.checkNotNullParameter(optionInstrumentIdToExpirationTimes, "optionInstrumentIdToExpirationTimes");
        Intrinsics.checkNotNullParameter(optionPositionIdToInstrumentPositions, "optionPositionIdToInstrumentPositions");
        Intrinsics.checkNotNullParameter(rowIdToSimulatedQuantity, "rowIdToSimulatedQuantity");
        Intrinsics.checkNotNullParameter(rowIdToChecked, "rowIdToChecked");
        Intrinsics.checkNotNullParameter(rowIdToCollapsed, "rowIdToCollapsed");
        Intrinsics.checkNotNullParameter(simulatedReturnsConfigs, "simulatedReturnsConfigs");
        return new OptionsPortfolioRiskAnalyzerPositionDataState(aggregateOptionPositions, equityPosition, unrealizedProfitAndLoss, quote, instrument, optionInstrumentIdToExpirationTimes, optionPositionIdToInstrumentPositions, rowIdToSimulatedQuantity, rowIdToChecked, rowIdToCollapsed, simulatedReturnsConfigs, sliderPosition, underlyingPrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsPortfolioRiskAnalyzerPositionDataState)) {
            return false;
        }
        OptionsPortfolioRiskAnalyzerPositionDataState optionsPortfolioRiskAnalyzerPositionDataState = (OptionsPortfolioRiskAnalyzerPositionDataState) other;
        return Intrinsics.areEqual(this.aggregateOptionPositions, optionsPortfolioRiskAnalyzerPositionDataState.aggregateOptionPositions) && Intrinsics.areEqual(this.equityPosition, optionsPortfolioRiskAnalyzerPositionDataState.equityPosition) && Intrinsics.areEqual(this.unrealizedProfitAndLoss, optionsPortfolioRiskAnalyzerPositionDataState.unrealizedProfitAndLoss) && Intrinsics.areEqual(this.quote, optionsPortfolioRiskAnalyzerPositionDataState.quote) && Intrinsics.areEqual(this.instrument, optionsPortfolioRiskAnalyzerPositionDataState.instrument) && Intrinsics.areEqual(this.optionInstrumentIdToExpirationTimes, optionsPortfolioRiskAnalyzerPositionDataState.optionInstrumentIdToExpirationTimes) && Intrinsics.areEqual(this.optionPositionIdToInstrumentPositions, optionsPortfolioRiskAnalyzerPositionDataState.optionPositionIdToInstrumentPositions) && Intrinsics.areEqual(this.rowIdToSimulatedQuantity, optionsPortfolioRiskAnalyzerPositionDataState.rowIdToSimulatedQuantity) && Intrinsics.areEqual(this.rowIdToChecked, optionsPortfolioRiskAnalyzerPositionDataState.rowIdToChecked) && Intrinsics.areEqual(this.rowIdToCollapsed, optionsPortfolioRiskAnalyzerPositionDataState.rowIdToCollapsed) && Intrinsics.areEqual(this.simulatedReturnsConfigs, optionsPortfolioRiskAnalyzerPositionDataState.simulatedReturnsConfigs) && Intrinsics.areEqual((Object) this.sliderPosition, (Object) optionsPortfolioRiskAnalyzerPositionDataState.sliderPosition) && Intrinsics.areEqual((Object) this.underlyingPrice, (Object) optionsPortfolioRiskAnalyzerPositionDataState.underlyingPrice);
    }

    public int hashCode() {
        int iHashCode = this.aggregateOptionPositions.hashCode() * 31;
        Position position = this.equityPosition;
        int iHashCode2 = (iHashCode + (position == null ? 0 : position.hashCode())) * 31;
        UnrealizedProfitAndLossData unrealizedProfitAndLossData = this.unrealizedProfitAndLoss;
        int iHashCode3 = (iHashCode2 + (unrealizedProfitAndLossData == null ? 0 : unrealizedProfitAndLossData.hashCode())) * 31;
        Quote quote = this.quote;
        int iHashCode4 = (iHashCode3 + (quote == null ? 0 : quote.hashCode())) * 31;
        Instrument instrument = this.instrument;
        int iHashCode5 = (((((((((((((iHashCode4 + (instrument == null ? 0 : instrument.hashCode())) * 31) + this.optionInstrumentIdToExpirationTimes.hashCode()) * 31) + this.optionPositionIdToInstrumentPositions.hashCode()) * 31) + this.rowIdToSimulatedQuantity.hashCode()) * 31) + this.rowIdToChecked.hashCode()) * 31) + this.rowIdToCollapsed.hashCode()) * 31) + this.simulatedReturnsConfigs.hashCode()) * 31;
        Double d = this.sliderPosition;
        int iHashCode6 = (iHashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.underlyingPrice;
        return iHashCode6 + (d2 != null ? d2.hashCode() : 0);
    }

    public String toString() {
        return "OptionsPortfolioRiskAnalyzerPositionDataState(aggregateOptionPositions=" + this.aggregateOptionPositions + ", equityPosition=" + this.equityPosition + ", unrealizedProfitAndLoss=" + this.unrealizedProfitAndLoss + ", quote=" + this.quote + ", instrument=" + this.instrument + ", optionInstrumentIdToExpirationTimes=" + this.optionInstrumentIdToExpirationTimes + ", optionPositionIdToInstrumentPositions=" + this.optionPositionIdToInstrumentPositions + ", rowIdToSimulatedQuantity=" + this.rowIdToSimulatedQuantity + ", rowIdToChecked=" + this.rowIdToChecked + ", rowIdToCollapsed=" + this.rowIdToCollapsed + ", simulatedReturnsConfigs=" + this.simulatedReturnsConfigs + ", sliderPosition=" + this.sliderPosition + ", underlyingPrice=" + this.underlyingPrice + ")";
    }

    public OptionsPortfolioRiskAnalyzerPositionDataState(List<UiAggregateOptionPositionFull> aggregateOptionPositions, Position position, UnrealizedProfitAndLossData unrealizedProfitAndLossData, Quote quote, Instrument instrument, Map<UUID, Instant> optionInstrumentIdToExpirationTimes, Map<UUID, UiOptionInstrumentPosition> optionPositionIdToInstrumentPositions, Map<String, BigDecimal> rowIdToSimulatedQuantity, Map<String, Boolean> rowIdToChecked, Map<String, Boolean> rowIdToCollapsed, Map<UUID, OptionPricingParams> simulatedReturnsConfigs, Double d, Double d2) {
        Intrinsics.checkNotNullParameter(aggregateOptionPositions, "aggregateOptionPositions");
        Intrinsics.checkNotNullParameter(optionInstrumentIdToExpirationTimes, "optionInstrumentIdToExpirationTimes");
        Intrinsics.checkNotNullParameter(optionPositionIdToInstrumentPositions, "optionPositionIdToInstrumentPositions");
        Intrinsics.checkNotNullParameter(rowIdToSimulatedQuantity, "rowIdToSimulatedQuantity");
        Intrinsics.checkNotNullParameter(rowIdToChecked, "rowIdToChecked");
        Intrinsics.checkNotNullParameter(rowIdToCollapsed, "rowIdToCollapsed");
        Intrinsics.checkNotNullParameter(simulatedReturnsConfigs, "simulatedReturnsConfigs");
        this.aggregateOptionPositions = aggregateOptionPositions;
        this.equityPosition = position;
        this.unrealizedProfitAndLoss = unrealizedProfitAndLossData;
        this.quote = quote;
        this.instrument = instrument;
        this.optionInstrumentIdToExpirationTimes = optionInstrumentIdToExpirationTimes;
        this.optionPositionIdToInstrumentPositions = optionPositionIdToInstrumentPositions;
        this.rowIdToSimulatedQuantity = rowIdToSimulatedQuantity;
        this.rowIdToChecked = rowIdToChecked;
        this.rowIdToCollapsed = rowIdToCollapsed;
        this.simulatedReturnsConfigs = simulatedReturnsConfigs;
        this.sliderPosition = d;
        this.underlyingPrice = d2;
    }

    public /* synthetic */ OptionsPortfolioRiskAnalyzerPositionDataState(List list, Position position, UnrealizedProfitAndLossData unrealizedProfitAndLossData, Quote quote, Instrument instrument, Map map, Map map2, Map map3, Map map4, Map map5, Map map6, Double d, Double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : position, (i & 4) != 0 ? null : unrealizedProfitAndLossData, (i & 8) != 0 ? null : quote, (i & 16) != 0 ? null : instrument, (i & 32) != 0 ? MapsKt.emptyMap() : map, (i & 64) != 0 ? MapsKt.emptyMap() : map2, (i & 128) != 0 ? new LinkedHashMap() : map3, (i & 256) != 0 ? new LinkedHashMap() : map4, (i & 512) != 0 ? new LinkedHashMap() : map5, (i & 1024) != 0 ? MapsKt.emptyMap() : map6, (i & 2048) != 0 ? null : d, (i & 4096) != 0 ? null : d2);
    }

    public final List<UiAggregateOptionPositionFull> getAggregateOptionPositions() {
        return this.aggregateOptionPositions;
    }

    public final Position getEquityPosition() {
        return this.equityPosition;
    }

    public final UnrealizedProfitAndLossData getUnrealizedProfitAndLoss() {
        return this.unrealizedProfitAndLoss;
    }

    public final Quote getQuote() {
        return this.quote;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final Map<UUID, Instant> getOptionInstrumentIdToExpirationTimes() {
        return this.optionInstrumentIdToExpirationTimes;
    }

    public final Map<UUID, UiOptionInstrumentPosition> getOptionPositionIdToInstrumentPositions() {
        return this.optionPositionIdToInstrumentPositions;
    }

    public final Map<String, BigDecimal> getRowIdToSimulatedQuantity() {
        return this.rowIdToSimulatedQuantity;
    }

    public final Map<String, Boolean> getRowIdToChecked() {
        return this.rowIdToChecked;
    }

    public final Map<String, Boolean> getRowIdToCollapsed() {
        return this.rowIdToCollapsed;
    }

    public final Map<UUID, OptionPricingParams> getSimulatedReturnsConfigs() {
        return this.simulatedReturnsConfigs;
    }

    public final Double getSliderPosition() {
        return this.sliderPosition;
    }

    public final Double getUnderlyingPrice() {
        return this.underlyingPrice;
    }
}
