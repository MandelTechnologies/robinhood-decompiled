package com.robinhood.android.acats.plaid.transfer.partial;

import com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferViewState;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsPlaidPartialTransferStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferDataState;", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferViewState;", "<init>", "()V", "reduce", "dataState", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsPlaidPartialTransferStateProvider implements StateProvider<AcatsPlaidPartialTransferDataState, AcatsPlaidPartialTransferViewState> {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.udf.StateProvider
    public AcatsPlaidPartialTransferViewState reduce(AcatsPlaidPartialTransferDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        AcatsPlaidPartialTransferUiState uiState = dataState.getUiState();
        if (uiState != null) {
            return new AcatsPlaidPartialTransferViewState.Ready(dataState.getToolbarTitle(), uiState, dataState.getFilterState(), dataState.getEditState(), dataState.getCashAsset(), dataState.getMarginCashAsset(), dataState.getRemoveAssetConfirmationState(), dataState.getEquityAssets(), dataState.getOptionAssets(), dataState.getAssetCount() <= 1 ? 0 : 1);
        }
        return new AcatsPlaidPartialTransferViewState.Loading(null, i, 0 == true ? 1 : 0);
    }
}
