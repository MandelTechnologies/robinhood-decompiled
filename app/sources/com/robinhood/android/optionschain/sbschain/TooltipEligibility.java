package com.robinhood.android.optionschain.sbschain;

import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.models.p355ui.OptionChainSettingsPnlChartType;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionSideBySideChainDataState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jq\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010-\u001a\u00020\u00032\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/TooltipEligibility;", "", "hasSpreadSelectedOnCurrentPage", "", "inSbsNuxRevampExperiment", "shouldShowSpreadTooltip", "shouldShowSwitchBackToClassicChainTooltip", "simulatedReturnChartShown", "simulatedReturnSwitchChartTooltipShown", "hasUserBeenIdleForTwoSeconds", "tappedSettingsInThisSession", "bottomSheetValue", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue;", "optionChainSettingsPnlChartType", "Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;", "<init>", "(ZZZZZZZZLcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue;Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;)V", "getHasSpreadSelectedOnCurrentPage", "()Z", "getInSbsNuxRevampExperiment", "getShouldShowSpreadTooltip", "getShouldShowSwitchBackToClassicChainTooltip", "getSimulatedReturnChartShown", "getSimulatedReturnSwitchChartTooltipShown", "getHasUserBeenIdleForTwoSeconds", "getTappedSettingsInThisSession", "getBottomSheetValue", "()Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue;", "getOptionChainSettingsPnlChartType", "()Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;", "getTooltipStateIfNoTooltipIsShowing", "Lcom/robinhood/android/optionschain/sbschain/TooltipState;", "launchMode", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TooltipEligibility {
    public static final int $stable = MultiModeSheetState2.$stable;
    private final MultiModeSheetState2 bottomSheetValue;
    private final boolean hasSpreadSelectedOnCurrentPage;
    private final boolean hasUserBeenIdleForTwoSeconds;
    private final boolean inSbsNuxRevampExperiment;
    private final OptionChainSettingsPnlChartType optionChainSettingsPnlChartType;
    private final boolean shouldShowSpreadTooltip;
    private final boolean shouldShowSwitchBackToClassicChainTooltip;
    private final boolean simulatedReturnChartShown;
    private final boolean simulatedReturnSwitchChartTooltipShown;
    private final boolean tappedSettingsInThisSession;

    public TooltipEligibility() {
        this(false, false, false, false, false, false, false, false, null, null, 1023, null);
    }

    public static /* synthetic */ TooltipEligibility copy$default(TooltipEligibility tooltipEligibility, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, MultiModeSheetState2 multiModeSheetState2, OptionChainSettingsPnlChartType optionChainSettingsPnlChartType, int i, Object obj) {
        if ((i & 1) != 0) {
            z = tooltipEligibility.hasSpreadSelectedOnCurrentPage;
        }
        if ((i & 2) != 0) {
            z2 = tooltipEligibility.inSbsNuxRevampExperiment;
        }
        if ((i & 4) != 0) {
            z3 = tooltipEligibility.shouldShowSpreadTooltip;
        }
        if ((i & 8) != 0) {
            z4 = tooltipEligibility.shouldShowSwitchBackToClassicChainTooltip;
        }
        if ((i & 16) != 0) {
            z5 = tooltipEligibility.simulatedReturnChartShown;
        }
        if ((i & 32) != 0) {
            z6 = tooltipEligibility.simulatedReturnSwitchChartTooltipShown;
        }
        if ((i & 64) != 0) {
            z7 = tooltipEligibility.hasUserBeenIdleForTwoSeconds;
        }
        if ((i & 128) != 0) {
            z8 = tooltipEligibility.tappedSettingsInThisSession;
        }
        if ((i & 256) != 0) {
            multiModeSheetState2 = tooltipEligibility.bottomSheetValue;
        }
        if ((i & 512) != 0) {
            optionChainSettingsPnlChartType = tooltipEligibility.optionChainSettingsPnlChartType;
        }
        MultiModeSheetState2 multiModeSheetState22 = multiModeSheetState2;
        OptionChainSettingsPnlChartType optionChainSettingsPnlChartType2 = optionChainSettingsPnlChartType;
        boolean z9 = z7;
        boolean z10 = z8;
        boolean z11 = z5;
        boolean z12 = z6;
        return tooltipEligibility.copy(z, z2, z3, z4, z11, z12, z9, z10, multiModeSheetState22, optionChainSettingsPnlChartType2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasSpreadSelectedOnCurrentPage() {
        return this.hasSpreadSelectedOnCurrentPage;
    }

    /* renamed from: component10, reason: from getter */
    public final OptionChainSettingsPnlChartType getOptionChainSettingsPnlChartType() {
        return this.optionChainSettingsPnlChartType;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getInSbsNuxRevampExperiment() {
        return this.inSbsNuxRevampExperiment;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShouldShowSpreadTooltip() {
        return this.shouldShowSpreadTooltip;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShouldShowSwitchBackToClassicChainTooltip() {
        return this.shouldShowSwitchBackToClassicChainTooltip;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getSimulatedReturnChartShown() {
        return this.simulatedReturnChartShown;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getSimulatedReturnSwitchChartTooltipShown() {
        return this.simulatedReturnSwitchChartTooltipShown;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getHasUserBeenIdleForTwoSeconds() {
        return this.hasUserBeenIdleForTwoSeconds;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getTappedSettingsInThisSession() {
        return this.tappedSettingsInThisSession;
    }

    /* renamed from: component9, reason: from getter */
    public final MultiModeSheetState2 getBottomSheetValue() {
        return this.bottomSheetValue;
    }

    public final TooltipEligibility copy(boolean hasSpreadSelectedOnCurrentPage, boolean inSbsNuxRevampExperiment, boolean shouldShowSpreadTooltip, boolean shouldShowSwitchBackToClassicChainTooltip, boolean simulatedReturnChartShown, boolean simulatedReturnSwitchChartTooltipShown, boolean hasUserBeenIdleForTwoSeconds, boolean tappedSettingsInThisSession, MultiModeSheetState2 bottomSheetValue, OptionChainSettingsPnlChartType optionChainSettingsPnlChartType) {
        return new TooltipEligibility(hasSpreadSelectedOnCurrentPage, inSbsNuxRevampExperiment, shouldShowSpreadTooltip, shouldShowSwitchBackToClassicChainTooltip, simulatedReturnChartShown, simulatedReturnSwitchChartTooltipShown, hasUserBeenIdleForTwoSeconds, tappedSettingsInThisSession, bottomSheetValue, optionChainSettingsPnlChartType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TooltipEligibility)) {
            return false;
        }
        TooltipEligibility tooltipEligibility = (TooltipEligibility) other;
        return this.hasSpreadSelectedOnCurrentPage == tooltipEligibility.hasSpreadSelectedOnCurrentPage && this.inSbsNuxRevampExperiment == tooltipEligibility.inSbsNuxRevampExperiment && this.shouldShowSpreadTooltip == tooltipEligibility.shouldShowSpreadTooltip && this.shouldShowSwitchBackToClassicChainTooltip == tooltipEligibility.shouldShowSwitchBackToClassicChainTooltip && this.simulatedReturnChartShown == tooltipEligibility.simulatedReturnChartShown && this.simulatedReturnSwitchChartTooltipShown == tooltipEligibility.simulatedReturnSwitchChartTooltipShown && this.hasUserBeenIdleForTwoSeconds == tooltipEligibility.hasUserBeenIdleForTwoSeconds && this.tappedSettingsInThisSession == tooltipEligibility.tappedSettingsInThisSession && Intrinsics.areEqual(this.bottomSheetValue, tooltipEligibility.bottomSheetValue) && this.optionChainSettingsPnlChartType == tooltipEligibility.optionChainSettingsPnlChartType;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((Boolean.hashCode(this.hasSpreadSelectedOnCurrentPage) * 31) + Boolean.hashCode(this.inSbsNuxRevampExperiment)) * 31) + Boolean.hashCode(this.shouldShowSpreadTooltip)) * 31) + Boolean.hashCode(this.shouldShowSwitchBackToClassicChainTooltip)) * 31) + Boolean.hashCode(this.simulatedReturnChartShown)) * 31) + Boolean.hashCode(this.simulatedReturnSwitchChartTooltipShown)) * 31) + Boolean.hashCode(this.hasUserBeenIdleForTwoSeconds)) * 31) + Boolean.hashCode(this.tappedSettingsInThisSession)) * 31;
        MultiModeSheetState2 multiModeSheetState2 = this.bottomSheetValue;
        int iHashCode2 = (iHashCode + (multiModeSheetState2 == null ? 0 : multiModeSheetState2.hashCode())) * 31;
        OptionChainSettingsPnlChartType optionChainSettingsPnlChartType = this.optionChainSettingsPnlChartType;
        return iHashCode2 + (optionChainSettingsPnlChartType != null ? optionChainSettingsPnlChartType.hashCode() : 0);
    }

    public String toString() {
        return "TooltipEligibility(hasSpreadSelectedOnCurrentPage=" + this.hasSpreadSelectedOnCurrentPage + ", inSbsNuxRevampExperiment=" + this.inSbsNuxRevampExperiment + ", shouldShowSpreadTooltip=" + this.shouldShowSpreadTooltip + ", shouldShowSwitchBackToClassicChainTooltip=" + this.shouldShowSwitchBackToClassicChainTooltip + ", simulatedReturnChartShown=" + this.simulatedReturnChartShown + ", simulatedReturnSwitchChartTooltipShown=" + this.simulatedReturnSwitchChartTooltipShown + ", hasUserBeenIdleForTwoSeconds=" + this.hasUserBeenIdleForTwoSeconds + ", tappedSettingsInThisSession=" + this.tappedSettingsInThisSession + ", bottomSheetValue=" + this.bottomSheetValue + ", optionChainSettingsPnlChartType=" + this.optionChainSettingsPnlChartType + ")";
    }

    public TooltipEligibility(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, MultiModeSheetState2 multiModeSheetState2, OptionChainSettingsPnlChartType optionChainSettingsPnlChartType) {
        this.hasSpreadSelectedOnCurrentPage = z;
        this.inSbsNuxRevampExperiment = z2;
        this.shouldShowSpreadTooltip = z3;
        this.shouldShowSwitchBackToClassicChainTooltip = z4;
        this.simulatedReturnChartShown = z5;
        this.simulatedReturnSwitchChartTooltipShown = z6;
        this.hasUserBeenIdleForTwoSeconds = z7;
        this.tappedSettingsInThisSession = z8;
        this.bottomSheetValue = multiModeSheetState2;
        this.optionChainSettingsPnlChartType = optionChainSettingsPnlChartType;
    }

    public /* synthetic */ TooltipEligibility(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, MultiModeSheetState2 multiModeSheetState2, OptionChainSettingsPnlChartType optionChainSettingsPnlChartType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? true : z6, (i & 64) != 0 ? false : z7, (i & 128) != 0 ? false : z8, (i & 256) != 0 ? null : multiModeSheetState2, (i & 512) != 0 ? null : optionChainSettingsPnlChartType);
    }

    public final boolean getHasSpreadSelectedOnCurrentPage() {
        return this.hasSpreadSelectedOnCurrentPage;
    }

    public final boolean getInSbsNuxRevampExperiment() {
        return this.inSbsNuxRevampExperiment;
    }

    public final boolean getShouldShowSpreadTooltip() {
        return this.shouldShowSpreadTooltip;
    }

    public final boolean getShouldShowSwitchBackToClassicChainTooltip() {
        return this.shouldShowSwitchBackToClassicChainTooltip;
    }

    public final boolean getSimulatedReturnChartShown() {
        return this.simulatedReturnChartShown;
    }

    public final boolean getSimulatedReturnSwitchChartTooltipShown() {
        return this.simulatedReturnSwitchChartTooltipShown;
    }

    public final boolean getHasUserBeenIdleForTwoSeconds() {
        return this.hasUserBeenIdleForTwoSeconds;
    }

    public final boolean getTappedSettingsInThisSession() {
        return this.tappedSettingsInThisSession;
    }

    public final MultiModeSheetState2 getBottomSheetValue() {
        return this.bottomSheetValue;
    }

    public final OptionChainSettingsPnlChartType getOptionChainSettingsPnlChartType() {
        return this.optionChainSettingsPnlChartType;
    }

    public final OptionSideBySideChainDataState7 getTooltipStateIfNoTooltipIsShowing(OptionChainLaunchMode launchMode) {
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        if (this.shouldShowSpreadTooltip && this.hasSpreadSelectedOnCurrentPage) {
            return OptionSideBySideChainDataState7.SPREAD_DRAG_NUX;
        }
        if (this.hasUserBeenIdleForTwoSeconds && this.shouldShowSwitchBackToClassicChainTooltip && !launchMode.hasFeature(OptionChainLaunchMode.Feature.SIDE_BY_SIDE_CHAIN_DEEPLINK) && !Intrinsics.areEqual(this.bottomSheetValue, MultiModeSheetState2.Expanded.INSTANCE) && !this.inSbsNuxRevampExperiment && !this.tappedSettingsInThisSession) {
            return OptionSideBySideChainDataState7.CHAIN_SETTINGS_NUX;
        }
        if (this.optionChainSettingsPnlChartType == OptionChainSettingsPnlChartType.BY_PRICE && this.simulatedReturnChartShown && !this.simulatedReturnSwitchChartTooltipShown) {
            return OptionSideBySideChainDataState7.SWITCH_SIMULATED_RETURN_CHART_NUX;
        }
        return null;
    }
}
