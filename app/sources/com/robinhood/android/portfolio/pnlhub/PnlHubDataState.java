package com.robinhood.android.portfolio.pnlhub;

import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.android.portfolio.pnl.api.ProfitAndLossChartSpan;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossChart;
import com.robinhood.android.portfolio.pnl.p214db.SupportedAssetClass;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.Account;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: PnlHubDataState.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b*\n\u0002\u0010\b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001Bí\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u000b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010!\u001a\u00020\u000b\u0012\b\b\u0002\u0010\"\u001a\u00020\u000b\u0012\b\b\u0002\u0010#\u001a\u00020\u000b¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b*\u0010)J\u0012\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b;\u00104J\u0010\u0010<\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b<\u00104J\u0012\u0010=\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b?\u00104J\u0010\u0010@\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b@\u00104J\u0010\u0010A\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bA\u00104J\u0012\u0010B\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bD\u00104J\u0010\u0010E\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bE\u00104J\u0010\u0010F\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bF\u00104Jþ\u0001\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\bI\u0010CJ\u0010\u0010K\u001a\u00020JHÖ\u0001¢\u0006\u0004\bK\u0010LJ\u001a\u0010N\u001a\u00020\u000b2\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bN\u0010OR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010P\u001a\u0004\bQ\u0010'R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010R\u001a\u0004\bS\u0010)R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010R\u001a\u0004\bT\u0010)R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010U\u001a\u0004\bV\u0010,R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010W\u001a\u0004\bX\u0010.R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010Y\u001a\u0004\bZ\u00100R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010[\u001a\u0004\b\\\u00102R\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010]\u001a\u0004\b\u0011\u00104R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010^\u001a\u0004\b_\u00106R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010`\u001a\u0004\ba\u00108R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010b\u001a\u0004\bc\u0010:R\u0017\u0010\u0018\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010]\u001a\u0004\bd\u00104R\u0017\u0010\u0019\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010]\u001a\u0004\b\u0019\u00104R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010e\u001a\u0004\bf\u0010>R\u0017\u0010\u001c\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010]\u001a\u0004\bg\u00104R\u0017\u0010\u001d\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010]\u001a\u0004\bh\u00104R\u0017\u0010\u001e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010]\u001a\u0004\bi\u00104R\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b \u0010j\u001a\u0004\bk\u0010CR\u0017\u0010!\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010]\u001a\u0004\b!\u00104R\u0017\u0010\"\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010]\u001a\u0004\bl\u00104R\u0017\u0010#\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010]\u001a\u0004\b#\u00104¨\u0006m"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;", "", "j$/time/LocalDate", "currentDate", "", "Lcom/robinhood/android/models/portfolio/api/AssetClass;", "selectedAssetTypes", "Lcom/robinhood/android/portfolio/pnl/db/SupportedAssetClass;", "supportedAssetTypes", "Lcom/robinhood/models/db/Account;", "account", "", "etfSupported", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubBottomSheetState;", "bottomSheetState", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeDetailSettings;", "tradeDetailSettings", "isTradeDetailSettingsLoaded", "Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossChartSpan;", "chartSpan", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossChart;", "chartData", "Lcom/robinhood/android/portfolio/pnlhub/ProfitAndLossTradeListState;", "tradeListState", "hasClickedShowAllButton", "isChartVisible", "Lcom/robinhood/iso/countrycode/CountryCode;", "locality", "showErrorDialog", "pnlUpdatesEnabled", "cryptoCostBasisEnabled", "", "scrollToSymbol", "isCryptoPnlHubEnabled", "hasSeenCryptoFilterTooltip", "isInMcwRegionGate", "<init>", "(Lj$/time/LocalDate;Ljava/util/List;Ljava/util/List;Lcom/robinhood/models/db/Account;Ljava/lang/Boolean;Lcom/robinhood/android/portfolio/pnlhub/PnlHubBottomSheetState;Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeDetailSettings;ZLcom/robinhood/android/portfolio/pnl/api/ProfitAndLossChartSpan;Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossChart;Lcom/robinhood/android/portfolio/pnlhub/ProfitAndLossTradeListState;ZZLcom/robinhood/iso/countrycode/CountryCode;ZZZLjava/lang/String;ZZZ)V", "component1", "()Lj$/time/LocalDate;", "component2", "()Ljava/util/List;", "component3", "component4", "()Lcom/robinhood/models/db/Account;", "component5", "()Ljava/lang/Boolean;", "component6", "()Lcom/robinhood/android/portfolio/pnlhub/PnlHubBottomSheetState;", "component7", "()Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeDetailSettings;", "component8", "()Z", "component9", "()Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossChartSpan;", "component10", "()Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossChart;", "component11", "()Lcom/robinhood/android/portfolio/pnlhub/ProfitAndLossTradeListState;", "component12", "component13", "component14", "()Lcom/robinhood/iso/countrycode/CountryCode;", "component15", "component16", "component17", "component18", "()Ljava/lang/String;", "component19", "component20", "component21", "copy", "(Lj$/time/LocalDate;Ljava/util/List;Ljava/util/List;Lcom/robinhood/models/db/Account;Ljava/lang/Boolean;Lcom/robinhood/android/portfolio/pnlhub/PnlHubBottomSheetState;Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeDetailSettings;ZLcom/robinhood/android/portfolio/pnl/api/ProfitAndLossChartSpan;Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossChart;Lcom/robinhood/android/portfolio/pnlhub/ProfitAndLossTradeListState;ZZLcom/robinhood/iso/countrycode/CountryCode;ZZZLjava/lang/String;ZZZ)Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/LocalDate;", "getCurrentDate", "Ljava/util/List;", "getSelectedAssetTypes", "getSupportedAssetTypes", "Lcom/robinhood/models/db/Account;", "getAccount", "Ljava/lang/Boolean;", "getEtfSupported", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubBottomSheetState;", "getBottomSheetState", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeDetailSettings;", "getTradeDetailSettings", "Z", "Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossChartSpan;", "getChartSpan", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossChart;", "getChartData", "Lcom/robinhood/android/portfolio/pnlhub/ProfitAndLossTradeListState;", "getTradeListState", "getHasClickedShowAllButton", "Lcom/robinhood/iso/countrycode/CountryCode;", "getLocality", "getShowErrorDialog", "getPnlUpdatesEnabled", "getCryptoCostBasisEnabled", "Ljava/lang/String;", "getScrollToSymbol", "getHasSeenCryptoFilterTooltip", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PnlHubDataState {
    public static final int $stable = 8;
    private final Account account;
    private final PnlHubDataState2 bottomSheetState;
    private final ProfitAndLossChart chartData;
    private final ProfitAndLossChartSpan chartSpan;
    private final boolean cryptoCostBasisEnabled;
    private final LocalDate currentDate;
    private final Boolean etfSupported;
    private final boolean hasClickedShowAllButton;
    private final boolean hasSeenCryptoFilterTooltip;
    private final boolean isChartVisible;
    private final boolean isCryptoPnlHubEnabled;
    private final boolean isInMcwRegionGate;
    private final boolean isTradeDetailSettingsLoaded;
    private final CountryCode locality;
    private final boolean pnlUpdatesEnabled;
    private final String scrollToSymbol;
    private final List<AssetClass> selectedAssetTypes;
    private final boolean showErrorDialog;
    private final List<SupportedAssetClass> supportedAssetTypes;
    private final PnlHubTradeDetailSettings tradeDetailSettings;
    private final ProfitAndLossTradeListState tradeListState;

    public static /* synthetic */ PnlHubDataState copy$default(PnlHubDataState pnlHubDataState, LocalDate localDate, List list, List list2, Account account, Boolean bool, PnlHubDataState2 pnlHubDataState2, PnlHubTradeDetailSettings pnlHubDataState3, boolean z, ProfitAndLossChartSpan profitAndLossChartSpan, ProfitAndLossChart profitAndLossChart, ProfitAndLossTradeListState profitAndLossTradeListState, boolean z2, boolean z3, CountryCode countryCode, boolean z4, boolean z5, boolean z6, String str, boolean z7, boolean z8, boolean z9, int i, Object obj) {
        boolean z10;
        boolean z11;
        LocalDate localDate2 = (i & 1) != 0 ? pnlHubDataState.currentDate : localDate;
        List list3 = (i & 2) != 0 ? pnlHubDataState.selectedAssetTypes : list;
        List list4 = (i & 4) != 0 ? pnlHubDataState.supportedAssetTypes : list2;
        Account account2 = (i & 8) != 0 ? pnlHubDataState.account : account;
        Boolean bool2 = (i & 16) != 0 ? pnlHubDataState.etfSupported : bool;
        PnlHubDataState2 pnlHubDataState22 = (i & 32) != 0 ? pnlHubDataState.bottomSheetState : pnlHubDataState2;
        PnlHubTradeDetailSettings pnlHubDataState32 = (i & 64) != 0 ? pnlHubDataState.tradeDetailSettings : pnlHubDataState3;
        boolean z12 = (i & 128) != 0 ? pnlHubDataState.isTradeDetailSettingsLoaded : z;
        ProfitAndLossChartSpan profitAndLossChartSpan2 = (i & 256) != 0 ? pnlHubDataState.chartSpan : profitAndLossChartSpan;
        ProfitAndLossChart profitAndLossChart2 = (i & 512) != 0 ? pnlHubDataState.chartData : profitAndLossChart;
        ProfitAndLossTradeListState profitAndLossTradeListState2 = (i & 1024) != 0 ? pnlHubDataState.tradeListState : profitAndLossTradeListState;
        boolean z13 = (i & 2048) != 0 ? pnlHubDataState.hasClickedShowAllButton : z2;
        boolean z14 = (i & 4096) != 0 ? pnlHubDataState.isChartVisible : z3;
        CountryCode countryCode2 = (i & 8192) != 0 ? pnlHubDataState.locality : countryCode;
        LocalDate localDate3 = localDate2;
        boolean z15 = (i & 16384) != 0 ? pnlHubDataState.showErrorDialog : z4;
        boolean z16 = (i & 32768) != 0 ? pnlHubDataState.pnlUpdatesEnabled : z5;
        boolean z17 = (i & 65536) != 0 ? pnlHubDataState.cryptoCostBasisEnabled : z6;
        String str2 = (i & 131072) != 0 ? pnlHubDataState.scrollToSymbol : str;
        boolean z18 = (i & 262144) != 0 ? pnlHubDataState.isCryptoPnlHubEnabled : z7;
        boolean z19 = (i & 524288) != 0 ? pnlHubDataState.hasSeenCryptoFilterTooltip : z8;
        if ((i & 1048576) != 0) {
            z11 = z19;
            z10 = pnlHubDataState.isInMcwRegionGate;
        } else {
            z10 = z9;
            z11 = z19;
        }
        return pnlHubDataState.copy(localDate3, list3, list4, account2, bool2, pnlHubDataState22, pnlHubDataState32, z12, profitAndLossChartSpan2, profitAndLossChart2, profitAndLossTradeListState2, z13, z14, countryCode2, z15, z16, z17, str2, z18, z11, z10);
    }

    /* renamed from: component1, reason: from getter */
    public final LocalDate getCurrentDate() {
        return this.currentDate;
    }

    /* renamed from: component10, reason: from getter */
    public final ProfitAndLossChart getChartData() {
        return this.chartData;
    }

    /* renamed from: component11, reason: from getter */
    public final ProfitAndLossTradeListState getTradeListState() {
        return this.tradeListState;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getHasClickedShowAllButton() {
        return this.hasClickedShowAllButton;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsChartVisible() {
        return this.isChartVisible;
    }

    /* renamed from: component14, reason: from getter */
    public final CountryCode getLocality() {
        return this.locality;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getShowErrorDialog() {
        return this.showErrorDialog;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getPnlUpdatesEnabled() {
        return this.pnlUpdatesEnabled;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getCryptoCostBasisEnabled() {
        return this.cryptoCostBasisEnabled;
    }

    /* renamed from: component18, reason: from getter */
    public final String getScrollToSymbol() {
        return this.scrollToSymbol;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getIsCryptoPnlHubEnabled() {
        return this.isCryptoPnlHubEnabled;
    }

    public final List<AssetClass> component2() {
        return this.selectedAssetTypes;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getHasSeenCryptoFilterTooltip() {
        return this.hasSeenCryptoFilterTooltip;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getIsInMcwRegionGate() {
        return this.isInMcwRegionGate;
    }

    public final List<SupportedAssetClass> component3() {
        return this.supportedAssetTypes;
    }

    /* renamed from: component4, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getEtfSupported() {
        return this.etfSupported;
    }

    /* renamed from: component6, reason: from getter */
    public final PnlHubDataState2 getBottomSheetState() {
        return this.bottomSheetState;
    }

    /* renamed from: component7, reason: from getter */
    public final PnlHubTradeDetailSettings getTradeDetailSettings() {
        return this.tradeDetailSettings;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsTradeDetailSettingsLoaded() {
        return this.isTradeDetailSettingsLoaded;
    }

    /* renamed from: component9, reason: from getter */
    public final ProfitAndLossChartSpan getChartSpan() {
        return this.chartSpan;
    }

    public final PnlHubDataState copy(LocalDate currentDate, List<? extends AssetClass> selectedAssetTypes, List<SupportedAssetClass> supportedAssetTypes, Account account, Boolean etfSupported, PnlHubDataState2 bottomSheetState, PnlHubTradeDetailSettings tradeDetailSettings, boolean isTradeDetailSettingsLoaded, ProfitAndLossChartSpan chartSpan, ProfitAndLossChart chartData, ProfitAndLossTradeListState tradeListState, boolean hasClickedShowAllButton, boolean isChartVisible, CountryCode locality, boolean showErrorDialog, boolean pnlUpdatesEnabled, boolean cryptoCostBasisEnabled, String scrollToSymbol, boolean isCryptoPnlHubEnabled, boolean hasSeenCryptoFilterTooltip, boolean isInMcwRegionGate) {
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(selectedAssetTypes, "selectedAssetTypes");
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        Intrinsics.checkNotNullParameter(tradeDetailSettings, "tradeDetailSettings");
        return new PnlHubDataState(currentDate, selectedAssetTypes, supportedAssetTypes, account, etfSupported, bottomSheetState, tradeDetailSettings, isTradeDetailSettingsLoaded, chartSpan, chartData, tradeListState, hasClickedShowAllButton, isChartVisible, locality, showErrorDialog, pnlUpdatesEnabled, cryptoCostBasisEnabled, scrollToSymbol, isCryptoPnlHubEnabled, hasSeenCryptoFilterTooltip, isInMcwRegionGate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PnlHubDataState)) {
            return false;
        }
        PnlHubDataState pnlHubDataState = (PnlHubDataState) other;
        return Intrinsics.areEqual(this.currentDate, pnlHubDataState.currentDate) && Intrinsics.areEqual(this.selectedAssetTypes, pnlHubDataState.selectedAssetTypes) && Intrinsics.areEqual(this.supportedAssetTypes, pnlHubDataState.supportedAssetTypes) && Intrinsics.areEqual(this.account, pnlHubDataState.account) && Intrinsics.areEqual(this.etfSupported, pnlHubDataState.etfSupported) && Intrinsics.areEqual(this.bottomSheetState, pnlHubDataState.bottomSheetState) && Intrinsics.areEqual(this.tradeDetailSettings, pnlHubDataState.tradeDetailSettings) && this.isTradeDetailSettingsLoaded == pnlHubDataState.isTradeDetailSettingsLoaded && this.chartSpan == pnlHubDataState.chartSpan && Intrinsics.areEqual(this.chartData, pnlHubDataState.chartData) && Intrinsics.areEqual(this.tradeListState, pnlHubDataState.tradeListState) && this.hasClickedShowAllButton == pnlHubDataState.hasClickedShowAllButton && this.isChartVisible == pnlHubDataState.isChartVisible && Intrinsics.areEqual(this.locality, pnlHubDataState.locality) && this.showErrorDialog == pnlHubDataState.showErrorDialog && this.pnlUpdatesEnabled == pnlHubDataState.pnlUpdatesEnabled && this.cryptoCostBasisEnabled == pnlHubDataState.cryptoCostBasisEnabled && Intrinsics.areEqual(this.scrollToSymbol, pnlHubDataState.scrollToSymbol) && this.isCryptoPnlHubEnabled == pnlHubDataState.isCryptoPnlHubEnabled && this.hasSeenCryptoFilterTooltip == pnlHubDataState.hasSeenCryptoFilterTooltip && this.isInMcwRegionGate == pnlHubDataState.isInMcwRegionGate;
    }

    public int hashCode() {
        int iHashCode = ((this.currentDate.hashCode() * 31) + this.selectedAssetTypes.hashCode()) * 31;
        List<SupportedAssetClass> list = this.supportedAssetTypes;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Account account = this.account;
        int iHashCode3 = (iHashCode2 + (account == null ? 0 : account.hashCode())) * 31;
        Boolean bool = this.etfSupported;
        int iHashCode4 = (((((((iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31) + this.bottomSheetState.hashCode()) * 31) + this.tradeDetailSettings.hashCode()) * 31) + Boolean.hashCode(this.isTradeDetailSettingsLoaded)) * 31;
        ProfitAndLossChartSpan profitAndLossChartSpan = this.chartSpan;
        int iHashCode5 = (iHashCode4 + (profitAndLossChartSpan == null ? 0 : profitAndLossChartSpan.hashCode())) * 31;
        ProfitAndLossChart profitAndLossChart = this.chartData;
        int iHashCode6 = (iHashCode5 + (profitAndLossChart == null ? 0 : profitAndLossChart.hashCode())) * 31;
        ProfitAndLossTradeListState profitAndLossTradeListState = this.tradeListState;
        int iHashCode7 = (((((iHashCode6 + (profitAndLossTradeListState == null ? 0 : profitAndLossTradeListState.hashCode())) * 31) + Boolean.hashCode(this.hasClickedShowAllButton)) * 31) + Boolean.hashCode(this.isChartVisible)) * 31;
        CountryCode countryCode = this.locality;
        int iHashCode8 = (((((((iHashCode7 + (countryCode == null ? 0 : countryCode.hashCode())) * 31) + Boolean.hashCode(this.showErrorDialog)) * 31) + Boolean.hashCode(this.pnlUpdatesEnabled)) * 31) + Boolean.hashCode(this.cryptoCostBasisEnabled)) * 31;
        String str = this.scrollToSymbol;
        return ((((((iHashCode8 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.isCryptoPnlHubEnabled)) * 31) + Boolean.hashCode(this.hasSeenCryptoFilterTooltip)) * 31) + Boolean.hashCode(this.isInMcwRegionGate);
    }

    public String toString() {
        return "PnlHubDataState(currentDate=" + this.currentDate + ", selectedAssetTypes=" + this.selectedAssetTypes + ", supportedAssetTypes=" + this.supportedAssetTypes + ", account=" + this.account + ", etfSupported=" + this.etfSupported + ", bottomSheetState=" + this.bottomSheetState + ", tradeDetailSettings=" + this.tradeDetailSettings + ", isTradeDetailSettingsLoaded=" + this.isTradeDetailSettingsLoaded + ", chartSpan=" + this.chartSpan + ", chartData=" + this.chartData + ", tradeListState=" + this.tradeListState + ", hasClickedShowAllButton=" + this.hasClickedShowAllButton + ", isChartVisible=" + this.isChartVisible + ", locality=" + this.locality + ", showErrorDialog=" + this.showErrorDialog + ", pnlUpdatesEnabled=" + this.pnlUpdatesEnabled + ", cryptoCostBasisEnabled=" + this.cryptoCostBasisEnabled + ", scrollToSymbol=" + this.scrollToSymbol + ", isCryptoPnlHubEnabled=" + this.isCryptoPnlHubEnabled + ", hasSeenCryptoFilterTooltip=" + this.hasSeenCryptoFilterTooltip + ", isInMcwRegionGate=" + this.isInMcwRegionGate + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PnlHubDataState(LocalDate currentDate, List<? extends AssetClass> selectedAssetTypes, List<SupportedAssetClass> list, Account account, Boolean bool, PnlHubDataState2 bottomSheetState, PnlHubTradeDetailSettings tradeDetailSettings, boolean z, ProfitAndLossChartSpan profitAndLossChartSpan, ProfitAndLossChart profitAndLossChart, ProfitAndLossTradeListState profitAndLossTradeListState, boolean z2, boolean z3, CountryCode countryCode, boolean z4, boolean z5, boolean z6, String str, boolean z7, boolean z8, boolean z9) {
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(selectedAssetTypes, "selectedAssetTypes");
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        Intrinsics.checkNotNullParameter(tradeDetailSettings, "tradeDetailSettings");
        this.currentDate = currentDate;
        this.selectedAssetTypes = selectedAssetTypes;
        this.supportedAssetTypes = list;
        this.account = account;
        this.etfSupported = bool;
        this.bottomSheetState = bottomSheetState;
        this.tradeDetailSettings = tradeDetailSettings;
        this.isTradeDetailSettingsLoaded = z;
        this.chartSpan = profitAndLossChartSpan;
        this.chartData = profitAndLossChart;
        this.tradeListState = profitAndLossTradeListState;
        this.hasClickedShowAllButton = z2;
        this.isChartVisible = z3;
        this.locality = countryCode;
        this.showErrorDialog = z4;
        this.pnlUpdatesEnabled = z5;
        this.cryptoCostBasisEnabled = z6;
        this.scrollToSymbol = str;
        this.isCryptoPnlHubEnabled = z7;
        this.hasSeenCryptoFilterTooltip = z8;
        this.isInMcwRegionGate = z9;
    }

    public final LocalDate getCurrentDate() {
        return this.currentDate;
    }

    public final List<AssetClass> getSelectedAssetTypes() {
        return this.selectedAssetTypes;
    }

    public final List<SupportedAssetClass> getSupportedAssetTypes() {
        return this.supportedAssetTypes;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final Boolean getEtfSupported() {
        return this.etfSupported;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ PnlHubDataState(p479j$.time.LocalDate r26, java.util.List r27, java.util.List r28, com.robinhood.models.p320db.Account r29, java.lang.Boolean r30, com.robinhood.android.portfolio.pnlhub.PnlHubDataState2 r31, com.robinhood.android.portfolio.pnlhub.PnlHubTradeDetailSettings r32, boolean r33, com.robinhood.android.portfolio.pnl.api.ProfitAndLossChartSpan r34, com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossChart r35, com.robinhood.android.portfolio.pnlhub.ProfitAndLossTradeListState r36, boolean r37, boolean r38, com.robinhood.iso.countrycode.CountryCode r39, boolean r40, boolean r41, boolean r42, java.lang.String r43, boolean r44, boolean r45, boolean r46, int r47, kotlin.jvm.internal.DefaultConstructorMarker r48) {
        /*
            Method dump skipped, instructions count: 192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.portfolio.pnlhub.PnlHubDataState.<init>(j$.time.LocalDate, java.util.List, java.util.List, com.robinhood.models.db.Account, java.lang.Boolean, com.robinhood.android.portfolio.pnlhub.PnlHubBottomSheetState, com.robinhood.android.portfolio.pnlhub.PnlHubTradeDetailSettings, boolean, com.robinhood.android.portfolio.pnl.api.ProfitAndLossChartSpan, com.robinhood.android.portfolio.pnl.db.ProfitAndLossChart, com.robinhood.android.portfolio.pnlhub.ProfitAndLossTradeListState, boolean, boolean, com.robinhood.iso.countrycode.CountryCode, boolean, boolean, boolean, java.lang.String, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final PnlHubDataState2 getBottomSheetState() {
        return this.bottomSheetState;
    }

    public final PnlHubTradeDetailSettings getTradeDetailSettings() {
        return this.tradeDetailSettings;
    }

    public final boolean isTradeDetailSettingsLoaded() {
        return this.isTradeDetailSettingsLoaded;
    }

    public final ProfitAndLossChartSpan getChartSpan() {
        return this.chartSpan;
    }

    public final ProfitAndLossChart getChartData() {
        return this.chartData;
    }

    public final ProfitAndLossTradeListState getTradeListState() {
        return this.tradeListState;
    }

    public final boolean getHasClickedShowAllButton() {
        return this.hasClickedShowAllButton;
    }

    public final boolean isChartVisible() {
        return this.isChartVisible;
    }

    public final CountryCode getLocality() {
        return this.locality;
    }

    public final boolean getShowErrorDialog() {
        return this.showErrorDialog;
    }

    public final boolean getPnlUpdatesEnabled() {
        return this.pnlUpdatesEnabled;
    }

    public final boolean getCryptoCostBasisEnabled() {
        return this.cryptoCostBasisEnabled;
    }

    public final String getScrollToSymbol() {
        return this.scrollToSymbol;
    }

    public final boolean isCryptoPnlHubEnabled() {
        return this.isCryptoPnlHubEnabled;
    }

    public final boolean getHasSeenCryptoFilterTooltip() {
        return this.hasSeenCryptoFilterTooltip;
    }

    public final boolean isInMcwRegionGate() {
        return this.isInMcwRegionGate;
    }
}
