package com.robinhood.android.matcha.p177ui.review;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.stepupverification.SuvMigrationManager;
import com.robinhood.android.matcha.models.p176ui.Transactor;
import com.robinhood.android.matcha.p177ui.common.VerificationWorkflowResults;
import com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType;
import com.robinhood.android.matcha.p177ui.incentives.MatchaIncentivesExperiment;
import com.robinhood.android.matcha.p177ui.memo.Args;
import com.robinhood.android.matcha.p177ui.memo.MemoInputActivity;
import com.robinhood.android.matcha.p177ui.models.Direction;
import com.robinhood.android.matcha.p177ui.review.MatchaReviewTransactionDuxo;
import com.robinhood.android.matcha.p177ui.review.MatchaReviewTransactionEvent;
import com.robinhood.android.matcha.p177ui.review.MatchaReviewTransactionFragment;
import com.robinhood.android.matcha.p177ui.sourceoffunds.TransferAccounts3;
import com.robinhood.android.models.matcha.api.ApiMatchaIdentifier;
import com.robinhood.android.models.matcha.api.ApiMatchaIdentifier2;
import com.robinhood.android.models.matcha.api.ApiMatchaRequest;
import com.robinhood.android.models.matcha.api.ApiMatchaRequestPayload;
import com.robinhood.android.models.matcha.api.ApiMatchaRequestRequest;
import com.robinhood.android.models.matcha.api.ApiMatchaSendRequest;
import com.robinhood.android.models.matcha.api.ApiMatchaTransfer;
import com.robinhood.android.models.matcha.api.ApiMatchaTransferPayload;
import com.robinhood.android.models.matcha.api.ApiMatchaTransferUser;
import com.robinhood.android.models.matcha.api.ApiRequestAcceptResponse;
import com.robinhood.android.models.matcha.api.MatchaTransferState;
import com.robinhood.android.models.matcha.api.SourceOfFunds;
import com.robinhood.android.models.stepupverification.VerificationWorkflowResult;
import com.robinhood.android.store.matcha.MatchaIncentivesSummaryStore;
import com.robinhood.android.store.matcha.MatchaPendingTransactionStore;
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
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p320db.matcha.MatchaIncentivesSummary;
import com.robinhood.models.p320db.matcha.MatchaRequest;
import com.robinhood.models.p320db.matcha.MatchaRequest2;
import com.robinhood.models.p320db.matcha.MatchaTransfer;
import com.robinhood.models.p320db.matcha.MatchaTransfer2;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.p2p.common.ProfileAvatars;
import com.robinhood.p370rx.delay.SingleDelay2;
import com.robinhood.store.stripe.StripeStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.money.Currencies;
import com.stripe.android.core.exception.StripeException;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import p479j$.time.Instant;

/* compiled from: MatchaReviewTransactionDuxo.kt */
@Metadata(m3635d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 I2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001IBi\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\"\u001a\u00020#H\u0016J\u0006\u0010$\u001a\u00020#J\u0006\u0010%\u001a\u00020#J\u0010\u0010&\u001a\u00020#2\b\u0010'\u001a\u0004\u0018\u00010(J\u0006\u0010)\u001a\u00020#J\u000e\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020#J\u0010\u0010.\u001a\u00020#2\b\u0010/\u001a\u0004\u0018\u000100J2\u00101\u001a\b\u0012\u0004\u0012\u000203022\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u0001072\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u00108\u001a\u000209H\u0002J \u0010:\u001a\b\u0012\u0004\u0012\u000203022\u0006\u0010;\u001a\u0002052\b\u0010'\u001a\u0004\u0018\u00010(H\u0002J4\u0010<\u001a\u00020=2\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u0001072\b\u0010>\u001a\u0004\u0018\u00010?2\b\u0010'\u001a\u0004\u0018\u00010(H\u0082@¢\u0006\u0002\u0010@J\f\u0010A\u001a\u000205*\u000209H\u0002J\u0014\u0010B\u001a\u00020C*\u00020D2\u0006\u00108\u001a\u000209H\u0002J\u0012\u0010E\u001a\u000207*\u000207H\u0082@¢\u0006\u0002\u0010FJ\u0018\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0H02*\u00020\u0002H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006J"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionDataState;", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionViewState;", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "matchaApi", "Lcom/robinhood/api/matcha/MatchaApi;", "matchaPendingTransactionStore", "Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore;", "matchaTransferStore", "Lcom/robinhood/android/store/matcha/MatchaTransferStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "matchaIncentivesSummaryStore", "Lcom/robinhood/android/store/matcha/MatchaIncentivesSummaryStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "stripeStore", "Lcom/robinhood/store/stripe/StripeStore;", "suvMigrationManager", "Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;", "stateProvider", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/api/matcha/MatchaApi;Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore;Lcom/robinhood/android/store/matcha/MatchaTransferStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;Lcom/robinhood/android/store/matcha/MatchaIncentivesSummaryStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/store/stripe/StripeStore;Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "submit", "onMemoClick", "updateMemo", MemoInputActivity.EXTRA_MEMO, "", "showSourceOfFundsSelector", "updateSelectedTransferAccount", "account", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "launchTransferActivity", "onVerificationResult", "verificationResult", "Lcom/robinhood/android/models/stepupverification/VerificationWorkflowResult;", "sendMatchaTransfer", "Lio/reactivex/Single;", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionEvent$SubmitResult;", "receiverIdentifier", "Lcom/robinhood/android/models/matcha/api/ApiMatchaIdentifier;", "sourceOfFunds", "Lcom/robinhood/android/models/matcha/api/SourceOfFunds;", "localTransactor", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "requestMatchaTransfer", "senderIdentifier", "createTransferOrAcceptRequest", "Lcom/robinhood/android/models/matcha/api/ApiMatchaTransfer;", "requestId", "Ljava/util/UUID;", "(Lcom/robinhood/android/models/matcha/api/ApiMatchaIdentifier;Lcom/robinhood/android/models/matcha/api/SourceOfFunds;Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toApiIdentifier", "createConfirmationType", "Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType;", "Lcom/robinhood/models/db/matcha/MatchaTransfer;", "addRadarSessionIdIfNecessary", "(Lcom/robinhood/android/models/matcha/api/SourceOfFunds;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchSelectedTransferAccount", "Lcom/robinhood/utils/Optional;", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MatchaReviewTransactionDuxo extends BaseDuxo3<MatchaReviewTransactionDataState, MatchaReviewTransactionViewState, MatchaReviewTransactionEvent> implements HasSavedState {
    public static final String SAVED_STATE_TRANSFER_ID = "transferId";
    private final ExperimentsStore experimentsStore;
    private final MatchaApi matchaApi;
    private final MatchaIncentivesSummaryStore matchaIncentivesSummaryStore;
    private final MatchaPendingTransactionStore matchaPendingTransactionStore;
    private final MatchaTransferStore matchaTransferStore;
    private final RhyAccountStore rhyAccountStore;
    private final SavedStateHandle savedStateHandle;
    private final StripeStore stripeStore;
    private final SuvMigrationManager suvMigrationManager;
    private final TransferAccountStore transferAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MatchaReviewTransactionDuxo.kt */
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

    /* compiled from: MatchaReviewTransactionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo", m3645f = "MatchaReviewTransactionDuxo.kt", m3646l = {391}, m3647m = "addRadarSessionIdIfNecessary")
    /* renamed from: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$addRadarSessionIdIfNecessary$1 */
    static final class C214441 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C214441(Continuation<? super C214441> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MatchaReviewTransactionDuxo.this.addRadarSessionIdIfNecessary(null, this);
        }
    }

    /* compiled from: MatchaReviewTransactionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo", m3645f = "MatchaReviewTransactionDuxo.kt", m3646l = {330, EnumC7081g.SDK_ASSET_ICON_UPLOAD_VALUE, 343, 341}, m3647m = "createTransferOrAcceptRequest")
    /* renamed from: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$createTransferOrAcceptRequest$1 */
    static final class C214451 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C214451(Continuation<? super C214451> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MatchaReviewTransactionDuxo.this.createTransferOrAcceptRequest(null, null, null, null, this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchaReviewTransactionDuxo(MatchaApi matchaApi, MatchaPendingTransactionStore matchaPendingTransactionStore, MatchaTransferStore matchaTransferStore, RhyAccountStore rhyAccountStore, TransferAccountStore transferAccountStore, MatchaIncentivesSummaryStore matchaIncentivesSummaryStore, ExperimentsStore experimentsStore, StripeStore stripeStore, SuvMigrationManager suvMigrationManager, MatchaReviewTransactionStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(MatchaReviewTransactionDataState.INSTANCE.initial(savedStateHandle), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(matchaApi, "matchaApi");
        Intrinsics.checkNotNullParameter(matchaPendingTransactionStore, "matchaPendingTransactionStore");
        Intrinsics.checkNotNullParameter(matchaTransferStore, "matchaTransferStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(matchaIncentivesSummaryStore, "matchaIncentivesSummaryStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(stripeStore, "stripeStore");
        Intrinsics.checkNotNullParameter(suvMigrationManager, "suvMigrationManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.matchaApi = matchaApi;
        this.matchaPendingTransactionStore = matchaPendingTransactionStore;
        this.matchaTransferStore = matchaTransferStore;
        this.rhyAccountStore = rhyAccountStore;
        this.transferAccountStore = transferAccountStore;
        this.matchaIncentivesSummaryStore = matchaIncentivesSummaryStore;
        this.experimentsStore = experimentsStore;
        this.stripeStore = stripeStore;
        this.suvMigrationManager = suvMigrationManager;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C214481(null));
        this.matchaIncentivesSummaryStore.refresh(true);
        LifecycleHost.DefaultImpls.bind$default(this, this.matchaIncentivesSummaryStore.stream(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaReviewTransactionDuxo.onStart$lambda$0(this.f$0, (MatchaIncentivesSummary) obj);
            }
        });
        Observable observableDistinctUntilChanged = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{MatchaIncentivesExperiment.INSTANCE}, false, null, 6, null).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaReviewTransactionDuxo.onStart$lambda$1(this.f$0, (Boolean) obj);
            }
        });
    }

    /* compiled from: MatchaReviewTransactionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$onStart$1", m3645f = "MatchaReviewTransactionDuxo.kt", m3646l = {80}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$onStart$1 */
    static final class C214481 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C214481(Continuation<? super C214481> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MatchaReviewTransactionDuxo.this.new C214481(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C214481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MatchaReviewTransactionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "state", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$onStart$1$1", m3645f = "MatchaReviewTransactionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MatchaReviewTransactionViewState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MatchaReviewTransactionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MatchaReviewTransactionDuxo matchaReviewTransactionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = matchaReviewTransactionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MatchaReviewTransactionViewState matchaReviewTransactionViewState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(matchaReviewTransactionViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                MatchaReviewTransactionViewState matchaReviewTransactionViewState = (MatchaReviewTransactionViewState) this.L$0;
                if (matchaReviewTransactionViewState.getTransferId() != null) {
                    this.this$0.getSavedStateHandle().set("transferId", matchaReviewTransactionViewState.getTransferId());
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
                StateFlow<MatchaReviewTransactionViewState> stateFlow = MatchaReviewTransactionDuxo.this.getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MatchaReviewTransactionDuxo.this, null);
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
    public static final Unit onStart$lambda$0(MatchaReviewTransactionDuxo matchaReviewTransactionDuxo, MatchaIncentivesSummary incentivesSummary) {
        Intrinsics.checkNotNullParameter(incentivesSummary, "incentivesSummary");
        matchaReviewTransactionDuxo.applyMutation(new MatchaReviewTransactionDuxo2(incentivesSummary, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(MatchaReviewTransactionDuxo matchaReviewTransactionDuxo, Boolean bool) {
        matchaReviewTransactionDuxo.applyMutation(new MatchaReviewTransactionDuxo3(bool, null));
        return Unit.INSTANCE;
    }

    /* compiled from: MatchaReviewTransactionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$submit$1", m3645f = "MatchaReviewTransactionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$submit$1 */
    static final class C214531 extends ContinuationImpl7 implements Function2<MatchaReviewTransactionDataState, Continuation<? super MatchaReviewTransactionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: MatchaReviewTransactionDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$submit$1$WhenMappings */
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

        C214531(Continuation<? super C214531> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C214531 c214531 = MatchaReviewTransactionDuxo.this.new C214531(continuation);
            c214531.L$0 = obj;
            return c214531;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MatchaReviewTransactionDataState matchaReviewTransactionDataState, Continuation<? super MatchaReviewTransactionDataState> continuation) {
            return ((C214531) create(matchaReviewTransactionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Single singleOnErrorResumeNext;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final MatchaReviewTransactionDataState matchaReviewTransactionDataState = (MatchaReviewTransactionDataState) this.L$0;
            MatchaReviewTransactionDuxo matchaReviewTransactionDuxo = MatchaReviewTransactionDuxo.this;
            int i = WhenMappings.$EnumSwitchMapping$0[matchaReviewTransactionDataState.getDirection().ordinal()];
            if (i == 1) {
                MatchaReviewTransactionDuxo matchaReviewTransactionDuxo2 = MatchaReviewTransactionDuxo.this;
                final Single singleSendMatchaTransfer = matchaReviewTransactionDuxo2.sendMatchaTransfer(matchaReviewTransactionDuxo2.toApiIdentifier(matchaReviewTransactionDataState.getTransactor()), matchaReviewTransactionDataState.getSourceOfFunds(), matchaReviewTransactionDataState.getMemo(), matchaReviewTransactionDataState.getTransactor());
                singleOnErrorResumeNext = MatchaReviewTransactionDuxo.this.fetchSelectedTransferAccount(matchaReviewTransactionDataState).flatMap(new Function() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo.submit.1.1
                    @Override // io.reactivex.functions.Function
                    public final SingleSource<? extends MatchaReviewTransactionEvent.SubmitResult> apply(Optional<TransferAccount> selectedTransferAccount) {
                        Intrinsics.checkNotNullParameter(selectedTransferAccount, "selectedTransferAccount");
                        if (matchaReviewTransactionDataState.hasInsufficientFunds(selectedTransferAccount.getOrNull())) {
                            Single singleJust = Single.just(MatchaReviewTransactionEvent.SubmitResult.InsufficientFundsError.INSTANCE);
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
                MatchaReviewTransactionDuxo matchaReviewTransactionDuxo3 = MatchaReviewTransactionDuxo.this;
                singleOnErrorResumeNext = matchaReviewTransactionDuxo3.requestMatchaTransfer(matchaReviewTransactionDuxo3.toApiIdentifier(matchaReviewTransactionDataState.getTransactor()), matchaReviewTransactionDataState.getMemo());
            }
            Single singleMinTimeInFlight$default = SingleDelay2.minTimeInFlight$default(singleOnErrorResumeNext, 1000L, null, 2, null);
            final MatchaReviewTransactionDuxo matchaReviewTransactionDuxo4 = MatchaReviewTransactionDuxo.this;
            Single singleDoOnSuccess = singleMinTimeInFlight$default.doOnSuccess(new Consumer() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo.submit.1.2
                @Override // io.reactivex.functions.Consumer
                public final void accept(MatchaReviewTransactionEvent.SubmitResult submitResult) {
                    matchaReviewTransactionDuxo4.matchaPendingTransactionStore.refresh(true);
                    matchaReviewTransactionDuxo4.matchaTransferStore.refresh(true);
                    matchaReviewTransactionDuxo4.rhyAccountStore.refresh(true);
                    matchaReviewTransactionDuxo4.transferAccountStore.refresh(true);
                }
            });
            final MatchaReviewTransactionDuxo matchaReviewTransactionDuxo5 = MatchaReviewTransactionDuxo.this;
            Single singleDoOnSubscribe = singleDoOnSuccess.doOnSubscribe(new Consumer() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo.submit.1.3

                /* compiled from: MatchaReviewTransactionDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$submit$1$3$1", m3645f = "MatchaReviewTransactionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$submit$1$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MatchaReviewTransactionDataState, Continuation<? super MatchaReviewTransactionDataState>, Object> {
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
                    public final Object invoke(MatchaReviewTransactionDataState matchaReviewTransactionDataState, Continuation<? super MatchaReviewTransactionDataState> continuation) {
                        return ((AnonymousClass1) create(matchaReviewTransactionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return MatchaReviewTransactionDataState.copy$default((MatchaReviewTransactionDataState) this.L$0, null, null, null, null, null, true, null, null, null, null, false, 2015, null);
                    }
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Disposable disposable) {
                    matchaReviewTransactionDuxo5.applyMutation(new AnonymousClass1(null));
                }
            });
            Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
            ScopedSingle scopedSingleBind$default = LifecycleHost.DefaultImpls.bind$default(matchaReviewTransactionDuxo, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null);
            final MatchaReviewTransactionDuxo matchaReviewTransactionDuxo6 = MatchaReviewTransactionDuxo.this;
            Function1 function1 = new Function1() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$submit$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return MatchaReviewTransactionDuxo.C214531.invokeSuspend$lambda$0(matchaReviewTransactionDuxo6, (MatchaReviewTransactionEvent.SubmitResult) obj2);
                }
            };
            final MatchaReviewTransactionDuxo matchaReviewTransactionDuxo7 = MatchaReviewTransactionDuxo.this;
            scopedSingleBind$default.subscribeKotlin(function1, new Function1() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$submit$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return MatchaReviewTransactionDuxo.C214531.invokeSuspend$lambda$1(matchaReviewTransactionDuxo7, (Throwable) obj2);
                }
            });
            return matchaReviewTransactionDataState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(MatchaReviewTransactionDuxo matchaReviewTransactionDuxo, MatchaReviewTransactionEvent.SubmitResult submitResult) {
            Intrinsics.checkNotNull(submitResult);
            matchaReviewTransactionDuxo.submit(submitResult);
            if (submitResult.getClearLoading()) {
                matchaReviewTransactionDuxo.applyMutation(new MatchaReviewTransactionDuxo5(null));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(MatchaReviewTransactionDuxo matchaReviewTransactionDuxo, Throwable th) {
            matchaReviewTransactionDuxo.submit(new MatchaReviewTransactionEvent.SubmitResult.Error(th));
            matchaReviewTransactionDuxo.applyMutation(new MatchaReviewTransactionDuxo6(null));
            return Unit.INSTANCE;
        }
    }

    public final void submit() {
        applyMutation(new C214531(null));
    }

    public final void onMemoClick() {
        withDataState(new Function1() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaReviewTransactionDuxo.onMemoClick$lambda$2(this.f$0, (MatchaReviewTransactionDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMemoClick$lambda$2(MatchaReviewTransactionDuxo matchaReviewTransactionDuxo, MatchaReviewTransactionDataState it) {
        String username;
        Intrinsics.checkNotNullParameter(it, "it");
        String memo = it.getMemo();
        Transactor transactor = it.getTransactor();
        if (transactor instanceof Transactor.User) {
            username = ((Transactor.User) it.getTransactor()).getUser().getUsername();
        } else {
            if (!(transactor instanceof Transactor.Phone) && !(transactor instanceof Transactor.Email)) {
                throw new NoWhenBranchMatchedException();
            }
            username = null;
        }
        String str = username;
        matchaReviewTransactionDuxo.submit(new MatchaReviewTransactionEvent.AddMemo(new Args(it.getPrimaryText(), null, str, CollectionsKt.listOf(ProfileAvatars.getAvatar(it.getTransactor())), memo)));
        return Unit.INSTANCE;
    }

    /* compiled from: MatchaReviewTransactionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$updateMemo$1", m3645f = "MatchaReviewTransactionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$updateMemo$1 */
    static final class C214541 extends ContinuationImpl7 implements Function2<MatchaReviewTransactionDataState, Continuation<? super MatchaReviewTransactionDataState>, Object> {
        final /* synthetic */ String $memo;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C214541(String str, Continuation<? super C214541> continuation) {
            super(2, continuation);
            this.$memo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C214541 c214541 = new C214541(this.$memo, continuation);
            c214541.L$0 = obj;
            return c214541;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MatchaReviewTransactionDataState matchaReviewTransactionDataState, Continuation<? super MatchaReviewTransactionDataState> continuation) {
            return ((C214541) create(matchaReviewTransactionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return MatchaReviewTransactionDataState.copy$default((MatchaReviewTransactionDataState) this.L$0, null, null, null, null, this.$memo, false, null, null, null, null, false, 2031, null);
        }
    }

    public final void updateMemo(String memo) {
        applyMutation(new C214541(memo, null));
    }

    public final void showSourceOfFundsSelector() {
        withDataState(new Function1() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaReviewTransactionDuxo.showSourceOfFundsSelector$lambda$3(this.f$0, (MatchaReviewTransactionDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showSourceOfFundsSelector$lambda$3(MatchaReviewTransactionDuxo matchaReviewTransactionDuxo, MatchaReviewTransactionDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        matchaReviewTransactionDuxo.submit(new MatchaReviewTransactionEvent.ShowSourceOfFundsSelector(Optional3.asOptional(it.getSelectedTransferAccount())));
        return Unit.INSTANCE;
    }

    /* compiled from: MatchaReviewTransactionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$updateSelectedTransferAccount$1", m3645f = "MatchaReviewTransactionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$updateSelectedTransferAccount$1 */
    static final class C214551 extends ContinuationImpl7 implements Function2<MatchaReviewTransactionDataState, Continuation<? super MatchaReviewTransactionDataState>, Object> {
        final /* synthetic */ TransferAccount $account;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C214551(TransferAccount transferAccount, Continuation<? super C214551> continuation) {
            super(2, continuation);
            this.$account = transferAccount;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C214551 c214551 = new C214551(this.$account, continuation);
            c214551.L$0 = obj;
            return c214551;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MatchaReviewTransactionDataState matchaReviewTransactionDataState, Continuation<? super MatchaReviewTransactionDataState> continuation) {
            return ((C214551) create(matchaReviewTransactionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return MatchaReviewTransactionDataState.copy$default((MatchaReviewTransactionDataState) this.L$0, null, TransferAccounts3.toSourceOfFunds(this.$account), null, null, null, false, null, this.$account, null, null, false, 1917, null);
        }
    }

    public final void updateSelectedTransferAccount(TransferAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        applyMutation(new C214551(account, null));
    }

    public final void launchTransferActivity() {
        withDataState(new Function1() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaReviewTransactionDuxo.launchTransferActivity$lambda$4(this.f$0, (MatchaReviewTransactionDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchTransferActivity$lambda$4(MatchaReviewTransactionDuxo matchaReviewTransactionDuxo, MatchaReviewTransactionDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SourceOfFunds sourceOfFunds = it.getSourceOfFunds();
        matchaReviewTransactionDuxo.submit(new MatchaReviewTransactionEvent.LaunchTransferActivity(sourceOfFunds != null ? sourceOfFunds.getType() : null));
        return Unit.INSTANCE;
    }

    /* compiled from: MatchaReviewTransactionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$onVerificationResult$1", m3645f = "MatchaReviewTransactionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$onVerificationResult$1 */
    static final class C214491 extends ContinuationImpl7 implements Function2<MatchaReviewTransactionDataState, Continuation<? super MatchaReviewTransactionDataState>, Object> {
        final /* synthetic */ VerificationWorkflowResult $verificationResult;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MatchaReviewTransactionDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C214491(VerificationWorkflowResult verificationWorkflowResult, MatchaReviewTransactionDuxo matchaReviewTransactionDuxo, Continuation<? super C214491> continuation) {
            super(2, continuation);
            this.$verificationResult = verificationWorkflowResult;
            this.this$0 = matchaReviewTransactionDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C214491 c214491 = new C214491(this.$verificationResult, this.this$0, continuation);
            c214491.L$0 = obj;
            return c214491;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MatchaReviewTransactionDataState matchaReviewTransactionDataState, Continuation<? super MatchaReviewTransactionDataState> continuation) {
            return ((C214491) create(matchaReviewTransactionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final MatchaReviewTransactionDataState matchaReviewTransactionDataState = (MatchaReviewTransactionDataState) this.L$0;
            if (VerificationWorkflowResults.getShouldContinueTransferPostVerification(this.$verificationResult)) {
                MatchaReviewTransactionDuxo matchaReviewTransactionDuxo = this.this$0;
                MatchaTransferStore matchaTransferStore = matchaReviewTransactionDuxo.matchaTransferStore;
                UUID transferId = matchaReviewTransactionDataState.getTransferId();
                if (transferId == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Single<MatchaTransfer> singleContinueTransferPostVerification = matchaTransferStore.continueTransferPostVerification(transferId);
                final MatchaReviewTransactionDuxo matchaReviewTransactionDuxo2 = this.this$0;
                Single<MatchaTransfer> singleDoOnSubscribe = singleContinueTransferPostVerification.doOnSubscribe(new Consumer() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo.onVerificationResult.1.1

                    /* compiled from: MatchaReviewTransactionDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$onVerificationResult$1$1$1", m3645f = "MatchaReviewTransactionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$onVerificationResult$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C502731 extends ContinuationImpl7 implements Function2<MatchaReviewTransactionDataState, Continuation<? super MatchaReviewTransactionDataState>, Object> {
                        private /* synthetic */ Object L$0;
                        int label;

                        C502731(Continuation<? super C502731> continuation) {
                            super(2, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C502731 c502731 = new C502731(continuation);
                            c502731.L$0 = obj;
                            return c502731;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(MatchaReviewTransactionDataState matchaReviewTransactionDataState, Continuation<? super MatchaReviewTransactionDataState> continuation) {
                            return ((C502731) create(matchaReviewTransactionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return MatchaReviewTransactionDataState.copy$default((MatchaReviewTransactionDataState) this.L$0, null, null, null, null, null, true, null, null, null, null, false, 2015, null);
                        }
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Disposable disposable) {
                        matchaReviewTransactionDuxo2.applyMutation(new C502731(null));
                    }
                });
                Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
                ScopedSingle scopedSingleBind$default = LifecycleHost.DefaultImpls.bind$default(matchaReviewTransactionDuxo, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null);
                final MatchaReviewTransactionDuxo matchaReviewTransactionDuxo3 = this.this$0;
                final VerificationWorkflowResult verificationWorkflowResult = this.$verificationResult;
                Function1 function1 = new Function1() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$onVerificationResult$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return MatchaReviewTransactionDuxo.C214491.invokeSuspend$lambda$0(matchaReviewTransactionDuxo3, verificationWorkflowResult, matchaReviewTransactionDataState, (MatchaTransfer) obj2);
                    }
                };
                final VerificationWorkflowResult verificationWorkflowResult2 = this.$verificationResult;
                final MatchaReviewTransactionDuxo matchaReviewTransactionDuxo4 = this.this$0;
                scopedSingleBind$default.subscribeKotlin(function1, new Function1() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$onVerificationResult$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return MatchaReviewTransactionDuxo.C214491.invokeSuspend$lambda$1(verificationWorkflowResult2, matchaReviewTransactionDuxo4, (Throwable) obj2);
                    }
                });
                return matchaReviewTransactionDataState;
            }
            this.this$0.submit(MatchaReviewTransactionEvent.SubmitResult.VerificationComplete.Canceled.INSTANCE);
            return MatchaReviewTransactionDataState.copy$default(matchaReviewTransactionDataState, null, null, null, null, null, false, null, null, null, null, false, 2015, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(MatchaReviewTransactionDuxo matchaReviewTransactionDuxo, VerificationWorkflowResult verificationWorkflowResult, MatchaReviewTransactionDataState matchaReviewTransactionDataState, MatchaTransfer matchaTransfer) {
            MatchaReviewTransactionEvent approved;
            if (verificationWorkflowResult == VerificationWorkflowResult.APPROVED) {
                Intrinsics.checkNotNull(matchaTransfer);
                approved = new MatchaReviewTransactionEvent.SubmitResult.VerificationComplete.Approved(verificationWorkflowResult, matchaReviewTransactionDuxo.createConfirmationType(matchaTransfer, matchaReviewTransactionDataState.getTransactor()));
            } else {
                approved = MatchaReviewTransactionEvent.SubmitResult.VerificationComplete.NotApproved.INSTANCE;
            }
            matchaReviewTransactionDuxo.submit(approved);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(VerificationWorkflowResult verificationWorkflowResult, MatchaReviewTransactionDuxo matchaReviewTransactionDuxo, Throwable th) {
            if (verificationWorkflowResult == VerificationWorkflowResult.APPROVED) {
                matchaReviewTransactionDuxo.submit(new MatchaReviewTransactionEvent.SubmitResult.Error(th));
                matchaReviewTransactionDuxo.applyMutation(new MatchaReviewTransactionDuxo4(null));
            } else {
                matchaReviewTransactionDuxo.submit(MatchaReviewTransactionEvent.SubmitResult.VerificationComplete.NotApproved.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    public final void onVerificationResult(VerificationWorkflowResult verificationResult) {
        applyMutation(new C214491(verificationResult, this, null));
    }

    /* compiled from: MatchaReviewTransactionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionEvent$SubmitResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$sendMatchaTransfer$1", m3645f = "MatchaReviewTransactionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE, EnumC7081g.f2777x89a9e432}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$sendMatchaTransfer$1 */
    static final class C214521 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super MatchaReviewTransactionEvent.SubmitResult>, Object> {
        final /* synthetic */ Transactor $localTransactor;
        final /* synthetic */ String $memo;
        final /* synthetic */ ApiMatchaIdentifier $receiverIdentifier;
        final /* synthetic */ SourceOfFunds $sourceOfFunds;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C214521(ApiMatchaIdentifier apiMatchaIdentifier, SourceOfFunds sourceOfFunds, String str, Transactor transactor, Continuation<? super C214521> continuation) {
            super(2, continuation);
            this.$receiverIdentifier = apiMatchaIdentifier;
            this.$sourceOfFunds = sourceOfFunds;
            this.$memo = str;
            this.$localTransactor = transactor;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MatchaReviewTransactionDuxo.this.new C214521(this.$receiverIdentifier, this.$sourceOfFunds, this.$memo, this.$localTransactor, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MatchaReviewTransactionEvent.SubmitResult> continuation) {
            return ((C214521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C214521 c214521;
            UUID uuid;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UUID requestId = ((MatchaReviewTransactionFragment.Args) MatchaReviewTransactionDuxo.INSTANCE.getArgs((HasSavedState) MatchaReviewTransactionDuxo.this)).getRequestId();
                MatchaReviewTransactionDuxo matchaReviewTransactionDuxo = MatchaReviewTransactionDuxo.this;
                ApiMatchaIdentifier apiMatchaIdentifier = this.$receiverIdentifier;
                SourceOfFunds sourceOfFunds = this.$sourceOfFunds;
                String str = this.$memo;
                this.label = 1;
                c214521 = this;
                obj = matchaReviewTransactionDuxo.createTransferOrAcceptRequest(apiMatchaIdentifier, sourceOfFunds, requestId, str, c214521);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uuid = (UUID) this.L$0;
                ResultKt.throwOnFailure(obj);
                return new MatchaReviewTransactionEvent.SubmitResult.VerificationRequired(uuid, ((Boolean) obj).booleanValue());
            }
            ResultKt.throwOnFailure(obj);
            c214521 = this;
            ApiMatchaTransfer apiMatchaTransfer = (ApiMatchaTransfer) obj;
            MatchaReviewTransactionDuxo.this.applyMutation(new AnonymousClass1(apiMatchaTransfer, null));
            MatchaTransfer dbModel = MatchaTransfer2.toDbModel(apiMatchaTransfer);
            UUID verification_workflow_id = apiMatchaTransfer.getVerification_workflow_id();
            if (verification_workflow_id != null) {
                SuvMigrationManager suvMigrationManager = MatchaReviewTransactionDuxo.this.suvMigrationManager;
                c214521.L$0 = verification_workflow_id;
                c214521.label = 2;
                Object objIsMigrated = suvMigrationManager.isMigrated(verification_workflow_id, this);
                if (objIsMigrated != coroutine_suspended) {
                    uuid = verification_workflow_id;
                    obj = objIsMigrated;
                    return new MatchaReviewTransactionEvent.SubmitResult.VerificationRequired(uuid, ((Boolean) obj).booleanValue());
                }
                return coroutine_suspended;
            }
            return new MatchaReviewTransactionEvent.SubmitResult.Success(MatchaReviewTransactionDuxo.this.createConfirmationType(dbModel, c214521.$localTransactor));
        }

        /* compiled from: MatchaReviewTransactionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$sendMatchaTransfer$1$1", m3645f = "MatchaReviewTransactionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$sendMatchaTransfer$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MatchaReviewTransactionDataState, Continuation<? super MatchaReviewTransactionDataState>, Object> {
            final /* synthetic */ ApiMatchaTransfer $response;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiMatchaTransfer apiMatchaTransfer, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$response = apiMatchaTransfer;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$response, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MatchaReviewTransactionDataState matchaReviewTransactionDataState, Continuation<? super MatchaReviewTransactionDataState> continuation) {
                return ((AnonymousClass1) create(matchaReviewTransactionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MatchaReviewTransactionDataState.copy$default((MatchaReviewTransactionDataState) this.L$0, null, null, null, null, null, false, this.$response.getId(), null, null, null, false, 1983, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single<MatchaReviewTransactionEvent.SubmitResult> sendMatchaTransfer(ApiMatchaIdentifier receiverIdentifier, SourceOfFunds sourceOfFunds, String memo, Transactor localTransactor) {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C214521(receiverIdentifier, sourceOfFunds, memo, localTransactor, null), 1, null);
    }

    /* compiled from: MatchaReviewTransactionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/matcha/api/ApiMatchaRequest;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$requestMatchaTransfer$1", m3645f = "MatchaReviewTransactionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_LOADING_INDICATOR_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo$requestMatchaTransfer$1 */
    static final class C214501 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiMatchaRequest>, Object> {
        final /* synthetic */ String $memo;
        final /* synthetic */ ApiMatchaIdentifier $senderIdentifier;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C214501(ApiMatchaIdentifier apiMatchaIdentifier, String str, Continuation<? super C214501> continuation) {
            super(2, continuation);
            this.$senderIdentifier = apiMatchaIdentifier;
            this.$memo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MatchaReviewTransactionDuxo.this.new C214501(this.$senderIdentifier, this.$memo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiMatchaRequest> continuation) {
            return ((C214501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            MatchaApi matchaApi = MatchaReviewTransactionDuxo.this.matchaApi;
            String string2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            ApiMatchaRequestRequest apiMatchaRequestRequest = new ApiMatchaRequestRequest(string2, new ApiMatchaTransferUser(this.$senderIdentifier, null, 2, null), new ApiMatchaRequestPayload(((MatchaReviewTransactionFragment.Args) MatchaReviewTransactionDuxo.INSTANCE.getArgs((HasSavedState) MatchaReviewTransactionDuxo.this)).getAmount().getDecimalValue(), this.$memo));
            this.label = 1;
            Object objCreateRequest = matchaApi.createRequest(apiMatchaRequestRequest, this);
            return objCreateRequest == coroutine_suspended ? coroutine_suspended : objCreateRequest;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single<MatchaReviewTransactionEvent.SubmitResult> requestMatchaTransfer(ApiMatchaIdentifier senderIdentifier, String memo) {
        Single<MatchaReviewTransactionEvent.SubmitResult> map = RxFactory.DefaultImpls.rxSingle$default(this, null, new C214501(senderIdentifier, memo, null), 1, null).map(new Function() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo.requestMatchaTransfer.2
            @Override // io.reactivex.functions.Function
            public final MatchaReviewTransactionEvent.SubmitResult apply(ApiMatchaRequest it) {
                Intrinsics.checkNotNullParameter(it, "it");
                MatchaRequest dbModel = MatchaRequest2.toDbModel(it);
                return new MatchaReviewTransactionEvent.SubmitResult.Success(new ConfirmationType.RequestSent(Money3.toMoney(dbModel.getAmount(), Currencies.USD), dbModel.getTransactor().getDisplayName(), dbModel.getId()));
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d4, code lost:
    
        if (r14 == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e5, code lost:
    
        if (r14 != r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createTransferOrAcceptRequest(ApiMatchaIdentifier apiMatchaIdentifier, SourceOfFunds sourceOfFunds, UUID uuid, String str, Continuation<? super ApiMatchaTransfer> continuation) {
        C214451 c214451;
        MatchaPendingTransactionStore matchaPendingTransactionStore;
        SourceOfFunds sourceOfFunds2;
        MatchaApi matchaApi;
        UUID uuid2;
        SourceOfFunds sourceOfFunds3;
        ApiMatchaIdentifier apiMatchaIdentifier2;
        MatchaApi matchaApi2;
        if (continuation instanceof C214451) {
            c214451 = (C214451) continuation;
            int i = c214451.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c214451.label = i - Integer.MIN_VALUE;
            } else {
                c214451 = new C214451(continuation);
            }
        }
        Object objAddRadarSessionIdIfNecessary = c214451.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c214451.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAddRadarSessionIdIfNecessary);
            if (uuid == null) {
                matchaApi = this.matchaApi;
                UUID uuidRandomUUID = UUID.randomUUID();
                Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
                if (sourceOfFunds == null) {
                    uuid2 = uuidRandomUUID;
                    sourceOfFunds3 = null;
                    ApiMatchaSendRequest apiMatchaSendRequest = new ApiMatchaSendRequest(uuid2, new ApiMatchaTransferUser(apiMatchaIdentifier, null, 2, null), new ApiMatchaTransferPayload(((MatchaReviewTransactionFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAmount().getDecimalValue(), str), sourceOfFunds3);
                    c214451.L$0 = null;
                    c214451.L$1 = null;
                    c214451.L$2 = null;
                    c214451.L$3 = null;
                    c214451.label = 2;
                    Object objCreateTransfer = matchaApi.createTransfer(apiMatchaSendRequest, c214451);
                    if (objCreateTransfer == coroutine_suspended) {
                    }
                } else {
                    c214451.L$0 = apiMatchaIdentifier;
                    c214451.L$1 = str;
                    c214451.L$2 = uuidRandomUUID;
                    c214451.L$3 = matchaApi;
                    c214451.label = 1;
                    Object objAddRadarSessionIdIfNecessary2 = addRadarSessionIdIfNecessary(sourceOfFunds, c214451);
                    if (objAddRadarSessionIdIfNecessary2 != coroutine_suspended) {
                        apiMatchaIdentifier2 = apiMatchaIdentifier;
                        matchaApi2 = matchaApi;
                        objAddRadarSessionIdIfNecessary = objAddRadarSessionIdIfNecessary2;
                        uuid2 = uuidRandomUUID;
                        sourceOfFunds3 = (SourceOfFunds) objAddRadarSessionIdIfNecessary;
                        ApiMatchaIdentifier apiMatchaIdentifier3 = apiMatchaIdentifier2;
                        matchaApi = matchaApi2;
                        apiMatchaIdentifier = apiMatchaIdentifier3;
                        ApiMatchaSendRequest apiMatchaSendRequest2 = new ApiMatchaSendRequest(uuid2, new ApiMatchaTransferUser(apiMatchaIdentifier, null, 2, null), new ApiMatchaTransferPayload(((MatchaReviewTransactionFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAmount().getDecimalValue(), str), sourceOfFunds3);
                        c214451.L$0 = null;
                        c214451.L$1 = null;
                        c214451.L$2 = null;
                        c214451.L$3 = null;
                        c214451.label = 2;
                        Object objCreateTransfer2 = matchaApi.createTransfer(apiMatchaSendRequest2, c214451);
                        if (objCreateTransfer2 == coroutine_suspended) {
                        }
                    }
                }
            } else {
                matchaPendingTransactionStore = this.matchaPendingTransactionStore;
                if (sourceOfFunds == null) {
                    sourceOfFunds2 = null;
                    c214451.L$0 = null;
                    c214451.L$1 = null;
                    c214451.label = 4;
                    objAddRadarSessionIdIfNecessary = matchaPendingTransactionStore.acceptRequest(uuid, sourceOfFunds2, c214451);
                } else {
                    c214451.L$0 = matchaPendingTransactionStore;
                    c214451.L$1 = uuid;
                    c214451.label = 3;
                    objAddRadarSessionIdIfNecessary = addRadarSessionIdIfNecessary(sourceOfFunds, c214451);
                }
            }
        }
        if (i2 == 1) {
            matchaApi2 = (MatchaApi) c214451.L$3;
            uuid2 = (UUID) c214451.L$2;
            str = (String) c214451.L$1;
            apiMatchaIdentifier2 = (ApiMatchaIdentifier) c214451.L$0;
            ResultKt.throwOnFailure(objAddRadarSessionIdIfNecessary);
            sourceOfFunds3 = (SourceOfFunds) objAddRadarSessionIdIfNecessary;
            ApiMatchaIdentifier apiMatchaIdentifier32 = apiMatchaIdentifier2;
            matchaApi = matchaApi2;
            apiMatchaIdentifier = apiMatchaIdentifier32;
            ApiMatchaSendRequest apiMatchaSendRequest22 = new ApiMatchaSendRequest(uuid2, new ApiMatchaTransferUser(apiMatchaIdentifier, null, 2, null), new ApiMatchaTransferPayload(((MatchaReviewTransactionFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAmount().getDecimalValue(), str), sourceOfFunds3);
            c214451.L$0 = null;
            c214451.L$1 = null;
            c214451.L$2 = null;
            c214451.L$3 = null;
            c214451.label = 2;
            Object objCreateTransfer22 = matchaApi.createTransfer(apiMatchaSendRequest22, c214451);
            return objCreateTransfer22 == coroutine_suspended ? coroutine_suspended : objCreateTransfer22;
        }
        if (i2 == 2) {
            ResultKt.throwOnFailure(objAddRadarSessionIdIfNecessary);
            return objAddRadarSessionIdIfNecessary;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAddRadarSessionIdIfNecessary);
            return ((ApiRequestAcceptResponse) objAddRadarSessionIdIfNecessary).getTransfer();
        }
        uuid = (UUID) c214451.L$1;
        matchaPendingTransactionStore = (MatchaPendingTransactionStore) c214451.L$0;
        ResultKt.throwOnFailure(objAddRadarSessionIdIfNecessary);
        sourceOfFunds2 = (SourceOfFunds) objAddRadarSessionIdIfNecessary;
        c214451.L$0 = null;
        c214451.L$1 = null;
        c214451.label = 4;
        objAddRadarSessionIdIfNecessary = matchaPendingTransactionStore.acceptRequest(uuid, sourceOfFunds2, c214451);
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
    public final ConfirmationType createConfirmationType(MatchaTransfer matchaTransfer, Transactor transactor) {
        Money money = Money3.toMoney(matchaTransfer.getAmount(), Currencies.USD);
        if (matchaTransfer.getState() == MatchaTransferState.PROCESSING) {
            return new ConfirmationType.PaymentProcessing(money, transactor.getDisplayName(), matchaTransfer.getId());
        }
        if (matchaTransfer.getExpirationDate() != null) {
            Instant expirationDate = matchaTransfer.getExpirationDate();
            Intrinsics.checkNotNull(expirationDate);
            return new ConfirmationType.PaymentPending(matchaTransfer.getTransactor().getIdentifier().getType(), expirationDate, money, transactor.getDisplayName(), matchaTransfer.getId());
        }
        return new ConfirmationType.PaymentComplete(money, transactor.getDisplayName(), matchaTransfer.getId(), false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object addRadarSessionIdIfNecessary(SourceOfFunds sourceOfFunds, Continuation<? super SourceOfFunds> continuation) {
        C214441 c214441;
        StripeException stripeException;
        SourceOfFunds sourceOfFunds2;
        String str;
        if (continuation instanceof C214441) {
            c214441 = (C214441) continuation;
            int i = c214441.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c214441.label = i - Integer.MIN_VALUE;
            } else {
                c214441 = new C214441(continuation);
            }
        }
        Object radarSessionId = c214441.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c214441.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(radarSessionId);
            if (WhenMappings.$EnumSwitchMapping$0[sourceOfFunds.getType().ordinal()] != 1) {
                return sourceOfFunds;
            }
            try {
                StripeStore stripeStore = this.stripeStore;
                ApiTransferAccount.TransferAccountType transferAccountType = ApiTransferAccount.TransferAccountType.RHY;
                c214441.L$0 = sourceOfFunds;
                c214441.L$1 = sourceOfFunds;
                c214441.label = 1;
                radarSessionId = stripeStore.getRadarSessionId(transferAccountType, c214441);
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
            sourceOfFunds = (SourceOfFunds) c214441.L$1;
            sourceOfFunds2 = (SourceOfFunds) c214441.L$0;
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
    public final Single<Optional<TransferAccount>> fetchSelectedTransferAccount(final MatchaReviewTransactionDataState matchaReviewTransactionDataState) {
        Single<List<TransferAccount>> singleFirstOrError = this.transferAccountStore.fetchIfStaleThenStream().firstOrError();
        if (matchaReviewTransactionDataState.getSelectedTransferAccount() != null) {
            Single<Optional<TransferAccount>> singleJust = Single.just(Optional3.asOptional(matchaReviewTransactionDataState.getSelectedTransferAccount()));
            Intrinsics.checkNotNullExpressionValue(singleJust, "just(...)");
            return singleJust;
        }
        if (matchaReviewTransactionDataState.getSourceOfFunds() != null) {
            Single map = singleFirstOrError.map(new Function() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo.fetchSelectedTransferAccount.1
                @Override // io.reactivex.functions.Function
                public final Optional<TransferAccount> apply(List<TransferAccount> accounts2) {
                    Object next;
                    Intrinsics.checkNotNullParameter(accounts2, "accounts");
                    MatchaReviewTransactionDataState matchaReviewTransactionDataState2 = matchaReviewTransactionDataState;
                    Iterator<T> it = accounts2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.areEqual(((TransferAccount) next).getId(), matchaReviewTransactionDataState2.getSourceOfFunds().getValue())) {
                            break;
                        }
                    }
                    return Optional3.asOptional(next);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            return map;
        }
        Single map2 = singleFirstOrError.map(new Function() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionDuxo.fetchSelectedTransferAccount.2
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

    /* compiled from: MatchaReviewTransactionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionDuxo;", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionFragment$Args;", "<init>", "()V", "SAVED_STATE_TRANSFER_ID", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MatchaReviewTransactionDuxo, MatchaReviewTransactionFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MatchaReviewTransactionFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (MatchaReviewTransactionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MatchaReviewTransactionFragment.Args getArgs(MatchaReviewTransactionDuxo matchaReviewTransactionDuxo) {
            return (MatchaReviewTransactionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, matchaReviewTransactionDuxo);
        }
    }
}
