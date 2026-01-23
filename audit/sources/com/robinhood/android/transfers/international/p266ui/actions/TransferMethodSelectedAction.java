package com.robinhood.android.transfers.international.p266ui.actions;

import bff_money_movement.service.p019v1.NonOriginatedTransferTypeDto;
import com.robinhood.android.transfers.international.p266ui.InternationalTransferEvent;
import com.robinhood.android.transfers.international.p266ui.InternationalTransferState;
import com.robinhood.android.transfers.international.p266ui.amountinput.AmountInputFragment;
import com.robinhood.android.transfers.international.p266ui.methodselection.TransferMethodFragment;
import com.robinhood.android.transfers.international.p266ui.model.MultiCurrencyAccount;
import com.robinhood.android.transfers.international.p266ui.model.TransferType;
import com.robinhood.android.transfers.international.p266ui.model.TransferType3;
import com.robinhood.android.transfers.international.p266ui.util.Currency2;
import com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoFragment;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferMethodSelectedAction.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/actions/TransferMethodSelectedAction;", "Lcom/robinhood/android/transfers/international/ui/actions/InternationalTransferFlowAction;", "Lcom/robinhood/android/transfers/international/ui/actions/MutatingAction;", "args", "Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodFragment$Args;", "transferType", "Lcom/robinhood/android/transfers/international/ui/model/TransferType;", "<init>", "(Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodFragment$Args;Lcom/robinhood/android/transfers/international/ui/model/TransferType;)V", "getArgs", "()Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodFragment$Args;", "getTransferType", "()Lcom/robinhood/android/transfers/international/ui/model/TransferType;", "consume", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent;", "state", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferState;", "mutate", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TransferMethodSelectedAction implements InternationalTransferFlowAction, InternationalTransferFlowAction3 {
    public static final int $stable = 8;
    private final TransferMethodFragment.Args args;
    private final TransferType transferType;

    public static /* synthetic */ TransferMethodSelectedAction copy$default(TransferMethodSelectedAction transferMethodSelectedAction, TransferMethodFragment.Args args, TransferType transferType, int i, Object obj) {
        if ((i & 1) != 0) {
            args = transferMethodSelectedAction.args;
        }
        if ((i & 2) != 0) {
            transferType = transferMethodSelectedAction.transferType;
        }
        return transferMethodSelectedAction.copy(args, transferType);
    }

    /* renamed from: component1, reason: from getter */
    public final TransferMethodFragment.Args getArgs() {
        return this.args;
    }

    /* renamed from: component2, reason: from getter */
    public final TransferType getTransferType() {
        return this.transferType;
    }

    public final TransferMethodSelectedAction copy(TransferMethodFragment.Args args, TransferType transferType) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        return new TransferMethodSelectedAction(args, transferType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferMethodSelectedAction)) {
            return false;
        }
        TransferMethodSelectedAction transferMethodSelectedAction = (TransferMethodSelectedAction) other;
        return Intrinsics.areEqual(this.args, transferMethodSelectedAction.args) && this.transferType == transferMethodSelectedAction.transferType;
    }

    public int hashCode() {
        return (this.args.hashCode() * 31) + this.transferType.hashCode();
    }

    public String toString() {
        return "TransferMethodSelectedAction(args=" + this.args + ", transferType=" + this.transferType + ")";
    }

    public TransferMethodSelectedAction(TransferMethodFragment.Args args, TransferType transferType) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        this.args = args;
        this.transferType = transferType;
    }

    public final TransferMethodFragment.Args getArgs() {
        return this.args;
    }

    public final TransferType getTransferType() {
        return this.transferType;
    }

    @Override // com.robinhood.android.transfers.international.p266ui.actions.InternationalTransferFlowAction
    public InternationalTransferEvent consume(InternationalTransferState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        TransferMethodFragment.Args args = this.args;
        if (args instanceof TransferMethodFragment.Args.Deposit) {
            NonOriginatedTransferTypeDto nonOriginatedTransferTypeDto = TransferType3.toNonOriginatedTransferTypeDto(this.transferType);
            Currency currency = state.getCurrency();
            if (currency != null) {
                return new InternationalTransferEvent.ShowNonOriginatedAccountInfo(new NonOriginatedAccountInfoFragment.Args(nonOriginatedTransferTypeDto, Currency2.toCurrencyDto(currency), null, Screen.Name.I18N_TRANSFER_ACCOUNT_INFO, 4, null));
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (!(args instanceof TransferMethodFragment.Args.Withdraw)) {
            throw new NoWhenBranchMatchedException();
        }
        MultiCurrencyAccount sourceAccount = state.getSourceAccount();
        if (sourceAccount == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        MultiCurrencyAccount sinkAccount = state.getSinkAccount();
        if (sinkAccount != null) {
            return new InternationalTransferEvent.ShowAmountInput(new AmountInputFragment.Args(sourceAccount, sinkAccount, this.transferType));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.robinhood.android.transfers.international.p266ui.actions.InternationalTransferFlowAction3
    public InternationalTransferState mutate(InternationalTransferState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return InternationalTransferState.copy$default(state, null, null, this.transferType, null, null, null, 59, null);
    }
}
