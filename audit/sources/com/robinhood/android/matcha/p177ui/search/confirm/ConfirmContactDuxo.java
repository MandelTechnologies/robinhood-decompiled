package com.robinhood.android.matcha.p177ui.search.confirm;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.stepupverification.SuvMigrationManager;
import com.robinhood.android.matcha.models.p176ui.Transactor;
import com.robinhood.android.matcha.p177ui.common.VerificationWorkflowResults;
import com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType;
import com.robinhood.android.matcha.p177ui.models.Direction;
import com.robinhood.android.matcha.p177ui.search.confirm.ConfirmContactDuxo;
import com.robinhood.android.matcha.p177ui.search.confirm.ConfirmContactEvent;
import com.robinhood.android.matcha.p177ui.search.confirm.ConfirmContactFragment;
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
import com.robinhood.android.models.matcha.api.MatchaTransferState;
import com.robinhood.android.models.matcha.api.SourceOfFunds;
import com.robinhood.android.models.stepupverification.VerificationWorkflowResult;
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
import com.robinhood.disposer.ScopedSingle;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p320db.matcha.MatchaRequest;
import com.robinhood.models.p320db.matcha.MatchaRequest2;
import com.robinhood.models.p320db.matcha.MatchaTransfer;
import com.robinhood.models.p320db.matcha.MatchaTransfer2;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.p370rx.delay.SingleDelay2;
import com.robinhood.store.stripe.StripeStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.money.Currencies;
import com.stripe.android.core.exception.StripeException;
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
import p479j$.time.Instant;

/* compiled from: ConfirmContactDuxo.kt */
@Metadata(m3635d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 :2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001:BY\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\"J(\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+H\u0002J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010-\u001a\u00020'H\u0002J \u0010.\u001a\u00020/2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0082@¢\u0006\u0002\u00100J\f\u00101\u001a\u00020'*\u00020+H\u0002J\u0014\u00102\u001a\u000203*\u0002042\u0006\u0010*\u001a\u00020+H\u0002J\u0012\u00105\u001a\u00020)*\u00020)H\u0082@¢\u0006\u0002\u00106J\u0018\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000209080$*\u00020\u0002H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactDataState;", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactViewState;", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "matchaApi", "Lcom/robinhood/api/matcha/MatchaApi;", "matchaPendingTransactionStore", "Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore;", "matchaTransferStore", "Lcom/robinhood/android/store/matcha/MatchaTransferStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "stripeStore", "Lcom/robinhood/store/stripe/StripeStore;", "suvMigrationManager", "Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;", "stateProvider", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/api/matcha/MatchaApi;Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore;Lcom/robinhood/android/store/matcha/MatchaTransferStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;Lcom/robinhood/store/stripe/StripeStore;Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "submit", "", "onVerificationResult", "verificationResult", "Lcom/robinhood/android/models/stepupverification/VerificationWorkflowResult;", "sendMatchaTransfer", "Lio/reactivex/Single;", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent$SubmitResult;", "receiverIdentifier", "Lcom/robinhood/android/models/matcha/api/ApiMatchaIdentifier;", "sourceOfFunds", "Lcom/robinhood/android/models/matcha/api/SourceOfFunds;", "localTransactor", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "requestMatchaTransfer", "senderIdentifier", "createTransfer", "Lcom/robinhood/android/models/matcha/api/ApiMatchaTransfer;", "(Lcom/robinhood/android/models/matcha/api/ApiMatchaIdentifier;Lcom/robinhood/android/models/matcha/api/SourceOfFunds;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toApiIdentifier", "createConfirmationType", "Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType;", "Lcom/robinhood/models/db/matcha/MatchaTransfer;", "addRadarSessionIdIfNecessary", "(Lcom/robinhood/android/models/matcha/api/SourceOfFunds;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchSelectedTransferAccount", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class ConfirmContactDuxo extends BaseDuxo3<ConfirmContactDataState, ConfirmContactViewState, ConfirmContactEvent> implements HasSavedState {
    private final MatchaApi matchaApi;
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

    /* compiled from: ConfirmContactDuxo.kt */
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

    /* compiled from: ConfirmContactDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo", m3645f = "ConfirmContactDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE}, m3647m = "addRadarSessionIdIfNecessary")
    /* renamed from: com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo$addRadarSessionIdIfNecessary$1 */
    static final class C215251 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C215251(Continuation<? super C215251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfirmContactDuxo.this.addRadarSessionIdIfNecessary(null, this);
        }
    }

    /* compiled from: ConfirmContactDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo", m3645f = "ConfirmContactDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE}, m3647m = "createTransfer")
    /* renamed from: com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo$createTransfer$1 */
    static final class C215261 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C215261(Continuation<? super C215261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfirmContactDuxo.this.createTransfer(null, null, this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmContactDuxo(MatchaApi matchaApi, MatchaPendingTransactionStore matchaPendingTransactionStore, MatchaTransferStore matchaTransferStore, RhyAccountStore rhyAccountStore, TransferAccountStore transferAccountStore, StripeStore stripeStore, SuvMigrationManager suvMigrationManager, ConfirmContactStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(ConfirmContactDataState.INSTANCE.initial(savedStateHandle), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(matchaApi, "matchaApi");
        Intrinsics.checkNotNullParameter(matchaPendingTransactionStore, "matchaPendingTransactionStore");
        Intrinsics.checkNotNullParameter(matchaTransferStore, "matchaTransferStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
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
        this.stripeStore = stripeStore;
        this.suvMigrationManager = suvMigrationManager;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: ConfirmContactDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo$submit$1", m3645f = "ConfirmContactDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo$submit$1 */
    static final class C215331 extends ContinuationImpl7 implements Function2<ConfirmContactDataState, Continuation<? super ConfirmContactDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: ConfirmContactDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo$submit$1$WhenMappings */
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

        C215331(Continuation<? super C215331> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C215331 c215331 = ConfirmContactDuxo.this.new C215331(continuation);
            c215331.L$0 = obj;
            return c215331;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ConfirmContactDataState confirmContactDataState, Continuation<? super ConfirmContactDataState> continuation) {
            return ((C215331) create(confirmContactDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Single singleOnErrorResumeNext;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final ConfirmContactDataState confirmContactDataState = (ConfirmContactDataState) this.L$0;
            ConfirmContactDuxo confirmContactDuxo = ConfirmContactDuxo.this;
            int i = WhenMappings.$EnumSwitchMapping$0[confirmContactDataState.getDirection().ordinal()];
            if (i == 1) {
                ConfirmContactDuxo confirmContactDuxo2 = ConfirmContactDuxo.this;
                final Single singleSendMatchaTransfer = confirmContactDuxo2.sendMatchaTransfer(confirmContactDuxo2.toApiIdentifier(confirmContactDataState.getTransactor()), confirmContactDataState.getSourceOfFunds(), confirmContactDataState.getTransactor());
                singleOnErrorResumeNext = ConfirmContactDuxo.this.fetchSelectedTransferAccount(confirmContactDataState).flatMap(new Function() { // from class: com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo.submit.1.1
                    @Override // io.reactivex.functions.Function
                    public final SingleSource<? extends ConfirmContactEvent.SubmitResult> apply(Optional<TransferAccount> selectedTransferAccount) {
                        Intrinsics.checkNotNullParameter(selectedTransferAccount, "selectedTransferAccount");
                        if (confirmContactDataState.hasInsufficientFunds(selectedTransferAccount.getOrNull())) {
                            Single singleJust = Single.just(ConfirmContactEvent.SubmitResult.InsufficientFundsError.INSTANCE);
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
                ConfirmContactDuxo confirmContactDuxo3 = ConfirmContactDuxo.this;
                singleOnErrorResumeNext = confirmContactDuxo3.requestMatchaTransfer(confirmContactDuxo3.toApiIdentifier(confirmContactDataState.getTransactor()));
            }
            Single singleMinTimeInFlight$default = SingleDelay2.minTimeInFlight$default(singleOnErrorResumeNext, 1000L, null, 2, null);
            final ConfirmContactDuxo confirmContactDuxo4 = ConfirmContactDuxo.this;
            Single singleDoOnSuccess = singleMinTimeInFlight$default.doOnSuccess(new Consumer() { // from class: com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo.submit.1.2
                @Override // io.reactivex.functions.Consumer
                public final void accept(ConfirmContactEvent.SubmitResult submitResult) {
                    confirmContactDuxo4.matchaPendingTransactionStore.refresh(true);
                    confirmContactDuxo4.matchaTransferStore.refresh(true);
                    confirmContactDuxo4.rhyAccountStore.refresh(true);
                    confirmContactDuxo4.transferAccountStore.refresh(true);
                }
            });
            final ConfirmContactDuxo confirmContactDuxo5 = ConfirmContactDuxo.this;
            Single singleDoOnSubscribe = singleDoOnSuccess.doOnSubscribe(new Consumer() { // from class: com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo.submit.1.3

                /* compiled from: ConfirmContactDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo$submit$1$3$1", m3645f = "ConfirmContactDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo$submit$1$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ConfirmContactDataState, Continuation<? super ConfirmContactDataState>, Object> {
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
                    public final Object invoke(ConfirmContactDataState confirmContactDataState, Continuation<? super ConfirmContactDataState> continuation) {
                        return ((AnonymousClass1) create(confirmContactDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ConfirmContactDataState.copy$default((ConfirmContactDataState) this.L$0, null, null, null, null, true, null, null, null, 239, null);
                    }
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Disposable disposable) {
                    confirmContactDuxo5.applyMutation(new AnonymousClass1(null));
                }
            });
            Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
            ScopedSingle scopedSingleBind$default = LifecycleHost.DefaultImpls.bind$default(confirmContactDuxo, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null);
            final ConfirmContactDuxo confirmContactDuxo6 = ConfirmContactDuxo.this;
            Function1 function1 = new Function1() { // from class: com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo$submit$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ConfirmContactDuxo.C215331.invokeSuspend$lambda$0(confirmContactDuxo6, (ConfirmContactEvent.SubmitResult) obj2);
                }
            };
            final ConfirmContactDuxo confirmContactDuxo7 = ConfirmContactDuxo.this;
            scopedSingleBind$default.subscribeKotlin(function1, new Function1() { // from class: com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo$submit$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ConfirmContactDuxo.C215331.invokeSuspend$lambda$1(confirmContactDuxo7, (Throwable) obj2);
                }
            });
            return confirmContactDataState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(ConfirmContactDuxo confirmContactDuxo, ConfirmContactEvent.SubmitResult submitResult) {
            Intrinsics.checkNotNull(submitResult);
            confirmContactDuxo.submit(submitResult);
            if (submitResult.getClearLoading()) {
                confirmContactDuxo.applyMutation(new ConfirmContactDuxo3(null));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(ConfirmContactDuxo confirmContactDuxo, Throwable th) {
            confirmContactDuxo.submit(new ConfirmContactEvent.SubmitResult.Error(th));
            confirmContactDuxo.applyMutation(new ConfirmContactDuxo4(null));
            return Unit.INSTANCE;
        }
    }

    public final void submit() {
        applyMutation(new C215331(null));
    }

    /* compiled from: ConfirmContactDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo$onVerificationResult$1", m3645f = "ConfirmContactDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo$onVerificationResult$1 */
    static final class C215291 extends ContinuationImpl7 implements Function2<ConfirmContactDataState, Continuation<? super ConfirmContactDataState>, Object> {
        final /* synthetic */ VerificationWorkflowResult $verificationResult;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ConfirmContactDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C215291(VerificationWorkflowResult verificationWorkflowResult, ConfirmContactDuxo confirmContactDuxo, Continuation<? super C215291> continuation) {
            super(2, continuation);
            this.$verificationResult = verificationWorkflowResult;
            this.this$0 = confirmContactDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C215291 c215291 = new C215291(this.$verificationResult, this.this$0, continuation);
            c215291.L$0 = obj;
            return c215291;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ConfirmContactDataState confirmContactDataState, Continuation<? super ConfirmContactDataState> continuation) {
            return ((C215291) create(confirmContactDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final ConfirmContactDataState confirmContactDataState = (ConfirmContactDataState) this.L$0;
            if (VerificationWorkflowResults.getShouldContinueTransferPostVerification(this.$verificationResult)) {
                ConfirmContactDuxo confirmContactDuxo = this.this$0;
                MatchaTransferStore matchaTransferStore = confirmContactDuxo.matchaTransferStore;
                UUID transferId = confirmContactDataState.getTransferId();
                if (transferId == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Single<MatchaTransfer> singleContinueTransferPostVerification = matchaTransferStore.continueTransferPostVerification(transferId);
                final ConfirmContactDuxo confirmContactDuxo2 = this.this$0;
                Single<MatchaTransfer> singleDoOnSubscribe = singleContinueTransferPostVerification.doOnSubscribe(new Consumer() { // from class: com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo.onVerificationResult.1.1

                    /* compiled from: ConfirmContactDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo$onVerificationResult$1$1$1", m3645f = "ConfirmContactDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo$onVerificationResult$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C502751 extends ContinuationImpl7 implements Function2<ConfirmContactDataState, Continuation<? super ConfirmContactDataState>, Object> {
                        private /* synthetic */ Object L$0;
                        int label;

                        C502751(Continuation<? super C502751> continuation) {
                            super(2, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C502751 c502751 = new C502751(continuation);
                            c502751.L$0 = obj;
                            return c502751;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(ConfirmContactDataState confirmContactDataState, Continuation<? super ConfirmContactDataState> continuation) {
                            return ((C502751) create(confirmContactDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return ConfirmContactDataState.copy$default((ConfirmContactDataState) this.L$0, null, null, null, null, true, null, null, null, 239, null);
                        }
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Disposable disposable) {
                        confirmContactDuxo2.applyMutation(new C502751(null));
                    }
                });
                Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
                ScopedSingle scopedSingleBind$default = LifecycleHost.DefaultImpls.bind$default(confirmContactDuxo, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null);
                final ConfirmContactDuxo confirmContactDuxo3 = this.this$0;
                final VerificationWorkflowResult verificationWorkflowResult = this.$verificationResult;
                Function1 function1 = new Function1() { // from class: com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo$onVerificationResult$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ConfirmContactDuxo.C215291.invokeSuspend$lambda$0(confirmContactDuxo3, verificationWorkflowResult, confirmContactDataState, (MatchaTransfer) obj2);
                    }
                };
                final VerificationWorkflowResult verificationWorkflowResult2 = this.$verificationResult;
                final ConfirmContactDuxo confirmContactDuxo4 = this.this$0;
                scopedSingleBind$default.subscribeKotlin(function1, new Function1() { // from class: com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo$onVerificationResult$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ConfirmContactDuxo.C215291.invokeSuspend$lambda$1(verificationWorkflowResult2, confirmContactDuxo4, (Throwable) obj2);
                    }
                });
                return confirmContactDataState;
            }
            this.this$0.submit(ConfirmContactEvent.SubmitResult.VerificationComplete.Canceled.INSTANCE);
            return ConfirmContactDataState.copy$default(confirmContactDataState, null, null, null, null, false, null, null, null, 239, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(ConfirmContactDuxo confirmContactDuxo, VerificationWorkflowResult verificationWorkflowResult, ConfirmContactDataState confirmContactDataState, MatchaTransfer matchaTransfer) {
            Object approved;
            if (verificationWorkflowResult == VerificationWorkflowResult.APPROVED) {
                Intrinsics.checkNotNull(matchaTransfer);
                approved = new ConfirmContactEvent.SubmitResult.VerificationComplete.Approved(verificationWorkflowResult, confirmContactDuxo.createConfirmationType(matchaTransfer, confirmContactDataState.getTransactor()));
            } else {
                approved = ConfirmContactEvent.SubmitResult.VerificationComplete.NotApproved.INSTANCE;
            }
            confirmContactDuxo.submit(approved);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(VerificationWorkflowResult verificationWorkflowResult, ConfirmContactDuxo confirmContactDuxo, Throwable th) {
            if (verificationWorkflowResult == VerificationWorkflowResult.APPROVED) {
                confirmContactDuxo.submit(new ConfirmContactEvent.SubmitResult.Error(th));
                confirmContactDuxo.applyMutation(new ConfirmContactDuxo2(null));
            } else {
                confirmContactDuxo.submit(ConfirmContactEvent.SubmitResult.VerificationComplete.NotApproved.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    public final void onVerificationResult(VerificationWorkflowResult verificationResult) {
        applyMutation(new C215291(verificationResult, this, null));
    }

    /* compiled from: ConfirmContactDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent$SubmitResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo$sendMatchaTransfer$1", m3645f = "ConfirmContactDuxo.kt", m3646l = {EnumC7081g.f2780x600b66fe, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo$sendMatchaTransfer$1 */
    static final class C215321 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ConfirmContactEvent.SubmitResult>, Object> {
        final /* synthetic */ Transactor $localTransactor;
        final /* synthetic */ ApiMatchaIdentifier $receiverIdentifier;
        final /* synthetic */ SourceOfFunds $sourceOfFunds;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C215321(ApiMatchaIdentifier apiMatchaIdentifier, SourceOfFunds sourceOfFunds, Transactor transactor, Continuation<? super C215321> continuation) {
            super(2, continuation);
            this.$receiverIdentifier = apiMatchaIdentifier;
            this.$sourceOfFunds = sourceOfFunds;
            this.$localTransactor = transactor;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConfirmContactDuxo.this.new C215321(this.$receiverIdentifier, this.$sourceOfFunds, this.$localTransactor, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ConfirmContactEvent.SubmitResult> continuation) {
            return ((C215321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            UUID uuid;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ConfirmContactDuxo confirmContactDuxo = ConfirmContactDuxo.this;
                ApiMatchaIdentifier apiMatchaIdentifier = this.$receiverIdentifier;
                SourceOfFunds sourceOfFunds = this.$sourceOfFunds;
                this.label = 1;
                obj = confirmContactDuxo.createTransfer(apiMatchaIdentifier, sourceOfFunds, this);
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
                return new ConfirmContactEvent.SubmitResult.VerificationRequired(uuid, ((Boolean) obj).booleanValue());
            }
            ResultKt.throwOnFailure(obj);
            ApiMatchaTransfer apiMatchaTransfer = (ApiMatchaTransfer) obj;
            ConfirmContactDuxo.this.applyMutation(new AnonymousClass1(apiMatchaTransfer, null));
            MatchaTransfer dbModel = MatchaTransfer2.toDbModel(apiMatchaTransfer);
            UUID verification_workflow_id = apiMatchaTransfer.getVerification_workflow_id();
            if (verification_workflow_id != null) {
                SuvMigrationManager suvMigrationManager = ConfirmContactDuxo.this.suvMigrationManager;
                this.L$0 = verification_workflow_id;
                this.label = 2;
                Object objIsMigrated = suvMigrationManager.isMigrated(verification_workflow_id, this);
                if (objIsMigrated != coroutine_suspended) {
                    uuid = verification_workflow_id;
                    obj = objIsMigrated;
                    return new ConfirmContactEvent.SubmitResult.VerificationRequired(uuid, ((Boolean) obj).booleanValue());
                }
                return coroutine_suspended;
            }
            return new ConfirmContactEvent.SubmitResult.Success(ConfirmContactDuxo.this.createConfirmationType(dbModel, this.$localTransactor));
        }

        /* compiled from: ConfirmContactDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo$sendMatchaTransfer$1$1", m3645f = "ConfirmContactDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo$sendMatchaTransfer$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ConfirmContactDataState, Continuation<? super ConfirmContactDataState>, Object> {
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
            public final Object invoke(ConfirmContactDataState confirmContactDataState, Continuation<? super ConfirmContactDataState> continuation) {
                return ((AnonymousClass1) create(confirmContactDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ConfirmContactDataState.copy$default((ConfirmContactDataState) this.L$0, null, null, null, null, false, this.$response.getId(), null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single<ConfirmContactEvent.SubmitResult> sendMatchaTransfer(ApiMatchaIdentifier receiverIdentifier, SourceOfFunds sourceOfFunds, Transactor localTransactor) {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C215321(receiverIdentifier, sourceOfFunds, localTransactor, null), 1, null);
    }

    /* compiled from: ConfirmContactDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/matcha/api/ApiMatchaRequest;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo$requestMatchaTransfer$1", m3645f = "ConfirmContactDuxo.kt", m3646l = {202}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo$requestMatchaTransfer$1 */
    static final class C215301 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiMatchaRequest>, Object> {
        final /* synthetic */ ApiMatchaIdentifier $senderIdentifier;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C215301(ApiMatchaIdentifier apiMatchaIdentifier, Continuation<? super C215301> continuation) {
            super(2, continuation);
            this.$senderIdentifier = apiMatchaIdentifier;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConfirmContactDuxo.this.new C215301(this.$senderIdentifier, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiMatchaRequest> continuation) {
            return ((C215301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            MatchaApi matchaApi = ConfirmContactDuxo.this.matchaApi;
            String string2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            ApiMatchaRequestRequest apiMatchaRequestRequest = new ApiMatchaRequestRequest(string2, new ApiMatchaTransferUser(this.$senderIdentifier, null, 2, null), new ApiMatchaRequestPayload(((ConfirmContactFragment.Args) ConfirmContactDuxo.INSTANCE.getArgs((HasSavedState) ConfirmContactDuxo.this)).getAmount().getDecimalValue(), null));
            this.label = 1;
            Object objCreateRequest = matchaApi.createRequest(apiMatchaRequestRequest, this);
            return objCreateRequest == coroutine_suspended ? coroutine_suspended : objCreateRequest;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single<ConfirmContactEvent.SubmitResult> requestMatchaTransfer(ApiMatchaIdentifier senderIdentifier) {
        Single<ConfirmContactEvent.SubmitResult> map = RxFactory.DefaultImpls.rxSingle$default(this, null, new C215301(senderIdentifier, null), 1, null).map(new Function() { // from class: com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo.requestMatchaTransfer.2
            @Override // io.reactivex.functions.Function
            public final ConfirmContactEvent.SubmitResult apply(ApiMatchaRequest it) {
                Intrinsics.checkNotNullParameter(it, "it");
                MatchaRequest dbModel = MatchaRequest2.toDbModel(it);
                return new ConfirmContactEvent.SubmitResult.Success(new ConfirmationType.RequestSent(Money3.toMoney(dbModel.getAmount(), Currencies.USD), dbModel.getTransactor().getDisplayName(), dbModel.getId()));
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createTransfer(ApiMatchaIdentifier apiMatchaIdentifier, SourceOfFunds sourceOfFunds, Continuation<? super ApiMatchaTransfer> continuation) {
        C215261 c215261;
        UUID uuidRandomUUID;
        MatchaApi matchaApi;
        SourceOfFunds sourceOfFunds2;
        ApiMatchaIdentifier apiMatchaIdentifier2;
        MatchaApi matchaApi2;
        UUID uuid;
        if (continuation instanceof C215261) {
            c215261 = (C215261) continuation;
            int i = c215261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c215261.label = i - Integer.MIN_VALUE;
            } else {
                c215261 = new C215261(continuation);
            }
        }
        Object obj = c215261.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c215261.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            MatchaApi matchaApi3 = this.matchaApi;
            uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
            if (sourceOfFunds == null) {
                matchaApi = matchaApi3;
                sourceOfFunds2 = null;
                ApiMatchaSendRequest apiMatchaSendRequest = new ApiMatchaSendRequest(uuidRandomUUID, new ApiMatchaTransferUser(apiMatchaIdentifier, null, 2, null), new ApiMatchaTransferPayload(((ConfirmContactFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAmount().getDecimalValue(), null), sourceOfFunds2);
                c215261.L$0 = null;
                c215261.L$1 = null;
                c215261.L$2 = null;
                c215261.label = 2;
                Object objCreateTransfer = matchaApi.createTransfer(apiMatchaSendRequest, c215261);
                return objCreateTransfer != coroutine_suspended ? coroutine_suspended : objCreateTransfer;
            }
            c215261.L$0 = apiMatchaIdentifier;
            c215261.L$1 = uuidRandomUUID;
            c215261.L$2 = matchaApi3;
            c215261.label = 1;
            Object objAddRadarSessionIdIfNecessary = addRadarSessionIdIfNecessary(sourceOfFunds, c215261);
            if (objAddRadarSessionIdIfNecessary != coroutine_suspended) {
                apiMatchaIdentifier2 = apiMatchaIdentifier;
                matchaApi2 = matchaApi3;
                obj = objAddRadarSessionIdIfNecessary;
                uuid = uuidRandomUUID;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        matchaApi2 = (MatchaApi) c215261.L$2;
        uuid = (UUID) c215261.L$1;
        apiMatchaIdentifier2 = (ApiMatchaIdentifier) c215261.L$0;
        ResultKt.throwOnFailure(obj);
        sourceOfFunds2 = (SourceOfFunds) obj;
        UUID uuid2 = uuid;
        matchaApi = matchaApi2;
        apiMatchaIdentifier = apiMatchaIdentifier2;
        uuidRandomUUID = uuid2;
        ApiMatchaSendRequest apiMatchaSendRequest2 = new ApiMatchaSendRequest(uuidRandomUUID, new ApiMatchaTransferUser(apiMatchaIdentifier, null, 2, null), new ApiMatchaTransferPayload(((ConfirmContactFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAmount().getDecimalValue(), null), sourceOfFunds2);
        c215261.L$0 = null;
        c215261.L$1 = null;
        c215261.L$2 = null;
        c215261.label = 2;
        Object objCreateTransfer2 = matchaApi.createTransfer(apiMatchaSendRequest2, c215261);
        if (objCreateTransfer2 != coroutine_suspended) {
        }
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
        C215251 c215251;
        StripeException stripeException;
        SourceOfFunds sourceOfFunds2;
        String str;
        if (continuation instanceof C215251) {
            c215251 = (C215251) continuation;
            int i = c215251.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c215251.label = i - Integer.MIN_VALUE;
            } else {
                c215251 = new C215251(continuation);
            }
        }
        Object radarSessionId = c215251.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c215251.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(radarSessionId);
            if (WhenMappings.$EnumSwitchMapping$0[sourceOfFunds.getType().ordinal()] != 1) {
                return sourceOfFunds;
            }
            try {
                StripeStore stripeStore = this.stripeStore;
                ApiTransferAccount.TransferAccountType transferAccountType = ApiTransferAccount.TransferAccountType.RHY;
                c215251.L$0 = sourceOfFunds;
                c215251.L$1 = sourceOfFunds;
                c215251.label = 1;
                radarSessionId = stripeStore.getRadarSessionId(transferAccountType, c215251);
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
            sourceOfFunds = (SourceOfFunds) c215251.L$1;
            sourceOfFunds2 = (SourceOfFunds) c215251.L$0;
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
    public final Single<Optional<TransferAccount>> fetchSelectedTransferAccount(final ConfirmContactDataState confirmContactDataState) {
        Single<List<TransferAccount>> singleFirstOrError = this.transferAccountStore.fetchIfStaleThenStream().firstOrError();
        if (confirmContactDataState.getSourceOfFunds() != null) {
            Single map = singleFirstOrError.map(new Function() { // from class: com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo.fetchSelectedTransferAccount.1
                @Override // io.reactivex.functions.Function
                public final Optional<TransferAccount> apply(List<TransferAccount> accounts2) {
                    Object next;
                    Intrinsics.checkNotNullParameter(accounts2, "accounts");
                    ConfirmContactDataState confirmContactDataState2 = confirmContactDataState;
                    Iterator<T> it = accounts2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.areEqual(((TransferAccount) next).getId(), confirmContactDataState2.getSourceOfFunds().getValue())) {
                            break;
                        }
                    }
                    return Optional3.asOptional(next);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            return map;
        }
        Single map2 = singleFirstOrError.map(new Function() { // from class: com.robinhood.android.matcha.ui.search.confirm.ConfirmContactDuxo.fetchSelectedTransferAccount.2
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

    /* compiled from: ConfirmContactDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactDuxo;", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactFragment$Args;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ConfirmContactDuxo, ConfirmContactFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ConfirmContactFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (ConfirmContactFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ConfirmContactFragment.Args getArgs(ConfirmContactDuxo confirmContactDuxo) {
            return (ConfirmContactFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, confirmContactDuxo);
        }
    }
}
