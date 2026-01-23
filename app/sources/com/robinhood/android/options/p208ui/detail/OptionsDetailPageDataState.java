package com.robinhood.android.options.p208ui.detail;

import com.robinhood.android.charts.models.p080db.OptionHistoricalChartModel;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.indexes.models.p159db.IndexCloseValue;
import com.robinhood.android.indexes.models.p159db.IndexHistoricals;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.options.combo.p207ui.UiComboOrder;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.ApiOptionStrategyBreakeven3;
import com.robinhood.models.api.ApiOptionTodayTotalReturnResponse2;
import com.robinhood.models.api.ApiOptionTodayTotalReturnResponse3;
import com.robinhood.models.api.accountswitcher.OptionsAccountSwitcherId;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AggregateOptionStrategyQuote;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.LateCloseAnnouncementCardFlag;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionInstrumentPosition;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OptionStrategyInfo;
import com.robinhood.models.p320db.OptionUnderlier;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.accountswitcher.OptionsAccountSwitcher;
import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionEvent;
import com.robinhood.models.p355ui.UiOptionInstrumentPosition;
import com.robinhood.models.p355ui.UiOptionOrder;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.models.p355ui.UiOptionUnderlier;
import com.robinhood.models.p355ui.UiQuoteHistorical;
import com.robinhood.models.p355ui.UnderlyingQuote;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.prefs.BooleanPreference;
import com.singular.sdk.internal.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsDetailPageDataState.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001:\u0001vB£\u0002\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010!\u001a\u00020\"\u0012\b\b\u0002\u0010#\u001a\u00020\u000b\u0012\b\b\u0002\u0010$\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0&¢\u0006\u0004\b(\u0010)J\u0013\u0010O\u001a\u0004\u0018\u00010'2\u0006\u0010P\u001a\u00020\u0006H\u0086\u0002J'\u0010Q\u001a\u00020\u00002\u0006\u0010R\u001a\u00020\u00062\u0017\u0010S\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020'0T¢\u0006\u0002\bUJ\u000e\u0010V\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010X\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010-J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010Z\u001a\u00020\tHÆ\u0003J\t\u0010[\u001a\u00020\u000bHÆ\u0003J\t\u0010\\\u001a\u00020\u000bHÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010`\u001a\u00020\u000bHÆ\u0003J\t\u0010a\u001a\u00020\u000bHÆ\u0003J\t\u0010b\u001a\u00020\u000bHÆ\u0003J\u000f\u0010c\u001a\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0006HÆ\u0003J\t\u0010e\u001a\u00020\u000bHÆ\u0003J\t\u0010f\u001a\u00020\u000bHÆ\u0003J\t\u0010g\u001a\u00020\u000bHÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\t\u0010i\u001a\u00020\u000bHÆ\u0003J\t\u0010j\u001a\u00020\u000bHÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010 HÆ\u0003J\t\u0010l\u001a\u00020\"HÆ\u0003J\t\u0010m\u001a\u00020\u000bHÆ\u0003J\t\u0010n\u001a\u00020\u000bHÆ\u0003J\u0011\u0010o\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0&HÂ\u0003Jª\u0002\u0010p\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\u0010\b\u0002\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0&HÆ\u0001¢\u0006\u0002\u0010qJ\u0013\u0010r\u001a\u00020\u000b2\b\u0010s\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010t\u001a\u00020\u0006HÖ\u0001J\t\u0010u\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u00103R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u00103R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u0013\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b:\u00103R\u0011\u0010\u0014\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b;\u00103R\u0011\u0010\u0015\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b<\u00103R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010+R\u0011\u0010\u0017\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u0018\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b@\u00103R\u0011\u0010\u0019\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bA\u00103R\u0011\u0010\u001a\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bB\u00103R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010\u001d\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u00103R\u0011\u0010\u001e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bE\u00103R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0011\u0010#\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bJ\u00103R\u0011\u0010$\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u00103R\u0016\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0&X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010K\u001a\u00020L¢\u0006\b\n\u0000\u001a\u0004\bM\u0010N¨\u0006w"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;", "", "allAccounts", "", "Lcom/robinhood/models/db/Account;", "currentIndex", "", "currentAccount", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "", "isDay", "", "isLegContext", "marketHours", "Lcom/robinhood/models/db/MarketHours;", "optionSettings", "Lcom/robinhood/models/db/OptionSettings;", "simulatedReturnTooltipState", "Lcom/robinhood/android/options/ui/detail/OptionsSimulatedReturnTooltipState;", "showCandlestickChart", "showAllHoursChart", "showDataCellTooltipRetirementPref", "strategyCodeList", "tradebarHeight", "upsellDismissed", "inProfitAndLossAverageCostRetirementExperiment", "inBidAskSdpStatsExperiment", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "isInPipExperiment", "inIndexOptionsCurbHoursExperiment", "indexOptionsCurbHoursTooltipPref", "Lcom/robinhood/prefs/BooleanPreference;", "multiLegGreekExperimentVariant", "Lcom/robinhood/android/optionsexperiment/Experiments$OptionsMultiLegGreek$Variant;", "inPortfolioRiskAnalyzerExperiment", "isInMcwRegionGate", "pageDataList", "", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState$PageData;", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Lcom/robinhood/models/db/Account;Ljava/lang/String;ZZLcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/db/OptionSettings;Lcom/robinhood/android/options/ui/detail/OptionsSimulatedReturnTooltipState;ZZZLjava/util/List;IZZZLcom/robinhood/iso/countrycode/CountryCode$Supported;ZZLcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/optionsexperiment/Experiments$OptionsMultiLegGreek$Variant;ZZLjava/util/List;)V", "getAllAccounts", "()Ljava/util/List;", "getCurrentIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCurrentAccount", "()Lcom/robinhood/models/db/Account;", "getDisclosure", "()Ljava/lang/String;", "()Z", "getMarketHours", "()Lcom/robinhood/models/db/MarketHours;", "getOptionSettings", "()Lcom/robinhood/models/db/OptionSettings;", "getSimulatedReturnTooltipState", "()Lcom/robinhood/android/options/ui/detail/OptionsSimulatedReturnTooltipState;", "getShowCandlestickChart", "getShowAllHoursChart", "getShowDataCellTooltipRetirementPref", "getStrategyCodeList", "getTradebarHeight", "()I", "getUpsellDismissed", "getInProfitAndLossAverageCostRetirementExperiment", "getInBidAskSdpStatsExperiment", "getLocality", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getInIndexOptionsCurbHoursExperiment", "getIndexOptionsCurbHoursTooltipPref", "()Lcom/robinhood/prefs/BooleanPreference;", "getMultiLegGreekExperimentVariant", "()Lcom/robinhood/android/optionsexperiment/Experiments$OptionsMultiLegGreek$Variant;", "getInPortfolioRiskAnalyzerExperiment", "pnlDataState", "Lcom/robinhood/android/options/ui/detail/PnlDataState;", "getPnlDataState", "()Lcom/robinhood/android/options/ui/detail/PnlDataState;", "get", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "copyTo", Constants.RequestParamsKeys.PACKAGE_NAME_KEY, "pageDataCopy", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "recycle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "copy", "(Ljava/util/List;Ljava/lang/Integer;Lcom/robinhood/models/db/Account;Ljava/lang/String;ZZLcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/db/OptionSettings;Lcom/robinhood/android/options/ui/detail/OptionsSimulatedReturnTooltipState;ZZZLjava/util/List;IZZZLcom/robinhood/iso/countrycode/CountryCode$Supported;ZZLcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/optionsexperiment/Experiments$OptionsMultiLegGreek$Variant;ZZLjava/util/List;)Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;", "equals", "other", "hashCode", "toString", "PageData", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class OptionsDetailPageDataState {
    public static final int $stable = 8;
    private final List<Account> allAccounts;
    private final Account currentAccount;
    private final Integer currentIndex;
    private final String disclosure;
    private final boolean inBidAskSdpStatsExperiment;
    private final boolean inIndexOptionsCurbHoursExperiment;
    private final boolean inPortfolioRiskAnalyzerExperiment;
    private final boolean inProfitAndLossAverageCostRetirementExperiment;
    private final BooleanPreference indexOptionsCurbHoursTooltipPref;
    private final boolean isDay;
    private final boolean isInMcwRegionGate;
    private final boolean isInPipExperiment;
    private final boolean isLegContext;
    private final CountryCode.Supported locality;
    private final MarketHours marketHours;
    private final Experiments.OptionsMultiLegGreek.Variant multiLegGreekExperimentVariant;
    private final OptionSettings optionSettings;
    private final List<PageData> pageDataList;
    private final OptionsDetailPagePnlDataState2 pnlDataState;
    private final boolean showAllHoursChart;
    private final boolean showCandlestickChart;
    private final boolean showDataCellTooltipRetirementPref;
    private final OptionsSimulatedReturnTooltipState simulatedReturnTooltipState;
    private final List<String> strategyCodeList;
    private final int tradebarHeight;
    private final boolean upsellDismissed;

    public OptionsDetailPageDataState() {
        this(null, null, null, null, false, false, null, null, null, false, false, false, null, 0, false, false, false, null, false, false, null, null, false, false, null, 33554431, null);
    }

    private final List<PageData> component25() {
        return this.pageDataList;
    }

    public static /* synthetic */ OptionsDetailPageDataState copy$default(OptionsDetailPageDataState optionsDetailPageDataState, List list, Integer num, Account account, String str, boolean z, boolean z2, MarketHours marketHours, OptionSettings optionSettings, OptionsSimulatedReturnTooltipState optionsSimulatedReturnTooltipState, boolean z3, boolean z4, boolean z5, List list2, int i, boolean z6, boolean z7, boolean z8, CountryCode.Supported supported, boolean z9, boolean z10, BooleanPreference booleanPreference, Experiments.OptionsMultiLegGreek.Variant variant, boolean z11, boolean z12, List list3, int i2, Object obj) {
        List list4;
        boolean z13;
        List list5 = (i2 & 1) != 0 ? optionsDetailPageDataState.allAccounts : list;
        Integer num2 = (i2 & 2) != 0 ? optionsDetailPageDataState.currentIndex : num;
        Account account2 = (i2 & 4) != 0 ? optionsDetailPageDataState.currentAccount : account;
        String str2 = (i2 & 8) != 0 ? optionsDetailPageDataState.disclosure : str;
        boolean z14 = (i2 & 16) != 0 ? optionsDetailPageDataState.isDay : z;
        boolean z15 = (i2 & 32) != 0 ? optionsDetailPageDataState.isLegContext : z2;
        MarketHours marketHours2 = (i2 & 64) != 0 ? optionsDetailPageDataState.marketHours : marketHours;
        OptionSettings optionSettings2 = (i2 & 128) != 0 ? optionsDetailPageDataState.optionSettings : optionSettings;
        OptionsSimulatedReturnTooltipState optionsSimulatedReturnTooltipState2 = (i2 & 256) != 0 ? optionsDetailPageDataState.simulatedReturnTooltipState : optionsSimulatedReturnTooltipState;
        boolean z16 = (i2 & 512) != 0 ? optionsDetailPageDataState.showCandlestickChart : z3;
        boolean z17 = (i2 & 1024) != 0 ? optionsDetailPageDataState.showAllHoursChart : z4;
        boolean z18 = (i2 & 2048) != 0 ? optionsDetailPageDataState.showDataCellTooltipRetirementPref : z5;
        List list6 = (i2 & 4096) != 0 ? optionsDetailPageDataState.strategyCodeList : list2;
        int i3 = (i2 & 8192) != 0 ? optionsDetailPageDataState.tradebarHeight : i;
        List list7 = list5;
        boolean z19 = (i2 & 16384) != 0 ? optionsDetailPageDataState.upsellDismissed : z6;
        boolean z20 = (i2 & 32768) != 0 ? optionsDetailPageDataState.inProfitAndLossAverageCostRetirementExperiment : z7;
        boolean z21 = (i2 & 65536) != 0 ? optionsDetailPageDataState.inBidAskSdpStatsExperiment : z8;
        CountryCode.Supported supported2 = (i2 & 131072) != 0 ? optionsDetailPageDataState.locality : supported;
        boolean z22 = (i2 & 262144) != 0 ? optionsDetailPageDataState.isInPipExperiment : z9;
        boolean z23 = (i2 & 524288) != 0 ? optionsDetailPageDataState.inIndexOptionsCurbHoursExperiment : z10;
        BooleanPreference booleanPreference2 = (i2 & 1048576) != 0 ? optionsDetailPageDataState.indexOptionsCurbHoursTooltipPref : booleanPreference;
        Experiments.OptionsMultiLegGreek.Variant variant2 = (i2 & 2097152) != 0 ? optionsDetailPageDataState.multiLegGreekExperimentVariant : variant;
        boolean z24 = (i2 & 4194304) != 0 ? optionsDetailPageDataState.inPortfolioRiskAnalyzerExperiment : z11;
        boolean z25 = (i2 & 8388608) != 0 ? optionsDetailPageDataState.isInMcwRegionGate : z12;
        if ((i2 & 16777216) != 0) {
            z13 = z25;
            list4 = optionsDetailPageDataState.pageDataList;
        } else {
            list4 = list3;
            z13 = z25;
        }
        return optionsDetailPageDataState.copy(list7, num2, account2, str2, z14, z15, marketHours2, optionSettings2, optionsSimulatedReturnTooltipState2, z16, z17, z18, list6, i3, z19, z20, z21, supported2, z22, z23, booleanPreference2, variant2, z24, z13, list4);
    }

    public final List<Account> component1() {
        return this.allAccounts;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShowCandlestickChart() {
        return this.showCandlestickChart;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getShowAllHoursChart() {
        return this.showAllHoursChart;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getShowDataCellTooltipRetirementPref() {
        return this.showDataCellTooltipRetirementPref;
    }

    public final List<String> component13() {
        return this.strategyCodeList;
    }

    /* renamed from: component14, reason: from getter */
    public final int getTradebarHeight() {
        return this.tradebarHeight;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getUpsellDismissed() {
        return this.upsellDismissed;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getInProfitAndLossAverageCostRetirementExperiment() {
        return this.inProfitAndLossAverageCostRetirementExperiment;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getInBidAskSdpStatsExperiment() {
        return this.inBidAskSdpStatsExperiment;
    }

    /* renamed from: component18, reason: from getter */
    public final CountryCode.Supported getLocality() {
        return this.locality;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getIsInPipExperiment() {
        return this.isInPipExperiment;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getCurrentIndex() {
        return this.currentIndex;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getInIndexOptionsCurbHoursExperiment() {
        return this.inIndexOptionsCurbHoursExperiment;
    }

    /* renamed from: component21, reason: from getter */
    public final BooleanPreference getIndexOptionsCurbHoursTooltipPref() {
        return this.indexOptionsCurbHoursTooltipPref;
    }

    /* renamed from: component22, reason: from getter */
    public final Experiments.OptionsMultiLegGreek.Variant getMultiLegGreekExperimentVariant() {
        return this.multiLegGreekExperimentVariant;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getInPortfolioRiskAnalyzerExperiment() {
        return this.inPortfolioRiskAnalyzerExperiment;
    }

    /* renamed from: component24, reason: from getter */
    public final boolean getIsInMcwRegionGate() {
        return this.isInMcwRegionGate;
    }

    /* renamed from: component3, reason: from getter */
    public final Account getCurrentAccount() {
        return this.currentAccount;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDisclosure() {
        return this.disclosure;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsDay() {
        return this.isDay;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLegContext() {
        return this.isLegContext;
    }

    /* renamed from: component7, reason: from getter */
    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    /* renamed from: component8, reason: from getter */
    public final OptionSettings getOptionSettings() {
        return this.optionSettings;
    }

    /* renamed from: component9, reason: from getter */
    public final OptionsSimulatedReturnTooltipState getSimulatedReturnTooltipState() {
        return this.simulatedReturnTooltipState;
    }

    public final OptionsDetailPageDataState copy(List<Account> allAccounts, Integer currentIndex, Account currentAccount, String disclosure, boolean isDay, boolean isLegContext, MarketHours marketHours, OptionSettings optionSettings, OptionsSimulatedReturnTooltipState simulatedReturnTooltipState, boolean showCandlestickChart, boolean showAllHoursChart, boolean showDataCellTooltipRetirementPref, List<String> strategyCodeList, int tradebarHeight, boolean upsellDismissed, boolean inProfitAndLossAverageCostRetirementExperiment, boolean inBidAskSdpStatsExperiment, CountryCode.Supported locality, boolean isInPipExperiment, boolean inIndexOptionsCurbHoursExperiment, BooleanPreference indexOptionsCurbHoursTooltipPref, Experiments.OptionsMultiLegGreek.Variant multiLegGreekExperimentVariant, boolean inPortfolioRiskAnalyzerExperiment, boolean isInMcwRegionGate, List<PageData> pageDataList) {
        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(strategyCodeList, "strategyCodeList");
        Intrinsics.checkNotNullParameter(multiLegGreekExperimentVariant, "multiLegGreekExperimentVariant");
        Intrinsics.checkNotNullParameter(pageDataList, "pageDataList");
        return new OptionsDetailPageDataState(allAccounts, currentIndex, currentAccount, disclosure, isDay, isLegContext, marketHours, optionSettings, simulatedReturnTooltipState, showCandlestickChart, showAllHoursChart, showDataCellTooltipRetirementPref, strategyCodeList, tradebarHeight, upsellDismissed, inProfitAndLossAverageCostRetirementExperiment, inBidAskSdpStatsExperiment, locality, isInPipExperiment, inIndexOptionsCurbHoursExperiment, indexOptionsCurbHoursTooltipPref, multiLegGreekExperimentVariant, inPortfolioRiskAnalyzerExperiment, isInMcwRegionGate, pageDataList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsDetailPageDataState)) {
            return false;
        }
        OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) other;
        return Intrinsics.areEqual(this.allAccounts, optionsDetailPageDataState.allAccounts) && Intrinsics.areEqual(this.currentIndex, optionsDetailPageDataState.currentIndex) && Intrinsics.areEqual(this.currentAccount, optionsDetailPageDataState.currentAccount) && Intrinsics.areEqual(this.disclosure, optionsDetailPageDataState.disclosure) && this.isDay == optionsDetailPageDataState.isDay && this.isLegContext == optionsDetailPageDataState.isLegContext && Intrinsics.areEqual(this.marketHours, optionsDetailPageDataState.marketHours) && Intrinsics.areEqual(this.optionSettings, optionsDetailPageDataState.optionSettings) && Intrinsics.areEqual(this.simulatedReturnTooltipState, optionsDetailPageDataState.simulatedReturnTooltipState) && this.showCandlestickChart == optionsDetailPageDataState.showCandlestickChart && this.showAllHoursChart == optionsDetailPageDataState.showAllHoursChart && this.showDataCellTooltipRetirementPref == optionsDetailPageDataState.showDataCellTooltipRetirementPref && Intrinsics.areEqual(this.strategyCodeList, optionsDetailPageDataState.strategyCodeList) && this.tradebarHeight == optionsDetailPageDataState.tradebarHeight && this.upsellDismissed == optionsDetailPageDataState.upsellDismissed && this.inProfitAndLossAverageCostRetirementExperiment == optionsDetailPageDataState.inProfitAndLossAverageCostRetirementExperiment && this.inBidAskSdpStatsExperiment == optionsDetailPageDataState.inBidAskSdpStatsExperiment && Intrinsics.areEqual(this.locality, optionsDetailPageDataState.locality) && this.isInPipExperiment == optionsDetailPageDataState.isInPipExperiment && this.inIndexOptionsCurbHoursExperiment == optionsDetailPageDataState.inIndexOptionsCurbHoursExperiment && Intrinsics.areEqual(this.indexOptionsCurbHoursTooltipPref, optionsDetailPageDataState.indexOptionsCurbHoursTooltipPref) && this.multiLegGreekExperimentVariant == optionsDetailPageDataState.multiLegGreekExperimentVariant && this.inPortfolioRiskAnalyzerExperiment == optionsDetailPageDataState.inPortfolioRiskAnalyzerExperiment && this.isInMcwRegionGate == optionsDetailPageDataState.isInMcwRegionGate && Intrinsics.areEqual(this.pageDataList, optionsDetailPageDataState.pageDataList);
    }

    public int hashCode() {
        int iHashCode = this.allAccounts.hashCode() * 31;
        Integer num = this.currentIndex;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Account account = this.currentAccount;
        int iHashCode3 = (((((((iHashCode2 + (account == null ? 0 : account.hashCode())) * 31) + this.disclosure.hashCode()) * 31) + Boolean.hashCode(this.isDay)) * 31) + Boolean.hashCode(this.isLegContext)) * 31;
        MarketHours marketHours = this.marketHours;
        int iHashCode4 = (iHashCode3 + (marketHours == null ? 0 : marketHours.hashCode())) * 31;
        OptionSettings optionSettings = this.optionSettings;
        int iHashCode5 = (iHashCode4 + (optionSettings == null ? 0 : optionSettings.hashCode())) * 31;
        OptionsSimulatedReturnTooltipState optionsSimulatedReturnTooltipState = this.simulatedReturnTooltipState;
        int iHashCode6 = (((((((((((((((((iHashCode5 + (optionsSimulatedReturnTooltipState == null ? 0 : optionsSimulatedReturnTooltipState.hashCode())) * 31) + Boolean.hashCode(this.showCandlestickChart)) * 31) + Boolean.hashCode(this.showAllHoursChart)) * 31) + Boolean.hashCode(this.showDataCellTooltipRetirementPref)) * 31) + this.strategyCodeList.hashCode()) * 31) + Integer.hashCode(this.tradebarHeight)) * 31) + Boolean.hashCode(this.upsellDismissed)) * 31) + Boolean.hashCode(this.inProfitAndLossAverageCostRetirementExperiment)) * 31) + Boolean.hashCode(this.inBidAskSdpStatsExperiment)) * 31;
        CountryCode.Supported supported = this.locality;
        int iHashCode7 = (((((iHashCode6 + (supported == null ? 0 : supported.hashCode())) * 31) + Boolean.hashCode(this.isInPipExperiment)) * 31) + Boolean.hashCode(this.inIndexOptionsCurbHoursExperiment)) * 31;
        BooleanPreference booleanPreference = this.indexOptionsCurbHoursTooltipPref;
        return ((((((((iHashCode7 + (booleanPreference != null ? booleanPreference.hashCode() : 0)) * 31) + this.multiLegGreekExperimentVariant.hashCode()) * 31) + Boolean.hashCode(this.inPortfolioRiskAnalyzerExperiment)) * 31) + Boolean.hashCode(this.isInMcwRegionGate)) * 31) + this.pageDataList.hashCode();
    }

    public String toString() {
        return "OptionsDetailPageDataState(allAccounts=" + this.allAccounts + ", currentIndex=" + this.currentIndex + ", currentAccount=" + this.currentAccount + ", disclosure=" + this.disclosure + ", isDay=" + this.isDay + ", isLegContext=" + this.isLegContext + ", marketHours=" + this.marketHours + ", optionSettings=" + this.optionSettings + ", simulatedReturnTooltipState=" + this.simulatedReturnTooltipState + ", showCandlestickChart=" + this.showCandlestickChart + ", showAllHoursChart=" + this.showAllHoursChart + ", showDataCellTooltipRetirementPref=" + this.showDataCellTooltipRetirementPref + ", strategyCodeList=" + this.strategyCodeList + ", tradebarHeight=" + this.tradebarHeight + ", upsellDismissed=" + this.upsellDismissed + ", inProfitAndLossAverageCostRetirementExperiment=" + this.inProfitAndLossAverageCostRetirementExperiment + ", inBidAskSdpStatsExperiment=" + this.inBidAskSdpStatsExperiment + ", locality=" + this.locality + ", isInPipExperiment=" + this.isInPipExperiment + ", inIndexOptionsCurbHoursExperiment=" + this.inIndexOptionsCurbHoursExperiment + ", indexOptionsCurbHoursTooltipPref=" + this.indexOptionsCurbHoursTooltipPref + ", multiLegGreekExperimentVariant=" + this.multiLegGreekExperimentVariant + ", inPortfolioRiskAnalyzerExperiment=" + this.inPortfolioRiskAnalyzerExperiment + ", isInMcwRegionGate=" + this.isInMcwRegionGate + ", pageDataList=" + this.pageDataList + ")";
    }

    public OptionsDetailPageDataState(List<Account> allAccounts, Integer num, Account account, String disclosure, boolean z, boolean z2, MarketHours marketHours, OptionSettings optionSettings, OptionsSimulatedReturnTooltipState optionsSimulatedReturnTooltipState, boolean z3, boolean z4, boolean z5, List<String> strategyCodeList, int i, boolean z6, boolean z7, boolean z8, CountryCode.Supported supported, boolean z9, boolean z10, BooleanPreference booleanPreference, Experiments.OptionsMultiLegGreek.Variant multiLegGreekExperimentVariant, boolean z11, boolean z12, List<PageData> pageDataList) {
        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(strategyCodeList, "strategyCodeList");
        Intrinsics.checkNotNullParameter(multiLegGreekExperimentVariant, "multiLegGreekExperimentVariant");
        Intrinsics.checkNotNullParameter(pageDataList, "pageDataList");
        this.allAccounts = allAccounts;
        this.currentIndex = num;
        this.currentAccount = account;
        this.disclosure = disclosure;
        this.isDay = z;
        this.isLegContext = z2;
        this.marketHours = marketHours;
        this.optionSettings = optionSettings;
        this.simulatedReturnTooltipState = optionsSimulatedReturnTooltipState;
        this.showCandlestickChart = z3;
        this.showAllHoursChart = z4;
        this.showDataCellTooltipRetirementPref = z5;
        this.strategyCodeList = strategyCodeList;
        this.tradebarHeight = i;
        this.upsellDismissed = z6;
        this.inProfitAndLossAverageCostRetirementExperiment = z7;
        this.inBidAskSdpStatsExperiment = z8;
        this.locality = supported;
        this.isInPipExperiment = z9;
        this.inIndexOptionsCurbHoursExperiment = z10;
        this.indexOptionsCurbHoursTooltipPref = booleanPreference;
        this.multiLegGreekExperimentVariant = multiLegGreekExperimentVariant;
        this.inPortfolioRiskAnalyzerExperiment = z11;
        this.isInMcwRegionGate = z12;
        this.pageDataList = pageDataList;
        this.pnlDataState = OptionsDetailPagePnlDataState.getPnlDataState(account, z7);
    }

    public /* synthetic */ OptionsDetailPageDataState(List list, Integer num, Account account, String str, boolean z, boolean z2, MarketHours marketHours, OptionSettings optionSettings, OptionsSimulatedReturnTooltipState optionsSimulatedReturnTooltipState, boolean z3, boolean z4, boolean z5, List list2, int i, boolean z6, boolean z7, boolean z8, CountryCode.Supported supported, boolean z9, boolean z10, BooleanPreference booleanPreference, Experiments.OptionsMultiLegGreek.Variant variant, boolean z11, boolean z12, List list3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CollectionsKt.emptyList() : list, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : account, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? true : z, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? null : marketHours, (i2 & 128) != 0 ? null : optionSettings, (i2 & 256) != 0 ? null : optionsSimulatedReturnTooltipState, (i2 & 512) != 0 ? false : z3, (i2 & 1024) == 0 ? z4 : true, (i2 & 2048) != 0 ? false : z5, (i2 & 4096) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 8192) != 0 ? 0 : i, (i2 & 16384) != 0 ? false : z6, (i2 & 32768) != 0 ? false : z7, (i2 & 65536) != 0 ? false : z8, (i2 & 131072) != 0 ? null : supported, (i2 & 262144) != 0 ? false : z9, (i2 & 524288) != 0 ? false : z10, (i2 & 1048576) != 0 ? null : booleanPreference, (i2 & 2097152) != 0 ? Experiments.OptionsMultiLegGreek.Variant.CONTROL : variant, (i2 & 4194304) != 0 ? false : z11, (i2 & 8388608) != 0 ? false : z12, (i2 & 16777216) != 0 ? new ArrayList() : list3);
    }

    public final List<Account> getAllAccounts() {
        return this.allAccounts;
    }

    public final Integer getCurrentIndex() {
        return this.currentIndex;
    }

    public final Account getCurrentAccount() {
        return this.currentAccount;
    }

    public final String getDisclosure() {
        return this.disclosure;
    }

    public final boolean isDay() {
        return this.isDay;
    }

    public final boolean isLegContext() {
        return this.isLegContext;
    }

    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    public final OptionSettings getOptionSettings() {
        return this.optionSettings;
    }

    public final OptionsSimulatedReturnTooltipState getSimulatedReturnTooltipState() {
        return this.simulatedReturnTooltipState;
    }

    public final boolean getShowCandlestickChart() {
        return this.showCandlestickChart;
    }

    public final boolean getShowAllHoursChart() {
        return this.showAllHoursChart;
    }

    public final boolean getShowDataCellTooltipRetirementPref() {
        return this.showDataCellTooltipRetirementPref;
    }

    public final List<String> getStrategyCodeList() {
        return this.strategyCodeList;
    }

    public final int getTradebarHeight() {
        return this.tradebarHeight;
    }

    public final boolean getUpsellDismissed() {
        return this.upsellDismissed;
    }

    public final boolean getInProfitAndLossAverageCostRetirementExperiment() {
        return this.inProfitAndLossAverageCostRetirementExperiment;
    }

    public final boolean getInBidAskSdpStatsExperiment() {
        return this.inBidAskSdpStatsExperiment;
    }

    public final CountryCode.Supported getLocality() {
        return this.locality;
    }

    public final boolean isInPipExperiment() {
        return this.isInPipExperiment;
    }

    public final boolean getInIndexOptionsCurbHoursExperiment() {
        return this.inIndexOptionsCurbHoursExperiment;
    }

    public final BooleanPreference getIndexOptionsCurbHoursTooltipPref() {
        return this.indexOptionsCurbHoursTooltipPref;
    }

    public final Experiments.OptionsMultiLegGreek.Variant getMultiLegGreekExperimentVariant() {
        return this.multiLegGreekExperimentVariant;
    }

    public final boolean getInPortfolioRiskAnalyzerExperiment() {
        return this.inPortfolioRiskAnalyzerExperiment;
    }

    public final boolean isInMcwRegionGate() {
        return this.isInMcwRegionGate;
    }

    /* compiled from: OptionsDetailPageDataState.kt */
    @Metadata(m3635d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b>\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010&\u001a\u00020\u0019\u0012\b\b\u0002\u0010'\u001a\u00020\u0019\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010*\u001a\u00020+\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000102\u0012\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u0002040/\u0012\u000e\b\u0002\u00105\u001a\b\u0012\u0004\u0012\u0002060/\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@¢\u0006\u0004\bA\u0010BJ\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0011\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010YJ\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0019HÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u0016\u0010 \u0001\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 HÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010$HÆ\u0003J\u0011\u0010¢\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010YJ\n\u0010£\u0001\u001a\u00020\u0019HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u0019HÆ\u0003J\f\u0010¥\u0001\u001a\u0004\u0018\u00010)HÆ\u0003J\n\u0010¦\u0001\u001a\u00020+HÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010-HÆ\u0003J\u0012\u0010¨\u0001\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/HÆ\u0003J\f\u0010©\u0001\u001a\u0004\u0018\u000102HÆ\u0003J\u0010\u0010ª\u0001\u001a\b\u0012\u0004\u0012\u0002040/HÆ\u0003J\u0010\u0010«\u0001\u001a\b\u0012\u0004\u0012\u0002060/HÆ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u000108HÆ\u0003J\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010:HÆ\u0003J\f\u0010®\u0001\u001a\u0004\u0018\u00010<HÆ\u0003J\f\u0010¯\u0001\u001a\u0004\u0018\u00010>HÆ\u0003J\f\u0010°\u0001\u001a\u0004\u0018\u00010@HÆ\u0003J \u0003\u0010±\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00192\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010&\u001a\u00020\u00192\b\b\u0002\u0010'\u001a\u00020\u00192\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010*\u001a\u00020+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/2\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u0002040/2\u000e\b\u0002\u00105\u001a\b\u0012\u0004\u0012\u0002060/2\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@HÆ\u0001¢\u0006\u0003\u0010²\u0001J\u0015\u0010³\u0001\u001a\u00020\u00192\t\u0010´\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010µ\u0001\u001a\u00030¶\u0001HÖ\u0001J\u000b\u0010·\u0001\u001a\u00030\u0086\u0001HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u0010Z\u001a\u0004\b\u0018\u0010YR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0011\u0010\u001c\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u001d\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 ¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0013\u0010#\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0015\u0010%\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u0010Z\u001a\u0004\be\u0010YR\u0011\u0010&\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bf\u0010^R\u0011\u0010'\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bg\u0010^R\u0013\u0010(\u001a\u0004\u0018\u00010)¢\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u0011\u0010*\u001a\u00020+¢\u0006\b\n\u0000\u001a\u0004\bj\u0010kR\u0013\u0010,\u001a\u0004\u0018\u00010-¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0019\u0010.\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u0013\u00101\u001a\u0004\u0018\u000102¢\u0006\b\n\u0000\u001a\u0004\bp\u0010qR\u0017\u00103\u001a\b\u0012\u0004\u0012\u0002040/¢\u0006\b\n\u0000\u001a\u0004\br\u0010oR\u0017\u00105\u001a\b\u0012\u0004\u0012\u0002060/¢\u0006\b\n\u0000\u001a\u0004\bs\u0010oR\u0013\u00107\u001a\u0004\u0018\u000108¢\u0006\b\n\u0000\u001a\u0004\bt\u0010uR\u0013\u00109\u001a\u0004\u0018\u00010:¢\u0006\b\n\u0000\u001a\u0004\bv\u0010wR\u0013\u0010;\u001a\u0004\u0018\u00010<¢\u0006\b\n\u0000\u001a\u0004\bx\u0010yR\u0013\u0010=\u001a\u0004\u0018\u00010>¢\u0006\b\n\u0000\u001a\u0004\bz\u0010{R\u0013\u0010?\u001a\u0004\u0018\u00010@¢\u0006\b\n\u0000\u001a\u0004\b|\u0010}R\u0015\u0010~\u001a\u0004\u0018\u00010\u007f¢\u0006\n\n\u0000\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0016\u0010\u0082\u0001\u001a\u0004\u0018\u00010!8F¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0017\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0086\u00018F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0017\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0013\u0010\u008d\u0001\u001a\u00020\u0019¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010^R\u0013\u0010\u008f\u0001\u001a\u00020\u0019¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010^¨\u0006¸\u0001"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState$PageData;", "", "activeDisplaySpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "aggregateOptionStrategyQuote", "Lcom/robinhood/models/db/AggregateOptionStrategyQuote;", "curatedListItem", "Lcom/robinhood/models/db/CuratedListItem;", "equityQuote", "Lcom/robinhood/models/db/Quote;", "equityUiQuoteHistorical", "Lcom/robinhood/models/ui/UiQuoteHistorical;", "historicalChart", "Lcom/robinhood/android/charts/models/db/OptionHistoricalChartModel;", "indexInstrument", "Lcom/robinhood/android/indexes/models/db/Index;", "indexCloseValue", "Lcom/robinhood/android/indexes/models/db/IndexCloseValue;", "indexHistoricals", "Lcom/robinhood/android/indexes/models/db/IndexHistoricals;", "indexValue", "Lcom/robinhood/android/indexes/models/db/IndexValue;", "infoBanner", "Lcom/robinhood/models/db/IacInfoBanner;", "isWatching", "", "lateCloseAnnouncementCardFlag", "Lcom/robinhood/models/db/LateCloseAnnouncementCardFlag;", "loadingAccountSwitcher", "oppositePositionFromWatchlist", "Lcom/robinhood/models/db/OptionInstrumentPosition;", "optionInstrumentIdToQuoteMap", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "optionsAccountSwitcher", "Lcom/robinhood/models/db/accountswitcher/OptionsAccountSwitcher;", "hasRealPosition", "showRollingActionItem", "shouldShowSimulatedReturns", "simulatedReturns", "Lcom/robinhood/models/api/ApiOptionTodayTotalReturnResponseLegacy;", "timestampTradeButtonTapped", "", "uiAggregatePositionIncludingZeroQuantity", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "uiOptionEvents", "", "Lcom/robinhood/models/ui/UiOptionEvent;", "uiOptionInstrumentPositionIncludingZeroQuantity", "Lcom/robinhood/models/ui/UiOptionInstrumentPosition;", "uiOptionOrders", "Lcom/robinhood/models/ui/UiOptionOrder;", "uiComboOrders", "Lcom/robinhood/android/options/combo/ui/UiComboOrder;", "uiOptionUnderlier", "Lcom/robinhood/models/ui/UiOptionUnderlier;", "uiStrategyInfo", "Lcom/robinhood/models/ui/UiOptionStrategyInfo;", "uiOptionChain", "Lcom/robinhood/models/ui/UiOptionChain;", "breakeven", "Lcom/robinhood/models/api/CommonApiOptionStrategyBreakevenResponse;", "todayTotalReturn", "Lcom/robinhood/models/api/CommonApiOptionTodayTotalReturnResponse;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Lcom/robinhood/models/db/AggregateOptionStrategyQuote;Lcom/robinhood/models/db/CuratedListItem;Lcom/robinhood/models/db/Quote;Lcom/robinhood/models/ui/UiQuoteHistorical;Lcom/robinhood/android/charts/models/db/OptionHistoricalChartModel;Lcom/robinhood/android/indexes/models/db/Index;Lcom/robinhood/android/indexes/models/db/IndexCloseValue;Lcom/robinhood/android/indexes/models/db/IndexHistoricals;Lcom/robinhood/android/indexes/models/db/IndexValue;Lcom/robinhood/models/db/IacInfoBanner;Ljava/lang/Boolean;Lcom/robinhood/models/db/LateCloseAnnouncementCardFlag;ZLcom/robinhood/models/db/OptionInstrumentPosition;Ljava/util/Map;Lcom/robinhood/models/db/accountswitcher/OptionsAccountSwitcher;Ljava/lang/Boolean;ZZLcom/robinhood/models/api/ApiOptionTodayTotalReturnResponseLegacy;JLcom/robinhood/models/ui/UiAggregateOptionPositionFull;Ljava/util/List;Lcom/robinhood/models/ui/UiOptionInstrumentPosition;Ljava/util/List;Ljava/util/List;Lcom/robinhood/models/ui/UiOptionUnderlier;Lcom/robinhood/models/ui/UiOptionStrategyInfo;Lcom/robinhood/models/ui/UiOptionChain;Lcom/robinhood/models/api/CommonApiOptionStrategyBreakevenResponse;Lcom/robinhood/models/api/CommonApiOptionTodayTotalReturnResponse;)V", "getActiveDisplaySpan", "()Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "getAggregateOptionStrategyQuote", "()Lcom/robinhood/models/db/AggregateOptionStrategyQuote;", "getCuratedListItem", "()Lcom/robinhood/models/db/CuratedListItem;", "getEquityQuote", "()Lcom/robinhood/models/db/Quote;", "getEquityUiQuoteHistorical", "()Lcom/robinhood/models/ui/UiQuoteHistorical;", "getHistoricalChart", "()Lcom/robinhood/android/charts/models/db/OptionHistoricalChartModel;", "getIndexInstrument", "()Lcom/robinhood/android/indexes/models/db/Index;", "getIndexCloseValue", "()Lcom/robinhood/android/indexes/models/db/IndexCloseValue;", "getIndexHistoricals", "()Lcom/robinhood/android/indexes/models/db/IndexHistoricals;", "getIndexValue", "()Lcom/robinhood/android/indexes/models/db/IndexValue;", "getInfoBanner", "()Lcom/robinhood/models/db/IacInfoBanner;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLateCloseAnnouncementCardFlag", "()Lcom/robinhood/models/db/LateCloseAnnouncementCardFlag;", "getLoadingAccountSwitcher", "()Z", "getOppositePositionFromWatchlist", "()Lcom/robinhood/models/db/OptionInstrumentPosition;", "getOptionInstrumentIdToQuoteMap", "()Ljava/util/Map;", "getOptionsAccountSwitcher", "()Lcom/robinhood/models/db/accountswitcher/OptionsAccountSwitcher;", "getHasRealPosition", "getShowRollingActionItem", "getShouldShowSimulatedReturns", "getSimulatedReturns", "()Lcom/robinhood/models/api/ApiOptionTodayTotalReturnResponseLegacy;", "getTimestampTradeButtonTapped", "()J", "getUiAggregatePositionIncludingZeroQuantity", "()Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "getUiOptionEvents", "()Ljava/util/List;", "getUiOptionInstrumentPositionIncludingZeroQuantity", "()Lcom/robinhood/models/ui/UiOptionInstrumentPosition;", "getUiOptionOrders", "getUiComboOrders", "getUiOptionUnderlier", "()Lcom/robinhood/models/ui/UiOptionUnderlier;", "getUiStrategyInfo", "()Lcom/robinhood/models/ui/UiOptionStrategyInfo;", "getUiOptionChain", "()Lcom/robinhood/models/ui/UiOptionChain;", "getBreakeven", "()Lcom/robinhood/models/api/CommonApiOptionStrategyBreakevenResponse;", "getTodayTotalReturn", "()Lcom/robinhood/models/api/CommonApiOptionTodayTotalReturnResponse;", "underlyingQuote", "Lcom/robinhood/models/ui/UnderlyingQuote;", "getUnderlyingQuote", "()Lcom/robinhood/models/ui/UnderlyingQuote;", "underlierInstrumentId", "getUnderlierInstrumentId", "()Ljava/util/UUID;", "underlyingSymbol", "", "getUnderlyingSymbol", "()Ljava/lang/String;", "optionsAccountSwitcherId", "Lcom/robinhood/models/api/accountswitcher/OptionsAccountSwitcherId;", "getOptionsAccountSwitcherId", "()Lcom/robinhood/models/api/accountswitcher/OptionsAccountSwitcherId;", "underlyingTypeSupportsExercise", "getUnderlyingTypeSupportsExercise", "usePrice", "getUsePrice", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "copy", "(Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Lcom/robinhood/models/db/AggregateOptionStrategyQuote;Lcom/robinhood/models/db/CuratedListItem;Lcom/robinhood/models/db/Quote;Lcom/robinhood/models/ui/UiQuoteHistorical;Lcom/robinhood/android/charts/models/db/OptionHistoricalChartModel;Lcom/robinhood/android/indexes/models/db/Index;Lcom/robinhood/android/indexes/models/db/IndexCloseValue;Lcom/robinhood/android/indexes/models/db/IndexHistoricals;Lcom/robinhood/android/indexes/models/db/IndexValue;Lcom/robinhood/models/db/IacInfoBanner;Ljava/lang/Boolean;Lcom/robinhood/models/db/LateCloseAnnouncementCardFlag;ZLcom/robinhood/models/db/OptionInstrumentPosition;Ljava/util/Map;Lcom/robinhood/models/db/accountswitcher/OptionsAccountSwitcher;Ljava/lang/Boolean;ZZLcom/robinhood/models/api/ApiOptionTodayTotalReturnResponseLegacy;JLcom/robinhood/models/ui/UiAggregateOptionPositionFull;Ljava/util/List;Lcom/robinhood/models/ui/UiOptionInstrumentPosition;Ljava/util/List;Ljava/util/List;Lcom/robinhood/models/ui/UiOptionUnderlier;Lcom/robinhood/models/ui/UiOptionStrategyInfo;Lcom/robinhood/models/ui/UiOptionChain;Lcom/robinhood/models/api/CommonApiOptionStrategyBreakevenResponse;Lcom/robinhood/models/api/CommonApiOptionTodayTotalReturnResponse;)Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState$PageData;", "equals", "other", "hashCode", "", "toString", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PageData {
        public static final int $stable = 8;
        private final DisplaySpan activeDisplaySpan;
        private final AggregateOptionStrategyQuote aggregateOptionStrategyQuote;
        private final ApiOptionStrategyBreakeven3 breakeven;
        private final CuratedListItem curatedListItem;
        private final Quote equityQuote;
        private final UiQuoteHistorical equityUiQuoteHistorical;
        private final Boolean hasRealPosition;
        private final OptionHistoricalChartModel historicalChart;
        private final IndexCloseValue indexCloseValue;
        private final IndexHistoricals indexHistoricals;
        private final Index indexInstrument;
        private final IndexValue indexValue;
        private final IacInfoBanner infoBanner;
        private final Boolean isWatching;
        private final LateCloseAnnouncementCardFlag lateCloseAnnouncementCardFlag;
        private final boolean loadingAccountSwitcher;
        private final OptionInstrumentPosition oppositePositionFromWatchlist;
        private final Map<UUID, OptionInstrumentQuote> optionInstrumentIdToQuoteMap;
        private final OptionsAccountSwitcher optionsAccountSwitcher;
        private final OptionsAccountSwitcherId optionsAccountSwitcherId;
        private final boolean shouldShowSimulatedReturns;
        private final boolean showRollingActionItem;
        private final ApiOptionTodayTotalReturnResponse2 simulatedReturns;
        private final long timestampTradeButtonTapped;
        private final ApiOptionTodayTotalReturnResponse3 todayTotalReturn;
        private final UiAggregateOptionPositionFull uiAggregatePositionIncludingZeroQuantity;
        private final List<UiComboOrder> uiComboOrders;
        private final UiOptionChain uiOptionChain;
        private final List<UiOptionEvent> uiOptionEvents;
        private final UiOptionInstrumentPosition uiOptionInstrumentPositionIncludingZeroQuantity;
        private final List<UiOptionOrder> uiOptionOrders;
        private final UiOptionUnderlier uiOptionUnderlier;
        private final UiOptionStrategyInfo uiStrategyInfo;
        private final UnderlyingQuote underlyingQuote;
        private final boolean underlyingTypeSupportsExercise;
        private final boolean usePrice;

        /* compiled from: OptionsDetailPageDataState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OptionChain.UnderlyingType.values().length];
                try {
                    iArr[OptionChain.UnderlyingType.EQUITY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OptionChain.UnderlyingType.INDEX.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public PageData() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, 0L, null, null, null, null, null, null, null, null, null, null, -1, null);
        }

        public static /* synthetic */ PageData copy$default(PageData pageData, DisplaySpan displaySpan, AggregateOptionStrategyQuote aggregateOptionStrategyQuote, CuratedListItem curatedListItem, Quote quote, UiQuoteHistorical uiQuoteHistorical, OptionHistoricalChartModel optionHistoricalChartModel, Index index, IndexCloseValue indexCloseValue, IndexHistoricals indexHistoricals, IndexValue indexValue, IacInfoBanner iacInfoBanner, Boolean bool, LateCloseAnnouncementCardFlag lateCloseAnnouncementCardFlag, boolean z, OptionInstrumentPosition optionInstrumentPosition, Map map, OptionsAccountSwitcher optionsAccountSwitcher, Boolean bool2, boolean z2, boolean z3, ApiOptionTodayTotalReturnResponse2 apiOptionTodayTotalReturnResponse2, long j, UiAggregateOptionPositionFull uiAggregateOptionPositionFull, List list, UiOptionInstrumentPosition uiOptionInstrumentPosition, List list2, List list3, UiOptionUnderlier uiOptionUnderlier, UiOptionStrategyInfo uiOptionStrategyInfo, UiOptionChain uiOptionChain, ApiOptionStrategyBreakeven3 apiOptionStrategyBreakeven3, ApiOptionTodayTotalReturnResponse3 apiOptionTodayTotalReturnResponse3, int i, Object obj) {
            ApiOptionTodayTotalReturnResponse3 apiOptionTodayTotalReturnResponse32;
            ApiOptionStrategyBreakeven3 apiOptionStrategyBreakeven32;
            OptionsAccountSwitcher optionsAccountSwitcher2;
            Boolean bool3;
            boolean z4;
            boolean z5;
            ApiOptionTodayTotalReturnResponse2 apiOptionTodayTotalReturnResponse22;
            long j2;
            UiAggregateOptionPositionFull uiAggregateOptionPositionFull2;
            UiOptionInstrumentPosition uiOptionInstrumentPosition2;
            List list4;
            List list5;
            UiOptionUnderlier uiOptionUnderlier2;
            UiOptionStrategyInfo uiOptionStrategyInfo2;
            UiOptionChain uiOptionChain2;
            List list6;
            AggregateOptionStrategyQuote aggregateOptionStrategyQuote2;
            CuratedListItem curatedListItem2;
            Quote quote2;
            UiQuoteHistorical uiQuoteHistorical2;
            Index index2;
            IndexCloseValue indexCloseValue2;
            IndexHistoricals indexHistoricals2;
            IndexValue indexValue2;
            IacInfoBanner iacInfoBanner2;
            Boolean bool4;
            LateCloseAnnouncementCardFlag lateCloseAnnouncementCardFlag2;
            boolean z6;
            Map map2;
            OptionInstrumentPosition optionInstrumentPosition2;
            DisplaySpan displaySpan2 = (i & 1) != 0 ? pageData.activeDisplaySpan : displaySpan;
            AggregateOptionStrategyQuote aggregateOptionStrategyQuote3 = (i & 2) != 0 ? pageData.aggregateOptionStrategyQuote : aggregateOptionStrategyQuote;
            CuratedListItem curatedListItem3 = (i & 4) != 0 ? pageData.curatedListItem : curatedListItem;
            Quote quote3 = (i & 8) != 0 ? pageData.equityQuote : quote;
            UiQuoteHistorical uiQuoteHistorical3 = (i & 16) != 0 ? pageData.equityUiQuoteHistorical : uiQuoteHistorical;
            OptionHistoricalChartModel optionHistoricalChartModel2 = (i & 32) != 0 ? pageData.historicalChart : optionHistoricalChartModel;
            Index index3 = (i & 64) != 0 ? pageData.indexInstrument : index;
            IndexCloseValue indexCloseValue3 = (i & 128) != 0 ? pageData.indexCloseValue : indexCloseValue;
            IndexHistoricals indexHistoricals3 = (i & 256) != 0 ? pageData.indexHistoricals : indexHistoricals;
            IndexValue indexValue3 = (i & 512) != 0 ? pageData.indexValue : indexValue;
            IacInfoBanner iacInfoBanner3 = (i & 1024) != 0 ? pageData.infoBanner : iacInfoBanner;
            Boolean bool5 = (i & 2048) != 0 ? pageData.isWatching : bool;
            LateCloseAnnouncementCardFlag lateCloseAnnouncementCardFlag3 = (i & 4096) != 0 ? pageData.lateCloseAnnouncementCardFlag : lateCloseAnnouncementCardFlag;
            boolean z7 = (i & 8192) != 0 ? pageData.loadingAccountSwitcher : z;
            DisplaySpan displaySpan3 = displaySpan2;
            OptionInstrumentPosition optionInstrumentPosition3 = (i & 16384) != 0 ? pageData.oppositePositionFromWatchlist : optionInstrumentPosition;
            Map map3 = (i & 32768) != 0 ? pageData.optionInstrumentIdToQuoteMap : map;
            OptionsAccountSwitcher optionsAccountSwitcher3 = (i & 65536) != 0 ? pageData.optionsAccountSwitcher : optionsAccountSwitcher;
            Boolean bool6 = (i & 131072) != 0 ? pageData.hasRealPosition : bool2;
            boolean z8 = (i & 262144) != 0 ? pageData.showRollingActionItem : z2;
            boolean z9 = (i & 524288) != 0 ? pageData.shouldShowSimulatedReturns : z3;
            ApiOptionTodayTotalReturnResponse2 apiOptionTodayTotalReturnResponse23 = (i & 1048576) != 0 ? pageData.simulatedReturns : apiOptionTodayTotalReturnResponse2;
            OptionInstrumentPosition optionInstrumentPosition4 = optionInstrumentPosition3;
            long j3 = (i & 2097152) != 0 ? pageData.timestampTradeButtonTapped : j;
            UiAggregateOptionPositionFull uiAggregateOptionPositionFull3 = (i & 4194304) != 0 ? pageData.uiAggregatePositionIncludingZeroQuantity : uiAggregateOptionPositionFull;
            List list7 = (i & 8388608) != 0 ? pageData.uiOptionEvents : list;
            UiAggregateOptionPositionFull uiAggregateOptionPositionFull4 = uiAggregateOptionPositionFull3;
            UiOptionInstrumentPosition uiOptionInstrumentPosition3 = (i & 16777216) != 0 ? pageData.uiOptionInstrumentPositionIncludingZeroQuantity : uiOptionInstrumentPosition;
            List list8 = (i & 33554432) != 0 ? pageData.uiOptionOrders : list2;
            List list9 = (i & 67108864) != 0 ? pageData.uiComboOrders : list3;
            UiOptionUnderlier uiOptionUnderlier3 = (i & 134217728) != 0 ? pageData.uiOptionUnderlier : uiOptionUnderlier;
            UiOptionStrategyInfo uiOptionStrategyInfo3 = (i & 268435456) != 0 ? pageData.uiStrategyInfo : uiOptionStrategyInfo;
            UiOptionChain uiOptionChain3 = (i & 536870912) != 0 ? pageData.uiOptionChain : uiOptionChain;
            ApiOptionStrategyBreakeven3 apiOptionStrategyBreakeven33 = (i & 1073741824) != 0 ? pageData.breakeven : apiOptionStrategyBreakeven3;
            if ((i & Integer.MIN_VALUE) != 0) {
                apiOptionStrategyBreakeven32 = apiOptionStrategyBreakeven33;
                apiOptionTodayTotalReturnResponse32 = pageData.todayTotalReturn;
                bool3 = bool6;
                z4 = z8;
                z5 = z9;
                apiOptionTodayTotalReturnResponse22 = apiOptionTodayTotalReturnResponse23;
                j2 = j3;
                uiAggregateOptionPositionFull2 = uiAggregateOptionPositionFull4;
                uiOptionInstrumentPosition2 = uiOptionInstrumentPosition3;
                list4 = list8;
                list5 = list9;
                uiOptionUnderlier2 = uiOptionUnderlier3;
                uiOptionStrategyInfo2 = uiOptionStrategyInfo3;
                uiOptionChain2 = uiOptionChain3;
                list6 = list7;
                curatedListItem2 = curatedListItem3;
                quote2 = quote3;
                uiQuoteHistorical2 = uiQuoteHistorical3;
                index2 = index3;
                indexCloseValue2 = indexCloseValue3;
                indexHistoricals2 = indexHistoricals3;
                indexValue2 = indexValue3;
                iacInfoBanner2 = iacInfoBanner3;
                bool4 = bool5;
                lateCloseAnnouncementCardFlag2 = lateCloseAnnouncementCardFlag3;
                z6 = z7;
                map2 = map3;
                optionsAccountSwitcher2 = optionsAccountSwitcher3;
                optionInstrumentPosition2 = optionInstrumentPosition4;
                aggregateOptionStrategyQuote2 = aggregateOptionStrategyQuote3;
            } else {
                apiOptionTodayTotalReturnResponse32 = apiOptionTodayTotalReturnResponse3;
                apiOptionStrategyBreakeven32 = apiOptionStrategyBreakeven33;
                optionsAccountSwitcher2 = optionsAccountSwitcher3;
                bool3 = bool6;
                z4 = z8;
                z5 = z9;
                apiOptionTodayTotalReturnResponse22 = apiOptionTodayTotalReturnResponse23;
                j2 = j3;
                uiAggregateOptionPositionFull2 = uiAggregateOptionPositionFull4;
                uiOptionInstrumentPosition2 = uiOptionInstrumentPosition3;
                list4 = list8;
                list5 = list9;
                uiOptionUnderlier2 = uiOptionUnderlier3;
                uiOptionStrategyInfo2 = uiOptionStrategyInfo3;
                uiOptionChain2 = uiOptionChain3;
                list6 = list7;
                aggregateOptionStrategyQuote2 = aggregateOptionStrategyQuote3;
                curatedListItem2 = curatedListItem3;
                quote2 = quote3;
                uiQuoteHistorical2 = uiQuoteHistorical3;
                index2 = index3;
                indexCloseValue2 = indexCloseValue3;
                indexHistoricals2 = indexHistoricals3;
                indexValue2 = indexValue3;
                iacInfoBanner2 = iacInfoBanner3;
                bool4 = bool5;
                lateCloseAnnouncementCardFlag2 = lateCloseAnnouncementCardFlag3;
                z6 = z7;
                map2 = map3;
                optionInstrumentPosition2 = optionInstrumentPosition4;
            }
            return pageData.copy(displaySpan3, aggregateOptionStrategyQuote2, curatedListItem2, quote2, uiQuoteHistorical2, optionHistoricalChartModel2, index2, indexCloseValue2, indexHistoricals2, indexValue2, iacInfoBanner2, bool4, lateCloseAnnouncementCardFlag2, z6, optionInstrumentPosition2, map2, optionsAccountSwitcher2, bool3, z4, z5, apiOptionTodayTotalReturnResponse22, j2, uiAggregateOptionPositionFull2, list6, uiOptionInstrumentPosition2, list4, list5, uiOptionUnderlier2, uiOptionStrategyInfo2, uiOptionChain2, apiOptionStrategyBreakeven32, apiOptionTodayTotalReturnResponse32);
        }

        /* renamed from: component1, reason: from getter */
        public final DisplaySpan getActiveDisplaySpan() {
            return this.activeDisplaySpan;
        }

        /* renamed from: component10, reason: from getter */
        public final IndexValue getIndexValue() {
            return this.indexValue;
        }

        /* renamed from: component11, reason: from getter */
        public final IacInfoBanner getInfoBanner() {
            return this.infoBanner;
        }

        /* renamed from: component12, reason: from getter */
        public final Boolean getIsWatching() {
            return this.isWatching;
        }

        /* renamed from: component13, reason: from getter */
        public final LateCloseAnnouncementCardFlag getLateCloseAnnouncementCardFlag() {
            return this.lateCloseAnnouncementCardFlag;
        }

        /* renamed from: component14, reason: from getter */
        public final boolean getLoadingAccountSwitcher() {
            return this.loadingAccountSwitcher;
        }

        /* renamed from: component15, reason: from getter */
        public final OptionInstrumentPosition getOppositePositionFromWatchlist() {
            return this.oppositePositionFromWatchlist;
        }

        public final Map<UUID, OptionInstrumentQuote> component16() {
            return this.optionInstrumentIdToQuoteMap;
        }

        /* renamed from: component17, reason: from getter */
        public final OptionsAccountSwitcher getOptionsAccountSwitcher() {
            return this.optionsAccountSwitcher;
        }

        /* renamed from: component18, reason: from getter */
        public final Boolean getHasRealPosition() {
            return this.hasRealPosition;
        }

        /* renamed from: component19, reason: from getter */
        public final boolean getShowRollingActionItem() {
            return this.showRollingActionItem;
        }

        /* renamed from: component2, reason: from getter */
        public final AggregateOptionStrategyQuote getAggregateOptionStrategyQuote() {
            return this.aggregateOptionStrategyQuote;
        }

        /* renamed from: component20, reason: from getter */
        public final boolean getShouldShowSimulatedReturns() {
            return this.shouldShowSimulatedReturns;
        }

        /* renamed from: component21, reason: from getter */
        public final ApiOptionTodayTotalReturnResponse2 getSimulatedReturns() {
            return this.simulatedReturns;
        }

        /* renamed from: component22, reason: from getter */
        public final long getTimestampTradeButtonTapped() {
            return this.timestampTradeButtonTapped;
        }

        /* renamed from: component23, reason: from getter */
        public final UiAggregateOptionPositionFull getUiAggregatePositionIncludingZeroQuantity() {
            return this.uiAggregatePositionIncludingZeroQuantity;
        }

        public final List<UiOptionEvent> component24() {
            return this.uiOptionEvents;
        }

        /* renamed from: component25, reason: from getter */
        public final UiOptionInstrumentPosition getUiOptionInstrumentPositionIncludingZeroQuantity() {
            return this.uiOptionInstrumentPositionIncludingZeroQuantity;
        }

        public final List<UiOptionOrder> component26() {
            return this.uiOptionOrders;
        }

        public final List<UiComboOrder> component27() {
            return this.uiComboOrders;
        }

        /* renamed from: component28, reason: from getter */
        public final UiOptionUnderlier getUiOptionUnderlier() {
            return this.uiOptionUnderlier;
        }

        /* renamed from: component29, reason: from getter */
        public final UiOptionStrategyInfo getUiStrategyInfo() {
            return this.uiStrategyInfo;
        }

        /* renamed from: component3, reason: from getter */
        public final CuratedListItem getCuratedListItem() {
            return this.curatedListItem;
        }

        /* renamed from: component30, reason: from getter */
        public final UiOptionChain getUiOptionChain() {
            return this.uiOptionChain;
        }

        /* renamed from: component31, reason: from getter */
        public final ApiOptionStrategyBreakeven3 getBreakeven() {
            return this.breakeven;
        }

        /* renamed from: component32, reason: from getter */
        public final ApiOptionTodayTotalReturnResponse3 getTodayTotalReturn() {
            return this.todayTotalReturn;
        }

        /* renamed from: component4, reason: from getter */
        public final Quote getEquityQuote() {
            return this.equityQuote;
        }

        /* renamed from: component5, reason: from getter */
        public final UiQuoteHistorical getEquityUiQuoteHistorical() {
            return this.equityUiQuoteHistorical;
        }

        /* renamed from: component6, reason: from getter */
        public final OptionHistoricalChartModel getHistoricalChart() {
            return this.historicalChart;
        }

        /* renamed from: component7, reason: from getter */
        public final Index getIndexInstrument() {
            return this.indexInstrument;
        }

        /* renamed from: component8, reason: from getter */
        public final IndexCloseValue getIndexCloseValue() {
            return this.indexCloseValue;
        }

        /* renamed from: component9, reason: from getter */
        public final IndexHistoricals getIndexHistoricals() {
            return this.indexHistoricals;
        }

        public final PageData copy(DisplaySpan activeDisplaySpan, AggregateOptionStrategyQuote aggregateOptionStrategyQuote, CuratedListItem curatedListItem, Quote equityQuote, UiQuoteHistorical equityUiQuoteHistorical, OptionHistoricalChartModel historicalChart, Index indexInstrument, IndexCloseValue indexCloseValue, IndexHistoricals indexHistoricals, IndexValue indexValue, IacInfoBanner infoBanner, Boolean isWatching, LateCloseAnnouncementCardFlag lateCloseAnnouncementCardFlag, boolean loadingAccountSwitcher, OptionInstrumentPosition oppositePositionFromWatchlist, Map<UUID, OptionInstrumentQuote> optionInstrumentIdToQuoteMap, OptionsAccountSwitcher optionsAccountSwitcher, Boolean hasRealPosition, boolean showRollingActionItem, boolean shouldShowSimulatedReturns, ApiOptionTodayTotalReturnResponse2 simulatedReturns, long timestampTradeButtonTapped, UiAggregateOptionPositionFull uiAggregatePositionIncludingZeroQuantity, List<UiOptionEvent> uiOptionEvents, UiOptionInstrumentPosition uiOptionInstrumentPositionIncludingZeroQuantity, List<UiOptionOrder> uiOptionOrders, List<UiComboOrder> uiComboOrders, UiOptionUnderlier uiOptionUnderlier, UiOptionStrategyInfo uiStrategyInfo, UiOptionChain uiOptionChain, ApiOptionStrategyBreakeven3 breakeven, ApiOptionTodayTotalReturnResponse3 todayTotalReturn) {
            Intrinsics.checkNotNullParameter(optionInstrumentIdToQuoteMap, "optionInstrumentIdToQuoteMap");
            Intrinsics.checkNotNullParameter(uiOptionOrders, "uiOptionOrders");
            Intrinsics.checkNotNullParameter(uiComboOrders, "uiComboOrders");
            return new PageData(activeDisplaySpan, aggregateOptionStrategyQuote, curatedListItem, equityQuote, equityUiQuoteHistorical, historicalChart, indexInstrument, indexCloseValue, indexHistoricals, indexValue, infoBanner, isWatching, lateCloseAnnouncementCardFlag, loadingAccountSwitcher, oppositePositionFromWatchlist, optionInstrumentIdToQuoteMap, optionsAccountSwitcher, hasRealPosition, showRollingActionItem, shouldShowSimulatedReturns, simulatedReturns, timestampTradeButtonTapped, uiAggregatePositionIncludingZeroQuantity, uiOptionEvents, uiOptionInstrumentPositionIncludingZeroQuantity, uiOptionOrders, uiComboOrders, uiOptionUnderlier, uiStrategyInfo, uiOptionChain, breakeven, todayTotalReturn);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PageData)) {
                return false;
            }
            PageData pageData = (PageData) other;
            return this.activeDisplaySpan == pageData.activeDisplaySpan && Intrinsics.areEqual(this.aggregateOptionStrategyQuote, pageData.aggregateOptionStrategyQuote) && Intrinsics.areEqual(this.curatedListItem, pageData.curatedListItem) && Intrinsics.areEqual(this.equityQuote, pageData.equityQuote) && Intrinsics.areEqual(this.equityUiQuoteHistorical, pageData.equityUiQuoteHistorical) && Intrinsics.areEqual(this.historicalChart, pageData.historicalChart) && Intrinsics.areEqual(this.indexInstrument, pageData.indexInstrument) && Intrinsics.areEqual(this.indexCloseValue, pageData.indexCloseValue) && Intrinsics.areEqual(this.indexHistoricals, pageData.indexHistoricals) && Intrinsics.areEqual(this.indexValue, pageData.indexValue) && Intrinsics.areEqual(this.infoBanner, pageData.infoBanner) && Intrinsics.areEqual(this.isWatching, pageData.isWatching) && Intrinsics.areEqual(this.lateCloseAnnouncementCardFlag, pageData.lateCloseAnnouncementCardFlag) && this.loadingAccountSwitcher == pageData.loadingAccountSwitcher && Intrinsics.areEqual(this.oppositePositionFromWatchlist, pageData.oppositePositionFromWatchlist) && Intrinsics.areEqual(this.optionInstrumentIdToQuoteMap, pageData.optionInstrumentIdToQuoteMap) && Intrinsics.areEqual(this.optionsAccountSwitcher, pageData.optionsAccountSwitcher) && Intrinsics.areEqual(this.hasRealPosition, pageData.hasRealPosition) && this.showRollingActionItem == pageData.showRollingActionItem && this.shouldShowSimulatedReturns == pageData.shouldShowSimulatedReturns && Intrinsics.areEqual(this.simulatedReturns, pageData.simulatedReturns) && this.timestampTradeButtonTapped == pageData.timestampTradeButtonTapped && Intrinsics.areEqual(this.uiAggregatePositionIncludingZeroQuantity, pageData.uiAggregatePositionIncludingZeroQuantity) && Intrinsics.areEqual(this.uiOptionEvents, pageData.uiOptionEvents) && Intrinsics.areEqual(this.uiOptionInstrumentPositionIncludingZeroQuantity, pageData.uiOptionInstrumentPositionIncludingZeroQuantity) && Intrinsics.areEqual(this.uiOptionOrders, pageData.uiOptionOrders) && Intrinsics.areEqual(this.uiComboOrders, pageData.uiComboOrders) && Intrinsics.areEqual(this.uiOptionUnderlier, pageData.uiOptionUnderlier) && Intrinsics.areEqual(this.uiStrategyInfo, pageData.uiStrategyInfo) && Intrinsics.areEqual(this.uiOptionChain, pageData.uiOptionChain) && Intrinsics.areEqual(this.breakeven, pageData.breakeven) && Intrinsics.areEqual(this.todayTotalReturn, pageData.todayTotalReturn);
        }

        public int hashCode() {
            DisplaySpan displaySpan = this.activeDisplaySpan;
            int iHashCode = (displaySpan == null ? 0 : displaySpan.hashCode()) * 31;
            AggregateOptionStrategyQuote aggregateOptionStrategyQuote = this.aggregateOptionStrategyQuote;
            int iHashCode2 = (iHashCode + (aggregateOptionStrategyQuote == null ? 0 : aggregateOptionStrategyQuote.hashCode())) * 31;
            CuratedListItem curatedListItem = this.curatedListItem;
            int iHashCode3 = (iHashCode2 + (curatedListItem == null ? 0 : curatedListItem.hashCode())) * 31;
            Quote quote = this.equityQuote;
            int iHashCode4 = (iHashCode3 + (quote == null ? 0 : quote.hashCode())) * 31;
            UiQuoteHistorical uiQuoteHistorical = this.equityUiQuoteHistorical;
            int iHashCode5 = (iHashCode4 + (uiQuoteHistorical == null ? 0 : uiQuoteHistorical.hashCode())) * 31;
            OptionHistoricalChartModel optionHistoricalChartModel = this.historicalChart;
            int iHashCode6 = (iHashCode5 + (optionHistoricalChartModel == null ? 0 : optionHistoricalChartModel.hashCode())) * 31;
            Index index = this.indexInstrument;
            int iHashCode7 = (iHashCode6 + (index == null ? 0 : index.hashCode())) * 31;
            IndexCloseValue indexCloseValue = this.indexCloseValue;
            int iHashCode8 = (iHashCode7 + (indexCloseValue == null ? 0 : indexCloseValue.hashCode())) * 31;
            IndexHistoricals indexHistoricals = this.indexHistoricals;
            int iHashCode9 = (iHashCode8 + (indexHistoricals == null ? 0 : indexHistoricals.hashCode())) * 31;
            IndexValue indexValue = this.indexValue;
            int iHashCode10 = (iHashCode9 + (indexValue == null ? 0 : indexValue.hashCode())) * 31;
            IacInfoBanner iacInfoBanner = this.infoBanner;
            int iHashCode11 = (iHashCode10 + (iacInfoBanner == null ? 0 : iacInfoBanner.hashCode())) * 31;
            Boolean bool = this.isWatching;
            int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
            LateCloseAnnouncementCardFlag lateCloseAnnouncementCardFlag = this.lateCloseAnnouncementCardFlag;
            int iHashCode13 = (((iHashCode12 + (lateCloseAnnouncementCardFlag == null ? 0 : lateCloseAnnouncementCardFlag.hashCode())) * 31) + Boolean.hashCode(this.loadingAccountSwitcher)) * 31;
            OptionInstrumentPosition optionInstrumentPosition = this.oppositePositionFromWatchlist;
            int iHashCode14 = (((iHashCode13 + (optionInstrumentPosition == null ? 0 : optionInstrumentPosition.hashCode())) * 31) + this.optionInstrumentIdToQuoteMap.hashCode()) * 31;
            OptionsAccountSwitcher optionsAccountSwitcher = this.optionsAccountSwitcher;
            int iHashCode15 = (iHashCode14 + (optionsAccountSwitcher == null ? 0 : optionsAccountSwitcher.hashCode())) * 31;
            Boolean bool2 = this.hasRealPosition;
            int iHashCode16 = (((((iHashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + Boolean.hashCode(this.showRollingActionItem)) * 31) + Boolean.hashCode(this.shouldShowSimulatedReturns)) * 31;
            ApiOptionTodayTotalReturnResponse2 apiOptionTodayTotalReturnResponse2 = this.simulatedReturns;
            int iHashCode17 = (((iHashCode16 + (apiOptionTodayTotalReturnResponse2 == null ? 0 : apiOptionTodayTotalReturnResponse2.hashCode())) * 31) + Long.hashCode(this.timestampTradeButtonTapped)) * 31;
            UiAggregateOptionPositionFull uiAggregateOptionPositionFull = this.uiAggregatePositionIncludingZeroQuantity;
            int iHashCode18 = (iHashCode17 + (uiAggregateOptionPositionFull == null ? 0 : uiAggregateOptionPositionFull.hashCode())) * 31;
            List<UiOptionEvent> list = this.uiOptionEvents;
            int iHashCode19 = (iHashCode18 + (list == null ? 0 : list.hashCode())) * 31;
            UiOptionInstrumentPosition uiOptionInstrumentPosition = this.uiOptionInstrumentPositionIncludingZeroQuantity;
            int iHashCode20 = (((((iHashCode19 + (uiOptionInstrumentPosition == null ? 0 : uiOptionInstrumentPosition.hashCode())) * 31) + this.uiOptionOrders.hashCode()) * 31) + this.uiComboOrders.hashCode()) * 31;
            UiOptionUnderlier uiOptionUnderlier = this.uiOptionUnderlier;
            int iHashCode21 = (iHashCode20 + (uiOptionUnderlier == null ? 0 : uiOptionUnderlier.hashCode())) * 31;
            UiOptionStrategyInfo uiOptionStrategyInfo = this.uiStrategyInfo;
            int iHashCode22 = (iHashCode21 + (uiOptionStrategyInfo == null ? 0 : uiOptionStrategyInfo.hashCode())) * 31;
            UiOptionChain uiOptionChain = this.uiOptionChain;
            int iHashCode23 = (iHashCode22 + (uiOptionChain == null ? 0 : uiOptionChain.hashCode())) * 31;
            ApiOptionStrategyBreakeven3 apiOptionStrategyBreakeven3 = this.breakeven;
            int iHashCode24 = (iHashCode23 + (apiOptionStrategyBreakeven3 == null ? 0 : apiOptionStrategyBreakeven3.hashCode())) * 31;
            ApiOptionTodayTotalReturnResponse3 apiOptionTodayTotalReturnResponse3 = this.todayTotalReturn;
            return iHashCode24 + (apiOptionTodayTotalReturnResponse3 != null ? apiOptionTodayTotalReturnResponse3.hashCode() : 0);
        }

        public String toString() {
            return "PageData(activeDisplaySpan=" + this.activeDisplaySpan + ", aggregateOptionStrategyQuote=" + this.aggregateOptionStrategyQuote + ", curatedListItem=" + this.curatedListItem + ", equityQuote=" + this.equityQuote + ", equityUiQuoteHistorical=" + this.equityUiQuoteHistorical + ", historicalChart=" + this.historicalChart + ", indexInstrument=" + this.indexInstrument + ", indexCloseValue=" + this.indexCloseValue + ", indexHistoricals=" + this.indexHistoricals + ", indexValue=" + this.indexValue + ", infoBanner=" + this.infoBanner + ", isWatching=" + this.isWatching + ", lateCloseAnnouncementCardFlag=" + this.lateCloseAnnouncementCardFlag + ", loadingAccountSwitcher=" + this.loadingAccountSwitcher + ", oppositePositionFromWatchlist=" + this.oppositePositionFromWatchlist + ", optionInstrumentIdToQuoteMap=" + this.optionInstrumentIdToQuoteMap + ", optionsAccountSwitcher=" + this.optionsAccountSwitcher + ", hasRealPosition=" + this.hasRealPosition + ", showRollingActionItem=" + this.showRollingActionItem + ", shouldShowSimulatedReturns=" + this.shouldShowSimulatedReturns + ", simulatedReturns=" + this.simulatedReturns + ", timestampTradeButtonTapped=" + this.timestampTradeButtonTapped + ", uiAggregatePositionIncludingZeroQuantity=" + this.uiAggregatePositionIncludingZeroQuantity + ", uiOptionEvents=" + this.uiOptionEvents + ", uiOptionInstrumentPositionIncludingZeroQuantity=" + this.uiOptionInstrumentPositionIncludingZeroQuantity + ", uiOptionOrders=" + this.uiOptionOrders + ", uiComboOrders=" + this.uiComboOrders + ", uiOptionUnderlier=" + this.uiOptionUnderlier + ", uiStrategyInfo=" + this.uiStrategyInfo + ", uiOptionChain=" + this.uiOptionChain + ", breakeven=" + this.breakeven + ", todayTotalReturn=" + this.todayTotalReturn + ")";
        }

        public PageData(DisplaySpan displaySpan, AggregateOptionStrategyQuote aggregateOptionStrategyQuote, CuratedListItem curatedListItem, Quote quote, UiQuoteHistorical uiQuoteHistorical, OptionHistoricalChartModel optionHistoricalChartModel, Index index, IndexCloseValue indexCloseValue, IndexHistoricals indexHistoricals, IndexValue indexValue, IacInfoBanner iacInfoBanner, Boolean bool, LateCloseAnnouncementCardFlag lateCloseAnnouncementCardFlag, boolean z, OptionInstrumentPosition optionInstrumentPosition, Map<UUID, OptionInstrumentQuote> optionInstrumentIdToQuoteMap, OptionsAccountSwitcher optionsAccountSwitcher, Boolean bool2, boolean z2, boolean z3, ApiOptionTodayTotalReturnResponse2 apiOptionTodayTotalReturnResponse2, long j, UiAggregateOptionPositionFull uiAggregateOptionPositionFull, List<UiOptionEvent> list, UiOptionInstrumentPosition uiOptionInstrumentPosition, List<UiOptionOrder> uiOptionOrders, List<UiComboOrder> uiComboOrders, UiOptionUnderlier uiOptionUnderlier, UiOptionStrategyInfo uiOptionStrategyInfo, UiOptionChain uiOptionChain, ApiOptionStrategyBreakeven3 apiOptionStrategyBreakeven3, ApiOptionTodayTotalReturnResponse3 apiOptionTodayTotalReturnResponse3) {
            OptionsAccountSwitcherId strategyCode;
            OptionStrategyInfo optionStrategyInfo;
            boolean z4;
            Intrinsics.checkNotNullParameter(optionInstrumentIdToQuoteMap, "optionInstrumentIdToQuoteMap");
            Intrinsics.checkNotNullParameter(uiOptionOrders, "uiOptionOrders");
            Intrinsics.checkNotNullParameter(uiComboOrders, "uiComboOrders");
            this.activeDisplaySpan = displaySpan;
            this.aggregateOptionStrategyQuote = aggregateOptionStrategyQuote;
            this.curatedListItem = curatedListItem;
            this.equityQuote = quote;
            this.equityUiQuoteHistorical = uiQuoteHistorical;
            this.historicalChart = optionHistoricalChartModel;
            this.indexInstrument = index;
            this.indexCloseValue = indexCloseValue;
            this.indexHistoricals = indexHistoricals;
            this.indexValue = indexValue;
            this.infoBanner = iacInfoBanner;
            this.isWatching = bool;
            this.lateCloseAnnouncementCardFlag = lateCloseAnnouncementCardFlag;
            this.loadingAccountSwitcher = z;
            this.oppositePositionFromWatchlist = optionInstrumentPosition;
            this.optionInstrumentIdToQuoteMap = optionInstrumentIdToQuoteMap;
            this.optionsAccountSwitcher = optionsAccountSwitcher;
            this.hasRealPosition = bool2;
            this.showRollingActionItem = z2;
            this.shouldShowSimulatedReturns = z3;
            this.simulatedReturns = apiOptionTodayTotalReturnResponse2;
            this.timestampTradeButtonTapped = j;
            this.uiAggregatePositionIncludingZeroQuantity = uiAggregateOptionPositionFull;
            this.uiOptionEvents = list;
            this.uiOptionInstrumentPositionIncludingZeroQuantity = uiOptionInstrumentPosition;
            this.uiOptionOrders = uiOptionOrders;
            this.uiComboOrders = uiComboOrders;
            this.uiOptionUnderlier = uiOptionUnderlier;
            this.uiStrategyInfo = uiOptionStrategyInfo;
            this.uiOptionChain = uiOptionChain;
            this.breakeven = apiOptionStrategyBreakeven3;
            this.todayTotalReturn = apiOptionTodayTotalReturnResponse3;
            this.underlyingQuote = UnderlyingQuote.INSTANCE.getUnderlyingQuote(quote, indexValue);
            if (uiAggregateOptionPositionFull != null) {
                strategyCode = new OptionsAccountSwitcherId.AggregatePositionId(uiAggregateOptionPositionFull.getId());
            } else if (uiOptionInstrumentPosition != null) {
                strategyCode = new OptionsAccountSwitcherId.InstrumentId(uiOptionInstrumentPosition.getOptionInstrument().getId());
            } else {
                strategyCode = ((uiOptionStrategyInfo == null || (optionStrategyInfo = uiOptionStrategyInfo.getOptionStrategyInfo()) == null) ? null : optionStrategyInfo.getStrategyCode()) != null ? new OptionsAccountSwitcherId.StrategyCode(uiOptionStrategyInfo.getOptionStrategyInfo().getStrategyCode()) : null;
            }
            this.optionsAccountSwitcherId = strategyCode;
            OptionChain.UnderlyingType underlyingType = uiOptionChain != null ? uiOptionChain.getUnderlyingType() : null;
            int i = underlyingType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[underlyingType.ordinal()];
            boolean z5 = false;
            if (i == -1 || i == 1) {
                z4 = true;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                z4 = false;
            }
            this.underlyingTypeSupportsExercise = z4;
            OptionChain.UnderlyingType underlyingType2 = uiOptionChain != null ? uiOptionChain.getUnderlyingType() : null;
            int i2 = underlyingType2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[underlyingType2.ordinal()];
            if (i2 == -1 || i2 == 1) {
                z5 = true;
            } else if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.usePrice = z5;
        }

        public final DisplaySpan getActiveDisplaySpan() {
            return this.activeDisplaySpan;
        }

        public final AggregateOptionStrategyQuote getAggregateOptionStrategyQuote() {
            return this.aggregateOptionStrategyQuote;
        }

        public final CuratedListItem getCuratedListItem() {
            return this.curatedListItem;
        }

        public final Quote getEquityQuote() {
            return this.equityQuote;
        }

        public final UiQuoteHistorical getEquityUiQuoteHistorical() {
            return this.equityUiQuoteHistorical;
        }

        public final OptionHistoricalChartModel getHistoricalChart() {
            return this.historicalChart;
        }

        public final Index getIndexInstrument() {
            return this.indexInstrument;
        }

        public final IndexCloseValue getIndexCloseValue() {
            return this.indexCloseValue;
        }

        public final IndexHistoricals getIndexHistoricals() {
            return this.indexHistoricals;
        }

        public final IndexValue getIndexValue() {
            return this.indexValue;
        }

        public final IacInfoBanner getInfoBanner() {
            return this.infoBanner;
        }

        public final Boolean isWatching() {
            return this.isWatching;
        }

        public final LateCloseAnnouncementCardFlag getLateCloseAnnouncementCardFlag() {
            return this.lateCloseAnnouncementCardFlag;
        }

        public final boolean getLoadingAccountSwitcher() {
            return this.loadingAccountSwitcher;
        }

        public final OptionInstrumentPosition getOppositePositionFromWatchlist() {
            return this.oppositePositionFromWatchlist;
        }

        public /* synthetic */ PageData(DisplaySpan displaySpan, AggregateOptionStrategyQuote aggregateOptionStrategyQuote, CuratedListItem curatedListItem, Quote quote, UiQuoteHistorical uiQuoteHistorical, OptionHistoricalChartModel optionHistoricalChartModel, Index index, IndexCloseValue indexCloseValue, IndexHistoricals indexHistoricals, IndexValue indexValue, IacInfoBanner iacInfoBanner, Boolean bool, LateCloseAnnouncementCardFlag lateCloseAnnouncementCardFlag, boolean z, OptionInstrumentPosition optionInstrumentPosition, Map map, OptionsAccountSwitcher optionsAccountSwitcher, Boolean bool2, boolean z2, boolean z3, ApiOptionTodayTotalReturnResponse2 apiOptionTodayTotalReturnResponse2, long j, UiAggregateOptionPositionFull uiAggregateOptionPositionFull, List list, UiOptionInstrumentPosition uiOptionInstrumentPosition, List list2, List list3, UiOptionUnderlier uiOptionUnderlier, UiOptionStrategyInfo uiOptionStrategyInfo, UiOptionChain uiOptionChain, ApiOptionStrategyBreakeven3 apiOptionStrategyBreakeven3, ApiOptionTodayTotalReturnResponse3 apiOptionTodayTotalReturnResponse3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : displaySpan, (i & 2) != 0 ? null : aggregateOptionStrategyQuote, (i & 4) != 0 ? null : curatedListItem, (i & 8) != 0 ? null : quote, (i & 16) != 0 ? null : uiQuoteHistorical, (i & 32) != 0 ? null : optionHistoricalChartModel, (i & 64) != 0 ? null : index, (i & 128) != 0 ? null : indexCloseValue, (i & 256) != 0 ? null : indexHistoricals, (i & 512) != 0 ? null : indexValue, (i & 1024) != 0 ? null : iacInfoBanner, (i & 2048) != 0 ? null : bool, (i & 4096) != 0 ? null : lateCloseAnnouncementCardFlag, (i & 8192) != 0 ? false : z, (i & 16384) != 0 ? null : optionInstrumentPosition, (i & 32768) != 0 ? MapsKt.emptyMap() : map, (i & 65536) != 0 ? null : optionsAccountSwitcher, (i & 131072) != 0 ? null : bool2, (i & 262144) != 0 ? false : z2, (i & 524288) == 0 ? z3 : false, (i & 1048576) != 0 ? null : apiOptionTodayTotalReturnResponse2, (i & 2097152) != 0 ? 0L : j, (i & 4194304) != 0 ? null : uiAggregateOptionPositionFull, (i & 8388608) != 0 ? null : list, (i & 16777216) != 0 ? null : uiOptionInstrumentPosition, (i & 33554432) != 0 ? CollectionsKt.emptyList() : list2, (i & 67108864) != 0 ? CollectionsKt.emptyList() : list3, (i & 134217728) != 0 ? null : uiOptionUnderlier, (i & 268435456) != 0 ? null : uiOptionStrategyInfo, (i & 536870912) != 0 ? null : uiOptionChain, (i & 1073741824) != 0 ? null : apiOptionStrategyBreakeven3, (i & Integer.MIN_VALUE) != 0 ? null : apiOptionTodayTotalReturnResponse3);
        }

        public final Map<UUID, OptionInstrumentQuote> getOptionInstrumentIdToQuoteMap() {
            return this.optionInstrumentIdToQuoteMap;
        }

        public final OptionsAccountSwitcher getOptionsAccountSwitcher() {
            return this.optionsAccountSwitcher;
        }

        public final Boolean getHasRealPosition() {
            return this.hasRealPosition;
        }

        public final boolean getShowRollingActionItem() {
            return this.showRollingActionItem;
        }

        public final boolean getShouldShowSimulatedReturns() {
            return this.shouldShowSimulatedReturns;
        }

        public final ApiOptionTodayTotalReturnResponse2 getSimulatedReturns() {
            return this.simulatedReturns;
        }

        public final long getTimestampTradeButtonTapped() {
            return this.timestampTradeButtonTapped;
        }

        public final UiAggregateOptionPositionFull getUiAggregatePositionIncludingZeroQuantity() {
            return this.uiAggregatePositionIncludingZeroQuantity;
        }

        public final List<UiOptionEvent> getUiOptionEvents() {
            return this.uiOptionEvents;
        }

        public final UiOptionInstrumentPosition getUiOptionInstrumentPositionIncludingZeroQuantity() {
            return this.uiOptionInstrumentPositionIncludingZeroQuantity;
        }

        public final List<UiOptionOrder> getUiOptionOrders() {
            return this.uiOptionOrders;
        }

        public final List<UiComboOrder> getUiComboOrders() {
            return this.uiComboOrders;
        }

        public final UiOptionUnderlier getUiOptionUnderlier() {
            return this.uiOptionUnderlier;
        }

        public final UiOptionStrategyInfo getUiStrategyInfo() {
            return this.uiStrategyInfo;
        }

        public final UiOptionChain getUiOptionChain() {
            return this.uiOptionChain;
        }

        public final ApiOptionStrategyBreakeven3 getBreakeven() {
            return this.breakeven;
        }

        public final ApiOptionTodayTotalReturnResponse3 getTodayTotalReturn() {
            return this.todayTotalReturn;
        }

        public final UnderlyingQuote getUnderlyingQuote() {
            return this.underlyingQuote;
        }

        public final UUID getUnderlierInstrumentId() {
            OptionUnderlier underlier;
            UiOptionChain uiOptionChain = this.uiOptionChain;
            OptionChain.UnderlyingType underlyingType = uiOptionChain != null ? uiOptionChain.getUnderlyingType() : null;
            int i = underlyingType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[underlyingType.ordinal()];
            if (i != -1 && i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return this.uiOptionChain.getIndexUnderlyingId();
            }
            UiOptionUnderlier uiOptionUnderlier = this.uiOptionUnderlier;
            if (uiOptionUnderlier == null || (underlier = uiOptionUnderlier.getUnderlier()) == null) {
                return null;
            }
            return underlier.getInstrumentId();
        }

        public final String getUnderlyingSymbol() {
            Instrument instrument;
            UiOptionChain uiOptionChain = this.uiOptionChain;
            OptionChain.UnderlyingType underlyingType = uiOptionChain != null ? uiOptionChain.getUnderlyingType() : null;
            int i = underlyingType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[underlyingType.ordinal()];
            if (i != -1) {
                if (i != 1) {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IndexValue indexValue = this.indexValue;
                    if (indexValue != null) {
                        return indexValue.getSymbol();
                    }
                    return null;
                }
                UiOptionUnderlier uiOptionUnderlier = this.uiOptionUnderlier;
                if (uiOptionUnderlier != null && (instrument = uiOptionUnderlier.getInstrument()) != null) {
                    return instrument.getSymbol();
                }
            }
            return null;
        }

        public final OptionsAccountSwitcherId getOptionsAccountSwitcherId() {
            return this.optionsAccountSwitcherId;
        }

        public final boolean getUnderlyingTypeSupportsExercise() {
            return this.underlyingTypeSupportsExercise;
        }

        public final boolean getUsePrice() {
            return this.usePrice;
        }
    }

    public final OptionsDetailPagePnlDataState2 getPnlDataState() {
        return this.pnlDataState;
    }

    public final PageData get(int index) {
        return (PageData) CollectionsKt.getOrNull(this.pageDataList, index);
    }

    public final OptionsDetailPageDataState copyTo(int i, Function1<? super PageData, PageData> pageDataCopy) {
        Intrinsics.checkNotNullParameter(pageDataCopy, "pageDataCopy");
        if (this.strategyCodeList.isEmpty()) {
            return this;
        }
        if (this.pageDataList.isEmpty()) {
            List<PageData> list = this.pageDataList;
            int size = this.strategyCodeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(null);
            }
            CollectionsKt.addAll(list, arrayList);
        }
        List<PageData> list2 = this.pageDataList;
        PageData pageData = list2.get(i);
        if (pageData == null) {
            pageData = new PageData(null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, 0L, null, null, null, null, null, null, null, null, null, null, -1, null);
        }
        list2.set(i, pageDataCopy.invoke(pageData));
        return copy$default(this, null, null, null, null, false, false, null, null, null, false, false, false, null, 0, false, false, false, null, false, false, null, null, false, false, CollectionsKt.toMutableList((Collection) this.pageDataList), 16777215, null);
    }

    public final OptionsDetailPageDataState recycle(int currentIndex) {
        if (!this.pageDataList.isEmpty()) {
            if (currentIndex > 2) {
                this.pageDataList.set(currentIndex - 3, null);
            }
            if (currentIndex < this.pageDataList.size() - 3) {
                this.pageDataList.set(currentIndex + 3, null);
            }
        }
        return this;
    }
}
