package com.robinhood.android.optionschain.chainsettings;

import android.content.res.Resources;
import com.robinhood.android.optionchain.chainsettings.OptionChainFallbackMetrics;
import com.robinhood.android.options.contracts.OptionChainSettingsFragmentKey2;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.OptionSeenContext;
import com.robinhood.models.p320db.OptionChainAvailableMetrics;
import com.robinhood.models.p320db.OptionChainSettingsTableMetric;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.OptionChainDisplayMode;
import com.robinhood.models.p355ui.OptionChainSettingsPnlChartType;
import com.robinhood.models.p355ui.OptionChainSettingsSideBySideBidAskPriceLabelType;
import com.robinhood.utils.Either;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: OptionChainSettingsStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDataState;", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "reduce", "dataState", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionChainSettingsStateProvider implements StateProvider<OptionChainSettingsDataState, OptionChainSettingsViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    /* compiled from: OptionChainSettingsStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OptionSettings.DefaultPricingSetting.values().length];
            try {
                iArr[OptionSettings.DefaultPricingSetting.NATURAL_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionSettings.DefaultPricingSetting.MARK_PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OptionChainSettingsSideBySideBidAskPriceLabelType.values().length];
            try {
                iArr2[OptionChainSettingsSideBySideBidAskPriceLabelType.BID_ASK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OptionChainSettingsSideBySideBidAskPriceLabelType.SELL_BUY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public OptionChainSettingsStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041 A[LOOP:0: B:11:0x003b->B:13:0x0041, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ff  */
    @Override // com.robinhood.android.udf.StateProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OptionChainSettingsViewState reduce(OptionChainSettingsDataState dataState) throws Resources.NotFoundException {
        OptionSeenContext optionSeenContext;
        OptionSeenContext optionSeenContext2;
        boolean z;
        boolean z2;
        int i;
        String string2;
        OptionChainSettingsViewState5 optionChainSettingsListMetricViewState;
        String metricLabel;
        String metricLabel2;
        String metricLabel3;
        String metricLabel4;
        OptionChainSettingsPnlChartType pnlChartType;
        int i2;
        String string3;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        String source = dataState.getSource();
        OptionChainSettingsDropdownViewState optionChainSettingsDropdownViewState = null;
        if (Intrinsics.areEqual(source, "chain_customization_gtm")) {
            optionSeenContext2 = OptionSeenContext.SEEN_OPTION_CHAIN_SETTINGS_GTM;
        } else {
            if (!Intrinsics.areEqual(source, OptionChainSettingsFragmentKey2.SOURCE_CHAIN_CUSTOMIZATION_NUX)) {
                optionSeenContext = null;
                List<OptionChainSettingsTableMetric> tableMetrics = dataState.getTableMetricUpdate().getTableMetrics();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(tableMetrics, 10));
                for (OptionChainSettingsTableMetric optionChainSettingsTableMetric : tableMetrics) {
                    arrayList.add(new OptionChainSettingsTableMetricRowViewState(optionChainSettingsTableMetric.getMetric(), optionChainSettingsTableMetric.getEnabled()));
                }
                if (!dataState.getHasSwitchToSbsTooltipShown() && dataState.isFocusedToSbsTooltipAndGreenDotShown() && dataState.getInSideBySideNuxRevampExperiment()) {
                    z2 = true;
                    z = true;
                } else {
                    z = false;
                    z2 = true;
                }
                String string4 = this.resources.getString(C24135R.string.option_chain_settings_default_price_title);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                OptionSettings.DefaultPricingSetting defaultPricingSettingServerValue = dataState.getDefaultPricingSettingServerValue();
                i = defaultPricingSettingServerValue != null ? -1 : WhenMappings.$EnumSwitchMapping$0[defaultPricingSettingServerValue.ordinal()];
                if (i != -1) {
                    string2 = "";
                } else if (i == z2) {
                    string2 = this.resources.getString(C24135R.string.option_default_price_setting_natural_price_title);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    string2 = this.resources.getString(C24135R.string.option_default_price_setting_mark_price_title);
                }
                Intrinsics.checkNotNull(string2);
                OptionChainSettingsDropdownViewState optionChainSettingsDropdownViewState2 = new OptionChainSettingsDropdownViewState(string4, string2, false, OptionChainSettingsViewState2.DEFAULT_PRICE);
                OptionSettings.DefaultPricingSetting defaultPricingSettingServerValue2 = dataState.getDefaultPricingSettingServerValue();
                if (dataState.getInSideBySideBidAskSettingExperiment() && dataState.getOptionChainDisplayMode() == OptionChainDisplayMode.SIDE_BY_SIDE) {
                    String string5 = this.resources.getString(C24135R.string.option_chain_settings_sbs_price_label_title);
                    Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                    i2 = WhenMappings.$EnumSwitchMapping$1[dataState.getSbsBidAskPriceLabelType().ordinal()];
                    if (i2 != z2) {
                        string3 = this.resources.getString(C24135R.string.option_chain_settings_sbs_price_label_bid_ask);
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        string3 = this.resources.getString(C24135R.string.option_chain_settings_sbs_price_label_sell_buy);
                    }
                    Intrinsics.checkNotNull(string3);
                    optionChainSettingsDropdownViewState = new OptionChainSettingsDropdownViewState(string5, string3, dataState.getSbsBidAskPriceLabelNewTagShown() ^ z2, OptionChainSettingsViewState2.BID_ASK_PRICE_LABEL);
                }
                OptionChainSettingsDropdownViewState optionChainSettingsDropdownViewState3 = optionChainSettingsDropdownViewState;
                if (dataState.getOptionChainDisplayMode() == OptionChainDisplayMode.SIDE_BY_SIDE) {
                    OptionChainAvailableMetrics.Metric buySelectedMetricOne = dataState.getBuySelectedMetricOne();
                    if (buySelectedMetricOne == null || (metricLabel = buySelectedMetricOne.getMetricLabel()) == null) {
                        metricLabel = OptionChainFallbackMetrics.getFallbackSelectedMetric(this.resources, new Either.Left(OrderSide.BUY)).getFirst().getMetricLabel();
                    }
                    OptionChainAvailableMetrics.Metric buySelectedMetricTwo = dataState.getBuySelectedMetricTwo();
                    if (buySelectedMetricTwo == null || (metricLabel2 = buySelectedMetricTwo.getMetricLabel()) == null) {
                        metricLabel2 = OptionChainFallbackMetrics.getFallbackSelectedMetric(this.resources, new Either.Left(OrderSide.BUY)).getSecond().getMetricLabel();
                    }
                    OptionChainAvailableMetrics.Metric sellSelectedMetricOne = dataState.getSellSelectedMetricOne();
                    if (sellSelectedMetricOne == null || (metricLabel3 = sellSelectedMetricOne.getMetricLabel()) == null) {
                        metricLabel3 = OptionChainFallbackMetrics.getFallbackSelectedMetric(this.resources, new Either.Left(OrderSide.SELL)).getFirst().getMetricLabel();
                    }
                    OptionChainAvailableMetrics.Metric sellSelectedMetricTwo = dataState.getSellSelectedMetricTwo();
                    if (sellSelectedMetricTwo == null || (metricLabel4 = sellSelectedMetricTwo.getMetricLabel()) == null) {
                        metricLabel4 = OptionChainFallbackMetrics.getFallbackSelectedMetric(this.resources, new Either.Left(OrderSide.SELL)).getSecond().getMetricLabel();
                    }
                    optionChainSettingsListMetricViewState = new OptionChainSettingsListMetricViewState(metricLabel, metricLabel2, metricLabel3, metricLabel4);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (((OptionChainSettingsTableMetricRowViewState) obj).getEnabled()) {
                            arrayList2.add(obj);
                        }
                    }
                    ImmutableList immutableList = extensions2.toImmutableList(arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (!((OptionChainSettingsTableMetricRowViewState) obj2).getEnabled()) {
                            arrayList3.add(obj2);
                        }
                    }
                    optionChainSettingsListMetricViewState = new OptionChainSettingsTableMetricViewState(immutableList, extensions2.toImmutableList(arrayList3));
                }
                OptionChainSettingsViewState5 optionChainSettingsViewState5 = optionChainSettingsListMetricViewState;
                pnlChartType = dataState.getPnlChartType();
                if (pnlChartType == null) {
                    pnlChartType = OptionChainSettingsPnlChartType.BY_PRICE;
                }
                return new OptionChainSettingsViewState(optionChainSettingsDropdownViewState2, defaultPricingSettingServerValue2, optionChainSettingsViewState5, optionSeenContext, optionChainSettingsDropdownViewState3, pnlChartType, dataState.getShowTableMetricsOnly(), !dataState.getHasSeenSideBySideChain(), z);
            }
            optionSeenContext2 = OptionSeenContext.SEEN_OPTION_CHAIN_SETTINGS_NUX;
        }
        optionSeenContext = optionSeenContext2;
        List<OptionChainSettingsTableMetric> tableMetrics2 = dataState.getTableMetricUpdate().getTableMetrics();
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(tableMetrics2, 10));
        while (r0.hasNext()) {
        }
        if (!dataState.getHasSwitchToSbsTooltipShown()) {
            z = false;
            z2 = true;
        }
        String string42 = this.resources.getString(C24135R.string.option_chain_settings_default_price_title);
        Intrinsics.checkNotNullExpressionValue(string42, "getString(...)");
        OptionSettings.DefaultPricingSetting defaultPricingSettingServerValue3 = dataState.getDefaultPricingSettingServerValue();
        if (defaultPricingSettingServerValue3 != null) {
        }
        if (i != -1) {
        }
        Intrinsics.checkNotNull(string2);
        OptionChainSettingsDropdownViewState optionChainSettingsDropdownViewState22 = new OptionChainSettingsDropdownViewState(string42, string2, false, OptionChainSettingsViewState2.DEFAULT_PRICE);
        OptionSettings.DefaultPricingSetting defaultPricingSettingServerValue22 = dataState.getDefaultPricingSettingServerValue();
        if (dataState.getInSideBySideBidAskSettingExperiment()) {
            String string52 = this.resources.getString(C24135R.string.option_chain_settings_sbs_price_label_title);
            Intrinsics.checkNotNullExpressionValue(string52, "getString(...)");
            i2 = WhenMappings.$EnumSwitchMapping$1[dataState.getSbsBidAskPriceLabelType().ordinal()];
            if (i2 != z2) {
            }
            Intrinsics.checkNotNull(string3);
            optionChainSettingsDropdownViewState = new OptionChainSettingsDropdownViewState(string52, string3, dataState.getSbsBidAskPriceLabelNewTagShown() ^ z2, OptionChainSettingsViewState2.BID_ASK_PRICE_LABEL);
        }
        OptionChainSettingsDropdownViewState optionChainSettingsDropdownViewState32 = optionChainSettingsDropdownViewState;
        if (dataState.getOptionChainDisplayMode() == OptionChainDisplayMode.SIDE_BY_SIDE) {
        }
        OptionChainSettingsViewState5 optionChainSettingsViewState52 = optionChainSettingsListMetricViewState;
        pnlChartType = dataState.getPnlChartType();
        if (pnlChartType == null) {
        }
        return new OptionChainSettingsViewState(optionChainSettingsDropdownViewState22, defaultPricingSettingServerValue22, optionChainSettingsViewState52, optionSeenContext, optionChainSettingsDropdownViewState32, pnlChartType, dataState.getShowTableMetricsOnly(), !dataState.getHasSeenSideBySideChain(), z);
    }
}
