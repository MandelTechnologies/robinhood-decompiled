package com.robinhood.android.transfers.international.p266ui.actions;

import com.robinhood.android.transfers.international.p266ui.InternationalTransferEvent;
import com.robinhood.android.transfers.international.p266ui.InternationalTransferState;
import kotlin.Metadata;

/* compiled from: InternationalTransferFlowAction.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u0082\u0001\u0006\u0006\u0007\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/actions/InternationalTransferFlowAction;", "", "consume", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent;", "state", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferState;", "Lcom/robinhood/android/transfers/international/ui/actions/AccountSelectedAction;", "Lcom/robinhood/android/transfers/international/ui/actions/AmountEnteredAction;", "Lcom/robinhood/android/transfers/international/ui/actions/DepositCurrencySelectedAction;", "Lcom/robinhood/android/transfers/international/ui/actions/MemoInputAction;", "Lcom/robinhood/android/transfers/international/ui/actions/TransferMethodSelectedAction;", "Lcom/robinhood/android/transfers/international/ui/actions/TransferSuccessAction;", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface InternationalTransferFlowAction {
    InternationalTransferEvent consume(InternationalTransferState state);
}
