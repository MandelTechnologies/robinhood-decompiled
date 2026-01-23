package com.robinhood.android.options.statistics;

import com.robinhood.android.common.detail.component.fundamentals.DetailPageFundamentalsDataCell;
import com.robinhood.android.compose.bidask.BidAsk;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartDataState2;
import com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggingState;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderLaunchMode;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p355ui.OptionChainSettingsPnlChartType;
import com.robinhood.models.p355ui.OptionOrderBundle;
import com.robinhood.models.p355ui.OptionWatchlistItemState;
import com.robinhood.shared.lists.quickadd.extensions.OptionStrategySecurity;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionStatisticsViewState.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÝ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0017\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\u0010#\u001a\u0004\u0018\u00010$\u0012\u0006\u0010%\u001a\u00020\r\u0012\u0006\u0010&\u001a\u00020\r¢\u0006\u0004\b'\u0010(J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u0007HÆ\u0003J\t\u0010N\u001a\u00020\tHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010P\u001a\u00020\rHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010R\u001a\u00020\u0011HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\u000f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0003J\u000f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0003J\t\u0010X\u001a\u00020\u001bHÆ\u0003J\u000f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0017HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\"HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010$HÆ\u0003J\t\u0010_\u001a\u00020\rHÆ\u0003J\t\u0010`\u001a\u00020\rHÆ\u0003J\u008b\u0002\u0010a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00172\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020\r2\b\b\u0002\u0010&\u001a\u00020\rHÆ\u0001J\u0013\u0010b\u001a\u00020\r2\b\u0010c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010d\u001a\u00020eHÖ\u0001J\t\u0010f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010*R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010*R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\b\n\u0000\u001a\u0004\b?\u0010>R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0017¢\u0006\b\n\u0000\u001a\u0004\bB\u0010>R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010*R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010*R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010*R\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010#\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0011\u0010%\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bJ\u00104R\u0011\u0010&\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b&\u00104¨\u0006g"}, m3636d2 = {"Lcom/robinhood/android/options/statistics/OptionStatisticsViewState;", "", "accountNumber", "", "bidAsk", "Lcom/robinhood/android/compose/bidask/BidAsk;", "defaultPricingSetting", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "optionChainId", "Ljava/util/UUID;", "optionStrategySecurity", "Lcom/robinhood/shared/lists/quickadd/extensions/OptionStrategySecurity;", "shouldDefaultToSimulatedReturnTab", "", "simulatedReturnLoggingState", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "simulatedReturnChartLaunchMode", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode;", "simulatedReturnSliderLaunchMode", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode;", "strategyCode", "title", "stats", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/common/detail/component/fundamentals/DetailPageFundamentalsDataCell;", "greeks", "watchlistItemState", "Lcom/robinhood/models/ui/OptionWatchlistItemState;", "underlyings", "Lcom/robinhood/android/options/statistics/OptionStatisticsUnderlyingRowState;", "untradableInfoBannerMessage", "primaryButtonText", "secondaryButtonText", "pnlChartType", "Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;", "optionOrderBundleForChart", "Lcom/robinhood/models/ui/OptionOrderBundle;", "showSimulatedReturnSegment", "isPreTradeStatNuxDotShown", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/compose/bidask/BidAsk;Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Ljava/util/UUID;Lcom/robinhood/shared/lists/quickadd/extensions/OptionStrategySecurity;ZLcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode;Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode;Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/ui/OptionWatchlistItemState;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;Lcom/robinhood/models/ui/OptionOrderBundle;ZZ)V", "getAccountNumber", "()Ljava/lang/String;", "getBidAsk", "()Lcom/robinhood/android/compose/bidask/BidAsk;", "getDefaultPricingSetting", "()Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "getOptionChainId", "()Ljava/util/UUID;", "getOptionStrategySecurity", "()Lcom/robinhood/shared/lists/quickadd/extensions/OptionStrategySecurity;", "getShouldDefaultToSimulatedReturnTab", "()Z", "getSimulatedReturnLoggingState", "()Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "getSimulatedReturnChartLaunchMode", "()Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode;", "getSimulatedReturnSliderLaunchMode", "()Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode;", "getStrategyCode", "getTitle", "getStats", "()Lkotlinx/collections/immutable/ImmutableList;", "getGreeks", "getWatchlistItemState", "()Lcom/robinhood/models/ui/OptionWatchlistItemState;", "getUnderlyings", "getUntradableInfoBannerMessage", "getPrimaryButtonText", "getSecondaryButtonText", "getPnlChartType", "()Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;", "getOptionOrderBundleForChart", "()Lcom/robinhood/models/ui/OptionOrderBundle;", "getShowSimulatedReturnSegment", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "equals", "other", "hashCode", "", "toString", "feature-lib-options-statistics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionStatisticsViewState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final BidAsk bidAsk;
    private final OptionSettings.DefaultPricingSetting defaultPricingSetting;
    private final ImmutableList<DetailPageFundamentalsDataCell> greeks;
    private final boolean isPreTradeStatNuxDotShown;
    private final UUID optionChainId;
    private final OptionOrderBundle optionOrderBundleForChart;
    private final OptionStrategySecurity optionStrategySecurity;
    private final OptionChainSettingsPnlChartType pnlChartType;
    private final String primaryButtonText;
    private final String secondaryButtonText;
    private final boolean shouldDefaultToSimulatedReturnTab;
    private final boolean showSimulatedReturnSegment;
    private final OptionsSimulatedReturnChartDataState2 simulatedReturnChartLaunchMode;
    private final OptionsSimulatedReturnLoggingState simulatedReturnLoggingState;
    private final OptionsSimulatedReturnSliderLaunchMode simulatedReturnSliderLaunchMode;
    private final ImmutableList<DetailPageFundamentalsDataCell> stats;
    private final String strategyCode;
    private final String title;
    private final ImmutableList<OptionStatisticsUnderlyingRowState> underlyings;
    private final String untradableInfoBannerMessage;
    private final OptionWatchlistItemState watchlistItemState;

    public static /* synthetic */ OptionStatisticsViewState copy$default(OptionStatisticsViewState optionStatisticsViewState, String str, BidAsk bidAsk, OptionSettings.DefaultPricingSetting defaultPricingSetting, UUID uuid, OptionStrategySecurity optionStrategySecurity, boolean z, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, OptionsSimulatedReturnChartDataState2 optionsSimulatedReturnChartDataState2, OptionsSimulatedReturnSliderLaunchMode optionsSimulatedReturnSliderLaunchMode, String str2, String str3, ImmutableList immutableList, ImmutableList immutableList2, OptionWatchlistItemState optionWatchlistItemState, ImmutableList immutableList3, String str4, String str5, String str6, OptionChainSettingsPnlChartType optionChainSettingsPnlChartType, OptionOrderBundle optionOrderBundle, boolean z2, boolean z3, int i, Object obj) {
        boolean z4;
        boolean z5;
        String str7 = (i & 1) != 0 ? optionStatisticsViewState.accountNumber : str;
        BidAsk bidAsk2 = (i & 2) != 0 ? optionStatisticsViewState.bidAsk : bidAsk;
        OptionSettings.DefaultPricingSetting defaultPricingSetting2 = (i & 4) != 0 ? optionStatisticsViewState.defaultPricingSetting : defaultPricingSetting;
        UUID uuid2 = (i & 8) != 0 ? optionStatisticsViewState.optionChainId : uuid;
        OptionStrategySecurity optionStrategySecurity2 = (i & 16) != 0 ? optionStatisticsViewState.optionStrategySecurity : optionStrategySecurity;
        boolean z6 = (i & 32) != 0 ? optionStatisticsViewState.shouldDefaultToSimulatedReturnTab : z;
        OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState2 = (i & 64) != 0 ? optionStatisticsViewState.simulatedReturnLoggingState : optionsSimulatedReturnLoggingState;
        OptionsSimulatedReturnChartDataState2 optionsSimulatedReturnChartDataState22 = (i & 128) != 0 ? optionStatisticsViewState.simulatedReturnChartLaunchMode : optionsSimulatedReturnChartDataState2;
        OptionsSimulatedReturnSliderLaunchMode optionsSimulatedReturnSliderLaunchMode2 = (i & 256) != 0 ? optionStatisticsViewState.simulatedReturnSliderLaunchMode : optionsSimulatedReturnSliderLaunchMode;
        String str8 = (i & 512) != 0 ? optionStatisticsViewState.strategyCode : str2;
        String str9 = (i & 1024) != 0 ? optionStatisticsViewState.title : str3;
        ImmutableList immutableList4 = (i & 2048) != 0 ? optionStatisticsViewState.stats : immutableList;
        ImmutableList immutableList5 = (i & 4096) != 0 ? optionStatisticsViewState.greeks : immutableList2;
        OptionWatchlistItemState optionWatchlistItemState2 = (i & 8192) != 0 ? optionStatisticsViewState.watchlistItemState : optionWatchlistItemState;
        String str10 = str7;
        ImmutableList immutableList6 = (i & 16384) != 0 ? optionStatisticsViewState.underlyings : immutableList3;
        String str11 = (i & 32768) != 0 ? optionStatisticsViewState.untradableInfoBannerMessage : str4;
        String str12 = (i & 65536) != 0 ? optionStatisticsViewState.primaryButtonText : str5;
        String str13 = (i & 131072) != 0 ? optionStatisticsViewState.secondaryButtonText : str6;
        OptionChainSettingsPnlChartType optionChainSettingsPnlChartType2 = (i & 262144) != 0 ? optionStatisticsViewState.pnlChartType : optionChainSettingsPnlChartType;
        OptionOrderBundle optionOrderBundle2 = (i & 524288) != 0 ? optionStatisticsViewState.optionOrderBundleForChart : optionOrderBundle;
        boolean z7 = (i & 1048576) != 0 ? optionStatisticsViewState.showSimulatedReturnSegment : z2;
        if ((i & 2097152) != 0) {
            z5 = z7;
            z4 = optionStatisticsViewState.isPreTradeStatNuxDotShown;
        } else {
            z4 = z3;
            z5 = z7;
        }
        return optionStatisticsViewState.copy(str10, bidAsk2, defaultPricingSetting2, uuid2, optionStrategySecurity2, z6, optionsSimulatedReturnLoggingState2, optionsSimulatedReturnChartDataState22, optionsSimulatedReturnSliderLaunchMode2, str8, str9, immutableList4, immutableList5, optionWatchlistItemState2, immutableList6, str11, str12, str13, optionChainSettingsPnlChartType2, optionOrderBundle2, z5, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component10, reason: from getter */
    public final String getStrategyCode() {
        return this.strategyCode;
    }

    /* renamed from: component11, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final ImmutableList<DetailPageFundamentalsDataCell> component12() {
        return this.stats;
    }

    public final ImmutableList<DetailPageFundamentalsDataCell> component13() {
        return this.greeks;
    }

    /* renamed from: component14, reason: from getter */
    public final OptionWatchlistItemState getWatchlistItemState() {
        return this.watchlistItemState;
    }

    public final ImmutableList<OptionStatisticsUnderlyingRowState> component15() {
        return this.underlyings;
    }

    /* renamed from: component16, reason: from getter */
    public final String getUntradableInfoBannerMessage() {
        return this.untradableInfoBannerMessage;
    }

    /* renamed from: component17, reason: from getter */
    public final String getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    /* renamed from: component18, reason: from getter */
    public final String getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    /* renamed from: component19, reason: from getter */
    public final OptionChainSettingsPnlChartType getPnlChartType() {
        return this.pnlChartType;
    }

    /* renamed from: component2, reason: from getter */
    public final BidAsk getBidAsk() {
        return this.bidAsk;
    }

    /* renamed from: component20, reason: from getter */
    public final OptionOrderBundle getOptionOrderBundleForChart() {
        return this.optionOrderBundleForChart;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getShowSimulatedReturnSegment() {
        return this.showSimulatedReturnSegment;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getIsPreTradeStatNuxDotShown() {
        return this.isPreTradeStatNuxDotShown;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionSettings.DefaultPricingSetting getDefaultPricingSetting() {
        return this.defaultPricingSetting;
    }

    /* renamed from: component4, reason: from getter */
    public final UUID getOptionChainId() {
        return this.optionChainId;
    }

    /* renamed from: component5, reason: from getter */
    public final OptionStrategySecurity getOptionStrategySecurity() {
        return this.optionStrategySecurity;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShouldDefaultToSimulatedReturnTab() {
        return this.shouldDefaultToSimulatedReturnTab;
    }

    /* renamed from: component7, reason: from getter */
    public final OptionsSimulatedReturnLoggingState getSimulatedReturnLoggingState() {
        return this.simulatedReturnLoggingState;
    }

    /* renamed from: component8, reason: from getter */
    public final OptionsSimulatedReturnChartDataState2 getSimulatedReturnChartLaunchMode() {
        return this.simulatedReturnChartLaunchMode;
    }

    /* renamed from: component9, reason: from getter */
    public final OptionsSimulatedReturnSliderLaunchMode getSimulatedReturnSliderLaunchMode() {
        return this.simulatedReturnSliderLaunchMode;
    }

    public final OptionStatisticsViewState copy(String accountNumber, BidAsk bidAsk, OptionSettings.DefaultPricingSetting defaultPricingSetting, UUID optionChainId, OptionStrategySecurity optionStrategySecurity, boolean shouldDefaultToSimulatedReturnTab, OptionsSimulatedReturnLoggingState simulatedReturnLoggingState, OptionsSimulatedReturnChartDataState2 simulatedReturnChartLaunchMode, OptionsSimulatedReturnSliderLaunchMode simulatedReturnSliderLaunchMode, String strategyCode, String title, ImmutableList<DetailPageFundamentalsDataCell> stats, ImmutableList<DetailPageFundamentalsDataCell> greeks, OptionWatchlistItemState watchlistItemState, ImmutableList<OptionStatisticsUnderlyingRowState> underlyings, String untradableInfoBannerMessage, String primaryButtonText, String secondaryButtonText, OptionChainSettingsPnlChartType pnlChartType, OptionOrderBundle optionOrderBundleForChart, boolean showSimulatedReturnSegment, boolean isPreTradeStatNuxDotShown) {
        Intrinsics.checkNotNullParameter(bidAsk, "bidAsk");
        Intrinsics.checkNotNullParameter(defaultPricingSetting, "defaultPricingSetting");
        Intrinsics.checkNotNullParameter(optionChainId, "optionChainId");
        Intrinsics.checkNotNullParameter(simulatedReturnChartLaunchMode, "simulatedReturnChartLaunchMode");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(stats, "stats");
        Intrinsics.checkNotNullParameter(greeks, "greeks");
        Intrinsics.checkNotNullParameter(watchlistItemState, "watchlistItemState");
        Intrinsics.checkNotNullParameter(underlyings, "underlyings");
        return new OptionStatisticsViewState(accountNumber, bidAsk, defaultPricingSetting, optionChainId, optionStrategySecurity, shouldDefaultToSimulatedReturnTab, simulatedReturnLoggingState, simulatedReturnChartLaunchMode, simulatedReturnSliderLaunchMode, strategyCode, title, stats, greeks, watchlistItemState, underlyings, untradableInfoBannerMessage, primaryButtonText, secondaryButtonText, pnlChartType, optionOrderBundleForChart, showSimulatedReturnSegment, isPreTradeStatNuxDotShown);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionStatisticsViewState)) {
            return false;
        }
        OptionStatisticsViewState optionStatisticsViewState = (OptionStatisticsViewState) other;
        return Intrinsics.areEqual(this.accountNumber, optionStatisticsViewState.accountNumber) && Intrinsics.areEqual(this.bidAsk, optionStatisticsViewState.bidAsk) && this.defaultPricingSetting == optionStatisticsViewState.defaultPricingSetting && Intrinsics.areEqual(this.optionChainId, optionStatisticsViewState.optionChainId) && Intrinsics.areEqual(this.optionStrategySecurity, optionStatisticsViewState.optionStrategySecurity) && this.shouldDefaultToSimulatedReturnTab == optionStatisticsViewState.shouldDefaultToSimulatedReturnTab && Intrinsics.areEqual(this.simulatedReturnLoggingState, optionStatisticsViewState.simulatedReturnLoggingState) && Intrinsics.areEqual(this.simulatedReturnChartLaunchMode, optionStatisticsViewState.simulatedReturnChartLaunchMode) && Intrinsics.areEqual(this.simulatedReturnSliderLaunchMode, optionStatisticsViewState.simulatedReturnSliderLaunchMode) && Intrinsics.areEqual(this.strategyCode, optionStatisticsViewState.strategyCode) && Intrinsics.areEqual(this.title, optionStatisticsViewState.title) && Intrinsics.areEqual(this.stats, optionStatisticsViewState.stats) && Intrinsics.areEqual(this.greeks, optionStatisticsViewState.greeks) && this.watchlistItemState == optionStatisticsViewState.watchlistItemState && Intrinsics.areEqual(this.underlyings, optionStatisticsViewState.underlyings) && Intrinsics.areEqual(this.untradableInfoBannerMessage, optionStatisticsViewState.untradableInfoBannerMessage) && Intrinsics.areEqual(this.primaryButtonText, optionStatisticsViewState.primaryButtonText) && Intrinsics.areEqual(this.secondaryButtonText, optionStatisticsViewState.secondaryButtonText) && this.pnlChartType == optionStatisticsViewState.pnlChartType && Intrinsics.areEqual(this.optionOrderBundleForChart, optionStatisticsViewState.optionOrderBundleForChart) && this.showSimulatedReturnSegment == optionStatisticsViewState.showSimulatedReturnSegment && this.isPreTradeStatNuxDotShown == optionStatisticsViewState.isPreTradeStatNuxDotShown;
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + this.bidAsk.hashCode()) * 31) + this.defaultPricingSetting.hashCode()) * 31) + this.optionChainId.hashCode()) * 31;
        OptionStrategySecurity optionStrategySecurity = this.optionStrategySecurity;
        int iHashCode2 = (((iHashCode + (optionStrategySecurity == null ? 0 : optionStrategySecurity.hashCode())) * 31) + Boolean.hashCode(this.shouldDefaultToSimulatedReturnTab)) * 31;
        OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState = this.simulatedReturnLoggingState;
        int iHashCode3 = (((iHashCode2 + (optionsSimulatedReturnLoggingState == null ? 0 : optionsSimulatedReturnLoggingState.hashCode())) * 31) + this.simulatedReturnChartLaunchMode.hashCode()) * 31;
        OptionsSimulatedReturnSliderLaunchMode optionsSimulatedReturnSliderLaunchMode = this.simulatedReturnSliderLaunchMode;
        int iHashCode4 = (iHashCode3 + (optionsSimulatedReturnSliderLaunchMode == null ? 0 : optionsSimulatedReturnSliderLaunchMode.hashCode())) * 31;
        String str2 = this.strategyCode;
        int iHashCode5 = (((((((((((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.title.hashCode()) * 31) + this.stats.hashCode()) * 31) + this.greeks.hashCode()) * 31) + this.watchlistItemState.hashCode()) * 31) + this.underlyings.hashCode()) * 31;
        String str3 = this.untradableInfoBannerMessage;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.primaryButtonText;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.secondaryButtonText;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        OptionChainSettingsPnlChartType optionChainSettingsPnlChartType = this.pnlChartType;
        int iHashCode9 = (iHashCode8 + (optionChainSettingsPnlChartType == null ? 0 : optionChainSettingsPnlChartType.hashCode())) * 31;
        OptionOrderBundle optionOrderBundle = this.optionOrderBundleForChart;
        return ((((iHashCode9 + (optionOrderBundle != null ? optionOrderBundle.hashCode() : 0)) * 31) + Boolean.hashCode(this.showSimulatedReturnSegment)) * 31) + Boolean.hashCode(this.isPreTradeStatNuxDotShown);
    }

    public String toString() {
        return "OptionStatisticsViewState(accountNumber=" + this.accountNumber + ", bidAsk=" + this.bidAsk + ", defaultPricingSetting=" + this.defaultPricingSetting + ", optionChainId=" + this.optionChainId + ", optionStrategySecurity=" + this.optionStrategySecurity + ", shouldDefaultToSimulatedReturnTab=" + this.shouldDefaultToSimulatedReturnTab + ", simulatedReturnLoggingState=" + this.simulatedReturnLoggingState + ", simulatedReturnChartLaunchMode=" + this.simulatedReturnChartLaunchMode + ", simulatedReturnSliderLaunchMode=" + this.simulatedReturnSliderLaunchMode + ", strategyCode=" + this.strategyCode + ", title=" + this.title + ", stats=" + this.stats + ", greeks=" + this.greeks + ", watchlistItemState=" + this.watchlistItemState + ", underlyings=" + this.underlyings + ", untradableInfoBannerMessage=" + this.untradableInfoBannerMessage + ", primaryButtonText=" + this.primaryButtonText + ", secondaryButtonText=" + this.secondaryButtonText + ", pnlChartType=" + this.pnlChartType + ", optionOrderBundleForChart=" + this.optionOrderBundleForChart + ", showSimulatedReturnSegment=" + this.showSimulatedReturnSegment + ", isPreTradeStatNuxDotShown=" + this.isPreTradeStatNuxDotShown + ")";
    }

    public OptionStatisticsViewState(String str, BidAsk bidAsk, OptionSettings.DefaultPricingSetting defaultPricingSetting, UUID optionChainId, OptionStrategySecurity optionStrategySecurity, boolean z, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, OptionsSimulatedReturnChartDataState2 simulatedReturnChartLaunchMode, OptionsSimulatedReturnSliderLaunchMode optionsSimulatedReturnSliderLaunchMode, String str2, String title, ImmutableList<DetailPageFundamentalsDataCell> stats, ImmutableList<DetailPageFundamentalsDataCell> greeks, OptionWatchlistItemState watchlistItemState, ImmutableList<OptionStatisticsUnderlyingRowState> underlyings, String str3, String str4, String str5, OptionChainSettingsPnlChartType optionChainSettingsPnlChartType, OptionOrderBundle optionOrderBundle, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(bidAsk, "bidAsk");
        Intrinsics.checkNotNullParameter(defaultPricingSetting, "defaultPricingSetting");
        Intrinsics.checkNotNullParameter(optionChainId, "optionChainId");
        Intrinsics.checkNotNullParameter(simulatedReturnChartLaunchMode, "simulatedReturnChartLaunchMode");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(stats, "stats");
        Intrinsics.checkNotNullParameter(greeks, "greeks");
        Intrinsics.checkNotNullParameter(watchlistItemState, "watchlistItemState");
        Intrinsics.checkNotNullParameter(underlyings, "underlyings");
        this.accountNumber = str;
        this.bidAsk = bidAsk;
        this.defaultPricingSetting = defaultPricingSetting;
        this.optionChainId = optionChainId;
        this.optionStrategySecurity = optionStrategySecurity;
        this.shouldDefaultToSimulatedReturnTab = z;
        this.simulatedReturnLoggingState = optionsSimulatedReturnLoggingState;
        this.simulatedReturnChartLaunchMode = simulatedReturnChartLaunchMode;
        this.simulatedReturnSliderLaunchMode = optionsSimulatedReturnSliderLaunchMode;
        this.strategyCode = str2;
        this.title = title;
        this.stats = stats;
        this.greeks = greeks;
        this.watchlistItemState = watchlistItemState;
        this.underlyings = underlyings;
        this.untradableInfoBannerMessage = str3;
        this.primaryButtonText = str4;
        this.secondaryButtonText = str5;
        this.pnlChartType = optionChainSettingsPnlChartType;
        this.optionOrderBundleForChart = optionOrderBundle;
        this.showSimulatedReturnSegment = z2;
        this.isPreTradeStatNuxDotShown = z3;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final BidAsk getBidAsk() {
        return this.bidAsk;
    }

    public final OptionSettings.DefaultPricingSetting getDefaultPricingSetting() {
        return this.defaultPricingSetting;
    }

    public final UUID getOptionChainId() {
        return this.optionChainId;
    }

    public final OptionStrategySecurity getOptionStrategySecurity() {
        return this.optionStrategySecurity;
    }

    public final boolean getShouldDefaultToSimulatedReturnTab() {
        return this.shouldDefaultToSimulatedReturnTab;
    }

    public final OptionsSimulatedReturnLoggingState getSimulatedReturnLoggingState() {
        return this.simulatedReturnLoggingState;
    }

    public final OptionsSimulatedReturnChartDataState2 getSimulatedReturnChartLaunchMode() {
        return this.simulatedReturnChartLaunchMode;
    }

    public final OptionsSimulatedReturnSliderLaunchMode getSimulatedReturnSliderLaunchMode() {
        return this.simulatedReturnSliderLaunchMode;
    }

    public final String getStrategyCode() {
        return this.strategyCode;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ImmutableList<DetailPageFundamentalsDataCell> getStats() {
        return this.stats;
    }

    public final ImmutableList<DetailPageFundamentalsDataCell> getGreeks() {
        return this.greeks;
    }

    public final OptionWatchlistItemState getWatchlistItemState() {
        return this.watchlistItemState;
    }

    public final ImmutableList<OptionStatisticsUnderlyingRowState> getUnderlyings() {
        return this.underlyings;
    }

    public final String getUntradableInfoBannerMessage() {
        return this.untradableInfoBannerMessage;
    }

    public final String getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    public final String getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    public final OptionChainSettingsPnlChartType getPnlChartType() {
        return this.pnlChartType;
    }

    public final OptionOrderBundle getOptionOrderBundleForChart() {
        return this.optionOrderBundleForChart;
    }

    public final boolean getShowSimulatedReturnSegment() {
        return this.showSimulatedReturnSegment;
    }

    public final boolean isPreTradeStatNuxDotShown() {
        return this.isPreTradeStatNuxDotShown;
    }
}
