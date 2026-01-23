package com.robinhood.shared.crypto.staking.staking.history;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.staking.ApiCryptoStakingHistoryDetailResponse;
import com.robinhood.rosetta.eventlogging.CryptoStakingContext;
import com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailViewState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoStakingHistoryDetailStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/history/CryptoStakingHistoryDetailStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/shared/crypto/staking/staking/history/CryptoStakingHistoryDetailDataState;", "Lcom/robinhood/shared/crypto/staking/staking/history/CryptoStakingHistoryDetailViewState;", "<init>", "()V", "reduce", "dataState", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoStakingHistoryDetailStateProvider implements StateProvider<CryptoStakingHistoryDetailDataState, CryptoStakingHistoryDetailViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public CryptoStakingHistoryDetailViewState reduce(CryptoStakingHistoryDetailDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getResponse() == null) {
            return CryptoStakingHistoryDetailViewState.Loading.INSTANCE;
        }
        ApiCryptoStakingHistoryDetailResponse response = dataState.getResponse();
        if (response == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        return new CryptoStakingHistoryDetailViewState.Content(new CryptoStakingContext(response.getCurrency_code(), 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, 510, null), response.getDetail_view_model(), dataState.isOrderCancelling());
    }
}
