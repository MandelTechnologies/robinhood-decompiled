package com.robinhood.android.matcha.p177ui.history.pending;

import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.matcha.p177ui.common.VerificationWorkflowResults;
import com.robinhood.android.matcha.p177ui.history.pending.MatchaPendingTransactionsDuxo;
import com.robinhood.android.matcha.p177ui.history.pending.row.TransactionRowState;
import com.robinhood.android.models.stepupverification.VerificationWorkflowResult;
import com.robinhood.android.social.contracts.PendingTransactionsFragmentKey;
import com.robinhood.android.store.matcha.MatchaPendingTransactionStore;
import com.robinhood.android.store.matcha.MatchaTransferStore;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.matcha.MatchaPendingTransaction;
import com.robinhood.models.p355ui.matcha.UiMatchaPendingTransaction;
import com.robinhood.models.p355ui.matcha.UiMatchaPendingTransaction4;
import com.robinhood.udf.UiEvent;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: MatchaPendingTransactionsDuxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001cB!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0006\u0010\u0010\u001a\u00020\u000fJ\u0010\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u001a\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0006\u0010\u001b\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsState;", "Lcom/robinhood/android/udf/HasSavedState;", "matchaPendingTransactionStore", "Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore;", "transferStore", "Lcom/robinhood/android/store/matcha/MatchaTransferStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore;Lcom/robinhood/android/store/matcha/MatchaTransferStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "refresh", "setPendingVerification", MatchaPendingTransactionsDuxo.SAVED_STATE_PENDING_VERIFICATION, "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState$Action$VerificationRequired;", "continuePostVerification", "verificationResult", "Lcom/robinhood/android/models/stepupverification/VerificationWorkflowResult;", "retryClaim", "transferId", "Ljava/util/UUID;", "continueSendTransferPostVerification", "onConfirmationSnackbarDismissed", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MatchaPendingTransactionsDuxo extends OldBaseDuxo<MatchaPendingTransactionsState> implements HasSavedState {
    public static final String SAVED_STATE_PENDING_VERIFICATION = "pendingVerification";
    private final MatchaPendingTransactionStore matchaPendingTransactionStore;
    private final SavedStateHandle savedStateHandle;
    private final MatchaTransferStore transferStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MatchaPendingTransactionsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransactionRowState.Action.VerificationRequired.Context.values().length];
            try {
                iArr[TransactionRowState.Action.VerificationRequired.Context.SEND_TRANSFER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionRowState.Action.VerificationRequired.Context.CLAIM_TRANSFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MatchaPendingTransactionsDuxo(MatchaPendingTransactionStore matchaPendingTransactionStore, MatchaTransferStore transferStore, SavedStateHandle savedStateHandle) {
        super(new MatchaPendingTransactionsState(null, null, false, null, null, null, 63, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(matchaPendingTransactionStore, "matchaPendingTransactionStore");
        Intrinsics.checkNotNullParameter(transferStore, "transferStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.matchaPendingTransactionStore = matchaPendingTransactionStore;
        this.transferStore = transferStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        Observable<List<MatchaPendingTransaction>> observableStreamTransactionsWithUser;
        super.onStart();
        PendingTransactionsFragmentKey pendingTransactionsFragmentKey = (PendingTransactionsFragmentKey) INSTANCE.getArgs((HasSavedState) this);
        if (pendingTransactionsFragmentKey instanceof PendingTransactionsFragmentKey.All) {
            observableStreamTransactionsWithUser = this.matchaPendingTransactionStore.stream(true);
        } else {
            if (!(pendingTransactionsFragmentKey instanceof PendingTransactionsFragmentKey.BetweenUser)) {
                throw new NoWhenBranchMatchedException();
            }
            observableStreamTransactionsWithUser = this.matchaPendingTransactionStore.streamTransactionsWithUser(((PendingTransactionsFragmentKey.BetweenUser) pendingTransactionsFragmentKey).getUserId());
        }
        LifecycleHost.DefaultImpls.bind$default(this, observableStreamTransactionsWithUser, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaPendingTransactionsDuxo.onStart$lambda$1(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(MatchaPendingTransactionsDuxo matchaPendingTransactionsDuxo, final List pendingTransactions) {
        Intrinsics.checkNotNullParameter(pendingTransactions, "pendingTransactions");
        matchaPendingTransactionsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaPendingTransactionsDuxo.onStart$lambda$1$lambda$0(pendingTransactions, (MatchaPendingTransactionsState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchaPendingTransactionsState onStart$lambda$1$lambda$0(List list, MatchaPendingTransactionsState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(UiMatchaPendingTransaction4.toUiModel((MatchaPendingTransaction) it.next()));
        }
        return MatchaPendingTransactionsState.copy$default(applyMutation, arrayList, null, false, null, null, null, 62, null);
    }

    public final void refresh() {
        MatchaPendingTransactionStore.refresh$default(this.matchaPendingTransactionStore, false, 1, null);
        Parcelable args = INSTANCE.getArgs((HasSavedState) this);
        PendingTransactionsFragmentKey.BetweenUser betweenUser = args instanceof PendingTransactionsFragmentKey.BetweenUser ? (PendingTransactionsFragmentKey.BetweenUser) args : null;
        if (betweenUser != null) {
            this.matchaPendingTransactionStore.refreshTransactionsWithUser(betweenUser.getUserId());
        }
    }

    public final void setPendingVerification(final TransactionRowState.Action.VerificationRequired pendingVerification) {
        getSavedStateHandle().set(SAVED_STATE_PENDING_VERIFICATION, pendingVerification);
        applyMutation(new Function1() { // from class: com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaPendingTransactionsDuxo.setPendingVerification$lambda$3(pendingVerification, (MatchaPendingTransactionsState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchaPendingTransactionsState setPendingVerification$lambda$3(TransactionRowState.Action.VerificationRequired verificationRequired, MatchaPendingTransactionsState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return MatchaPendingTransactionsState.copy$default(applyMutation, null, null, false, null, null, verificationRequired, 31, null);
    }

    public final void continuePostVerification(VerificationWorkflowResult verificationResult) {
        Object obj = getSavedStateHandle().get(SAVED_STATE_PENDING_VERIFICATION);
        Intrinsics.checkNotNull(obj);
        TransactionRowState.Action.VerificationRequired verificationRequired = (TransactionRowState.Action.VerificationRequired) obj;
        UUID transferId = verificationRequired.getTransferId();
        int i = WhenMappings.$EnumSwitchMapping$0[verificationRequired.getContext().ordinal()];
        if (i == 1) {
            continueSendTransferPostVerification(transferId, verificationResult);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            retryClaim(transferId);
        }
        setPendingVerification(null);
    }

    private final void retryClaim(final UUID transferId) {
        applyMutation(new Function1() { // from class: com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaPendingTransactionsDuxo.retryClaim$lambda$4(transferId, (MatchaPendingTransactionsState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchaPendingTransactionsState retryClaim$lambda$4(UUID uuid, MatchaPendingTransactionsState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return MatchaPendingTransactionsState.copy$default(applyMutation, null, new UiEvent(uuid), false, null, null, null, 61, null);
    }

    private final void continueSendTransferPostVerification(UUID transferId, VerificationWorkflowResult verificationResult) {
        if (VerificationWorkflowResults.getShouldContinueTransferPostVerification(verificationResult)) {
            Completable completableDoOnSubscribe = this.transferStore.continueTransferPostVerification(transferId).ignoreElement().andThen(RxFactory.DefaultImpls.rxCompletable$default(this, null, new C213501(null), 1, null)).subscribeOn(Schedulers.m3346io()).doOnSubscribe(new C213512());
            Intrinsics.checkNotNullExpressionValue(completableDoOnSubscribe, "doOnSubscribe(...)");
            LifecycleHost.DefaultImpls.bind$default(this, completableDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsDuxo$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MatchaPendingTransactionsDuxo.continueSendTransferPostVerification$lambda$6(this.f$0);
                }
            }, new Function1() { // from class: com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsDuxo$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MatchaPendingTransactionsDuxo.continueSendTransferPostVerification$lambda$8(this.f$0, (Throwable) obj);
                }
            });
        }
    }

    /* compiled from: MatchaPendingTransactionsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsDuxo$continueSendTransferPostVerification$1", m3645f = "MatchaPendingTransactionsDuxo.kt", m3646l = {93}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsDuxo$continueSendTransferPostVerification$1 */
    static final class C213501 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C213501(Continuation<? super C213501> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MatchaPendingTransactionsDuxo.this.new C213501(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C213501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Job jobRefresh = MatchaPendingTransactionsDuxo.this.matchaPendingTransactionStore.refresh(true);
                this.label = 1;
                if (jobRefresh.join(this) == coroutine_suspended) {
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

    /* compiled from: MatchaPendingTransactionsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsDuxo$continueSendTransferPostVerification$2 */
    static final class C213512<T> implements Consumer {
        C213512() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            MatchaPendingTransactionsDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsDuxo$continueSendTransferPostVerification$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MatchaPendingTransactionsDuxo.C213512.accept$lambda$0((MatchaPendingTransactionsState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MatchaPendingTransactionsState accept$lambda$0(MatchaPendingTransactionsState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return MatchaPendingTransactionsState.copy$default(applyMutation, null, null, true, null, null, null, 59, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit continueSendTransferPostVerification$lambda$6(MatchaPendingTransactionsDuxo matchaPendingTransactionsDuxo) {
        matchaPendingTransactionsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaPendingTransactionsDuxo.continueSendTransferPostVerification$lambda$6$lambda$5((MatchaPendingTransactionsState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchaPendingTransactionsState continueSendTransferPostVerification$lambda$6$lambda$5(MatchaPendingTransactionsState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return MatchaPendingTransactionsState.copy$default(applyMutation, null, null, false, null, null, null, 59, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit continueSendTransferPostVerification$lambda$8(MatchaPendingTransactionsDuxo matchaPendingTransactionsDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        matchaPendingTransactionsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaPendingTransactionsDuxo.continueSendTransferPostVerification$lambda$8$lambda$7(throwable, (MatchaPendingTransactionsState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchaPendingTransactionsState continueSendTransferPostVerification$lambda$8$lambda$7(Throwable th, MatchaPendingTransactionsState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return MatchaPendingTransactionsState.copy$default(applyMutation, null, null, false, new UiEvent(th), null, null, 51, null);
    }

    public final void onConfirmationSnackbarDismissed() {
        Observable<MatchaPendingTransactionsState> observableTake = getStates().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaPendingTransactionsDuxo.onConfirmationSnackbarDismissed$lambda$10(this.f$0, (MatchaPendingTransactionsState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onConfirmationSnackbarDismissed$lambda$10(MatchaPendingTransactionsDuxo matchaPendingTransactionsDuxo, MatchaPendingTransactionsState matchaPendingTransactionsState) {
        List<UiMatchaPendingTransaction> transactions = matchaPendingTransactionsState.getTransactions();
        if (transactions != null && transactions.isEmpty()) {
            matchaPendingTransactionsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MatchaPendingTransactionsDuxo.onConfirmationSnackbarDismissed$lambda$10$lambda$9((MatchaPendingTransactionsState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchaPendingTransactionsState onConfirmationSnackbarDismissed$lambda$10$lambda$9(MatchaPendingTransactionsState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return MatchaPendingTransactionsState.copy$default(applyMutation, null, null, false, null, new UiEvent(Unit.INSTANCE), null, 47, null);
    }

    /* compiled from: MatchaPendingTransactionsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsDuxo;", "Lcom/robinhood/android/social/contracts/PendingTransactionsFragmentKey;", "<init>", "()V", "SAVED_STATE_PENDING_VERIFICATION", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MatchaPendingTransactionsDuxo, PendingTransactionsFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PendingTransactionsFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (PendingTransactionsFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PendingTransactionsFragmentKey getArgs(MatchaPendingTransactionsDuxo matchaPendingTransactionsDuxo) {
            return (PendingTransactionsFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, matchaPendingTransactionsDuxo);
        }
    }
}
