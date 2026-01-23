package com.robinhood.android.cash.disputes.p070ui.transaction.review;

import com.robinhood.models.p320db.mcduckling.SettledCardTransaction;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransactionReviewViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÂ\u0003J%\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0010HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/transaction/review/TransactionReviewViewState;", "", "transactions", "", "Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "preSelectedTransactionId", "Ljava/util/UUID;", "<init>", "(Ljava/util/List;Ljava/util/UUID;)V", "sortedTransactions", "getSortedTransactions", "()Ljava/util/List;", "preSelectedTransaction", "getPreSelectedTransaction", "()Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "transactionCount", "", "getTransactionCount", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class TransactionReviewViewState {
    public static final int $stable = 8;
    private final SettledCardTransaction preSelectedTransaction;
    private final UUID preSelectedTransactionId;
    private final List<SettledCardTransaction> sortedTransactions;
    private final int transactionCount;
    private final List<SettledCardTransaction> transactions;

    private final List<SettledCardTransaction> component1() {
        return this.transactions;
    }

    /* renamed from: component2, reason: from getter */
    private final UUID getPreSelectedTransactionId() {
        return this.preSelectedTransactionId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransactionReviewViewState copy$default(TransactionReviewViewState transactionReviewViewState, List list, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            list = transactionReviewViewState.transactions;
        }
        if ((i & 2) != 0) {
            uuid = transactionReviewViewState.preSelectedTransactionId;
        }
        return transactionReviewViewState.copy(list, uuid);
    }

    public final TransactionReviewViewState copy(List<SettledCardTransaction> transactions, UUID preSelectedTransactionId) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        return new TransactionReviewViewState(transactions, preSelectedTransactionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionReviewViewState)) {
            return false;
        }
        TransactionReviewViewState transactionReviewViewState = (TransactionReviewViewState) other;
        return Intrinsics.areEqual(this.transactions, transactionReviewViewState.transactions) && Intrinsics.areEqual(this.preSelectedTransactionId, transactionReviewViewState.preSelectedTransactionId);
    }

    public int hashCode() {
        int iHashCode = this.transactions.hashCode() * 31;
        UUID uuid = this.preSelectedTransactionId;
        return iHashCode + (uuid == null ? 0 : uuid.hashCode());
    }

    public String toString() {
        return "TransactionReviewViewState(transactions=" + this.transactions + ", preSelectedTransactionId=" + this.preSelectedTransactionId + ")";
    }

    public TransactionReviewViewState(List<SettledCardTransaction> transactions, UUID uuid) {
        Object next;
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.transactions = transactions;
        this.preSelectedTransactionId = uuid;
        this.sortedTransactions = CollectionsKt.sortedWith(CollectionsKt.sortedWith(transactions, new Comparator() { // from class: com.robinhood.android.cash.disputes.ui.transaction.review.TransactionReviewViewState$special$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((SettledCardTransaction) t2).getInitiatedAt(), ((SettledCardTransaction) t).getInitiatedAt());
            }
        }), new Comparator() { // from class: com.robinhood.android.cash.disputes.ui.transaction.review.TransactionReviewViewState$special$$inlined$sortedByDescending$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Boolean.valueOf(Intrinsics.areEqual(((SettledCardTransaction) t2).getId(), this.this$0.preSelectedTransactionId)), Boolean.valueOf(Intrinsics.areEqual(((SettledCardTransaction) t).getId(), this.this$0.preSelectedTransactionId)));
            }
        });
        Iterator<T> it = transactions.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.areEqual(((SettledCardTransaction) next).getId(), this.preSelectedTransactionId)) {
                    break;
                }
            }
        }
        this.preSelectedTransaction = (SettledCardTransaction) next;
        this.transactionCount = this.transactions.size();
    }

    public final List<SettledCardTransaction> getSortedTransactions() {
        return this.sortedTransactions;
    }

    public final SettledCardTransaction getPreSelectedTransaction() {
        return this.preSelectedTransaction;
    }

    public final int getTransactionCount() {
        return this.transactionCount;
    }
}
