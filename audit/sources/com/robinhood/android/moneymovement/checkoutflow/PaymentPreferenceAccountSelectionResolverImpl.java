package com.robinhood.android.moneymovement.checkoutflow;

import com.robinhood.lib.transfers.contracts.models.TransferAccountType;
import com.robinhood.transfers.accounts.contracts.AccountSelectionResolver;
import com.robinhood.transfers.accounts.contracts.model.IraTransferType;
import com.robinhood.transfers.accounts.contracts.model.TransferAccountDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentPreferenceAccountSelectionResolverImpl.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0096@¢\u0006\u0002\u0010\u001cJ\u000e\u0010\u001d\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010\u001eJ\u000e\u0010\u001f\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010\u001eJ\u000e\u0010 \u001a\u00020\nH\u0096@¢\u0006\u0002\u0010\u001eJ&\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006H\u0096@¢\u0006\u0002\u0010&J&\u0010'\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010(\u001a\u00020)2\u0006\u0010\u001a\u001a\u00020\u001bH\u0096@¢\u0006\u0002\u0010*J\u0016\u0010+\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001bH\u0096@¢\u0006\u0002\u0010,J\u000e\u0010-\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010\u001eR5\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR5\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceAccountSelectionResolverImpl;", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver;", "<init>", "()V", "accountSelectedCallback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "accountId", "", "getAccountSelectedCallback", "()Lkotlin/jvm/functions/Function1;", "setAccountSelectedCallback", "(Lkotlin/jvm/functions/Function1;)V", "accountRowAppearCallback", "getAccountRowAppearCallback", "setAccountRowAppearCallback", "addNewAccountSelectedCallback", "Lkotlin/Function0;", "getAddNewAccountSelectedCallback", "()Lkotlin/jvm/functions/Function0;", "setAddNewAccountSelectedCallback", "(Lkotlin/jvm/functions/Function0;)V", "accountSelected", "transferAccountId", "direction", "Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;", "(Ljava/lang/String;Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addNewAccount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchDebitCardLinking", "launchIraMatchInfo", "launchIraQuestionnaire", "iraTransferType", "Lcom/robinhood/transfers/accounts/contracts/model/IraTransferType;", "iraId", "selectingAccountId", "(Lcom/robinhood/transfers/accounts/contracts/model/IraTransferType;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAccountRowAppear", "transferAccountType", "Lcom/robinhood/lib/transfers/contracts/models/TransferAccountType;", "(Ljava/lang/String;Lcom/robinhood/lib/transfers/contracts/models/TransferAccountType;Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onBottomSheetAppear", "(Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendWireTransfer", "lib-money-movements-checkout-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class PaymentPreferenceAccountSelectionResolverImpl implements AccountSelectionResolver {
    public static final int $stable = 8;
    private Function1<? super String, Unit> accountSelectedCallback = new Function1() { // from class: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceAccountSelectionResolverImpl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return PaymentPreferenceAccountSelectionResolverImpl.accountSelectedCallback$lambda$0((String) obj);
        }
    };
    private Function1<? super String, Unit> accountRowAppearCallback = new Function1() { // from class: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceAccountSelectionResolverImpl$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return PaymentPreferenceAccountSelectionResolverImpl.accountRowAppearCallback$lambda$1((String) obj);
        }
    };
    private Function0<Unit> addNewAccountSelectedCallback = new Function0() { // from class: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceAccountSelectionResolverImpl$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Unit.INSTANCE;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit accountSelectedCallback$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final Function1<String, Unit> getAccountSelectedCallback() {
        return this.accountSelectedCallback;
    }

    public final void setAccountSelectedCallback(Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.accountSelectedCallback = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit accountRowAppearCallback$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final Function1<String, Unit> getAccountRowAppearCallback() {
        return this.accountRowAppearCallback;
    }

    public final void setAccountRowAppearCallback(Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.accountRowAppearCallback = function1;
    }

    public final Function0<Unit> getAddNewAccountSelectedCallback() {
        return this.addNewAccountSelectedCallback;
    }

    public final void setAddNewAccountSelectedCallback(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.addNewAccountSelectedCallback = function0;
    }

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object accountSelected(String str, TransferAccountDirection transferAccountDirection, Continuation<? super Unit> continuation) {
        this.accountSelectedCallback.invoke(str);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object addNewAccount(Continuation<? super Unit> continuation) {
        this.addNewAccountSelectedCallback.invoke();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object launchDebitCardLinking(Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object launchIraMatchInfo(Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object launchIraQuestionnaire(IraTransferType iraTransferType, String str, String str2, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object onAccountRowAppear(String str, TransferAccountType transferAccountType, TransferAccountDirection transferAccountDirection, Continuation<? super Unit> continuation) {
        this.accountRowAppearCallback.invoke(str);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object onBottomSheetAppear(TransferAccountDirection transferAccountDirection, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object sendWireTransfer(Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }
}
