package com.robinhood.android.matcha.p177ui.history.detail.request;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.matcha.p177ui.history.detail.request.MatchaRequestDetailState;
import com.robinhood.android.matcha.p177ui.history.detail.request.MatchaRequestDetailState4;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.store.matcha.MatchaPendingTransactionStore;
import com.robinhood.android.store.matcha.MatchaRequestStore;
import com.robinhood.android.store.matcha.MatchaTransferStore;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.matcha.MatchaRequest;
import com.robinhood.models.util.Money3;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.money.Currencies;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MatchaRequestDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001eB)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0002J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u001a\u0010\u001a\u001a\u00020\u0011*\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/request/MatchaRequestDetailDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/matcha/ui/history/detail/request/MatchaRequestDetailState;", "Lcom/robinhood/android/udf/HasSavedState;", "matchaRequestStore", "Lcom/robinhood/android/store/matcha/MatchaRequestStore;", "matchaTransferStore", "Lcom/robinhood/android/store/matcha/MatchaTransferStore;", "pendingTransactionStore", "Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/store/matcha/MatchaRequestStore;Lcom/robinhood/android/store/matcha/MatchaTransferStore;Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onResume", "", "onPrimaryButtonClick", "state", "onSecondaryButtonClick", "handleAction", "action", "Lcom/robinhood/android/matcha/ui/history/detail/request/RequestState$Action;", "buttonType", "Lcom/robinhood/android/matcha/ui/history/detail/request/MatchaRequestDetailState$ButtonType;", "perform", "requestId", "Ljava/util/UUID;", "(Lcom/robinhood/android/matcha/ui/history/detail/request/RequestState$Action;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MatchaRequestDetailDuxo extends OldBaseDuxo<MatchaRequestDetailState> implements HasSavedState {
    private final MatchaRequestStore matchaRequestStore;
    private final MatchaTransferStore matchaTransferStore;
    private final MatchaPendingTransactionStore pendingTransactionStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MatchaRequestDetailDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MatchaRequestDetailState4.Action.values().length];
            try {
                iArr[MatchaRequestDetailState4.Action.ACCEPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MatchaRequestDetailState4.Action.DECLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MatchaRequestDetailState4.Action.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
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
    public MatchaRequestDetailDuxo(MatchaRequestStore matchaRequestStore, MatchaTransferStore matchaTransferStore, MatchaPendingTransactionStore pendingTransactionStore, SavedStateHandle savedStateHandle) {
        super(new MatchaRequestDetailState(null, null, null, null, 15, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(matchaRequestStore, "matchaRequestStore");
        Intrinsics.checkNotNullParameter(matchaTransferStore, "matchaTransferStore");
        Intrinsics.checkNotNullParameter(pendingTransactionStore, "pendingTransactionStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.matchaRequestStore = matchaRequestStore;
        this.matchaTransferStore = matchaTransferStore;
        this.pendingTransactionStore = pendingTransactionStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        MatchaRequestStore matchaRequestStore = this.matchaRequestStore;
        Companion companion = INSTANCE;
        MatchaRequestStore.refresh$default(matchaRequestStore, ((LegacyFragmentKey.MatchaRequestDetail) companion.getArgs((HasSavedState) this)).getRequestId(), false, 2, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.matchaRequestStore.stream(((LegacyFragmentKey.MatchaRequestDetail) companion.getArgs((HasSavedState) this)).getRequestId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.history.detail.request.MatchaRequestDetailDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaRequestDetailDuxo.onResume$lambda$1(this.f$0, (MatchaRequest) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(MatchaRequestDetailDuxo matchaRequestDetailDuxo, final MatchaRequest it) {
        Intrinsics.checkNotNullParameter(it, "it");
        matchaRequestDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.matcha.ui.history.detail.request.MatchaRequestDetailDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaRequestDetailDuxo.onResume$lambda$1$lambda$0(it, (MatchaRequestDetailState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchaRequestDetailState onResume$lambda$1$lambda$0(MatchaRequest matchaRequest, MatchaRequestDetailState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return MatchaRequestDetailState.copy$default(applyMutation, matchaRequest, null, null, null, 14, null);
    }

    public final void onPrimaryButtonClick(MatchaRequestDetailState state) {
        MatchaRequestDetailState4 requestState;
        MatchaRequestDetailState4.ButtonAction primaryAction;
        MatchaRequestDetailState4.Action action;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getIsActionInFlight() || (requestState = state.getRequestState()) == null || (primaryAction = requestState.getPrimaryAction()) == null || (action = primaryAction.getAction()) == null) {
            return;
        }
        handleAction(action, MatchaRequestDetailState.ButtonType.PRIMARY);
    }

    public final void onSecondaryButtonClick(MatchaRequestDetailState state) {
        MatchaRequestDetailState4 requestState;
        MatchaRequestDetailState4.ButtonAction secondaryAction;
        MatchaRequestDetailState4.Action action;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getIsActionInFlight() || (requestState = state.getRequestState()) == null || (secondaryAction = requestState.getSecondaryAction()) == null || (action = secondaryAction.getAction()) == null) {
            return;
        }
        handleAction(action, MatchaRequestDetailState.ButtonType.SECONDARY);
    }

    private final void handleAction(final MatchaRequestDetailState4.Action action, final MatchaRequestDetailState.ButtonType buttonType) {
        applyMutation(new Function1() { // from class: com.robinhood.android.matcha.ui.history.detail.request.MatchaRequestDetailDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaRequestDetailDuxo.handleAction$lambda$2(buttonType, (MatchaRequestDetailState) obj);
            }
        });
        Single singleSubscribeOn = RxFactory.DefaultImpls.rxSingle$default(this, null, new C213262(action, null), 1, null).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(singleSubscribeOn, "subscribeOn(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleSubscribeOn, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.history.detail.request.MatchaRequestDetailDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaRequestDetailDuxo.handleAction$lambda$4(this.f$0, action, (Unit) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.matcha.ui.history.detail.request.MatchaRequestDetailDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaRequestDetailDuxo.handleAction$lambda$6(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchaRequestDetailState handleAction$lambda$2(MatchaRequestDetailState.ButtonType buttonType, MatchaRequestDetailState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return MatchaRequestDetailState.copy$default(applyMutation, null, null, null, buttonType, 7, null);
    }

    /* compiled from: MatchaRequestDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.history.detail.request.MatchaRequestDetailDuxo$handleAction$2", m3645f = "MatchaRequestDetailDuxo.kt", m3646l = {64}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.history.detail.request.MatchaRequestDetailDuxo$handleAction$2 */
    static final class C213262 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MatchaRequestDetailState4.Action $action;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C213262(MatchaRequestDetailState4.Action action, Continuation<? super C213262> continuation) {
            super(2, continuation);
            this.$action = action;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MatchaRequestDetailDuxo.this.new C213262(this.$action, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C213262) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MatchaRequestDetailDuxo matchaRequestDetailDuxo = MatchaRequestDetailDuxo.this;
                MatchaRequestDetailState4.Action action = this.$action;
                UUID requestId = ((LegacyFragmentKey.MatchaRequestDetail) MatchaRequestDetailDuxo.INSTANCE.getArgs((HasSavedState) matchaRequestDetailDuxo)).getRequestId();
                this.label = 1;
                if (matchaRequestDetailDuxo.perform(action, requestId, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleAction$lambda$4(MatchaRequestDetailDuxo matchaRequestDetailDuxo, final MatchaRequestDetailState4.Action action, Unit unit) {
        matchaRequestDetailDuxo.matchaRequestStore.refresh(((LegacyFragmentKey.MatchaRequestDetail) INSTANCE.getArgs((HasSavedState) matchaRequestDetailDuxo)).getRequestId(), true);
        matchaRequestDetailDuxo.matchaTransferStore.refresh(true);
        matchaRequestDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.matcha.ui.history.detail.request.MatchaRequestDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaRequestDetailDuxo.handleAction$lambda$4$lambda$3(action, (MatchaRequestDetailState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchaRequestDetailState handleAction$lambda$4$lambda$3(MatchaRequestDetailState4.Action action, MatchaRequestDetailState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        MatchaRequest matchaRequest = applyMutation.getMatchaRequest();
        if (matchaRequest == null) {
            throw new IllegalStateException("Required value was null.");
        }
        return MatchaRequestDetailState.copy$default(applyMutation, null, null, new UiEvent(MatchaRequestDetailState2.getConfirmationText(action, matchaRequest.getTransactor().getDisplayName(), Money3.toMoney(matchaRequest.getAmount(), Currencies.USD))), null, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleAction$lambda$6(MatchaRequestDetailDuxo matchaRequestDetailDuxo, final Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        matchaRequestDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.matcha.ui.history.detail.request.MatchaRequestDetailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaRequestDetailDuxo.handleAction$lambda$6$lambda$5(it, (MatchaRequestDetailState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchaRequestDetailState handleAction$lambda$6$lambda$5(Throwable th, MatchaRequestDetailState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return MatchaRequestDetailState.copy$default(applyMutation, null, new UiEvent(th), null, null, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object perform(MatchaRequestDetailState4.Action action, UUID uuid, Continuation<? super Unit> continuation) {
        int i = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        if (i == 1) {
            Object objAcceptRequest$default = MatchaPendingTransactionStore.acceptRequest$default(this.pendingTransactionStore, uuid, null, continuation, 2, null);
            return objAcceptRequest$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAcceptRequest$default : Unit.INSTANCE;
        }
        if (i == 2) {
            Object objDeclineRequest = this.pendingTransactionStore.declineRequest(uuid, continuation);
            return objDeclineRequest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDeclineRequest : Unit.INSTANCE;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCancelRequest = this.pendingTransactionStore.cancelRequest(uuid, continuation);
        return objCancelRequest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCancelRequest : Unit.INSTANCE;
    }

    /* compiled from: MatchaRequestDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/request/MatchaRequestDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/matcha/ui/history/detail/request/MatchaRequestDetailDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$MatchaRequestDetail;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MatchaRequestDetailDuxo, LegacyFragmentKey.MatchaRequestDetail> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.MatchaRequestDetail getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.MatchaRequestDetail) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.MatchaRequestDetail getArgs(MatchaRequestDetailDuxo matchaRequestDetailDuxo) {
            return (LegacyFragmentKey.MatchaRequestDetail) DuxoCompanion.DefaultImpls.getArgs(this, matchaRequestDetailDuxo);
        }
    }
}
