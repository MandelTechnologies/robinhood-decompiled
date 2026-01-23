package com.robinhood.android.transfers.international.p266ui.actions;

import bff_money_movement.service.p019v1.NonOriginatedTransferTypeDto;
import com.robinhood.android.transfers.international.p266ui.InternationalTransferEvent;
import com.robinhood.android.transfers.international.p266ui.InternationalTransferState;
import com.robinhood.android.transfers.international.p266ui.methodselection.TransferMethodFragment;
import com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoFragment;
import com.robinhood.rosetta.common.CurrencyDto;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.money.Currencies;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DepositCurrencySelectedAction.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/actions/DepositCurrencySelectedAction;", "Lcom/robinhood/android/transfers/international/ui/actions/InternationalTransferFlowAction;", "Lcom/robinhood/android/transfers/international/ui/actions/MutatingAction;", "currency", "Ljava/util/Currency;", "<init>", "(Ljava/util/Currency;)V", "getCurrency", "()Ljava/util/Currency;", "consume", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent;", "state", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferState;", "mutate", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DepositCurrencySelectedAction implements InternationalTransferFlowAction, InternationalTransferFlowAction3 {
    public static final int $stable = 8;
    private final Currency currency;

    public static /* synthetic */ DepositCurrencySelectedAction copy$default(DepositCurrencySelectedAction depositCurrencySelectedAction, Currency currency, int i, Object obj) {
        if ((i & 1) != 0) {
            currency = depositCurrencySelectedAction.currency;
        }
        return depositCurrencySelectedAction.copy(currency);
    }

    /* renamed from: component1, reason: from getter */
    public final Currency getCurrency() {
        return this.currency;
    }

    public final DepositCurrencySelectedAction copy(Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new DepositCurrencySelectedAction(currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DepositCurrencySelectedAction) && Intrinsics.areEqual(this.currency, ((DepositCurrencySelectedAction) other).currency);
    }

    public int hashCode() {
        return this.currency.hashCode();
    }

    public String toString() {
        return "DepositCurrencySelectedAction(currency=" + this.currency + ")";
    }

    public DepositCurrencySelectedAction(Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.currency = currency;
    }

    public final Currency getCurrency() {
        return this.currency;
    }

    @Override // com.robinhood.android.transfers.international.p266ui.actions.InternationalTransferFlowAction
    public InternationalTransferEvent consume(InternationalTransferState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Currency currency = this.currency;
        if (Intrinsics.areEqual(currency, Currencies.SGD)) {
            return new InternationalTransferEvent.ShowTransferMethodSelection(TransferMethodFragment.Args.Deposit.INSTANCE);
        }
        if (Intrinsics.areEqual(currency, Currencies.USD)) {
            return new InternationalTransferEvent.ShowNonOriginatedAccountInfo(new NonOriginatedAccountInfoFragment.Args(NonOriginatedTransferTypeDto.WIRE, CurrencyDto.USD, null, Screen.Name.I18N_TRANSFER_ACCOUNT_INFO, 4, null));
        }
        throw new IllegalStateException(("Unsupported currency: " + this.currency).toString());
    }

    @Override // com.robinhood.android.transfers.international.p266ui.actions.InternationalTransferFlowAction3
    public InternationalTransferState mutate(InternationalTransferState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return InternationalTransferState.copy$default(state, null, this.currency, null, null, null, null, 61, null);
    }
}
