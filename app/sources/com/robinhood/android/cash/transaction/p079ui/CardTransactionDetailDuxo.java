package com.robinhood.android.cash.transaction.p079ui;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.cash.transaction.p079ui.CardTransactionDetailDuxo;
import com.robinhood.android.cash.transaction.p079ui.CardTransactionDetailFragment;
import com.robinhood.android.cash.transaction.p079ui.CardTransactionDetailViewState2;
import com.robinhood.android.cash.transaction.p079ui.CardTransactionDetailViewState3;
import com.robinhood.android.common.history.C11183R;
import com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.retrofit.Minerva;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.CardTransactionStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.store.PaymentCardStore;
import com.robinhood.models.api.minerva.ApiCardTransactions2;
import com.robinhood.models.p320db.mcduckling.CardTransaction;
import com.robinhood.models.p320db.mcduckling.DeclinedCardTransaction;
import com.robinhood.p370rx.delay.CompletableDelay2;
import com.robinhood.shared.history.formatters.legacy.CardTransactionFormatter;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.store.history.HistoryTransactionStore;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Either2;
import com.robinhood.utils.p409ui.images.ImageReference;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CardTransactionDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001$BA\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010\u001d\u001a\u00020\u001bJ\u000e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/CardTransactionDetailDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/transaction/ui/CardTransactionDetailViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "cardTransactionStore", "Lcom/robinhood/librobinhood/data/store/CardTransactionStore;", "minerva", "Lcom/robinhood/api/retrofit/Minerva;", "historyTransactionStore", "Lcom/robinhood/shared/store/history/HistoryTransactionStore;", "cardTransactionFormatter", "Lcom/robinhood/shared/history/formatters/legacy/CardTransactionFormatter;", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CardTransactionStore;Lcom/robinhood/api/retrofit/Minerva;Lcom/robinhood/shared/store/history/HistoryTransactionStore;Lcom/robinhood/shared/history/formatters/legacy/CardTransactionFormatter;Lcom/robinhood/librobinhood/store/PaymentCardStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "transaction", "Lcom/robinhood/shared/models/history/MinervaTransaction$FromCard;", "isForcePostCmMember", "", "onStart", "", "onConfirmTransaction", "onDenyTransaction", "onCancelDispute", "disputeId", "Ljava/util/UUID;", "checkShouldShowPrompt", "cardTransaction", "Lcom/robinhood/models/db/mcduckling/CardTransaction;", "Companion", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class CardTransactionDetailDuxo extends OldBaseDuxo<CardTransactionDetailViewState> implements HasSavedState {
    private final CardTransactionFormatter cardTransactionFormatter;
    private final CardTransactionStore cardTransactionStore;
    private final ExperimentsStore experimentsStore;
    private final HistoryTransactionStore historyTransactionStore;
    private boolean isForcePostCmMember;
    private final Minerva minerva;
    private final PaymentCardStore paymentCardStore;
    private final SavedStateHandle savedStateHandle;
    private MinervaTransaction.FromCard transaction;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardTransactionDetailDuxo(CardTransactionStore cardTransactionStore, Minerva minerva, HistoryTransactionStore historyTransactionStore, CardTransactionFormatter cardTransactionFormatter, PaymentCardStore paymentCardStore, ExperimentsStore experimentsStore, SavedStateHandle savedStateHandle) {
        super(new CardTransactionDetailViewState(false, false, false, false, null, null, null, false, null, null, null, ((CardTransactionDetailFragment.Args) INSTANCE.getArgs(savedStateHandle)).getFromDeepLink(), null, null, 14335, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(cardTransactionStore, "cardTransactionStore");
        Intrinsics.checkNotNullParameter(minerva, "minerva");
        Intrinsics.checkNotNullParameter(historyTransactionStore, "historyTransactionStore");
        Intrinsics.checkNotNullParameter(cardTransactionFormatter, "cardTransactionFormatter");
        Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.cardTransactionStore = cardTransactionStore;
        this.minerva = minerva;
        this.historyTransactionStore = historyTransactionStore;
        this.cardTransactionFormatter = cardTransactionFormatter;
        this.paymentCardStore = paymentCardStore;
        this.experimentsStore = experimentsStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        Observable observableDistinctUntilChanged = this.historyTransactionStore.fromReference(((CardTransactionDetailFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getTransactionReference()).cast(MinervaTransaction.FromCard.class).doOnSubscribe(new C104361<>()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardTransactionDetailDuxo.onStart$lambda$2(this.f$0, (MinervaTransaction.FromCard) obj);
            }
        });
        Observable observableDistinctUntilChanged2 = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiment.FORCE_POST_CM.INSTANCE}, false, null, 6, null).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardTransactionDetailDuxo.onStart$lambda$3(this.f$0, (Boolean) obj);
            }
        });
    }

    /* compiled from: CardTransactionDetailDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$onStart$1 */
    static final class C104361<T> implements Consumer {
        C104361() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            CardTransactionDetailDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$onStart$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CardTransactionDetailDuxo.C104361.accept$lambda$0((CardTransactionDetailViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CardTransactionDetailViewState accept$lambda$0(CardTransactionDetailViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return applyMutation.copy((16375 & 1) != 0 ? applyMutation.isOverviewLoading : true, (16375 & 2) != 0 ? applyMutation.isConfirmTransactionLoading : false, (16375 & 4) != 0 ? applyMutation.isDenyTransactionLoading : false, (16375 & 8) != 0 ? applyMutation.isCancelDisputeLoading : false, (16375 & 16) != 0 ? applyMutation.overview : null, (16375 & 32) != 0 ? applyMutation.transaction : null, (16375 & 64) != 0 ? applyMutation.detail : null, (16375 & 128) != 0 ? applyMutation.showFraudPrompt : false, (16375 & 256) != 0 ? applyMutation.loadingText : null, (16375 & 512) != 0 ? applyMutation.fraudActionResult : null, (16375 & 1024) != 0 ? applyMutation.errorUiEvent : null, (16375 & 2048) != 0 ? applyMutation.fromDeepLink : false, (16375 & 4096) != 0 ? applyMutation.cardActionPrompt : null, (16375 & 8192) != 0 ? applyMutation.shouldShowCardActionPrompt : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit onStart$lambda$2(final CardTransactionDetailDuxo cardTransactionDetailDuxo, final MinervaTransaction.FromCard fromCard) {
        final boolean z;
        cardTransactionDetailDuxo.transaction = fromCard;
        CardTransaction event = fromCard.getEvent();
        if (event instanceof DeclinedCardTransaction) {
            DeclinedCardTransaction declinedCardTransaction = (DeclinedCardTransaction) event;
            z = declinedCardTransaction.getFraudState() == ApiCardTransactions2.FraudState.UNCONFIRMED && declinedCardTransaction.getDeclineReason() == ApiCardTransactions2.DeclineReason.SUSPICIOUS_ACTIVITY;
        }
        cardTransactionDetailDuxo.checkShouldShowPrompt(fromCard.getEvent());
        cardTransactionDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardTransactionDetailDuxo.onStart$lambda$2$lambda$1(this.f$0, fromCard, z, (CardTransactionDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardTransactionDetailViewState onStart$lambda$2$lambda$1(CardTransactionDetailDuxo cardTransactionDetailDuxo, MinervaTransaction.FromCard fromCard, boolean z, CardTransactionDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        ImageReference.Resource resource = new ImageReference.Resource(C11183R.drawable.ic_transaction_generic);
        CardTransactionFormatter cardTransactionFormatter = cardTransactionDetailDuxo.cardTransactionFormatter;
        Intrinsics.checkNotNull(fromCard);
        return applyMutation.copy((16375 & 1) != 0 ? applyMutation.isOverviewLoading : false, (16375 & 2) != 0 ? applyMutation.isConfirmTransactionLoading : false, (16375 & 4) != 0 ? applyMutation.isDenyTransactionLoading : false, (16375 & 8) != 0 ? applyMutation.isCancelDisputeLoading : false, (16375 & 16) != 0 ? applyMutation.overview : new TransactionOverview(resource, cardTransactionFormatter.getPrimaryText(fromCard), HistoryTransactionFormatter.DefaultImpls.getAmountText$default(cardTransactionDetailDuxo.cardTransactionFormatter, fromCard.getEvent(), true, false, 4, null), cardTransactionDetailDuxo.cardTransactionFormatter.mo25632getLineItems(fromCard), cardTransactionDetailDuxo.cardTransactionFormatter.getMerchantName(fromCard)), (16375 & 32) != 0 ? applyMutation.transaction : fromCard, (16375 & 64) != 0 ? applyMutation.detail : null, (16375 & 128) != 0 ? applyMutation.showFraudPrompt : z, (16375 & 256) != 0 ? applyMutation.loadingText : null, (16375 & 512) != 0 ? applyMutation.fraudActionResult : null, (16375 & 1024) != 0 ? applyMutation.errorUiEvent : null, (16375 & 2048) != 0 ? applyMutation.fromDeepLink : false, (16375 & 4096) != 0 ? applyMutation.cardActionPrompt : null, (16375 & 8192) != 0 ? applyMutation.shouldShowCardActionPrompt : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(CardTransactionDetailDuxo cardTransactionDetailDuxo, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        cardTransactionDetailDuxo.isForcePostCmMember = bool.booleanValue();
        return Unit.INSTANCE;
    }

    public final void onConfirmTransaction() {
        MinervaTransaction.FromCard fromCard = this.transaction;
        Intrinsics.checkNotNull(fromCard);
        CardTransaction event = fromCard.getEvent();
        Intrinsics.checkNotNull(event, "null cannot be cast to non-null type com.robinhood.models.db.mcduckling.DeclinedCardTransaction");
        Completable completableDoFinally = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C104301((DeclinedCardTransaction) event, null), 1, null).doOnSubscribe(new C104312()).doFinally(new C104323());
        Intrinsics.checkNotNullExpressionValue(completableDoFinally, "doFinally(...)");
        bind(CompletableDelay2.minTimeInFlight$default(completableDoFinally, 1000L, null, 2, null), LifecycleEvent.ON_DESTROY).subscribeKotlin(new Function0() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardTransactionDetailDuxo.onConfirmTransaction$lambda$5(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardTransactionDetailDuxo.onConfirmTransaction$lambda$7(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: CardTransactionDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$onConfirmTransaction$1", m3645f = "CardTransactionDetailDuxo.kt", m3646l = {106}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$onConfirmTransaction$1 */
    static final class C104301 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DeclinedCardTransaction $cardTransaction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C104301(DeclinedCardTransaction declinedCardTransaction, Continuation<? super C104301> continuation) {
            super(2, continuation);
            this.$cardTransaction = declinedCardTransaction;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CardTransactionDetailDuxo.this.new C104301(this.$cardTransaction, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C104301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CardTransactionStore cardTransactionStore = CardTransactionDetailDuxo.this.cardTransactionStore;
                UUID id = this.$cardTransaction.getId();
                this.label = 1;
                if (cardTransactionStore.markNotFraudulent(id, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CardTransactionDetailDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$onConfirmTransaction$2 */
    static final class C104312<T> implements Consumer {
        C104312() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            CardTransactionDetailDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$onConfirmTransaction$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CardTransactionDetailDuxo.C104312.accept$lambda$0((CardTransactionDetailViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CardTransactionDetailViewState accept$lambda$0(CardTransactionDetailViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return applyMutation.copy((16375 & 1) != 0 ? applyMutation.isOverviewLoading : false, (16375 & 2) != 0 ? applyMutation.isConfirmTransactionLoading : true, (16375 & 4) != 0 ? applyMutation.isDenyTransactionLoading : false, (16375 & 8) != 0 ? applyMutation.isCancelDisputeLoading : false, (16375 & 16) != 0 ? applyMutation.overview : null, (16375 & 32) != 0 ? applyMutation.transaction : null, (16375 & 64) != 0 ? applyMutation.detail : null, (16375 & 128) != 0 ? applyMutation.showFraudPrompt : false, (16375 & 256) != 0 ? applyMutation.loadingText : null, (16375 & 512) != 0 ? applyMutation.fraudActionResult : null, (16375 & 1024) != 0 ? applyMutation.errorUiEvent : null, (16375 & 2048) != 0 ? applyMutation.fromDeepLink : false, (16375 & 4096) != 0 ? applyMutation.cardActionPrompt : null, (16375 & 8192) != 0 ? applyMutation.shouldShowCardActionPrompt : null);
        }
    }

    /* compiled from: CardTransactionDetailDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$onConfirmTransaction$3 */
    static final class C104323 implements Action {
        C104323() {
        }

        @Override // io.reactivex.functions.Action
        public final void run() {
            CardTransactionDetailDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$onConfirmTransaction$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CardTransactionDetailDuxo.C104323.run$lambda$0((CardTransactionDetailViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CardTransactionDetailViewState run$lambda$0(CardTransactionDetailViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return applyMutation.copy((16375 & 1) != 0 ? applyMutation.isOverviewLoading : false, (16375 & 2) != 0 ? applyMutation.isConfirmTransactionLoading : false, (16375 & 4) != 0 ? applyMutation.isDenyTransactionLoading : false, (16375 & 8) != 0 ? applyMutation.isCancelDisputeLoading : false, (16375 & 16) != 0 ? applyMutation.overview : null, (16375 & 32) != 0 ? applyMutation.transaction : null, (16375 & 64) != 0 ? applyMutation.detail : null, (16375 & 128) != 0 ? applyMutation.showFraudPrompt : false, (16375 & 256) != 0 ? applyMutation.loadingText : null, (16375 & 512) != 0 ? applyMutation.fraudActionResult : null, (16375 & 1024) != 0 ? applyMutation.errorUiEvent : null, (16375 & 2048) != 0 ? applyMutation.fromDeepLink : false, (16375 & 4096) != 0 ? applyMutation.cardActionPrompt : null, (16375 & 8192) != 0 ? applyMutation.shouldShowCardActionPrompt : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onConfirmTransaction$lambda$5(final CardTransactionDetailDuxo cardTransactionDetailDuxo) {
        cardTransactionDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardTransactionDetailDuxo.onConfirmTransaction$lambda$5$lambda$4(this.f$0, (CardTransactionDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardTransactionDetailViewState onConfirmTransaction$lambda$5$lambda$4(CardTransactionDetailDuxo cardTransactionDetailDuxo, CardTransactionDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        CardTransactionFormatter cardTransactionFormatter = cardTransactionDetailDuxo.cardTransactionFormatter;
        MinervaTransaction.FromCard transaction = applyMutation.getTransaction();
        Intrinsics.checkNotNull(transaction);
        CharSequence merchantName = cardTransactionFormatter.getMerchantName(transaction);
        Intrinsics.checkNotNull(merchantName);
        return applyMutation.copy((16375 & 1) != 0 ? applyMutation.isOverviewLoading : false, (16375 & 2) != 0 ? applyMutation.isConfirmTransactionLoading : false, (16375 & 4) != 0 ? applyMutation.isDenyTransactionLoading : false, (16375 & 8) != 0 ? applyMutation.isCancelDisputeLoading : false, (16375 & 16) != 0 ? applyMutation.overview : null, (16375 & 32) != 0 ? applyMutation.transaction : null, (16375 & 64) != 0 ? applyMutation.detail : null, (16375 & 128) != 0 ? applyMutation.showFraudPrompt : false, (16375 & 256) != 0 ? applyMutation.loadingText : null, (16375 & 512) != 0 ? applyMutation.fraudActionResult : new UiEvent(Either2.asLeft(new CardTransactionDetailViewState3.PurchaseEnabled(merchantName))), (16375 & 1024) != 0 ? applyMutation.errorUiEvent : null, (16375 & 2048) != 0 ? applyMutation.fromDeepLink : false, (16375 & 4096) != 0 ? applyMutation.cardActionPrompt : null, (16375 & 8192) != 0 ? applyMutation.shouldShowCardActionPrompt : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onConfirmTransaction$lambda$7(CardTransactionDetailDuxo cardTransactionDetailDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        cardTransactionDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardTransactionDetailDuxo.onConfirmTransaction$lambda$7$lambda$6(throwable, (CardTransactionDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardTransactionDetailViewState onConfirmTransaction$lambda$7$lambda$6(Throwable th, CardTransactionDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((16375 & 1) != 0 ? applyMutation.isOverviewLoading : false, (16375 & 2) != 0 ? applyMutation.isConfirmTransactionLoading : false, (16375 & 4) != 0 ? applyMutation.isDenyTransactionLoading : false, (16375 & 8) != 0 ? applyMutation.isCancelDisputeLoading : false, (16375 & 16) != 0 ? applyMutation.overview : null, (16375 & 32) != 0 ? applyMutation.transaction : null, (16375 & 64) != 0 ? applyMutation.detail : null, (16375 & 128) != 0 ? applyMutation.showFraudPrompt : false, (16375 & 256) != 0 ? applyMutation.loadingText : null, (16375 & 512) != 0 ? applyMutation.fraudActionResult : new UiEvent(Either2.asRight(th)), (16375 & 1024) != 0 ? applyMutation.errorUiEvent : null, (16375 & 2048) != 0 ? applyMutation.fromDeepLink : false, (16375 & 4096) != 0 ? applyMutation.cardActionPrompt : null, (16375 & 8192) != 0 ? applyMutation.shouldShowCardActionPrompt : null);
    }

    public final void onDenyTransaction() {
        Completable completableComplete;
        MinervaTransaction.FromCard fromCard = this.transaction;
        Intrinsics.checkNotNull(fromCard);
        CardTransaction event = fromCard.getEvent();
        Intrinsics.checkNotNull(event, "null cannot be cast to non-null type com.robinhood.models.db.mcduckling.DeclinedCardTransaction");
        DeclinedCardTransaction declinedCardTransaction = (DeclinedCardTransaction) event;
        Completable completableRxCompletable$default = RxFactory.DefaultImpls.rxCompletable$default(this, null, new CardTransactionDetailDuxo2(this, declinedCardTransaction, null), 1, null);
        if (declinedCardTransaction.getCardId() != null) {
            PaymentCardStore paymentCardStore = this.paymentCardStore;
            UUID cardId = declinedCardTransaction.getCardId();
            Intrinsics.checkNotNull(cardId);
            completableComplete = paymentCardStore.disableCard(cardId).ignoreElement();
        } else {
            completableComplete = Completable.complete();
        }
        Completable completableDoOnTerminate = Completable.merge(CollectionsKt.listOf((Object[]) new Completable[]{completableRxCompletable$default, completableComplete})).doOnSubscribe(new C104331()).doOnTerminate(new C104342());
        Intrinsics.checkNotNullExpressionValue(completableDoOnTerminate, "doOnTerminate(...)");
        bind(CompletableDelay2.minTimeInFlight$default(completableDoOnTerminate, 1000L, null, 2, null), LifecycleEvent.ON_DESTROY).subscribeKotlin(new Function0() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardTransactionDetailDuxo.onDenyTransaction$lambda$9(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardTransactionDetailDuxo.onDenyTransaction$lambda$11(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: CardTransactionDetailDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$onDenyTransaction$1 */
    static final class C104331<T> implements Consumer {
        C104331() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            CardTransactionDetailDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$onDenyTransaction$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CardTransactionDetailDuxo.C104331.accept$lambda$0((CardTransactionDetailViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CardTransactionDetailViewState accept$lambda$0(CardTransactionDetailViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return applyMutation.copy((16375 & 1) != 0 ? applyMutation.isOverviewLoading : false, (16375 & 2) != 0 ? applyMutation.isConfirmTransactionLoading : false, (16375 & 4) != 0 ? applyMutation.isDenyTransactionLoading : true, (16375 & 8) != 0 ? applyMutation.isCancelDisputeLoading : false, (16375 & 16) != 0 ? applyMutation.overview : null, (16375 & 32) != 0 ? applyMutation.transaction : null, (16375 & 64) != 0 ? applyMutation.detail : null, (16375 & 128) != 0 ? applyMutation.showFraudPrompt : false, (16375 & 256) != 0 ? applyMutation.loadingText : null, (16375 & 512) != 0 ? applyMutation.fraudActionResult : null, (16375 & 1024) != 0 ? applyMutation.errorUiEvent : null, (16375 & 2048) != 0 ? applyMutation.fromDeepLink : false, (16375 & 4096) != 0 ? applyMutation.cardActionPrompt : null, (16375 & 8192) != 0 ? applyMutation.shouldShowCardActionPrompt : null);
        }
    }

    /* compiled from: CardTransactionDetailDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$onDenyTransaction$2 */
    static final class C104342 implements Action {
        C104342() {
        }

        @Override // io.reactivex.functions.Action
        public final void run() {
            CardTransactionDetailDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$onDenyTransaction$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CardTransactionDetailDuxo.C104342.run$lambda$0((CardTransactionDetailViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CardTransactionDetailViewState run$lambda$0(CardTransactionDetailViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return applyMutation.copy((16375 & 1) != 0 ? applyMutation.isOverviewLoading : false, (16375 & 2) != 0 ? applyMutation.isConfirmTransactionLoading : false, (16375 & 4) != 0 ? applyMutation.isDenyTransactionLoading : false, (16375 & 8) != 0 ? applyMutation.isCancelDisputeLoading : false, (16375 & 16) != 0 ? applyMutation.overview : null, (16375 & 32) != 0 ? applyMutation.transaction : null, (16375 & 64) != 0 ? applyMutation.detail : null, (16375 & 128) != 0 ? applyMutation.showFraudPrompt : false, (16375 & 256) != 0 ? applyMutation.loadingText : null, (16375 & 512) != 0 ? applyMutation.fraudActionResult : null, (16375 & 1024) != 0 ? applyMutation.errorUiEvent : null, (16375 & 2048) != 0 ? applyMutation.fromDeepLink : false, (16375 & 4096) != 0 ? applyMutation.cardActionPrompt : null, (16375 & 8192) != 0 ? applyMutation.shouldShowCardActionPrompt : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDenyTransaction$lambda$9(CardTransactionDetailDuxo cardTransactionDetailDuxo) {
        cardTransactionDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardTransactionDetailDuxo.onDenyTransaction$lambda$9$lambda$8((CardTransactionDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardTransactionDetailViewState onDenyTransaction$lambda$9$lambda$8(CardTransactionDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((16375 & 1) != 0 ? applyMutation.isOverviewLoading : false, (16375 & 2) != 0 ? applyMutation.isConfirmTransactionLoading : false, (16375 & 4) != 0 ? applyMutation.isDenyTransactionLoading : false, (16375 & 8) != 0 ? applyMutation.isCancelDisputeLoading : false, (16375 & 16) != 0 ? applyMutation.overview : null, (16375 & 32) != 0 ? applyMutation.transaction : null, (16375 & 64) != 0 ? applyMutation.detail : null, (16375 & 128) != 0 ? applyMutation.showFraudPrompt : false, (16375 & 256) != 0 ? applyMutation.loadingText : null, (16375 & 512) != 0 ? applyMutation.fraudActionResult : new UiEvent(Either2.asLeft(CardTransactionDetailViewState3.CardLocked.INSTANCE)), (16375 & 1024) != 0 ? applyMutation.errorUiEvent : null, (16375 & 2048) != 0 ? applyMutation.fromDeepLink : false, (16375 & 4096) != 0 ? applyMutation.cardActionPrompt : null, (16375 & 8192) != 0 ? applyMutation.shouldShowCardActionPrompt : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDenyTransaction$lambda$11(CardTransactionDetailDuxo cardTransactionDetailDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        cardTransactionDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardTransactionDetailDuxo.onDenyTransaction$lambda$11$lambda$10(throwable, (CardTransactionDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardTransactionDetailViewState onDenyTransaction$lambda$11$lambda$10(Throwable th, CardTransactionDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((16375 & 1) != 0 ? applyMutation.isOverviewLoading : false, (16375 & 2) != 0 ? applyMutation.isConfirmTransactionLoading : false, (16375 & 4) != 0 ? applyMutation.isDenyTransactionLoading : false, (16375 & 8) != 0 ? applyMutation.isCancelDisputeLoading : false, (16375 & 16) != 0 ? applyMutation.overview : null, (16375 & 32) != 0 ? applyMutation.transaction : null, (16375 & 64) != 0 ? applyMutation.detail : null, (16375 & 128) != 0 ? applyMutation.showFraudPrompt : false, (16375 & 256) != 0 ? applyMutation.loadingText : null, (16375 & 512) != 0 ? applyMutation.fraudActionResult : new UiEvent(Either2.asRight(th)), (16375 & 1024) != 0 ? applyMutation.errorUiEvent : null, (16375 & 2048) != 0 ? applyMutation.fromDeepLink : false, (16375 & 4096) != 0 ? applyMutation.cardActionPrompt : null, (16375 & 8192) != 0 ? applyMutation.shouldShowCardActionPrompt : null);
    }

    /* compiled from: CardTransactionDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$onCancelDispute$1", m3645f = "CardTransactionDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$onCancelDispute$1 */
    static final class C104271 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $disputeId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C104271(UUID uuid, Continuation<? super C104271> continuation) {
            super(2, continuation);
            this.$disputeId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CardTransactionDetailDuxo.this.new C104271(this.$disputeId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C104271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Minerva minerva = CardTransactionDetailDuxo.this.minerva;
                UUID uuid = this.$disputeId;
                this.label = 1;
                if (minerva.cancelDispute(uuid, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void onCancelDispute(UUID disputeId) {
        Intrinsics.checkNotNullParameter(disputeId, "disputeId");
        Observable observableAndThen = CompletableDelay2.minTimeInFlight$default(RxFactory.DefaultImpls.rxCompletable$default(this, null, new C104271(disputeId, null), 1, null), 1000L, null, 2, null).doOnSubscribe(new C104282()).doOnTerminate(new Action() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo.onCancelDispute.3
            @Override // io.reactivex.functions.Action
            public final void run() {
                CardTransactionDetailDuxo.this.cardTransactionStore.refresh(CardTransaction.Status.SETTLED, ((CardTransactionDetailFragment.Args) CardTransactionDetailDuxo.INSTANCE.getArgs((HasSavedState) CardTransactionDetailDuxo.this)).getTransactionReference().getSourceId(), true);
            }
        }).andThen(this.historyTransactionStore.fromReference(((CardTransactionDetailFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getTransactionReference()).cast(MinervaTransaction.FromCard.class));
        Intrinsics.checkNotNullExpressionValue(observableAndThen, "andThen(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableAndThen, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardTransactionDetailDuxo.onCancelDispute$lambda$13(this.f$0, (MinervaTransaction.FromCard) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardTransactionDetailDuxo.onCancelDispute$lambda$15(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* compiled from: CardTransactionDetailDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$onCancelDispute$2 */
    static final class C104282<T> implements Consumer {
        C104282() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            CardTransactionDetailDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$onCancelDispute$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CardTransactionDetailDuxo.C104282.accept$lambda$0((CardTransactionDetailViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CardTransactionDetailViewState accept$lambda$0(CardTransactionDetailViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return applyMutation.copy((16375 & 1) != 0 ? applyMutation.isOverviewLoading : false, (16375 & 2) != 0 ? applyMutation.isConfirmTransactionLoading : false, (16375 & 4) != 0 ? applyMutation.isDenyTransactionLoading : false, (16375 & 8) != 0 ? applyMutation.isCancelDisputeLoading : true, (16375 & 16) != 0 ? applyMutation.overview : null, (16375 & 32) != 0 ? applyMutation.transaction : null, (16375 & 64) != 0 ? applyMutation.detail : null, (16375 & 128) != 0 ? applyMutation.showFraudPrompt : false, (16375 & 256) != 0 ? applyMutation.loadingText : null, (16375 & 512) != 0 ? applyMutation.fraudActionResult : null, (16375 & 1024) != 0 ? applyMutation.errorUiEvent : null, (16375 & 2048) != 0 ? applyMutation.fromDeepLink : false, (16375 & 4096) != 0 ? applyMutation.cardActionPrompt : null, (16375 & 8192) != 0 ? applyMutation.shouldShowCardActionPrompt : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCancelDispute$lambda$13(CardTransactionDetailDuxo cardTransactionDetailDuxo, final MinervaTransaction.FromCard fromCard) {
        cardTransactionDetailDuxo.transaction = fromCard;
        cardTransactionDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardTransactionDetailDuxo.onCancelDispute$lambda$13$lambda$12(fromCard, (CardTransactionDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardTransactionDetailViewState onCancelDispute$lambda$13$lambda$12(MinervaTransaction.FromCard fromCard, CardTransactionDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((16375 & 1) != 0 ? applyMutation.isOverviewLoading : false, (16375 & 2) != 0 ? applyMutation.isConfirmTransactionLoading : false, (16375 & 4) != 0 ? applyMutation.isDenyTransactionLoading : false, (16375 & 8) != 0 ? applyMutation.isCancelDisputeLoading : false, (16375 & 16) != 0 ? applyMutation.overview : null, (16375 & 32) != 0 ? applyMutation.transaction : fromCard, (16375 & 64) != 0 ? applyMutation.detail : null, (16375 & 128) != 0 ? applyMutation.showFraudPrompt : false, (16375 & 256) != 0 ? applyMutation.loadingText : null, (16375 & 512) != 0 ? applyMutation.fraudActionResult : null, (16375 & 1024) != 0 ? applyMutation.errorUiEvent : null, (16375 & 2048) != 0 ? applyMutation.fromDeepLink : false, (16375 & 4096) != 0 ? applyMutation.cardActionPrompt : null, (16375 & 8192) != 0 ? applyMutation.shouldShowCardActionPrompt : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCancelDispute$lambda$15(CardTransactionDetailDuxo cardTransactionDetailDuxo, final Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        cardTransactionDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardTransactionDetailDuxo.onCancelDispute$lambda$15$lambda$14(error, (CardTransactionDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardTransactionDetailViewState onCancelDispute$lambda$15$lambda$14(Throwable th, CardTransactionDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((16375 & 1) != 0 ? applyMutation.isOverviewLoading : false, (16375 & 2) != 0 ? applyMutation.isConfirmTransactionLoading : false, (16375 & 4) != 0 ? applyMutation.isDenyTransactionLoading : false, (16375 & 8) != 0 ? applyMutation.isCancelDisputeLoading : false, (16375 & 16) != 0 ? applyMutation.overview : null, (16375 & 32) != 0 ? applyMutation.transaction : null, (16375 & 64) != 0 ? applyMutation.detail : null, (16375 & 128) != 0 ? applyMutation.showFraudPrompt : false, (16375 & 256) != 0 ? applyMutation.loadingText : null, (16375 & 512) != 0 ? applyMutation.fraudActionResult : null, (16375 & 1024) != 0 ? applyMutation.errorUiEvent : new UiEvent(th), (16375 & 2048) != 0 ? applyMutation.fromDeepLink : false, (16375 & 4096) != 0 ? applyMutation.cardActionPrompt : null, (16375 & 8192) != 0 ? applyMutation.shouldShowCardActionPrompt : null);
    }

    private final void checkShouldShowPrompt(final CardTransaction cardTransaction) {
        if (cardTransaction instanceof DeclinedCardTransaction) {
            DeclinedCardTransaction declinedCardTransaction = (DeclinedCardTransaction) cardTransaction;
            if (declinedCardTransaction.getDeclineReason() == ApiCardTransactions2.DeclineReason.INSUFFICIENT_FUNDS || declinedCardTransaction.getDeclineReason() == ApiCardTransactions2.DeclineReason.INSUFFICIENT_FUNDS_MERCHANT) {
                applyMutation(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CardTransactionDetailDuxo.checkShouldShowPrompt$lambda$16((CardTransactionDetailViewState) obj);
                    }
                });
                return;
            }
        }
        if (Intrinsics.areEqual(cardTransaction.getRedirected(), Boolean.TRUE) && this.isForcePostCmMember) {
            applyMutation(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.CardTransactionDetailDuxo$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CardTransactionDetailDuxo.checkShouldShowPrompt$lambda$17(cardTransaction, (CardTransactionDetailViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardTransactionDetailViewState checkShouldShowPrompt$lambda$16(CardTransactionDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((16375 & 1) != 0 ? applyMutation.isOverviewLoading : false, (16375 & 2) != 0 ? applyMutation.isConfirmTransactionLoading : false, (16375 & 4) != 0 ? applyMutation.isDenyTransactionLoading : false, (16375 & 8) != 0 ? applyMutation.isCancelDisputeLoading : false, (16375 & 16) != 0 ? applyMutation.overview : null, (16375 & 32) != 0 ? applyMutation.transaction : null, (16375 & 64) != 0 ? applyMutation.detail : null, (16375 & 128) != 0 ? applyMutation.showFraudPrompt : false, (16375 & 256) != 0 ? applyMutation.loadingText : null, (16375 & 512) != 0 ? applyMutation.fraudActionResult : null, (16375 & 1024) != 0 ? applyMutation.errorUiEvent : null, (16375 & 2048) != 0 ? applyMutation.fromDeepLink : false, (16375 & 4096) != 0 ? applyMutation.cardActionPrompt : CardTransactionDetailViewState2.AddFundsPromptEvent.INSTANCE, (16375 & 8192) != 0 ? applyMutation.shouldShowCardActionPrompt : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardTransactionDetailViewState checkShouldShowPrompt$lambda$17(CardTransaction cardTransaction, CardTransactionDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((16375 & 1) != 0 ? applyMutation.isOverviewLoading : false, (16375 & 2) != 0 ? applyMutation.isConfirmTransactionLoading : false, (16375 & 4) != 0 ? applyMutation.isDenyTransactionLoading : false, (16375 & 8) != 0 ? applyMutation.isCancelDisputeLoading : false, (16375 & 16) != 0 ? applyMutation.overview : null, (16375 & 32) != 0 ? applyMutation.transaction : null, (16375 & 64) != 0 ? applyMutation.detail : null, (16375 & 128) != 0 ? applyMutation.showFraudPrompt : false, (16375 & 256) != 0 ? applyMutation.loadingText : null, (16375 & 512) != 0 ? applyMutation.fraudActionResult : null, (16375 & 1024) != 0 ? applyMutation.errorUiEvent : null, (16375 & 2048) != 0 ? applyMutation.fromDeepLink : false, (16375 & 4096) != 0 ? applyMutation.cardActionPrompt : new CardTransactionDetailViewState2.ForcePostPromptEvent(cardTransaction), (16375 & 8192) != 0 ? applyMutation.shouldShowCardActionPrompt : null);
    }

    /* compiled from: CardTransactionDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/CardTransactionDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/cash/transaction/ui/CardTransactionDetailDuxo;", "Lcom/robinhood/android/cash/transaction/ui/CardTransactionDetailFragment$Args;", "<init>", "()V", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CardTransactionDetailDuxo, CardTransactionDetailFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CardTransactionDetailFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CardTransactionDetailFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CardTransactionDetailFragment.Args getArgs(CardTransactionDetailDuxo cardTransactionDetailDuxo) {
            return (CardTransactionDetailFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, cardTransactionDetailDuxo);
        }
    }
}
