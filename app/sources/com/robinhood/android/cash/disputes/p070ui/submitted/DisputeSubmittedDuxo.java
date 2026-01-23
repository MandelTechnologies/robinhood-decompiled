package com.robinhood.android.cash.disputes.p070ui.submitted;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.cash.disputes.p070ui.submitted.DisputeSubmittedFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.CardTransactionStore;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.librobinhood.store.PaymentCardStore;
import com.robinhood.models.p320db.mcduckling.CardTransaction;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DisputeSubmittedDuxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0014B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/submitted/DisputeSubmittedDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/disputes/ui/submitted/DisputeSubmittedViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "cardTransactionStore", "Lcom/robinhood/librobinhood/data/store/CardTransactionStore;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CardTransactionStore;Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Lcom/robinhood/librobinhood/store/PaymentCardStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DisputeSubmittedDuxo extends OldBaseDuxo<DisputeSubmittedViewState> implements HasSavedState {
    private final CardTransactionStore cardTransactionStore;
    private final MinervaAccountStore minervaAccountStore;
    private final PaymentCardStore paymentCardStore;
    private final RhyAccountStore rhyAccountStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DisputeSubmittedDuxo(CardTransactionStore cardTransactionStore, MinervaAccountStore minervaAccountStore, PaymentCardStore paymentCardStore, RhyAccountStore rhyAccountStore, SavedStateHandle savedStateHandle) {
        super(new DisputeSubmittedViewState(((DisputeSubmittedFragment.Args) INSTANCE.getArgs(savedStateHandle)).getDisputeReason(), null, null, 6, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(cardTransactionStore, "cardTransactionStore");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.cardTransactionStore = cardTransactionStore;
        this.minervaAccountStore = minervaAccountStore;
        this.paymentCardStore = paymentCardStore;
        this.rhyAccountStore = rhyAccountStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        this.minervaAccountStore.refresh(true);
        LifecycleHost.DefaultImpls.bind$default(this, this.rhyAccountStore.streamMinervaCardAccount(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.submitted.DisputeSubmittedDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DisputeSubmittedDuxo.onCreate$lambda$1(this.f$0, (MinervaAccount) obj);
            }
        });
        this.paymentCardStore.refresh(true);
        Observable<R> map = this.cardTransactionStore.streamTransaction(CardTransaction.Status.SETTLED, (UUID) CollectionsKt.first((List) ((DisputeSubmittedFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getSelectedTransactionIds())).map(new Function() { // from class: com.robinhood.android.cash.disputes.ui.submitted.DisputeSubmittedDuxo$onCreate$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((CardTransaction) it).getCardId());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((DisputeSubmittedDuxo$onCreate$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableSwitchMap = ObservablesKt.filterIsPresent(map).switchMap(new Function() { // from class: com.robinhood.android.cash.disputes.ui.submitted.DisputeSubmittedDuxo.onCreate.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends PaymentCard> apply(UUID cardTransactionId) {
                Intrinsics.checkNotNullParameter(cardTransactionId, "cardTransactionId");
                return DisputeSubmittedDuxo.this.paymentCardStore.streamCard(cardTransactionId);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.submitted.DisputeSubmittedDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DisputeSubmittedDuxo.onCreate$lambda$4(this.f$0, (PaymentCard) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(DisputeSubmittedDuxo disputeSubmittedDuxo, final MinervaAccount minervaAccount) {
        Intrinsics.checkNotNullParameter(minervaAccount, "minervaAccount");
        disputeSubmittedDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.submitted.DisputeSubmittedDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DisputeSubmittedDuxo.onCreate$lambda$1$lambda$0(minervaAccount, (DisputeSubmittedViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisputeSubmittedViewState onCreate$lambda$1$lambda$0(MinervaAccount minervaAccount, DisputeSubmittedViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DisputeSubmittedViewState.copy$default(applyMutation, null, minervaAccount, null, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(DisputeSubmittedDuxo disputeSubmittedDuxo, final PaymentCard paymentCard) {
        disputeSubmittedDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.submitted.DisputeSubmittedDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DisputeSubmittedDuxo.onCreate$lambda$4$lambda$3(paymentCard, (DisputeSubmittedViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisputeSubmittedViewState onCreate$lambda$4$lambda$3(PaymentCard paymentCard, DisputeSubmittedViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DisputeSubmittedViewState.copy$default(applyMutation, null, null, paymentCard, 3, null);
    }

    /* compiled from: DisputeSubmittedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/submitted/DisputeSubmittedDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/cash/disputes/ui/submitted/DisputeSubmittedDuxo;", "Lcom/robinhood/android/cash/disputes/ui/submitted/DisputeSubmittedFragment$Args;", "<init>", "()V", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DisputeSubmittedDuxo, DisputeSubmittedFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DisputeSubmittedFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (DisputeSubmittedFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DisputeSubmittedFragment.Args getArgs(DisputeSubmittedDuxo disputeSubmittedDuxo) {
            return (DisputeSubmittedFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, disputeSubmittedDuxo);
        }
    }
}
