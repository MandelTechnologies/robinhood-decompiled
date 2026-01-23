package com.robinhood.android.cash.disputes.p070ui.question.duplicate;

import androidx.lifecycle.SavedStateHandle;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionResponse;
import com.robinhood.android.cash.disputes.p070ui.question.duplicate.DuplicateAuthorizedTransactionFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.CardTransactionStore;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.models.p320db.mcduckling.CardTransaction;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.models.p320db.mcduckling.SettledCardTransaction;
import com.robinhood.udf.UiEvent;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.ZoneId;

/* compiled from: DuplicateAuthorizedTransactionDuxo.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001)B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#R*\u0010'\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0006\u0012\u0004\u0018\u00010&0%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/duplicate/DuplicateAuthorizedTransactionDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/disputes/ui/question/duplicate/DuplicateAuthorizedTransactionViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/librobinhood/data/store/CardTransactionStore;", "cardTransactionStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "rhyAccountStore", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/librobinhood/data/store/CardTransactionStore;Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Landroidx/lifecycle/SavedStateHandle;)V", "", "onCreate", "()V", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse$DuplicateAuthorizedTransaction;", "response", "updatePreFillTransaction", "(Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse$DuplicateAuthorizedTransaction;)V", "j$/time/LocalDate", "startDate", "endDate", "updateSelectedDateRange", "(Lj$/time/LocalDate;Lj$/time/LocalDate;)V", "Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "transaction", "setAuthorizedTransaction", "(Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;)V", "Lcom/robinhood/librobinhood/data/store/CardTransactionStore;", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lkotlin/Pair;", "j$/time/Instant", "dateRangeRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Companion", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class DuplicateAuthorizedTransactionDuxo extends OldBaseDuxo<DuplicateAuthorizedTransactionViewState> implements HasSavedState {
    private final CardTransactionStore cardTransactionStore;
    private final BehaviorRelay<Tuples2<Instant, Instant>> dateRangeRelay;
    private final MinervaAccountStore minervaAccountStore;
    private final RhyAccountStore rhyAccountStore;
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
    public DuplicateAuthorizedTransactionDuxo(CardTransactionStore cardTransactionStore, MinervaAccountStore minervaAccountStore, RhyAccountStore rhyAccountStore, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(cardTransactionStore, "cardTransactionStore");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Scheduler scheduler = null;
        super(new DuplicateAuthorizedTransactionViewState(((DuplicateAuthorizedTransactionFragment.Args) INSTANCE.getArgs(savedStateHandle)).getQuestion(), null, null, new UiEvent(Unit.INSTANCE), null, null, null, 118, null), scheduler, 2, 0 == true ? 1 : 0);
        this.cardTransactionStore = cardTransactionStore;
        this.minervaAccountStore = minervaAccountStore;
        this.rhyAccountStore = rhyAccountStore;
        this.savedStateHandle = savedStateHandle;
        BehaviorRelay<Tuples2<Instant, Instant>> behaviorRelayCreateDefault = BehaviorRelay.createDefault(new Tuples2(null, null));
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.dateRangeRelay = behaviorRelayCreateDefault;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        CardTransactionStore.refreshDisputableTransactions$default(this.cardTransactionStore, false, null, null, 6, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.cardTransactionStore.streamTransaction(CardTransaction.Status.SETTLED, ((DuplicateAuthorizedTransactionFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getDuplicateTransactionId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.duplicate.DuplicateAuthorizedTransactionDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DuplicateAuthorizedTransactionDuxo.onCreate$lambda$1(this.f$0, (CardTransaction) obj);
            }
        });
        Observable<R> observableSwitchMap = this.dateRangeRelay.switchMap(new Function() { // from class: com.robinhood.android.cash.disputes.ui.question.duplicate.DuplicateAuthorizedTransactionDuxo.onCreate.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<SettledCardTransaction>> apply(Tuples2<Instant, Instant> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                Instant instantComponent1 = tuples2.component1();
                return DuplicateAuthorizedTransactionDuxo.this.cardTransactionStore.streamDuplicateDisputableTransactions(tuples2.component2(), instantComponent1, ((DuplicateAuthorizedTransactionFragment.Args) DuplicateAuthorizedTransactionDuxo.INSTANCE.getArgs((HasSavedState) DuplicateAuthorizedTransactionDuxo.this)).getDuplicateTransactionId());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.duplicate.DuplicateAuthorizedTransactionDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DuplicateAuthorizedTransactionDuxo.onCreate$lambda$3(this.f$0, (List) obj);
            }
        });
        MinervaAccountStore.refresh$default(this.minervaAccountStore, false, 1, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.rhyAccountStore.streamMinervaCardAccount(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.duplicate.DuplicateAuthorizedTransactionDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DuplicateAuthorizedTransactionDuxo.onCreate$lambda$5(this.f$0, (MinervaAccount) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(DuplicateAuthorizedTransactionDuxo duplicateAuthorizedTransactionDuxo, final CardTransaction duplicateTransaction) {
        Intrinsics.checkNotNullParameter(duplicateTransaction, "duplicateTransaction");
        duplicateAuthorizedTransactionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.duplicate.DuplicateAuthorizedTransactionDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DuplicateAuthorizedTransactionDuxo.onCreate$lambda$1$lambda$0(duplicateTransaction, (DuplicateAuthorizedTransactionViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DuplicateAuthorizedTransactionViewState onCreate$lambda$1$lambda$0(CardTransaction cardTransaction, DuplicateAuthorizedTransactionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(cardTransaction, "null cannot be cast to non-null type com.robinhood.models.db.mcduckling.SettledCardTransaction");
        return DuplicateAuthorizedTransactionViewState.copy$default(applyMutation, null, null, null, null, (SettledCardTransaction) cardTransaction, null, null, 111, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(DuplicateAuthorizedTransactionDuxo duplicateAuthorizedTransactionDuxo, final List list) {
        duplicateAuthorizedTransactionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.duplicate.DuplicateAuthorizedTransactionDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DuplicateAuthorizedTransactionDuxo.onCreate$lambda$3$lambda$2(list, (DuplicateAuthorizedTransactionViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DuplicateAuthorizedTransactionViewState onCreate$lambda$3$lambda$2(List list, DuplicateAuthorizedTransactionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(list);
        return DuplicateAuthorizedTransactionViewState.copy$default(applyMutation, null, list, null, null, null, null, null, 125, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$5(DuplicateAuthorizedTransactionDuxo duplicateAuthorizedTransactionDuxo, final MinervaAccount minervaAccount) {
        Intrinsics.checkNotNullParameter(minervaAccount, "minervaAccount");
        duplicateAuthorizedTransactionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.duplicate.DuplicateAuthorizedTransactionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DuplicateAuthorizedTransactionDuxo.onCreate$lambda$5$lambda$4(minervaAccount, (DuplicateAuthorizedTransactionViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DuplicateAuthorizedTransactionViewState onCreate$lambda$5$lambda$4(MinervaAccount minervaAccount, DuplicateAuthorizedTransactionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DuplicateAuthorizedTransactionViewState.copy$default(applyMutation, null, null, minervaAccount, new UiEvent(Unit.INSTANCE), null, null, null, 115, null);
    }

    public final void updatePreFillTransaction(DisputeQuestionResponse.DuplicateAuthorizedTransaction response) {
        Intrinsics.checkNotNullParameter(response, "response");
        final SettledCardTransaction authorizedTransaction = response.getAuthorizedTransaction();
        if (Intrinsics.areEqual(authorizedTransaction.getId(), ((DuplicateAuthorizedTransactionFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getDuplicateTransactionId())) {
            return;
        }
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.duplicate.DuplicateAuthorizedTransactionDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DuplicateAuthorizedTransactionDuxo.updatePreFillTransaction$lambda$6(authorizedTransaction, (DuplicateAuthorizedTransactionViewState) obj);
            }
        });
        setAuthorizedTransaction(authorizedTransaction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DuplicateAuthorizedTransactionViewState updatePreFillTransaction$lambda$6(SettledCardTransaction settledCardTransaction, DuplicateAuthorizedTransactionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DuplicateAuthorizedTransactionViewState.copy$default(applyMutation, null, null, null, null, null, null, new UiEvent(settledCardTransaction), 63, null);
    }

    public final void updateSelectedDateRange(LocalDate startDate, LocalDate endDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Instant instant = startDate.atStartOfDay(ZoneId.systemDefault()).toInstant();
        Instant instant2 = endDate.atStartOfDay(ZoneId.systemDefault()).plusDays(1L).minusSeconds(1L).toInstant();
        this.cardTransactionStore.refreshDisputableTransactions(true, instant2, instant);
        this.dateRangeRelay.accept(new Tuples2<>(instant, instant2));
    }

    public final void setAuthorizedTransaction(final SettledCardTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.duplicate.DuplicateAuthorizedTransactionDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DuplicateAuthorizedTransactionDuxo.setAuthorizedTransaction$lambda$7(transaction, (DuplicateAuthorizedTransactionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DuplicateAuthorizedTransactionViewState setAuthorizedTransaction$lambda$7(SettledCardTransaction settledCardTransaction, DuplicateAuthorizedTransactionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DuplicateAuthorizedTransactionViewState.copy$default(applyMutation, null, null, null, null, null, settledCardTransaction, null, 95, null);
    }

    /* compiled from: DuplicateAuthorizedTransactionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/duplicate/DuplicateAuthorizedTransactionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/cash/disputes/ui/question/duplicate/DuplicateAuthorizedTransactionDuxo;", "Lcom/robinhood/android/cash/disputes/ui/question/duplicate/DuplicateAuthorizedTransactionFragment$Args;", "<init>", "()V", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DuplicateAuthorizedTransactionDuxo, DuplicateAuthorizedTransactionFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DuplicateAuthorizedTransactionFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (DuplicateAuthorizedTransactionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DuplicateAuthorizedTransactionFragment.Args getArgs(DuplicateAuthorizedTransactionDuxo duplicateAuthorizedTransactionDuxo) {
            return (DuplicateAuthorizedTransactionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, duplicateAuthorizedTransactionDuxo);
        }
    }
}
