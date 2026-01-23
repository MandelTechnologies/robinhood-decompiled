package com.robinhood.android.onboarding.p205ui.postusercreation;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.GcmManager;
import com.robinhood.android.common.util.GcmManager2;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.creditcard.contracts.CreditCardWaitlistExperiment;
import com.robinhood.android.lib.creditcard.prefs.CreditCardWaitlistResumeAppBadgePref;
import com.robinhood.android.onboarding.contracts.OnboardingFlowPathType;
import com.robinhood.android.onboarding.contracts.PostUserCreationShimIntentKey;
import com.robinhood.android.onboarding.p205ui.postusercreation.PostUserCreationShimDuxo;
import com.robinhood.android.onboarding.p205ui.postusercreation.PostUserCreationShimViewState2;
import com.robinhood.android.regiongate.CreditCardRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.FundAccountScreenStore;
import com.robinhood.p2p.MatchaManager;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.rhy.referral.RhyReferralOnboardingDataPref;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import io.reactivex.Single;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
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

/* compiled from: PostUserCreationShimDuxo.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001!Be\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postusercreation/PostUserCreationShimDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/onboarding/ui/postusercreation/PostUserCreationShimViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "app", "Landroid/app/Application;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "fundAccountStore", "Lcom/robinhood/librobinhood/data/store/FundAccountScreenStore;", "gcmManager", "Lcom/robinhood/android/common/util/GcmManager;", "matchaManager", "Lcom/robinhood/p2p/MatchaManager;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "creditCardWaitlistResumeAppBadgePref", "Lcom/robinhood/prefs/BooleanPreference;", "rhyReferralOnboardingDataPref", "Lcom/robinhood/prefs/StringPreference;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/analytics/AnalyticsLogger;Landroid/app/Application;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/FundAccountScreenStore;Lcom/robinhood/android/common/util/GcmManager;Lcom/robinhood/p2p/MatchaManager;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/StringPreference;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onStart", "Companion", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class PostUserCreationShimDuxo extends OldBaseDuxo<PostUserCreationShimViewState> implements HasSavedState {
    private final AnalyticsLogger analytics;
    private final Application app;
    private final AppType appType;
    private final BooleanPreference creditCardWaitlistResumeAppBadgePref;
    private final ExperimentsStore experimentsStore;
    private final FundAccountScreenStore fundAccountStore;
    private final GcmManager gcmManager;
    private final MatchaManager matchaManager;
    private final RegionGateProvider regionGateProvider;
    private final StringPreference rhyReferralOnboardingDataPref;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PostUserCreationShimDuxo(AnalyticsLogger analytics, Application app, ExperimentsStore experimentsStore, FundAccountScreenStore fundAccountStore, GcmManager gcmManager, MatchaManager matchaManager, RegionGateProvider regionGateProvider, AppType appType, @CreditCardWaitlistResumeAppBadgePref BooleanPreference creditCardWaitlistResumeAppBadgePref, @RhyReferralOnboardingDataPref StringPreference rhyReferralOnboardingDataPref, SavedStateHandle savedStateHandle) {
        super(new PostUserCreationShimViewState(gcmManager.isRegistered(), ((PostUserCreationShimIntentKey) INSTANCE.getExtras(savedStateHandle)).getIsFromUserCreationFlow(), null, null, 12, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(fundAccountStore, "fundAccountStore");
        Intrinsics.checkNotNullParameter(gcmManager, "gcmManager");
        Intrinsics.checkNotNullParameter(matchaManager, "matchaManager");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(creditCardWaitlistResumeAppBadgePref, "creditCardWaitlistResumeAppBadgePref");
        Intrinsics.checkNotNullParameter(rhyReferralOnboardingDataPref, "rhyReferralOnboardingDataPref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.analytics = analytics;
        this.app = app;
        this.experimentsStore = experimentsStore;
        this.fundAccountStore = fundAccountStore;
        this.gcmManager = gcmManager;
        this.matchaManager = matchaManager;
        this.regionGateProvider = regionGateProvider;
        this.appType = appType;
        this.creditCardWaitlistResumeAppBadgePref = creditCardWaitlistResumeAppBadgePref;
        this.rhyReferralOnboardingDataPref = rhyReferralOnboardingDataPref;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C228931(null));
    }

    /* compiled from: PostUserCreationShimDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postusercreation.PostUserCreationShimDuxo$onCreate$1", m3645f = "PostUserCreationShimDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.postusercreation.PostUserCreationShimDuxo$onCreate$1 */
    static final class C228931 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C228931(Continuation<? super C228931> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C228931 c228931 = PostUserCreationShimDuxo.this.new C228931(continuation);
            c228931.L$0 = obj;
            return c228931;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C228931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PostUserCreationShimDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postusercreation.PostUserCreationShimDuxo$onCreate$1$1", m3645f = "PostUserCreationShimDuxo.kt", m3646l = {69}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.onboarding.ui.postusercreation.PostUserCreationShimDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ PostUserCreationShimDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PostUserCreationShimDuxo postUserCreationShimDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = postUserCreationShimDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: PostUserCreationShimDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postusercreation.PostUserCreationShimDuxo$onCreate$1$1$1", m3645f = "PostUserCreationShimDuxo.kt", m3646l = {67, 67}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.onboarding.ui.postusercreation.PostUserCreationShimDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503091 extends ContinuationImpl7 implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ PostUserCreationShimDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503091(PostUserCreationShimDuxo postUserCreationShimDuxo, Continuation<? super C503091> continuation) {
                    super(2, continuation);
                    this.this$0 = postUserCreationShimDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503091 c503091 = new C503091(this.this$0, continuation);
                    c503091.L$0 = obj;
                    return c503091;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
                    return ((C503091) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
                
                    if (r1.emit(r7, r6) == r0) goto L15;
                 */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    FlowCollector flowCollector;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        flowCollector = (FlowCollector) this.L$0;
                        GcmManager gcmManager = this.this$0.gcmManager;
                        Application application = this.this$0.app;
                        GcmManager2 gcmManager2 = GcmManager2.NO_PROMPT;
                        this.L$0 = flowCollector;
                        this.label = 1;
                        obj = gcmManager.registerDevice(application, gcmManager2, this);
                        if (obj != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    flowCollector = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 2;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flow = FlowKt.flow(new C503091(this.this$0, null));
                    final StateFlow<PostUserCreationShimViewState> statesFlow = this.this$0.getStatesFlow();
                    Flow flowConnectWhen$default = Operators.connectWhen$default(flow, new Flow<Boolean>() { // from class: com.robinhood.android.onboarding.ui.postusercreation.PostUserCreationShimDuxo$onCreate$1$1$invokeSuspend$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.onboarding.ui.postusercreation.PostUserCreationShimDuxo$onCreate$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postusercreation.PostUserCreationShimDuxo$onCreate$1$1$invokeSuspend$$inlined$map$1$2", m3645f = "PostUserCreationShimDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.onboarding.ui.postusercreation.PostUserCreationShimDuxo$onCreate$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    Boolean boolBoxBoolean = boxing.boxBoolean(((PostUserCreationShimViewState) obj).getNeedToRegister());
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
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
                        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                            Object objCollect = statesFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    }, null, 2, null);
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0);
                    this.label = 1;
                    if (flowConnectWhen$default.collect(anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: PostUserCreationShimDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.onboarding.ui.postusercreation.PostUserCreationShimDuxo$onCreate$1$1$3, reason: invalid class name */
            static final class AnonymousClass3<T> implements FlowCollector {
                final /* synthetic */ PostUserCreationShimDuxo this$0;

                AnonymousClass3(PostUserCreationShimDuxo postUserCreationShimDuxo) {
                    this.this$0 = postUserCreationShimDuxo;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) continuation);
                }

                public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                    AnalyticsLogger.DefaultImpls.logUserAction$default(this.this$0.analytics, AnalyticsStrings.USER_ACTION_FINISHED_NOTIFICATION_REGISTRATION_IN_ONBOARDING, null, null, String.valueOf(z), 6, null);
                    this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.onboarding.ui.postusercreation.PostUserCreationShimDuxo$onCreate$1$1$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PostUserCreationShimDuxo.C228931.AnonymousClass1.AnonymousClass3.emit$lambda$0((PostUserCreationShimViewState) obj);
                        }
                    });
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final PostUserCreationShimViewState emit$lambda$0(PostUserCreationShimViewState applyMutation) {
                    Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
                    return PostUserCreationShimViewState.copy$default(applyMutation, true, false, null, null, 14, null);
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(PostUserCreationShimDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        Single singleJust;
        super.onStart();
        if (this.appType != AppType.RHC) {
            this.fundAccountStore.fetchIfEmpty();
        }
        Companion companion = INSTANCE;
        if (((PostUserCreationShimIntentKey) companion.getExtras((HasSavedState) this)).getIsFromUserCreationFlow() && Intrinsics.areEqual(((PostUserCreationShimIntentKey) companion.getExtras((HasSavedState) this)).getOnboardingFlowPathType(), new OnboardingFlowPathType.Brokerage(null, 1, null))) {
            if (this.rhyReferralOnboardingDataPref.mo23850isSet()) {
                final String str = this.rhyReferralOnboardingDataPref.get();
                this.rhyReferralOnboardingDataPref.delete();
                singleJust = RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, SpendingRegionGate.INSTANCE, false, 2, null).first(Boolean.TRUE).map(new Function() { // from class: com.robinhood.android.onboarding.ui.postusercreation.PostUserCreationShimDuxo$onStart$onboardingArgsSingle$1
                    @Override // io.reactivex.functions.Function
                    public final PostUserCreationShimViewState2 apply(Boolean isEnabled) {
                        Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
                        if (isEnabled.booleanValue()) {
                            return PostUserCreationShimDuxo6.rhyReferralOnboardingArgs(str);
                        }
                        return new PostUserCreationShimViewState2.SdOnboarding(new OnboardingFlowPathType.Brokerage(null, 1, null), null, null, 6, null);
                    }
                });
            } else {
                singleJust = RxFactory.DefaultImpls.rxSingle$default(this, null, new PostUserCreationShimDuxo3(this, null), 1, null).onErrorReturnItem(Optional2.INSTANCE).subscribeOn(Schedulers.m3346io()).map(new Function() { // from class: com.robinhood.android.onboarding.ui.postusercreation.PostUserCreationShimDuxo$onStart$onboardingArgsSingle$3
                    @Override // io.reactivex.functions.Function
                    public final PostUserCreationShimViewState2 apply(Optional<MatchaManager.TransactionArgs> optional) {
                        PostUserCreationShimViewState2 onboardingArgs;
                        Intrinsics.checkNotNullParameter(optional, "<destruct>");
                        MatchaManager.TransactionArgs transactionArgsComponent1 = optional.component1();
                        return (transactionArgsComponent1 == null || (onboardingArgs = PostUserCreationShimDuxo6.toOnboardingArgs(transactionArgsComponent1)) == null) ? new PostUserCreationShimViewState2.SdOnboarding(new OnboardingFlowPathType.Brokerage(null, 1, null), null, null, 6, null) : onboardingArgs;
                    }
                });
            }
        } else if (Intrinsics.areEqual(((PostUserCreationShimIntentKey) companion.getExtras((HasSavedState) this)).getOnboardingFlowPathType(), OnboardingFlowPathType.CreditCard.INSTANCE)) {
            singleJust = RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, CreditCardRegionGate.INSTANCE, false, 2, null).first(Boolean.TRUE).zipWith(ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{CreditCardWaitlistExperiment.INSTANCE}, false, null, 6, null).first(Boolean.FALSE), new BiFunction() { // from class: com.robinhood.android.onboarding.ui.postusercreation.PostUserCreationShimDuxo$onStart$onboardingArgsSingle$4
                @Override // io.reactivex.functions.BiFunction
                public final PostUserCreationShimViewState2.SdOnboarding apply(Boolean isRegion, Boolean isExperiment) {
                    Intrinsics.checkNotNullParameter(isRegion, "isRegion");
                    Intrinsics.checkNotNullParameter(isExperiment, "isExperiment");
                    if (isRegion.booleanValue() && isExperiment.booleanValue()) {
                        this.this$0.creditCardWaitlistResumeAppBadgePref.set(true);
                        return new PostUserCreationShimViewState2.SdOnboarding(OnboardingFlowPathType.CreditCard.INSTANCE, null, null, 6, null);
                    }
                    return new PostUserCreationShimViewState2.SdOnboarding(new OnboardingFlowPathType.Brokerage(null, 1, null), null, null, 6, null);
                }
            });
        } else {
            singleJust = Single.just(new PostUserCreationShimViewState2.SdOnboarding(((PostUserCreationShimIntentKey) companion.getExtras((HasSavedState) this)).getOnboardingFlowPathType(), null, null, 6, null));
        }
        Intrinsics.checkNotNull(singleJust);
        LifecycleHost.DefaultImpls.bind$default(this, singleJust, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C228941());
    }

    /* compiled from: PostUserCreationShimDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.onboarding.ui.postusercreation.PostUserCreationShimDuxo$onStart$1 */
    static final class C228941 implements Function1<?, Unit> {
        C228941() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke((PostUserCreationShimViewState2) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(final PostUserCreationShimViewState2 postUserCreationShimViewState2) {
            PostUserCreationShimDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.onboarding.ui.postusercreation.PostUserCreationShimDuxo$onStart$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PostUserCreationShimDuxo.C228941.invoke$lambda$0(postUserCreationShimViewState2, (PostUserCreationShimViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PostUserCreationShimViewState invoke$lambda$0(PostUserCreationShimViewState2 postUserCreationShimViewState2, PostUserCreationShimViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return PostUserCreationShimViewState.copy$default(applyMutation, false, false, postUserCreationShimViewState2, null, 11, null);
        }
    }

    /* compiled from: PostUserCreationShimDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postusercreation/PostUserCreationShimDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/onboarding/ui/postusercreation/PostUserCreationShimDuxo;", "Lcom/robinhood/android/onboarding/contracts/PostUserCreationShimIntentKey;", "<init>", "()V", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<PostUserCreationShimDuxo, PostUserCreationShimIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public PostUserCreationShimIntentKey getExtras(SavedStateHandle savedStateHandle) {
            return (PostUserCreationShimIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public PostUserCreationShimIntentKey getExtras(PostUserCreationShimDuxo postUserCreationShimDuxo) {
            return (PostUserCreationShimIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, postUserCreationShimDuxo);
        }
    }
}
