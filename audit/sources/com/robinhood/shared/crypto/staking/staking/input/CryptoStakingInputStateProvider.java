package com.robinhood.shared.crypto.staking.staking.input;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoStakingInputStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputDataState;", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputViewState;", "<init>", "()V", "reduce", "dataState", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoStakingInputStateProvider implements StateProvider<CryptoStakingInputDataState, CryptoStakingInputViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public CryptoStakingInputViewState reduce(CryptoStakingInputDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        boolean zIsLoading = dataState.isLoading();
        boolean zIsRequestingOrder = dataState.isRequestingOrder();
        StringResource title = dataState.getTitle();
        UUID idempotencyId = dataState.getIdempotencyId();
        return new CryptoStakingInputViewState(zIsLoading, zIsRequestingOrder, dataState.getUiCurrencyPair(), dataState.getCryptoInputMode(), dataState.getStakingAmountInfoSheet(), dataState.getOrderType(), idempotencyId, title, dataState.getCurrencySymbol(), dataState.getAmount(), dataState.isReviewButtonVisible(), dataState.isReviewButtonEnabled(), dataState.isSuggestionPillTappable(), dataState.getEventContext$feature_crypto_staking_externalDebug(), dataState.getAvailableText(), dataState.getAvailableAmountSheetIconContentDescription(), dataState.getRewardsEnabled(), dataState.getTypedAmountText(), dataState.getEstimatedApyText(), dataState.getShouldShowApyText(), dataState.getEstimatedAmountText(), dataState.getAmountType(), dataState.getSuggestedInputAmountsState());
    }
}
