package com.robinhood.android.transfers.i18n;

import androidx.paging.PagedList;
import com.robinhood.android.transfers.withdrawablecash.WithdrawableCashState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: InternationalTransfersHubStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubDataState;", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState;", "<init>", "()V", "reduce", "dataState", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class InternationalTransfersHubStateProvider implements StateProvider<InternationalTransfersHubDataState, InternationalTransfersHubViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public InternationalTransfersHubViewState reduce(InternationalTransfersHubDataState dataState) {
        WithdrawableCashState sdui;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getWithdrawableCashInfoContent() != null) {
            sdui = new WithdrawableCashState.Sdui(extensions2.toImmutableList(dataState.getWithdrawableCashInfoContent()));
        } else {
            sdui = WithdrawableCashState.Hidden.INSTANCE;
        }
        WithdrawableCashState withdrawableCashState = sdui;
        PagedList<StatefulHistoryEvent<HistoryEvent>> pendingHistoryItems = dataState.getPendingHistoryItems();
        boolean z = !(pendingHistoryItems == null || pendingHistoryItems.isEmpty());
        PagedList<StatefulHistoryEvent<HistoryEvent>> completedHistoryItems = dataState.getCompletedHistoryItems();
        return new InternationalTransfersHubViewState(z, !(completedHistoryItems == null || completedHistoryItems.isEmpty()), !Intrinsics.areEqual(dataState.isMcwGbEnabled(), Boolean.TRUE), dataState.getPendingHistoryItems(), dataState.getCompletedHistoryItems(), InternationalTransfersHubStateProvider2.getTransferHubActionsState(dataState), InternationalTransfersHubStateProvider2.getLinkedAccountsState(dataState), withdrawableCashState);
    }
}
