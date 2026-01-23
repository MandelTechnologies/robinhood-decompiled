package com.robinhood.android.internalassettransfers.accountselection;

import com.robinhood.android.internalassettransfers.accountselection.AccountSelectionViewState;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSelectionStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDataState;", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionViewState;", "<init>", "()V", "reduce", "dataState", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class AccountSelectionStateProvider implements StateProvider<AccountSelectionDataState, AccountSelectionViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public AccountSelectionViewState reduce(AccountSelectionDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getEligibleAccounts() != null) {
            return new AccountSelectionViewState.Loaded(CollectionsKt.listOf((Object[]) new AccountSelectionRowState[]{dataState.getSourceRow(), dataState.getSinkRow()}), dataState.getButtonState(), dataState.getDialogError());
        }
        if (dataState.getNetworkError() != null) {
            return new AccountSelectionViewState.Error(dataState.getNetworkError());
        }
        return AccountSelectionViewState.Loading.INSTANCE;
    }
}
