package com.robinhood.shared.crypto.staking.staking.summary;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryViewState;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoStakingSummaryStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryDataState;", "Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryViewState;", "<init>", "()V", "reduce", "dataState", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoStakingSummaryStateProvider implements StateProvider<CryptoStakingSummaryDataState, CryptoStakingSummaryViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public CryptoStakingSummaryViewState reduce(CryptoStakingSummaryDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        UUID currencyPairId = dataState.getCurrencyPairId();
        boolean zIsCurrencyPairLoading = dataState.isCurrencyPairLoading();
        CryptoStakingSummaryViewState.ChartState chartState = dataState.getChartState();
        return new CryptoStakingSummaryViewState(currencyPairId, zIsCurrencyPairLoading, dataState.getTitle(), dataState.getActionLabel(), chartState, dataState.getInfoRows(), dataState.getFooterState(), dataState.getLoggingContext());
    }
}
