package com.robinhood.android.portfolio.pnlhub;

import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.android.portfolio.pnl.PnlHubAssetClass;
import com.robinhood.android.portfolio.pnl.api.ProfitAndLossChartSpan;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossChart;
import com.robinhood.android.portfolio.pnl.p214db.SupportedAssetClass;
import com.robinhood.android.portfolio.pnlhub.PnlHubTradeListDisclosureState;
import com.robinhood.android.portfolio.pnlhub.PnlHubViewState;
import com.robinhood.android.portfolio.pnlhub.p216ui.C25819R;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;
import p479j$.time.Month;

/* compiled from: PnlHubStateProvider.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\b\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\f\u001a\u00020\rH\u0002J*\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\nH\u0002¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/PnlHubStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubViewState;", "<init>", "()V", "reduce", "dataState", "toPnlHubAssetClasses", "", "Lcom/robinhood/android/portfolio/pnl/PnlHubAssetClass;", "Lcom/robinhood/android/portfolio/pnl/db/SupportedAssetClass;", "etfSupported", "", "getTradeListDisclosureState", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeListDisclosureState;", "locality", "Lcom/robinhood/iso/countrycode/CountryCode;", "isCryptoPnlHubEnabled", "chartSpan", "Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossChartSpan;", "selectedAsset", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PnlHubStateProvider implements StateProvider<PnlHubDataState, PnlHubViewState> {
    public static final int $stable = 0;

    /* compiled from: PnlHubStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AssetClass.values().length];
            try {
                iArr[AssetClass.CRYPTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetClass.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AssetClass.FOREX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AssetClass.EQUITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AssetClass.OPTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0121  */
    @Override // com.robinhood.android.udf.StateProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PnlHubViewState reduce(PnlHubDataState dataState) {
        boolean z;
        DisplaySpan displaySpan;
        boolean z2;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getAccount() != null && dataState.getSupportedAssetTypes() != null && dataState.getLocality() != null && dataState.getEtfSupported() != null && dataState.getChartData() != null) {
            List<SupportedAssetClass> supportedAssetTypes = dataState.getSupportedAssetTypes();
            if ((supportedAssetTypes instanceof Collection) && supportedAssetTypes.isEmpty()) {
                z = false;
            } else {
                Iterator<T> it = supportedAssetTypes.iterator();
                while (it.hasNext()) {
                    if (((SupportedAssetClass) it.next()).getAssetClass() == AssetClass.OPTION) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            PnlHubAssetClass pnlHubAssetClass = PnlHubViewState2.toPnlHubAssetClass(dataState.getSelectedAssetTypes(), z, dataState.getEtfSupported().booleanValue(), dataState.isCryptoPnlHubEnabled());
            String accountNumber = dataState.getAccount().getAccountNumber();
            boolean zDetermineIfSelectedAssetClassHasData = PnlHubStateProvider2.determineIfSelectedAssetClassHasData(dataState.getSupportedAssetTypes(), pnlHubAssetClass);
            List<PnlHubAssetClass> pnlHubAssetClasses = toPnlHubAssetClasses(dataState.getSupportedAssetTypes(), dataState.getEtfSupported().booleanValue());
            ProfitAndLossChartSpan chartSpan = dataState.getChartSpan();
            if (chartSpan == null || (displaySpan = PnlHubViewState2.toDisplaySpan(chartSpan)) == null) {
                displaySpan = DisplaySpan.YTD;
            }
            DisplaySpan displaySpan2 = displaySpan;
            ProfitAndLossChart chartData = dataState.getChartData();
            PnlHubDataState2 bottomSheetState = dataState.getBottomSheetState();
            PnlHubTradeDetailSettings tradeDetailSettings = dataState.getTradeDetailSettings();
            boolean zIsTradeDetailSettingsLoaded = dataState.isTradeDetailSettingsLoaded();
            CountryCode locality = dataState.getLocality();
            ProfitAndLossTradeListState tradeListState = dataState.getTradeListState();
            PnlHubTradeListDisclosureState tradeListDisclosureState = getTradeListDisclosureState(dataState.getLocality(), dataState.isCryptoPnlHubEnabled(), dataState.getChartSpan(), pnlHubAssetClass);
            boolean hasClickedShowAllButton = dataState.getHasClickedShowAllButton();
            boolean zIsChartVisible = dataState.isChartVisible();
            boolean showErrorDialog = dataState.getShowErrorDialog();
            boolean pnlUpdatesEnabled = dataState.getPnlUpdatesEnabled();
            String scrollToSymbol = dataState.getScrollToSymbol();
            boolean zIsCryptoPnlHubEnabled = dataState.isCryptoPnlHubEnabled();
            boolean cryptoCostBasisEnabled = dataState.getCryptoCostBasisEnabled();
            boolean z3 = dataState.isCryptoPnlHubEnabled() && !dataState.getHasSeenCryptoFilterTooltip() && pnlHubAssetClass == PnlHubAssetClass.ALL && dataState.getCurrentDate().isBefore(LocalDate.m3378of(2026, Month.JULY, 1));
            if (dataState.isCryptoPnlHubEnabled()) {
                ProfitAndLossChartSpan chartSpan2 = dataState.getChartSpan();
                if ((chartSpan2 != null ? PnlHubViewState2.toDisplaySpan(chartSpan2) : null) == DisplaySpan.ALL) {
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            return new PnlHubViewState.Ready(pnlHubAssetClasses, zDetermineIfSelectedAssetClassHasData, pnlHubAssetClass, accountNumber, displaySpan2, chartData, bottomSheetState, tradeDetailSettings, zIsTradeDetailSettingsLoaded, z, locality, tradeListState, tradeListDisclosureState, hasClickedShowAllButton, zIsChartVisible, showErrorDialog, pnlUpdatesEnabled, cryptoCostBasisEnabled, scrollToSymbol, zIsCryptoPnlHubEnabled, z3, z2, dataState.isInMcwRegionGate());
        }
        return PnlHubViewState.Loading.INSTANCE;
    }

    private final List<PnlHubAssetClass> toPnlHubAssetClasses(List<SupportedAssetClass> list, boolean z) {
        PnlHubAssetClass pnlHubAssetClass;
        ArrayList arrayList = new ArrayList();
        if (list.size() > 1) {
            arrayList.add(PnlHubAssetClass.ALL);
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int i = WhenMappings.$EnumSwitchMapping$0[((SupportedAssetClass) it.next()).getAssetClass().ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    arrayList.add(PnlHubAssetClass.CRYPTO);
                } else if (i == 4) {
                    if (z) {
                        pnlHubAssetClass = PnlHubAssetClass.EQUITY_ETF;
                    } else {
                        pnlHubAssetClass = PnlHubAssetClass.EQUITY;
                    }
                    arrayList.add(pnlHubAssetClass);
                } else {
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    arrayList.add(PnlHubAssetClass.OPTIONS);
                }
            }
        }
        return arrayList;
    }

    private final PnlHubTradeListDisclosureState getTradeListDisclosureState(CountryCode locality, boolean isCryptoPnlHubEnabled, ProfitAndLossChartSpan chartSpan, PnlHubAssetClass selectedAsset) {
        if (locality instanceof CountryCode.Supported.UnitedKingdom) {
            return new PnlHubTradeListDisclosureState.DisclosureWithUrlLink(C25819R.string.pnl_hub_list_disclosure_text_uk, C25819R.string.pnl_hub_list_disclosure_text_uk_inline_link_text, C25819R.string.pnl_hub_list_disclosure_text_uk_inline_url_link);
        }
        if (isCryptoPnlHubEnabled && chartSpan == ProfitAndLossChartSpan.MAX && selectedAsset == PnlHubAssetClass.ALL) {
            return new PnlHubTradeListDisclosureState.Disclosure(C25819R.string.gated_crypto_pnl_hub_list_disclosure_text_crypto);
        }
        return new PnlHubTradeListDisclosureState.Disclosure(C25819R.string.pnl_hub_list_disclosure_text);
    }
}
