package com.robinhood.transfers.accounts.contracts;

import com.robinhood.lib.transfers.contracts.models.TransferAccountType;
import com.robinhood.transfers.accounts.contracts.model.IraTransferType;
import com.robinhood.transfers.accounts.contracts.model.TransferAccountDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: AccountSelectionResolver.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J&\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\fJ\u001e\u0010\r\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0010J&\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH§@¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0018\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0019\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0010¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver;", "", "onBottomSheetAppear", "", "direction", "Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;", "(Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAccountRowAppear", "transferAccountId", "", "transferAccountType", "Lcom/robinhood/lib/transfers/contracts/models/TransferAccountType;", "(Ljava/lang/String;Lcom/robinhood/lib/transfers/contracts/models/TransferAccountType;Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "accountSelected", "(Ljava/lang/String;Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addNewAccount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchIraQuestionnaire", "iraTransferType", "Lcom/robinhood/transfers/accounts/contracts/model/IraTransferType;", "iraId", "selectingAccountId", "(Lcom/robinhood/transfers/accounts/contracts/model/IraTransferType;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchIraMatchInfo", "sendWireTransfer", "launchDebitCardLinking", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@ManagedServices(serviceName = "com.robinhood.transfers.accounts.AccountSelectionResolver")
/* loaded from: classes12.dex */
public interface AccountSelectionResolver {
    Object accountSelected(String str, TransferAccountDirection transferAccountDirection, Continuation<? super Unit> continuation);

    Object addNewAccount(Continuation<? super Unit> continuation);

    Object launchDebitCardLinking(Continuation<? super Unit> continuation);

    Object launchIraMatchInfo(Continuation<? super Unit> continuation);

    Object launchIraQuestionnaire(IraTransferType iraTransferType, String str, String str2, Continuation<? super Unit> continuation);

    Object onAccountRowAppear(String str, TransferAccountType transferAccountType, TransferAccountDirection transferAccountDirection, Continuation<? super Unit> continuation);

    Object onBottomSheetAppear(TransferAccountDirection transferAccountDirection, Continuation<? super Unit> continuation);

    Object sendWireTransfer(Continuation<? super Unit> continuation);
}
