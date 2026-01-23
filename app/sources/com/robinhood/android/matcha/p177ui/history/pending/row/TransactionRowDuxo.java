package com.robinhood.android.matcha.p177ui.history.pending.row;

import android.view.View;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.udf.ViewDuxo;
import com.robinhood.android.matcha.models.p176ui.UiMatchaUser2;
import com.robinhood.android.matcha.p177ui.history.pending.row.TransactionRowDuxo;
import com.robinhood.android.matcha.p177ui.history.pending.row.TransactionRowState;
import com.robinhood.android.matcha.p177ui.history.pending.row.TransactionRowState4;
import com.robinhood.android.store.matcha.MatchaPendingTransactionStore;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p355ui.matcha.UiMatchaPendingTransaction;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Completable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TransactionRowDuxo.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000eJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0002J\u001c\u0010\u0012\u001a\u00020\n*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J=\u0010\u0018\u001a\u00020\n*\u00020\u00132\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00192\u0006\u0010\u0016\u001a\u00020\u0017H\u0002¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowDuxo;", "Lcom/robinhood/android/common/udf/ViewDuxo;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState;", "hostView", "Landroid/view/View;", "pendingTransactionStore", "Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore;", "<init>", "(Landroid/view/View;Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore;)V", "setTransaction", "", "transaction", "Lcom/robinhood/models/ui/matcha/UiMatchaPendingTransaction;", "retryClaim", "Lcom/robinhood/udf/UiEvent;", "onPrimaryButtonClick", "state", "onSecondaryButtonClick", "handleAction", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow;", "action", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow$Action;", "buttonType", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState$ButtonType;", "performAsyncAction", "Lkotlin/Function2;", "Ljava/util/UUID;", "Lkotlin/coroutines/Continuation;", "", "(Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRow;Lkotlin/jvm/functions/Function2;Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState$ButtonType;)V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class TransactionRowDuxo extends ViewDuxo<TransactionRowState> {
    public static final int $stable = 8;
    private final MatchaPendingTransactionStore pendingTransactionStore;

    /* compiled from: TransactionRowDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransactionRowState.ButtonType.values().length];
            try {
                iArr[TransactionRowState.ButtonType.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionRowState.ButtonType.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public TransactionRowDuxo(View hostView, MatchaPendingTransactionStore pendingTransactionStore) {
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        Intrinsics.checkNotNullParameter(pendingTransactionStore, "pendingTransactionStore");
        Object[] objArr = 0 == true ? 1 : 0;
        super(hostView, new TransactionRowState(null, null, null, null, null, 31, null), objArr, 4, 0 == true ? 1 : 0);
        this.pendingTransactionStore = pendingTransactionStore;
    }

    public final void setTransaction(final UiMatchaPendingTransaction transaction, final UiEvent<Unit> retryClaim) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        applyMutation(new Function1() { // from class: com.robinhood.android.matcha.ui.history.pending.row.TransactionRowDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransactionRowDuxo.setTransaction$lambda$0(transaction, retryClaim, (TransactionRowState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransactionRowState setTransaction$lambda$0(UiMatchaPendingTransaction uiMatchaPendingTransaction, UiEvent uiEvent, TransactionRowState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return TransactionRowState.copy$default(applyMutation, uiMatchaPendingTransaction, TransactionRowState4.INSTANCE.fromTransaction(uiMatchaPendingTransaction), null, null, uiEvent, 12, null);
    }

    public final void onPrimaryButtonClick(TransactionRowState state) {
        TransactionRowState4 row;
        TransactionRowState4.Button primaryButton;
        TransactionRowState4.Action action;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.isActionLoading() || (row = state.getRow()) == null || (primaryButton = row.getPrimaryButton()) == null || (action = primaryButton.getAction()) == null) {
            return;
        }
        handleAction(state.getRow(), action, TransactionRowState.ButtonType.PRIMARY);
    }

    public final void onSecondaryButtonClick(TransactionRowState state) {
        TransactionRowState4 row;
        TransactionRowState4.Button secondaryButton;
        TransactionRowState4.Action action;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.isActionLoading() || (row = state.getRow()) == null || (secondaryButton = row.getSecondaryButton()) == null || (action = secondaryButton.getAction()) == null) {
            return;
        }
        handleAction(state.getRow(), action, TransactionRowState.ButtonType.SECONDARY);
    }

    /* compiled from: TransactionRowDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.history.pending.row.TransactionRowDuxo$handleAction$1", m3645f = "TransactionRowDuxo.kt", m3646l = {66}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.history.pending.row.TransactionRowDuxo$handleAction$1 */
    static final class C213561 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TransactionRowState4 $this_handleAction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C213561(TransactionRowState4 transactionRowState4, Continuation<? super C213561> continuation) {
            super(2, continuation);
            this.$this_handleAction = transactionRowState4;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TransactionRowDuxo.this.new C213561(this.$this_handleAction, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C213561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            final TransactionRowState.Action verificationRequired;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TransactionRowDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.matcha.ui.history.pending.row.TransactionRowDuxo$handleAction$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return TransactionRowDuxo.C213561.invokeSuspend$lambda$0((TransactionRowState) obj2);
                    }
                });
                MatchaPendingTransactionStore matchaPendingTransactionStore = TransactionRowDuxo.this.pendingTransactionStore;
                UUID id = this.$this_handleAction.getTransaction().getId();
                this.label = 1;
                obj = matchaPendingTransactionStore.claimTransfer(id, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            MatchaPendingTransactionStore.ClaimResult claimResult = (MatchaPendingTransactionStore.ClaimResult) obj;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (claimResult instanceof MatchaPendingTransactionStore.ClaimResult.Error) {
                Result.Companion companion = Result.INSTANCE;
                verificationRequired = new TransactionRowState.Action.Completed(Result.m28550constructorimpl(ResultKt.createFailure(((MatchaPendingTransactionStore.ClaimResult.Error) claimResult).getThrowable())), objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0);
            } else if (claimResult instanceof MatchaPendingTransactionStore.ClaimResult.Success) {
                Result.Companion companion2 = Result.INSTANCE;
                Object objM28550constructorimpl = Result.m28550constructorimpl(this.$this_handleAction.getTransaction());
                TransactionRowState4.Button primaryButton = this.$this_handleAction.getPrimaryButton();
                verificationRequired = new TransactionRowState.Action.Completed(objM28550constructorimpl, primaryButton != null ? primaryButton.getSuccessText() : null);
            } else {
                if (!(claimResult instanceof MatchaPendingTransactionStore.ClaimResult.VerificationRequired)) {
                    throw new NoWhenBranchMatchedException();
                }
                verificationRequired = new TransactionRowState.Action.VerificationRequired(this.$this_handleAction.getTransaction().getId(), ((MatchaPendingTransactionStore.ClaimResult.VerificationRequired) claimResult).getVerification(), TransactionRowState.Action.VerificationRequired.Context.CLAIM_TRANSFER);
            }
            TransactionRowDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.matcha.ui.history.pending.row.TransactionRowDuxo$handleAction$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return TransactionRowDuxo.C213561.invokeSuspend$lambda$1(verificationRequired, (TransactionRowState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TransactionRowState invokeSuspend$lambda$0(TransactionRowState transactionRowState) {
            return TransactionRowState.copy$default(transactionRowState, null, null, TransactionRowState.ButtonType.PRIMARY, null, null, 27, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TransactionRowState invokeSuspend$lambda$1(TransactionRowState.Action action, TransactionRowState transactionRowState) {
            return TransactionRowState.copy$default(transactionRowState, null, null, null, new UiEvent(action), null, 19, null);
        }
    }

    private final void handleAction(final TransactionRowState4 transactionRowState4, final TransactionRowState4.Action action, TransactionRowState.ButtonType buttonType) {
        if (Intrinsics.areEqual(action, TransactionRowState4.Action.ClaimTransfer.INSTANCE)) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C213561(transactionRowState4, null), 3, null);
            return;
        }
        if (Intrinsics.areEqual(action, TransactionRowState4.Action.DeclineTransfer.INSTANCE)) {
            performAsyncAction(transactionRowState4, new C213572(this.pendingTransactionStore), buttonType);
            return;
        }
        if (Intrinsics.areEqual(action, TransactionRowState4.Action.RemindTransfer.INSTANCE)) {
            performAsyncAction(transactionRowState4, new C213583(this.pendingTransactionStore), buttonType);
            return;
        }
        if (Intrinsics.areEqual(action, TransactionRowState4.Action.CancelTransfer.INSTANCE)) {
            performAsyncAction(transactionRowState4, new C213594(this.pendingTransactionStore), buttonType);
            return;
        }
        if (Intrinsics.areEqual(action, TransactionRowState4.Action.AcceptRequest.INSTANCE)) {
            performAsyncAction(transactionRowState4, new C213605(this.pendingTransactionStore), buttonType);
            return;
        }
        if (Intrinsics.areEqual(action, TransactionRowState4.Action.DeclineRequest.INSTANCE)) {
            performAsyncAction(transactionRowState4, new C213616(this.pendingTransactionStore), buttonType);
            return;
        }
        if (Intrinsics.areEqual(action, TransactionRowState4.Action.CancelRequest.INSTANCE)) {
            performAsyncAction(transactionRowState4, new C213627(this.pendingTransactionStore), buttonType);
            return;
        }
        if (Intrinsics.areEqual(action, TransactionRowState4.Action.RemindRequest.INSTANCE)) {
            performAsyncAction(transactionRowState4, new C213638(this.pendingTransactionStore), buttonType);
        } else if (Intrinsics.areEqual(action, TransactionRowState4.Action.ReviewRequest.INSTANCE)) {
            applyMutation(new Function1() { // from class: com.robinhood.android.matcha.ui.history.pending.row.TransactionRowDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TransactionRowDuxo.handleAction$lambda$1(transactionRowState4, (TransactionRowState) obj);
                }
            });
        } else {
            if (!(action instanceof TransactionRowState4.Action.VerifyToSendTransfer)) {
                throw new NoWhenBranchMatchedException();
            }
            applyMutation(new Function1() { // from class: com.robinhood.android.matcha.ui.history.pending.row.TransactionRowDuxo$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TransactionRowDuxo.handleAction$lambda$2(transactionRowState4, action, (TransactionRowState) obj);
                }
            });
        }
    }

    /* compiled from: TransactionRowDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.history.pending.row.TransactionRowDuxo$handleAction$2 */
    /* synthetic */ class C213572 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super Unit>, Object>, ContinuationImpl6 {
        C213572(Object obj) {
            super(2, obj, MatchaPendingTransactionStore.class, "declineTransfer", "declineTransfer(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UUID uuid, Continuation<? super Unit> continuation) {
            return ((MatchaPendingTransactionStore) this.receiver).declineTransfer(uuid, continuation);
        }
    }

    /* compiled from: TransactionRowDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.history.pending.row.TransactionRowDuxo$handleAction$3 */
    /* synthetic */ class C213583 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super Unit>, Object>, ContinuationImpl6 {
        C213583(Object obj) {
            super(2, obj, MatchaPendingTransactionStore.class, "remindTransfer", "remindTransfer(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UUID uuid, Continuation<? super Unit> continuation) {
            return ((MatchaPendingTransactionStore) this.receiver).remindTransfer(uuid, continuation);
        }
    }

    /* compiled from: TransactionRowDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.history.pending.row.TransactionRowDuxo$handleAction$4 */
    /* synthetic */ class C213594 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super Unit>, Object>, ContinuationImpl6 {
        C213594(Object obj) {
            super(2, obj, MatchaPendingTransactionStore.class, "cancelTransfer", "cancelTransfer(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UUID uuid, Continuation<? super Unit> continuation) {
            return ((MatchaPendingTransactionStore) this.receiver).cancelTransfer(uuid, continuation);
        }
    }

    /* compiled from: TransactionRowDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.history.pending.row.TransactionRowDuxo$handleAction$5 */
    /* synthetic */ class C213605 extends AdaptedFunctionReference implements Function2<UUID, Continuation<? super Unit>, Object>, ContinuationImpl6 {
        C213605(Object obj) {
            super(2, obj, MatchaPendingTransactionStore.class, "acceptRequest", "acceptRequest(Ljava/util/UUID;Lcom/robinhood/android/models/matcha/api/SourceOfFunds;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 8);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UUID uuid, Continuation<? super Unit> continuation) {
            return TransactionRowDuxo.handleAction$acceptRequest((MatchaPendingTransactionStore) this.receiver, uuid, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object handleAction$acceptRequest(MatchaPendingTransactionStore matchaPendingTransactionStore, UUID uuid, Continuation continuation) {
        Object objAcceptRequest$default = MatchaPendingTransactionStore.acceptRequest$default(matchaPendingTransactionStore, uuid, null, continuation, 2, null);
        return objAcceptRequest$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAcceptRequest$default : Unit.INSTANCE;
    }

    /* compiled from: TransactionRowDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.history.pending.row.TransactionRowDuxo$handleAction$6 */
    /* synthetic */ class C213616 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super Unit>, Object>, ContinuationImpl6 {
        C213616(Object obj) {
            super(2, obj, MatchaPendingTransactionStore.class, "declineRequest", "declineRequest(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UUID uuid, Continuation<? super Unit> continuation) {
            return ((MatchaPendingTransactionStore) this.receiver).declineRequest(uuid, continuation);
        }
    }

    /* compiled from: TransactionRowDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.history.pending.row.TransactionRowDuxo$handleAction$7 */
    /* synthetic */ class C213627 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super Unit>, Object>, ContinuationImpl6 {
        C213627(Object obj) {
            super(2, obj, MatchaPendingTransactionStore.class, "cancelRequest", "cancelRequest(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UUID uuid, Continuation<? super Unit> continuation) {
            return ((MatchaPendingTransactionStore) this.receiver).cancelRequest(uuid, continuation);
        }
    }

    /* compiled from: TransactionRowDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.history.pending.row.TransactionRowDuxo$handleAction$8 */
    /* synthetic */ class C213638 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super Unit>, Object>, ContinuationImpl6 {
        C213638(Object obj) {
            super(2, obj, MatchaPendingTransactionStore.class, "remindRequest", "remindRequest(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UUID uuid, Continuation<? super Unit> continuation) {
            return ((MatchaPendingTransactionStore) this.receiver).remindRequest(uuid, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransactionRowState handleAction$lambda$1(TransactionRowState4 transactionRowState4, TransactionRowState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        UiMatchaPendingTransaction transaction = transactionRowState4.getTransaction();
        return TransactionRowState.copy$default(applyMutation, null, null, null, new UiEvent(new TransactionRowState.Action.ReviewRequest(transaction.getId(), UiMatchaUser2.toUiMatchaUser(transaction.getTransactor()), transaction.getAmount(), transaction.getMemo())), null, 23, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransactionRowState handleAction$lambda$2(TransactionRowState4 transactionRowState4, TransactionRowState4.Action action, TransactionRowState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return TransactionRowState.copy$default(applyMutation, null, null, null, new UiEvent(new TransactionRowState.Action.VerificationRequired(transactionRowState4.getTransaction().getId(), ((TransactionRowState4.Action.VerifyToSendTransfer) action).getVerification(), TransactionRowState.Action.VerificationRequired.Context.SEND_TRANSFER)), null, 23, null);
    }

    /* compiled from: TransactionRowDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.history.pending.row.TransactionRowDuxo$performAsyncAction$1", m3645f = "TransactionRowDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.history.pending.row.TransactionRowDuxo$performAsyncAction$1 */
    static final class C213641 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<UUID, Continuation<? super Unit>, Object> $action;
        final /* synthetic */ TransactionRowState4 $this_performAsyncAction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C213641(Function2<? super UUID, ? super Continuation<? super Unit>, ? extends Object> function2, TransactionRowState4 transactionRowState4, Continuation<? super C213641> continuation) {
            super(2, continuation);
            this.$action = function2;
            this.$this_performAsyncAction = transactionRowState4;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C213641(this.$action, this.$this_performAsyncAction, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C213641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function2<UUID, Continuation<? super Unit>, Object> function2 = this.$action;
                UUID id = this.$this_performAsyncAction.getTransaction().getId();
                this.label = 1;
                if (function2.invoke(id, this) == coroutine_suspended) {
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

    private final void performAsyncAction(final TransactionRowState4 transactionRowState4, Function2<? super UUID, ? super Continuation<? super Unit>, ? extends Object> function2, final TransactionRowState.ButtonType buttonType) {
        Completable completableDoOnSubscribe = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C213641(function2, transactionRowState4, null), 1, null).subscribeOn(Schedulers.m3346io()).doOnSubscribe(new C213652(buttonType));
        Intrinsics.checkNotNullExpressionValue(completableDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.matcha.ui.history.pending.row.TransactionRowDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransactionRowDuxo.performAsyncAction$lambda$4(this.f$0, transactionRowState4, buttonType);
            }
        }, new Function1() { // from class: com.robinhood.android.matcha.ui.history.pending.row.TransactionRowDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransactionRowDuxo.performAsyncAction$lambda$6(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: TransactionRowDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.history.pending.row.TransactionRowDuxo$performAsyncAction$2 */
    static final class C213652<T> implements Consumer {
        final /* synthetic */ TransactionRowState.ButtonType $buttonType;

        C213652(TransactionRowState.ButtonType buttonType) {
            this.$buttonType = buttonType;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            TransactionRowDuxo transactionRowDuxo = TransactionRowDuxo.this;
            final TransactionRowState.ButtonType buttonType = this.$buttonType;
            transactionRowDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.matcha.ui.history.pending.row.TransactionRowDuxo$performAsyncAction$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TransactionRowDuxo.C213652.accept$lambda$0(buttonType, (TransactionRowState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TransactionRowState accept$lambda$0(TransactionRowState.ButtonType buttonType, TransactionRowState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return TransactionRowState.copy$default(applyMutation, null, null, buttonType, null, null, 27, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit performAsyncAction$lambda$4(TransactionRowDuxo transactionRowDuxo, final TransactionRowState4 transactionRowState4, final TransactionRowState.ButtonType buttonType) {
        transactionRowDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.matcha.ui.history.pending.row.TransactionRowDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransactionRowDuxo.performAsyncAction$lambda$4$lambda$3(transactionRowState4, buttonType, (TransactionRowState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransactionRowState performAsyncAction$lambda$4$lambda$3(TransactionRowState4 transactionRowState4, TransactionRowState.ButtonType buttonType, TransactionRowState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Result.Companion companion = Result.INSTANCE;
        Object objM28550constructorimpl = Result.m28550constructorimpl(transactionRowState4.getTransaction());
        int i = WhenMappings.$EnumSwitchMapping$0[buttonType.ordinal()];
        StringResource successText = null;
        if (i == 1) {
            TransactionRowState4.Button primaryButton = transactionRowState4.getPrimaryButton();
            if (primaryButton != null) {
                successText = primaryButton.getSuccessText();
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            TransactionRowState4.Button secondaryButton = transactionRowState4.getSecondaryButton();
            if (secondaryButton != null) {
                successText = secondaryButton.getSuccessText();
            }
        }
        return TransactionRowState.copy$default(applyMutation, null, null, null, new UiEvent(new TransactionRowState.Action.Completed(objM28550constructorimpl, successText)), null, 19, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit performAsyncAction$lambda$6(TransactionRowDuxo transactionRowDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        transactionRowDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.matcha.ui.history.pending.row.TransactionRowDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransactionRowDuxo.performAsyncAction$lambda$6$lambda$5(throwable, (TransactionRowState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final TransactionRowState performAsyncAction$lambda$6$lambda$5(Throwable th, TransactionRowState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Result.Companion companion = Result.INSTANCE;
        return TransactionRowState.copy$default(applyMutation, null, null, null, new UiEvent(new TransactionRowState.Action.Completed(Result.m28550constructorimpl(ResultKt.createFailure(th)), null, 2, 0 == true ? 1 : 0)), null, 19, null);
    }
}
