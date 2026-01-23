package com.robinhood.android.advancedchart;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advanced.chart.IndicatorState;
import com.robinhood.android.advanced.chart.IndicatorStateList;
import com.robinhood.android.advancedchart.AdvancedChartIndicatorsAdapter2;
import com.robinhood.android.brokeragecontent.BrokerageDisclosure;
import com.robinhood.android.brokeragecontent.BrokerageResource2;
import com.robinhood.android.charts.models.p080db.AdvancedChartModel;
import com.robinhood.android.charts.util.GraphSelection2;
import com.robinhood.android.sdui.chartgroup.AdvancedChartGroupState;
import com.robinhood.android.sdui.chartgroup.AdvancedChartZoomKeys;
import com.robinhood.android.sdui.chartgroup.AxisConfig;
import com.robinhood.android.sdui.chartgroup.ScrubConfig;
import com.robinhood.android.sdui.chartgroup.SduiChartZoomTransformer;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAdvancedChartRequest;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartIntervals;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartSpanInterval;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartSpans;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.models.p355ui.Historical;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.ChartAxis;
import com.robinhood.models.serverdriven.experimental.api.ChartAxisLabel;
import com.robinhood.models.serverdriven.experimental.api.ChartFill;
import com.robinhood.models.serverdriven.experimental.api.ChartGroup;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.DisplayText;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.Point;
import com.robinhood.models.serverdriven.experimental.api.Segment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.Ranges3;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: AdvancedChartViewState.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010V\u001a\u00020\u000bHÆ\u0003J\t\u0010W\u001a\u00020\rHÆ\u0003J\t\u0010X\u001a\u00020\u000fHÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010[\u001a\u00020\u000bHÆ\u0003J\t\u0010\\\u001a\u00020\u000bHÆ\u0003J\t\u0010]\u001a\u00020\u000bHÆ\u0003J\t\u0010^\u001a\u00020\u000bHÆ\u0003J\t\u0010_\u001a\u00020\u000bHÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cHÆ\u0003J½\u0001\u0010b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cHÆ\u0001J\u0013\u0010c\u001a\u00020\u000b2\b\u0010d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010e\u001a\u00020\u000fHÖ\u0001J\t\u0010f\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010(R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0014\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b1\u0010(R\u0011\u0010\u0015\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b2\u0010(R\u0011\u0010\u0016\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010(R\u0011\u0010\u0017\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010(R\u0011\u0010\u0018\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b3\u0010(R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u00108\u001a\u0004\u0018\u000109¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010<\u001a\u0004\u0018\u00010=¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020B0A¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010E\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bF\u0010%R%\u0010G\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0I\u0012\u0004\u0012\u00020K\u0018\u00010H¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0011\u0010N\u001a\u00020O¢\u0006\b\n\u0000\u001a\u0004\bP\u0010Q¨\u0006g"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/AdvancedChartViewState;", "", "advancedChart", "Lcom/robinhood/android/charts/models/db/AdvancedChartModel;", "chartSpans", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartSpans;", "displaySpan", "", "chartIntervals", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartIntervals;", "isLoading", "", "indicatorList", "Lcom/robinhood/android/advanced/chart/IndicatorStateList;", "indicatorListViewHeight", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "quote", "Lcom/robinhood/models/db/Quote;", "hideExtendedHours", "showCandlesticks", "isEditSurfaceIconEnabled", "isIndicatorTapScrollEnabled", "showCustomIntervalsTooltip", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "xAxisZoomRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "<init>", "(Lcom/robinhood/android/charts/models/db/AdvancedChartModel;Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartSpans;Ljava/lang/String;Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartIntervals;ZLcom/robinhood/android/advanced/chart/IndicatorStateList;ILcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Quote;ZZZZZLcom/robinhood/iso/countrycode/CountryCode$Supported;Lkotlin/ranges/ClosedFloatingPointRange;)V", "getAdvancedChart", "()Lcom/robinhood/android/charts/models/db/AdvancedChartModel;", "getChartSpans", "()Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartSpans;", "getDisplaySpan", "()Ljava/lang/String;", "getChartIntervals", "()Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartIntervals;", "()Z", "getIndicatorList", "()Lcom/robinhood/android/advanced/chart/IndicatorStateList;", "getIndicatorListViewHeight", "()I", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getQuote", "()Lcom/robinhood/models/db/Quote;", "getHideExtendedHours", "getShowCandlesticks", "getShowCustomIntervalsTooltip", "getLocality", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getXAxisZoomRange", "()Lkotlin/ranges/ClosedFloatingPointRange;", "advancedChartRequest", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAdvancedChartRequest;", "getAdvancedChartRequest", "()Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAdvancedChartRequest;", "activeChartInterval", "Lcom/robinhood/models/ui/Historical$Interval;", "getActiveChartInterval", "()Lcom/robinhood/models/ui/Historical$Interval;", "indicatorsWithHeaders", "", "Lcom/robinhood/android/advancedchart/ChartIndicatorListItem;", "getIndicatorsWithHeaders", "()Ljava/util/List;", "disclosureId", "getDisclosureId", "chartGroupWithZoomKeys", "Lkotlin/Pair;", "Lcom/robinhood/models/serverdriven/experimental/api/ChartGroup;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "Lcom/robinhood/android/sdui/chartgroup/AdvancedChartZoomKeys;", "getChartGroupWithZoomKeys", "()Lkotlin/Pair;", "advancedChartGroupState", "Lcom/robinhood/android/sdui/chartgroup/AdvancedChartGroupState;", "getAdvancedChartGroupState", "()Lcom/robinhood/android/sdui/chartgroup/AdvancedChartGroupState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "other", "hashCode", "toString", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final /* data */ class AdvancedChartViewState {
    public static final int $stable = 8;
    private final Historical.Interval activeChartInterval;
    private final AdvancedChartModel advancedChart;
    private final AdvancedChartGroupState advancedChartGroupState;
    private final InstrumentAdvancedChartRequest advancedChartRequest;
    private final Tuples2<ChartGroup<GenericAction>, AdvancedChartZoomKeys> chartGroupWithZoomKeys;
    private final InstrumentChartIntervals chartIntervals;
    private final InstrumentChartSpans chartSpans;
    private final String disclosureId;
    private final String displaySpan;
    private final boolean hideExtendedHours;
    private final IndicatorStateList indicatorList;
    private final int indicatorListViewHeight;
    private final List<AdvancedChartIndicatorsAdapter2> indicatorsWithHeaders;
    private final Instrument instrument;
    private final boolean isEditSurfaceIconEnabled;
    private final boolean isIndicatorTapScrollEnabled;
    private final boolean isLoading;
    private final CountryCode.Supported locality;
    private final Quote quote;
    private final boolean showCandlesticks;
    private final boolean showCustomIntervalsTooltip;
    private final Ranges3<Float> xAxisZoomRange;

    public AdvancedChartViewState() {
        this(null, null, null, null, false, null, 0, null, null, false, false, false, false, false, null, null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
    }

    /* renamed from: component1, reason: from getter */
    public final AdvancedChartModel getAdvancedChart() {
        return this.advancedChart;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getHideExtendedHours() {
        return this.hideExtendedHours;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getShowCandlesticks() {
        return this.showCandlesticks;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsEditSurfaceIconEnabled() {
        return this.isEditSurfaceIconEnabled;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsIndicatorTapScrollEnabled() {
        return this.isIndicatorTapScrollEnabled;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getShowCustomIntervalsTooltip() {
        return this.showCustomIntervalsTooltip;
    }

    /* renamed from: component15, reason: from getter */
    public final CountryCode.Supported getLocality() {
        return this.locality;
    }

    public final Ranges3<Float> component16() {
        return this.xAxisZoomRange;
    }

    /* renamed from: component2, reason: from getter */
    public final InstrumentChartSpans getChartSpans() {
        return this.chartSpans;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDisplaySpan() {
        return this.displaySpan;
    }

    /* renamed from: component4, reason: from getter */
    public final InstrumentChartIntervals getChartIntervals() {
        return this.chartIntervals;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component6, reason: from getter */
    public final IndicatorStateList getIndicatorList() {
        return this.indicatorList;
    }

    /* renamed from: component7, reason: from getter */
    public final int getIndicatorListViewHeight() {
        return this.indicatorListViewHeight;
    }

    /* renamed from: component8, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component9, reason: from getter */
    public final Quote getQuote() {
        return this.quote;
    }

    public final AdvancedChartViewState copy(AdvancedChartModel advancedChart, InstrumentChartSpans chartSpans, String displaySpan, InstrumentChartIntervals chartIntervals, boolean isLoading, IndicatorStateList indicatorList, int indicatorListViewHeight, Instrument instrument, Quote quote, boolean hideExtendedHours, boolean showCandlesticks, boolean isEditSurfaceIconEnabled, boolean isIndicatorTapScrollEnabled, boolean showCustomIntervalsTooltip, CountryCode.Supported locality, Ranges3<Float> xAxisZoomRange) {
        Intrinsics.checkNotNullParameter(indicatorList, "indicatorList");
        Intrinsics.checkNotNullParameter(xAxisZoomRange, "xAxisZoomRange");
        return new AdvancedChartViewState(advancedChart, chartSpans, displaySpan, chartIntervals, isLoading, indicatorList, indicatorListViewHeight, instrument, quote, hideExtendedHours, showCandlesticks, isEditSurfaceIconEnabled, isIndicatorTapScrollEnabled, showCustomIntervalsTooltip, locality, xAxisZoomRange);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvancedChartViewState)) {
            return false;
        }
        AdvancedChartViewState advancedChartViewState = (AdvancedChartViewState) other;
        return Intrinsics.areEqual(this.advancedChart, advancedChartViewState.advancedChart) && Intrinsics.areEqual(this.chartSpans, advancedChartViewState.chartSpans) && Intrinsics.areEqual(this.displaySpan, advancedChartViewState.displaySpan) && Intrinsics.areEqual(this.chartIntervals, advancedChartViewState.chartIntervals) && this.isLoading == advancedChartViewState.isLoading && Intrinsics.areEqual(this.indicatorList, advancedChartViewState.indicatorList) && this.indicatorListViewHeight == advancedChartViewState.indicatorListViewHeight && Intrinsics.areEqual(this.instrument, advancedChartViewState.instrument) && Intrinsics.areEqual(this.quote, advancedChartViewState.quote) && this.hideExtendedHours == advancedChartViewState.hideExtendedHours && this.showCandlesticks == advancedChartViewState.showCandlesticks && this.isEditSurfaceIconEnabled == advancedChartViewState.isEditSurfaceIconEnabled && this.isIndicatorTapScrollEnabled == advancedChartViewState.isIndicatorTapScrollEnabled && this.showCustomIntervalsTooltip == advancedChartViewState.showCustomIntervalsTooltip && Intrinsics.areEqual(this.locality, advancedChartViewState.locality) && Intrinsics.areEqual(this.xAxisZoomRange, advancedChartViewState.xAxisZoomRange);
    }

    public int hashCode() {
        AdvancedChartModel advancedChartModel = this.advancedChart;
        int iHashCode = (advancedChartModel == null ? 0 : advancedChartModel.hashCode()) * 31;
        InstrumentChartSpans instrumentChartSpans = this.chartSpans;
        int iHashCode2 = (iHashCode + (instrumentChartSpans == null ? 0 : instrumentChartSpans.hashCode())) * 31;
        String str = this.displaySpan;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        InstrumentChartIntervals instrumentChartIntervals = this.chartIntervals;
        int iHashCode4 = (((((((iHashCode3 + (instrumentChartIntervals == null ? 0 : instrumentChartIntervals.hashCode())) * 31) + Boolean.hashCode(this.isLoading)) * 31) + this.indicatorList.hashCode()) * 31) + Integer.hashCode(this.indicatorListViewHeight)) * 31;
        Instrument instrument = this.instrument;
        int iHashCode5 = (iHashCode4 + (instrument == null ? 0 : instrument.hashCode())) * 31;
        Quote quote = this.quote;
        int iHashCode6 = (((((((((((iHashCode5 + (quote == null ? 0 : quote.hashCode())) * 31) + Boolean.hashCode(this.hideExtendedHours)) * 31) + Boolean.hashCode(this.showCandlesticks)) * 31) + Boolean.hashCode(this.isEditSurfaceIconEnabled)) * 31) + Boolean.hashCode(this.isIndicatorTapScrollEnabled)) * 31) + Boolean.hashCode(this.showCustomIntervalsTooltip)) * 31;
        CountryCode.Supported supported = this.locality;
        return ((iHashCode6 + (supported != null ? supported.hashCode() : 0)) * 31) + this.xAxisZoomRange.hashCode();
    }

    public String toString() {
        return "AdvancedChartViewState(advancedChart=" + this.advancedChart + ", chartSpans=" + this.chartSpans + ", displaySpan=" + this.displaySpan + ", chartIntervals=" + this.chartIntervals + ", isLoading=" + this.isLoading + ", indicatorList=" + this.indicatorList + ", indicatorListViewHeight=" + this.indicatorListViewHeight + ", instrument=" + this.instrument + ", quote=" + this.quote + ", hideExtendedHours=" + this.hideExtendedHours + ", showCandlesticks=" + this.showCandlesticks + ", isEditSurfaceIconEnabled=" + this.isEditSurfaceIconEnabled + ", isIndicatorTapScrollEnabled=" + this.isIndicatorTapScrollEnabled + ", showCustomIntervalsTooltip=" + this.showCustomIntervalsTooltip + ", locality=" + this.locality + ", xAxisZoomRange=" + this.xAxisZoomRange + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0285  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AdvancedChartViewState(AdvancedChartModel advancedChartModel, InstrumentChartSpans instrumentChartSpans, String str, InstrumentChartIntervals instrumentChartIntervals, boolean z, IndicatorStateList indicatorList, int i, Instrument instrument, Quote quote, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, CountryCode.Supported supported, Ranges3<Float> xAxisZoomRange) {
        InstrumentAdvancedChartRequest instrumentAdvancedChartRequest;
        Historical.Interval interval;
        GraphSelection equityGraphSelection;
        float fFloatValue;
        float fFloatValue2;
        Collection collectionEmptyList;
        Collection collectionEmptyList2;
        ArrayList arrayList;
        ChartGroup<GenericAction> chartGroup;
        ChartAxis x_axis;
        ChartAxis chartAxisTransform;
        Map<String, DisplayText> scrubbing_labels;
        Set<String> setKeySet;
        List<ChartAxis> zoomXAxes;
        ChartGroup<GenericAction> chartGroup2;
        ChartGroup<GenericAction> chartGroup3;
        ChartAxis x_axis2;
        Map<String, DisplayText> scrubbing_labels2;
        Set<String> setKeySet2;
        List<ChartFill> fills;
        List<Line> lines;
        List<ChartFill> fills2;
        Float fValueOf;
        List<Line> lines2;
        Float fValueOf2;
        ChartGroup<GenericAction> chartGroup4;
        List<Chart<ActionT>> charts;
        ImmutableList<InstrumentChartSpanInterval> spans;
        InstrumentChartSpanInterval next;
        String selectedInterval;
        String str2 = str;
        Intrinsics.checkNotNullParameter(indicatorList, "indicatorList");
        Intrinsics.checkNotNullParameter(xAxisZoomRange, "xAxisZoomRange");
        this.advancedChart = advancedChartModel;
        this.chartSpans = instrumentChartSpans;
        this.displaySpan = str2;
        this.chartIntervals = instrumentChartIntervals;
        this.isLoading = z;
        this.indicatorList = indicatorList;
        this.indicatorListViewHeight = i;
        this.instrument = instrument;
        this.quote = quote;
        this.hideExtendedHours = z2;
        this.showCandlesticks = z3;
        this.isEditSurfaceIconEnabled = z4;
        this.isIndicatorTapScrollEnabled = z5;
        this.showCustomIntervalsTooltip = z6;
        this.locality = supported;
        this.xAxisZoomRange = xAxisZoomRange;
        ImmutableList3 persistentList = null;
        if (str2 != null && instrumentChartSpans != null && instrument != null && instrumentChartIntervals != null) {
            UUID id = instrument.getId();
            for (InstrumentChartSpanInterval instrumentChartSpanInterval : instrumentChartIntervals.getSpans()) {
                if (Intrinsics.areEqual(instrumentChartSpanInterval.getSpanId(), this.displaySpan)) {
                    String selectedInterval2 = instrumentChartSpanInterval.getSelectedInterval();
                    List<IndicatorState> indicatorStates = this.indicatorList.getIndicatorStates();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(indicatorStates, 10));
                    Iterator<T> it = indicatorStates.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((IndicatorState) it.next()).getApiTechnicalIndicator());
                    }
                    instrumentAdvancedChartRequest = new InstrumentAdvancedChartRequest(id, str2, selectedInterval2, arrayList2, this.hideExtendedHours, this.showCandlesticks, false);
                } else {
                    str2 = str;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        instrumentAdvancedChartRequest = null;
        this.advancedChartRequest = instrumentAdvancedChartRequest;
        InstrumentChartIntervals instrumentChartIntervals2 = this.chartIntervals;
        if (instrumentChartIntervals2 == null || (spans = instrumentChartIntervals2.getSpans()) == null) {
            DisplaySpan displaySpanFromServerValue = DisplaySpan.INSTANCE.fromServerValue(this.displaySpan);
            interval = (displaySpanFromServerValue == null || (equityGraphSelection = GraphSelection2.getEquityGraphSelection(displaySpanFromServerValue)) == null) ? null : equityGraphSelection.getInterval();
        } else {
            Iterator<InstrumentChartSpanInterval> it2 = spans.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.areEqual(next.getSpanId(), this.displaySpan)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InstrumentChartSpanInterval instrumentChartSpanInterval2 = next;
            if (instrumentChartSpanInterval2 == null || (selectedInterval = instrumentChartSpanInterval2.getSelectedInterval()) == null || (interval = Historical.Interval.INSTANCE.fromServerValue(selectedInterval)) == null) {
            }
        }
        this.activeChartInterval = interval;
        List listPlus = CollectionsKt.plus((Collection<? extends AdvancedChartIndicatorsAdapter2.EmptyStateAddDataHeader>) CollectionsKt.plus((Collection<? extends AdvancedChartIndicatorsAdapter2.ControlButtonHeader>) CollectionsKt.emptyList(), new AdvancedChartIndicatorsAdapter2.ControlButtonHeader(this.isEditSurfaceIconEnabled)), this.indicatorList.getIndicatorStates().isEmpty() ? AdvancedChartIndicatorsAdapter2.EmptyStateAddDataHeader.INSTANCE : null);
        List<IndicatorState> indicatorStates2 = this.indicatorList.getIndicatorStates();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(indicatorStates2, 10));
        Iterator<T> it3 = indicatorStates2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new AdvancedChartIndicatorsAdapter2.IndicatorStateItem((IndicatorState) it3.next(), this.isIndicatorTapScrollEnabled));
        }
        this.indicatorsWithHeaders = CollectionsKt.filterNotNull(CollectionsKt.plus((Collection) listPlus, (Iterable) arrayList3));
        this.disclosureId = BrokerageResource2.getContentfulId(BrokerageDisclosure.ADVANCED_CHART, this.locality);
        AdvancedChartModel advancedChartModel2 = this.advancedChart;
        this.chartGroupWithZoomKeys = advancedChartModel2 != null ? Tuples4.m3642to(advancedChartModel2.getChartGroup(), new AdvancedChartZoomKeys(this.advancedChart.getDisplaySpan(), this.advancedChart.getHideExtendedHours(), this.advancedChart.getInterval(), this.advancedChart.getShowCandlesticks(), this.advancedChart.getTechnicalIndicators())) : null;
        AdvancedChartModel advancedChartModel3 = this.advancedChart;
        Chart chart = (advancedChartModel3 == null || (chartGroup4 = advancedChartModel3.getChartGroup()) == null || (charts = chartGroup4.getCharts()) == 0) ? null : (Chart) CollectionsKt.firstOrNull((List) charts);
        float fAbs = 0.0f;
        if (chart == null || (lines2 = chart.getLines()) == null) {
            fFloatValue = 0.0f;
        } else {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : lines2) {
                if (!SduiChartZoomTransformer.isGridLine((Line) obj)) {
                    arrayList4.add(obj);
                }
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                CollectionsKt.addAll(arrayList5, ((Line) it4.next()).getSegments());
            }
            ArrayList arrayList6 = new ArrayList();
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                CollectionsKt.addAll(arrayList6, ((Segment) it5.next()).getPoints());
            }
            Iterator it6 = arrayList6.iterator();
            if (it6.hasNext()) {
                float x = ((Point) it6.next()).getX();
                while (it6.hasNext()) {
                    x = Math.max(x, ((Point) it6.next()).getX());
                }
                fValueOf2 = Float.valueOf(x);
            } else {
                fValueOf2 = null;
            }
            if (fValueOf2 != null) {
                fFloatValue = fValueOf2.floatValue();
            }
        }
        if (chart == null || (fills2 = chart.getFills()) == null) {
            fFloatValue2 = 0.0f;
        } else {
            ArrayList arrayList7 = new ArrayList();
            Iterator<T> it7 = fills2.iterator();
            while (it7.hasNext()) {
                CollectionsKt.addAll(arrayList7, ((ChartFill) it7.next()).getPoints());
            }
            Iterator it8 = arrayList7.iterator();
            if (it8.hasNext()) {
                float x2 = ((Point) it8.next()).getX();
                while (it8.hasNext()) {
                    x2 = Math.max(x2, ((Point) it8.next()).getX());
                }
                fValueOf = Float.valueOf(x2);
            } else {
                fValueOf = null;
            }
            if (fValueOf != null) {
                fFloatValue2 = fValueOf.floatValue();
            }
        }
        float fMax = Math.max(fFloatValue, fFloatValue2);
        if (chart == null || (lines = chart.getLines()) == null) {
            collectionEmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList8 = new ArrayList();
            for (Object obj2 : lines) {
                if (!SduiChartZoomTransformer.isGridLine((Line) obj2)) {
                    arrayList8.add(obj2);
                }
            }
            ArrayList arrayList9 = new ArrayList();
            Iterator it9 = arrayList8.iterator();
            while (it9.hasNext()) {
                CollectionsKt.addAll(arrayList9, ((Line) it9.next()).getSegments());
            }
            collectionEmptyList = new ArrayList();
            Iterator it10 = arrayList9.iterator();
            while (it10.hasNext()) {
                CollectionsKt.addAll(collectionEmptyList, ((Segment) it10.next()).getPoints());
            }
        }
        if (chart == null || (fills = chart.getFills()) == null) {
            collectionEmptyList2 = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList10 = new ArrayList();
            for (Object obj3 : fills) {
                if (!SduiChartZoomTransformer.isVolumeBar((ChartFill) obj3)) {
                    arrayList10.add(obj3);
                }
            }
            collectionEmptyList2 = new ArrayList();
            Iterator it11 = arrayList10.iterator();
            while (it11.hasNext()) {
                CollectionsKt.addAll(collectionEmptyList2, ((ChartFill) it11.next()).getPoints());
            }
        }
        AdvancedChartModel advancedChartModel4 = this.advancedChart;
        if (advancedChartModel4 == null || (chartGroup3 = advancedChartModel4.getChartGroup()) == null || (x_axis2 = chartGroup3.getX_axis()) == null || (scrubbing_labels2 = x_axis2.getScrubbing_labels()) == null || (setKeySet2 = scrubbing_labels2.keySet()) == null) {
            arrayList = null;
        } else {
            Set<String> set = setKeySet2;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
            Iterator<T> it12 = set.iterator();
            while (it12.hasNext()) {
                arrayList.add(Float.valueOf(Float.parseFloat((String) it12.next())));
            }
        }
        if (arrayList != null && arrayList.size() >= 2) {
            fAbs = Math.abs(((Number) arrayList.get(1)).floatValue() - ((Number) arrayList.get(0)).floatValue()) * 10;
        }
        int i2 = this.indicatorListViewHeight;
        List listPlus2 = CollectionsKt.plus(collectionEmptyList, (Iterable) collectionEmptyList2);
        AdvancedChartModel advancedChartModel5 = this.advancedChart;
        List listListOfNotNull = CollectionsKt.listOfNotNull((advancedChartModel5 == null || (chartGroup2 = advancedChartModel5.getChartGroup()) == null) ? null : chartGroup2.getX_axis());
        AdvancedChartModel advancedChartModel6 = this.advancedChart;
        AxisConfig axisConfig = new AxisConfig(fAbs, fMax, listPlus2, null, false, null, true, CollectionsKt.sortedWith(CollectionsKt.plus((Collection) listListOfNotNull, (Iterable) ((advancedChartModel6 == null || (zoomXAxes = advancedChartModel6.getZoomXAxes()) == null) ? CollectionsKt.emptyList() : zoomXAxes)), new Comparator() { // from class: com.robinhood.android.advancedchart.AdvancedChartViewState$advancedChartGroupState$lambda$21$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((ChartAxis) t).getLabels().size()), Integer.valueOf(((ChartAxis) t2).getLabels().size()));
            }
        }), 56, null);
        AdvancedChartModel advancedChartModel7 = this.advancedChart;
        if (advancedChartModel7 != null && (chartGroup = advancedChartModel7.getChartGroup()) != null && (x_axis = chartGroup.getX_axis()) != null && (chartAxisTransform = SduiChartZoomTransformer.transform(x_axis, this.xAxisZoomRange, (List<ChartAxisLabel>) null)) != null && (scrubbing_labels = chartAxisTransform.getScrubbing_labels()) != null && (setKeySet = scrubbing_labels.keySet()) != null) {
            Set<String> set2 = setKeySet;
            ArrayList arrayList11 = new ArrayList(CollectionsKt.collectionSizeOrDefault(set2, 10));
            Iterator<T> it13 = set2.iterator();
            while (it13.hasNext()) {
                arrayList11.add(Float.valueOf(Float.parseFloat((String) it13.next())));
            }
            persistentList = extensions2.toPersistentList(arrayList11);
        }
        this.advancedChartGroupState = new AdvancedChartGroupState(axisConfig, new ScrubConfig(false, false, null, false, false, false, false, persistentList, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null), null, i2, false, 20, null);
    }

    public final AdvancedChartModel getAdvancedChart() {
        return this.advancedChart;
    }

    public final InstrumentChartSpans getChartSpans() {
        return this.chartSpans;
    }

    public final String getDisplaySpan() {
        return this.displaySpan;
    }

    public final InstrumentChartIntervals getChartIntervals() {
        return this.chartIntervals;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AdvancedChartViewState(com.robinhood.android.charts.models.p080db.AdvancedChartModel r18, com.robinhood.models.p320db.bonfire.instrument.InstrumentChartSpans r19, java.lang.String r20, com.robinhood.models.p320db.bonfire.instrument.InstrumentChartIntervals r21, boolean r22, com.robinhood.android.advanced.chart.IndicatorStateList r23, int r24, com.robinhood.models.p320db.Instrument r25, com.robinhood.models.p320db.Quote r26, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31, com.robinhood.iso.countrycode.CountryCode.Supported r32, kotlin.ranges.Ranges3 r33, int r34, kotlin.jvm.internal.DefaultConstructorMarker r35) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.advancedchart.AdvancedChartViewState.<init>(com.robinhood.android.charts.models.db.AdvancedChartModel, com.robinhood.models.db.bonfire.instrument.InstrumentChartSpans, java.lang.String, com.robinhood.models.db.bonfire.instrument.InstrumentChartIntervals, boolean, com.robinhood.android.advanced.chart.IndicatorStateList, int, com.robinhood.models.db.Instrument, com.robinhood.models.db.Quote, boolean, boolean, boolean, boolean, boolean, com.robinhood.iso.countrycode.CountryCode$Supported, kotlin.ranges.ClosedFloatingPointRange, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final IndicatorStateList getIndicatorList() {
        return this.indicatorList;
    }

    public final int getIndicatorListViewHeight() {
        return this.indicatorListViewHeight;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final Quote getQuote() {
        return this.quote;
    }

    public final boolean getHideExtendedHours() {
        return this.hideExtendedHours;
    }

    public final boolean getShowCandlesticks() {
        return this.showCandlesticks;
    }

    public final boolean isEditSurfaceIconEnabled() {
        return this.isEditSurfaceIconEnabled;
    }

    public final boolean isIndicatorTapScrollEnabled() {
        return this.isIndicatorTapScrollEnabled;
    }

    public final boolean getShowCustomIntervalsTooltip() {
        return this.showCustomIntervalsTooltip;
    }

    public final CountryCode.Supported getLocality() {
        return this.locality;
    }

    public final Ranges3<Float> getXAxisZoomRange() {
        return this.xAxisZoomRange;
    }

    public final InstrumentAdvancedChartRequest getAdvancedChartRequest() {
        return this.advancedChartRequest;
    }

    public final Historical.Interval getActiveChartInterval() {
        return this.activeChartInterval;
    }

    public final List<AdvancedChartIndicatorsAdapter2> getIndicatorsWithHeaders() {
        return this.indicatorsWithHeaders;
    }

    public final String getDisclosureId() {
        return this.disclosureId;
    }

    public final Tuples2<ChartGroup<GenericAction>, AdvancedChartZoomKeys> getChartGroupWithZoomKeys() {
        return this.chartGroupWithZoomKeys;
    }

    public final AdvancedChartGroupState getAdvancedChartGroupState() {
        return this.advancedChartGroupState;
    }
}
