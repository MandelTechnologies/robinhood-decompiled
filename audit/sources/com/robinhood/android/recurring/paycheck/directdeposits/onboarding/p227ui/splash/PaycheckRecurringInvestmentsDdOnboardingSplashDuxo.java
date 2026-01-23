package com.robinhood.android.recurring.paycheck.directdeposits.onboarding.p227ui.splash;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.models.retirement.p194db.RetirementMatchRate;
import com.robinhood.android.recurring.paycheck.directdeposits.onboarding.p227ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.SweepsInterestStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementMatchStore;
import com.robinhood.staticcontent.model.disclosure.DisclosureContent;
import com.robinhood.staticcontent.store.ContentStore;
import com.robinhood.staticcontent.store.disclosure.RealDisclosureStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: PaycheckRecurringInvestmentsDdOnboardingSplashDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0017B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/splash/PaycheckRecurringInvestmentsDdOnboardingSplashDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/splash/PaycheckRecurringInvestmentsDdOnboardingSplashDataState;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/splash/PaycheckRecurringInvestmentsDdOnboardingSplashViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "sweepsInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "retirementMatchStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;", "realDisclosureStore", "Lcom/robinhood/staticcontent/store/disclosure/RealDisclosureStore;", "stateProvider", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/splash/PaycheckRecurringInvestmentsDdOnboardingSplashStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;Lcom/robinhood/staticcontent/store/disclosure/RealDisclosureStore;Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/splash/PaycheckRecurringInvestmentsDdOnboardingSplashStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-recurring-paycheck-dd-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PaycheckRecurringInvestmentsDdOnboardingSplashDuxo extends BaseDuxo<PaycheckRecurringInvestmentsDdOnboardingSplashDataState, PaycheckRecurringInvestmentsDdOnboardingSplashViewState> implements HasSavedState {
    private static final String LIMITATIONS_APPLY_DIALOG_CONTENTFUL_ID = "3K4B3ty1aRs4xbQy9rm1f1";
    private final RealDisclosureStore realDisclosureStore;
    private final RetirementMatchStore retirementMatchStore;
    private final SavedStateHandle savedStateHandle;
    private final SweepsInterestStore sweepsInterestStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaycheckRecurringInvestmentsDdOnboardingSplashDuxo(SweepsInterestStore sweepsInterestStore, RetirementMatchStore retirementMatchStore, RealDisclosureStore realDisclosureStore, PaycheckRecurringInvestmentsDdOnboardingSplashStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new PaycheckRecurringInvestmentsDdOnboardingSplashDataState(((PaycheckRecurringInvestmentsDdOnboardingSplashFragment.Args) INSTANCE.getArgs(savedStateHandle)).getHasDirectDepositRelationships(), null, null, null, 14, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
        Intrinsics.checkNotNullParameter(retirementMatchStore, "retirementMatchStore");
        Intrinsics.checkNotNullParameter(realDisclosureStore, "realDisclosureStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.sweepsInterestStore = sweepsInterestStore;
        this.retirementMatchStore = retirementMatchStore;
        this.realDisclosureStore = realDisclosureStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        this.sweepsInterestStore.refreshNoAccountNumber(true);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C262941(null), 3, null);
        this.retirementMatchStore.refresh(true);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C262952(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C262963(null), 3, null);
    }

    /* compiled from: PaycheckRecurringInvestmentsDdOnboardingSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashDuxo$onStart$1", m3645f = "PaycheckRecurringInvestmentsDdOnboardingSplashDuxo.kt", m3646l = {45}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashDuxo$onStart$1 */
    static final class C262941 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C262941(Continuation<? super C262941> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaycheckRecurringInvestmentsDdOnboardingSplashDuxo.this.new C262941(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C262941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable<Optional<BigDecimal>> observableDistinctUntilChanged = PaycheckRecurringInvestmentsDdOnboardingSplashDuxo.this.sweepsInterestStore.streamInterestNoAccountNumber().distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(ObservablesKt.filterIsPresent(observableDistinctUntilChanged)), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PaycheckRecurringInvestmentsDdOnboardingSplashDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: PaycheckRecurringInvestmentsDdOnboardingSplashDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "interest", "Ljava/math/BigDecimal;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashDuxo$onStart$1$1", m3645f = "PaycheckRecurringInvestmentsDdOnboardingSplashDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<BigDecimal, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PaycheckRecurringInvestmentsDdOnboardingSplashDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PaycheckRecurringInvestmentsDdOnboardingSplashDuxo paycheckRecurringInvestmentsDdOnboardingSplashDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = paycheckRecurringInvestmentsDdOnboardingSplashDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(BigDecimal bigDecimal, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(bigDecimal, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: PaycheckRecurringInvestmentsDdOnboardingSplashDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/splash/PaycheckRecurringInvestmentsDdOnboardingSplashDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashDuxo$onStart$1$1$1", m3645f = "PaycheckRecurringInvestmentsDdOnboardingSplashDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashDuxo$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504851 extends ContinuationImpl7 implements Function2<PaycheckRecurringInvestmentsDdOnboardingSplashDataState, Continuation<? super PaycheckRecurringInvestmentsDdOnboardingSplashDataState>, Object> {
                final /* synthetic */ BigDecimal $interest;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504851(BigDecimal bigDecimal, Continuation<? super C504851> continuation) {
                    super(2, continuation);
                    this.$interest = bigDecimal;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504851 c504851 = new C504851(this.$interest, continuation);
                    c504851.L$0 = obj;
                    return c504851;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PaycheckRecurringInvestmentsDdOnboardingSplashDataState paycheckRecurringInvestmentsDdOnboardingSplashDataState, Continuation<? super PaycheckRecurringInvestmentsDdOnboardingSplashDataState> continuation) {
                    return ((C504851) create(paycheckRecurringInvestmentsDdOnboardingSplashDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PaycheckRecurringInvestmentsDdOnboardingSplashDataState.copy$default((PaycheckRecurringInvestmentsDdOnboardingSplashDataState) this.L$0, false, this.$interest, null, null, 13, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C504851((BigDecimal) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: PaycheckRecurringInvestmentsDdOnboardingSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashDuxo$onStart$2", m3645f = "PaycheckRecurringInvestmentsDdOnboardingSplashDuxo.kt", m3646l = {57}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashDuxo$onStart$2 */
    static final class C262952 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C262952(Continuation<? super C262952> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaycheckRecurringInvestmentsDdOnboardingSplashDuxo.this.new C262952(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C262952) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable<RetirementMatchRate> observableDistinctUntilChanged = PaycheckRecurringInvestmentsDdOnboardingSplashDuxo.this.retirementMatchStore.stream().distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(observableDistinctUntilChanged), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PaycheckRecurringInvestmentsDdOnboardingSplashDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: PaycheckRecurringInvestmentsDdOnboardingSplashDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "retirementMatchRate", "Lcom/robinhood/android/models/retirement/db/RetirementMatchRate;", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashDuxo$onStart$2$1", m3645f = "PaycheckRecurringInvestmentsDdOnboardingSplashDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashDuxo$onStart$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<RetirementMatchRate, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PaycheckRecurringInvestmentsDdOnboardingSplashDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PaycheckRecurringInvestmentsDdOnboardingSplashDuxo paycheckRecurringInvestmentsDdOnboardingSplashDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = paycheckRecurringInvestmentsDdOnboardingSplashDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(RetirementMatchRate retirementMatchRate, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(retirementMatchRate, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: PaycheckRecurringInvestmentsDdOnboardingSplashDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/splash/PaycheckRecurringInvestmentsDdOnboardingSplashDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashDuxo$onStart$2$1$1", m3645f = "PaycheckRecurringInvestmentsDdOnboardingSplashDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashDuxo$onStart$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504861 extends ContinuationImpl7 implements Function2<PaycheckRecurringInvestmentsDdOnboardingSplashDataState, Continuation<? super PaycheckRecurringInvestmentsDdOnboardingSplashDataState>, Object> {
                final /* synthetic */ RetirementMatchRate $retirementMatchRate;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504861(RetirementMatchRate retirementMatchRate, Continuation<? super C504861> continuation) {
                    super(2, continuation);
                    this.$retirementMatchRate = retirementMatchRate;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504861 c504861 = new C504861(this.$retirementMatchRate, continuation);
                    c504861.L$0 = obj;
                    return c504861;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PaycheckRecurringInvestmentsDdOnboardingSplashDataState paycheckRecurringInvestmentsDdOnboardingSplashDataState, Continuation<? super PaycheckRecurringInvestmentsDdOnboardingSplashDataState> continuation) {
                    return ((C504861) create(paycheckRecurringInvestmentsDdOnboardingSplashDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PaycheckRecurringInvestmentsDdOnboardingSplashDataState.copy$default((PaycheckRecurringInvestmentsDdOnboardingSplashDataState) this.L$0, false, null, this.$retirementMatchRate, null, 11, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C504861((RetirementMatchRate) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: PaycheckRecurringInvestmentsDdOnboardingSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashDuxo$onStart$3", m3645f = "PaycheckRecurringInvestmentsDdOnboardingSplashDuxo.kt", m3646l = {65}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashDuxo$onStart$3 */
    static final class C262963 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C262963(Continuation<? super C262963> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaycheckRecurringInvestmentsDdOnboardingSplashDuxo.this.new C262963(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C262963) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C262963 c262963;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RealDisclosureStore realDisclosureStore = PaycheckRecurringInvestmentsDdOnboardingSplashDuxo.this.realDisclosureStore;
                this.label = 1;
                c262963 = this;
                obj = ContentStore.DefaultImpls.load$default(realDisclosureStore, PaycheckRecurringInvestmentsDdOnboardingSplashDuxo.LIMITATIONS_APPLY_DIALOG_CONTENTFUL_ID, null, c262963, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c262963 = this;
            }
            PaycheckRecurringInvestmentsDdOnboardingSplashDuxo.this.applyMutation(new AnonymousClass1((DisclosureContent) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: PaycheckRecurringInvestmentsDdOnboardingSplashDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/splash/PaycheckRecurringInvestmentsDdOnboardingSplashDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashDuxo$onStart$3$1", m3645f = "PaycheckRecurringInvestmentsDdOnboardingSplashDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashDuxo$onStart$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PaycheckRecurringInvestmentsDdOnboardingSplashDataState, Continuation<? super PaycheckRecurringInvestmentsDdOnboardingSplashDataState>, Object> {
            final /* synthetic */ DisclosureContent $content;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DisclosureContent disclosureContent, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$content = disclosureContent;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$content, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PaycheckRecurringInvestmentsDdOnboardingSplashDataState paycheckRecurringInvestmentsDdOnboardingSplashDataState, Continuation<? super PaycheckRecurringInvestmentsDdOnboardingSplashDataState> continuation) {
                return ((AnonymousClass1) create(paycheckRecurringInvestmentsDdOnboardingSplashDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return PaycheckRecurringInvestmentsDdOnboardingSplashDataState.copy$default((PaycheckRecurringInvestmentsDdOnboardingSplashDataState) this.L$0, false, null, null, this.$content, 7, null);
            }
        }
    }

    /* compiled from: PaycheckRecurringInvestmentsDdOnboardingSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/splash/PaycheckRecurringInvestmentsDdOnboardingSplashDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/splash/PaycheckRecurringInvestmentsDdOnboardingSplashDuxo;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/splash/PaycheckRecurringInvestmentsDdOnboardingSplashFragment$Args;", "<init>", "()V", "LIMITATIONS_APPLY_DIALOG_CONTENTFUL_ID", "", "feature-recurring-paycheck-dd-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PaycheckRecurringInvestmentsDdOnboardingSplashDuxo, PaycheckRecurringInvestmentsDdOnboardingSplashFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PaycheckRecurringInvestmentsDdOnboardingSplashFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (PaycheckRecurringInvestmentsDdOnboardingSplashFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PaycheckRecurringInvestmentsDdOnboardingSplashFragment.Args getArgs(PaycheckRecurringInvestmentsDdOnboardingSplashDuxo paycheckRecurringInvestmentsDdOnboardingSplashDuxo) {
            return (PaycheckRecurringInvestmentsDdOnboardingSplashFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, paycheckRecurringInvestmentsDdOnboardingSplashDuxo);
        }
    }
}
