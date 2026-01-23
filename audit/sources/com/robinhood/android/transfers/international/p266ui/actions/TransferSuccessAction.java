package com.robinhood.android.transfers.international.p266ui.actions;

import com.robinhood.android.transfers.international.p266ui.InternationalTransferEvent;
import com.robinhood.android.transfers.international.p266ui.InternationalTransferState;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow;
import com.robinhood.shared.transfers.contracts.TransferSuccessKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferSuccessAction.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/actions/TransferSuccessAction;", "Lcom/robinhood/android/transfers/international/ui/actions/InternationalTransferFlowAction;", "postTransferFlow", "Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "<init>", "(Lcom/robinhood/models/ui/bonfire/PostTransferFlow;)V", "getPostTransferFlow", "()Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "consume", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent;", "state", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TransferSuccessAction implements InternationalTransferFlowAction {
    public static final int $stable = 8;
    private final PostTransferFlow postTransferFlow;

    public static /* synthetic */ TransferSuccessAction copy$default(TransferSuccessAction transferSuccessAction, PostTransferFlow postTransferFlow, int i, Object obj) {
        if ((i & 1) != 0) {
            postTransferFlow = transferSuccessAction.postTransferFlow;
        }
        return transferSuccessAction.copy(postTransferFlow);
    }

    /* renamed from: component1, reason: from getter */
    public final PostTransferFlow getPostTransferFlow() {
        return this.postTransferFlow;
    }

    public final TransferSuccessAction copy(PostTransferFlow postTransferFlow) {
        Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
        return new TransferSuccessAction(postTransferFlow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TransferSuccessAction) && Intrinsics.areEqual(this.postTransferFlow, ((TransferSuccessAction) other).postTransferFlow);
    }

    public int hashCode() {
        return this.postTransferFlow.hashCode();
    }

    public String toString() {
        return "TransferSuccessAction(postTransferFlow=" + this.postTransferFlow + ")";
    }

    public TransferSuccessAction(PostTransferFlow postTransferFlow) {
        Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
        this.postTransferFlow = postTransferFlow;
    }

    public final PostTransferFlow getPostTransferFlow() {
        return this.postTransferFlow;
    }

    @Override // com.robinhood.android.transfers.international.p266ui.actions.InternationalTransferFlowAction
    public InternationalTransferEvent consume(InternationalTransferState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new InternationalTransferEvent.ReplaceFragment(new TransferSuccessKey(this.postTransferFlow, null, 2, null));
    }
}
