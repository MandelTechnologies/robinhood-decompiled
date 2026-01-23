package com.robinhood.android.transfers.international.p266ui.actions;

import com.robinhood.android.transfers.international.p266ui.InternationalTransferEvent;
import com.robinhood.android.transfers.international.p266ui.InternationalTransferState;
import com.robinhood.android.transfers.international.p266ui.accountselection.AccountSelectionFragment;
import com.robinhood.android.transfers.international.p266ui.amountinput.AmountInputFragment;
import com.robinhood.android.transfers.international.p266ui.methodselection.TransferMethodFragment;
import com.robinhood.android.transfers.international.p266ui.model.MultiCurrencyAccount;
import com.robinhood.android.transfers.international.p266ui.model.TransferType3;
import com.robinhood.models.api.bonfire.paymentinstruments.TransferType;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSelectedAction.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/actions/AccountSelectedAction;", "Lcom/robinhood/android/transfers/international/ui/actions/InternationalTransferFlowAction;", "Lcom/robinhood/android/transfers/international/ui/actions/MutatingAction;", "account", "Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount;", "<init>", "(Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount;)V", "getAccount", "()Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount;", "consume", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent;", "state", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferState;", "mutate", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AccountSelectedAction implements InternationalTransferFlowAction, InternationalTransferFlowAction3 {
    public static final int $stable = 8;
    private final MultiCurrencyAccount account;

    public static /* synthetic */ AccountSelectedAction copy$default(AccountSelectedAction accountSelectedAction, MultiCurrencyAccount multiCurrencyAccount, int i, Object obj) {
        if ((i & 1) != 0) {
            multiCurrencyAccount = accountSelectedAction.account;
        }
        return accountSelectedAction.copy(multiCurrencyAccount);
    }

    /* renamed from: component1, reason: from getter */
    public final MultiCurrencyAccount getAccount() {
        return this.account;
    }

    public final AccountSelectedAction copy(MultiCurrencyAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        return new AccountSelectedAction(account);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AccountSelectedAction) && Intrinsics.areEqual(this.account, ((AccountSelectedAction) other).account);
    }

    public int hashCode() {
        return this.account.hashCode();
    }

    public String toString() {
        return "AccountSelectedAction(account=" + this.account + ")";
    }

    public AccountSelectedAction(MultiCurrencyAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.account = account;
    }

    public final MultiCurrencyAccount getAccount() {
        return this.account;
    }

    @Override // com.robinhood.android.transfers.international.p266ui.actions.InternationalTransferFlowAction
    public InternationalTransferEvent consume(InternationalTransferState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        MultiCurrencyAccount multiCurrencyAccount = this.account;
        if (multiCurrencyAccount instanceof MultiCurrencyAccount.External) {
            List supportedTransferTypes = AccountSelectedAction2.getSupportedTransferTypes((MultiCurrencyAccount.External) multiCurrencyAccount);
            int size = supportedTransferTypes.size();
            if (size == 0) {
                throw new IllegalStateException(("No transfer types found for account: " + this.account).toString());
            }
            if (size == 1) {
                MultiCurrencyAccount sourceAccount = state.getSourceAccount();
                if (sourceAccount != null) {
                    return new InternationalTransferEvent.ShowAmountInput(new AmountInputFragment.Args(sourceAccount, this.account, TransferType3.toTransferType((TransferType) CollectionsKt.first(supportedTransferTypes))));
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            return new InternationalTransferEvent.ShowTransferMethodSelection(new TransferMethodFragment.Args.Withdraw(((MultiCurrencyAccount.External) this.account).getInstrument(), ((MultiCurrencyAccount.External) this.account).getCurrency()));
        }
        if (!(multiCurrencyAccount instanceof MultiCurrencyAccount.Internal)) {
            throw new NoWhenBranchMatchedException();
        }
        return new InternationalTransferEvent.ShowAccountSelection(new AccountSelectionFragment.Args(AccountSelectionFragment.Args.Type.EXTERNAL));
    }

    @Override // com.robinhood.android.transfers.international.p266ui.actions.InternationalTransferFlowAction3
    public InternationalTransferState mutate(InternationalTransferState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        MultiCurrencyAccount multiCurrencyAccount = this.account;
        if (multiCurrencyAccount instanceof MultiCurrencyAccount.External) {
            List supportedTransferTypes = AccountSelectedAction2.getSupportedTransferTypes((MultiCurrencyAccount.External) multiCurrencyAccount);
            return InternationalTransferState.copy$default(state, null, null, supportedTransferTypes.size() == 1 ? TransferType3.toTransferType((TransferType) CollectionsKt.first(supportedTransferTypes)) : null, null, (MultiCurrencyAccount.External) this.account, null, 43, null);
        }
        if (!(multiCurrencyAccount instanceof MultiCurrencyAccount.Internal)) {
            throw new NoWhenBranchMatchedException();
        }
        return InternationalTransferState.copy$default(state, null, null, null, multiCurrencyAccount, null, null, 55, null);
    }
}
