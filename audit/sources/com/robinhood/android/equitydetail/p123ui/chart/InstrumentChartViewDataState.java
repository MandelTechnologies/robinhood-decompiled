package com.robinhood.android.equitydetail.p123ui.chart;

import com.robinhood.android.engagement.l2improvements.experiments.GoldL2DataUpsellImprovements;
import com.robinhood.android.engagement.l2improvements.experiments.GoldL2SdpEntrypointExperiment;
import com.robinhood.android.equitydetail.p123ui.chartsettings.ChartSettingsBottomSheetComposable2;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartSpansStore4;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Instrument4;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartSpans;
import com.robinhood.models.p320db.bonfire.instrument.SduiInstrumentChart;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b-\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u00105\u001a\u00020\rHÆ\u0003J\t\u00106\u001a\u00020\u000fHÆ\u0003J\t\u00107\u001a\u00020\u0011HÆ\u0003J\t\u00108\u001a\u00020\u0013HÆ\u0003J\t\u00109\u001a\u00020\u0013HÆ\u0003J\t\u0010:\u001a\u00020\u0013HÆ\u0003J\t\u0010;\u001a\u00020\u0013HÆ\u0003J\t\u0010<\u001a\u00020\u0013HÆ\u0003J\u0093\u0001\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0013HÆ\u0001J\u0013\u0010>\u001a\u00020\u00132\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020AHÖ\u0001J\t\u0010B\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0011\u0010\u0015\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010+R\u0011\u0010\u0016\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010+R\u0011\u0010\u0017\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0011\u0010.\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b/\u0010+¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartViewDataState;", "", "sduiInstrumentChart", "Lcom/robinhood/models/db/bonfire/instrument/SduiInstrumentChart;", "instrumentChartSpans", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartSpans;", "span", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "marginSubscription", "Lcom/robinhood/models/subscription/db/MarginSubscription;", "goldL2DataUpsellImprovements", "Lcom/robinhood/android/engagement/l2improvements/experiments/GoldL2DataUpsellImprovements$Variant;", "goldL2SdpEntrypointVariant", "Lcom/robinhood/android/engagement/l2improvements/experiments/GoldL2SdpEntrypointExperiment$Variant;", "selectedChartType", "Lcom/robinhood/android/equitydetail/ui/chartsettings/ChartType;", "showExtendedHours", "", "hasVisitedBwChart", "isInBlackWidowAdvancedChartExperiment", "isInMcwRegionGate", "removeAdtChip", "<init>", "(Lcom/robinhood/models/db/bonfire/instrument/SduiInstrumentChart;Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartSpans;Ljava/lang/String;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/subscription/db/MarginSubscription;Lcom/robinhood/android/engagement/l2improvements/experiments/GoldL2DataUpsellImprovements$Variant;Lcom/robinhood/android/engagement/l2improvements/experiments/GoldL2SdpEntrypointExperiment$Variant;Lcom/robinhood/android/equitydetail/ui/chartsettings/ChartType;ZZZZZ)V", "getSduiInstrumentChart", "()Lcom/robinhood/models/db/bonfire/instrument/SduiInstrumentChart;", "getInstrumentChartSpans", "()Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartSpans;", "getSpan", "()Ljava/lang/String;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getMarginSubscription", "()Lcom/robinhood/models/subscription/db/MarginSubscription;", "getGoldL2DataUpsellImprovements", "()Lcom/robinhood/android/engagement/l2improvements/experiments/GoldL2DataUpsellImprovements$Variant;", "getGoldL2SdpEntrypointVariant", "()Lcom/robinhood/android/engagement/l2improvements/experiments/GoldL2SdpEntrypointExperiment$Variant;", "getSelectedChartType", "()Lcom/robinhood/android/equitydetail/ui/chartsettings/ChartType;", "getShowExtendedHours", "()Z", "getHasVisitedBwChart", "getRemoveAdtChip", "showAdtChip", "getShowAdtChip", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InstrumentChartViewDataState {
    public static final int $stable = 8;
    private final GoldL2DataUpsellImprovements.Variant goldL2DataUpsellImprovements;
    private final GoldL2SdpEntrypointExperiment.Variant goldL2SdpEntrypointVariant;
    private final boolean hasVisitedBwChart;
    private final Instrument instrument;
    private final InstrumentChartSpans instrumentChartSpans;
    private final boolean isInBlackWidowAdvancedChartExperiment;
    private final boolean isInMcwRegionGate;
    private final MarginSubscription marginSubscription;
    private final boolean removeAdtChip;
    private final SduiInstrumentChart sduiInstrumentChart;
    private final ChartSettingsBottomSheetComposable2 selectedChartType;
    private final boolean showAdtChip;
    private final boolean showExtendedHours;
    private final String span;

    public InstrumentChartViewDataState() {
        this(null, null, null, null, null, null, null, null, false, false, false, false, false, 8191, null);
    }

    public static /* synthetic */ InstrumentChartViewDataState copy$default(InstrumentChartViewDataState instrumentChartViewDataState, SduiInstrumentChart sduiInstrumentChart, InstrumentChartSpans instrumentChartSpans, String str, Instrument instrument, MarginSubscription marginSubscription, GoldL2DataUpsellImprovements.Variant variant, GoldL2SdpEntrypointExperiment.Variant variant2, ChartSettingsBottomSheetComposable2 chartSettingsBottomSheetComposable2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            sduiInstrumentChart = instrumentChartViewDataState.sduiInstrumentChart;
        }
        return instrumentChartViewDataState.copy(sduiInstrumentChart, (i & 2) != 0 ? instrumentChartViewDataState.instrumentChartSpans : instrumentChartSpans, (i & 4) != 0 ? instrumentChartViewDataState.span : str, (i & 8) != 0 ? instrumentChartViewDataState.instrument : instrument, (i & 16) != 0 ? instrumentChartViewDataState.marginSubscription : marginSubscription, (i & 32) != 0 ? instrumentChartViewDataState.goldL2DataUpsellImprovements : variant, (i & 64) != 0 ? instrumentChartViewDataState.goldL2SdpEntrypointVariant : variant2, (i & 128) != 0 ? instrumentChartViewDataState.selectedChartType : chartSettingsBottomSheetComposable2, (i & 256) != 0 ? instrumentChartViewDataState.showExtendedHours : z, (i & 512) != 0 ? instrumentChartViewDataState.hasVisitedBwChart : z2, (i & 1024) != 0 ? instrumentChartViewDataState.isInBlackWidowAdvancedChartExperiment : z3, (i & 2048) != 0 ? instrumentChartViewDataState.isInMcwRegionGate : z4, (i & 4096) != 0 ? instrumentChartViewDataState.removeAdtChip : z5);
    }

    /* renamed from: component1, reason: from getter */
    public final SduiInstrumentChart getSduiInstrumentChart() {
        return this.sduiInstrumentChart;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getHasVisitedBwChart() {
        return this.hasVisitedBwChart;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsInBlackWidowAdvancedChartExperiment() {
        return this.isInBlackWidowAdvancedChartExperiment;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsInMcwRegionGate() {
        return this.isInMcwRegionGate;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getRemoveAdtChip() {
        return this.removeAdtChip;
    }

    /* renamed from: component2, reason: from getter */
    public final InstrumentChartSpans getInstrumentChartSpans() {
        return this.instrumentChartSpans;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSpan() {
        return this.span;
    }

    /* renamed from: component4, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component5, reason: from getter */
    public final MarginSubscription getMarginSubscription() {
        return this.marginSubscription;
    }

    /* renamed from: component6, reason: from getter */
    public final GoldL2DataUpsellImprovements.Variant getGoldL2DataUpsellImprovements() {
        return this.goldL2DataUpsellImprovements;
    }

    /* renamed from: component7, reason: from getter */
    public final GoldL2SdpEntrypointExperiment.Variant getGoldL2SdpEntrypointVariant() {
        return this.goldL2SdpEntrypointVariant;
    }

    /* renamed from: component8, reason: from getter */
    public final ChartSettingsBottomSheetComposable2 getSelectedChartType() {
        return this.selectedChartType;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShowExtendedHours() {
        return this.showExtendedHours;
    }

    public final InstrumentChartViewDataState copy(SduiInstrumentChart sduiInstrumentChart, InstrumentChartSpans instrumentChartSpans, String span, Instrument instrument, MarginSubscription marginSubscription, GoldL2DataUpsellImprovements.Variant goldL2DataUpsellImprovements, GoldL2SdpEntrypointExperiment.Variant goldL2SdpEntrypointVariant, ChartSettingsBottomSheetComposable2 selectedChartType, boolean showExtendedHours, boolean hasVisitedBwChart, boolean isInBlackWidowAdvancedChartExperiment, boolean isInMcwRegionGate, boolean removeAdtChip) {
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(goldL2DataUpsellImprovements, "goldL2DataUpsellImprovements");
        Intrinsics.checkNotNullParameter(goldL2SdpEntrypointVariant, "goldL2SdpEntrypointVariant");
        Intrinsics.checkNotNullParameter(selectedChartType, "selectedChartType");
        return new InstrumentChartViewDataState(sduiInstrumentChart, instrumentChartSpans, span, instrument, marginSubscription, goldL2DataUpsellImprovements, goldL2SdpEntrypointVariant, selectedChartType, showExtendedHours, hasVisitedBwChart, isInBlackWidowAdvancedChartExperiment, isInMcwRegionGate, removeAdtChip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstrumentChartViewDataState)) {
            return false;
        }
        InstrumentChartViewDataState instrumentChartViewDataState = (InstrumentChartViewDataState) other;
        return Intrinsics.areEqual(this.sduiInstrumentChart, instrumentChartViewDataState.sduiInstrumentChart) && Intrinsics.areEqual(this.instrumentChartSpans, instrumentChartViewDataState.instrumentChartSpans) && Intrinsics.areEqual(this.span, instrumentChartViewDataState.span) && Intrinsics.areEqual(this.instrument, instrumentChartViewDataState.instrument) && Intrinsics.areEqual(this.marginSubscription, instrumentChartViewDataState.marginSubscription) && this.goldL2DataUpsellImprovements == instrumentChartViewDataState.goldL2DataUpsellImprovements && this.goldL2SdpEntrypointVariant == instrumentChartViewDataState.goldL2SdpEntrypointVariant && this.selectedChartType == instrumentChartViewDataState.selectedChartType && this.showExtendedHours == instrumentChartViewDataState.showExtendedHours && this.hasVisitedBwChart == instrumentChartViewDataState.hasVisitedBwChart && this.isInBlackWidowAdvancedChartExperiment == instrumentChartViewDataState.isInBlackWidowAdvancedChartExperiment && this.isInMcwRegionGate == instrumentChartViewDataState.isInMcwRegionGate && this.removeAdtChip == instrumentChartViewDataState.removeAdtChip;
    }

    public int hashCode() {
        SduiInstrumentChart sduiInstrumentChart = this.sduiInstrumentChart;
        int iHashCode = (sduiInstrumentChart == null ? 0 : sduiInstrumentChart.hashCode()) * 31;
        InstrumentChartSpans instrumentChartSpans = this.instrumentChartSpans;
        int iHashCode2 = (((iHashCode + (instrumentChartSpans == null ? 0 : instrumentChartSpans.hashCode())) * 31) + this.span.hashCode()) * 31;
        Instrument instrument = this.instrument;
        int iHashCode3 = (iHashCode2 + (instrument == null ? 0 : instrument.hashCode())) * 31;
        MarginSubscription marginSubscription = this.marginSubscription;
        return ((((((((((((((((iHashCode3 + (marginSubscription != null ? marginSubscription.hashCode() : 0)) * 31) + this.goldL2DataUpsellImprovements.hashCode()) * 31) + this.goldL2SdpEntrypointVariant.hashCode()) * 31) + this.selectedChartType.hashCode()) * 31) + Boolean.hashCode(this.showExtendedHours)) * 31) + Boolean.hashCode(this.hasVisitedBwChart)) * 31) + Boolean.hashCode(this.isInBlackWidowAdvancedChartExperiment)) * 31) + Boolean.hashCode(this.isInMcwRegionGate)) * 31) + Boolean.hashCode(this.removeAdtChip);
    }

    public String toString() {
        return "InstrumentChartViewDataState(sduiInstrumentChart=" + this.sduiInstrumentChart + ", instrumentChartSpans=" + this.instrumentChartSpans + ", span=" + this.span + ", instrument=" + this.instrument + ", marginSubscription=" + this.marginSubscription + ", goldL2DataUpsellImprovements=" + this.goldL2DataUpsellImprovements + ", goldL2SdpEntrypointVariant=" + this.goldL2SdpEntrypointVariant + ", selectedChartType=" + this.selectedChartType + ", showExtendedHours=" + this.showExtendedHours + ", hasVisitedBwChart=" + this.hasVisitedBwChart + ", isInBlackWidowAdvancedChartExperiment=" + this.isInBlackWidowAdvancedChartExperiment + ", isInMcwRegionGate=" + this.isInMcwRegionGate + ", removeAdtChip=" + this.removeAdtChip + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InstrumentChartViewDataState(SduiInstrumentChart sduiInstrumentChart, InstrumentChartSpans instrumentChartSpans, String span, Instrument instrument, MarginSubscription marginSubscription, GoldL2DataUpsellImprovements.Variant goldL2DataUpsellImprovements, GoldL2SdpEntrypointExperiment.Variant goldL2SdpEntrypointVariant, ChartSettingsBottomSheetComposable2 selectedChartType, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        CursorData defaultDisplay;
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(goldL2DataUpsellImprovements, "goldL2DataUpsellImprovements");
        Intrinsics.checkNotNullParameter(goldL2SdpEntrypointVariant, "goldL2SdpEntrypointVariant");
        Intrinsics.checkNotNullParameter(selectedChartType, "selectedChartType");
        this.sduiInstrumentChart = sduiInstrumentChart;
        this.instrumentChartSpans = instrumentChartSpans;
        this.span = span;
        this.instrument = instrument;
        this.marginSubscription = marginSubscription;
        this.goldL2DataUpsellImprovements = goldL2DataUpsellImprovements;
        this.goldL2SdpEntrypointVariant = goldL2SdpEntrypointVariant;
        this.selectedChartType = selectedChartType;
        this.showExtendedHours = z;
        this.hasVisitedBwChart = z2;
        this.isInBlackWidowAdvancedChartExperiment = z3;
        this.isInMcwRegionGate = z4;
        this.removeAdtChip = z5;
        if (Instrument4.isAllDayTradable(instrument)) {
            if (((sduiInstrumentChart == null || (defaultDisplay = sduiInstrumentChart.getDefaultDisplay()) == null) ? null : defaultDisplay.getTertiary_value()) == null && !z5) {
                z6 = true;
            }
        } else {
            z6 = false;
        }
        this.showAdtChip = z6;
    }

    public final SduiInstrumentChart getSduiInstrumentChart() {
        return this.sduiInstrumentChart;
    }

    public final InstrumentChartSpans getInstrumentChartSpans() {
        return this.instrumentChartSpans;
    }

    public /* synthetic */ InstrumentChartViewDataState(SduiInstrumentChart sduiInstrumentChart, InstrumentChartSpans instrumentChartSpans, String str, Instrument instrument, MarginSubscription marginSubscription, GoldL2DataUpsellImprovements.Variant variant, GoldL2SdpEntrypointExperiment.Variant variant2, ChartSettingsBottomSheetComposable2 chartSettingsBottomSheetComposable2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : sduiInstrumentChart, (i & 2) != 0 ? null : instrumentChartSpans, (i & 4) != 0 ? InstrumentChartSpansStore4.getDefaultSelectedSpan().getServerValue() : str, (i & 8) != 0 ? null : instrument, (i & 16) == 0 ? marginSubscription : null, (i & 32) != 0 ? GoldL2DataUpsellImprovements.Variant.CONTROL : variant, (i & 64) != 0 ? GoldL2SdpEntrypointExperiment.Variant.CONTROL : variant2, (i & 128) != 0 ? ChartSettingsBottomSheetComposable2.LINE : chartSettingsBottomSheetComposable2, (i & 256) != 0 ? true : z, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? false : z3, (i & 2048) != 0 ? false : z4, (i & 4096) != 0 ? false : z5);
    }

    public final String getSpan() {
        return this.span;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final MarginSubscription getMarginSubscription() {
        return this.marginSubscription;
    }

    public final GoldL2DataUpsellImprovements.Variant getGoldL2DataUpsellImprovements() {
        return this.goldL2DataUpsellImprovements;
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

    public final boolean isInMcwRegionGate() {
        return this.isInMcwRegionGate;
    }

    public final boolean getRemoveAdtChip() {
        return this.removeAdtChip;
    }

    public final boolean getShowAdtChip() {
        return this.showAdtChip;
    }
}
