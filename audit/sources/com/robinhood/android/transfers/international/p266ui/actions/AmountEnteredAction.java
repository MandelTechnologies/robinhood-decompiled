package com.robinhood.android.transfers.international.p266ui.actions;

import com.robinhood.android.transfers.international.p266ui.InternationalTransferEvent;
import com.robinhood.android.transfers.international.p266ui.InternationalTransferState;
import com.robinhood.android.transfers.international.p266ui.model.FxData;
import com.robinhood.android.transfers.international.p266ui.model.MultiCurrencyAccount;
import com.robinhood.android.transfers.international.p266ui.model.TransferType;
import com.robinhood.android.transfers.international.p266ui.review.ReviewTransferFragment;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AmountEnteredAction.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001f\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/actions/AmountEnteredAction;", "Lcom/robinhood/android/transfers/international/ui/actions/InternationalTransferFlowAction;", "Lcom/robinhood/android/transfers/international/ui/actions/MutatingAction;", "amount", "Lcom/robinhood/models/util/Money;", "fxData", "Lcom/robinhood/android/transfers/international/ui/model/FxData;", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/android/transfers/international/ui/model/FxData;)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "getFxData", "()Lcom/robinhood/android/transfers/international/ui/model/FxData;", "consume", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent;", "state", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferState;", "mutate", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AmountEnteredAction implements InternationalTransferFlowAction, InternationalTransferFlowAction3 {
    public static final int $stable = 8;
    private final Money amount;
    private final FxData fxData;

    /* compiled from: AmountEnteredAction.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferType.values().length];
            try {
                iArr[TransferType.FAST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferType.WIRE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ AmountEnteredAction copy$default(AmountEnteredAction amountEnteredAction, Money money, FxData fxData, int i, Object obj) {
        if ((i & 1) != 0) {
            money = amountEnteredAction.amount;
        }
        if ((i & 2) != 0) {
            fxData = amountEnteredAction.fxData;
        }
        return amountEnteredAction.copy(money, fxData);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final FxData getFxData() {
        return this.fxData;
    }

    public final AmountEnteredAction copy(Money amount, FxData fxData) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        return new AmountEnteredAction(amount, fxData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AmountEnteredAction)) {
            return false;
        }
        AmountEnteredAction amountEnteredAction = (AmountEnteredAction) other;
        return Intrinsics.areEqual(this.amount, amountEnteredAction.amount) && Intrinsics.areEqual(this.fxData, amountEnteredAction.fxData);
    }

    public int hashCode() {
        int iHashCode = this.amount.hashCode() * 31;
        FxData fxData = this.fxData;
        return iHashCode + (fxData == null ? 0 : fxData.hashCode());
    }

    public String toString() {
        return "AmountEnteredAction(amount=" + this.amount + ", fxData=" + this.fxData + ")";
    }

    public AmountEnteredAction(Money amount, FxData fxData) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.amount = amount;
        this.fxData = fxData;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final FxData getFxData() {
        return this.fxData;
    }

    @Override // com.robinhood.android.transfers.international.p266ui.actions.InternationalTransferFlowAction
    public InternationalTransferEvent consume(InternationalTransferState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        TransferType transferType = state.getTransferType();
        if (transferType == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i = WhenMappings.$EnumSwitchMapping$0[transferType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return InternationalTransferEvent.ShowMemoInput.INSTANCE;
        }
        Money money = this.amount;
        TransferType transferType2 = state.getTransferType();
        if (transferType2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        MultiCurrencyAccount sourceAccount = state.getSourceAccount();
        if (sourceAccount == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        MultiCurrencyAccount sinkAccount = state.getSinkAccount();
        if (sinkAccount != null) {
            return new InternationalTransferEvent.ShowTransferReview(new ReviewTransferFragment.Args(money, transferType2, sourceAccount, sinkAccount, null, this.fxData));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.robinhood.android.transfers.international.p266ui.actions.InternationalTransferFlowAction3
    public InternationalTransferState mutate(InternationalTransferState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return InternationalTransferState.copy$default(state, this.amount, null, null, null, null, this.fxData, 30, null);
    }
}
