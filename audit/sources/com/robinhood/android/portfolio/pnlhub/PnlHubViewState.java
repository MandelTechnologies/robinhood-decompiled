package com.robinhood.android.portfolio.pnlhub;

import com.robinhood.android.portfolio.pnl.PnlHubAssetClass;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossChart;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PnlHubViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0005\u0006R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/PnlHubViewState;", "", "isReadyAndSettingsLoaded", "", "()Z", "Ready", "Loading", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubViewState$Loading;", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubViewState$Ready;", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public interface PnlHubViewState {
    boolean isReadyAndSettingsLoaded();

    /* compiled from: PnlHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bE\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BË\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0006\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010 \u001a\u00020\u0006\u0012\u0006\u0010!\u001a\u00020\u0006\u0012\u0006\u0010\"\u001a\u00020\u0006\u0012\u0006\u0010#\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0006HÆ\u0003J\t\u0010G\u001a\u00020\u0004HÆ\u0003J\t\u0010H\u001a\u00020\tHÆ\u0003J\t\u0010I\u001a\u00020\u000bHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010K\u001a\u00020\u000fHÆ\u0003J\t\u0010L\u001a\u00020\u0011HÆ\u0003J\t\u0010M\u001a\u00020\u0006HÆ\u0003J\t\u0010N\u001a\u00020\u0006HÆ\u0003J\t\u0010O\u001a\u00020\u0015HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010Q\u001a\u00020\u0019HÆ\u0003J\t\u0010R\u001a\u00020\u0006HÆ\u0003J\t\u0010S\u001a\u00020\u0006HÆ\u0003J\t\u0010T\u001a\u00020\u0006HÆ\u0003J\t\u0010U\u001a\u00020\u0006HÆ\u0003J\t\u0010V\u001a\u00020\u0006HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010X\u001a\u00020\u0006HÆ\u0003J\t\u0010Y\u001a\u00020\u0006HÆ\u0003J\t\u0010Z\u001a\u00020\u0006HÆ\u0003J\t\u0010[\u001a\u00020\u0006HÆ\u0003Jû\u0001\u0010\\\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u00062\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\u0006HÆ\u0001J\u0013\u0010]\u001a\u00020\u00062\b\u0010^\u001a\u0004\u0018\u00010_HÖ\u0003J\t\u0010`\u001a\u00020aHÖ\u0001J\t\u0010b\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010)R\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b6\u0010)R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\u001a\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b=\u0010)R\u0011\u0010\u001b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010)R\u0011\u0010\u001c\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b>\u0010)R\u0011\u0010\u001d\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b?\u0010)R\u0011\u0010\u001e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b@\u0010)R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bA\u0010-R\u0011\u0010 \u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010)R\u0011\u0010!\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bB\u0010)R\u0011\u0010\"\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bC\u0010)R\u0011\u0010#\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bD\u0010)¨\u0006c"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/PnlHubViewState$Ready;", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubViewState;", "availableAssetClasses", "", "Lcom/robinhood/android/portfolio/pnl/PnlHubAssetClass;", "selectedAssetHasData", "", "selectedAssetClass", "accountNumber", "", "chartSpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "chartData", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossChart;", "bottomSheetState", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubBottomSheetState;", "tradeDetailSettings", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeDetailSettings;", "isTradeDetailSettingsLoaded", "optionsSupported", "locality", "Lcom/robinhood/iso/countrycode/CountryCode;", "tradeListState", "Lcom/robinhood/android/portfolio/pnlhub/ProfitAndLossTradeListState;", "tradeListDisclosureState", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeListDisclosureState;", "hasClickedShowAllButton", "isChartVisible", "showErrorDialog", "pnlUpdatesEnabled", "cryptoCostBasisEnabled", "scrollToSymbol", "isCryptoPnlHubEnabled", "showCryptoFilterTooltip", "showChartHeaderSecondaryTextTrailingIcon", "showDisplayCurrencyLabel", "<init>", "(Ljava/util/List;ZLcom/robinhood/android/portfolio/pnl/PnlHubAssetClass;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossChart;Lcom/robinhood/android/portfolio/pnlhub/PnlHubBottomSheetState;Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeDetailSettings;ZZLcom/robinhood/iso/countrycode/CountryCode;Lcom/robinhood/android/portfolio/pnlhub/ProfitAndLossTradeListState;Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeListDisclosureState;ZZZZZLjava/lang/String;ZZZZ)V", "getAvailableAssetClasses", "()Ljava/util/List;", "getSelectedAssetHasData", "()Z", "getSelectedAssetClass", "()Lcom/robinhood/android/portfolio/pnl/PnlHubAssetClass;", "getAccountNumber", "()Ljava/lang/String;", "getChartSpan", "()Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "getChartData", "()Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossChart;", "getBottomSheetState", "()Lcom/robinhood/android/portfolio/pnlhub/PnlHubBottomSheetState;", "getTradeDetailSettings", "()Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeDetailSettings;", "getOptionsSupported", "getLocality", "()Lcom/robinhood/iso/countrycode/CountryCode;", "getTradeListState", "()Lcom/robinhood/android/portfolio/pnlhub/ProfitAndLossTradeListState;", "getTradeListDisclosureState", "()Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeListDisclosureState;", "getHasClickedShowAllButton", "getShowErrorDialog", "getPnlUpdatesEnabled", "getCryptoCostBasisEnabled", "getScrollToSymbol", "getShowCryptoFilterTooltip", "getShowChartHeaderSecondaryTextTrailingIcon", "getShowDisplayCurrencyLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Ready implements PnlHubViewState {
        public static final int $stable = 8;
        private final String accountNumber;
        private final List<PnlHubAssetClass> availableAssetClasses;
        private final PnlHubDataState2 bottomSheetState;
        private final ProfitAndLossChart chartData;
        private final DisplaySpan chartSpan;
        private final boolean cryptoCostBasisEnabled;
        private final boolean hasClickedShowAllButton;
        private final boolean isChartVisible;
        private final boolean isCryptoPnlHubEnabled;
        private final boolean isTradeDetailSettingsLoaded;
        private final CountryCode locality;
        private final boolean optionsSupported;
        private final boolean pnlUpdatesEnabled;
        private final String scrollToSymbol;
        private final PnlHubAssetClass selectedAssetClass;
        private final boolean selectedAssetHasData;
        private final boolean showChartHeaderSecondaryTextTrailingIcon;
        private final boolean showCryptoFilterTooltip;
        private final boolean showDisplayCurrencyLabel;
        private final boolean showErrorDialog;
        private final PnlHubTradeDetailSettings tradeDetailSettings;
        private final PnlHubTradeListDisclosureState tradeListDisclosureState;
        private final ProfitAndLossTradeListState tradeListState;

        public static /* synthetic */ Ready copy$default(Ready ready, List list, boolean z, PnlHubAssetClass pnlHubAssetClass, String str, DisplaySpan displaySpan, ProfitAndLossChart profitAndLossChart, PnlHubDataState2 pnlHubDataState2, PnlHubTradeDetailSettings pnlHubTradeDetailSettings, boolean z2, boolean z3, CountryCode countryCode, ProfitAndLossTradeListState profitAndLossTradeListState, PnlHubTradeListDisclosureState pnlHubTradeListDisclosureState, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str2, boolean z9, boolean z10, boolean z11, boolean z12, int i, Object obj) {
            boolean z13;
            boolean z14;
            List list2 = (i & 1) != 0 ? ready.availableAssetClasses : list;
            boolean z15 = (i & 2) != 0 ? ready.selectedAssetHasData : z;
            PnlHubAssetClass pnlHubAssetClass2 = (i & 4) != 0 ? ready.selectedAssetClass : pnlHubAssetClass;
            String str3 = (i & 8) != 0 ? ready.accountNumber : str;
            DisplaySpan displaySpan2 = (i & 16) != 0 ? ready.chartSpan : displaySpan;
            ProfitAndLossChart profitAndLossChart2 = (i & 32) != 0 ? ready.chartData : profitAndLossChart;
            PnlHubDataState2 pnlHubDataState22 = (i & 64) != 0 ? ready.bottomSheetState : pnlHubDataState2;
            PnlHubTradeDetailSettings pnlHubTradeDetailSettings2 = (i & 128) != 0 ? ready.tradeDetailSettings : pnlHubTradeDetailSettings;
            boolean z16 = (i & 256) != 0 ? ready.isTradeDetailSettingsLoaded : z2;
            boolean z17 = (i & 512) != 0 ? ready.optionsSupported : z3;
            CountryCode countryCode2 = (i & 1024) != 0 ? ready.locality : countryCode;
            ProfitAndLossTradeListState profitAndLossTradeListState2 = (i & 2048) != 0 ? ready.tradeListState : profitAndLossTradeListState;
            PnlHubTradeListDisclosureState pnlHubTradeListDisclosureState2 = (i & 4096) != 0 ? ready.tradeListDisclosureState : pnlHubTradeListDisclosureState;
            boolean z18 = (i & 8192) != 0 ? ready.hasClickedShowAllButton : z4;
            List list3 = list2;
            boolean z19 = (i & 16384) != 0 ? ready.isChartVisible : z5;
            boolean z20 = (i & 32768) != 0 ? ready.showErrorDialog : z6;
            boolean z21 = (i & 65536) != 0 ? ready.pnlUpdatesEnabled : z7;
            boolean z22 = (i & 131072) != 0 ? ready.cryptoCostBasisEnabled : z8;
            String str4 = (i & 262144) != 0 ? ready.scrollToSymbol : str2;
            boolean z23 = (i & 524288) != 0 ? ready.isCryptoPnlHubEnabled : z9;
            boolean z24 = (i & 1048576) != 0 ? ready.showCryptoFilterTooltip : z10;
            boolean z25 = (i & 2097152) != 0 ? ready.showChartHeaderSecondaryTextTrailingIcon : z11;
            if ((i & 4194304) != 0) {
                z14 = z25;
                z13 = ready.showDisplayCurrencyLabel;
            } else {
                z13 = z12;
                z14 = z25;
            }
            return ready.copy(list3, z15, pnlHubAssetClass2, str3, displaySpan2, profitAndLossChart2, pnlHubDataState22, pnlHubTradeDetailSettings2, z16, z17, countryCode2, profitAndLossTradeListState2, pnlHubTradeListDisclosureState2, z18, z19, z20, z21, z22, str4, z23, z24, z14, z13);
        }

        public final List<PnlHubAssetClass> component1() {
            return this.availableAssetClasses;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getOptionsSupported() {
            return this.optionsSupported;
        }

        /* renamed from: component11, reason: from getter */
        public final CountryCode getLocality() {
            return this.locality;
        }

        /* renamed from: component12, reason: from getter */
        public final ProfitAndLossTradeListState getTradeListState() {
            return this.tradeListState;
        }

        /* renamed from: component13, reason: from getter */
        public final PnlHubTradeListDisclosureState getTradeListDisclosureState() {
            return this.tradeListDisclosureState;
        }

        /* renamed from: component14, reason: from getter */
        public final boolean getHasClickedShowAllButton() {
            return this.hasClickedShowAllButton;
        }

        /* renamed from: component15, reason: from getter */
        public final boolean getIsChartVisible() {
            return this.isChartVisible;
        }

        /* renamed from: component16, reason: from getter */
        public final boolean getShowErrorDialog() {
            return this.showErrorDialog;
        }

        /* renamed from: component17, reason: from getter */
        public final boolean getPnlUpdatesEnabled() {
            return this.pnlUpdatesEnabled;
        }

        /* renamed from: component18, reason: from getter */
        public final boolean getCryptoCostBasisEnabled() {
            return this.cryptoCostBasisEnabled;
        }

        /* renamed from: component19, reason: from getter */
        public final String getScrollToSymbol() {
            return this.scrollToSymbol;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSelectedAssetHasData() {
            return this.selectedAssetHasData;
        }

        /* renamed from: component20, reason: from getter */
        public final boolean getIsCryptoPnlHubEnabled() {
            return this.isCryptoPnlHubEnabled;
        }

        /* renamed from: component21, reason: from getter */
        public final boolean getShowCryptoFilterTooltip() {
            return this.showCryptoFilterTooltip;
        }

        /* renamed from: component22, reason: from getter */
        public final boolean getShowChartHeaderSecondaryTextTrailingIcon() {
            return this.showChartHeaderSecondaryTextTrailingIcon;
        }

        /* renamed from: component23, reason: from getter */
        public final boolean getShowDisplayCurrencyLabel() {
            return this.showDisplayCurrencyLabel;
        }

        /* renamed from: component3, reason: from getter */
        public final PnlHubAssetClass getSelectedAssetClass() {
            return this.selectedAssetClass;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component5, reason: from getter */
        public final DisplaySpan getChartSpan() {
            return this.chartSpan;
        }

        /* renamed from: component6, reason: from getter */
        public final ProfitAndLossChart getChartData() {
            return this.chartData;
        }

        /* renamed from: component7, reason: from getter */
        public final PnlHubDataState2 getBottomSheetState() {
            return this.bottomSheetState;
        }

        /* renamed from: component8, reason: from getter */
        public final PnlHubTradeDetailSettings getTradeDetailSettings() {
            return this.tradeDetailSettings;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getIsTradeDetailSettingsLoaded() {
            return this.isTradeDetailSettingsLoaded;
        }

        public final Ready copy(List<? extends PnlHubAssetClass> availableAssetClasses, boolean selectedAssetHasData, PnlHubAssetClass selectedAssetClass, String accountNumber, DisplaySpan chartSpan, ProfitAndLossChart chartData, PnlHubDataState2 bottomSheetState, PnlHubTradeDetailSettings tradeDetailSettings, boolean isTradeDetailSettingsLoaded, boolean optionsSupported, CountryCode locality, ProfitAndLossTradeListState tradeListState, PnlHubTradeListDisclosureState tradeListDisclosureState, boolean hasClickedShowAllButton, boolean isChartVisible, boolean showErrorDialog, boolean pnlUpdatesEnabled, boolean cryptoCostBasisEnabled, String scrollToSymbol, boolean isCryptoPnlHubEnabled, boolean showCryptoFilterTooltip, boolean showChartHeaderSecondaryTextTrailingIcon, boolean showDisplayCurrencyLabel) {
            Intrinsics.checkNotNullParameter(availableAssetClasses, "availableAssetClasses");
            Intrinsics.checkNotNullParameter(selectedAssetClass, "selectedAssetClass");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(chartSpan, "chartSpan");
            Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
            Intrinsics.checkNotNullParameter(tradeDetailSettings, "tradeDetailSettings");
            Intrinsics.checkNotNullParameter(locality, "locality");
            Intrinsics.checkNotNullParameter(tradeListDisclosureState, "tradeListDisclosureState");
            return new Ready(availableAssetClasses, selectedAssetHasData, selectedAssetClass, accountNumber, chartSpan, chartData, bottomSheetState, tradeDetailSettings, isTradeDetailSettingsLoaded, optionsSupported, locality, tradeListState, tradeListDisclosureState, hasClickedShowAllButton, isChartVisible, showErrorDialog, pnlUpdatesEnabled, cryptoCostBasisEnabled, scrollToSymbol, isCryptoPnlHubEnabled, showCryptoFilterTooltip, showChartHeaderSecondaryTextTrailingIcon, showDisplayCurrencyLabel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) other;
            return Intrinsics.areEqual(this.availableAssetClasses, ready.availableAssetClasses) && this.selectedAssetHasData == ready.selectedAssetHasData && this.selectedAssetClass == ready.selectedAssetClass && Intrinsics.areEqual(this.accountNumber, ready.accountNumber) && this.chartSpan == ready.chartSpan && Intrinsics.areEqual(this.chartData, ready.chartData) && Intrinsics.areEqual(this.bottomSheetState, ready.bottomSheetState) && Intrinsics.areEqual(this.tradeDetailSettings, ready.tradeDetailSettings) && this.isTradeDetailSettingsLoaded == ready.isTradeDetailSettingsLoaded && this.optionsSupported == ready.optionsSupported && Intrinsics.areEqual(this.locality, ready.locality) && Intrinsics.areEqual(this.tradeListState, ready.tradeListState) && Intrinsics.areEqual(this.tradeListDisclosureState, ready.tradeListDisclosureState) && this.hasClickedShowAllButton == ready.hasClickedShowAllButton && this.isChartVisible == ready.isChartVisible && this.showErrorDialog == ready.showErrorDialog && this.pnlUpdatesEnabled == ready.pnlUpdatesEnabled && this.cryptoCostBasisEnabled == ready.cryptoCostBasisEnabled && Intrinsics.areEqual(this.scrollToSymbol, ready.scrollToSymbol) && this.isCryptoPnlHubEnabled == ready.isCryptoPnlHubEnabled && this.showCryptoFilterTooltip == ready.showCryptoFilterTooltip && this.showChartHeaderSecondaryTextTrailingIcon == ready.showChartHeaderSecondaryTextTrailingIcon && this.showDisplayCurrencyLabel == ready.showDisplayCurrencyLabel;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.availableAssetClasses.hashCode() * 31) + Boolean.hashCode(this.selectedAssetHasData)) * 31) + this.selectedAssetClass.hashCode()) * 31) + this.accountNumber.hashCode()) * 31) + this.chartSpan.hashCode()) * 31;
            ProfitAndLossChart profitAndLossChart = this.chartData;
            int iHashCode2 = (((((((((((iHashCode + (profitAndLossChart == null ? 0 : profitAndLossChart.hashCode())) * 31) + this.bottomSheetState.hashCode()) * 31) + this.tradeDetailSettings.hashCode()) * 31) + Boolean.hashCode(this.isTradeDetailSettingsLoaded)) * 31) + Boolean.hashCode(this.optionsSupported)) * 31) + this.locality.hashCode()) * 31;
            ProfitAndLossTradeListState profitAndLossTradeListState = this.tradeListState;
            int iHashCode3 = (((((((((((((iHashCode2 + (profitAndLossTradeListState == null ? 0 : profitAndLossTradeListState.hashCode())) * 31) + this.tradeListDisclosureState.hashCode()) * 31) + Boolean.hashCode(this.hasClickedShowAllButton)) * 31) + Boolean.hashCode(this.isChartVisible)) * 31) + Boolean.hashCode(this.showErrorDialog)) * 31) + Boolean.hashCode(this.pnlUpdatesEnabled)) * 31) + Boolean.hashCode(this.cryptoCostBasisEnabled)) * 31;
            String str = this.scrollToSymbol;
            return ((((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.isCryptoPnlHubEnabled)) * 31) + Boolean.hashCode(this.showCryptoFilterTooltip)) * 31) + Boolean.hashCode(this.showChartHeaderSecondaryTextTrailingIcon)) * 31) + Boolean.hashCode(this.showDisplayCurrencyLabel);
        }

        public String toString() {
            return "Ready(availableAssetClasses=" + this.availableAssetClasses + ", selectedAssetHasData=" + this.selectedAssetHasData + ", selectedAssetClass=" + this.selectedAssetClass + ", accountNumber=" + this.accountNumber + ", chartSpan=" + this.chartSpan + ", chartData=" + this.chartData + ", bottomSheetState=" + this.bottomSheetState + ", tradeDetailSettings=" + this.tradeDetailSettings + ", isTradeDetailSettingsLoaded=" + this.isTradeDetailSettingsLoaded + ", optionsSupported=" + this.optionsSupported + ", locality=" + this.locality + ", tradeListState=" + this.tradeListState + ", tradeListDisclosureState=" + this.tradeListDisclosureState + ", hasClickedShowAllButton=" + this.hasClickedShowAllButton + ", isChartVisible=" + this.isChartVisible + ", showErrorDialog=" + this.showErrorDialog + ", pnlUpdatesEnabled=" + this.pnlUpdatesEnabled + ", cryptoCostBasisEnabled=" + this.cryptoCostBasisEnabled + ", scrollToSymbol=" + this.scrollToSymbol + ", isCryptoPnlHubEnabled=" + this.isCryptoPnlHubEnabled + ", showCryptoFilterTooltip=" + this.showCryptoFilterTooltip + ", showChartHeaderSecondaryTextTrailingIcon=" + this.showChartHeaderSecondaryTextTrailingIcon + ", showDisplayCurrencyLabel=" + this.showDisplayCurrencyLabel + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Ready(List<? extends PnlHubAssetClass> availableAssetClasses, boolean z, PnlHubAssetClass selectedAssetClass, String accountNumber, DisplaySpan chartSpan, ProfitAndLossChart profitAndLossChart, PnlHubDataState2 bottomSheetState, PnlHubTradeDetailSettings tradeDetailSettings, boolean z2, boolean z3, CountryCode locality, ProfitAndLossTradeListState profitAndLossTradeListState, PnlHubTradeListDisclosureState tradeListDisclosureState, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str, boolean z9, boolean z10, boolean z11, boolean z12) {
            Intrinsics.checkNotNullParameter(availableAssetClasses, "availableAssetClasses");
            Intrinsics.checkNotNullParameter(selectedAssetClass, "selectedAssetClass");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(chartSpan, "chartSpan");
            Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
            Intrinsics.checkNotNullParameter(tradeDetailSettings, "tradeDetailSettings");
            Intrinsics.checkNotNullParameter(locality, "locality");
            Intrinsics.checkNotNullParameter(tradeListDisclosureState, "tradeListDisclosureState");
            this.availableAssetClasses = availableAssetClasses;
            this.selectedAssetHasData = z;
            this.selectedAssetClass = selectedAssetClass;
            this.accountNumber = accountNumber;
            this.chartSpan = chartSpan;
            this.chartData = profitAndLossChart;
            this.bottomSheetState = bottomSheetState;
            this.tradeDetailSettings = tradeDetailSettings;
            this.isTradeDetailSettingsLoaded = z2;
            this.optionsSupported = z3;
            this.locality = locality;
            this.tradeListState = profitAndLossTradeListState;
            this.tradeListDisclosureState = tradeListDisclosureState;
            this.hasClickedShowAllButton = z4;
            this.isChartVisible = z5;
            this.showErrorDialog = z6;
            this.pnlUpdatesEnabled = z7;
            this.cryptoCostBasisEnabled = z8;
            this.scrollToSymbol = str;
            this.isCryptoPnlHubEnabled = z9;
            this.showCryptoFilterTooltip = z10;
            this.showChartHeaderSecondaryTextTrailingIcon = z11;
            this.showDisplayCurrencyLabel = z12;
        }

        @Override // com.robinhood.android.portfolio.pnlhub.PnlHubViewState
        public boolean isReadyAndSettingsLoaded() {
            return DefaultImpls.isReadyAndSettingsLoaded(this);
        }

        public final List<PnlHubAssetClass> getAvailableAssetClasses() {
            return this.availableAssetClasses;
        }

        public final boolean getSelectedAssetHasData() {
            return this.selectedAssetHasData;
        }

        public final PnlHubAssetClass getSelectedAssetClass() {
            return this.selectedAssetClass;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final DisplaySpan getChartSpan() {
            return this.chartSpan;
        }

        public final ProfitAndLossChart getChartData() {
            return this.chartData;
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

        public final boolean getOptionsSupported() {
            return this.optionsSupported;
        }

        public final CountryCode getLocality() {
            return this.locality;
        }

        public final ProfitAndLossTradeListState getTradeListState() {
            return this.tradeListState;
        }

        public final PnlHubTradeListDisclosureState getTradeListDisclosureState() {
            return this.tradeListDisclosureState;
        }

        public final boolean getHasClickedShowAllButton() {
            return this.hasClickedShowAllButton;
        }

        public final boolean isChartVisible() {
            return this.isChartVisible;
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

        public final boolean getShowCryptoFilterTooltip() {
            return this.showCryptoFilterTooltip;
        }

        public final boolean getShowChartHeaderSecondaryTextTrailingIcon() {
            return this.showChartHeaderSecondaryTextTrailingIcon;
        }

        public final boolean getShowDisplayCurrencyLabel() {
            return this.showDisplayCurrencyLabel;
        }
    }

    /* compiled from: PnlHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/PnlHubViewState$Loading;", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements PnlHubViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1138533798;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }

        @Override // com.robinhood.android.portfolio.pnlhub.PnlHubViewState
        public boolean isReadyAndSettingsLoaded() {
            return DefaultImpls.isReadyAndSettingsLoaded(this);
        }
    }

    /* compiled from: PnlHubViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static boolean isReadyAndSettingsLoaded(PnlHubViewState pnlHubViewState) {
            return (pnlHubViewState instanceof Ready) && ((Ready) pnlHubViewState).isTradeDetailSettingsLoaded();
        }
    }
}
