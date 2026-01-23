package com.robinhood.android.futures.onboarding.p145ui;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.agreements.models.ApiPreviousAgreement;
import com.robinhood.android.futures.contracts.FuturesOnboardingActivityKey;
import com.robinhood.android.futures.onboarding.p145ui.FuturesOnboardingDuxo;
import com.robinhood.android.futures.onboarding.p145ui.FuturesOnboardingDuxo5;
import com.robinhood.android.futures.onboarding.p145ui.arbitration.FuturesOnboardingArbitrationAgreementDuxo;
import com.robinhood.android.lib.futures.trade.MarketSessionChangeDataState;
import com.robinhood.android.lib.futures.trade.StreamMarketSessionChangeStateUseCase;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.regiongate.EventContractsRegionGate;
import com.robinhood.android.regiongate.FuturesTradingRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.ceres.p284v1.AccountFuturesEligibilityStatusDto;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.CheckAccountFuturesEligibilityRequestDto;
import com.robinhood.ceres.p284v1.CheckAccountFuturesEligibilityResponseDto;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.p320db.Account;
import com.robinhood.store.futures.FuturesAccountStore;
import com.robinhood.store.futures.FuturesLocaleStore;
import com.robinhood.store.futures.FuturesLocaleStore2;
import com.robinhood.store.futures.mib.MiBFuturesState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: FuturesOnboardingDuxo.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 '2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001'BI\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0016\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0082@¢\u0006\u0002\u0010\u001fJ\u000e\u0010 \u001a\u00020\u001bH\u0082@¢\u0006\u0002\u0010!J\u000e\u0010\"\u001a\u00020\u001bH\u0082@¢\u0006\u0002\u0010!J\u000e\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020\u001bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingDataState;", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingViewState;", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "ceres", "Lcom/robinhood/ceres/v1/Ceres;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresLocaleStore", "Lcom/robinhood/store/futures/FuturesLocaleStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "streamMarketSessionChangeStateUseCase", "Lcom/robinhood/android/lib/futures/trade/StreamMarketSessionChangeStateUseCase;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/agreements/AgreementsStore;Lcom/robinhood/ceres/v1/Ceres;Lcom/robinhood/store/futures/FuturesAccountStore;Lcom/robinhood/store/futures/FuturesLocaleStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/android/lib/futures/trade/StreamMarketSessionChangeStateUseCase;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "checkUserIsEligibleForType", "isEventContract", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadEligibility", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadPreviousArbAgreement", "onPreviousArbitrationAgreementLoaded", "previousAgreement", "Lcom/robinhood/android/agreements/models/ApiPreviousAgreement;", "onSignupClicked", "Companion", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class FuturesOnboardingDuxo extends BaseDuxo3<FuturesOnboardingDataState, FuturesOnboardingViewState, FuturesOnboardingDuxo5> implements HasSavedState {
    private final AgreementsStore agreementsStore;
    private final Ceres ceres;
    private final FuturesAccountStore futuresAccountStore;
    private final FuturesLocaleStore futuresLocaleStore;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;
    private final StreamMarketSessionChangeStateUseCase streamMarketSessionChangeStateUseCase;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: FuturesOnboardingDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo", m3645f = "FuturesOnboardingDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, m3647m = "checkUserIsEligibleForType")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$checkUserIsEligibleForType$1 */
    static final class C173031 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C173031(Continuation<? super C173031> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesOnboardingDuxo.this.checkUserIsEligibleForType(false, this);
        }
    }

    /* compiled from: FuturesOnboardingDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo", m3645f = "FuturesOnboardingDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE, 155}, m3647m = "loadEligibility")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$loadEligibility$1 */
    static final class C173041 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C173041(Continuation<? super C173041> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesOnboardingDuxo.this.loadEligibility(this);
        }
    }

    /* compiled from: FuturesOnboardingDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo", m3645f = "FuturesOnboardingDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE}, m3647m = "loadPreviousArbAgreement")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$loadPreviousArbAgreement$1 */
    static final class C173061 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C173061(Continuation<? super C173061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesOnboardingDuxo.this.loadPreviousArbAgreement(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesOnboardingDuxo(AgreementsStore agreementsStore, Ceres ceres, FuturesAccountStore futuresAccountStore, FuturesLocaleStore futuresLocaleStore, RegionGateProvider regionGateProvider, StreamMarketSessionChangeStateUseCase streamMarketSessionChangeStateUseCase, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new FuturesOnboardingDataState(((FuturesOnboardingActivityKey) INSTANCE.getExtras(savedStateHandle)).getPostOnboardingNavigation(), null, null, null, null, null, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), FuturesOnboardingDuxo6.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
        Intrinsics.checkNotNullParameter(ceres, "ceres");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(futuresLocaleStore, "futuresLocaleStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(streamMarketSessionChangeStateUseCase, "streamMarketSessionChangeStateUseCase");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.agreementsStore = agreementsStore;
        this.ceres = ceres;
        this.futuresAccountStore = futuresAccountStore;
        this.futuresLocaleStore = futuresLocaleStore;
        this.regionGateProvider = regionGateProvider;
        this.streamMarketSessionChangeStateUseCase = streamMarketSessionChangeStateUseCase;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C173081(null));
    }

    /* compiled from: FuturesOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1", m3645f = "FuturesOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1 */
    static final class C173081 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C173081(Continuation<? super C173081> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C173081 c173081 = FuturesOnboardingDuxo.this.new C173081(continuation);
            c173081.L$0 = obj;
            return c173081;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C173081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            final FuturesOnboardingDuxo futuresOnboardingDuxo = FuturesOnboardingDuxo.this;
            futuresOnboardingDuxo.withDataState(new Function1() { // from class: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return FuturesOnboardingDuxo.C173081.invokeSuspend$lambda$0(coroutineScope, futuresOnboardingDuxo, (FuturesOnboardingDataState) obj2);
                }
            });
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(FuturesOnboardingDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(FuturesOnboardingDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(FuturesOnboardingDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(FuturesOnboardingDuxo.this, null), 3, null);
            FuturesOnboardingActivityKey.PostOnboardingNavigation postOnboardingNavigation = ((FuturesOnboardingActivityKey) FuturesOnboardingDuxo.INSTANCE.getExtras((HasSavedState) FuturesOnboardingDuxo.this)).getPostOnboardingNavigation();
            FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToEcOrderForm routeToEcOrderForm = postOnboardingNavigation instanceof FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToEcOrderForm ? (FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToEcOrderForm) postOnboardingNavigation : null;
            if (routeToEcOrderForm != null) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(FuturesOnboardingDuxo.this, routeToEcOrderForm, null), 3, null);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(CoroutineScope coroutineScope, FuturesOnboardingDuxo futuresOnboardingDuxo, FuturesOnboardingDataState futuresOnboardingDataState) {
            if (!futuresOnboardingDataState.isUserEligible()) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FuturesOnboardingDuxo3(futuresOnboardingDuxo, null), 3, null);
            }
            if (!futuresOnboardingDataState.isArbLoaded()) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FuturesOnboardingDuxo4(futuresOnboardingDuxo, null), 3, null);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: FuturesOnboardingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$2", m3645f = "FuturesOnboardingDuxo.kt", m3646l = {73}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesOnboardingDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(FuturesOnboardingDuxo futuresOnboardingDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = futuresOnboardingDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FuturesOnboardingDuxo futuresOnboardingDuxo = this.this$0;
                    boolean zIsEventsContracts = ((FuturesOnboardingActivityKey) FuturesOnboardingDuxo.INSTANCE.getExtras((HasSavedState) futuresOnboardingDuxo)).isEventsContracts();
                    this.label = 1;
                    if (futuresOnboardingDuxo.checkUserIsEligibleForType(zIsEventsContracts, this) == coroutine_suspended) {
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

        /* compiled from: FuturesOnboardingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$3", m3645f = "FuturesOnboardingDuxo.kt", m3646l = {78}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesOnboardingDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(FuturesOnboardingDuxo futuresOnboardingDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = futuresOnboardingDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<FuturesLocaleStore2> flowStreamFuturesLocale = this.this$0.futuresLocaleStore.streamFuturesLocale();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamFuturesLocale, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: FuturesOnboardingDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "locale", "Lcom/robinhood/store/futures/FuturesLocale;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$3$1", m3645f = "FuturesOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesLocaleStore2, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesOnboardingDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesOnboardingDuxo futuresOnboardingDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresOnboardingDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesLocaleStore2 futuresLocaleStore2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(futuresLocaleStore2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesOnboardingDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$3$1$1", m3645f = "FuturesOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501251 extends ContinuationImpl7 implements Function2<FuturesOnboardingDataState, Continuation<? super FuturesOnboardingDataState>, Object> {
                    final /* synthetic */ FuturesLocaleStore2 $locale;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501251(FuturesLocaleStore2 futuresLocaleStore2, Continuation<? super C501251> continuation) {
                        super(2, continuation);
                        this.$locale = futuresLocaleStore2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501251 c501251 = new C501251(this.$locale, continuation);
                        c501251.L$0 = obj;
                        return c501251;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesOnboardingDataState futuresOnboardingDataState, Continuation<? super FuturesOnboardingDataState> continuation) {
                        return ((C501251) create(futuresOnboardingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesOnboardingDataState.copy$default((FuturesOnboardingDataState) this.L$0, null, null, null, null, this.$locale, null, null, 111, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501251((FuturesLocaleStore2) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesOnboardingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$4", m3645f = "FuturesOnboardingDuxo.kt", m3646l = {90}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesOnboardingDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(FuturesOnboardingDuxo futuresOnboardingDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = futuresOnboardingDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<FuturesOnboardingViewState> stateFlow = this.this$0.getStateFlow();
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<String>() { // from class: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$4$invokeSuspend$$inlined$mapNotNull$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$4$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$4$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "FuturesOnboardingDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$4$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    String rhsAccountNumber = ((FuturesOnboardingViewState) obj).getRhsAccountNumber();
                                    if (rhsAccountNumber != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(rhsAccountNumber, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    }), new C17299xa9761735(null, this.this$0));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: FuturesOnboardingDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/models/futures/db/FuturesAccount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$4$3", m3645f = "FuturesOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$4$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<FuturesAccount, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesOnboardingDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(FuturesOnboardingDuxo futuresOnboardingDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresOnboardingDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesAccount futuresAccount, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(futuresAccount, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesOnboardingDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$4$3$1", m3645f = "FuturesOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$4$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesOnboardingDataState, Continuation<? super FuturesOnboardingDataState>, Object> {
                    final /* synthetic */ FuturesAccount $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(FuturesAccount futuresAccount, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$it = futuresAccount;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesOnboardingDataState futuresOnboardingDataState, Continuation<? super FuturesOnboardingDataState> continuation) {
                        return ((AnonymousClass1) create(futuresOnboardingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesOnboardingDataState.copy$default((FuturesOnboardingDataState) this.L$0, null, null, null, null, null, this.$it, null, 95, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((FuturesAccount) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesOnboardingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$5", m3645f = "FuturesOnboardingDuxo.kt", m3646l = {102}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesOnboardingDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(FuturesOnboardingDuxo futuresOnboardingDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = futuresOnboardingDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<FuturesOnboardingViewState> stateFlow = this.this$0.getStateFlow();
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<String>() { // from class: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$5$invokeSuspend$$inlined$mapNotNull$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$5$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$5$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "FuturesOnboardingDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$5$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    String rhsAccountNumber = ((FuturesOnboardingViewState) obj).getRhsAccountNumber();
                                    if (rhsAccountNumber != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(rhsAccountNumber, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    }), new C17301x940814(null, this.this$0));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: FuturesOnboardingDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/models/futures/db/FuturesAccount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$5$3", m3645f = "FuturesOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$5$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<FuturesAccount, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesOnboardingDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(FuturesOnboardingDuxo futuresOnboardingDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresOnboardingDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesAccount futuresAccount, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(futuresAccount, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesOnboardingDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$5$3$1", m3645f = "FuturesOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$5$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesOnboardingDataState, Continuation<? super FuturesOnboardingDataState>, Object> {
                    final /* synthetic */ FuturesAccount $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(FuturesAccount futuresAccount, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$it = futuresAccount;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesOnboardingDataState futuresOnboardingDataState, Continuation<? super FuturesOnboardingDataState> continuation) {
                        return ((AnonymousClass1) create(futuresOnboardingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesOnboardingDataState.copy$default((FuturesOnboardingDataState) this.L$0, null, null, null, null, null, null, this.$it, 63, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((FuturesAccount) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesOnboardingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$6", m3645f = "FuturesOnboardingDuxo.kt", m3646l = {114}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToEcOrderForm $routeToOrderForm;
            int label;
            final /* synthetic */ FuturesOnboardingDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(FuturesOnboardingDuxo futuresOnboardingDuxo, FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToEcOrderForm routeToEcOrderForm, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.this$0 = futuresOnboardingDuxo;
                this.$routeToOrderForm = routeToEcOrderForm;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.this$0, this.$routeToOrderForm, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowInvoke$default = StreamMarketSessionChangeStateUseCase.invoke$default(this.this$0.streamMarketSessionChangeStateUseCase, this.$routeToOrderForm.getContractId(), null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$routeToOrderForm, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowInvoke$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: FuturesOnboardingDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "sessionChangeDataState", "Lcom/robinhood/android/lib/futures/trade/MarketSessionChangeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$6$1", m3645f = "FuturesOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$6$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MarketSessionChangeDataState, Continuation<? super Unit>, Object> {
                final /* synthetic */ FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToEcOrderForm $routeToOrderForm;
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesOnboardingDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesOnboardingDuxo futuresOnboardingDuxo, FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToEcOrderForm routeToEcOrderForm, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresOnboardingDuxo;
                    this.$routeToOrderForm = routeToEcOrderForm;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$routeToOrderForm, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MarketSessionChangeDataState marketSessionChangeDataState, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(marketSessionChangeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesOnboardingDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$6$1$1", m3645f = "FuturesOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onCreate$1$6$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501261 extends ContinuationImpl7 implements Function2<FuturesOnboardingDataState, Continuation<? super FuturesOnboardingDataState>, Object> {
                    final /* synthetic */ FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToEcOrderForm $routeToOrderForm;
                    final /* synthetic */ MarketSessionChangeDataState $sessionChangeDataState;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501261(MarketSessionChangeDataState marketSessionChangeDataState, FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToEcOrderForm routeToEcOrderForm, Continuation<? super C501261> continuation) {
                        super(2, continuation);
                        this.$sessionChangeDataState = marketSessionChangeDataState;
                        this.$routeToOrderForm = routeToEcOrderForm;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501261 c501261 = new C501261(this.$sessionChangeDataState, this.$routeToOrderForm, continuation);
                        c501261.L$0 = obj;
                        return c501261;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesOnboardingDataState futuresOnboardingDataState, Continuation<? super FuturesOnboardingDataState> continuation) {
                        return ((C501261) create(futuresOnboardingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        FuturesOnboardingActivityKey.PostOnboardingNavigation routeToEdpByContractId;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        FuturesOnboardingDataState futuresOnboardingDataState = (FuturesOnboardingDataState) this.L$0;
                        if (!Intrinsics.areEqual(this.$sessionChangeDataState.isOpen(), boxing.boxBoolean(false))) {
                            routeToEdpByContractId = this.$routeToOrderForm;
                        } else {
                            routeToEdpByContractId = new FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToEdpByContractId(this.$routeToOrderForm.getContractId());
                        }
                        return FuturesOnboardingDataState.copy$default(futuresOnboardingDataState, routeToEdpByContractId, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501261((MarketSessionChangeDataState) this.L$0, this.$routeToOrderForm, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r9 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (r9 == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object checkUserIsEligibleForType(boolean z, Continuation<? super Unit> continuation) {
        C173031 c173031;
        if (continuation instanceof C173031) {
            c173031 = (C173031) continuation;
            int i = c173031.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c173031.label = i - Integer.MIN_VALUE;
            } else {
                c173031 = new C173031(continuation);
            }
        }
        C173031 c1730312 = c173031;
        Object regionGateState$default = c1730312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c1730312.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(regionGateState$default);
            if (z) {
                RegionGateProvider regionGateProvider = this.regionGateProvider;
                EventContractsRegionGate eventContractsRegionGate = EventContractsRegionGate.INSTANCE;
                c1730312.label = 1;
                regionGateState$default = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider, eventContractsRegionGate, false, c1730312, 2, null);
            } else {
                RegionGateProvider regionGateProvider2 = this.regionGateProvider;
                FuturesTradingRegionGate futuresTradingRegionGate = FuturesTradingRegionGate.INSTANCE;
                c1730312.label = 2;
                regionGateState$default = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider2, futuresTradingRegionGate, false, c1730312, 2, null);
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            ResultKt.throwOnFailure(regionGateState$default);
            if (!((Boolean) regionGateState$default).booleanValue()) {
                submit(FuturesOnboardingDuxo5.UserNotInExperimentEvent.INSTANCE);
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(regionGateState$default);
            if (!((Boolean) regionGateState$default).booleanValue()) {
                submit(FuturesOnboardingDuxo5.UserNotInExperimentEvent.INSTANCE);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(8:12|43|13|36|37|38|41|42)(2:17|18))(1:19))(3:20|(0)|34)|23|(1:25)(1:26)|45|27|(4:29|38|41|42)(3:32|(6:35|36|37|38|41|42)|34)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        r0 = r9;
        r9 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadEligibility(Continuation<? super Unit> continuation) {
        C173041 c173041;
        MiBFuturesState miBFuturesState;
        MiBFuturesState miBFuturesState2;
        CheckAccountFuturesEligibilityResponseDto checkAccountFuturesEligibilityResponseDto;
        Object objM28550constructorimpl;
        if (continuation instanceof C173041) {
            c173041 = (C173041) continuation;
            int i = c173041.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c173041.label = i - Integer.MIN_VALUE;
            } else {
                c173041 = new C173041(continuation);
            }
        }
        Object objForceGetMibFuturesState = c173041.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c173041.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceGetMibFuturesState);
            FuturesAccountStore futuresAccountStore = this.futuresAccountStore;
            c173041.label = 1;
            objForceGetMibFuturesState = futuresAccountStore.forceGetMibFuturesState(c173041);
            if (objForceGetMibFuturesState != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            miBFuturesState2 = (MiBFuturesState) c173041.L$0;
            try {
                ResultKt.throwOnFailure(objForceGetMibFuturesState);
                MiBFuturesState miBFuturesState3 = miBFuturesState2;
                checkAccountFuturesEligibilityResponseDto = (CheckAccountFuturesEligibilityResponseDto) objForceGetMibFuturesState;
                miBFuturesState = miBFuturesState3;
                objM28550constructorimpl = Result.m28550constructorimpl(checkAccountFuturesEligibilityResponseDto);
            } catch (Throwable th) {
                th = th;
                Result.Companion companion = Result.INSTANCE;
                MiBFuturesState miBFuturesState4 = miBFuturesState2;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                miBFuturesState = miBFuturesState4;
                applyMutation(new C173052(objM28550constructorimpl, miBFuturesState, null));
                return Unit.INSTANCE;
            }
            applyMutation(new C173052(objM28550constructorimpl, miBFuturesState, null));
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objForceGetMibFuturesState);
        miBFuturesState = (MiBFuturesState) objForceGetMibFuturesState;
        Account futuresAllowedRhsAccount = miBFuturesState.getFuturesAllowedRhsAccount();
        String accountNumber = futuresAllowedRhsAccount != null ? futuresAllowedRhsAccount.getAccountNumber() : null;
        Result.Companion companion2 = Result.INSTANCE;
        if (accountNumber == null) {
            checkAccountFuturesEligibilityResponseDto = new CheckAccountFuturesEligibilityResponseDto(AccountFuturesEligibilityStatusDto.INELIGIBLE);
            objM28550constructorimpl = Result.m28550constructorimpl(checkAccountFuturesEligibilityResponseDto);
            applyMutation(new C173052(objM28550constructorimpl, miBFuturesState, null));
            return Unit.INSTANCE;
        }
        Ceres ceres = this.ceres;
        CheckAccountFuturesEligibilityRequestDto checkAccountFuturesEligibilityRequestDto = new CheckAccountFuturesEligibilityRequestDto(accountNumber);
        c173041.L$0 = miBFuturesState;
        c173041.label = 2;
        Object objCheckAccountFuturesEligibility = ceres.CheckAccountFuturesEligibility(checkAccountFuturesEligibilityRequestDto, c173041);
        if (objCheckAccountFuturesEligibility != coroutine_suspended) {
            miBFuturesState2 = miBFuturesState;
            objForceGetMibFuturesState = objCheckAccountFuturesEligibility;
            MiBFuturesState miBFuturesState32 = miBFuturesState2;
            checkAccountFuturesEligibilityResponseDto = (CheckAccountFuturesEligibilityResponseDto) objForceGetMibFuturesState;
            miBFuturesState = miBFuturesState32;
            objM28550constructorimpl = Result.m28550constructorimpl(checkAccountFuturesEligibilityResponseDto);
            applyMutation(new C173052(objM28550constructorimpl, miBFuturesState, null));
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* compiled from: FuturesOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$loadEligibility$2", m3645f = "FuturesOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$loadEligibility$2 */
    static final class C173052 extends ContinuationImpl7 implements Function2<FuturesOnboardingDataState, Continuation<? super FuturesOnboardingDataState>, Object> {
        final /* synthetic */ Object $eligibility;
        final /* synthetic */ MiBFuturesState $miBFuturesState;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C173052(Object obj, MiBFuturesState miBFuturesState, Continuation<? super C173052> continuation) {
            super(2, continuation);
            this.$eligibility = obj;
            this.$miBFuturesState = miBFuturesState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C173052 c173052 = new C173052(this.$eligibility, this.$miBFuturesState, continuation);
            c173052.L$0 = obj;
            return c173052;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOnboardingDataState futuresOnboardingDataState, Continuation<? super FuturesOnboardingDataState> continuation) {
            return ((C173052) create(futuresOnboardingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesOnboardingDataState.copy$default((FuturesOnboardingDataState) this.L$0, null, Result.m28549boximpl(this.$eligibility), null, this.$miBFuturesState, null, null, null, 117, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadPreviousArbAgreement(Continuation<? super Unit> continuation) {
        C173061 c173061;
        Object objM28550constructorimpl;
        if (continuation instanceof C173061) {
            c173061 = (C173061) continuation;
            int i = c173061.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c173061.label = i - Integer.MIN_VALUE;
            } else {
                c173061 = new C173061(continuation);
            }
        }
        Object objCheckAgreement = c173061.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c173061.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCheckAgreement);
                Result.Companion companion = Result.INSTANCE;
                AgreementsStore agreementsStore = this.agreementsStore;
                c173061.label = 1;
                objCheckAgreement = agreementsStore.checkAgreement(FuturesOnboardingArbitrationAgreementDuxo.ARBITRATION_AGREEMENT, c173061);
                if (objCheckAgreement == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCheckAgreement);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((ApiPreviousAgreement) objCheckAgreement);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        applyMutation(new C173072(objM28550constructorimpl, null));
        return Unit.INSTANCE;
    }

    /* compiled from: FuturesOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$loadPreviousArbAgreement$2", m3645f = "FuturesOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$loadPreviousArbAgreement$2 */
    static final class C173072 extends ContinuationImpl7 implements Function2<FuturesOnboardingDataState, Continuation<? super FuturesOnboardingDataState>, Object> {
        final /* synthetic */ Object $result;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C173072(Object obj, Continuation<? super C173072> continuation) {
            super(2, continuation);
            this.$result = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C173072 c173072 = new C173072(this.$result, continuation);
            c173072.L$0 = obj;
            return c173072;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOnboardingDataState futuresOnboardingDataState, Continuation<? super FuturesOnboardingDataState> continuation) {
            return ((C173072) create(futuresOnboardingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesOnboardingDataState.copy$default((FuturesOnboardingDataState) this.L$0, null, null, Result.m28549boximpl(this.$result), null, null, null, null, 123, null);
        }
    }

    /* compiled from: FuturesOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onPreviousArbitrationAgreementLoaded$1", m3645f = "FuturesOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$onPreviousArbitrationAgreementLoaded$1 */
    static final class C173091 extends ContinuationImpl7 implements Function2<FuturesOnboardingDataState, Continuation<? super FuturesOnboardingDataState>, Object> {
        final /* synthetic */ ApiPreviousAgreement $previousAgreement;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C173091(ApiPreviousAgreement apiPreviousAgreement, Continuation<? super C173091> continuation) {
            super(2, continuation);
            this.$previousAgreement = apiPreviousAgreement;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C173091 c173091 = new C173091(this.$previousAgreement, continuation);
            c173091.L$0 = obj;
            return c173091;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOnboardingDataState futuresOnboardingDataState, Continuation<? super FuturesOnboardingDataState> continuation) {
            return ((C173091) create(futuresOnboardingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesOnboardingDataState futuresOnboardingDataState = (FuturesOnboardingDataState) this.L$0;
            Result.Companion companion = Result.INSTANCE;
            return FuturesOnboardingDataState.copy$default(futuresOnboardingDataState, null, null, Result.m28549boximpl(Result.m28550constructorimpl(this.$previousAgreement)), null, null, null, null, 123, null);
        }
    }

    public final void onPreviousArbitrationAgreementLoaded(ApiPreviousAgreement previousAgreement) {
        Intrinsics.checkNotNullParameter(previousAgreement, "previousAgreement");
        applyMutation(new C173091(previousAgreement, null));
    }

    public final void onSignupClicked() {
        withDataState(new Function1() { // from class: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesOnboardingDuxo.onSignupClicked$lambda$2(this.f$0, (FuturesOnboardingDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSignupClicked$lambda$2(FuturesOnboardingDuxo futuresOnboardingDuxo, FuturesOnboardingDataState it) {
        Boolean boolValueOf;
        Intrinsics.checkNotNullParameter(it, "it");
        if (((FuturesOnboardingActivityKey) INSTANCE.getExtras((HasSavedState) futuresOnboardingDuxo)).isEventsContracts()) {
            FuturesAccount existingSwapsAccount = it.getExistingSwapsAccount();
            boolValueOf = existingSwapsAccount != null ? Boolean.valueOf(existingSwapsAccount.getNeedsToApply()) : null;
            if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
                futuresOnboardingDuxo.submit(FuturesOnboardingDuxo5.SignAgreement.INSTANCE);
            } else if (Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
                futuresOnboardingDuxo.submit(FuturesOnboardingDuxo5.UserAlreadyHasAccount.INSTANCE);
            } else {
                if (boolValueOf != null) {
                    throw new NoWhenBranchMatchedException();
                }
                futuresOnboardingDuxo.submit(FuturesOnboardingDuxo5.StartRhdOnboarding.INSTANCE);
            }
        } else {
            FuturesAccount existingFuturesAccount = it.getExistingFuturesAccount();
            boolValueOf = existingFuturesAccount != null ? Boolean.valueOf(existingFuturesAccount.getNeedsToApply()) : null;
            if (Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
                futuresOnboardingDuxo.submit(FuturesOnboardingDuxo5.UserAlreadyHasAccount.INSTANCE);
            } else {
                if (!Intrinsics.areEqual(boolValueOf, Boolean.TRUE) && boolValueOf != null) {
                    throw new NoWhenBranchMatchedException();
                }
                futuresOnboardingDuxo.submit(FuturesOnboardingDuxo5.ShowEligibility.INSTANCE);
            }
        }
        return Unit.INSTANCE;
    }

    /* compiled from: FuturesOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingDuxo;", "Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey;", "<init>", "()V", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<FuturesOnboardingDuxo, FuturesOnboardingActivityKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public FuturesOnboardingActivityKey getExtras(SavedStateHandle savedStateHandle) {
            return (FuturesOnboardingActivityKey) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public FuturesOnboardingActivityKey getExtras(FuturesOnboardingDuxo futuresOnboardingDuxo) {
            return (FuturesOnboardingActivityKey) DuxoCompanion2.DefaultImpls.getExtras(this, futuresOnboardingDuxo);
        }
    }
}
