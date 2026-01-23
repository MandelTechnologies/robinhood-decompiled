package com.robinhood.android.cash.transaction.p079ui.rhytransaction;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.cash.transaction.p079ui.rhytransaction.RhyTransactionDetailEvent;
import com.robinhood.android.rhy.contracts.RhyTransactionDetailKey;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.bonfire.RhyTransactionStore;
import com.robinhood.models.p320db.bonfire.InnerRhyTransaction;
import com.robinhood.models.p320db.bonfire.RhyTransaction;
import com.robinhood.shared.models.history.shared.TransactionReference;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyTransactionDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0015B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0006\u0010\u0014\u001a\u00020\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/rhytransaction/RhyTransactionDetailDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/cash/transaction/ui/rhytransaction/RhyTransactionDetailDataState;", "Lcom/robinhood/android/cash/transaction/ui/rhytransaction/RhyTransactionDetailViewState;", "Lcom/robinhood/android/cash/transaction/ui/rhytransaction/RhyTransactionDetailEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "rhyTransactionStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyTransactionStore;", "stateProvider", "Lcom/robinhood/android/cash/transaction/ui/rhytransaction/RhyTransactionDetailStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/RhyTransactionStore;Lcom/robinhood/android/cash/transaction/ui/rhytransaction/RhyTransactionDetailStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "onClickViewOriginalTransaction", "Companion", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RhyTransactionDetailDuxo extends BaseDuxo3<RhyTransactionDetailDataState, RhyTransactionDetailViewState, RhyTransactionDetailEvent> implements HasSavedState {
    private final RhyTransactionStore rhyTransactionStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyTransactionDetailDuxo(RhyTransactionStore rhyTransactionStore, RhyTransactionDetailStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new RhyTransactionDetailDataState(null, 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.rhyTransactionStore = rhyTransactionStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        Observable<RhyTransaction> observableDistinctUntilChanged = this.rhyTransactionStore.streamRhyTransaction(((RhyTransactionDetailKey) INSTANCE.getArgs((HasSavedState) this)).getReference()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.cash.transaction.ui.rhytransaction.RhyTransactionDetailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyTransactionDetailDuxo.onStart$lambda$0(this.f$0, (RhyTransaction) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.transaction.ui.rhytransaction.RhyTransactionDetailDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyTransactionDetailDuxo.onStart$lambda$1(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(RhyTransactionDetailDuxo rhyTransactionDetailDuxo, RhyTransaction rhyTransaction) {
        rhyTransactionDetailDuxo.applyMutation(new RhyTransactionDetailDuxo2(rhyTransaction, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RhyTransactionDetailDuxo rhyTransactionDetailDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhyTransactionDetailDuxo.submit(new RhyTransactionDetailEvent.Error(it));
        return Unit.INSTANCE;
    }

    public final void onClickViewOriginalTransaction() {
        withDataState(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.rhytransaction.RhyTransactionDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyTransactionDetailDuxo.onClickViewOriginalTransaction$lambda$3(this.f$0, (RhyTransactionDetailDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClickViewOriginalTransaction$lambda$3(RhyTransactionDetailDuxo rhyTransactionDetailDuxo, RhyTransactionDetailDataState dataState) {
        InnerRhyTransaction originalTaxIncurringTransaction;
        TransactionReference transactionReference;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        RhyTransaction rhyTransaction = dataState.getRhyTransaction();
        if (rhyTransaction != null && (originalTaxIncurringTransaction = rhyTransaction.getOriginalTaxIncurringTransaction()) != null && (transactionReference = originalTaxIncurringTransaction.getTransactionReference()) != null) {
            rhyTransactionDetailDuxo.submit(new RhyTransactionDetailEvent.Navigate(new RhyTransactionDetailKey(transactionReference)));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: RhyTransactionDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/rhytransaction/RhyTransactionDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/cash/transaction/ui/rhytransaction/RhyTransactionDetailDuxo;", "Lcom/robinhood/android/rhy/contracts/RhyTransactionDetailKey;", "<init>", "()V", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RhyTransactionDetailDuxo, RhyTransactionDetailKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RhyTransactionDetailKey getArgs(SavedStateHandle savedStateHandle) {
            return (RhyTransactionDetailKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RhyTransactionDetailKey getArgs(RhyTransactionDetailDuxo rhyTransactionDetailDuxo) {
            return (RhyTransactionDetailKey) DuxoCompanion.DefaultImpls.getArgs(this, rhyTransactionDetailDuxo);
        }
    }
}
