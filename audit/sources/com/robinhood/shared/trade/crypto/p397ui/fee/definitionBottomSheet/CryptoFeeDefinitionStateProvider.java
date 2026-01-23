package com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet.CryptoFeeDefinitionDataState;
import com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet.CryptoFeeDefinitionViewState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoFeeDefinitionStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionDataState;", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionViewState;", "<init>", "()V", "reduce", "dataState", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoFeeDefinitionStateProvider implements StateProvider<CryptoFeeDefinitionDataState, CryptoFeeDefinitionViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public CryptoFeeDefinitionViewState reduce(CryptoFeeDefinitionDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState instanceof CryptoFeeDefinitionDataState.Loading) {
            return new CryptoFeeDefinitionViewState.Loading(((CryptoFeeDefinitionDataState.Loading) dataState).getShowBannerLoading());
        }
        if (!(dataState instanceof CryptoFeeDefinitionDataState.Loaded)) {
            throw new NoWhenBranchMatchedException();
        }
        CryptoFeeDefinitionDataState.Loaded loaded = (CryptoFeeDefinitionDataState.Loaded) dataState;
        return new CryptoFeeDefinitionViewState.Loaded(loaded.getBodyText(), loaded.getBannerText(), loaded.getPrimaryCtaText(), loaded.getLearnMoreUrl(), loaded.getFeeStructure());
    }
}
