package com.robinhood.android.equitydetail.p123ui.chart;

import com.robinhood.android.engagement.l2improvements.experiments.GoldL2DataUpsellImprovements;
import com.robinhood.android.engagement.l2improvements.experiments.GoldL2SdpEntrypointExperiment;
import com.robinhood.android.equitydetail.p123ui.chartsettings.ChartSettingsBottomSheetComposable2;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartSpans;
import com.robinhood.models.p320db.bonfire.instrument.SduiInstrumentChart;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u00103\u001a\u00020\u000bHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u00105\u001a\u00020\u000fHÆ\u0003J\t\u00106\u001a\u00020\u0011HÆ\u0003J\t\u00107\u001a\u00020\u0013HÆ\u0003J\t\u00108\u001a\u00020\u000bHÆ\u0003J\t\u00109\u001a\u00020\u000bHÆ\u0003J\t\u0010:\u001a\u00020\u000bHÆ\u0003J\t\u0010;\u001a\u00020\u000bHÆ\u0003J\u0095\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000bHÆ\u0001J\u0013\u0010=\u001a\u00020\u000b2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020@HÖ\u0001J\t\u0010A\u001a\u00020BHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0014\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0011\u0010\u0015\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0011\u0010\u0016\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010#R\u0011\u0010\u0017\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartViewState;", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "chart", "Lcom/robinhood/models/db/bonfire/instrument/SduiInstrumentChart;", "chartSpans", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartSpans;", "activeDisplaySpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "showAdtChip", "", "marginSubscription", "Lcom/robinhood/models/subscription/db/MarginSubscription;", "goldL2DataUpsellImprovements", "Lcom/robinhood/android/engagement/l2improvements/experiments/GoldL2DataUpsellImprovements$Variant;", "goldL2SdpEntrypointVariant", "Lcom/robinhood/android/engagement/l2improvements/experiments/GoldL2SdpEntrypointExperiment$Variant;", "selectedChartType", "Lcom/robinhood/android/equitydetail/ui/chartsettings/ChartType;", "showExtendedHours", "hasVisitedBwChart", "isInBlackWidowAdvancedChartExperiment", "showDisplayCurrencyLabel", "<init>", "(Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/bonfire/instrument/SduiInstrumentChart;Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartSpans;Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;ZLcom/robinhood/models/subscription/db/MarginSubscription;Lcom/robinhood/android/engagement/l2improvements/experiments/GoldL2DataUpsellImprovements$Variant;Lcom/robinhood/android/engagement/l2improvements/experiments/GoldL2SdpEntrypointExperiment$Variant;Lcom/robinhood/android/equitydetail/ui/chartsettings/ChartType;ZZZZ)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getChart", "()Lcom/robinhood/models/db/bonfire/instrument/SduiInstrumentChart;", "getChartSpans", "()Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartSpans;", "getActiveDisplaySpan", "()Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "getShowAdtChip", "()Z", "getMarginSubscription", "()Lcom/robinhood/models/subscription/db/MarginSubscription;", "getGoldL2DataUpsellImprovements", "()Lcom/robinhood/android/engagement/l2improvements/experiments/GoldL2DataUpsellImprovements$Variant;", "getGoldL2SdpEntrypointVariant", "()Lcom/robinhood/android/engagement/l2improvements/experiments/GoldL2SdpEntrypointExperiment$Variant;", "getSelectedChartType", "()Lcom/robinhood/android/equitydetail/ui/chartsettings/ChartType;", "getShowExtendedHours", "getHasVisitedBwChart", "getShowDisplayCurrencyLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InstrumentChartViewState {
    public static final int $stable = 8;
    private final DisplaySpan activeDisplaySpan;
    private final SduiInstrumentChart chart;
    private final InstrumentChartSpans chartSpans;
    private final GoldL2DataUpsellImprovements.Variant goldL2DataUpsellImprovements;
    private final GoldL2SdpEntrypointExperiment.Variant goldL2SdpEntrypointVariant;
    private final boolean hasVisitedBwChart;
    private final Instrument instrument;
    private final boolean isInBlackWidowAdvancedChartExperiment;
    private final MarginSubscription marginSubscription;
    private final ChartSettingsBottomSheetComposable2 selectedChartType;
    private final boolean showAdtChip;
    private final boolean showDisplayCurrencyLabel;
    private final boolean showExtendedHours;

    public InstrumentChartViewState() {
        this(null, null, null, null, false, null, null, null, null, false, false, false, false, 8191, null);
    }

    public static /* synthetic */ InstrumentChartViewState copy$default(InstrumentChartViewState instrumentChartViewState, Instrument instrument, SduiInstrumentChart sduiInstrumentChart, InstrumentChartSpans instrumentChartSpans, DisplaySpan displaySpan, boolean z, MarginSubscription marginSubscription, GoldL2DataUpsellImprovements.Variant variant, GoldL2SdpEntrypointExperiment.Variant variant2, ChartSettingsBottomSheetComposable2 chartSettingsBottomSheetComposable2, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            instrument = instrumentChartViewState.instrument;
        }
        return instrumentChartViewState.copy(instrument, (i & 2) != 0 ? instrumentChartViewState.chart : sduiInstrumentChart, (i & 4) != 0 ? instrumentChartViewState.chartSpans : instrumentChartSpans, (i & 8) != 0 ? instrumentChartViewState.activeDisplaySpan : displaySpan, (i & 16) != 0 ? instrumentChartViewState.showAdtChip : z, (i & 32) != 0 ? instrumentChartViewState.marginSubscription : marginSubscription, (i & 64) != 0 ? instrumentChartViewState.goldL2DataUpsellImprovements : variant, (i & 128) != 0 ? instrumentChartViewState.goldL2SdpEntrypointVariant : variant2, (i & 256) != 0 ? instrumentChartViewState.selectedChartType : chartSettingsBottomSheetComposable2, (i & 512) != 0 ? instrumentChartViewState.showExtendedHours : z2, (i & 1024) != 0 ? instrumentChartViewState.hasVisitedBwChart : z3, (i & 2048) != 0 ? instrumentChartViewState.isInBlackWidowAdvancedChartExperiment : z4, (i & 4096) != 0 ? instrumentChartViewState.showDisplayCurrencyLabel : z5);
    }

    /* renamed from: component1, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShowExtendedHours() {
        return this.showExtendedHours;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getHasVisitedBwChart() {
        return this.hasVisitedBwChart;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsInBlackWidowAdvancedChartExperiment() {
        return this.isInBlackWidowAdvancedChartExperiment;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getShowDisplayCurrencyLabel() {
        return this.showDisplayCurrencyLabel;
    }

    /* renamed from: component2, reason: from getter */
    public final SduiInstrumentChart getChart() {
        return this.chart;
    }

    /* renamed from: component3, reason: from getter */
    public final InstrumentChartSpans getChartSpans() {
        return this.chartSpans;
    }

    /* renamed from: component4, reason: from getter */
    public final DisplaySpan getActiveDisplaySpan() {
        return this.activeDisplaySpan;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowAdtChip() {
        return this.showAdtChip;
    }

    /* renamed from: component6, reason: from getter */
    public final MarginSubscription getMarginSubscription() {
        return this.marginSubscription;
    }

    /* renamed from: component7, reason: from getter */
    public final GoldL2DataUpsellImprovements.Variant getGoldL2DataUpsellImprovements() {
        return this.goldL2DataUpsellImprovements;
    }

    /* renamed from: component8, reason: from getter */
    public final GoldL2SdpEntrypointExperiment.Variant getGoldL2SdpEntrypointVariant() {
        return this.goldL2SdpEntrypointVariant;
    }

    /* renamed from: component9, reason: from getter */
    public final ChartSettingsBottomSheetComposable2 getSelectedChartType() {
        return this.selectedChartType;
    }

    public final InstrumentChartViewState copy(Instrument instrument, SduiInstrumentChart chart, InstrumentChartSpans chartSpans, DisplaySpan activeDisplaySpan, boolean showAdtChip, MarginSubscription marginSubscription, GoldL2DataUpsellImprovements.Variant goldL2DataUpsellImprovements, GoldL2SdpEntrypointExperiment.Variant goldL2SdpEntrypointVariant, ChartSettingsBottomSheetComposable2 selectedChartType, boolean showExtendedHours, boolean hasVisitedBwChart, boolean isInBlackWidowAdvancedChartExperiment, boolean showDisplayCurrencyLabel) {
        Intrinsics.checkNotNullParameter(goldL2DataUpsellImprovements, "goldL2DataUpsellImprovements");
        Intrinsics.checkNotNullParameter(goldL2SdpEntrypointVariant, "goldL2SdpEntrypointVariant");
        Intrinsics.checkNotNullParameter(selectedChartType, "selectedChartType");
        return new InstrumentChartViewState(instrument, chart, chartSpans, activeDisplaySpan, showAdtChip, marginSubscription, goldL2DataUpsellImprovements, goldL2SdpEntrypointVariant, selectedChartType, showExtendedHours, hasVisitedBwChart, isInBlackWidowAdvancedChartExperiment, showDisplayCurrencyLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstrumentChartViewState)) {
            return false;
        }
        InstrumentChartViewState instrumentChartViewState = (InstrumentChartViewState) other;
        return Intrinsics.areEqual(this.instrument, instrumentChartViewState.instrument) && Intrinsics.areEqual(this.chart, instrumentChartViewState.chart) && Intrinsics.areEqual(this.chartSpans, instrumentChartViewState.chartSpans) && this.activeDisplaySpan == instrumentChartViewState.activeDisplaySpan && this.showAdtChip == instrumentChartViewState.showAdtChip && Intrinsics.areEqual(this.marginSubscription, instrumentChartViewState.marginSubscription) && this.goldL2DataUpsellImprovements == instrumentChartViewState.goldL2DataUpsellImprovements && this.goldL2SdpEntrypointVariant == instrumentChartViewState.goldL2SdpEntrypointVariant && this.selectedChartType == instrumentChartViewState.selectedChartType && this.showExtendedHours == instrumentChartViewState.showExtendedHours && this.hasVisitedBwChart == instrumentChartViewState.hasVisitedBwChart && this.isInBlackWidowAdvancedChartExperiment == instrumentChartViewState.isInBlackWidowAdvancedChartExperiment && this.showDisplayCurrencyLabel == instrumentChartViewState.showDisplayCurrencyLabel;
    }

    public int hashCode() {
        Instrument instrument = this.instrument;
        int iHashCode = (instrument == null ? 0 : instrument.hashCode()) * 31;
        SduiInstrumentChart sduiInstrumentChart = this.chart;
        int iHashCode2 = (iHashCode + (sduiInstrumentChart == null ? 0 : sduiInstrumentChart.hashCode())) * 31;
        InstrumentChartSpans instrumentChartSpans = this.chartSpans;
        int iHashCode3 = (iHashCode2 + (instrumentChartSpans == null ? 0 : instrumentChartSpans.hashCode())) * 31;
        DisplaySpan displaySpan = this.activeDisplaySpan;
        int iHashCode4 = (((iHashCode3 + (displaySpan == null ? 0 : displaySpan.hashCode())) * 31) + Boolean.hashCode(this.showAdtChip)) * 31;
        MarginSubscription marginSubscription = this.marginSubscription;
        return ((((((((((((((iHashCode4 + (marginSubscription != null ? marginSubscription.hashCode() : 0)) * 31) + this.goldL2DataUpsellImprovements.hashCode()) * 31) + this.goldL2SdpEntrypointVariant.hashCode()) * 31) + this.selectedChartType.hashCode()) * 31) + Boolean.hashCode(this.showExtendedHours)) * 31) + Boolean.hashCode(this.hasVisitedBwChart)) * 31) + Boolean.hashCode(this.isInBlackWidowAdvancedChartExperiment)) * 31) + Boolean.hashCode(this.showDisplayCurrencyLabel);
    }

    public String toString() {
        return "InstrumentChartViewState(instrument=" + this.instrument + ", chart=" + this.chart + ", chartSpans=" + this.chartSpans + ", activeDisplaySpan=" + this.activeDisplaySpan + ", showAdtChip=" + this.showAdtChip + ", marginSubscription=" + this.marginSubscription + ", goldL2DataUpsellImprovements=" + this.goldL2DataUpsellImprovements + ", goldL2SdpEntrypointVariant=" + this.goldL2SdpEntrypointVariant + ", selectedChartType=" + this.selectedChartType + ", showExtendedHours=" + this.showExtendedHours + ", hasVisitedBwChart=" + this.hasVisitedBwChart + ", isInBlackWidowAdvancedChartExperiment=" + this.isInBlackWidowAdvancedChartExperiment + ", showDisplayCurrencyLabel=" + this.showDisplayCurrencyLabel + ")";
    }

    public InstrumentChartViewState(Instrument instrument, SduiInstrumentChart sduiInstrumentChart, InstrumentChartSpans instrumentChartSpans, DisplaySpan displaySpan, boolean z, MarginSubscription marginSubscription, GoldL2DataUpsellImprovements.Variant goldL2DataUpsellImprovements, GoldL2SdpEntrypointExperiment.Variant goldL2SdpEntrypointVariant, ChartSettingsBottomSheetComposable2 selectedChartType, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(goldL2DataUpsellImprovements, "goldL2DataUpsellImprovements");
        Intrinsics.checkNotNullParameter(goldL2SdpEntrypointVariant, "goldL2SdpEntrypointVariant");
        Intrinsics.checkNotNullParameter(selectedChartType, "selectedChartType");
        this.instrument = instrument;
        this.chart = sduiInstrumentChart;
        this.chartSpans = instrumentChartSpans;
        this.activeDisplaySpan = displaySpan;
        this.showAdtChip = z;
        this.marginSubscription = marginSubscription;
        this.goldL2DataUpsellImprovements = goldL2DataUpsellImprovements;
        this.goldL2SdpEntrypointVariant = goldL2SdpEntrypointVariant;
        this.selectedChartType = selectedChartType;
        this.showExtendedHours = z2;
        this.hasVisitedBwChart = z3;
        this.isInBlackWidowAdvancedChartExperiment = z4;
        this.showDisplayCurrencyLabel = z5;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final SduiInstrumentChart getChart() {
        return this.chart;
    }

    public final InstrumentChartSpans getChartSpans() {
        return this.chartSpans;
    }

    public final DisplaySpan getActiveDisplaySpan() {
        return this.activeDisplaySpan;
    }

    public final boolean getShowAdtChip() {
        return this.showAdtChip;
    }

    public final MarginSubscription getMarginSubscription() {
        return this.marginSubscription;
    }

    public final GoldL2DataUpsellImprovements.Variant getGoldL2DataUpsellImprovements() {
        return this.goldL2DataUpsellImprovements;
    }

    public /* synthetic */ InstrumentChartViewState(Instrument instrument, SduiInstrumentChart sduiInstrumentChart, InstrumentChartSpans instrumentChartSpans, DisplaySpan displaySpan, boolean z, MarginSubscription marginSubscription, GoldL2DataUpsellImprovements.Variant variant, GoldL2SdpEntrypointExperiment.Variant variant2, ChartSettingsBottomSheetComposable2 chartSettingsBottomSheetComposable2, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : instrument, (i & 2) != 0 ? null : sduiInstrumentChart, (i & 4) != 0 ? null : instrumentChartSpans, (i & 8) != 0 ? null : displaySpan, (i & 16) != 0 ? false : z, (i & 32) == 0 ? marginSubscription : null, (i & 64) != 0 ? GoldL2DataUpsellImprovements.Variant.CONTROL : variant, (i & 128) != 0 ? GoldL2SdpEntrypointExperiment.Variant.CONTROL : variant2, (i & 256) != 0 ? ChartSettingsBottomSheetComposable2.LINE : chartSettingsBottomSheetComposable2, (i & 512) != 0 ? true : z2, (i & 1024) != 0 ? false : z3, (i & 2048) != 0 ? false : z4, (i & 4096) != 0 ? false : z5);
    }

    public final GoldL2SdpEntrypointExperiment.Variant getGoldL2SdpEntrypointVariant() {
        return this.goldL2SdpEntrypointVariant;
    }

    public final ChartSettingsBottomSheetComposable2 getSelectedChartType() {
        return this.selectedChartType;
    }

    public final boolean getShowExtendedHours() {
        return this.showExtendedHours;
    }

    public final boolean getHasVisitedBwChart() {
        return this.hasVisitedBwChart;
    }

    public final boolean isInBlackWidowAdvancedChartExperiment() {
        return this.isInBlackWidowAdvancedChartExperiment;
    }

    public final boolean getShowDisplayCurrencyLabel() {
        return this.showDisplayCurrencyLabel;
    }
}
