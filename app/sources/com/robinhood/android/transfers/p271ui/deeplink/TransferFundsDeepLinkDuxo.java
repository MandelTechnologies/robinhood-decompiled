package com.robinhood.android.transfers.p271ui.deeplink;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.transfers.contracts.GoldApyBoostMinDepositContext;
import com.robinhood.android.transfers.contracts.InternationalTransfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.TransferFundsDeepLink;
import com.robinhood.android.transfers.contracts.TransferFundsDeepLinkAccountType;
import com.robinhood.android.transfers.contracts.UkTransfer;
import com.robinhood.android.transfers.p271ui.deeplink.TransferFundsDeepLinkViewState;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.iso.countrycode.Affiliate;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.api.experiments.UkQueuedDepositExperiment;
import com.robinhood.models.api.identi.ApiSortingHatUserState;
import com.robinhood.models.api.sortinghat.SortingHatApi;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.shared.store.user.UserStore;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.math.BigDecimal;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: TransferFundsDeepLinkDuxo.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001.BA\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020)H\u0002J\b\u0010+\u001a\u00020)H\u0002J\b\u0010,\u001a\u00020)H\u0002J\b\u0010-\u001a\u00020)H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001d8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "sortingHatApi", "Lcom/robinhood/models/api/sortinghat/SortingHatApi;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/models/api/sortinghat/SortingHatApi;Lcom/robinhood/shared/store/user/UserStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "extras", "Lcom/robinhood/android/transfers/contracts/TransferFundsDeepLink;", "noAccountsSpecified", "", "getNoAccountsSpecified", "()Z", "direction", "Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "getDirection$feature_transfers_externalRelease$annotations", "()V", "getDirection$feature_transfers_externalRelease", "()Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "getExceptionHandler", "()Lkotlinx/coroutines/CoroutineExceptionHandler;", "exceptionHandler$delegate", "Lkotlin/Lazy;", "onStart", "", "handleUsUser", "handleUkUser", "handleApacUser", "regularLogic", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class TransferFundsDeepLinkDuxo extends BaseDuxo4<TransferFundsDeepLinkViewState> implements HasSavedState {
    private final AccountProvider accountProvider;

    /* renamed from: exceptionHandler$delegate, reason: from kotlin metadata */
    private final Lazy exceptionHandler;
    private final ExperimentsStore experimentsStore;
    private final TransferFundsDeepLink extras;
    private final SavedStateHandle savedStateHandle;
    private final SortingHatApi sortingHatApi;
    private final TransferAccountStore transferAccountStore;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Set<TransferFundsDeepLinkAccountType> BankAccountTypes = SetsKt.setOf((Object[]) new TransferFundsDeepLinkAccountType[]{TransferFundsDeepLinkAccountType.ACH_RELATIONSHIP, TransferFundsDeepLinkAccountType.UK_BANK_ACCOUNT, TransferFundsDeepLinkAccountType.I18N_BANK_ACCOUNT});

    public static /* synthetic */ void getDirection$feature_transfers_externalRelease$annotations() {
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferFundsDeepLinkDuxo(ExperimentsStore experimentsStore, TransferAccountStore transferAccountStore, AccountProvider accountProvider, SortingHatApi sortingHatApi, UserStore userStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(TransferFundsDeepLinkViewState.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(sortingHatApi, "sortingHatApi");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.experimentsStore = experimentsStore;
        this.transferAccountStore = transferAccountStore;
        this.accountProvider = accountProvider;
        this.sortingHatApi = sortingHatApi;
        this.userStore = userStore;
        this.savedStateHandle = savedStateHandle;
        this.extras = (TransferFundsDeepLink) INSTANCE.getExtras(getSavedStateHandle());
        this.exceptionHandler = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.ui.deeplink.TransferFundsDeepLinkDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferFundsDeepLinkDuxo.exceptionHandler_delegate$lambda$1(this.f$0);
            }
        });
    }

    private final boolean getNoAccountsSpecified() {
        return this.extras.getFromAccountType() == null && this.extras.getToAccountType() == null && this.extras.getFromAccountId() == null && this.extras.getToAccountId() == null;
    }

    public final TransferDirectionV2 getDirection$feature_transfers_externalRelease() {
        if (this.extras.getDirection() != null) {
            TransferDirectionV2 direction = this.extras.getDirection();
            Intrinsics.checkNotNull(direction);
            return direction;
        }
        if (getNoAccountsSpecified()) {
            return TransferDirectionV2.DEPOSIT;
        }
        Set<TransferFundsDeepLinkAccountType> set = BankAccountTypes;
        return CollectionsKt.contains(set, this.extras.getFromAccountType()) ? TransferDirectionV2.DEPOSIT : CollectionsKt.contains(set, this.extras.getToAccountType()) ? TransferDirectionV2.WITHDRAW : TransferDirectionV2.DEPOSIT;
    }

    private final CoroutineExceptionHandler getExceptionHandler() {
        return (CoroutineExceptionHandler) this.exceptionHandler.getValue();
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        this.userStore.refresh(true);
        Single<User> singleFirstOrError = this.userStore.getUser().firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleFirstOrError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.deeplink.TransferFundsDeepLinkDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferFundsDeepLinkDuxo.onStart$lambda$2(this.f$0, (User) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.ui.deeplink.TransferFundsDeepLinkDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferFundsDeepLinkDuxo.onStart$lambda$3(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(TransferFundsDeepLinkDuxo transferFundsDeepLinkDuxo, User user) {
        CountryCode.Supported locality = user.getOrigin().getLocality();
        if (Intrinsics.areEqual(locality, CountryCode.Supported.UnitedStates.INSTANCE)) {
            transferFundsDeepLinkDuxo.handleUsUser();
        } else if (Intrinsics.areEqual(locality, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
            transferFundsDeepLinkDuxo.handleUkUser();
        } else {
            if (!Affiliate.RHSG.INSTANCE.contains(locality)) {
                throw new IllegalStateException(("Unsupported country code: " + locality).toString());
            }
            transferFundsDeepLinkDuxo.handleApacUser();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(TransferFundsDeepLinkDuxo transferFundsDeepLinkDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        transferFundsDeepLinkDuxo.applyMutation(new TransferFundsDeepLinkDuxo3(it, null));
        return Unit.INSTANCE;
    }

    private final void handleUsUser() {
        regularLogic();
    }

    /* compiled from: TransferFundsDeepLinkDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.deeplink.TransferFundsDeepLinkDuxo$handleUkUser$1", m3645f = "TransferFundsDeepLinkDuxo.kt", m3646l = {405, 117}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.ui.deeplink.TransferFundsDeepLinkDuxo$handleUkUser$1 */
    static final class C306101 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C306101(Continuation<? super C306101> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TransferFundsDeepLinkDuxo.this.new C306101(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C306101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
        
            if (r12 == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable observableStreamState$default = ExperimentsProvider.DefaultImpls.streamState$default(TransferFundsDeepLinkDuxo.this.experimentsStore, new Experiment[]{UkQueuedDepositExperiment.INSTANCE}, false, null, 6, null);
                this.label = 1;
                obj = RxAwait3.awaitFirst(observableStreamState$default, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ApiSortingHatUserState apiSortingHatUserState = (ApiSortingHatUserState) obj;
                if (apiSortingHatUserState.getBrokerage().getHas_application() && !apiSortingHatUserState.getBrokerage().is_approved()) {
                    TransferFundsDeepLinkDuxo.this.applyMutation(new AnonymousClass1(null));
                    return Unit.INSTANCE;
                }
                TransferFundsDeepLinkDuxo transferFundsDeepLinkDuxo = TransferFundsDeepLinkDuxo.this;
                transferFundsDeepLinkDuxo.applyMutation(new AnonymousClass2(transferFundsDeepLinkDuxo, null));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            if (((Boolean) obj).booleanValue()) {
                SortingHatApi sortingHatApi = TransferFundsDeepLinkDuxo.this.sortingHatApi;
                this.label = 2;
                obj = sortingHatApi.getSortingHatUserState(null, this);
            }
            TransferFundsDeepLinkDuxo transferFundsDeepLinkDuxo2 = TransferFundsDeepLinkDuxo.this;
            transferFundsDeepLinkDuxo2.applyMutation(new AnonymousClass2(transferFundsDeepLinkDuxo2, null));
            return Unit.INSTANCE;
        }

        /* compiled from: TransferFundsDeepLinkDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.deeplink.TransferFundsDeepLinkDuxo$handleUkUser$1$1", m3645f = "TransferFundsDeepLinkDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.deeplink.TransferFundsDeepLinkDuxo$handleUkUser$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<TransferFundsDeepLinkViewState, Continuation<? super TransferFundsDeepLinkViewState>, Object> {
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(TransferFundsDeepLinkViewState transferFundsDeepLinkViewState, Continuation<? super TransferFundsDeepLinkViewState> continuation) {
                return ((AnonymousClass1) create(transferFundsDeepLinkViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return TransferFundsDeepLinkViewState.UkQueuedDeposit.INSTANCE;
            }
        }

        /* compiled from: TransferFundsDeepLinkDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.deeplink.TransferFundsDeepLinkDuxo$handleUkUser$1$2", m3645f = "TransferFundsDeepLinkDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.deeplink.TransferFundsDeepLinkDuxo$handleUkUser$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<TransferFundsDeepLinkViewState, Continuation<? super TransferFundsDeepLinkViewState>, Object> {
            int label;
            final /* synthetic */ TransferFundsDeepLinkDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(TransferFundsDeepLinkDuxo transferFundsDeepLinkDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = transferFundsDeepLinkDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(TransferFundsDeepLinkViewState transferFundsDeepLinkViewState, Continuation<? super TransferFundsDeepLinkViewState> continuation) {
                return ((AnonymousClass2) create(transferFundsDeepLinkViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    BigDecimal amount = this.this$0.extras.getAmount();
                    return new TransferFundsDeepLinkViewState.UkTransfer(new UkTransfer(this.this$0.getDirection$feature_transfers_externalRelease(), amount, this.this$0.extras.getFromAccountId(), this.this$0.extras.getToAccountId(), this.this$0.extras.getEntryPoint()));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    private final void handleUkUser() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), getExceptionHandler(), null, new C306101(null), 2, null);
    }

    /* compiled from: TransferFundsDeepLinkDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.deeplink.TransferFundsDeepLinkDuxo$handleApacUser$1", m3645f = "TransferFundsDeepLinkDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.deeplink.TransferFundsDeepLinkDuxo$handleApacUser$1 */
    static final class C306091 extends ContinuationImpl7 implements Function2<TransferFundsDeepLinkViewState, Continuation<? super TransferFundsDeepLinkViewState>, Object> {
        int label;

        C306091(Continuation<? super C306091> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TransferFundsDeepLinkDuxo.this.new C306091(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransferFundsDeepLinkViewState transferFundsDeepLinkViewState, Continuation<? super TransferFundsDeepLinkViewState> continuation) {
            return ((C306091) create(transferFundsDeepLinkViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new TransferFundsDeepLinkViewState.InternationalTransferConfig(new InternationalTransfer(TransferFundsDeepLinkDuxo.this.getDirection$feature_transfers_externalRelease().toTransferDirection(), TransferFundsDeepLinkDuxo.this.extras.getAmount(), null, TransferFundsDeepLinkDuxo.this.extras.getEntryPoint(), 4, null));
        }
    }

    private final void handleApacUser() {
        applyMutation(new C306091(null));
    }

    /* compiled from: TransferFundsDeepLinkDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.deeplink.TransferFundsDeepLinkDuxo$regularLogic$1", m3645f = "TransferFundsDeepLinkDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.deeplink.TransferFundsDeepLinkDuxo$regularLogic$1 */
    static final class C306111 extends ContinuationImpl7 implements Function2<TransferFundsDeepLinkViewState, Continuation<? super TransferFundsDeepLinkViewState>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* compiled from: TransferFundsDeepLinkDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.ui.deeplink.TransferFundsDeepLinkDuxo$regularLogic$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ApiTransferAccount.TransferAccountType.values().length];
                try {
                    iArr[ApiTransferAccount.TransferAccountType.ACH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ApiTransferAccount.TransferAccountType.DEBIT_CARD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ApiTransferAccount.TransferAccountType.RHCE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ApiTransferAccount.TransferAccountType.SEPA.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ApiTransferAccount.TransferAccountType.UK_BANK_ACCOUNT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ApiTransferAccount.TransferAccountType.I18N_BANK_ACCOUNT.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ApiTransferAccount.TransferAccountType.OUTGOING_WIRE_ACCOUNT.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[ApiTransferAccount.TransferAccountType.RHY_BANKING.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[ApiTransferAccount.TransferAccountType.RHUK_ISA_STOCKS_AND_SHARES.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[ApiTransferAccount.TransferAccountType.CUSTODIAL_UGMA.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[ApiTransferAccount.TransferAccountType.CUSTODIAL_UTMA.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[ApiTransferAccount.TransferAccountType.UNKNOWN.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[ApiTransferAccount.TransferAccountType.IRA_ROTH.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[ApiTransferAccount.TransferAccountType.IRA_TRADITIONAL.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[ApiTransferAccount.TransferAccountType.RHS.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[ApiTransferAccount.TransferAccountType.RHY.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[ApiTransferAccount.TransferAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C306111(Continuation<? super C306111> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C306111 c306111 = TransferFundsDeepLinkDuxo.this.new C306111(continuation);
            c306111.L$0 = obj;
            return c306111;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransferFundsDeepLinkViewState transferFundsDeepLinkViewState, Continuation<? super TransferFundsDeepLinkViewState> continuation) {
            return ((C306111) create(transferFundsDeepLinkViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01a9  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            TransferFundsDeepLinkViewState transferFundsDeepLinkViewState;
            ApiTransferAccount.TransferAccountType transferAccountType;
            ApiCreateTransferRequest2 frequency;
            String str;
            ApiTransferAccount.TransferAccountType transferAccountType2;
            String str2;
            ApiCreateTransferRequest2 apiCreateTransferRequest2;
            Object correctedAccountSelections;
            String str3;
            ApiCreateTransferRequest2 apiCreateTransferRequest22;
            String str4;
            ApiTransferAccount.TransferAccountType transferAccountType3;
            TransferConfiguration finalTransferConfiguration;
            TransferConfiguration.TransferAccountSelection transferAccountSelection;
            TransferConfiguration.TransferAccountSelection transferAccountSelection2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                transferFundsDeepLinkViewState = (TransferFundsDeepLinkViewState) this.L$0;
                TransferFundsDeepLinkAccountType fromAccountType = TransferFundsDeepLinkDuxo.this.extras.getFromAccountType();
                ApiTransferAccount.TransferAccountType transferAccountType4 = fromAccountType != null ? fromAccountType.toTransferAccountType() : null;
                TransferFundsDeepLinkAccountType toAccountType = TransferFundsDeepLinkDuxo.this.extras.getToAccountType();
                transferAccountType = toAccountType != null ? toAccountType.toTransferAccountType() : null;
                String fromAccountId = TransferFundsDeepLinkDuxo.this.extras.getFromAccountId();
                String toAccountId = TransferFundsDeepLinkDuxo.this.extras.getToAccountId();
                switch (transferAccountType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[transferAccountType.ordinal()]) {
                    case -1:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        frequency = null;
                        if (TransferFundsDeepLinkDuxo.this.getDirection$feature_transfers_externalRelease() != TransferDirectionV2.INTER_ENTITY) {
                            if (transferAccountType4 == null && transferAccountType == null && fromAccountId == null && toAccountId == null) {
                                ApiTransferAccount.TransferAccountType transferAccountType5 = ApiTransferAccount.TransferAccountType.ACH;
                                transferAccountType = ApiTransferAccount.TransferAccountType.RHS;
                                str4 = toAccountId;
                                str2 = fromAccountId;
                                transferAccountType2 = transferAccountType5;
                                apiCreateTransferRequest2 = frequency;
                                transferAccountType3 = transferAccountType;
                                finalTransferConfiguration = TransferFundsDeepLinkDuxo.INSTANCE.getFinalTransferConfiguration(TransferFundsDeepLinkDuxo.this.extras.getAmount(), apiCreateTransferRequest2, transferAccountType2, transferAccountType3, str2, str4, TransferFundsDeepLinkDuxo.this.extras.getIraContributionType(), new GoldApyBoostMinDepositContext(TransferFundsDeepLinkDuxo.this.extras.getMinDepositRate(), TransferFundsDeepLinkDuxo.this.extras.getMinDepositAmount()), TransferFundsDeepLinkDuxo.this.extras.getEntryPoint(), TransferFundsDeepLinkDuxo.this.extras.getEntryPointLoggingIdentifier(), TransferFundsDeepLinkDuxo.this.extras.getPromotionName(), TransferFundsDeepLinkDuxo.this.extras.getPromotionType());
                                if (transferAccountType3 != ApiTransferAccount.TransferAccountType.RHS) {
                                }
                                return new TransferFundsDeepLinkViewState.Transfer(finalTransferConfiguration);
                            }
                            if ((transferAccountType4 != null && transferAccountType != null && transferAccountType4 == transferAccountType) || (transferAccountType4 != null && transferAccountType4.isExternal() && transferAccountType != null && transferAccountType.isExternal())) {
                                str4 = toAccountId;
                                transferAccountType3 = null;
                                str2 = fromAccountId;
                                transferAccountType2 = transferAccountType4;
                                apiCreateTransferRequest2 = frequency;
                                finalTransferConfiguration = TransferFundsDeepLinkDuxo.INSTANCE.getFinalTransferConfiguration(TransferFundsDeepLinkDuxo.this.extras.getAmount(), apiCreateTransferRequest2, transferAccountType2, transferAccountType3, str2, str4, TransferFundsDeepLinkDuxo.this.extras.getIraContributionType(), new GoldApyBoostMinDepositContext(TransferFundsDeepLinkDuxo.this.extras.getMinDepositRate(), TransferFundsDeepLinkDuxo.this.extras.getMinDepositAmount()), TransferFundsDeepLinkDuxo.this.extras.getEntryPoint(), TransferFundsDeepLinkDuxo.this.extras.getEntryPointLoggingIdentifier(), TransferFundsDeepLinkDuxo.this.extras.getPromotionName(), TransferFundsDeepLinkDuxo.this.extras.getPromotionType());
                                if (transferAccountType3 != ApiTransferAccount.TransferAccountType.RHS && TransferFundsDeepLinkDuxo.this.extras.getToAccountId() == null) {
                                    BuildersKt__Builders_commonKt.launch$default(TransferFundsDeepLinkDuxo.this.getLifecycleScope(), null, null, new AnonymousClass1(TransferFundsDeepLinkDuxo.this, finalTransferConfiguration, null), 3, null);
                                    return transferFundsDeepLinkViewState;
                                }
                                return new TransferFundsDeepLinkViewState.Transfer(finalTransferConfiguration);
                            }
                            if ((fromAccountId != null && transferAccountType4 == null) || (toAccountId != null && transferAccountType == null)) {
                                TransferAccountStore transferAccountStore = TransferFundsDeepLinkDuxo.this.transferAccountStore;
                                TransferConfiguration.TransferAccountSelection transferAccountSelection3 = new TransferConfiguration.TransferAccountSelection(fromAccountId, false, transferAccountType4, 2, null);
                                ApiCreateTransferRequest2 apiCreateTransferRequest23 = frequency;
                                str = toAccountId;
                                TransferConfiguration.TransferAccountSelection transferAccountSelection4 = new TransferConfiguration.TransferAccountSelection(str, false, transferAccountType, 2, null);
                                this.L$0 = transferFundsDeepLinkViewState;
                                this.L$1 = fromAccountId;
                                this.L$2 = str;
                                this.L$3 = apiCreateTransferRequest23;
                                this.label = 1;
                                correctedAccountSelections = TransferAccountStores.getCorrectedAccountSelections(transferAccountStore, transferAccountSelection3, transferAccountSelection4, this);
                                if (correctedAccountSelections != coroutine_suspended) {
                                    str3 = fromAccountId;
                                    apiCreateTransferRequest22 = apiCreateTransferRequest23;
                                    break;
                                } else {
                                    return coroutine_suspended;
                                }
                            }
                        }
                        str = toAccountId;
                        transferAccountType2 = transferAccountType4;
                        str2 = fromAccountId;
                        apiCreateTransferRequest2 = frequency;
                        str4 = str;
                        transferAccountType3 = transferAccountType;
                        finalTransferConfiguration = TransferFundsDeepLinkDuxo.INSTANCE.getFinalTransferConfiguration(TransferFundsDeepLinkDuxo.this.extras.getAmount(), apiCreateTransferRequest2, transferAccountType2, transferAccountType3, str2, str4, TransferFundsDeepLinkDuxo.this.extras.getIraContributionType(), new GoldApyBoostMinDepositContext(TransferFundsDeepLinkDuxo.this.extras.getMinDepositRate(), TransferFundsDeepLinkDuxo.this.extras.getMinDepositAmount()), TransferFundsDeepLinkDuxo.this.extras.getEntryPoint(), TransferFundsDeepLinkDuxo.this.extras.getEntryPointLoggingIdentifier(), TransferFundsDeepLinkDuxo.this.extras.getPromotionName(), TransferFundsDeepLinkDuxo.this.extras.getPromotionType());
                        if (transferAccountType3 != ApiTransferAccount.TransferAccountType.RHS) {
                        }
                        return new TransferFundsDeepLinkViewState.Transfer(finalTransferConfiguration);
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                        if (transferAccountType4 == ApiTransferAccount.TransferAccountType.ACH) {
                            frequency = TransferFundsDeepLinkDuxo.this.extras.getFrequency();
                        }
                        if (TransferFundsDeepLinkDuxo.this.getDirection$feature_transfers_externalRelease() != TransferDirectionV2.INTER_ENTITY) {
                        }
                        str = toAccountId;
                        transferAccountType2 = transferAccountType4;
                        str2 = fromAccountId;
                        apiCreateTransferRequest2 = frequency;
                        str4 = str;
                        transferAccountType3 = transferAccountType;
                        finalTransferConfiguration = TransferFundsDeepLinkDuxo.INSTANCE.getFinalTransferConfiguration(TransferFundsDeepLinkDuxo.this.extras.getAmount(), apiCreateTransferRequest2, transferAccountType2, transferAccountType3, str2, str4, TransferFundsDeepLinkDuxo.this.extras.getIraContributionType(), new GoldApyBoostMinDepositContext(TransferFundsDeepLinkDuxo.this.extras.getMinDepositRate(), TransferFundsDeepLinkDuxo.this.extras.getMinDepositAmount()), TransferFundsDeepLinkDuxo.this.extras.getEntryPoint(), TransferFundsDeepLinkDuxo.this.extras.getEntryPointLoggingIdentifier(), TransferFundsDeepLinkDuxo.this.extras.getPromotionName(), TransferFundsDeepLinkDuxo.this.extras.getPromotionType());
                        if (transferAccountType3 != ApiTransferAccount.TransferAccountType.RHS) {
                        }
                        return new TransferFundsDeepLinkViewState.Transfer(finalTransferConfiguration);
                }
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apiCreateTransferRequest22 = (ApiCreateTransferRequest2) this.L$3;
            String str5 = (String) this.L$2;
            str3 = (String) this.L$1;
            transferFundsDeepLinkViewState = (TransferFundsDeepLinkViewState) this.L$0;
            ResultKt.throwOnFailure(obj);
            str = str5;
            correctedAccountSelections = obj;
            Tuples2 tuples2 = (Tuples2) correctedAccountSelections;
            ApiTransferAccount.TransferAccountType type2 = (tuples2 == null || (transferAccountSelection2 = (TransferConfiguration.TransferAccountSelection) tuples2.getFirst()) == null) ? null : transferAccountSelection2.getType();
            transferAccountType = (tuples2 == null || (transferAccountSelection = (TransferConfiguration.TransferAccountSelection) tuples2.getSecond()) == null) ? null : transferAccountSelection.getType();
            apiCreateTransferRequest2 = apiCreateTransferRequest22;
            str2 = str3;
            transferAccountType2 = type2;
            str4 = str;
            transferAccountType3 = transferAccountType;
            finalTransferConfiguration = TransferFundsDeepLinkDuxo.INSTANCE.getFinalTransferConfiguration(TransferFundsDeepLinkDuxo.this.extras.getAmount(), apiCreateTransferRequest2, transferAccountType2, transferAccountType3, str2, str4, TransferFundsDeepLinkDuxo.this.extras.getIraContributionType(), new GoldApyBoostMinDepositContext(TransferFundsDeepLinkDuxo.this.extras.getMinDepositRate(), TransferFundsDeepLinkDuxo.this.extras.getMinDepositAmount()), TransferFundsDeepLinkDuxo.this.extras.getEntryPoint(), TransferFundsDeepLinkDuxo.this.extras.getEntryPointLoggingIdentifier(), TransferFundsDeepLinkDuxo.this.extras.getPromotionName(), TransferFundsDeepLinkDuxo.this.extras.getPromotionType());
            if (transferAccountType3 != ApiTransferAccount.TransferAccountType.RHS) {
            }
            return new TransferFundsDeepLinkViewState.Transfer(finalTransferConfiguration);
        }

        /* compiled from: TransferFundsDeepLinkDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.deeplink.TransferFundsDeepLinkDuxo$regularLogic$1$1", m3645f = "TransferFundsDeepLinkDuxo.kt", m3646l = {405}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.transfers.ui.deeplink.TransferFundsDeepLinkDuxo$regularLogic$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ TransferConfiguration $finalTransferConfiguration;
            int label;
            final /* synthetic */ TransferFundsDeepLinkDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TransferFundsDeepLinkDuxo transferFundsDeepLinkDuxo, TransferConfiguration transferConfiguration, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = transferFundsDeepLinkDuxo;
                this.$finalTransferConfiguration = transferConfiguration;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$finalTransferConfiguration, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Single<Boolean> singleForceFetchHasBrokerageAccountIfNotCached = this.this$0.accountProvider.forceFetchHasBrokerageAccountIfNotCached();
                        this.label = 1;
                        obj = RxAwait3.await(singleForceFetchHasBrokerageAccountIfNotCached, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    TransferFundsDeepLinkDuxo transferFundsDeepLinkDuxo = this.this$0;
                    transferFundsDeepLinkDuxo.applyMutation(new C506101((Boolean) obj, this.$finalTransferConfiguration, transferFundsDeepLinkDuxo, null));
                } catch (Exception e) {
                    this.this$0.applyMutation(new AnonymousClass2(e, null));
                }
                return Unit.INSTANCE;
            }

            /* compiled from: TransferFundsDeepLinkDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.deeplink.TransferFundsDeepLinkDuxo$regularLogic$1$1$1", m3645f = "TransferFundsDeepLinkDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.deeplink.TransferFundsDeepLinkDuxo$regularLogic$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506101 extends ContinuationImpl7 implements Function2<TransferFundsDeepLinkViewState, Continuation<? super TransferFundsDeepLinkViewState>, Object> {
                final /* synthetic */ TransferConfiguration $finalTransferConfiguration;
                final /* synthetic */ Boolean $hasBrokerageAccount;
                int label;
                final /* synthetic */ TransferFundsDeepLinkDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C506101(Boolean bool, TransferConfiguration transferConfiguration, TransferFundsDeepLinkDuxo transferFundsDeepLinkDuxo, Continuation<? super C506101> continuation) {
                    super(2, continuation);
                    this.$hasBrokerageAccount = bool;
                    this.$finalTransferConfiguration = transferConfiguration;
                    this.this$0 = transferFundsDeepLinkDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C506101(this.$hasBrokerageAccount, this.$finalTransferConfiguration, this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(TransferFundsDeepLinkViewState transferFundsDeepLinkViewState, Continuation<? super TransferFundsDeepLinkViewState> continuation) {
                    return ((C506101) create(transferFundsDeepLinkViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (this.$hasBrokerageAccount.booleanValue()) {
                        return new TransferFundsDeepLinkViewState.Transfer(this.$finalTransferConfiguration);
                    }
                    return new TransferFundsDeepLinkViewState.QueuedDeposits(this.this$0.extras.getAmount());
                }
            }

            /* compiled from: TransferFundsDeepLinkDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.deeplink.TransferFundsDeepLinkDuxo$regularLogic$1$1$2", m3645f = "TransferFundsDeepLinkDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.deeplink.TransferFundsDeepLinkDuxo$regularLogic$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<TransferFundsDeepLinkViewState, Continuation<? super TransferFundsDeepLinkViewState>, Object> {

                /* renamed from: $e */
                final /* synthetic */ Exception f5029$e;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(Exception exc, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.f5029$e = exc;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.f5029$e, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(TransferFundsDeepLinkViewState transferFundsDeepLinkViewState, Continuation<? super TransferFundsDeepLinkViewState> continuation) {
                    return ((AnonymousClass2) create(transferFundsDeepLinkViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return new TransferFundsDeepLinkViewState.Error(this.f5029$e);
                }
            }
        }
    }

    private final void regularLogic() {
        applyMutation(new C306111(null));
    }

    /* compiled from: TransferFundsDeepLinkDuxo.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J|\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkDuxo;", "Lcom/robinhood/android/transfers/contracts/TransferFundsDeepLink;", "<init>", "()V", "BankAccountTypes", "", "Lcom/robinhood/android/transfers/contracts/TransferFundsDeepLinkAccountType;", "getFinalTransferConfiguration", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "amount", "Ljava/math/BigDecimal;", "frequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "fromAccountType", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "toAccountType", "fromAccountId", "", "toAccountId", "iraContributionType", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "goldApyBoostMinDepositContext", "Lcom/robinhood/android/transfers/contracts/GoldApyBoostMinDepositContext;", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "entryPointLoggingIdentifier", "promotionName", "promotionType", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<TransferFundsDeepLinkDuxo, TransferFundsDeepLink> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public TransferFundsDeepLink getExtras(SavedStateHandle savedStateHandle) {
            return (TransferFundsDeepLink) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public TransferFundsDeepLink getExtras(TransferFundsDeepLinkDuxo transferFundsDeepLinkDuxo) {
            return (TransferFundsDeepLink) DuxoCompanion2.DefaultImpls.getExtras(this, transferFundsDeepLinkDuxo);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final TransferConfiguration getFinalTransferConfiguration(BigDecimal amount, ApiCreateTransferRequest2 frequency, ApiTransferAccount.TransferAccountType fromAccountType, ApiTransferAccount.TransferAccountType toAccountType, String fromAccountId, String toAccountId, IraContributionType iraContributionType, GoldApyBoostMinDepositContext goldApyBoostMinDepositContext, MAXTransferContext.EntryPoint entryPoint, String entryPointLoggingIdentifier, String promotionName, String promotionType) {
            TransferConfiguration.TransferAccountSelection transferAccountSelection;
            TransferConfiguration.TransferAccountSelection transferAccountSelection2;
            TransferConfiguration.TransferAccountSelection transferAccountSelection3;
            TransferConfiguration.TransferAccountSelection transferAccountSelection4;
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            MAXTransferContext.EntryPoint entryPoint2 = MAXTransferContext.EntryPoint.INCENTIVE_PRE_DEPOSIT;
            MAXTransferContext.EntryPoint entryPoint3 = MAXTransferContext.EntryPoint.INCENTIVE_POST_DEPOSIT;
            boolean zContains = SetsKt.setOf((Object[]) new MAXTransferContext.EntryPoint[]{entryPoint2, entryPoint3}).contains(entryPoint);
            if (fromAccountType != null) {
                transferAccountSelection2 = new TransferConfiguration.TransferAccountSelection(fromAccountId, zContains, fromAccountType);
            } else if (fromAccountId != null) {
                transferAccountSelection2 = new TransferConfiguration.TransferAccountSelection(fromAccountId, zContains, null, 4, null);
            } else {
                transferAccountSelection = null;
                if (toAccountType == null) {
                    transferAccountSelection4 = new TransferConfiguration.TransferAccountSelection(toAccountId, zContains, toAccountType);
                } else if (toAccountId != null) {
                    transferAccountSelection4 = new TransferConfiguration.TransferAccountSelection(toAccountId, zContains, null, 4, null);
                } else {
                    transferAccountSelection3 = null;
                    boolean zContains2 = SetsKt.setOf((Object[]) new MAXTransferContext.EntryPoint[]{entryPoint2, entryPoint3}).contains(entryPoint);
                    if (iraContributionType != null) {
                        return new TransferConfiguration.IraContribution(amount, frequency, transferAccountSelection, transferAccountSelection3, iraContributionType, null, entryPoint, entryPointLoggingIdentifier, 32, null);
                    }
                    BigDecimal bigDecimal = amount;
                    TransferConfiguration.TransferAccountSelection transferAccountSelection5 = transferAccountSelection;
                    if (entryPoint == MAXTransferContext.EntryPoint.MAINTENANCE_CALL) {
                        if (bigDecimal == null) {
                            bigDecimal = BigDecimal.ZERO;
                        }
                        Intrinsics.checkNotNull(bigDecimal);
                        BigDecimal ZERO = BigDecimal.ZERO;
                        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                        return new TransferConfiguration.MarginResolution(bigDecimal, ZERO, false, toAccountType == null ? ApiTransferAccount.TransferAccountType.RHS : toAccountType, null, 16, null);
                    }
                    if (entryPoint == MAXTransferContext.EntryPoint.POST_TRADE_FLOW_PDT) {
                        return new TransferConfiguration.PdtPrevention(bigDecimal, transferAccountSelection5, transferAccountSelection3);
                    }
                    boolean z = false;
                    if (goldApyBoostMinDepositContext != null ? goldApyBoostMinDepositContext.isValidContext() : false) {
                        return new TransferConfiguration.GoldApyBoostMinDeposit(bigDecimal, transferAccountSelection5, transferAccountSelection3, goldApyBoostMinDepositContext != null ? goldApyBoostMinDepositContext.getMinDepositAmount() : null, goldApyBoostMinDepositContext != null ? goldApyBoostMinDepositContext.getMinDepositRate() : null, entryPoint, entryPointLoggingIdentifier);
                    }
                    if (frequency != null && frequency != ApiCreateTransferRequest2.ONCE) {
                        z = true;
                    }
                    return new TransferConfiguration.Standard(amount, frequency, z, transferAccountSelection5, transferAccountSelection3, null, entryPoint, entryPointLoggingIdentifier, false, false, promotionName, promotionType, zContains2, 800, null);
                }
                transferAccountSelection3 = transferAccountSelection4;
                boolean zContains22 = SetsKt.setOf((Object[]) new MAXTransferContext.EntryPoint[]{entryPoint2, entryPoint3}).contains(entryPoint);
                if (iraContributionType != null) {
                }
            }
            transferAccountSelection = transferAccountSelection2;
            if (toAccountType == null) {
            }
            transferAccountSelection3 = transferAccountSelection4;
            boolean zContains222 = SetsKt.setOf((Object[]) new MAXTransferContext.EntryPoint[]{entryPoint2, entryPoint3}).contains(entryPoint);
            if (iraContributionType != null) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineExceptionHandler exceptionHandler_delegate$lambda$1(TransferFundsDeepLinkDuxo transferFundsDeepLinkDuxo) {
        return new CoroutineExceptionHandler5(CoroutineExceptionHandler.INSTANCE, transferFundsDeepLinkDuxo);
    }
}
