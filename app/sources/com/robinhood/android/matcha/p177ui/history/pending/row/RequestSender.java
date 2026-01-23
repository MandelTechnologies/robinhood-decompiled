package com.robinhood.android.matcha.p177ui.history.pending.row;

import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.p177ui.history.pending.row.TransactionRowState4;
import com.robinhood.android.wires.p278ui.WiresInvalidAccountContentComposable;
import com.robinhood.models.p355ui.matcha.Request;
import com.robinhood.models.util.Money;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransactionRowState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/row/RequestSender;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow;", "transaction", "Lcom/robinhood/models/ui/matcha/Request;", "<init>", "(Lcom/robinhood/models/ui/matcha/Request;)V", "getTransaction", "()Lcom/robinhood/models/ui/matcha/Request;", "primaryText", "Lcom/robinhood/utils/resource/StringResource;", "getPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", WiresInvalidAccountContentComposable.PrimaryButtonTag, "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Button;", "getPrimaryButton", "()Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Button;", WiresInvalidAccountContentComposable.SecondaryButtonTag, "getSecondaryButton", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RequestSender extends TransactionRowState4 {
    public static final int $stable = 8;
    private final TransactionRowState4.Button primaryButton;
    private final StringResource primaryText;
    private final TransactionRowState4.Button secondaryButton;
    private final Request transaction;

    public static /* synthetic */ RequestSender copy$default(RequestSender requestSender, Request request, int i, Object obj) {
        if ((i & 1) != 0) {
            request = requestSender.transaction;
        }
        return requestSender.copy(request);
    }

    /* renamed from: component1, reason: from getter */
    public final Request getTransaction() {
        return this.transaction;
    }

    public final RequestSender copy(Request transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return new RequestSender(transaction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RequestSender) && Intrinsics.areEqual(this.transaction, ((RequestSender) other).transaction);
    }

    public int hashCode() {
        return this.transaction.hashCode();
    }

    public String toString() {
        return "RequestSender(transaction=" + this.transaction + ")";
    }

    @Override // com.robinhood.android.matcha.p177ui.history.pending.row.TransactionRowState4
    public Request getTransaction() {
        return this.transaction;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestSender(Request transaction) {
        super(null);
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.transaction = transaction;
        StringResource.Companion companion = StringResource.INSTANCE;
        this.primaryText = companion.invoke(C21284R.string.matcha_pending_request_sender_label, getTransaction().getTransactor().getDisplayName(), Money.format$default(getTransaction().getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
        this.primaryButton = new TransactionRowState4.Button(TransactionRowState4.Action.ReviewRequest.INSTANCE, C21284R.string.matcha_transfer_pay, null, false, 8, null);
        this.secondaryButton = new TransactionRowState4.Button(TransactionRowState4.Action.DeclineRequest.INSTANCE, C21284R.string.matcha_pending_transaction_action_decline, companion.invoke(C21284R.string.matcha_transaction_decline_request_success, getTransaction().getTransactor().getDisplayName()), false, 8, null);
    }

    @Override // com.robinhood.android.matcha.p177ui.history.pending.row.TransactionRowState4
    public StringResource getPrimaryText() {
        return this.primaryText;
    }

    @Override // com.robinhood.android.matcha.p177ui.history.pending.row.TransactionRowState4
    public TransactionRowState4.Button getPrimaryButton() {
        return this.primaryButton;
    }

    @Override // com.robinhood.android.matcha.p177ui.history.pending.row.TransactionRowState4
    public TransactionRowState4.Button getSecondaryButton() {
        return this.secondaryButton;
    }
}
