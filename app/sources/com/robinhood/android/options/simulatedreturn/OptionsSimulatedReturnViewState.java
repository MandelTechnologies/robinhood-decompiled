package com.robinhood.android.options.simulatedreturn;

import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartDataState2;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState3;
import com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggingState;
import com.robinhood.android.options.simulatedreturn.toolbar.OptionsSimulatedReturnToolbarState;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionTooltip;
import com.robinhood.models.p355ui.OptionOrderBundle;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSimulatedReturnViewState.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010=\u001a\u00020\u0010HÆ\u0003J\t\u0010>\u001a\u00020\u0012HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010@\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\t\u0010C\u001a\u00020\u001aHÆ\u0003J¬\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aHÆ\u0001¢\u0006\u0002\u0010EJ\u0013\u0010F\u001a\u00020\u00142\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020\u0012HÖ\u0001J\t\u0010I\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u0010/\u001a\u0004\b\u0013\u0010.R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b0\u0010)R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b1\u0010)R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006J"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnViewState;", "", "accountNumber", "", "chartType", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartType;", "nuxInfoTooltip", "Lcom/robinhood/models/db/OptionTooltip;", "nuxSliderTooltip", "optionOrderBundleForChart", "Lcom/robinhood/models/ui/OptionOrderBundle;", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "underlyingId", "Ljava/util/UUID;", "toolbarState", "Lcom/robinhood/android/options/simulatedreturn/toolbar/OptionsSimulatedReturnToolbarState;", "tradebarHeight", "", "isSingleLeg", "", "equityInstrumentId", "indexInstrumentId", "loggingState", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "launchMode", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartType;Lcom/robinhood/models/db/OptionTooltip;Lcom/robinhood/models/db/OptionTooltip;Lcom/robinhood/models/ui/OptionOrderBundle;Lcom/robinhood/models/db/OptionChain$UnderlyingType;Ljava/util/UUID;Lcom/robinhood/android/options/simulatedreturn/toolbar/OptionsSimulatedReturnToolbarState;ILjava/lang/Boolean;Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode;)V", "getAccountNumber", "()Ljava/lang/String;", "getChartType", "()Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartType;", "getNuxInfoTooltip", "()Lcom/robinhood/models/db/OptionTooltip;", "getNuxSliderTooltip", "getOptionOrderBundleForChart", "()Lcom/robinhood/models/ui/OptionOrderBundle;", "getUnderlyingType", "()Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "getUnderlyingId", "()Ljava/util/UUID;", "getToolbarState", "()Lcom/robinhood/android/options/simulatedreturn/toolbar/OptionsSimulatedReturnToolbarState;", "getTradebarHeight", "()I", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEquityInstrumentId", "getIndexInstrumentId", "getLoggingState", "()Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "getLaunchMode", "()Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartType;Lcom/robinhood/models/db/OptionTooltip;Lcom/robinhood/models/db/OptionTooltip;Lcom/robinhood/models/ui/OptionOrderBundle;Lcom/robinhood/models/db/OptionChain$UnderlyingType;Ljava/util/UUID;Lcom/robinhood/android/options/simulatedreturn/toolbar/OptionsSimulatedReturnToolbarState;ILjava/lang/Boolean;Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode;)Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnViewState;", "equals", "other", "hashCode", "toString", "feature-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsSimulatedReturnViewState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final OptionsSimulatedReturnChartViewState3 chartType;
    private final UUID equityInstrumentId;
    private final UUID indexInstrumentId;
    private final Boolean isSingleLeg;
    private final OptionsSimulatedReturnChartDataState2 launchMode;
    private final OptionsSimulatedReturnLoggingState loggingState;
    private final OptionTooltip nuxInfoTooltip;
    private final OptionTooltip nuxSliderTooltip;
    private final OptionOrderBundle optionOrderBundleForChart;
    private final OptionsSimulatedReturnToolbarState toolbarState;
    private final int tradebarHeight;
    private final UUID underlyingId;
    private final OptionChain.UnderlyingType underlyingType;

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getIsSingleLeg() {
        return this.isSingleLeg;
    }

    /* renamed from: component11, reason: from getter */
    public final UUID getEquityInstrumentId() {
        return this.equityInstrumentId;
    }

    /* renamed from: component12, reason: from getter */
    public final UUID getIndexInstrumentId() {
        return this.indexInstrumentId;
    }

    /* renamed from: component13, reason: from getter */
    public final OptionsSimulatedReturnLoggingState getLoggingState() {
        return this.loggingState;
    }

    /* renamed from: component14, reason: from getter */
    public final OptionsSimulatedReturnChartDataState2 getLaunchMode() {
        return this.launchMode;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionsSimulatedReturnChartViewState3 getChartType() {
        return this.chartType;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionTooltip getNuxInfoTooltip() {
        return this.nuxInfoTooltip;
    }

    /* renamed from: component4, reason: from getter */
    public final OptionTooltip getNuxSliderTooltip() {
        return this.nuxSliderTooltip;
    }

    /* renamed from: component5, reason: from getter */
    public final OptionOrderBundle getOptionOrderBundleForChart() {
        return this.optionOrderBundleForChart;
    }

    /* renamed from: component6, reason: from getter */
    public final OptionChain.UnderlyingType getUnderlyingType() {
        return this.underlyingType;
    }

    /* renamed from: component7, reason: from getter */
    public final UUID getUnderlyingId() {
        return this.underlyingId;
    }

    /* renamed from: component8, reason: from getter */
    public final OptionsSimulatedReturnToolbarState getToolbarState() {
        return this.toolbarState;
    }

    /* renamed from: component9, reason: from getter */
    public final int getTradebarHeight() {
        return this.tradebarHeight;
    }

    public final OptionsSimulatedReturnViewState copy(String accountNumber, OptionsSimulatedReturnChartViewState3 chartType, OptionTooltip nuxInfoTooltip, OptionTooltip nuxSliderTooltip, OptionOrderBundle optionOrderBundleForChart, OptionChain.UnderlyingType underlyingType, UUID underlyingId, OptionsSimulatedReturnToolbarState toolbarState, int tradebarHeight, Boolean isSingleLeg, UUID equityInstrumentId, UUID indexInstrumentId, OptionsSimulatedReturnLoggingState loggingState, OptionsSimulatedReturnChartDataState2 launchMode) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        return new OptionsSimulatedReturnViewState(accountNumber, chartType, nuxInfoTooltip, nuxSliderTooltip, optionOrderBundleForChart, underlyingType, underlyingId, toolbarState, tradebarHeight, isSingleLeg, equityInstrumentId, indexInstrumentId, loggingState, launchMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsSimulatedReturnViewState)) {
            return false;
        }
        OptionsSimulatedReturnViewState optionsSimulatedReturnViewState = (OptionsSimulatedReturnViewState) other;
        return Intrinsics.areEqual(this.accountNumber, optionsSimulatedReturnViewState.accountNumber) && this.chartType == optionsSimulatedReturnViewState.chartType && Intrinsics.areEqual(this.nuxInfoTooltip, optionsSimulatedReturnViewState.nuxInfoTooltip) && Intrinsics.areEqual(this.nuxSliderTooltip, optionsSimulatedReturnViewState.nuxSliderTooltip) && Intrinsics.areEqual(this.optionOrderBundleForChart, optionsSimulatedReturnViewState.optionOrderBundleForChart) && this.underlyingType == optionsSimulatedReturnViewState.underlyingType && Intrinsics.areEqual(this.underlyingId, optionsSimulatedReturnViewState.underlyingId) && Intrinsics.areEqual(this.toolbarState, optionsSimulatedReturnViewState.toolbarState) && this.tradebarHeight == optionsSimulatedReturnViewState.tradebarHeight && Intrinsics.areEqual(this.isSingleLeg, optionsSimulatedReturnViewState.isSingleLeg) && Intrinsics.areEqual(this.equityInstrumentId, optionsSimulatedReturnViewState.equityInstrumentId) && Intrinsics.areEqual(this.indexInstrumentId, optionsSimulatedReturnViewState.indexInstrumentId) && Intrinsics.areEqual(this.loggingState, optionsSimulatedReturnViewState.loggingState) && Intrinsics.areEqual(this.launchMode, optionsSimulatedReturnViewState.launchMode);
    }

    public int hashCode() {
        int iHashCode = ((this.accountNumber.hashCode() * 31) + this.chartType.hashCode()) * 31;
        OptionTooltip optionTooltip = this.nuxInfoTooltip;
        int iHashCode2 = (iHashCode + (optionTooltip == null ? 0 : optionTooltip.hashCode())) * 31;
        OptionTooltip optionTooltip2 = this.nuxSliderTooltip;
        int iHashCode3 = (iHashCode2 + (optionTooltip2 == null ? 0 : optionTooltip2.hashCode())) * 31;
        OptionOrderBundle optionOrderBundle = this.optionOrderBundleForChart;
        int iHashCode4 = (iHashCode3 + (optionOrderBundle == null ? 0 : optionOrderBundle.hashCode())) * 31;
        OptionChain.UnderlyingType underlyingType = this.underlyingType;
        int iHashCode5 = (iHashCode4 + (underlyingType == null ? 0 : underlyingType.hashCode())) * 31;
        UUID uuid = this.underlyingId;
        int iHashCode6 = (((((iHashCode5 + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.toolbarState.hashCode()) * 31) + Integer.hashCode(this.tradebarHeight)) * 31;
        Boolean bool = this.isSingleLeg;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        UUID uuid2 = this.equityInstrumentId;
        int iHashCode8 = (iHashCode7 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        UUID uuid3 = this.indexInstrumentId;
        int iHashCode9 = (iHashCode8 + (uuid3 == null ? 0 : uuid3.hashCode())) * 31;
        OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState = this.loggingState;
        return ((iHashCode9 + (optionsSimulatedReturnLoggingState != null ? optionsSimulatedReturnLoggingState.hashCode() : 0)) * 31) + this.launchMode.hashCode();
    }

    public String toString() {
        return "OptionsSimulatedReturnViewState(accountNumber=" + this.accountNumber + ", chartType=" + this.chartType + ", nuxInfoTooltip=" + this.nuxInfoTooltip + ", nuxSliderTooltip=" + this.nuxSliderTooltip + ", optionOrderBundleForChart=" + this.optionOrderBundleForChart + ", underlyingType=" + this.underlyingType + ", underlyingId=" + this.underlyingId + ", toolbarState=" + this.toolbarState + ", tradebarHeight=" + this.tradebarHeight + ", isSingleLeg=" + this.isSingleLeg + ", equityInstrumentId=" + this.equityInstrumentId + ", indexInstrumentId=" + this.indexInstrumentId + ", loggingState=" + this.loggingState + ", launchMode=" + this.launchMode + ")";
    }

    public OptionsSimulatedReturnViewState(String accountNumber, OptionsSimulatedReturnChartViewState3 chartType, OptionTooltip optionTooltip, OptionTooltip optionTooltip2, OptionOrderBundle optionOrderBundle, OptionChain.UnderlyingType underlyingType, UUID uuid, OptionsSimulatedReturnToolbarState toolbarState, int i, Boolean bool, UUID uuid2, UUID uuid3, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, OptionsSimulatedReturnChartDataState2 launchMode) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        this.accountNumber = accountNumber;
        this.chartType = chartType;
        this.nuxInfoTooltip = optionTooltip;
        this.nuxSliderTooltip = optionTooltip2;
        this.optionOrderBundleForChart = optionOrderBundle;
        this.underlyingType = underlyingType;
        this.underlyingId = uuid;
        this.toolbarState = toolbarState;
        this.tradebarHeight = i;
        this.isSingleLeg = bool;
        this.equityInstrumentId = uuid2;
        this.indexInstrumentId = uuid3;
        this.loggingState = optionsSimulatedReturnLoggingState;
        this.launchMode = launchMode;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final OptionsSimulatedReturnChartViewState3 getChartType() {
        return this.chartType;
    }

    public final OptionTooltip getNuxInfoTooltip() {
        return this.nuxInfoTooltip;
    }

    public final OptionTooltip getNuxSliderTooltip() {
        return this.nuxSliderTooltip;
    }

    public final OptionOrderBundle getOptionOrderBundleForChart() {
        return this.optionOrderBundleForChart;
    }

    public final OptionChain.UnderlyingType getUnderlyingType() {
        return this.underlyingType;
    }

    public final UUID getUnderlyingId() {
        return this.underlyingId;
    }

    public final OptionsSimulatedReturnToolbarState getToolbarState() {
        return this.toolbarState;
    }

    public final int getTradebarHeight() {
        return this.tradebarHeight;
    }

    public final Boolean isSingleLeg() {
        return this.isSingleLeg;
    }

    public final UUID getEquityInstrumentId() {
        return this.equityInstrumentId;
    }

    public final UUID getIndexInstrumentId() {
        return this.indexInstrumentId;
    }

    public final OptionsSimulatedReturnLoggingState getLoggingState() {
        return this.loggingState;
    }

    public final OptionsSimulatedReturnChartDataState2 getLaunchMode() {
        return this.launchMode;
    }
}
