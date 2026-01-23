package com.robinhood.android.cash.transaction.p079ui.rhytransaction;

import com.robinhood.models.p320db.bonfire.RhyTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyTransactionDetailDataState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/rhytransaction/RhyTransactionDetailDataState;", "", "rhyTransaction", "Lcom/robinhood/models/db/bonfire/RhyTransaction;", "<init>", "(Lcom/robinhood/models/db/bonfire/RhyTransaction;)V", "getRhyTransaction", "()Lcom/robinhood/models/db/bonfire/RhyTransaction;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RhyTransactionDetailDataState {
    public static final int $stable = 8;
    private final RhyTransaction rhyTransaction;

    /* JADX WARN: Multi-variable type inference failed */
    public RhyTransactionDetailDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RhyTransactionDetailDataState copy$default(RhyTransactionDetailDataState rhyTransactionDetailDataState, RhyTransaction rhyTransaction, int i, Object obj) {
        if ((i & 1) != 0) {
            rhyTransaction = rhyTransactionDetailDataState.rhyTransaction;
        }
        return rhyTransactionDetailDataState.copy(rhyTransaction);
    }

    /* renamed from: component1, reason: from getter */
    public final RhyTransaction getRhyTransaction() {
        return this.rhyTransaction;
    }

    public final RhyTransactionDetailDataState copy(RhyTransaction rhyTransaction) {
        return new RhyTransactionDetailDataState(rhyTransaction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RhyTransactionDetailDataState) && Intrinsics.areEqual(this.rhyTransaction, ((RhyTransactionDetailDataState) other).rhyTransaction);
    }

    public int hashCode() {
        RhyTransaction rhyTransaction = this.rhyTransaction;
        if (rhyTransaction == null) {
            return 0;
        }
        return rhyTransaction.hashCode();
    }

    public String toString() {
        return "RhyTransactionDetailDataState(rhyTransaction=" + this.rhyTransaction + ")";
    }

    public RhyTransactionDetailDataState(RhyTransaction rhyTransaction) {
        this.rhyTransaction = rhyTransaction;
    }

    public /* synthetic */ RhyTransactionDetailDataState(RhyTransaction rhyTransaction, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : rhyTransaction);
    }

    public final RhyTransaction getRhyTransaction() {
        return this.rhyTransaction;
    }
}
