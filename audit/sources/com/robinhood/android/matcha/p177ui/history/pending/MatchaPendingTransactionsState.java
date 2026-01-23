package com.robinhood.android.matcha.p177ui.history.pending;

import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.p177ui.history.pending.row.TransactionRowState;
import com.robinhood.android.models.matcha.api.MatchaTransferRole;
import com.robinhood.models.p355ui.matcha.UiMatchaPendingTransaction;
import com.robinhood.udf.UiEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MatchaPendingTransactionsState.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+Be\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jg\u0010$\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0016R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00038F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0013¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsState;", "", "transactions", "", "Lcom/robinhood/models/ui/matcha/UiMatchaPendingTransaction;", "retryClaimTransferId", "Lcom/robinhood/udf/UiEvent;", "Ljava/util/UUID;", "isContinuingTransferPostSuv", "", "errorEvent", "", "exitEvent", "", MatchaPendingTransactionsDuxo.SAVED_STATE_PENDING_VERIFICATION, "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState$Action$VerificationRequired;", "<init>", "(Ljava/util/List;Lcom/robinhood/udf/UiEvent;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState$Action$VerificationRequired;)V", "getTransactions", "()Ljava/util/List;", "getRetryClaimTransferId", "()Lcom/robinhood/udf/UiEvent;", "()Z", "getErrorEvent", "getExitEvent", "getPendingVerification", "()Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState$Action$VerificationRequired;", "rowItems", "Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsState$RowItem;", "getRowItems", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "RowItem", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class MatchaPendingTransactionsState {
    public static final int $stable = 8;
    private final UiEvent<Throwable> errorEvent;
    private final UiEvent<Unit> exitEvent;
    private final boolean isContinuingTransferPostSuv;
    private final TransactionRowState.Action.VerificationRequired pendingVerification;
    private final UiEvent<UUID> retryClaimTransferId;
    private final List<UiMatchaPendingTransaction> transactions;

    public MatchaPendingTransactionsState() {
        this(null, null, false, null, null, null, 63, null);
    }

    public static /* synthetic */ MatchaPendingTransactionsState copy$default(MatchaPendingTransactionsState matchaPendingTransactionsState, List list, UiEvent uiEvent, boolean z, UiEvent uiEvent2, UiEvent uiEvent3, TransactionRowState.Action.VerificationRequired verificationRequired, int i, Object obj) {
        if ((i & 1) != 0) {
            list = matchaPendingTransactionsState.transactions;
        }
        if ((i & 2) != 0) {
            uiEvent = matchaPendingTransactionsState.retryClaimTransferId;
        }
        if ((i & 4) != 0) {
            z = matchaPendingTransactionsState.isContinuingTransferPostSuv;
        }
        if ((i & 8) != 0) {
            uiEvent2 = matchaPendingTransactionsState.errorEvent;
        }
        if ((i & 16) != 0) {
            uiEvent3 = matchaPendingTransactionsState.exitEvent;
        }
        if ((i & 32) != 0) {
            verificationRequired = matchaPendingTransactionsState.pendingVerification;
        }
        UiEvent uiEvent4 = uiEvent3;
        TransactionRowState.Action.VerificationRequired verificationRequired2 = verificationRequired;
        return matchaPendingTransactionsState.copy(list, uiEvent, z, uiEvent2, uiEvent4, verificationRequired2);
    }

    public final List<UiMatchaPendingTransaction> component1() {
        return this.transactions;
    }

    public final UiEvent<UUID> component2() {
        return this.retryClaimTransferId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsContinuingTransferPostSuv() {
        return this.isContinuingTransferPostSuv;
    }

    public final UiEvent<Throwable> component4() {
        return this.errorEvent;
    }

    public final UiEvent<Unit> component5() {
        return this.exitEvent;
    }

    /* renamed from: component6, reason: from getter */
    public final TransactionRowState.Action.VerificationRequired getPendingVerification() {
        return this.pendingVerification;
    }

    public final MatchaPendingTransactionsState copy(List<? extends UiMatchaPendingTransaction> transactions, UiEvent<UUID> retryClaimTransferId, boolean isContinuingTransferPostSuv, UiEvent<Throwable> errorEvent, UiEvent<Unit> exitEvent, TransactionRowState.Action.VerificationRequired pendingVerification) {
        return new MatchaPendingTransactionsState(transactions, retryClaimTransferId, isContinuingTransferPostSuv, errorEvent, exitEvent, pendingVerification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchaPendingTransactionsState)) {
            return false;
        }
        MatchaPendingTransactionsState matchaPendingTransactionsState = (MatchaPendingTransactionsState) other;
        return Intrinsics.areEqual(this.transactions, matchaPendingTransactionsState.transactions) && Intrinsics.areEqual(this.retryClaimTransferId, matchaPendingTransactionsState.retryClaimTransferId) && this.isContinuingTransferPostSuv == matchaPendingTransactionsState.isContinuingTransferPostSuv && Intrinsics.areEqual(this.errorEvent, matchaPendingTransactionsState.errorEvent) && Intrinsics.areEqual(this.exitEvent, matchaPendingTransactionsState.exitEvent) && Intrinsics.areEqual(this.pendingVerification, matchaPendingTransactionsState.pendingVerification);
    }

    public int hashCode() {
        List<UiMatchaPendingTransaction> list = this.transactions;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        UiEvent<UUID> uiEvent = this.retryClaimTransferId;
        int iHashCode2 = (((iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31) + Boolean.hashCode(this.isContinuingTransferPostSuv)) * 31;
        UiEvent<Throwable> uiEvent2 = this.errorEvent;
        int iHashCode3 = (iHashCode2 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<Unit> uiEvent3 = this.exitEvent;
        int iHashCode4 = (iHashCode3 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31;
        TransactionRowState.Action.VerificationRequired verificationRequired = this.pendingVerification;
        return iHashCode4 + (verificationRequired != null ? verificationRequired.hashCode() : 0);
    }

    public String toString() {
        return "MatchaPendingTransactionsState(transactions=" + this.transactions + ", retryClaimTransferId=" + this.retryClaimTransferId + ", isContinuingTransferPostSuv=" + this.isContinuingTransferPostSuv + ", errorEvent=" + this.errorEvent + ", exitEvent=" + this.exitEvent + ", pendingVerification=" + this.pendingVerification + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MatchaPendingTransactionsState(List<? extends UiMatchaPendingTransaction> list, UiEvent<UUID> uiEvent, boolean z, UiEvent<Throwable> uiEvent2, UiEvent<Unit> uiEvent3, TransactionRowState.Action.VerificationRequired verificationRequired) {
        this.transactions = list;
        this.retryClaimTransferId = uiEvent;
        this.isContinuingTransferPostSuv = z;
        this.errorEvent = uiEvent2;
        this.exitEvent = uiEvent3;
        this.pendingVerification = verificationRequired;
    }

    public /* synthetic */ MatchaPendingTransactionsState(List list, UiEvent uiEvent, boolean z, UiEvent uiEvent2, UiEvent uiEvent3, TransactionRowState.Action.VerificationRequired verificationRequired, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : uiEvent, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : uiEvent2, (i & 16) != 0 ? null : uiEvent3, (i & 32) != 0 ? null : verificationRequired);
    }

    public final List<UiMatchaPendingTransaction> getTransactions() {
        return this.transactions;
    }

    public final UiEvent<UUID> getRetryClaimTransferId() {
        return this.retryClaimTransferId;
    }

    public final boolean isContinuingTransferPostSuv() {
        return this.isContinuingTransferPostSuv;
    }

    public final UiEvent<Throwable> getErrorEvent() {
        return this.errorEvent;
    }

    public final UiEvent<Unit> getExitEvent() {
        return this.exitEvent;
    }

    public final TransactionRowState.Action.VerificationRequired getPendingVerification() {
        return this.pendingVerification;
    }

    public final List<RowItem> getRowItems() {
        List<UiMatchaPendingTransaction> list = this.transactions;
        if (list == null || this.isContinuingTransferPostSuv) {
            ArrayList arrayList = new ArrayList(5);
            for (int i = 0; i < 5; i++) {
                arrayList.add(RowItem.Placeholder.INSTANCE);
            }
            return arrayList;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            MatchaTransferRole role = ((UiMatchaPendingTransaction) obj).getRole();
            Object arrayList2 = linkedHashMap.get(role);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(role, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        List listEmptyList = (List) linkedHashMap.get(MatchaTransferRole.RECEIVER);
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List listEmptyList2 = (List) linkedHashMap.get(MatchaTransferRole.SENDER);
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        Function2 function2 = new Function2() { // from class: com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return MatchaPendingTransactionsState._get_rowItems_$lambda$3(this.f$0, (List) obj2, ((Integer) obj3).intValue());
            }
        };
        return CollectionsKt.plus((Collection) function2.invoke(listEmptyList, Integer.valueOf(C21284R.string.matcha_pending_transactions_incoming)), (Iterable) function2.invoke(listEmptyList2, Integer.valueOf(C21284R.string.matcha_pending_transactions_outgoing)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final List _get_rowItems_$lambda$3(MatchaPendingTransactionsState matchaPendingTransactionsState, List transactions, int i) {
        RowItem.Transaction transaction;
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        if (!transactions.isEmpty()) {
            List listListOf = CollectionsKt.listOf(new RowItem.Header(i));
            List<UiMatchaPendingTransaction> list = transactions;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (UiMatchaPendingTransaction uiMatchaPendingTransaction : list) {
                UUID id = uiMatchaPendingTransaction.getId();
                UiEvent<UUID> uiEvent = matchaPendingTransactionsState.retryClaimTransferId;
                UiEvent uiEvent2 = null;
                Object[] objArr = 0;
                if (Intrinsics.areEqual(id, uiEvent != null ? uiEvent.consume() : null)) {
                    transaction = new RowItem.Transaction(uiMatchaPendingTransaction, new UiEvent(Unit.INSTANCE));
                } else {
                    transaction = new RowItem.Transaction(uiMatchaPendingTransaction, uiEvent2, 2, objArr == true ? 1 : 0);
                }
                arrayList.add(transaction);
            }
            return CollectionsKt.plus((Collection) listListOf, (Iterable) arrayList);
        }
        return CollectionsKt.emptyList();
    }

    /* compiled from: MatchaPendingTransactionsState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000f2\u00020\u0001:\u0004\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0000H&J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0000H&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsState$RowItem;", "", "viewType", "", "<init>", "(I)V", "getViewType", "()I", "areItemsTheSame", "", "other", "areContentsTheSame", "Transaction", "Header", "Placeholder", "Companion", "Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsState$RowItem$Header;", "Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsState$RowItem$Placeholder;", "Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsState$RowItem$Transaction;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class RowItem {
        public static final int $stable = 0;
        public static final int VIEW_TYPE_HEADER = 1;
        public static final int VIEW_TYPE_PLACEHOLDER = 2;
        public static final int VIEW_TYPE_TRANSACTION = 0;
        private final int viewType;

        public /* synthetic */ RowItem(int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(i);
        }

        public abstract boolean areContentsTheSame(RowItem other);

        public abstract boolean areItemsTheSame(RowItem other);

        private RowItem(int i) {
            this.viewType = i;
        }

        public final int getViewType() {
            return this.viewType;
        }

        /* compiled from: MatchaPendingTransactionsState.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0016J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsState$RowItem$Transaction;", "Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsState$RowItem;", "transaction", "Lcom/robinhood/models/ui/matcha/UiMatchaPendingTransaction;", "retryPrimaryAction", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/models/ui/matcha/UiMatchaPendingTransaction;Lcom/robinhood/udf/UiEvent;)V", "getTransaction", "()Lcom/robinhood/models/ui/matcha/UiMatchaPendingTransaction;", "getRetryPrimaryAction", "()Lcom/robinhood/udf/UiEvent;", "areItemsTheSame", "", "other", "areContentsTheSame", "component1", "component2", "copy", "equals", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Transaction extends RowItem {
            public static final int $stable = 8;
            private final UiEvent<Unit> retryPrimaryAction;
            private final UiMatchaPendingTransaction transaction;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Transaction copy$default(Transaction transaction, UiMatchaPendingTransaction uiMatchaPendingTransaction, UiEvent uiEvent, int i, Object obj) {
                if ((i & 1) != 0) {
                    uiMatchaPendingTransaction = transaction.transaction;
                }
                if ((i & 2) != 0) {
                    uiEvent = transaction.retryPrimaryAction;
                }
                return transaction.copy(uiMatchaPendingTransaction, uiEvent);
            }

            /* renamed from: component1, reason: from getter */
            public final UiMatchaPendingTransaction getTransaction() {
                return this.transaction;
            }

            public final UiEvent<Unit> component2() {
                return this.retryPrimaryAction;
            }

            public final Transaction copy(UiMatchaPendingTransaction transaction, UiEvent<Unit> retryPrimaryAction) {
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                return new Transaction(transaction, retryPrimaryAction);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Transaction)) {
                    return false;
                }
                Transaction transaction = (Transaction) other;
                return Intrinsics.areEqual(this.transaction, transaction.transaction) && Intrinsics.areEqual(this.retryPrimaryAction, transaction.retryPrimaryAction);
            }

            public int hashCode() {
                int iHashCode = this.transaction.hashCode() * 31;
                UiEvent<Unit> uiEvent = this.retryPrimaryAction;
                return iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode());
            }

            public String toString() {
                return "Transaction(transaction=" + this.transaction + ", retryPrimaryAction=" + this.retryPrimaryAction + ")";
            }

            public /* synthetic */ Transaction(UiMatchaPendingTransaction uiMatchaPendingTransaction, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(uiMatchaPendingTransaction, (i & 2) != 0 ? null : uiEvent);
            }

            public final UiMatchaPendingTransaction getTransaction() {
                return this.transaction;
            }

            public final UiEvent<Unit> getRetryPrimaryAction() {
                return this.retryPrimaryAction;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Transaction(UiMatchaPendingTransaction transaction, UiEvent<Unit> uiEvent) {
                super(0, null);
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                this.transaction = transaction;
                this.retryPrimaryAction = uiEvent;
            }

            @Override // com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsState.RowItem
            public boolean areItemsTheSame(RowItem other) {
                Intrinsics.checkNotNullParameter(other, "other");
                Transaction transaction = other instanceof Transaction ? (Transaction) other : null;
                if (transaction == null) {
                    return false;
                }
                return Intrinsics.areEqual(this.transaction.getId(), transaction.transaction.getId());
            }

            @Override // com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsState.RowItem
            public boolean areContentsTheSame(RowItem other) {
                Intrinsics.checkNotNullParameter(other, "other");
                Transaction transaction = other instanceof Transaction ? (Transaction) other : null;
                if (transaction == null) {
                    return false;
                }
                return Intrinsics.areEqual(this.transaction.getCanRemind(), transaction.transaction.getCanRemind());
            }
        }

        /* compiled from: MatchaPendingTransactionsState.kt */
        @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001H\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsState$RowItem$Header;", "Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsState$RowItem;", "textRes", "", "<init>", "(I)V", "getTextRes", "()I", "areItemsTheSame", "", "other", "areContentsTheSame", "component1", "copy", "equals", "", "hashCode", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Header extends RowItem {
            public static final int $stable = 0;
            private final int textRes;

            public static /* synthetic */ Header copy$default(Header header, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = header.textRes;
                }
                return header.copy(i);
            }

            @Override // com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsState.RowItem
            public boolean areContentsTheSame(RowItem other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return true;
            }

            /* renamed from: component1, reason: from getter */
            public final int getTextRes() {
                return this.textRes;
            }

            public final Header copy(int textRes) {
                return new Header(textRes);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Header) && this.textRes == ((Header) other).textRes;
            }

            public int hashCode() {
                return Integer.hashCode(this.textRes);
            }

            public String toString() {
                return "Header(textRes=" + this.textRes + ")";
            }

            public Header(int i) {
                super(1, null);
                this.textRes = i;
            }

            public final int getTextRes() {
                return this.textRes;
            }

            @Override // com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsState.RowItem
            public boolean areItemsTheSame(RowItem other) {
                Intrinsics.checkNotNullParameter(other, "other");
                Header header = other instanceof Header ? (Header) other : null;
                return header != null && this.textRes == header.textRes;
            }
        }

        /* compiled from: MatchaPendingTransactionsState.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsState$RowItem$Placeholder;", "Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsState$RowItem;", "<init>", "()V", "areItemsTheSame", "", "other", "areContentsTheSame", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Placeholder extends RowItem {
            public static final int $stable = 0;
            public static final Placeholder INSTANCE = new Placeholder();

            @Override // com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsState.RowItem
            public boolean areContentsTheSame(RowItem other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return true;
            }

            @Override // com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsState.RowItem
            public boolean areItemsTheSame(RowItem other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return true;
            }

            private Placeholder() {
                super(2, null);
            }
        }
    }
}
