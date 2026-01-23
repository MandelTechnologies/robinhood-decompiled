package com.robinhood.android.optionschain.chainsettings;

import com.robinhood.models.api.OptionSeenContext;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p355ui.OptionChainSettingsPnlChartType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainSettingsViewState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003J\t\u0010)\u001a\u00020\u000eHÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003Ji\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eHÆ\u0001J\u0013\u0010,\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001f¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsViewState;", "", "defaultPricingSettingState", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDropdownViewState;", "defaultPricingSettingServerValue", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "metricViewState", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsMetricViewState;", "userSeenContext", "Lcom/robinhood/models/api/OptionSeenContext;", "bidAskSettingState", "pnlChartType", "Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;", "showTableMetricsOnly", "", "showSbsNewTag", "shouldShowSettingsSwitchToSbsTooltip", "<init>", "(Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDropdownViewState;Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsMetricViewState;Lcom/robinhood/models/api/OptionSeenContext;Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDropdownViewState;Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;ZZZ)V", "getDefaultPricingSettingState", "()Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDropdownViewState;", "getDefaultPricingSettingServerValue", "()Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "getMetricViewState", "()Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsMetricViewState;", "getUserSeenContext", "()Lcom/robinhood/models/api/OptionSeenContext;", "getBidAskSettingState", "getPnlChartType", "()Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;", "getShowTableMetricsOnly", "()Z", "getShowSbsNewTag", "getShouldShowSettingsSwitchToSbsTooltip", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionChainSettingsViewState {
    public static final int $stable = 8;
    private final OptionChainSettingsDropdownViewState bidAskSettingState;
    private final OptionSettings.DefaultPricingSetting defaultPricingSettingServerValue;
    private final OptionChainSettingsDropdownViewState defaultPricingSettingState;
    private final OptionChainSettingsViewState5 metricViewState;
    private final OptionChainSettingsPnlChartType pnlChartType;
    private final boolean shouldShowSettingsSwitchToSbsTooltip;
    private final boolean showSbsNewTag;
    private final boolean showTableMetricsOnly;
    private final OptionSeenContext userSeenContext;

    public static /* synthetic */ OptionChainSettingsViewState copy$default(OptionChainSettingsViewState optionChainSettingsViewState, OptionChainSettingsDropdownViewState optionChainSettingsDropdownViewState, OptionSettings.DefaultPricingSetting defaultPricingSetting, OptionChainSettingsViewState5 optionChainSettingsViewState5, OptionSeenContext optionSeenContext, OptionChainSettingsDropdownViewState optionChainSettingsDropdownViewState2, OptionChainSettingsPnlChartType optionChainSettingsPnlChartType, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            optionChainSettingsDropdownViewState = optionChainSettingsViewState.defaultPricingSettingState;
        }
        if ((i & 2) != 0) {
            defaultPricingSetting = optionChainSettingsViewState.defaultPricingSettingServerValue;
        }
        if ((i & 4) != 0) {
            optionChainSettingsViewState5 = optionChainSettingsViewState.metricViewState;
        }
        if ((i & 8) != 0) {
            optionSeenContext = optionChainSettingsViewState.userSeenContext;
        }
        if ((i & 16) != 0) {
            optionChainSettingsDropdownViewState2 = optionChainSettingsViewState.bidAskSettingState;
        }
        if ((i & 32) != 0) {
            optionChainSettingsPnlChartType = optionChainSettingsViewState.pnlChartType;
        }
        if ((i & 64) != 0) {
            z = optionChainSettingsViewState.showTableMetricsOnly;
        }
        if ((i & 128) != 0) {
            z2 = optionChainSettingsViewState.showSbsNewTag;
        }
        if ((i & 256) != 0) {
            z3 = optionChainSettingsViewState.shouldShowSettingsSwitchToSbsTooltip;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        OptionChainSettingsPnlChartType optionChainSettingsPnlChartType2 = optionChainSettingsPnlChartType;
        boolean z6 = z;
        OptionChainSettingsDropdownViewState optionChainSettingsDropdownViewState3 = optionChainSettingsDropdownViewState2;
        OptionChainSettingsViewState5 optionChainSettingsViewState52 = optionChainSettingsViewState5;
        return optionChainSettingsViewState.copy(optionChainSettingsDropdownViewState, defaultPricingSetting, optionChainSettingsViewState52, optionSeenContext, optionChainSettingsDropdownViewState3, optionChainSettingsPnlChartType2, z6, z4, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionChainSettingsDropdownViewState getDefaultPricingSettingState() {
        return this.defaultPricingSettingState;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionSettings.DefaultPricingSetting getDefaultPricingSettingServerValue() {
        return this.defaultPricingSettingServerValue;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionChainSettingsViewState5 getMetricViewState() {
        return this.metricViewState;
    }

    /* renamed from: component4, reason: from getter */
    public final OptionSeenContext getUserSeenContext() {
        return this.userSeenContext;
    }

    /* renamed from: component5, reason: from getter */
    public final OptionChainSettingsDropdownViewState getBidAskSettingState() {
        return this.bidAskSettingState;
    }

    /* renamed from: component6, reason: from getter */
    public final OptionChainSettingsPnlChartType getPnlChartType() {
        return this.pnlChartType;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowTableMetricsOnly() {
        return this.showTableMetricsOnly;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShowSbsNewTag() {
        return this.showSbsNewTag;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShouldShowSettingsSwitchToSbsTooltip() {
        return this.shouldShowSettingsSwitchToSbsTooltip;
    }

    public final OptionChainSettingsViewState copy(OptionChainSettingsDropdownViewState defaultPricingSettingState, OptionSettings.DefaultPricingSetting defaultPricingSettingServerValue, OptionChainSettingsViewState5 metricViewState, OptionSeenContext userSeenContext, OptionChainSettingsDropdownViewState bidAskSettingState, OptionChainSettingsPnlChartType pnlChartType, boolean showTableMetricsOnly, boolean showSbsNewTag, boolean shouldShowSettingsSwitchToSbsTooltip) {
        Intrinsics.checkNotNullParameter(defaultPricingSettingState, "defaultPricingSettingState");
        Intrinsics.checkNotNullParameter(metricViewState, "metricViewState");
        Intrinsics.checkNotNullParameter(pnlChartType, "pnlChartType");
        return new OptionChainSettingsViewState(defaultPricingSettingState, defaultPricingSettingServerValue, metricViewState, userSeenContext, bidAskSettingState, pnlChartType, showTableMetricsOnly, showSbsNewTag, shouldShowSettingsSwitchToSbsTooltip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionChainSettingsViewState)) {
            return false;
        }
        OptionChainSettingsViewState optionChainSettingsViewState = (OptionChainSettingsViewState) other;
        return Intrinsics.areEqual(this.defaultPricingSettingState, optionChainSettingsViewState.defaultPricingSettingState) && this.defaultPricingSettingServerValue == optionChainSettingsViewState.defaultPricingSettingServerValue && Intrinsics.areEqual(this.metricViewState, optionChainSettingsViewState.metricViewState) && this.userSeenContext == optionChainSettingsViewState.userSeenContext && Intrinsics.areEqual(this.bidAskSettingState, optionChainSettingsViewState.bidAskSettingState) && this.pnlChartType == optionChainSettingsViewState.pnlChartType && this.showTableMetricsOnly == optionChainSettingsViewState.showTableMetricsOnly && this.showSbsNewTag == optionChainSettingsViewState.showSbsNewTag && this.shouldShowSettingsSwitchToSbsTooltip == optionChainSettingsViewState.shouldShowSettingsSwitchToSbsTooltip;
    }

    public int hashCode() {
        int iHashCode = this.defaultPricingSettingState.hashCode() * 31;
        OptionSettings.DefaultPricingSetting defaultPricingSetting = this.defaultPricingSettingServerValue;
        int iHashCode2 = (((iHashCode + (defaultPricingSetting == null ? 0 : defaultPricingSetting.hashCode())) * 31) + this.metricViewState.hashCode()) * 31;
        OptionSeenContext optionSeenContext = this.userSeenContext;
        int iHashCode3 = (iHashCode2 + (optionSeenContext == null ? 0 : optionSeenContext.hashCode())) * 31;
        OptionChainSettingsDropdownViewState optionChainSettingsDropdownViewState = this.bidAskSettingState;
        return ((((((((iHashCode3 + (optionChainSettingsDropdownViewState != null ? optionChainSettingsDropdownViewState.hashCode() : 0)) * 31) + this.pnlChartType.hashCode()) * 31) + Boolean.hashCode(this.showTableMetricsOnly)) * 31) + Boolean.hashCode(this.showSbsNewTag)) * 31) + Boolean.hashCode(this.shouldShowSettingsSwitchToSbsTooltip);
    }

    public String toString() {
        return "OptionChainSettingsViewState(defaultPricingSettingState=" + this.defaultPricingSettingState + ", defaultPricingSettingServerValue=" + this.defaultPricingSettingServerValue + ", metricViewState=" + this.metricViewState + ", userSeenContext=" + this.userSeenContext + ", bidAskSettingState=" + this.bidAskSettingState + ", pnlChartType=" + this.pnlChartType + ", showTableMetricsOnly=" + this.showTableMetricsOnly + ", showSbsNewTag=" + this.showSbsNewTag + ", shouldShowSettingsSwitchToSbsTooltip=" + this.shouldShowSettingsSwitchToSbsTooltip + ")";
    }

    public OptionChainSettingsViewState(OptionChainSettingsDropdownViewState defaultPricingSettingState, OptionSettings.DefaultPricingSetting defaultPricingSetting, OptionChainSettingsViewState5 metricViewState, OptionSeenContext optionSeenContext, OptionChainSettingsDropdownViewState optionChainSettingsDropdownViewState, OptionChainSettingsPnlChartType pnlChartType, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(defaultPricingSettingState, "defaultPricingSettingState");
        Intrinsics.checkNotNullParameter(metricViewState, "metricViewState");
        Intrinsics.checkNotNullParameter(pnlChartType, "pnlChartType");
        this.defaultPricingSettingState = defaultPricingSettingState;
        this.defaultPricingSettingServerValue = defaultPricingSetting;
        this.metricViewState = metricViewState;
        this.userSeenContext = optionSeenContext;
        this.bidAskSettingState = optionChainSettingsDropdownViewState;
        this.pnlChartType = pnlChartType;
        this.showTableMetricsOnly = z;
        this.showSbsNewTag = z2;
        this.shouldShowSettingsSwitchToSbsTooltip = z3;
    }

    public final OptionChainSettingsDropdownViewState getDefaultPricingSettingState() {
        return this.defaultPricingSettingState;
    }

    public final OptionSettings.DefaultPricingSetting getDefaultPricingSettingServerValue() {
        return this.defaultPricingSettingServerValue;
    }

    public final OptionChainSettingsViewState5 getMetricViewState() {
        return this.metricViewState;
    }

    public final OptionSeenContext getUserSeenContext() {
        return this.userSeenContext;
    }

    public final OptionChainSettingsDropdownViewState getBidAskSettingState() {
        return this.bidAskSettingState;
    }

    public final OptionChainSettingsPnlChartType getPnlChartType() {
        return this.pnlChartType;
    }

    public final boolean getShowTableMetricsOnly() {
        return this.showTableMetricsOnly;
    }

    public final boolean getShowSbsNewTag() {
        return this.showSbsNewTag;
    }

    public final boolean getShouldShowSettingsSwitchToSbsTooltip() {
        return this.shouldShowSettingsSwitchToSbsTooltip;
    }
}
