package com.robinhood.android.transfers.p271ui.max.i18n.mcw;

import com.robinhood.lib.transfers.contracts.models.TransferAccountType;
import com.robinhood.transfers.accounts.contracts.AccountSelectionResolver;
import com.robinhood.transfers.accounts.contracts.model.IraTransferType;
import com.robinhood.transfers.accounts.contracts.model.TransferAccountDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: AccountSelectionCallbacks.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u0096@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0003H\u0096@¢\u0006\u0002\u0010\u0004J&\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010\fJ&\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u0003H\u0096@¢\u0006\u0002\u0010\u0004¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/mcw/AccountSelectionCallbacks;", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver;", "launchDebitCardLinking", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchIraMatchInfo", "launchIraQuestionnaire", "iraTransferType", "Lcom/robinhood/transfers/accounts/contracts/model/IraTransferType;", "iraId", "", "selectingAccountId", "(Lcom/robinhood/transfers/accounts/contracts/model/IraTransferType;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAccountRowAppear", "transferAccountId", "transferAccountType", "Lcom/robinhood/lib/transfers/contracts/models/TransferAccountType;", "direction", "Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;", "(Ljava/lang/String;Lcom/robinhood/lib/transfers/contracts/models/TransferAccountType;Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onBottomSheetAppear", "(Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendWireTransfer", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface AccountSelectionCallbacks extends AccountSelectionResolver {
    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    Object launchDebitCardLinking(Continuation<? super Unit> continuation);

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    Object launchIraMatchInfo(Continuation<? super Unit> continuation);

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    Object launchIraQuestionnaire(IraTransferType iraTransferType, String str, String str2, Continuation<? super Unit> continuation);

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    Object onAccountRowAppear(String str, TransferAccountType transferAccountType, TransferAccountDirection transferAccountDirection, Continuation<? super Unit> continuation);

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    Object onBottomSheetAppear(TransferAccountDirection transferAccountDirection, Continuation<? super Unit> continuation);

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    Object sendWireTransfer(Continuation<? super Unit> continuation);

    /* compiled from: AccountSelectionCallbacks.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static Object launchDebitCardLinking(AccountSelectionCallbacks accountSelectionCallbacks, Continuation<? super Unit> continuation) {
            return Unit.INSTANCE;
        }

        public static Object launchIraMatchInfo(AccountSelectionCallbacks accountSelectionCallbacks, Continuation<? super Unit> continuation) {
            return Unit.INSTANCE;
        }

        public static Object launchIraQuestionnaire(AccountSelectionCallbacks accountSelectionCallbacks, IraTransferType iraTransferType, String str, String str2, Continuation<? super Unit> continuation) {
            return Unit.INSTANCE;
        }

        public static Object onAccountRowAppear(AccountSelectionCallbacks accountSelectionCallbacks, String str, TransferAccountType transferAccountType, TransferAccountDirection transferAccountDirection, Continuation<? super Unit> continuation) {
            return Unit.INSTANCE;
        }

        public static Object onBottomSheetAppear(AccountSelectionCallbacks accountSelectionCallbacks, TransferAccountDirection transferAccountDirection, Continuation<? super Unit> continuation) {
            return Unit.INSTANCE;
        }

        public static Object sendWireTransfer(AccountSelectionCallbacks accountSelectionCallbacks, Continuation<? super Unit> continuation) {
            return Unit.INSTANCE;
        }
    }
}
