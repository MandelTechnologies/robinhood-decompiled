package com.robinhood.shared.crypto.transfer.send.address.allowlisting;

import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoSavedAddressesListStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListDataState;", "Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListViewState;", "<init>", "()V", "reduce", "dataState", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoSavedAddressesListStateProvider implements StateProvider<CryptoSavedAddressesListDataState, CryptoSavedAddressesListViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public CryptoSavedAddressesListViewState reduce(CryptoSavedAddressesListDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new CryptoSavedAddressesListViewState(dataState.getCurrencyCode(), dataState.getCurrencyPairId(), dataState.getCurrencyId(), dataState.getTopBarState(), dataState.isLoading(), dataState.isAllowlistEnabled(), dataState.getPendingSavedAddresses(), dataState.getValidSavedAddresses(), dataState.getShowEmptyState(), dataState.getShouldShowSectionHeader(), dataState.getShowAddAddressButton());
    }
}
