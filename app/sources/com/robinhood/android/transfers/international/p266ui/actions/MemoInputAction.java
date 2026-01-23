package com.robinhood.android.transfers.international.p266ui.actions;

import com.robinhood.android.matcha.p177ui.memo.MemoInputActivity;
import com.robinhood.android.transfers.international.p266ui.InternationalTransferEvent;
import com.robinhood.android.transfers.international.p266ui.InternationalTransferState;
import com.robinhood.android.transfers.international.p266ui.model.MultiCurrencyAccount;
import com.robinhood.android.transfers.international.p266ui.model.TransferType;
import com.robinhood.android.transfers.international.p266ui.review.ReviewTransferFragment;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MemoInputAction.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/actions/MemoInputAction;", "Lcom/robinhood/android/transfers/international/ui/actions/InternationalTransferFlowAction;", MemoInputActivity.EXTRA_MEMO, "", "<init>", "(Ljava/lang/String;)V", "getMemo", "()Ljava/lang/String;", "consume", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent;", "state", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MemoInputAction implements InternationalTransferFlowAction {
    public static final int $stable = 0;
    private final String memo;

    public static /* synthetic */ MemoInputAction copy$default(MemoInputAction memoInputAction, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = memoInputAction.memo;
        }
        return memoInputAction.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMemo() {
        return this.memo;
    }

    public final MemoInputAction copy(String memo) {
        return new MemoInputAction(memo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MemoInputAction) && Intrinsics.areEqual(this.memo, ((MemoInputAction) other).memo);
    }

    public int hashCode() {
        String str = this.memo;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "MemoInputAction(memo=" + this.memo + ")";
    }

    public MemoInputAction(String str) {
        this.memo = str;
    }

    public final String getMemo() {
        return this.memo;
    }

    @Override // com.robinhood.android.transfers.international.p266ui.actions.InternationalTransferFlowAction
    public InternationalTransferEvent consume(InternationalTransferState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Money amount = state.getAmount();
        if (amount == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        TransferType transferType = state.getTransferType();
        if (transferType == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        MultiCurrencyAccount sourceAccount = state.getSourceAccount();
        if (sourceAccount == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        MultiCurrencyAccount sinkAccount = state.getSinkAccount();
        if (sinkAccount == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        return new InternationalTransferEvent.ShowTransferReview(new ReviewTransferFragment.Args(amount, transferType, sourceAccount, sinkAccount, this.memo, state.getFxData()));
    }
}
