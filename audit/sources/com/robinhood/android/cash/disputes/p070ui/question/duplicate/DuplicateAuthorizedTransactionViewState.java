package com.robinhood.android.cash.disputes.p070ui.question.duplicate;

import com.robinhood.android.cash.disputes.extensions.LocalDates2;
import com.robinhood.android.cash.disputes.p070ui.question.QuestionDisplayHeader;
import com.robinhood.android.cash.disputes.p070ui.question.QuestionDisplayHeader2;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.models.p320db.mcduckling.SettledCardTransaction;
import com.robinhood.models.p355ui.DisputeQuestionnaire;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.datetime.Instants;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import p479j$.time.Instant;
import p479j$.time.LocalDate;

/* compiled from: DuplicateAuthorizedTransactionViewState.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÂ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÂ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018Jr\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b0\u0010\u001aR\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b1\u0010\u0018R$\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u000502j\b\u0012\u0004\u0012\u00020\u0005`38\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R \u0010:\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u000207068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b;\u0010\u0014R\u0011\u0010=\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0011\u0010?\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b?\u0010>R\u0013\u0010B\u001a\u0004\u0018\u0001078F¢\u0006\u0006\u001a\u0004\b@\u0010AR%\u0010D\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020706\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bC\u0010\u0018R\u0014\u0010F\u001a\u00020\u001f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bE\u0010!R\u0016\u0010H\u001a\u0004\u0018\u00010\u001f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bG\u0010!R\u0014\u0010I\u001a\u00020'8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bI\u0010>¨\u0006J"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/duplicate/DuplicateAuthorizedTransactionViewState;", "Lcom/robinhood/android/cash/disputes/ui/question/QuestionDisplayHeader;", "Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$DuplicateAuthorizedTransactionInput;", "question", "", "Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "cardTransactions", "Lcom/robinhood/models/db/mcduckling/MinervaAccount;", "minervaAccount", "Lcom/robinhood/udf/UiEvent;", "", "dateRangeCalculationEvent", "duplicateTransaction", "authorizedTransaction", "authorizedTransactionPreFillEvent", "<init>", "(Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$DuplicateAuthorizedTransactionInput;Ljava/util/List;Lcom/robinhood/models/db/mcduckling/MinervaAccount;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;Lcom/robinhood/udf/UiEvent;)V", "component1", "()Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$DuplicateAuthorizedTransactionInput;", "component2", "()Ljava/util/List;", "component3", "()Lcom/robinhood/models/db/mcduckling/MinervaAccount;", "component4", "()Lcom/robinhood/udf/UiEvent;", "component5", "()Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "component6", "component7", "copy", "(Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$DuplicateAuthorizedTransactionInput;Ljava/util/List;Lcom/robinhood/models/db/mcduckling/MinervaAccount;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;Lcom/robinhood/udf/UiEvent;)Lcom/robinhood/android/cash/disputes/ui/question/duplicate/DuplicateAuthorizedTransactionViewState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$DuplicateAuthorizedTransactionInput;", "Ljava/util/List;", "Lcom/robinhood/models/db/mcduckling/MinervaAccount;", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "getDuplicateTransaction", "getAuthorizedTransaction", "getAuthorizedTransactionPreFillEvent", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "initiatedAtComparator", "Ljava/util/Comparator;", "Lkotlin/Pair;", "j$/time/LocalDate", "getInitialDateRange", "()Lkotlin/Pair;", "initialDateRange", "getSortedCardTransactions", "sortedCardTransactions", "isEmptyStateVisible", "()Z", "isContinueEnabled", "getEarliestAvailableDate", "()Lj$/time/LocalDate;", "earliestAvailableDate", "getInitialDateRangeSelectionEvent", "initialDateRangeSelectionEvent", "getTitleText", "titleText", "getSubtitleText", "subtitleText", "isSubtitleVisible", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DuplicateAuthorizedTransactionViewState implements QuestionDisplayHeader {
    public static final int $stable = 8;
    private final /* synthetic */ QuestionDisplayHeader2 $$delegate_0;
    private final SettledCardTransaction authorizedTransaction;
    private final UiEvent<SettledCardTransaction> authorizedTransactionPreFillEvent;
    private final List<SettledCardTransaction> cardTransactions;
    private final UiEvent<Unit> dateRangeCalculationEvent;
    private final SettledCardTransaction duplicateTransaction;
    private final Comparator<SettledCardTransaction> initiatedAtComparator;
    private final MinervaAccount minervaAccount;
    private final DisputeQuestionnaire.Question.DuplicateAuthorizedTransactionInput question;

    /* renamed from: component1, reason: from getter */
    private final DisputeQuestionnaire.Question.DuplicateAuthorizedTransactionInput getQuestion() {
        return this.question;
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

    public static /* synthetic */ DuplicateAuthorizedTransactionViewState copy$default(DuplicateAuthorizedTransactionViewState duplicateAuthorizedTransactionViewState, DisputeQuestionnaire.Question.DuplicateAuthorizedTransactionInput duplicateAuthorizedTransactionInput, List list, MinervaAccount minervaAccount, UiEvent uiEvent, SettledCardTransaction settledCardTransaction, SettledCardTransaction settledCardTransaction2, UiEvent uiEvent2, int i, Object obj) {
        if ((i & 1) != 0) {
            duplicateAuthorizedTransactionInput = duplicateAuthorizedTransactionViewState.question;
        }
        if ((i & 2) != 0) {
            list = duplicateAuthorizedTransactionViewState.cardTransactions;
        }
        if ((i & 4) != 0) {
            minervaAccount = duplicateAuthorizedTransactionViewState.minervaAccount;
        }
        if ((i & 8) != 0) {
            uiEvent = duplicateAuthorizedTransactionViewState.dateRangeCalculationEvent;
        }
        if ((i & 16) != 0) {
            settledCardTransaction = duplicateAuthorizedTransactionViewState.duplicateTransaction;
        }
        if ((i & 32) != 0) {
            settledCardTransaction2 = duplicateAuthorizedTransactionViewState.authorizedTransaction;
        }
        if ((i & 64) != 0) {
            uiEvent2 = duplicateAuthorizedTransactionViewState.authorizedTransactionPreFillEvent;
        }
        SettledCardTransaction settledCardTransaction3 = settledCardTransaction2;
        UiEvent uiEvent3 = uiEvent2;
        SettledCardTransaction settledCardTransaction4 = settledCardTransaction;
        MinervaAccount minervaAccount2 = minervaAccount;
        return duplicateAuthorizedTransactionViewState.copy(duplicateAuthorizedTransactionInput, list, minervaAccount2, uiEvent, settledCardTransaction4, settledCardTransaction3, uiEvent3);
    }

    /* renamed from: component5, reason: from getter */
    public final SettledCardTransaction getDuplicateTransaction() {
        return this.duplicateTransaction;
    }

    /* renamed from: component6, reason: from getter */
    public final SettledCardTransaction getAuthorizedTransaction() {
        return this.authorizedTransaction;
    }

    public final UiEvent<SettledCardTransaction> component7() {
        return this.authorizedTransactionPreFillEvent;
    }

    public final DuplicateAuthorizedTransactionViewState copy(DisputeQuestionnaire.Question.DuplicateAuthorizedTransactionInput question, List<SettledCardTransaction> cardTransactions, MinervaAccount minervaAccount, UiEvent<Unit> dateRangeCalculationEvent, SettledCardTransaction duplicateTransaction, SettledCardTransaction authorizedTransaction, UiEvent<SettledCardTransaction> authorizedTransactionPreFillEvent) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(cardTransactions, "cardTransactions");
        return new DuplicateAuthorizedTransactionViewState(question, cardTransactions, minervaAccount, dateRangeCalculationEvent, duplicateTransaction, authorizedTransaction, authorizedTransactionPreFillEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DuplicateAuthorizedTransactionViewState)) {
            return false;
        }
        DuplicateAuthorizedTransactionViewState duplicateAuthorizedTransactionViewState = (DuplicateAuthorizedTransactionViewState) other;
        return Intrinsics.areEqual(this.question, duplicateAuthorizedTransactionViewState.question) && Intrinsics.areEqual(this.cardTransactions, duplicateAuthorizedTransactionViewState.cardTransactions) && Intrinsics.areEqual(this.minervaAccount, duplicateAuthorizedTransactionViewState.minervaAccount) && Intrinsics.areEqual(this.dateRangeCalculationEvent, duplicateAuthorizedTransactionViewState.dateRangeCalculationEvent) && Intrinsics.areEqual(this.duplicateTransaction, duplicateAuthorizedTransactionViewState.duplicateTransaction) && Intrinsics.areEqual(this.authorizedTransaction, duplicateAuthorizedTransactionViewState.authorizedTransaction) && Intrinsics.areEqual(this.authorizedTransactionPreFillEvent, duplicateAuthorizedTransactionViewState.authorizedTransactionPreFillEvent);
    }

    @Override // com.robinhood.android.cash.disputes.p070ui.question.QuestionDisplayHeader
    public String getSubtitleText() {
        return this.$$delegate_0.getSubtitleText();
    }

    @Override // com.robinhood.android.cash.disputes.p070ui.question.QuestionDisplayHeader
    public String getTitleText() {
        return this.$$delegate_0.getTitleText();
    }

    public int hashCode() {
        int iHashCode = ((this.question.hashCode() * 31) + this.cardTransactions.hashCode()) * 31;
        MinervaAccount minervaAccount = this.minervaAccount;
        int iHashCode2 = (iHashCode + (minervaAccount == null ? 0 : minervaAccount.hashCode())) * 31;
        UiEvent<Unit> uiEvent = this.dateRangeCalculationEvent;
        int iHashCode3 = (iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        SettledCardTransaction settledCardTransaction = this.duplicateTransaction;
        int iHashCode4 = (iHashCode3 + (settledCardTransaction == null ? 0 : settledCardTransaction.hashCode())) * 31;
        SettledCardTransaction settledCardTransaction2 = this.authorizedTransaction;
        int iHashCode5 = (iHashCode4 + (settledCardTransaction2 == null ? 0 : settledCardTransaction2.hashCode())) * 31;
        UiEvent<SettledCardTransaction> uiEvent2 = this.authorizedTransactionPreFillEvent;
        return iHashCode5 + (uiEvent2 != null ? uiEvent2.hashCode() : 0);
    }

    @Override // com.robinhood.android.cash.disputes.p070ui.question.QuestionDisplayHeader
    public boolean isSubtitleVisible() {
        return this.$$delegate_0.isSubtitleVisible();
    }

    public String toString() {
        return "DuplicateAuthorizedTransactionViewState(question=" + this.question + ", cardTransactions=" + this.cardTransactions + ", minervaAccount=" + this.minervaAccount + ", dateRangeCalculationEvent=" + this.dateRangeCalculationEvent + ", duplicateTransaction=" + this.duplicateTransaction + ", authorizedTransaction=" + this.authorizedTransaction + ", authorizedTransactionPreFillEvent=" + this.authorizedTransactionPreFillEvent + ")";
    }

    public DuplicateAuthorizedTransactionViewState(DisputeQuestionnaire.Question.DuplicateAuthorizedTransactionInput question, List<SettledCardTransaction> cardTransactions, MinervaAccount minervaAccount, UiEvent<Unit> uiEvent, SettledCardTransaction settledCardTransaction, SettledCardTransaction settledCardTransaction2, UiEvent<SettledCardTransaction> uiEvent2) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(cardTransactions, "cardTransactions");
        this.$$delegate_0 = new QuestionDisplayHeader2(question);
        this.question = question;
        this.cardTransactions = cardTransactions;
        this.minervaAccount = minervaAccount;
        this.dateRangeCalculationEvent = uiEvent;
        this.duplicateTransaction = settledCardTransaction;
        this.authorizedTransaction = settledCardTransaction2;
        this.authorizedTransactionPreFillEvent = uiEvent2;
        this.initiatedAtComparator = new Comparator() { // from class: com.robinhood.android.cash.disputes.ui.question.duplicate.DuplicateAuthorizedTransactionViewState$special$$inlined$compareByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((SettledCardTransaction) t2).getInitiatedAt(), ((SettledCardTransaction) t).getInitiatedAt());
            }
        };
    }

    public /* synthetic */ DuplicateAuthorizedTransactionViewState(DisputeQuestionnaire.Question.DuplicateAuthorizedTransactionInput duplicateAuthorizedTransactionInput, List list, MinervaAccount minervaAccount, UiEvent uiEvent, SettledCardTransaction settledCardTransaction, SettledCardTransaction settledCardTransaction2, UiEvent uiEvent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(duplicateAuthorizedTransactionInput, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : minervaAccount, (i & 8) != 0 ? null : uiEvent, (i & 16) != 0 ? null : settledCardTransaction, (i & 32) != 0 ? null : settledCardTransaction2, (i & 64) != 0 ? null : uiEvent2);
    }

    public final SettledCardTransaction getDuplicateTransaction() {
        return this.duplicateTransaction;
    }

    public final SettledCardTransaction getAuthorizedTransaction() {
        return this.authorizedTransaction;
    }

    public final UiEvent<SettledCardTransaction> getAuthorizedTransactionPreFillEvent() {
        return this.authorizedTransactionPreFillEvent;
    }

    private final Tuples2<LocalDate, LocalDate> getInitialDateRange() {
        return LocalDates2.getInitialTransactionSelectionDatePickerRange(getEarliestAvailableDate());
    }

    public final List<SettledCardTransaction> getSortedCardTransactions() {
        List mutableList = CollectionsKt.toMutableList((Collection) this.cardTransactions);
        TypeIntrinsics.asMutableCollection(mutableList).remove(this.duplicateTransaction);
        return CollectionsKt.sortedWith(mutableList, this.initiatedAtComparator);
    }

    public final boolean isEmptyStateVisible() {
        return getSortedCardTransactions().isEmpty();
    }

    public final boolean isContinueEnabled() {
        return this.authorizedTransaction != null;
    }

    public final LocalDate getEarliestAvailableDate() {
        Instant createdAt;
        MinervaAccount minervaAccount = this.minervaAccount;
        if (minervaAccount == null || (createdAt = minervaAccount.getCreatedAt()) == null) {
            return null;
        }
        return Instants.toLocalDate$default(createdAt, null, 1, null);
    }

    public final UiEvent<Tuples2<LocalDate, LocalDate>> getInitialDateRangeSelectionEvent() {
        UiEvent<Unit> uiEvent = this.dateRangeCalculationEvent;
        if (uiEvent == null || uiEvent.consume() == null) {
            return null;
        }
        return new UiEvent<>(getInitialDateRange());
    }
}
