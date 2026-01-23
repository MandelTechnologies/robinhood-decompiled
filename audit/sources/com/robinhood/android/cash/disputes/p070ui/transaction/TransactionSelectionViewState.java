package com.robinhood.android.cash.disputes.p070ui.transaction;

import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.cash.disputes.extensions.LocalDates2;
import com.robinhood.android.cash.disputes.p070ui.transaction.TransactionValidationResult;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.models.api.minerva.ApiDispute;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.models.p320db.mcduckling.SettledCardTransaction;
import com.robinhood.models.util.Money;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.resource.StringResource;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import p479j$.time.LocalDate;

/* compiled from: TransactionSelectionViewState.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÂ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÂ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÂ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJv\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010+R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010,R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b-\u0010\u0014R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u0010\u001cR$\u00102\u001a\u0012\u0012\u0004\u0012\u00020\u000500j\b\u0012\u0004\u0012\u00020\u0005`18\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R$\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u000500j\b\u0012\u0004\u0012\u00020\u0005`18\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R \u00109\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000206058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b@\u0010\u0014R\u0011\u0010C\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\bB\u0010$R\u0011\u0010D\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\bD\u0010?R\u0011\u0010E\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\bE\u0010?R\u0013\u0010H\u001a\u0004\u0018\u0001068F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0011\u0010L\u001a\u00020I8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010N\u001a\u00020I8F¢\u0006\u0006\u001a\u0004\bM\u0010KR\u0013\u0010Q\u001a\u0004\u0018\u00010\"8G¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0011\u0010R\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\bR\u0010?R\u0011\u0010S\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\bS\u0010?R\u0019\u0010U\u001a\n\u0012\u0004\u0012\u00020:\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bT\u0010\u0018R%\u0010W\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020605\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bV\u0010\u0018¨\u0006X"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionSelectionViewState;", "", "Lcom/robinhood/models/api/minerva/ApiDispute$Reason;", "disputeReason", "", "Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "cardTransactions", "Lcom/robinhood/models/db/mcduckling/MinervaAccount;", "minervaAccount", "Lcom/robinhood/udf/UiEvent;", "", "dateRangeCalculationEvent", "validateTransactionsEvent", "selectedTransactions", "preSelectedTransaction", "<init>", "(Lcom/robinhood/models/api/minerva/ApiDispute$Reason;Ljava/util/List;Lcom/robinhood/models/db/mcduckling/MinervaAccount;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Ljava/util/List;Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;)V", "component1", "()Lcom/robinhood/models/api/minerva/ApiDispute$Reason;", "component2", "()Ljava/util/List;", "component3", "()Lcom/robinhood/models/db/mcduckling/MinervaAccount;", "component4", "()Lcom/robinhood/udf/UiEvent;", "component5", "component6", "component7", "()Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "copy", "(Lcom/robinhood/models/api/minerva/ApiDispute$Reason;Ljava/util/List;Lcom/robinhood/models/db/mcduckling/MinervaAccount;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Ljava/util/List;Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;)Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionSelectionViewState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/api/minerva/ApiDispute$Reason;", "Ljava/util/List;", "Lcom/robinhood/models/db/mcduckling/MinervaAccount;", "Lcom/robinhood/udf/UiEvent;", "getSelectedTransactions", "Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "getPreSelectedTransaction", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "initiatedAtComparator", "Ljava/util/Comparator;", "preSelectedComparator", "Lkotlin/Pair;", "j$/time/LocalDate", "getInitialDateRange", "()Lkotlin/Pair;", "initialDateRange", "Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionValidationResult;", "getTransactionValidationResult", "()Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionValidationResult;", "transactionValidationResult", "isSinglePreSelectedDuplicateTransaction", "()Z", "getSortedCardTransactions", "sortedCardTransactions", "getSelectedTransactionCount", "selectedTransactionCount", "isReviewButtonVisible", "isContinueEnabled", "getEarliestAvailableDate", "()Lj$/time/LocalDate;", "earliestAvailableDate", "Lcom/robinhood/utils/resource/StringResource;", "getEmptyStateTitleRes", "()Lcom/robinhood/utils/resource/StringResource;", "emptyStateTitleRes", "getEmptyStateDescriptionRes", "emptyStateDescriptionRes", "getEmptyStateImageTopMarginRes", "()Ljava/lang/Integer;", "emptyStateImageTopMarginRes", "isEmptyStateVisible", "isTransactionListVisible", "getTransactionValidationResultEvent", "transactionValidationResultEvent", "getInitialDateRangeSelectionEvent", "initialDateRangeSelectionEvent", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class TransactionSelectionViewState {
    public static final int $stable = 8;
    private final List<SettledCardTransaction> cardTransactions;
    private final UiEvent<Unit> dateRangeCalculationEvent;
    private final ApiDispute.Reason disputeReason;
    private final Comparator<SettledCardTransaction> initiatedAtComparator;
    private final MinervaAccount minervaAccount;
    private final Comparator<SettledCardTransaction> preSelectedComparator;
    private final SettledCardTransaction preSelectedTransaction;
    private final List<SettledCardTransaction> selectedTransactions;
    private final UiEvent<Unit> validateTransactionsEvent;

    /* renamed from: component1, reason: from getter */
    private final ApiDispute.Reason getDisputeReason() {
        return this.disputeReason;
    }

    private final List<SettledCardTransaction> component2() {
        return this.cardTransactions;
    }

    /* renamed from: component3, reason: from getter */
    private final MinervaAccount getMinervaAccount() {
        return this.minervaAccount;
    }

    private final UiEvent<Unit> component4() {
        return this.dateRangeCalculationEvent;
    }

    private final UiEvent<Unit> component5() {
        return this.validateTransactionsEvent;
    }

    public static /* synthetic */ TransactionSelectionViewState copy$default(TransactionSelectionViewState transactionSelectionViewState, ApiDispute.Reason reason, List list, MinervaAccount minervaAccount, UiEvent uiEvent, UiEvent uiEvent2, List list2, SettledCardTransaction settledCardTransaction, int i, Object obj) {
        if ((i & 1) != 0) {
            reason = transactionSelectionViewState.disputeReason;
        }
        if ((i & 2) != 0) {
            list = transactionSelectionViewState.cardTransactions;
        }
        if ((i & 4) != 0) {
            minervaAccount = transactionSelectionViewState.minervaAccount;
        }
        if ((i & 8) != 0) {
            uiEvent = transactionSelectionViewState.dateRangeCalculationEvent;
        }
        if ((i & 16) != 0) {
            uiEvent2 = transactionSelectionViewState.validateTransactionsEvent;
        }
        if ((i & 32) != 0) {
            list2 = transactionSelectionViewState.selectedTransactions;
        }
        if ((i & 64) != 0) {
            settledCardTransaction = transactionSelectionViewState.preSelectedTransaction;
        }
        List list3 = list2;
        SettledCardTransaction settledCardTransaction2 = settledCardTransaction;
        UiEvent uiEvent3 = uiEvent2;
        MinervaAccount minervaAccount2 = minervaAccount;
        return transactionSelectionViewState.copy(reason, list, minervaAccount2, uiEvent, uiEvent3, list3, settledCardTransaction2);
    }

    public final List<SettledCardTransaction> component6() {
        return this.selectedTransactions;
    }

    /* renamed from: component7, reason: from getter */
    public final SettledCardTransaction getPreSelectedTransaction() {
        return this.preSelectedTransaction;
    }

    public final TransactionSelectionViewState copy(ApiDispute.Reason disputeReason, List<SettledCardTransaction> cardTransactions, MinervaAccount minervaAccount, UiEvent<Unit> dateRangeCalculationEvent, UiEvent<Unit> validateTransactionsEvent, List<SettledCardTransaction> selectedTransactions, SettledCardTransaction preSelectedTransaction) {
        Intrinsics.checkNotNullParameter(disputeReason, "disputeReason");
        Intrinsics.checkNotNullParameter(cardTransactions, "cardTransactions");
        Intrinsics.checkNotNullParameter(selectedTransactions, "selectedTransactions");
        return new TransactionSelectionViewState(disputeReason, cardTransactions, minervaAccount, dateRangeCalculationEvent, validateTransactionsEvent, selectedTransactions, preSelectedTransaction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionSelectionViewState)) {
            return false;
        }
        TransactionSelectionViewState transactionSelectionViewState = (TransactionSelectionViewState) other;
        return this.disputeReason == transactionSelectionViewState.disputeReason && Intrinsics.areEqual(this.cardTransactions, transactionSelectionViewState.cardTransactions) && Intrinsics.areEqual(this.minervaAccount, transactionSelectionViewState.minervaAccount) && Intrinsics.areEqual(this.dateRangeCalculationEvent, transactionSelectionViewState.dateRangeCalculationEvent) && Intrinsics.areEqual(this.validateTransactionsEvent, transactionSelectionViewState.validateTransactionsEvent) && Intrinsics.areEqual(this.selectedTransactions, transactionSelectionViewState.selectedTransactions) && Intrinsics.areEqual(this.preSelectedTransaction, transactionSelectionViewState.preSelectedTransaction);
    }

    public int hashCode() {
        int iHashCode = ((this.disputeReason.hashCode() * 31) + this.cardTransactions.hashCode()) * 31;
        MinervaAccount minervaAccount = this.minervaAccount;
        int iHashCode2 = (iHashCode + (minervaAccount == null ? 0 : minervaAccount.hashCode())) * 31;
        UiEvent<Unit> uiEvent = this.dateRangeCalculationEvent;
        int iHashCode3 = (iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Unit> uiEvent2 = this.validateTransactionsEvent;
        int iHashCode4 = (((iHashCode3 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31) + this.selectedTransactions.hashCode()) * 31;
        SettledCardTransaction settledCardTransaction = this.preSelectedTransaction;
        return iHashCode4 + (settledCardTransaction != null ? settledCardTransaction.hashCode() : 0);
    }

    public String toString() {
        return "TransactionSelectionViewState(disputeReason=" + this.disputeReason + ", cardTransactions=" + this.cardTransactions + ", minervaAccount=" + this.minervaAccount + ", dateRangeCalculationEvent=" + this.dateRangeCalculationEvent + ", validateTransactionsEvent=" + this.validateTransactionsEvent + ", selectedTransactions=" + this.selectedTransactions + ", preSelectedTransaction=" + this.preSelectedTransaction + ")";
    }

    public TransactionSelectionViewState(ApiDispute.Reason disputeReason, List<SettledCardTransaction> cardTransactions, MinervaAccount minervaAccount, UiEvent<Unit> uiEvent, UiEvent<Unit> uiEvent2, List<SettledCardTransaction> selectedTransactions, SettledCardTransaction settledCardTransaction) {
        Intrinsics.checkNotNullParameter(disputeReason, "disputeReason");
        Intrinsics.checkNotNullParameter(cardTransactions, "cardTransactions");
        Intrinsics.checkNotNullParameter(selectedTransactions, "selectedTransactions");
        this.disputeReason = disputeReason;
        this.cardTransactions = cardTransactions;
        this.minervaAccount = minervaAccount;
        this.dateRangeCalculationEvent = uiEvent;
        this.validateTransactionsEvent = uiEvent2;
        this.selectedTransactions = selectedTransactions;
        this.preSelectedTransaction = settledCardTransaction;
        this.initiatedAtComparator = new Comparator() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionViewState$special$$inlined$compareByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((SettledCardTransaction) t2).getInitiatedAt(), ((SettledCardTransaction) t).getInitiatedAt());
            }
        };
        this.preSelectedComparator = new Comparator() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionViewState$special$$inlined$compareByDescending$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                UUID id = ((SettledCardTransaction) t2).getId();
                SettledCardTransaction preSelectedTransaction = this.this$0.getPreSelectedTransaction();
                Boolean boolValueOf = Boolean.valueOf(Intrinsics.areEqual(id, preSelectedTransaction != null ? preSelectedTransaction.getId() : null));
                UUID id2 = ((SettledCardTransaction) t).getId();
                SettledCardTransaction preSelectedTransaction2 = this.this$0.getPreSelectedTransaction();
                return ComparisonsKt.compareValues(boolValueOf, Boolean.valueOf(Intrinsics.areEqual(id2, preSelectedTransaction2 != null ? preSelectedTransaction2.getId() : null)));
            }
        };
    }

    public /* synthetic */ TransactionSelectionViewState(ApiDispute.Reason reason, List list, MinervaAccount minervaAccount, UiEvent uiEvent, UiEvent uiEvent2, List list2, SettledCardTransaction settledCardTransaction, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reason, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : minervaAccount, (i & 8) != 0 ? null : uiEvent, (i & 16) != 0 ? null : uiEvent2, (i & 32) != 0 ? CollectionsKt.emptyList() : list2, (i & 64) != 0 ? null : settledCardTransaction);
    }

    public final List<SettledCardTransaction> getSelectedTransactions() {
        return this.selectedTransactions;
    }

    public final SettledCardTransaction getPreSelectedTransaction() {
        return this.preSelectedTransaction;
    }

    private final Tuples2<LocalDate, LocalDate> getInitialDateRange() {
        return LocalDates2.getInitialTransactionSelectionDatePickerRange(getEarliestAvailableDate());
    }

    private final TransactionValidationResult getTransactionValidationResult() {
        if (this.disputeReason == ApiDispute.Reason.DUPLICATE_CHARGE) {
            Money.Adjustment adjustment = ((SettledCardTransaction) CollectionsKt.first((List) this.selectedTransactions)).getAdjustment();
            List<SettledCardTransaction> list = this.selectedTransactions;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (!Intrinsics.areEqual(((SettledCardTransaction) it.next()).getAdjustment(), adjustment)) {
                        return TransactionValidationResult.Error.INSTANCE;
                    }
                }
            }
        }
        return new TransactionValidationResult.Success(this.selectedTransactions);
    }

    private final boolean isSinglePreSelectedDuplicateTransaction() {
        return this.disputeReason == ApiDispute.Reason.DUPLICATE_CHARGE && getSortedCardTransactions().size() == 1 && CollectionsKt.contains(getSortedCardTransactions(), this.preSelectedTransaction);
    }

    public final List<SettledCardTransaction> getSortedCardTransactions() {
        List<SettledCardTransaction> mutableList;
        SettledCardTransaction settledCardTransaction = this.preSelectedTransaction;
        if (settledCardTransaction != null && !this.cardTransactions.contains(settledCardTransaction)) {
            mutableList = CollectionsKt.toMutableList((Collection) this.cardTransactions);
            mutableList.add(0, this.preSelectedTransaction);
        } else {
            mutableList = this.cardTransactions;
        }
        return CollectionsKt.sortedWith(mutableList, ComparisonsKt.then(this.preSelectedComparator, this.initiatedAtComparator));
    }

    public final int getSelectedTransactionCount() {
        return this.selectedTransactions.size();
    }

    public final boolean isReviewButtonVisible() {
        return !this.selectedTransactions.isEmpty();
    }

    public final boolean isContinueEnabled() {
        return ((this.disputeReason == ApiDispute.Reason.DUPLICATE_CHARGE && this.preSelectedTransaction != null && this.selectedTransactions.size() == 1 && getSortedCardTransactions().size() == 1) || this.selectedTransactions.isEmpty()) ? false : true;
    }

    public final LocalDate getEarliestAvailableDate() {
        Instant createdAt;
        MinervaAccount minervaAccount = this.minervaAccount;
        if (minervaAccount == null || (createdAt = minervaAccount.getCreatedAt()) == null) {
            return null;
        }
        return Instants.toLocalDate$default(createdAt, null, 1, null);
    }

    public final StringResource getEmptyStateTitleRes() {
        if (this.disputeReason == ApiDispute.Reason.DUPLICATE_CHARGE) {
            return StringResource.INSTANCE.invoke(C10007R.string.dispute_duplicate_transaction_selection_empty_title, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C10007R.string.dispute_transaction_selection_empty_title, new Object[0]);
    }

    public final StringResource getEmptyStateDescriptionRes() {
        if (this.disputeReason == ApiDispute.Reason.DUPLICATE_CHARGE) {
            return StringResource.INSTANCE.invoke(C10007R.string.dispute_duplicate_transaction_selection_empty_description, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C10007R.string.dispute_transaction_selection_empty_description, new Object[0]);
    }

    public final Integer getEmptyStateImageTopMarginRes() {
        if (isSinglePreSelectedDuplicateTransaction()) {
            return Integer.valueOf(C13997R.dimen.rds_spacing_xxlarge);
        }
        return null;
    }

    public final boolean isEmptyStateVisible() {
        return isSinglePreSelectedDuplicateTransaction() || getSortedCardTransactions().isEmpty();
    }

    public final boolean isTransactionListVisible() {
        return !getSortedCardTransactions().isEmpty();
    }

    public final UiEvent<TransactionValidationResult> getTransactionValidationResultEvent() {
        UiEvent<Unit> uiEvent = this.validateTransactionsEvent;
        if (uiEvent == null || uiEvent.consume() == null) {
            return null;
        }
        return new UiEvent<>(getTransactionValidationResult());
    }

    public final UiEvent<Tuples2<LocalDate, LocalDate>> getInitialDateRangeSelectionEvent() {
        UiEvent<Unit> uiEvent = this.dateRangeCalculationEvent;
        if (uiEvent == null || uiEvent.consume() == null) {
            return null;
        }
        return new UiEvent<>(getInitialDateRange());
    }
}
