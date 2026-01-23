package com.robinhood.android.acatsin.submit;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.acatsin.submit.AcatsInSubmitContract;
import com.robinhood.android.acatsin.submit.AcatsInSubmitViewState;
import com.robinhood.android.acatsin.util.Eithers;
import com.robinhood.android.acatsin.util.names.NamesOnAccount;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.models.retirement.p194db.RetirementMatchRate;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.AccountFeature;
import com.robinhood.librobinhood.data.store.bonfire.AcatsTransferStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementMatchStore;
import com.robinhood.librobinhood.data.store.bonfire.slip.SlipAgreementsStore;
import com.robinhood.models.acats.p299db.bonfire.AcatsTransfer;
import com.robinhood.models.api.bonfire.ApiAcatsTransferRequest;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p355ui.UiSlipAgreements;
import com.robinhood.utils.Either;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.SinglesKt;
import com.robinhood.utils.p409ui.view.Drawables;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Singles;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.HttpUrl;

/* compiled from: AcatsInSubmitDuxo.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001'BQ\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u000e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 J\u0012\u0010!\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010$\u001a\u00020\u001d2\b\u0010%\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010&\u001a\u0004\u0018\u00010#H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/acatsin/submit/AcatsInSubmitDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/acatsin/submit/AcatsInSubmitDataState;", "Lcom/robinhood/android/acatsin/submit/AcatsInSubmitViewState;", "Lcom/robinhood/android/rhimage/ImageLoader$Target;", "Lcom/robinhood/android/udf/HasSavedState;", "acatsTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsTransferStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "retirementMatchStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;", "slipAgreementsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipAgreementsStore;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/acatsin/submit/AcatsInSubmitStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/AcatsTransferStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipAgreementsStore;Lcom/robinhood/android/rhimage/ImageLoader;Lcom/robinhood/librobinhood/data/store/AccountAccessStore;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/acatsin/submit/AcatsInSubmitStateProvider;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "submit", "request", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransferRequest;", "onSuccess", "result", "Landroid/graphics/drawable/Drawable;", "onError", "error", "placeholder", "Companion", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInSubmitDuxo extends BaseDuxo<AcatsInSubmitDataState, AcatsInSubmitViewState> implements ImageLoader.Target, HasSavedState {
    private final AcatsTransferStore acatsTransferStore;
    private final AccountAccessStore accountAccessStore;
    private final AccountProvider accountProvider;
    private final ImageLoader imageLoader;
    private final RetirementMatchStore retirementMatchStore;
    private final SavedStateHandle savedStateHandle;
    private final SlipAgreementsStore slipAgreementsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.rhimage.ImageLoader.Target
    public void onError(Drawable error) {
    }

    @Override // com.robinhood.android.rhimage.ImageLoader.Target
    public void onStart(Drawable placeholder) {
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AcatsInSubmitDuxo(AcatsTransferStore acatsTransferStore, AccountProvider accountProvider, RetirementMatchStore retirementMatchStore, SlipAgreementsStore slipAgreementsStore, ImageLoader imageLoader, AccountAccessStore accountAccessStore, DuxoBundle duxoBundle, AcatsInSubmitStateProvider stateProvider, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(acatsTransferStore, "acatsTransferStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(retirementMatchStore, "retirementMatchStore");
        Intrinsics.checkNotNullParameter(slipAgreementsStore, "slipAgreementsStore");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        Companion companion = INSTANCE;
        Either<ApiBrokerage, String> brokerageOrDtcNumber = ((AcatsInSubmitContract.Key) companion.getArgs(savedStateHandle)).getBrokerageOrDtcNumber();
        String rhsAccountType = ((AcatsInSubmitContract.Key) companion.getArgs(savedStateHandle)).getRhsAccountType();
        String contraAccountNumber = ((AcatsInSubmitContract.Key) companion.getArgs(savedStateHandle)).getContraAccountNumber();
        NamesOnAccount accountNames = ((AcatsInSubmitContract.Key) companion.getArgs(savedStateHandle)).getAccountNames();
        List<UiAcatsAsset> assets = ((AcatsInSubmitContract.Key) companion.getArgs(savedStateHandle)).getAssets();
        super(new AcatsInSubmitDataState(uuidRandomUUID, brokerageOrDtcNumber, rhsAccountType, contraAccountNumber, accountNames, assets == null ? CollectionsKt.emptyList() : assets, ((AcatsInSubmitContract.Key) companion.getArgs(savedStateHandle)).getRhsAccountNumber(), ((AcatsInSubmitContract.Key) companion.getArgs(savedStateHandle)).getSelectedAccountType(), null, null, null, null, ((AcatsInSubmitContract.Key) companion.getArgs(savedStateHandle)).getTaxableAccountBonusRateString(), false, null, ((AcatsInSubmitContract.Key) companion.getArgs(savedStateHandle)).getRequiresCoOwnerSignature(), 28416, null), stateProvider, duxoBundle);
        this.acatsTransferStore = acatsTransferStore;
        this.accountProvider = accountProvider;
        this.retirementMatchStore = retirementMatchStore;
        this.slipAgreementsStore = slipAgreementsStore;
        this.imageLoader = imageLoader;
        this.accountAccessStore = accountAccessStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        Companion companion = INSTANCE;
        HttpUrl logoUrl = Eithers.getLogoUrl(((AcatsInSubmitContract.Key) companion.getArgs((HasSavedState) this)).getBrokerageOrDtcNumber());
        if (logoUrl != null) {
            this.imageLoader.load(logoUrl).into(this);
        }
        Observable<R> observableFlatMap = this.accountProvider.streamAccountByRhs(((AcatsInSubmitContract.Key) companion.getArgs((HasSavedState) this)).getRhsAccountNumber()).flatMap(new Function() { // from class: com.robinhood.android.acatsin.submit.AcatsInSubmitDuxo.onStart.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<RetirementMatchRate>> apply(Account account) {
                Intrinsics.checkNotNullParameter(account, "account");
                if (account.getBrokerageAccountType().isRetirement()) {
                    return AcatsInSubmitDuxo.this.retirementMatchStore.stream().map(new Function() { // from class: com.robinhood.android.acatsin.submit.AcatsInSubmitDuxo.onStart.1.1
                        @Override // io.reactivex.functions.Function
                        public final Optional<RetirementMatchRate> apply(RetirementMatchRate it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return Optional3.asOptional(it);
                        }
                    });
                }
                return Observable.just(Optional2.INSTANCE);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFlatMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.acatsin.submit.AcatsInSubmitDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInSubmitDuxo.onStart$lambda$0(this.f$0, (Optional) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.accountProvider.streamAccountByRhs(((AcatsInSubmitContract.Key) companion.getArgs((HasSavedState) this)).getRhsAccountNumber()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.acatsin.submit.AcatsInSubmitDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInSubmitDuxo.onStart$lambda$1(this.f$0, (Account) obj);
            }
        });
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C80544(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(AcatsInSubmitDuxo acatsInSubmitDuxo, Optional optional) {
        acatsInSubmitDuxo.applyMutation(new AcatsInSubmitDuxo2((RetirementMatchRate) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(AcatsInSubmitDuxo acatsInSubmitDuxo, Account account) {
        Intrinsics.checkNotNullParameter(account, "account");
        acatsInSubmitDuxo.applyMutation(new AcatsInSubmitDuxo3(account, null));
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsInSubmitDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.submit.AcatsInSubmitDuxo$onStart$4", m3645f = "AcatsInSubmitDuxo.kt", m3646l = {91}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.submit.AcatsInSubmitDuxo$onStart$4 */
    static final class C80544 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C80544(Continuation<? super C80544> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInSubmitDuxo.this.new C80544(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C80544) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> featureAccess = AcatsInSubmitDuxo.this.accountAccessStore.getFeatureAccess(((AcatsInSubmitContract.Key) AcatsInSubmitDuxo.INSTANCE.getArgs((HasSavedState) AcatsInSubmitDuxo.this)).getRhsAccountNumber(), AccountFeature.ACATS_BROKERAGE_MATCH);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AcatsInSubmitDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(featureAccess, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: AcatsInSubmitDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isAcatsBrokerageMatchSupported", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acatsin.submit.AcatsInSubmitDuxo$onStart$4$1", m3645f = "AcatsInSubmitDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.acatsin.submit.AcatsInSubmitDuxo$onStart$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ AcatsInSubmitDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AcatsInSubmitDuxo acatsInSubmitDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = acatsInSubmitDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: AcatsInSubmitDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/submit/AcatsInSubmitDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.acatsin.submit.AcatsInSubmitDuxo$onStart$4$1$1", m3645f = "AcatsInSubmitDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.acatsin.submit.AcatsInSubmitDuxo$onStart$4$1$1, reason: invalid class name and collision with other inner class name */
            static final class C495101 extends ContinuationImpl7 implements Function2<AcatsInSubmitDataState, Continuation<? super AcatsInSubmitDataState>, Object> {
                final /* synthetic */ boolean $isAcatsBrokerageMatchSupported;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C495101(boolean z, Continuation<? super C495101> continuation) {
                    super(2, continuation);
                    this.$isAcatsBrokerageMatchSupported = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C495101 c495101 = new C495101(this.$isAcatsBrokerageMatchSupported, continuation);
                    c495101.L$0 = obj;
                    return c495101;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AcatsInSubmitDataState acatsInSubmitDataState, Continuation<? super AcatsInSubmitDataState> continuation) {
                    return ((C495101) create(acatsInSubmitDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    AcatsInSubmitDataState acatsInSubmitDataState = (AcatsInSubmitDataState) this.L$0;
                    return acatsInSubmitDataState.copy((63487 & 1) != 0 ? acatsInSubmitDataState.refId : null, (63487 & 2) != 0 ? acatsInSubmitDataState.brokerageOrDtcNumber : null, (63487 & 4) != 0 ? acatsInSubmitDataState.rhsAccountType : null, (63487 & 8) != 0 ? acatsInSubmitDataState.contraAccountNumber : null, (63487 & 16) != 0 ? acatsInSubmitDataState.namesOnAccount : null, (63487 & 32) != 0 ? acatsInSubmitDataState.assets : null, (63487 & 64) != 0 ? acatsInSubmitDataState.rhsAccountNumber : null, (63487 & 128) != 0 ? acatsInSubmitDataState.selectedAccountType : null, (63487 & 256) != 0 ? acatsInSubmitDataState.selectedAccountManagementType : null, (63487 & 512) != 0 ? acatsInSubmitDataState.acatsTransferRequestState : null, (63487 & 1024) != 0 ? acatsInSubmitDataState.contraBrokerLogo : null, (63487 & 2048) != 0 ? acatsInSubmitDataState.retirementMatchRate : null, (63487 & 4096) != 0 ? acatsInSubmitDataState.taxableAccountBonusRateString : null, (63487 & 8192) != 0 ? acatsInSubmitDataState.isAcatsBrokerageMatchSupported : this.$isAcatsBrokerageMatchSupported, (63487 & 16384) != 0 ? acatsInSubmitDataState.account : null, (63487 & 32768) != 0 ? acatsInSubmitDataState.requiresCoOwnerSignature : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C495101(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: AcatsInSubmitDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/submit/AcatsInSubmitDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.submit.AcatsInSubmitDuxo$submit$1", m3645f = "AcatsInSubmitDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.submit.AcatsInSubmitDuxo$submit$1 */
    static final class C80561 extends ContinuationImpl7 implements Function2<AcatsInSubmitDataState, Continuation<? super AcatsInSubmitDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C80561(Continuation<? super C80561> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C80561 c80561 = new C80561(continuation);
            c80561.L$0 = obj;
            return c80561;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInSubmitDataState acatsInSubmitDataState, Continuation<? super AcatsInSubmitDataState> continuation) {
            return ((C80561) create(acatsInSubmitDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AcatsInSubmitDataState acatsInSubmitDataState = (AcatsInSubmitDataState) this.L$0;
            return acatsInSubmitDataState.copy((63487 & 1) != 0 ? acatsInSubmitDataState.refId : null, (63487 & 2) != 0 ? acatsInSubmitDataState.brokerageOrDtcNumber : null, (63487 & 4) != 0 ? acatsInSubmitDataState.rhsAccountType : null, (63487 & 8) != 0 ? acatsInSubmitDataState.contraAccountNumber : null, (63487 & 16) != 0 ? acatsInSubmitDataState.namesOnAccount : null, (63487 & 32) != 0 ? acatsInSubmitDataState.assets : null, (63487 & 64) != 0 ? acatsInSubmitDataState.rhsAccountNumber : null, (63487 & 128) != 0 ? acatsInSubmitDataState.selectedAccountType : null, (63487 & 256) != 0 ? acatsInSubmitDataState.selectedAccountManagementType : null, (63487 & 512) != 0 ? acatsInSubmitDataState.acatsTransferRequestState : AcatsInSubmitViewState.AcatsTransferRequestState.Loading.INSTANCE, (63487 & 1024) != 0 ? acatsInSubmitDataState.contraBrokerLogo : null, (63487 & 2048) != 0 ? acatsInSubmitDataState.retirementMatchRate : null, (63487 & 4096) != 0 ? acatsInSubmitDataState.taxableAccountBonusRateString : null, (63487 & 8192) != 0 ? acatsInSubmitDataState.isAcatsBrokerageMatchSupported : false, (63487 & 16384) != 0 ? acatsInSubmitDataState.account : null, (63487 & 32768) != 0 ? acatsInSubmitDataState.requiresCoOwnerSignature : false);
        }
    }

    public final void submit(ApiAcatsTransferRequest request) {
        Single singleJust;
        Intrinsics.checkNotNullParameter(request, "request");
        applyMutation(new C80561(null));
        Single singleRecoverFromRefIdConflict = SinglesKt.recoverFromRefIdConflict(this.acatsTransferStore.postTransferRequest(request), new Function1() { // from class: com.robinhood.android.acatsin.submit.AcatsInSubmitDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInSubmitDuxo.submit$lambda$2(this.f$0, (UUID) obj);
            }
        });
        Companion companion = INSTANCE;
        List<UiSlipAgreements.Agreement> slipAgreements = ((AcatsInSubmitContract.Key) companion.getArgs((HasSavedState) this)).getSlipAgreements();
        if (slipAgreements == null || (singleJust = SlipAgreementsStore.acceptAgreements$default(this.slipAgreementsStore, ((AcatsInSubmitContract.Key) companion.getArgs((HasSavedState) this)).getRhsAccountNumber(), slipAgreements, null, 4, null).toSingleDefault(Unit.INSTANCE)) == null) {
            singleJust = Single.just(Unit.INSTANCE);
            Intrinsics.checkNotNullExpressionValue(singleJust, "just(...)");
        }
        LifecycleHost.DefaultImpls.bind$default(this, Singles.INSTANCE.zip(singleRecoverFromRefIdConflict, singleJust), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.acatsin.submit.AcatsInSubmitDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInSubmitDuxo.submit$lambda$4(this.f$0, (Tuples2) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.acatsin.submit.AcatsInSubmitDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInSubmitDuxo.submit$lambda$5(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Single submit$lambda$2(AcatsInSubmitDuxo acatsInSubmitDuxo, UUID conflictingResourceId) {
        Intrinsics.checkNotNullParameter(conflictingResourceId, "conflictingResourceId");
        return RxFactory.DefaultImpls.rxSingle$default(acatsInSubmitDuxo, null, new AcatsInSubmitDuxo6(acatsInSubmitDuxo, conflictingResourceId, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submit$lambda$4(AcatsInSubmitDuxo acatsInSubmitDuxo, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        AcatsTransfer acatsTransfer = (AcatsTransfer) tuples2.component1();
        AcatsTransferStore.refresh$default(acatsInSubmitDuxo.acatsTransferStore, false, 1, null);
        acatsInSubmitDuxo.applyMutation(new AcatsInSubmitDuxo4(acatsTransfer, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submit$lambda$5(AcatsInSubmitDuxo acatsInSubmitDuxo, Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        acatsInSubmitDuxo.applyMutation(new AcatsInSubmitDuxo5(t, null));
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsInSubmitDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/submit/AcatsInSubmitDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.submit.AcatsInSubmitDuxo$onSuccess$1", m3645f = "AcatsInSubmitDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.submit.AcatsInSubmitDuxo$onSuccess$1 */
    static final class C80551 extends ContinuationImpl7 implements Function2<AcatsInSubmitDataState, Continuation<? super AcatsInSubmitDataState>, Object> {
        final /* synthetic */ Drawable $result;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C80551(Drawable drawable, Continuation<? super C80551> continuation) {
            super(2, continuation);
            this.$result = drawable;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C80551 c80551 = new C80551(this.$result, continuation);
            c80551.L$0 = obj;
            return c80551;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInSubmitDataState acatsInSubmitDataState, Continuation<? super AcatsInSubmitDataState> continuation) {
            return ((C80551) create(acatsInSubmitDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AcatsInSubmitDataState acatsInSubmitDataState = (AcatsInSubmitDataState) this.L$0;
            return acatsInSubmitDataState.copy((63487 & 1) != 0 ? acatsInSubmitDataState.refId : null, (63487 & 2) != 0 ? acatsInSubmitDataState.brokerageOrDtcNumber : null, (63487 & 4) != 0 ? acatsInSubmitDataState.rhsAccountType : null, (63487 & 8) != 0 ? acatsInSubmitDataState.contraAccountNumber : null, (63487 & 16) != 0 ? acatsInSubmitDataState.namesOnAccount : null, (63487 & 32) != 0 ? acatsInSubmitDataState.assets : null, (63487 & 64) != 0 ? acatsInSubmitDataState.rhsAccountNumber : null, (63487 & 128) != 0 ? acatsInSubmitDataState.selectedAccountType : null, (63487 & 256) != 0 ? acatsInSubmitDataState.selectedAccountManagementType : null, (63487 & 512) != 0 ? acatsInSubmitDataState.acatsTransferRequestState : null, (63487 & 1024) != 0 ? acatsInSubmitDataState.contraBrokerLogo : Drawables.toBitmap$default(this.$result, 0, 0, null, 7, null), (63487 & 2048) != 0 ? acatsInSubmitDataState.retirementMatchRate : null, (63487 & 4096) != 0 ? acatsInSubmitDataState.taxableAccountBonusRateString : null, (63487 & 8192) != 0 ? acatsInSubmitDataState.isAcatsBrokerageMatchSupported : false, (63487 & 16384) != 0 ? acatsInSubmitDataState.account : null, (63487 & 32768) != 0 ? acatsInSubmitDataState.requiresCoOwnerSignature : false);
        }
    }

    @Override // com.robinhood.android.rhimage.ImageLoader.Target
    public void onSuccess(Drawable result) {
        if (result != null) {
            applyMutation(new C80551(result, null));
        }
    }

    /* compiled from: AcatsInSubmitDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/submit/AcatsInSubmitDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/acatsin/submit/AcatsInSubmitDuxo;", "Lcom/robinhood/android/acatsin/submit/AcatsInSubmitContract$Key;", "<init>", "()V", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AcatsInSubmitDuxo, AcatsInSubmitContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInSubmitContract.Key getArgs(SavedStateHandle savedStateHandle) {
            return (AcatsInSubmitContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInSubmitContract.Key getArgs(AcatsInSubmitDuxo acatsInSubmitDuxo) {
            return (AcatsInSubmitContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, acatsInSubmitDuxo);
        }
    }
}
