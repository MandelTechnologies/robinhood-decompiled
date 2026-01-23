package com.robinhood.android.portfolio.pnlhub.appbar;

import com.robinhood.android.portfolio.pnl.PnlHubAssetClass;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.iso.countrycode.CountryCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PnlHubTopAppBarDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/appbar/PnlHubTopAppBarStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/portfolio/pnlhub/appbar/PnlHubTopAppBarDataState;", "Lcom/robinhood/android/portfolio/pnlhub/appbar/PnlHubTopAppBarViewState;", "<init>", "()V", "reduce", "dataState", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarStateProvider, reason: use source file name */
/* loaded from: classes11.dex */
public final class PnlHubTopAppBarDuxo4 implements StateProvider<PnlHubTopAppBarDataState, PnlHubTopAppBarViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public PnlHubTopAppBarViewState reduce(PnlHubTopAppBarDataState dataState) {
        String str;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        List<PnlHubAssetClass> availableAssetClasses = dataState.getAvailableAssetClasses();
        PnlHubAssetClass selectedAssetClass = dataState.getSelectedAssetClass();
        CountryCode locality = dataState.getLocality();
        if (Intrinsics.areEqual(locality != null ? locality.getIso3166CountryCode() : null, CountryCode.COUNTRY_CODE_GB)) {
            str = "2Thp3BSEOPVeFnEUCTefuM";
        } else if (dataState.getOptionsSupported() && dataState.getCryptoSupported()) {
            if (dataState.isCryptoUsCostBasisExperimentEnabled()) {
                str = "6xoGtkRhipcEGYFwcdTxhu";
            } else {
                str = "9iIcIGQt5SRBWtu31NftQ";
            }
        } else if (dataState.getOptionsSupported() && !dataState.getCryptoSupported()) {
            str = "czNChnzZvc1MMkwLHRdS3";
        } else if (!dataState.getOptionsSupported() && dataState.getCryptoSupported()) {
            if (dataState.isCryptoUsCostBasisExperimentEnabled()) {
                str = "5LlscVKSC31SAsD2O6tfCs";
            } else {
                str = "7ngqOxQ3OeHiuONcRlA4Ko";
            }
        } else {
            str = "407Niw0qik27q57474n6Us";
        }
        return new PnlHubTopAppBarViewState(availableAssetClasses, selectedAssetClass, str, dataState.getShowCryptoFilterTooltip());
    }
}
