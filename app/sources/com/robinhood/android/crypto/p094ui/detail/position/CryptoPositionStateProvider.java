package com.robinhood.android.crypto.p094ui.detail.position;

import android.content.res.Resources;
import androidx.compose.p011ui.text.AnnotatedString;
import com.robinhood.android.crypto.p094ui.view.CryptoDetailTransferActionState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.crypto.p314db.CryptoPositionDetails;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoPositionStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDataState;", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "reduce", "dataState", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoPositionStateProvider implements StateProvider<CryptoPositionDataState, CryptoPositionViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    public CryptoPositionStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public CryptoPositionViewState reduce(CryptoPositionDataState dataState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        boolean zIsVisible = dataState.isVisible();
        GenericAlertContent<GenericAction> amountAvailableInfoScreen = dataState.getAmountAvailableInfoScreen();
        boolean areHoldingRowsVisible$feature_crypto_externalDebug = dataState.getAreHoldingRowsVisible$feature_crypto_externalDebug();
        AnnotatedString annotatedStringAverageCost$feature_crypto_externalDebug = dataState.averageCost$feature_crypto_externalDebug(this.resources);
        UUID currencyPairId$feature_crypto_externalDebug = dataState.getCurrencyPairId$feature_crypto_externalDebug();
        float diversityPercentage$feature_crypto_externalDebug = dataState.getDiversityPercentage$feature_crypto_externalDebug();
        AnnotatedString equity$feature_crypto_externalDebug = dataState.getEquity$feature_crypto_externalDebug();
        boolean zIsCryptoBalanceIconVisible$feature_crypto_externalDebug = dataState.isCryptoBalanceIconVisible$feature_crypto_externalDebug();
        boolean zIsPortfolioDiversityRowVisible$feature_crypto_externalDebug = dataState.isPortfolioDiversityRowVisible$feature_crypto_externalDebug();
        boolean zIsRhc$feature_crypto_externalDebug = dataState.isRhc$feature_crypto_externalDebug();
        AnnotatedString portfolioDiversity$feature_crypto_externalDebug = dataState.getPortfolioDiversity$feature_crypto_externalDebug();
        AnnotatedString quantity$feature_crypto_externalDebug = dataState.getQuantity$feature_crypto_externalDebug();
        String todaysReturn$feature_crypto_externalDebug = dataState.getTodaysReturn$feature_crypto_externalDebug();
        BigDecimal todaysReturnPercentage$feature_crypto_externalDebug = dataState.getTodaysReturnPercentage$feature_crypto_externalDebug();
        String totalReturn$feature_crypto_externalDebug = dataState.getTotalReturn$feature_crypto_externalDebug();
        BigDecimal totalReturnPercentage$feature_crypto_externalDebug = dataState.getTotalReturnPercentage$feature_crypto_externalDebug();
        CryptoDetailTransferActionState transferActionState$feature_crypto_externalDebug = dataState.getTransferActionState$feature_crypto_externalDebug();
        CryptoPositionDetails cryptoPositionDetails$feature_crypto_externalDebug = dataState.getCryptoPositionDetails$feature_crypto_externalDebug();
        return new CryptoPositionViewState(amountAvailableInfoScreen, currencyPairId$feature_crypto_externalDebug, dataState.getLoggingScreen$feature_crypto_externalDebug(), zIsRhc$feature_crypto_externalDebug, zIsVisible, areHoldingRowsVisible$feature_crypto_externalDebug, annotatedStringAverageCost$feature_crypto_externalDebug, diversityPercentage$feature_crypto_externalDebug, equity$feature_crypto_externalDebug, zIsCryptoBalanceIconVisible$feature_crypto_externalDebug, zIsPortfolioDiversityRowVisible$feature_crypto_externalDebug, portfolioDiversity$feature_crypto_externalDebug, quantity$feature_crypto_externalDebug, todaysReturn$feature_crypto_externalDebug, todaysReturnPercentage$feature_crypto_externalDebug, totalReturn$feature_crypto_externalDebug, totalReturnPercentage$feature_crypto_externalDebug, transferActionState$feature_crypto_externalDebug, cryptoPositionDetails$feature_crypto_externalDebug != null ? cryptoPositionDetails$feature_crypto_externalDebug.getAverageCostTotalReturnStatus() : null, dataState.getPositionBannerType$feature_crypto_externalDebug(), dataState.m1906x95d999e5(), dataState.getPassThrough());
    }
}
