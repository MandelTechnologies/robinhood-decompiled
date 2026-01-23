package com.robinhood.shared.crypto.staking.staking.stakinghub;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.shared.crypto.staking.staking.stakinghub.CryptoStakingHubDataState;
import com.robinhood.shared.crypto.staking.staking.stakinghub.CryptoStakingHubViewState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoStakingHubStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubDataState;", "Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubViewState;", "<init>", "()V", "reduce", "dataState", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoStakingHubStateProvider implements StateProvider<CryptoStakingHubDataState, CryptoStakingHubViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public CryptoStakingHubViewState reduce(CryptoStakingHubDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (Intrinsics.areEqual(dataState, CryptoStakingHubDataState.Error.INSTANCE)) {
            return CryptoStakingHubViewState.Error.INSTANCE;
        }
        if (Intrinsics.areEqual(dataState, CryptoStakingHubDataState.Loading.INSTANCE)) {
            return CryptoStakingHubViewState.Loading.INSTANCE;
        }
        if (!(dataState instanceof CryptoStakingHubDataState.Content)) {
            throw new NoWhenBranchMatchedException();
        }
        CryptoStakingHubDataState.Content content = (CryptoStakingHubDataState.Content) dataState;
        return new CryptoStakingHubViewState.Content(content.getHeaderSection(), content.getUpsellSection(), content.getStakeableSection(), content.getStakedSection());
    }
}
