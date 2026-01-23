package com.robinhood.android.cash.disputes.p070ui.transaction;

import androidx.lifecycle.SavedStateHandle;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.cash.disputes.p070ui.transaction.TransactionSelectionFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.CardTransactionStore;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.models.api.minerva.ApiDispute;
import com.robinhood.models.p320db.mcduckling.CardTransaction;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.models.p320db.mcduckling.SettledCardTransaction;
import com.robinhood.udf.UiEvent;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.ZoneId;

/* compiled from: TransactionSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001$B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR*\u0010\"\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0006\u0012\u0004\u0018\u00010!0 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionSelectionDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionSelectionViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/librobinhood/data/store/CardTransactionStore;", "cardTransactionStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "minervaAccountStore", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/librobinhood/data/store/CardTransactionStore;Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Landroidx/lifecycle/SavedStateHandle;)V", "", "onCreate", "()V", "validateSelectedTransactions", "j$/time/LocalDate", "startDate", "endDate", "updateSelectedDateRange", "(Lj$/time/LocalDate;Lj$/time/LocalDate;)V", "", "Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "transactions", "setSelectedTransactions", "(Ljava/util/List;)V", "Lcom/robinhood/librobinhood/data/store/CardTransactionStore;", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lkotlin/Pair;", "j$/time/Instant", "dateRangeRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Companion", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class TransactionSelectionDuxo extends OldBaseDuxo<TransactionSelectionViewState> implements HasSavedState {
    private final CardTransactionStore cardTransactionStore;
    private final BehaviorRelay<Tuples2<Instant, Instant>> dateRangeRelay;
    private final MinervaAccountStore minervaAccountStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public TransactionSelectionDuxo(CardTransactionStore cardTransactionStore, MinervaAccountStore minervaAccountStore, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(cardTransactionStore, "cardTransactionStore");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Scheduler scheduler = null;
        super(new TransactionSelectionViewState(((TransactionSelectionFragment.Args) INSTANCE.getArgs(savedStateHandle)).getDisputeReason(), null, null, new UiEvent(Unit.INSTANCE), null, null, null, 118, null), scheduler, 2, 0 == true ? 1 : 0);
        this.cardTransactionStore = cardTransactionStore;
        this.minervaAccountStore = minervaAccountStore;
        this.savedStateHandle = savedStateHandle;
        BehaviorRelay<Tuples2<Instant, Instant>> behaviorRelayCreateDefault = BehaviorRelay.createDefault(new Tuples2(null, null));
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.dateRangeRelay = behaviorRelayCreateDefault;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        CardTransactionStore.refreshDisputableTransactions$default(this.cardTransactionStore, true, null, null, 6, null);
        Companion companion = INSTANCE;
        if (((TransactionSelectionFragment.Args) companion.getArgs((HasSavedState) this)).getPreSelectedTransactionId() != null) {
            CardTransactionStore cardTransactionStore = this.cardTransactionStore;
            CardTransaction.Status status = CardTransaction.Status.SETTLED;
            UUID preSelectedTransactionId = ((TransactionSelectionFragment.Args) companion.getArgs((HasSavedState) this)).getPreSelectedTransactionId();
            Intrinsics.checkNotNull(preSelectedTransactionId);
            LifecycleHost.DefaultImpls.bind$default(this, cardTransactionStore.streamTransaction(status, preSelectedTransactionId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionDuxo$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TransactionSelectionDuxo.onCreate$lambda$1(this.f$0, (CardTransaction) obj);
                }
            });
        }
        Observable<R> observableSwitchMap = this.dateRangeRelay.switchMap(new Function() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionDuxo.onCreate.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<SettledCardTransaction>> apply(Tuples2<Instant, Instant> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                Instant instantComponent1 = tuples2.component1();
                Instant instantComponent2 = tuples2.component2();
                Companion companion2 = TransactionSelectionDuxo.INSTANCE;
                if (((TransactionSelectionFragment.Args) companion2.getArgs((HasSavedState) TransactionSelectionDuxo.this)).getDisputeReason() != ApiDispute.Reason.DUPLICATE_CHARGE) {
                    return TransactionSelectionDuxo.this.cardTransactionStore.streamDisputableTransactions(instantComponent2, instantComponent1);
                }
                return TransactionSelectionDuxo.this.cardTransactionStore.streamDuplicateDisputableTransactions(instantComponent2, instantComponent1, ((TransactionSelectionFragment.Args) companion2.getArgs((HasSavedState) TransactionSelectionDuxo.this)).getPreSelectedTransactionId());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransactionSelectionDuxo.onCreate$lambda$3(this.f$0, (List) obj);
            }
        });
        MinervaAccountStore.refresh$default(this.minervaAccountStore, false, 1, null);
        LifecycleHost.DefaultImpls.bind$default(this, MinervaAccountStore.streamAccount$default(this.minervaAccountStore, null, 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransactionSelectionDuxo.onCreate$lambda$5(this.f$0, (MinervaAccount) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(TransactionSelectionDuxo transactionSelectionDuxo, final CardTransaction preSelectedTransaction) {
        Intrinsics.checkNotNullParameter(preSelectedTransaction, "preSelectedTransaction");
        transactionSelectionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransactionSelectionDuxo.onCreate$lambda$1$lambda$0(preSelectedTransaction, (TransactionSelectionViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransactionSelectionViewState onCreate$lambda$1$lambda$0(CardTransaction cardTransaction, TransactionSelectionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(cardTransaction, "null cannot be cast to non-null type com.robinhood.models.db.mcduckling.SettledCardTransaction");
        return TransactionSelectionViewState.copy$default(applyMutation, null, null, null, null, null, null, (SettledCardTransaction) cardTransaction, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(TransactionSelectionDuxo transactionSelectionDuxo, final List list) {
        transactionSelectionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransactionSelectionDuxo.onCreate$lambda$3$lambda$2(list, (TransactionSelectionViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransactionSelectionViewState onCreate$lambda$3$lambda$2(List list, TransactionSelectionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(list);
        return TransactionSelectionViewState.copy$default(applyMutation, null, list, null, null, null, null, null, 125, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$5(TransactionSelectionDuxo transactionSelectionDuxo, final MinervaAccount minervaAccount) {
        Intrinsics.checkNotNullParameter(minervaAccount, "minervaAccount");
        transactionSelectionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransactionSelectionDuxo.onCreate$lambda$5$lambda$4(minervaAccount, (TransactionSelectionViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransactionSelectionViewState onCreate$lambda$5$lambda$4(MinervaAccount minervaAccount, TransactionSelectionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return TransactionSelectionViewState.copy$default(applyMutation, null, null, minervaAccount, new UiEvent(Unit.INSTANCE), null, null, null, 115, null);
    }

    public final void validateSelectedTransactions() {
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransactionSelectionDuxo.validateSelectedTransactions$lambda$6((TransactionSelectionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransactionSelectionViewState validateSelectedTransactions$lambda$6(TransactionSelectionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return TransactionSelectionViewState.copy$default(applyMutation, null, null, null, null, new UiEvent(Unit.INSTANCE), null, null, 111, null);
    }

    public final void updateSelectedDateRange(LocalDate startDate, LocalDate endDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Instant instant = startDate.atStartOfDay(ZoneId.systemDefault()).toInstant();
        Instant instant2 = endDate.atStartOfDay(ZoneId.systemDefault()).plusDays(1L).minusSeconds(1L).toInstant();
        this.cardTransactionStore.refreshDisputableTransactions(true, instant2, instant);
        this.dateRangeRelay.accept(new Tuples2<>(instant, instant2));
    }

    public final void setSelectedTransactions(final List<SettledCardTransaction> transactions) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransactionSelectionDuxo.setSelectedTransactions$lambda$7(transactions, (TransactionSelectionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransactionSelectionViewState setSelectedTransactions$lambda$7(List list, TransactionSelectionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return TransactionSelectionViewState.copy$default(applyMutation, null, null, null, null, null, list, null, 95, null);
    }

    /* compiled from: TransactionSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionSelectionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionSelectionDuxo;", "Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionSelectionFragment$Args;", "<init>", "()V", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<TransactionSelectionDuxo, TransactionSelectionFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public TransactionSelectionFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (TransactionSelectionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public TransactionSelectionFragment.Args getArgs(TransactionSelectionDuxo transactionSelectionDuxo) {
            return (TransactionSelectionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, transactionSelectionDuxo);
        }
    }
}
