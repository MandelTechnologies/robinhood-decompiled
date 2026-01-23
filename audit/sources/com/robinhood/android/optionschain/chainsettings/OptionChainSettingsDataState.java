package com.robinhood.android.optionschain.chainsettings;

import com.robinhood.models.p320db.OptionChainAvailableMetrics;
import com.robinhood.models.p320db.OptionChainSettingsTableMetricsUpdate;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p355ui.OptionChainDisplayMode;
import com.robinhood.models.p355ui.OptionChainSettingsPnlChartType;
import com.robinhood.models.p355ui.OptionChainSettingsSideBySideBidAskPriceLabelType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainSettingsDataState.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B½\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010<\u001a\u00020\u000eHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010>\u001a\u00020\u0007HÆ\u0003J\t\u0010?\u001a\u00020\u0007HÆ\u0003J\t\u0010@\u001a\u00020\u0007HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010C\u001a\u00020\u0007HÆ\u0003J\t\u0010D\u001a\u00020\u0007HÆ\u0003J\t\u0010E\u001a\u00020\u0007HÆ\u0003JÃ\u0001\u0010F\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u0007HÆ\u0001J\u0013\u0010G\u001a\u00020\u00072\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020JHÖ\u0001J\t\u0010K\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\"R\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0018\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\"R\u0011\u0010\u0019\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0011\u0010\u001a\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"¨\u0006L"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDataState;", "", "defaultPricingSettingServerValue", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "sbsBidAskPriceLabelType", "Lcom/robinhood/models/ui/OptionChainSettingsSideBySideBidAskPriceLabelType;", "sbsBidAskPriceLabelNewTagShown", "", "buySelectedMetricOne", "Lcom/robinhood/models/db/OptionChainAvailableMetrics$Metric;", "buySelectedMetricTwo", "sellSelectedMetricOne", "sellSelectedMetricTwo", "tableMetricUpdate", "Lcom/robinhood/models/db/OptionChainSettingsTableMetricsUpdate;", "source", "", "isFocusedToSbsTooltipAndGreenDotShown", "inSideBySideBidAskSettingExperiment", "inSideBySideNuxRevampExperiment", "optionChainDisplayMode", "Lcom/robinhood/models/ui/OptionChainDisplayMode;", "pnlChartType", "Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;", "showTableMetricsOnly", "hasSeenSideBySideChain", "hasSwitchToSbsTooltipShown", "<init>", "(Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Lcom/robinhood/models/ui/OptionChainSettingsSideBySideBidAskPriceLabelType;ZLcom/robinhood/models/db/OptionChainAvailableMetrics$Metric;Lcom/robinhood/models/db/OptionChainAvailableMetrics$Metric;Lcom/robinhood/models/db/OptionChainAvailableMetrics$Metric;Lcom/robinhood/models/db/OptionChainAvailableMetrics$Metric;Lcom/robinhood/models/db/OptionChainSettingsTableMetricsUpdate;Ljava/lang/String;ZZZLcom/robinhood/models/ui/OptionChainDisplayMode;Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;ZZZ)V", "getDefaultPricingSettingServerValue", "()Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "getSbsBidAskPriceLabelType", "()Lcom/robinhood/models/ui/OptionChainSettingsSideBySideBidAskPriceLabelType;", "getSbsBidAskPriceLabelNewTagShown", "()Z", "getBuySelectedMetricOne", "()Lcom/robinhood/models/db/OptionChainAvailableMetrics$Metric;", "getBuySelectedMetricTwo", "getSellSelectedMetricOne", "getSellSelectedMetricTwo", "getTableMetricUpdate", "()Lcom/robinhood/models/db/OptionChainSettingsTableMetricsUpdate;", "getSource", "()Ljava/lang/String;", "getInSideBySideBidAskSettingExperiment", "getInSideBySideNuxRevampExperiment", "getOptionChainDisplayMode", "()Lcom/robinhood/models/ui/OptionChainDisplayMode;", "getPnlChartType", "()Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;", "getShowTableMetricsOnly", "getHasSeenSideBySideChain", "getHasSwitchToSbsTooltipShown", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "equals", "other", "hashCode", "", "toString", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionChainSettingsDataState {
    public static final int $stable = 8;
    private final OptionChainAvailableMetrics.Metric buySelectedMetricOne;
    private final OptionChainAvailableMetrics.Metric buySelectedMetricTwo;
    private final OptionSettings.DefaultPricingSetting defaultPricingSettingServerValue;
    private final boolean hasSeenSideBySideChain;
    private final boolean hasSwitchToSbsTooltipShown;
    private final boolean inSideBySideBidAskSettingExperiment;
    private final boolean inSideBySideNuxRevampExperiment;
    private final boolean isFocusedToSbsTooltipAndGreenDotShown;
    private final OptionChainDisplayMode optionChainDisplayMode;
    private final OptionChainSettingsPnlChartType pnlChartType;
    private final boolean sbsBidAskPriceLabelNewTagShown;
    private final OptionChainSettingsSideBySideBidAskPriceLabelType sbsBidAskPriceLabelType;
    private final OptionChainAvailableMetrics.Metric sellSelectedMetricOne;
    private final OptionChainAvailableMetrics.Metric sellSelectedMetricTwo;
    private final boolean showTableMetricsOnly;
    private final String source;
    private final OptionChainSettingsTableMetricsUpdate tableMetricUpdate;

    public static /* synthetic */ OptionChainSettingsDataState copy$default(OptionChainSettingsDataState optionChainSettingsDataState, OptionSettings.DefaultPricingSetting defaultPricingSetting, OptionChainSettingsSideBySideBidAskPriceLabelType optionChainSettingsSideBySideBidAskPriceLabelType, boolean z, OptionChainAvailableMetrics.Metric metric, OptionChainAvailableMetrics.Metric metric2, OptionChainAvailableMetrics.Metric metric3, OptionChainAvailableMetrics.Metric metric4, OptionChainSettingsTableMetricsUpdate optionChainSettingsTableMetricsUpdate, String str, boolean z2, boolean z3, boolean z4, OptionChainDisplayMode optionChainDisplayMode, OptionChainSettingsPnlChartType optionChainSettingsPnlChartType, boolean z5, boolean z6, boolean z7, int i, Object obj) {
        boolean z8;
        boolean z9;
        OptionSettings.DefaultPricingSetting defaultPricingSetting2;
        OptionChainSettingsDataState optionChainSettingsDataState2;
        boolean z10;
        OptionChainSettingsSideBySideBidAskPriceLabelType optionChainSettingsSideBySideBidAskPriceLabelType2;
        boolean z11;
        OptionChainAvailableMetrics.Metric metric5;
        OptionChainAvailableMetrics.Metric metric6;
        OptionChainAvailableMetrics.Metric metric7;
        OptionChainAvailableMetrics.Metric metric8;
        OptionChainSettingsTableMetricsUpdate optionChainSettingsTableMetricsUpdate2;
        String str2;
        boolean z12;
        boolean z13;
        boolean z14;
        OptionChainDisplayMode optionChainDisplayMode2;
        OptionChainSettingsPnlChartType optionChainSettingsPnlChartType2;
        OptionSettings.DefaultPricingSetting defaultPricingSetting3 = (i & 1) != 0 ? optionChainSettingsDataState.defaultPricingSettingServerValue : defaultPricingSetting;
        OptionChainSettingsSideBySideBidAskPriceLabelType optionChainSettingsSideBySideBidAskPriceLabelType3 = (i & 2) != 0 ? optionChainSettingsDataState.sbsBidAskPriceLabelType : optionChainSettingsSideBySideBidAskPriceLabelType;
        boolean z15 = (i & 4) != 0 ? optionChainSettingsDataState.sbsBidAskPriceLabelNewTagShown : z;
        OptionChainAvailableMetrics.Metric metric9 = (i & 8) != 0 ? optionChainSettingsDataState.buySelectedMetricOne : metric;
        OptionChainAvailableMetrics.Metric metric10 = (i & 16) != 0 ? optionChainSettingsDataState.buySelectedMetricTwo : metric2;
        OptionChainAvailableMetrics.Metric metric11 = (i & 32) != 0 ? optionChainSettingsDataState.sellSelectedMetricOne : metric3;
        OptionChainAvailableMetrics.Metric metric12 = (i & 64) != 0 ? optionChainSettingsDataState.sellSelectedMetricTwo : metric4;
        OptionChainSettingsTableMetricsUpdate optionChainSettingsTableMetricsUpdate3 = (i & 128) != 0 ? optionChainSettingsDataState.tableMetricUpdate : optionChainSettingsTableMetricsUpdate;
        String str3 = (i & 256) != 0 ? optionChainSettingsDataState.source : str;
        boolean z16 = (i & 512) != 0 ? optionChainSettingsDataState.isFocusedToSbsTooltipAndGreenDotShown : z2;
        boolean z17 = (i & 1024) != 0 ? optionChainSettingsDataState.inSideBySideBidAskSettingExperiment : z3;
        boolean z18 = (i & 2048) != 0 ? optionChainSettingsDataState.inSideBySideNuxRevampExperiment : z4;
        OptionChainDisplayMode optionChainDisplayMode3 = (i & 4096) != 0 ? optionChainSettingsDataState.optionChainDisplayMode : optionChainDisplayMode;
        OptionChainSettingsPnlChartType optionChainSettingsPnlChartType3 = (i & 8192) != 0 ? optionChainSettingsDataState.pnlChartType : optionChainSettingsPnlChartType;
        OptionSettings.DefaultPricingSetting defaultPricingSetting4 = defaultPricingSetting3;
        boolean z19 = (i & 16384) != 0 ? optionChainSettingsDataState.showTableMetricsOnly : z5;
        boolean z20 = (i & 32768) != 0 ? optionChainSettingsDataState.hasSeenSideBySideChain : z6;
        if ((i & 65536) != 0) {
            z9 = z20;
            z8 = optionChainSettingsDataState.hasSwitchToSbsTooltipShown;
            z10 = z19;
            optionChainSettingsSideBySideBidAskPriceLabelType2 = optionChainSettingsSideBySideBidAskPriceLabelType3;
            z11 = z15;
            metric5 = metric9;
            metric6 = metric10;
            metric7 = metric11;
            metric8 = metric12;
            optionChainSettingsTableMetricsUpdate2 = optionChainSettingsTableMetricsUpdate3;
            str2 = str3;
            z12 = z16;
            z13 = z17;
            z14 = z18;
            optionChainDisplayMode2 = optionChainDisplayMode3;
            optionChainSettingsPnlChartType2 = optionChainSettingsPnlChartType3;
            defaultPricingSetting2 = defaultPricingSetting4;
            optionChainSettingsDataState2 = optionChainSettingsDataState;
        } else {
            z8 = z7;
            z9 = z20;
            defaultPricingSetting2 = defaultPricingSetting4;
            optionChainSettingsDataState2 = optionChainSettingsDataState;
            z10 = z19;
            optionChainSettingsSideBySideBidAskPriceLabelType2 = optionChainSettingsSideBySideBidAskPriceLabelType3;
            z11 = z15;
            metric5 = metric9;
            metric6 = metric10;
            metric7 = metric11;
            metric8 = metric12;
            optionChainSettingsTableMetricsUpdate2 = optionChainSettingsTableMetricsUpdate3;
            str2 = str3;
            z12 = z16;
            z13 = z17;
            z14 = z18;
            optionChainDisplayMode2 = optionChainDisplayMode3;
            optionChainSettingsPnlChartType2 = optionChainSettingsPnlChartType3;
        }
        return optionChainSettingsDataState2.copy(defaultPricingSetting2, optionChainSettingsSideBySideBidAskPriceLabelType2, z11, metric5, metric6, metric7, metric8, optionChainSettingsTableMetricsUpdate2, str2, z12, z13, z14, optionChainDisplayMode2, optionChainSettingsPnlChartType2, z10, z9, z8);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionSettings.DefaultPricingSetting getDefaultPricingSettingServerValue() {
        return this.defaultPricingSettingServerValue;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsFocusedToSbsTooltipAndGreenDotShown() {
        return this.isFocusedToSbsTooltipAndGreenDotShown;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getInSideBySideBidAskSettingExperiment() {
        return this.inSideBySideBidAskSettingExperiment;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getInSideBySideNuxRevampExperiment() {
        return this.inSideBySideNuxRevampExperiment;
    }

    /* renamed from: component13, reason: from getter */
    public final OptionChainDisplayMode getOptionChainDisplayMode() {
        return this.optionChainDisplayMode;
    }

    /* renamed from: component14, reason: from getter */
    public final OptionChainSettingsPnlChartType getPnlChartType() {
        return this.pnlChartType;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getShowTableMetricsOnly() {
        return this.showTableMetricsOnly;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getHasSeenSideBySideChain() {
        return this.hasSeenSideBySideChain;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getHasSwitchToSbsTooltipShown() {
        return this.hasSwitchToSbsTooltipShown;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionChainSettingsSideBySideBidAskPriceLabelType getSbsBidAskPriceLabelType() {
        return this.sbsBidAskPriceLabelType;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSbsBidAskPriceLabelNewTagShown() {
        return this.sbsBidAskPriceLabelNewTagShown;
    }

    /* renamed from: component4, reason: from getter */
    public final OptionChainAvailableMetrics.Metric getBuySelectedMetricOne() {
        return this.buySelectedMetricOne;
    }

    /* renamed from: component5, reason: from getter */
    public final OptionChainAvailableMetrics.Metric getBuySelectedMetricTwo() {
        return this.buySelectedMetricTwo;
    }

    /* renamed from: component6, reason: from getter */
    public final OptionChainAvailableMetrics.Metric getSellSelectedMetricOne() {
        return this.sellSelectedMetricOne;
    }

    /* renamed from: component7, reason: from getter */
    public final OptionChainAvailableMetrics.Metric getSellSelectedMetricTwo() {
        return this.sellSelectedMetricTwo;
    }

    /* renamed from: component8, reason: from getter */
    public final OptionChainSettingsTableMetricsUpdate getTableMetricUpdate() {
        return this.tableMetricUpdate;
    }

    /* renamed from: component9, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final OptionChainSettingsDataState copy(OptionSettings.DefaultPricingSetting defaultPricingSettingServerValue, OptionChainSettingsSideBySideBidAskPriceLabelType sbsBidAskPriceLabelType, boolean sbsBidAskPriceLabelNewTagShown, OptionChainAvailableMetrics.Metric buySelectedMetricOne, OptionChainAvailableMetrics.Metric buySelectedMetricTwo, OptionChainAvailableMetrics.Metric sellSelectedMetricOne, OptionChainAvailableMetrics.Metric sellSelectedMetricTwo, OptionChainSettingsTableMetricsUpdate tableMetricUpdate, String source, boolean isFocusedToSbsTooltipAndGreenDotShown, boolean inSideBySideBidAskSettingExperiment, boolean inSideBySideNuxRevampExperiment, OptionChainDisplayMode optionChainDisplayMode, OptionChainSettingsPnlChartType pnlChartType, boolean showTableMetricsOnly, boolean hasSeenSideBySideChain, boolean hasSwitchToSbsTooltipShown) {
        Intrinsics.checkNotNullParameter(sbsBidAskPriceLabelType, "sbsBidAskPriceLabelType");
        Intrinsics.checkNotNullParameter(tableMetricUpdate, "tableMetricUpdate");
        return new OptionChainSettingsDataState(defaultPricingSettingServerValue, sbsBidAskPriceLabelType, sbsBidAskPriceLabelNewTagShown, buySelectedMetricOne, buySelectedMetricTwo, sellSelectedMetricOne, sellSelectedMetricTwo, tableMetricUpdate, source, isFocusedToSbsTooltipAndGreenDotShown, inSideBySideBidAskSettingExperiment, inSideBySideNuxRevampExperiment, optionChainDisplayMode, pnlChartType, showTableMetricsOnly, hasSeenSideBySideChain, hasSwitchToSbsTooltipShown);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionChainSettingsDataState)) {
            return false;
        }
        OptionChainSettingsDataState optionChainSettingsDataState = (OptionChainSettingsDataState) other;
        return this.defaultPricingSettingServerValue == optionChainSettingsDataState.defaultPricingSettingServerValue && this.sbsBidAskPriceLabelType == optionChainSettingsDataState.sbsBidAskPriceLabelType && this.sbsBidAskPriceLabelNewTagShown == optionChainSettingsDataState.sbsBidAskPriceLabelNewTagShown && Intrinsics.areEqual(this.buySelectedMetricOne, optionChainSettingsDataState.buySelectedMetricOne) && Intrinsics.areEqual(this.buySelectedMetricTwo, optionChainSettingsDataState.buySelectedMetricTwo) && Intrinsics.areEqual(this.sellSelectedMetricOne, optionChainSettingsDataState.sellSelectedMetricOne) && Intrinsics.areEqual(this.sellSelectedMetricTwo, optionChainSettingsDataState.sellSelectedMetricTwo) && Intrinsics.areEqual(this.tableMetricUpdate, optionChainSettingsDataState.tableMetricUpdate) && Intrinsics.areEqual(this.source, optionChainSettingsDataState.source) && this.isFocusedToSbsTooltipAndGreenDotShown == optionChainSettingsDataState.isFocusedToSbsTooltipAndGreenDotShown && this.inSideBySideBidAskSettingExperiment == optionChainSettingsDataState.inSideBySideBidAskSettingExperiment && this.inSideBySideNuxRevampExperiment == optionChainSettingsDataState.inSideBySideNuxRevampExperiment && this.optionChainDisplayMode == optionChainSettingsDataState.optionChainDisplayMode && this.pnlChartType == optionChainSettingsDataState.pnlChartType && this.showTableMetricsOnly == optionChainSettingsDataState.showTableMetricsOnly && this.hasSeenSideBySideChain == optionChainSettingsDataState.hasSeenSideBySideChain && this.hasSwitchToSbsTooltipShown == optionChainSettingsDataState.hasSwitchToSbsTooltipShown;
    }

    public int hashCode() {
        OptionSettings.DefaultPricingSetting defaultPricingSetting = this.defaultPricingSettingServerValue;
        int iHashCode = (((((defaultPricingSetting == null ? 0 : defaultPricingSetting.hashCode()) * 31) + this.sbsBidAskPriceLabelType.hashCode()) * 31) + Boolean.hashCode(this.sbsBidAskPriceLabelNewTagShown)) * 31;
        OptionChainAvailableMetrics.Metric metric = this.buySelectedMetricOne;
        int iHashCode2 = (iHashCode + (metric == null ? 0 : metric.hashCode())) * 31;
        OptionChainAvailableMetrics.Metric metric2 = this.buySelectedMetricTwo;
        int iHashCode3 = (iHashCode2 + (metric2 == null ? 0 : metric2.hashCode())) * 31;
        OptionChainAvailableMetrics.Metric metric3 = this.sellSelectedMetricOne;
        int iHashCode4 = (iHashCode3 + (metric3 == null ? 0 : metric3.hashCode())) * 31;
        OptionChainAvailableMetrics.Metric metric4 = this.sellSelectedMetricTwo;
        int iHashCode5 = (((iHashCode4 + (metric4 == null ? 0 : metric4.hashCode())) * 31) + this.tableMetricUpdate.hashCode()) * 31;
        String str = this.source;
        int iHashCode6 = (((((((iHashCode5 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isFocusedToSbsTooltipAndGreenDotShown)) * 31) + Boolean.hashCode(this.inSideBySideBidAskSettingExperiment)) * 31) + Boolean.hashCode(this.inSideBySideNuxRevampExperiment)) * 31;
        OptionChainDisplayMode optionChainDisplayMode = this.optionChainDisplayMode;
        int iHashCode7 = (iHashCode6 + (optionChainDisplayMode == null ? 0 : optionChainDisplayMode.hashCode())) * 31;
        OptionChainSettingsPnlChartType optionChainSettingsPnlChartType = this.pnlChartType;
        return ((((((iHashCode7 + (optionChainSettingsPnlChartType != null ? optionChainSettingsPnlChartType.hashCode() : 0)) * 31) + Boolean.hashCode(this.showTableMetricsOnly)) * 31) + Boolean.hashCode(this.hasSeenSideBySideChain)) * 31) + Boolean.hashCode(this.hasSwitchToSbsTooltipShown);
    }

    public String toString() {
        return "OptionChainSettingsDataState(defaultPricingSettingServerValue=" + this.defaultPricingSettingServerValue + ", sbsBidAskPriceLabelType=" + this.sbsBidAskPriceLabelType + ", sbsBidAskPriceLabelNewTagShown=" + this.sbsBidAskPriceLabelNewTagShown + ", buySelectedMetricOne=" + this.buySelectedMetricOne + ", buySelectedMetricTwo=" + this.buySelectedMetricTwo + ", sellSelectedMetricOne=" + this.sellSelectedMetricOne + ", sellSelectedMetricTwo=" + this.sellSelectedMetricTwo + ", tableMetricUpdate=" + this.tableMetricUpdate + ", source=" + this.source + ", isFocusedToSbsTooltipAndGreenDotShown=" + this.isFocusedToSbsTooltipAndGreenDotShown + ", inSideBySideBidAskSettingExperiment=" + this.inSideBySideBidAskSettingExperiment + ", inSideBySideNuxRevampExperiment=" + this.inSideBySideNuxRevampExperiment + ", optionChainDisplayMode=" + this.optionChainDisplayMode + ", pnlChartType=" + this.pnlChartType + ", showTableMetricsOnly=" + this.showTableMetricsOnly + ", hasSeenSideBySideChain=" + this.hasSeenSideBySideChain + ", hasSwitchToSbsTooltipShown=" + this.hasSwitchToSbsTooltipShown + ")";
    }

    public OptionChainSettingsDataState(OptionSettings.DefaultPricingSetting defaultPricingSetting, OptionChainSettingsSideBySideBidAskPriceLabelType sbsBidAskPriceLabelType, boolean z, OptionChainAvailableMetrics.Metric metric, OptionChainAvailableMetrics.Metric metric2, OptionChainAvailableMetrics.Metric metric3, OptionChainAvailableMetrics.Metric metric4, OptionChainSettingsTableMetricsUpdate tableMetricUpdate, String str, boolean z2, boolean z3, boolean z4, OptionChainDisplayMode optionChainDisplayMode, OptionChainSettingsPnlChartType optionChainSettingsPnlChartType, boolean z5, boolean z6, boolean z7) {
        Intrinsics.checkNotNullParameter(sbsBidAskPriceLabelType, "sbsBidAskPriceLabelType");
        Intrinsics.checkNotNullParameter(tableMetricUpdate, "tableMetricUpdate");
        this.defaultPricingSettingServerValue = defaultPricingSetting;
        this.sbsBidAskPriceLabelType = sbsBidAskPriceLabelType;
        this.sbsBidAskPriceLabelNewTagShown = z;
        this.buySelectedMetricOne = metric;
        this.buySelectedMetricTwo = metric2;
        this.sellSelectedMetricOne = metric3;
        this.sellSelectedMetricTwo = metric4;
        this.tableMetricUpdate = tableMetricUpdate;
        this.source = str;
        this.isFocusedToSbsTooltipAndGreenDotShown = z2;
        this.inSideBySideBidAskSettingExperiment = z3;
        this.inSideBySideNuxRevampExperiment = z4;
        this.optionChainDisplayMode = optionChainDisplayMode;
        this.pnlChartType = optionChainSettingsPnlChartType;
        this.showTableMetricsOnly = z5;
        this.hasSeenSideBySideChain = z6;
        this.hasSwitchToSbsTooltipShown = z7;
    }

    public final OptionSettings.DefaultPricingSetting getDefaultPricingSettingServerValue() {
        return this.defaultPricingSettingServerValue;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ OptionChainSettingsDataState(com.robinhood.models.db.OptionSettings.DefaultPricingSetting r22, com.robinhood.models.p355ui.OptionChainSettingsSideBySideBidAskPriceLabelType r23, boolean r24, com.robinhood.models.p320db.OptionChainAvailableMetrics.Metric r25, com.robinhood.models.p320db.OptionChainAvailableMetrics.Metric r26, com.robinhood.models.p320db.OptionChainAvailableMetrics.Metric r27, com.robinhood.models.p320db.OptionChainAvailableMetrics.Metric r28, com.robinhood.models.p320db.OptionChainSettingsTableMetricsUpdate r29, java.lang.String r30, boolean r31, boolean r32, boolean r33, com.robinhood.models.p355ui.OptionChainDisplayMode r34, com.robinhood.models.p355ui.OptionChainSettingsPnlChartType r35, boolean r36, boolean r37, boolean r38, int r39, kotlin.jvm.internal.DefaultConstructorMarker r40) {
        /*
            r21 = this;
            r0 = r39
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L9
            r4 = r2
            goto Lb
        L9:
            r4 = r22
        Lb:
            r1 = r0 & 2
            if (r1 == 0) goto L13
            com.robinhood.models.ui.OptionChainSettingsSideBySideBidAskPriceLabelType r1 = com.robinhood.models.p355ui.OptionChainSettingsSideBySideBidAskPriceLabelType.BID_ASK
            r5 = r1
            goto L15
        L13:
            r5 = r23
        L15:
            r1 = r0 & 4
            if (r1 == 0) goto L1c
            r1 = 1
            r6 = r1
            goto L1e
        L1c:
            r6 = r24
        L1e:
            r1 = r0 & 8
            if (r1 == 0) goto L24
            r7 = r2
            goto L26
        L24:
            r7 = r25
        L26:
            r1 = r0 & 16
            if (r1 == 0) goto L2c
            r8 = r2
            goto L2e
        L2c:
            r8 = r26
        L2e:
            r1 = r0 & 32
            if (r1 == 0) goto L34
            r9 = r2
            goto L36
        L34:
            r9 = r27
        L36:
            r1 = r0 & 64
            if (r1 == 0) goto L3c
            r10 = r2
            goto L3e
        L3c:
            r10 = r28
        L3e:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L4f
            com.robinhood.models.db.OptionChainSettingsTableMetricsUpdate r1 = new com.robinhood.models.db.OptionChainSettingsTableMetricsUpdate
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            r11 = 0
            r1.<init>(r3, r11)
            r11 = r1
            goto L51
        L4f:
            r11 = r29
        L51:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r3 = 0
            if (r1 == 0) goto L58
            r14 = r3
            goto L5a
        L58:
            r14 = r32
        L5a:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L60
            r15 = r3
            goto L62
        L60:
            r15 = r33
        L62:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L69
            r16 = r2
            goto L6b
        L69:
            r16 = r34
        L6b:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L72
            r17 = r2
            goto L74
        L72:
            r17 = r35
        L74:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L7b
            r18 = r3
            goto L7d
        L7b:
            r18 = r36
        L7d:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L86
            r19 = r3
            goto L88
        L86:
            r19 = r37
        L88:
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L96
            r20 = r3
            r12 = r30
            r13 = r31
            r3 = r21
            goto L9e
        L96:
            r20 = r38
            r3 = r21
            r12 = r30
            r13 = r31
        L9e:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDataState.<init>(com.robinhood.models.db.OptionSettings$DefaultPricingSetting, com.robinhood.models.ui.OptionChainSettingsSideBySideBidAskPriceLabelType, boolean, com.robinhood.models.db.OptionChainAvailableMetrics$Metric, com.robinhood.models.db.OptionChainAvailableMetrics$Metric, com.robinhood.models.db.OptionChainAvailableMetrics$Metric, com.robinhood.models.db.OptionChainAvailableMetrics$Metric, com.robinhood.models.db.OptionChainSettingsTableMetricsUpdate, java.lang.String, boolean, boolean, boolean, com.robinhood.models.ui.OptionChainDisplayMode, com.robinhood.models.ui.OptionChainSettingsPnlChartType, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final OptionChainSettingsSideBySideBidAskPriceLabelType getSbsBidAskPriceLabelType() {
        return this.sbsBidAskPriceLabelType;
    }

    public final boolean getSbsBidAskPriceLabelNewTagShown() {
        return this.sbsBidAskPriceLabelNewTagShown;
    }

    public final OptionChainAvailableMetrics.Metric getBuySelectedMetricOne() {
        return this.buySelectedMetricOne;
    }

    public final OptionChainAvailableMetrics.Metric getBuySelectedMetricTwo() {
        return this.buySelectedMetricTwo;
    }

    public final OptionChainAvailableMetrics.Metric getSellSelectedMetricOne() {
        return this.sellSelectedMetricOne;
    }

    public final OptionChainAvailableMetrics.Metric getSellSelectedMetricTwo() {
        return this.sellSelectedMetricTwo;
    }

    public final OptionChainSettingsTableMetricsUpdate getTableMetricUpdate() {
        return this.tableMetricUpdate;
    }

    public final String getSource() {
        return this.source;
    }

    public final boolean isFocusedToSbsTooltipAndGreenDotShown() {
        return this.isFocusedToSbsTooltipAndGreenDotShown;
    }

    public final boolean getInSideBySideBidAskSettingExperiment() {
        return this.inSideBySideBidAskSettingExperiment;
    }

    public final boolean getInSideBySideNuxRevampExperiment() {
        return this.inSideBySideNuxRevampExperiment;
    }

    public final OptionChainDisplayMode getOptionChainDisplayMode() {
        return this.optionChainDisplayMode;
    }

    public final OptionChainSettingsPnlChartType getPnlChartType() {
        return this.pnlChartType;
    }

    public final boolean getShowTableMetricsOnly() {
        return this.showTableMetricsOnly;
    }

    public final boolean getHasSeenSideBySideChain() {
        return this.hasSeenSideBySideChain;
    }

    public final boolean getHasSwitchToSbsTooltipShown() {
        return this.hasSwitchToSbsTooltipShown;
    }
}
