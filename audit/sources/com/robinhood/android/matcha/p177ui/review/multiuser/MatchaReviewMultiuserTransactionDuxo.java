package com.robinhood.android.matcha.p177ui.review.multiuser;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.matcha.models.p176ui.Transactor;
import com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType;
import com.robinhood.android.matcha.p177ui.incentives.MatchaIncentivesExperiment;
import com.robinhood.android.matcha.p177ui.memo.Args;
import com.robinhood.android.matcha.p177ui.memo.MemoInputActivity;
import com.robinhood.android.matcha.p177ui.models.Direction;
import com.robinhood.android.matcha.p177ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo;
import com.robinhood.android.matcha.p177ui.review.multiuser.MatchaReviewMultiuserTransactionEvent;
import com.robinhood.android.matcha.p177ui.review.multiuser.MatchaReviewMultiuserTransactionFragment;
import com.robinhood.android.matcha.p177ui.sourceoffunds.TransferAccounts3;
import com.robinhood.android.models.matcha.api.ApiMatchaBatchRequest;
import com.robinhood.android.models.matcha.api.ApiMatchaBatchRequestRequest;
import com.robinhood.android.models.matcha.api.ApiMatchaBatchTransfer;
import com.robinhood.android.models.matcha.api.ApiMatchaBatchTransferRequest;
import com.robinhood.android.models.matcha.api.ApiMatchaIdentifier;
import com.robinhood.android.models.matcha.api.ApiMatchaIdentifier2;
import com.robinhood.android.models.matcha.api.ApiMatchaRequestPayload;
import com.robinhood.android.models.matcha.api.ApiMatchaTransferPayload;
import com.robinhood.android.models.matcha.api.ApiMatchaTransferUser;
import com.robinhood.android.models.matcha.api.SourceOfFunds;
import com.robinhood.android.store.matcha.MatchaIncentivesSummaryStore;
import com.robinhood.android.store.matcha.MatchaTransferStore;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.api.matcha.MatchaApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ScopedSingle;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p320db.matcha.MatchaBatchRequest;
import com.robinhood.models.p320db.matcha.MatchaBatchRequest2;
import com.robinhood.models.p320db.matcha.MatchaBatchTransfer;
import com.robinhood.models.p320db.matcha.MatchaBatchTransfer2;
import com.robinhood.models.p320db.matcha.MatchaIncentivesSummary;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.p370rx.delay.SingleDelay2;
import com.robinhood.store.stripe.StripeStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import com.stripe.android.core.exception.StripeException;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
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
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: MatchaReviewMultiuserTransactionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 92\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u00019BQ\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0006\u0010\u001e\u001a\u00020\u001dJ\u0006\u0010\u001f\u001a\u00020\u001dJ\u0010\u0010 \u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\"J\u0006\u0010#\u001a\u00020\u001dJ\u000e\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&J\u0006\u0010'\u001a\u00020\u001dJ>\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u0010!\u001a\u0004\u0018\u00010\"2\f\u00100\u001a\b\u0012\u0004\u0012\u0002010,H\u0002J4\u00102\u001a\b\u0012\u0004\u0012\u00020*0)2\f\u00103\u001a\b\u0012\u0004\u0012\u00020-0,2\b\u0010!\u001a\u0004\u0018\u00010\"2\f\u00100\u001a\b\u0012\u0004\u0012\u0002010,H\u0002J\f\u00104\u001a\u00020-*\u000201H\u0002J\u0012\u00105\u001a\u00020/*\u00020/H\u0082@¢\u0006\u0002\u00106J\u0018\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&080)*\u00020\u0002H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionDataState;", "Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionViewState;", "Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "matchaApi", "Lcom/robinhood/api/matcha/MatchaApi;", "matchaTransferStore", "Lcom/robinhood/android/store/matcha/MatchaTransferStore;", "matchaIncentivesSummaryStore", "Lcom/robinhood/android/store/matcha/MatchaIncentivesSummaryStore;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "stripeStore", "Lcom/robinhood/store/stripe/StripeStore;", "stateProvider", "Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/api/matcha/MatchaApi;Lcom/robinhood/android/store/matcha/MatchaTransferStore;Lcom/robinhood/android/store/matcha/MatchaIncentivesSummaryStore;Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/store/stripe/StripeStore;Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "submit", "onMemoClick", "updateMemo", MemoInputActivity.EXTRA_MEMO, "", "showSourceOfFundsSelector", "updateSelectedTransferAccount", "account", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "launchTransferActivity", "sendMatchaTransfer", "Lio/reactivex/Single;", "Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionEvent$SubmitResult;", "receiverIdentifiers", "", "Lcom/robinhood/android/models/matcha/api/ApiMatchaIdentifier;", "sourceOfFunds", "Lcom/robinhood/android/models/matcha/api/SourceOfFunds;", "localTransactors", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "requestMatchaTransfer", "senderIdentifiers", "toApiIdentifier", "addRadarSessionIdIfNecessary", "(Lcom/robinhood/android/models/matcha/api/SourceOfFunds;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchSelectedTransferAccount", "Lcom/robinhood/utils/Optional;", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MatchaReviewMultiuserTransactionDuxo extends BaseDuxo3<MatchaReviewMultiuserTransactionDataState, MatchaReviewMultiuserTransactionViewState, MatchaReviewMultiuserTransactionEvent> implements HasSavedState {
    public static final String SAVED_STATE_TRANSFER_ID = "transferId";
    private final ExperimentsStore experimentsStore;
    private final MatchaApi matchaApi;
    private final MatchaIncentivesSummaryStore matchaIncentivesSummaryStore;
    private final MatchaTransferStore matchaTransferStore;
    private final SavedStateHandle savedStateHandle;
    private final StripeStore stripeStore;
    private final TransferAccountStore transferAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MatchaReviewMultiuserTransactionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiTransferAccount.TransferAccountType.values().length];
            try {
                iArr[ApiTransferAccount.TransferAccountType.DEBIT_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: MatchaReviewMultiuserTransactionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo", m3645f = "MatchaReviewMultiuserTransactionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE}, m3647m = "addRadarSessionIdIfNecessary")
    /* renamed from: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$addRadarSessionIdIfNecessary$1 */
    static final class C214711 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C214711(Continuation<? super C214711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MatchaReviewMultiuserTransactionDuxo.this.addRadarSessionIdIfNecessary(null, this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchaReviewMultiuserTransactionDuxo(MatchaApi matchaApi, MatchaTransferStore matchaTransferStore, MatchaIncentivesSummaryStore matchaIncentivesSummaryStore, TransferAccountStore transferAccountStore, ExperimentsStore experimentsStore, StripeStore stripeStore, MatchaReviewMultiuserTransactionStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(MatchaReviewMultiuserTransactionDataState.INSTANCE.initial(savedStateHandle), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(matchaApi, "matchaApi");
        Intrinsics.checkNotNullParameter(matchaTransferStore, "matchaTransferStore");
        Intrinsics.checkNotNullParameter(matchaIncentivesSummaryStore, "matchaIncentivesSummaryStore");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(stripeStore, "stripeStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.matchaApi = matchaApi;
        this.matchaTransferStore = matchaTransferStore;
        this.matchaIncentivesSummaryStore = matchaIncentivesSummaryStore;
        this.transferAccountStore = transferAccountStore;
        this.experimentsStore = experimentsStore;
        this.stripeStore = stripeStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C214741(null));
        this.matchaIncentivesSummaryStore.refresh(true);
        LifecycleHost.DefaultImpls.bind$default(this, this.matchaIncentivesSummaryStore.stream(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaReviewMultiuserTransactionDuxo.onStart$lambda$0(this.f$0, (MatchaIncentivesSummary) obj);
            }
        });
        Observable observableDistinctUntilChanged = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{MatchaIncentivesExperiment.INSTANCE}, false, null, 6, null).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaReviewMultiuserTransactionDuxo.onStart$lambda$1(this.f$0, (Boolean) obj);
            }
        });
    }

    /* compiled from: MatchaReviewMultiuserTransactionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$onStart$1", m3645f = "MatchaReviewMultiuserTransactionDuxo.kt", m3646l = {73}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$onStart$1 */
    static final class C214741 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C214741(Continuation<? super C214741> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MatchaReviewMultiuserTransactionDuxo.this.new C214741(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C214741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MatchaReviewMultiuserTransactionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "state", "Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$onStart$1$1", m3645f = "MatchaReviewMultiuserTransactionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MatchaReviewMultiuserTransactionViewState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MatchaReviewMultiuserTransactionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MatchaReviewMultiuserTransactionDuxo matchaReviewMultiuserTransactionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = matchaReviewMultiuserTransactionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MatchaReviewMultiuserTransactionViewState matchaReviewMultiuserTransactionViewState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(matchaReviewMultiuserTransactionViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                MatchaReviewMultiuserTransactionViewState matchaReviewMultiuserTransactionViewState = (MatchaReviewMultiuserTransactionViewState) this.L$0;
                if (matchaReviewMultiuserTransactionViewState.getTransferId() != null) {
                    this.this$0.getSavedStateHandle().set("transferId", matchaReviewMultiuserTransactionViewState.getTransferId());
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<MatchaReviewMultiuserTransactionViewState> stateFlow = MatchaReviewMultiuserTransactionDuxo.this.getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MatchaReviewMultiuserTransactionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
    public static final Unit onStart$lambda$0(MatchaReviewMultiuserTransactionDuxo matchaReviewMultiuserTransactionDuxo, MatchaIncentivesSummary incentivesSummary) {
        Intrinsics.checkNotNullParameter(incentivesSummary, "incentivesSummary");
        matchaReviewMultiuserTransactionDuxo.applyMutation(new MatchaReviewMultiuserTransactionDuxo2(incentivesSummary, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(MatchaReviewMultiuserTransactionDuxo matchaReviewMultiuserTransactionDuxo, Boolean bool) {
        matchaReviewMultiuserTransactionDuxo.applyMutation(new MatchaReviewMultiuserTransactionDuxo3(bool, null));
        return Unit.INSTANCE;
    }

    /* compiled from: MatchaReviewMultiuserTransactionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$submit$1", m3645f = "MatchaReviewMultiuserTransactionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$submit$1 */
    static final class C214801 extends ContinuationImpl7 implements Function2<MatchaReviewMultiuserTransactionDataState, Continuation<? super MatchaReviewMultiuserTransactionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: MatchaReviewMultiuserTransactionDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$submit$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Direction.values().length];
                try {
                    iArr[Direction.SEND.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Direction.REQUEST.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C214801(Continuation<? super C214801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C214801 c214801 = MatchaReviewMultiuserTransactionDuxo.this.new C214801(continuation);
            c214801.L$0 = obj;
            return c214801;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MatchaReviewMultiuserTransactionDataState matchaReviewMultiuserTransactionDataState, Continuation<? super MatchaReviewMultiuserTransactionDataState> continuation) {
            return ((C214801) create(matchaReviewMultiuserTransactionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Single singleOnErrorResumeNext;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final MatchaReviewMultiuserTransactionDataState matchaReviewMultiuserTransactionDataState = (MatchaReviewMultiuserTransactionDataState) this.L$0;
            MatchaReviewMultiuserTransactionDuxo matchaReviewMultiuserTransactionDuxo = MatchaReviewMultiuserTransactionDuxo.this;
            int i = WhenMappings.$EnumSwitchMapping$0[matchaReviewMultiuserTransactionDataState.getDirection().ordinal()];
            if (i == 1) {
                MatchaReviewMultiuserTransactionDuxo matchaReviewMultiuserTransactionDuxo2 = MatchaReviewMultiuserTransactionDuxo.this;
                List<Transactor> transactors = matchaReviewMultiuserTransactionDataState.getTransactors();
                MatchaReviewMultiuserTransactionDuxo matchaReviewMultiuserTransactionDuxo3 = MatchaReviewMultiuserTransactionDuxo.this;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(transactors, 10));
                Iterator<T> it = transactors.iterator();
                while (it.hasNext()) {
                    arrayList.add(matchaReviewMultiuserTransactionDuxo3.toApiIdentifier((Transactor) it.next()));
                }
                final Single singleSendMatchaTransfer = matchaReviewMultiuserTransactionDuxo2.sendMatchaTransfer(arrayList, matchaReviewMultiuserTransactionDataState.getSourceOfFunds(), matchaReviewMultiuserTransactionDataState.getMemo(), matchaReviewMultiuserTransactionDataState.getTransactors());
                singleOnErrorResumeNext = MatchaReviewMultiuserTransactionDuxo.this.fetchSelectedTransferAccount(matchaReviewMultiuserTransactionDataState).flatMap(new Function() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo.submit.1.1
                    @Override // io.reactivex.functions.Function
                    public final SingleSource<? extends MatchaReviewMultiuserTransactionEvent.SubmitResult> apply(Optional<TransferAccount> selectedTransferAccount) {
                        Intrinsics.checkNotNullParameter(selectedTransferAccount, "selectedTransferAccount");
                        if (matchaReviewMultiuserTransactionDataState.hasInsufficientFunds(selectedTransferAccount.getOrNull())) {
                            Single singleJust = Single.just(MatchaReviewMultiuserTransactionEvent.SubmitResult.InsufficientFundsError.INSTANCE);
                            Intrinsics.checkNotNull(singleJust);
                            return singleJust;
                        }
                        return singleSendMatchaTransfer;
                    }
                }).onErrorResumeNext(singleSendMatchaTransfer);
                Intrinsics.checkNotNull(singleOnErrorResumeNext);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                MatchaReviewMultiuserTransactionDuxo matchaReviewMultiuserTransactionDuxo4 = MatchaReviewMultiuserTransactionDuxo.this;
                List<Transactor> transactors2 = matchaReviewMultiuserTransactionDataState.getTransactors();
                MatchaReviewMultiuserTransactionDuxo matchaReviewMultiuserTransactionDuxo5 = MatchaReviewMultiuserTransactionDuxo.this;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(transactors2, 10));
                Iterator<T> it2 = transactors2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(matchaReviewMultiuserTransactionDuxo5.toApiIdentifier((Transactor) it2.next()));
                }
                singleOnErrorResumeNext = matchaReviewMultiuserTransactionDuxo4.requestMatchaTransfer(arrayList2, matchaReviewMultiuserTransactionDataState.getMemo(), matchaReviewMultiuserTransactionDataState.getTransactors());
            }
            Single singleMinTimeInFlight$default = SingleDelay2.minTimeInFlight$default(singleOnErrorResumeNext, 1000L, null, 2, null);
            final MatchaReviewMultiuserTransactionDuxo matchaReviewMultiuserTransactionDuxo6 = MatchaReviewMultiuserTransactionDuxo.this;
            Single singleDoOnSuccess = singleMinTimeInFlight$default.doOnSuccess(new Consumer() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo.submit.1.3
                @Override // io.reactivex.functions.Consumer
                public final void accept(MatchaReviewMultiuserTransactionEvent.SubmitResult submitResult) {
                    matchaReviewMultiuserTransactionDuxo6.matchaTransferStore.refresh(true);
                    matchaReviewMultiuserTransactionDuxo6.transferAccountStore.refresh(true);
                }
            });
            final MatchaReviewMultiuserTransactionDuxo matchaReviewMultiuserTransactionDuxo7 = MatchaReviewMultiuserTransactionDuxo.this;
            Single singleDoOnSubscribe = singleDoOnSuccess.doOnSubscribe(new Consumer() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo.submit.1.4

                /* compiled from: MatchaReviewMultiuserTransactionDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$submit$1$4$1", m3645f = "MatchaReviewMultiuserTransactionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$submit$1$4$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MatchaReviewMultiuserTransactionDataState, Continuation<? super MatchaReviewMultiuserTransactionDataState>, Object> {
                    private /* synthetic */ Object L$0;
                    int label;

                    AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(MatchaReviewMultiuserTransactionDataState matchaReviewMultiuserTransactionDataState, Continuation<? super MatchaReviewMultiuserTransactionDataState> continuation) {
                        return ((AnonymousClass1) create(matchaReviewMultiuserTransactionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return MatchaReviewMultiuserTransactionDataState.copy$default((MatchaReviewMultiuserTransactionDataState) this.L$0, null, null, null, null, null, true, null, null, null, null, false, 2015, null);
                    }
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Disposable disposable) {
                    matchaReviewMultiuserTransactionDuxo7.applyMutation(new AnonymousClass1(null));
                }
            });
            Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
            ScopedSingle scopedSingleBind$default = LifecycleHost.DefaultImpls.bind$default(matchaReviewMultiuserTransactionDuxo, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null);
            final MatchaReviewMultiuserTransactionDuxo matchaReviewMultiuserTransactionDuxo8 = MatchaReviewMultiuserTransactionDuxo.this;
            Function1 function1 = new Function1() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$submit$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return MatchaReviewMultiuserTransactionDuxo.C214801.invokeSuspend$lambda$2(matchaReviewMultiuserTransactionDuxo8, (MatchaReviewMultiuserTransactionEvent.SubmitResult) obj2);
                }
            };
            final MatchaReviewMultiuserTransactionDuxo matchaReviewMultiuserTransactionDuxo9 = MatchaReviewMultiuserTransactionDuxo.this;
            scopedSingleBind$default.subscribeKotlin(function1, new Function1() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$submit$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return MatchaReviewMultiuserTransactionDuxo.C214801.invokeSuspend$lambda$3(matchaReviewMultiuserTransactionDuxo9, (Throwable) obj2);
                }
            });
            return matchaReviewMultiuserTransactionDataState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(MatchaReviewMultiuserTransactionDuxo matchaReviewMultiuserTransactionDuxo, MatchaReviewMultiuserTransactionEvent.SubmitResult submitResult) {
            Intrinsics.checkNotNull(submitResult);
            matchaReviewMultiuserTransactionDuxo.submit(submitResult);
            if (submitResult.getClearLoading()) {
                matchaReviewMultiuserTransactionDuxo.applyMutation(new MatchaReviewMultiuserTransactionDuxo4(null));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$3(MatchaReviewMultiuserTransactionDuxo matchaReviewMultiuserTransactionDuxo, Throwable th) {
            matchaReviewMultiuserTransactionDuxo.submit(new MatchaReviewMultiuserTransactionEvent.SubmitResult.Error(th));
            matchaReviewMultiuserTransactionDuxo.applyMutation(new MatchaReviewMultiuserTransactionDuxo5(null));
            return Unit.INSTANCE;
        }
    }

    public final void submit() {
        applyMutation(new C214801(null));
    }

    public final void onMemoClick() {
        withDataState(new Function1() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaReviewMultiuserTransactionDuxo.onMemoClick$lambda$2(this.f$0, (MatchaReviewMultiuserTransactionDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMemoClick$lambda$2(MatchaReviewMultiuserTransactionDuxo matchaReviewMultiuserTransactionDuxo, MatchaReviewMultiuserTransactionDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String memo = it.getMemo();
        matchaReviewMultiuserTransactionDuxo.submit(new MatchaReviewMultiuserTransactionEvent.AddMemo(new Args(it.getMemoTitle(), it.getMemoSubtitle(), null, it.getAvatars(), memo)));
        return Unit.INSTANCE;
    }

    /* compiled from: MatchaReviewMultiuserTransactionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$updateMemo$1", m3645f = "MatchaReviewMultiuserTransactionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$updateMemo$1 */
    static final class C214811 extends ContinuationImpl7 implements Function2<MatchaReviewMultiuserTransactionDataState, Continuation<? super MatchaReviewMultiuserTransactionDataState>, Object> {
        final /* synthetic */ String $memo;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C214811(String str, Continuation<? super C214811> continuation) {
            super(2, continuation);
            this.$memo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C214811 c214811 = new C214811(this.$memo, continuation);
            c214811.L$0 = obj;
            return c214811;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MatchaReviewMultiuserTransactionDataState matchaReviewMultiuserTransactionDataState, Continuation<? super MatchaReviewMultiuserTransactionDataState> continuation) {
            return ((C214811) create(matchaReviewMultiuserTransactionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return MatchaReviewMultiuserTransactionDataState.copy$default((MatchaReviewMultiuserTransactionDataState) this.L$0, null, null, null, null, this.$memo, false, null, null, null, null, false, 2031, null);
        }
    }

    public final void updateMemo(String memo) {
        applyMutation(new C214811(memo, null));
    }

    public final void showSourceOfFundsSelector() {
        withDataState(new Function1() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaReviewMultiuserTransactionDuxo.showSourceOfFundsSelector$lambda$3(this.f$0, (MatchaReviewMultiuserTransactionDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showSourceOfFundsSelector$lambda$3(MatchaReviewMultiuserTransactionDuxo matchaReviewMultiuserTransactionDuxo, MatchaReviewMultiuserTransactionDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        matchaReviewMultiuserTransactionDuxo.submit(new MatchaReviewMultiuserTransactionEvent.ShowSourceOfFundsSelector(Optional3.asOptional(it.getSelectedTransferAccount())));
        return Unit.INSTANCE;
    }

    /* compiled from: MatchaReviewMultiuserTransactionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$updateSelectedTransferAccount$1", m3645f = "MatchaReviewMultiuserTransactionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$updateSelectedTransferAccount$1 */
    static final class C214821 extends ContinuationImpl7 implements Function2<MatchaReviewMultiuserTransactionDataState, Continuation<? super MatchaReviewMultiuserTransactionDataState>, Object> {
        final /* synthetic */ TransferAccount $account;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C214821(TransferAccount transferAccount, Continuation<? super C214821> continuation) {
            super(2, continuation);
            this.$account = transferAccount;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C214821 c214821 = new C214821(this.$account, continuation);
            c214821.L$0 = obj;
            return c214821;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MatchaReviewMultiuserTransactionDataState matchaReviewMultiuserTransactionDataState, Continuation<? super MatchaReviewMultiuserTransactionDataState> continuation) {
            return ((C214821) create(matchaReviewMultiuserTransactionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return MatchaReviewMultiuserTransactionDataState.copy$default((MatchaReviewMultiuserTransactionDataState) this.L$0, null, TransferAccounts3.toSourceOfFunds(this.$account), null, null, null, false, null, this.$account, null, null, false, 1917, null);
        }
    }

    public final void updateSelectedTransferAccount(TransferAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        applyMutation(new C214821(account, null));
    }

    public final void launchTransferActivity() {
        withDataState(new Function1() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaReviewMultiuserTransactionDuxo.launchTransferActivity$lambda$4(this.f$0, (MatchaReviewMultiuserTransactionDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchTransferActivity$lambda$4(MatchaReviewMultiuserTransactionDuxo matchaReviewMultiuserTransactionDuxo, MatchaReviewMultiuserTransactionDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SourceOfFunds sourceOfFunds = it.getSourceOfFunds();
        matchaReviewMultiuserTransactionDuxo.submit(new MatchaReviewMultiuserTransactionEvent.LaunchTransferActivity(sourceOfFunds != null ? sourceOfFunds.getType() : null));
        return Unit.INSTANCE;
    }

    /* compiled from: MatchaReviewMultiuserTransactionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/matcha/api/ApiMatchaBatchTransfer;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$sendMatchaTransfer$1", m3645f = "MatchaReviewMultiuserTransactionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE, EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$sendMatchaTransfer$1 */
    static final class C214771 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiMatchaBatchTransfer>, Object> {
        final /* synthetic */ String $memo;
        final /* synthetic */ List<ApiMatchaIdentifier> $receiverIdentifiers;
        final /* synthetic */ SourceOfFunds $sourceOfFunds;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C214771(SourceOfFunds sourceOfFunds, List<ApiMatchaIdentifier> list, String str, Continuation<? super C214771> continuation) {
            super(2, continuation);
            this.$sourceOfFunds = sourceOfFunds;
            this.$receiverIdentifiers = list;
            this.$memo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MatchaReviewMultiuserTransactionDuxo.this.new C214771(this.$sourceOfFunds, this.$receiverIdentifiers, this.$memo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiMatchaBatchTransfer> continuation) {
            return ((C214771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[LOOP:0: B:20:0x0068->B:22:0x006e, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00bb A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00bc A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            MatchaApi matchaApi;
            UUID uuid;
            SourceOfFunds sourceOfFunds;
            Iterator<T> it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                matchaApi = MatchaReviewMultiuserTransactionDuxo.this.matchaApi;
                UUID uuidRandomUUID = UUID.randomUUID();
                Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
                SourceOfFunds sourceOfFunds2 = this.$sourceOfFunds;
                if (sourceOfFunds2 != null) {
                    MatchaReviewMultiuserTransactionDuxo matchaReviewMultiuserTransactionDuxo = MatchaReviewMultiuserTransactionDuxo.this;
                    this.L$0 = uuidRandomUUID;
                    this.L$1 = matchaApi;
                    this.label = 1;
                    Object objAddRadarSessionIdIfNecessary = matchaReviewMultiuserTransactionDuxo.addRadarSessionIdIfNecessary(sourceOfFunds2, this);
                    if (objAddRadarSessionIdIfNecessary != coroutine_suspended) {
                        uuid = uuidRandomUUID;
                        obj = objAddRadarSessionIdIfNecessary;
                    }
                }
                uuid = uuidRandomUUID;
                sourceOfFunds = null;
                List<ApiMatchaIdentifier> list = this.$receiverIdentifiers;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ApiMatchaTransferUser((ApiMatchaIdentifier) it.next(), null, 2, null));
                }
                Companion companion = MatchaReviewMultiuserTransactionDuxo.INSTANCE;
                ApiMatchaBatchTransferRequest apiMatchaBatchTransferRequest = new ApiMatchaBatchTransferRequest(uuid, arrayList, new ApiMatchaTransferPayload(BigDecimals7.times(((MatchaReviewMultiuserTransactionFragment.Args) companion.getArgs((HasSavedState) MatchaReviewMultiuserTransactionDuxo.this)).getAmount().getDecimalValue(), ((MatchaReviewMultiuserTransactionFragment.Args) companion.getArgs((HasSavedState) MatchaReviewMultiuserTransactionDuxo.this)).getTransactors().size()), this.$memo), sourceOfFunds);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                Object objCreateBatchTransfer = matchaApi.createBatchTransfer(apiMatchaBatchTransferRequest, this);
                return objCreateBatchTransfer != coroutine_suspended ? coroutine_suspended : objCreateBatchTransfer;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            matchaApi = (MatchaApi) this.L$1;
            uuid = (UUID) this.L$0;
            ResultKt.throwOnFailure(obj);
            sourceOfFunds = (SourceOfFunds) obj;
            List<ApiMatchaIdentifier> list2 = this.$receiverIdentifiers;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            it = list2.iterator();
            while (it.hasNext()) {
            }
            Companion companion2 = MatchaReviewMultiuserTransactionDuxo.INSTANCE;
            ApiMatchaBatchTransferRequest apiMatchaBatchTransferRequest2 = new ApiMatchaBatchTransferRequest(uuid, arrayList2, new ApiMatchaTransferPayload(BigDecimals7.times(((MatchaReviewMultiuserTransactionFragment.Args) companion2.getArgs((HasSavedState) MatchaReviewMultiuserTransactionDuxo.this)).getAmount().getDecimalValue(), ((MatchaReviewMultiuserTransactionFragment.Args) companion2.getArgs((HasSavedState) MatchaReviewMultiuserTransactionDuxo.this)).getTransactors().size()), this.$memo), sourceOfFunds);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            Object objCreateBatchTransfer2 = matchaApi.createBatchTransfer(apiMatchaBatchTransferRequest2, this);
            if (objCreateBatchTransfer2 != coroutine_suspended) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single<MatchaReviewMultiuserTransactionEvent.SubmitResult> sendMatchaTransfer(List<ApiMatchaIdentifier> receiverIdentifiers, SourceOfFunds sourceOfFunds, String memo, final List<? extends Transactor> localTransactors) {
        Single<MatchaReviewMultiuserTransactionEvent.SubmitResult> map = RxFactory.DefaultImpls.rxSingle$default(this, null, new C214771(sourceOfFunds, receiverIdentifiers, memo, null), 1, null).doOnSuccess(new Consumer() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo.sendMatchaTransfer.2

            /* compiled from: MatchaReviewMultiuserTransactionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$sendMatchaTransfer$2$1", m3645f = "MatchaReviewMultiuserTransactionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$sendMatchaTransfer$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MatchaReviewMultiuserTransactionDataState, Continuation<? super MatchaReviewMultiuserTransactionDataState>, Object> {
                final /* synthetic */ ApiMatchaBatchTransfer $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ApiMatchaBatchTransfer apiMatchaBatchTransfer, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = apiMatchaBatchTransfer;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MatchaReviewMultiuserTransactionDataState matchaReviewMultiuserTransactionDataState, Continuation<? super MatchaReviewMultiuserTransactionDataState> continuation) {
                    return ((AnonymousClass1) create(matchaReviewMultiuserTransactionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return MatchaReviewMultiuserTransactionDataState.copy$default((MatchaReviewMultiuserTransactionDataState) this.L$0, null, null, null, null, null, false, this.$it.getId(), null, null, null, false, 1983, null);
                }
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(ApiMatchaBatchTransfer apiMatchaBatchTransfer) {
                MatchaReviewMultiuserTransactionDuxo.this.applyMutation(new AnonymousClass1(apiMatchaBatchTransfer, null));
            }
        }).map(new Function() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo.sendMatchaTransfer.3
            @Override // io.reactivex.functions.Function
            public final MatchaReviewMultiuserTransactionEvent.SubmitResult apply(ApiMatchaBatchTransfer response) {
                Intrinsics.checkNotNullParameter(response, "response");
                MatchaBatchTransfer dbModel = MatchaBatchTransfer2.toDbModel(response);
                Money money = Money3.toMoney(dbModel.getAmount(), Currencies.USD);
                List<Transactor> list = localTransactors;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Transactor) it.next()).getDisplayName());
                }
                return new MatchaReviewMultiuserTransactionEvent.SubmitResult.Success(new ConfirmationType.MultiuserPayment(money, arrayList, dbModel.getId(), dbModel.getExpirationDate()));
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* compiled from: MatchaReviewMultiuserTransactionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/matcha/api/ApiMatchaBatchRequest;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$requestMatchaTransfer$1", m3645f = "MatchaReviewMultiuserTransactionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo$requestMatchaTransfer$1 */
    static final class C214751 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiMatchaBatchRequest>, Object> {
        final /* synthetic */ String $memo;
        final /* synthetic */ List<ApiMatchaIdentifier> $senderIdentifiers;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C214751(List<ApiMatchaIdentifier> list, String str, Continuation<? super C214751> continuation) {
            super(2, continuation);
            this.$senderIdentifiers = list;
            this.$memo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MatchaReviewMultiuserTransactionDuxo.this.new C214751(this.$senderIdentifiers, this.$memo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiMatchaBatchRequest> continuation) {
            return ((C214751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            MatchaApi matchaApi = MatchaReviewMultiuserTransactionDuxo.this.matchaApi;
            String string2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            List<ApiMatchaIdentifier> list = this.$senderIdentifiers;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new ApiMatchaTransferUser((ApiMatchaIdentifier) it.next(), null, 2, null));
            }
            Companion companion = MatchaReviewMultiuserTransactionDuxo.INSTANCE;
            ApiMatchaBatchRequestRequest apiMatchaBatchRequestRequest = new ApiMatchaBatchRequestRequest(string2, arrayList, new ApiMatchaRequestPayload(BigDecimals7.times(((MatchaReviewMultiuserTransactionFragment.Args) companion.getArgs((HasSavedState) MatchaReviewMultiuserTransactionDuxo.this)).getAmount().getDecimalValue(), ((MatchaReviewMultiuserTransactionFragment.Args) companion.getArgs((HasSavedState) MatchaReviewMultiuserTransactionDuxo.this)).getTransactors().size()), this.$memo));
            this.label = 1;
            Object objCreateBatchRequest = matchaApi.createBatchRequest(apiMatchaBatchRequestRequest, this);
            return objCreateBatchRequest == coroutine_suspended ? coroutine_suspended : objCreateBatchRequest;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single<MatchaReviewMultiuserTransactionEvent.SubmitResult> requestMatchaTransfer(List<ApiMatchaIdentifier> senderIdentifiers, String memo, final List<? extends Transactor> localTransactors) {
        Single<MatchaReviewMultiuserTransactionEvent.SubmitResult> map = RxFactory.DefaultImpls.rxSingle$default(this, null, new C214751(senderIdentifiers, memo, null), 1, null).map(new Function() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo.requestMatchaTransfer.2
            @Override // io.reactivex.functions.Function
            public final MatchaReviewMultiuserTransactionEvent.SubmitResult apply(ApiMatchaBatchRequest it) {
                Intrinsics.checkNotNullParameter(it, "it");
                MatchaBatchRequest dbModel = MatchaBatchRequest2.toDbModel(it);
                Money money = Money3.toMoney(dbModel.getAmount(), Currencies.USD);
                List<Transactor> list = localTransactors;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((Transactor) it2.next()).getDisplayName());
                }
                return new MatchaReviewMultiuserTransactionEvent.SubmitResult.Success(new ConfirmationType.MultiuserRequest(money, arrayList, dbModel.getId()));
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ApiMatchaIdentifier toApiIdentifier(Transactor transactor) {
        ApiMatchaIdentifier2 apiMatchaIdentifier2;
        String identifier = transactor.getIdentifier();
        if (transactor instanceof Transactor.Email) {
            apiMatchaIdentifier2 = ApiMatchaIdentifier2.EMAIL;
        } else if (transactor instanceof Transactor.Phone) {
            apiMatchaIdentifier2 = ApiMatchaIdentifier2.PHONE_NUMBER;
        } else {
            if (!(transactor instanceof Transactor.User)) {
                throw new NoWhenBranchMatchedException();
            }
            apiMatchaIdentifier2 = ApiMatchaIdentifier2.USER_UUID;
        }
        return new ApiMatchaIdentifier(apiMatchaIdentifier2, identifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object addRadarSessionIdIfNecessary(SourceOfFunds sourceOfFunds, Continuation<? super SourceOfFunds> continuation) {
        C214711 c214711;
        StripeException stripeException;
        SourceOfFunds sourceOfFunds2;
        String str;
        if (continuation instanceof C214711) {
            c214711 = (C214711) continuation;
            int i = c214711.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c214711.label = i - Integer.MIN_VALUE;
            } else {
                c214711 = new C214711(continuation);
            }
        }
        Object radarSessionId = c214711.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c214711.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(radarSessionId);
            if (WhenMappings.$EnumSwitchMapping$0[sourceOfFunds.getType().ordinal()] != 1) {
                return sourceOfFunds;
            }
            try {
                StripeStore stripeStore = this.stripeStore;
                ApiTransferAccount.TransferAccountType transferAccountType = ApiTransferAccount.TransferAccountType.RHY;
                c214711.L$0 = sourceOfFunds;
                c214711.L$1 = sourceOfFunds;
                c214711.label = 1;
                radarSessionId = stripeStore.getRadarSessionId(transferAccountType, c214711);
                if (radarSessionId == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sourceOfFunds2 = sourceOfFunds;
            } catch (StripeException e) {
                stripeException = e;
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, stripeException, false, null, 6, null);
                str = null;
                return SourceOfFunds.copy$default(sourceOfFunds, null, null, str, null, 11, null);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sourceOfFunds = (SourceOfFunds) c214711.L$1;
            sourceOfFunds2 = (SourceOfFunds) c214711.L$0;
            try {
                ResultKt.throwOnFailure(radarSessionId);
            } catch (StripeException e2) {
                SourceOfFunds sourceOfFunds3 = sourceOfFunds2;
                stripeException = e2;
                sourceOfFunds = sourceOfFunds3;
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, stripeException, false, null, 6, null);
                str = null;
                return SourceOfFunds.copy$default(sourceOfFunds, null, null, str, null, 11, null);
            }
        }
        str = (String) radarSessionId;
        return SourceOfFunds.copy$default(sourceOfFunds, null, null, str, null, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single<Optional<TransferAccount>> fetchSelectedTransferAccount(final MatchaReviewMultiuserTransactionDataState matchaReviewMultiuserTransactionDataState) {
        Single<List<TransferAccount>> singleFirstOrError = this.transferAccountStore.fetchIfStaleThenStream().firstOrError();
        if (matchaReviewMultiuserTransactionDataState.getSelectedTransferAccount() != null) {
            Single<Optional<TransferAccount>> singleJust = Single.just(Optional3.asOptional(matchaReviewMultiuserTransactionDataState.getSelectedTransferAccount()));
            Intrinsics.checkNotNullExpressionValue(singleJust, "just(...)");
            return singleJust;
        }
        if (matchaReviewMultiuserTransactionDataState.getSourceOfFunds() != null) {
            Single map = singleFirstOrError.map(new Function() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo.fetchSelectedTransferAccount.1
                @Override // io.reactivex.functions.Function
                public final Optional<TransferAccount> apply(List<TransferAccount> accounts2) {
                    Object next;
                    Intrinsics.checkNotNullParameter(accounts2, "accounts");
                    MatchaReviewMultiuserTransactionDataState matchaReviewMultiuserTransactionDataState2 = matchaReviewMultiuserTransactionDataState;
                    Iterator<T> it = accounts2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.areEqual(((TransferAccount) next).getId(), matchaReviewMultiuserTransactionDataState2.getSourceOfFunds().getValue())) {
                            break;
                        }
                    }
                    return Optional3.asOptional(next);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            return map;
        }
        Single map2 = singleFirstOrError.map(new Function() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionDuxo.fetchSelectedTransferAccount.2
            @Override // io.reactivex.functions.Function
            public final Optional<TransferAccount> apply(List<TransferAccount> accounts2) {
                Object next;
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                Iterator<T> it = accounts2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((TransferAccount) next).getType() == TransferAccounts3.getDefaultSourceOfFundsType()) {
                        break;
                    }
                }
                return Optional3.asOptional(next);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        return map2;
    }

    /* compiled from: MatchaReviewMultiuserTransactionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionDuxo;", "Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionFragment$Args;", "<init>", "()V", "SAVED_STATE_TRANSFER_ID", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MatchaReviewMultiuserTransactionDuxo, MatchaReviewMultiuserTransactionFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MatchaReviewMultiuserTransactionFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (MatchaReviewMultiuserTransactionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MatchaReviewMultiuserTransactionFragment.Args getArgs(MatchaReviewMultiuserTransactionDuxo matchaReviewMultiuserTransactionDuxo) {
            return (MatchaReviewMultiuserTransactionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, matchaReviewMultiuserTransactionDuxo);
        }
    }
}
