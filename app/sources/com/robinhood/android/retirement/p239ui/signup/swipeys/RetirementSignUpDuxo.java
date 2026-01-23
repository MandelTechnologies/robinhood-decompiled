package com.robinhood.android.retirement.p239ui.signup.swipeys;

import androidx.lifecycle.SavedStateHandle;
import com.jakewharton.rxrelay2.PublishRelay;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.models.retirement.api.ApiRetirementDashboardSignupResponse;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpEligibility;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpEligibility2;
import com.robinhood.android.models.retirement.api.RetirementSignupSwipey;
import com.robinhood.android.models.retirement.api.onboarding.RetirementOnboardingIntro;
import com.robinhood.android.retirement.contracts.RetirementIntentKeys5;
import com.robinhood.android.retirement.contracts.RetirementLastKnownEntryPointManager;
import com.robinhood.android.retirement.contracts.RetirementSignupFragmentKey;
import com.robinhood.android.retirement.p239ui.signup.AdvisoryIraSignUpIterationExperiment;
import com.robinhood.android.retirement.p239ui.signup.AdvisoryIraSignUpIterationExperiment2;
import com.robinhood.android.retirement.p239ui.signup.RetirementSignUpEvent;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementOnboardingStore;
import com.robinhood.models.api.ManagementType;
import com.robinhood.rosetta.eventlogging.Context;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementSignUpDuxo.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001$B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0018\u001a\u00020\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0016J\u0006\u0010\u001b\u001a\u00020\u0016J\u0006\u0010\u001c\u001a\u00020\u0016J\u0006\u0010\u001d\u001a\u00020\u0016J\u0018\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!H\u0002J\u000e\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020!R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpDataState;", "Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpViewState;", "Lcom/robinhood/android/retirement/ui/signup/RetirementSignUpEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "onboardingStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementOnboardingStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementOnboardingStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "checkSignUpEligibilityRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "", "kotlin.jvm.PlatformType", "fetchSwipeys", "onCreate", "onStart", "onEligibilityLoading", "onEligibilityLoaded", "onCtaClick", "logScreenTransition", "currentState", "newIndex", "", "onSwipe", "newStep", "Companion", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RetirementSignUpDuxo extends BaseDuxo3<RetirementSignUpDataState, RetirementSignUpViewState, RetirementSignUpEvent> implements HasSavedState {
    private final PublishRelay<Unit> checkSignUpEligibilityRelay;
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final RetirementOnboardingStore onboardingStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetirementSignUpDuxo(EventLogger eventLogger, RetirementOnboardingStore onboardingStore, ExperimentsStore experimentsStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new RetirementSignUpDataState(false, null, null, 0, false, 31, null), RetirementSignUpDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(onboardingStore, "onboardingStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.eventLogger = eventLogger;
        this.onboardingStore = onboardingStore;
        this.experimentsStore = experimentsStore;
        this.savedStateHandle = savedStateHandle;
        PublishRelay<Unit> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.checkSignUpEligibilityRelay = publishRelayCreate;
    }

    /* compiled from: RetirementSignUpDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpDuxo$fetchSwipeys$1", m3645f = "RetirementSignUpDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpDuxo$fetchSwipeys$1 */
    static final class C272671 extends ContinuationImpl7 implements Function2<RetirementSignUpDataState, Continuation<? super RetirementSignUpDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C272671(Continuation<? super C272671> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C272671 c272671 = new C272671(continuation);
            c272671.L$0 = obj;
            return c272671;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RetirementSignUpDataState retirementSignUpDataState, Continuation<? super RetirementSignUpDataState> continuation) {
            return ((C272671) create(retirementSignUpDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return RetirementSignUpDataState.copy$default((RetirementSignUpDataState) this.L$0, false, null, null, 0, false, 27, null);
        }
    }

    public final void fetchSwipeys() {
        applyMutation(new C272671(null));
        Observables observables = Observables.INSTANCE;
        Observable observableStreamState$default = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{RetirementSwipeyRebrandExperiment.INSTANCE}, false, null, 6, null);
        Observable<ApiRetirementDashboardSignupResponse> observable = this.onboardingStore.streamSignupPageViewModel(((RetirementSignupFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getFirstSwipey()).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observables.combineLatest(observableStreamState$default, observable), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementSignUpDuxo.fetchSwipeys$lambda$0(this.f$0, (Tuples2) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementSignUpDuxo.fetchSwipeys$lambda$1(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchSwipeys$lambda$0(RetirementSignUpDuxo retirementSignUpDuxo, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        retirementSignUpDuxo.applyMutation(new RetirementSignUpDuxo2((ApiRetirementDashboardSignupResponse) tuples2.component2(), ((Boolean) tuples2.component1()).booleanValue(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchSwipeys$lambda$1(RetirementSignUpDuxo retirementSignUpDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        retirementSignUpDuxo.applyMutation(new RetirementSignUpDuxo3(throwable, null));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        Observable<R> observableSwitchMap = this.checkSignUpEligibilityRelay.switchMap(new Function() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpDuxo.onCreate.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends RetirementSignUpEvent> apply(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                RetirementSignUpDuxo.this.onEligibilityLoading();
                Observables observables = Observables.INSTANCE;
                Observable<ApiRetirementSignUpEligibility> observable = RetirementSignUpDuxo.this.onboardingStore.streamEligibility().toObservable();
                Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
                Observable observableCombineLatest = observables.combineLatest(observable, ExperimentsProvider.DefaultImpls.streamVariant$default(RetirementSignUpDuxo.this.experimentsStore, AdvisoryIraSignUpIterationExperiment.INSTANCE, AdvisoryIraSignUpIterationExperiment2.CONTROL, false, 4, null));
                final RetirementSignUpDuxo retirementSignUpDuxo = RetirementSignUpDuxo.this;
                return observableCombineLatest.switchMap(new Function() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpDuxo.onCreate.1.1
                    @Override // io.reactivex.functions.Function
                    public final ObservableSource<? extends RetirementSignUpEvent> apply(Tuples2<ApiRetirementSignUpEligibility, ? extends AdvisoryIraSignUpIterationExperiment2> tuples2) {
                        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                        ApiRetirementSignUpEligibility apiRetirementSignUpEligibilityComponent1 = tuples2.component1();
                        final boolean z = tuples2.component2() != AdvisoryIraSignUpIterationExperiment2.CONTROL;
                        ApiRetirementSignUpEligibility2 ineligible_bottom_sheet = apiRetirementSignUpEligibilityComponent1.getIneligible_bottom_sheet();
                        if (ineligible_bottom_sheet != null) {
                            return Observable.just(new RetirementSignUpEvent.Ineligible(ineligible_bottom_sheet));
                        }
                        return retirementSignUpDuxo.onboardingStore.streamOnboardingIntro(z ? null : ManagementType.SELF_DIRECTED).toObservable().map(new Function() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpDuxo.onCreate.1.1.1
                            @Override // io.reactivex.functions.Function
                            public final RetirementSignUpEvent.Eligible apply(RetirementOnboardingIntro intro) {
                                RetirementIntentKeys5 retirementIntentKeys5;
                                Intrinsics.checkNotNullParameter(intro, "intro");
                                if (z) {
                                    retirementIntentKeys5 = RetirementIntentKeys5.SELECTION_REQUIRED;
                                } else {
                                    retirementIntentKeys5 = RetirementIntentKeys5.SELF_DIRECTED;
                                }
                                return new RetirementSignUpEvent.Eligible(intro, RetirementLastKnownEntryPointManager.DASHBOARD_SWIPEY_CTA, retirementIntentKeys5);
                            }
                        });
                    }
                }).onErrorReturn(new Function() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpDuxo.onCreate.1.2
                    @Override // io.reactivex.functions.Function
                    public final RetirementSignUpEvent.Error apply(Throwable p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        return new RetirementSignUpEvent.Error(p0);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementSignUpDuxo.onCreate$lambda$2(this.f$0, (RetirementSignUpEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(RetirementSignUpDuxo retirementSignUpDuxo, RetirementSignUpEvent retirementSignUpEvent) {
        retirementSignUpDuxo.onEligibilityLoaded();
        Intrinsics.checkNotNull(retirementSignUpEvent);
        retirementSignUpDuxo.submit(retirementSignUpEvent);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        fetchSwipeys();
    }

    /* compiled from: RetirementSignUpDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpDuxo$onEligibilityLoading$1", m3645f = "RetirementSignUpDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpDuxo$onEligibilityLoading$1 */
    static final class C272701 extends ContinuationImpl7 implements Function2<RetirementSignUpDataState, Continuation<? super RetirementSignUpDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C272701(Continuation<? super C272701> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C272701 c272701 = new C272701(continuation);
            c272701.L$0 = obj;
            return c272701;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RetirementSignUpDataState retirementSignUpDataState, Continuation<? super RetirementSignUpDataState> continuation) {
            return ((C272701) create(retirementSignUpDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return RetirementSignUpDataState.copy$default((RetirementSignUpDataState) this.L$0, true, null, null, 0, false, 30, null);
        }
    }

    public final void onEligibilityLoading() {
        applyMutation(new C272701(null));
    }

    /* compiled from: RetirementSignUpDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpDuxo$onEligibilityLoaded$1", m3645f = "RetirementSignUpDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpDuxo$onEligibilityLoaded$1 */
    static final class C272691 extends ContinuationImpl7 implements Function2<RetirementSignUpDataState, Continuation<? super RetirementSignUpDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C272691(Continuation<? super C272691> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C272691 c272691 = new C272691(continuation);
            c272691.L$0 = obj;
            return c272691;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RetirementSignUpDataState retirementSignUpDataState, Continuation<? super RetirementSignUpDataState> continuation) {
            return ((C272691) create(retirementSignUpDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return RetirementSignUpDataState.copy$default((RetirementSignUpDataState) this.L$0, false, null, null, 0, false, 30, null);
        }
    }

    public final void onEligibilityLoaded() {
        applyMutation(new C272691(null));
    }

    public final void onCtaClick() {
        this.checkSignUpEligibilityRelay.accept(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logScreenTransition(RetirementSignUpDataState currentState, int newIndex) {
        List<RetirementSignupSwipey> swipeys;
        ApiRetirementDashboardSignupResponse signupSwipeys = currentState.getSignupSwipeys();
        if (signupSwipeys == null || (swipeys = signupSwipeys.getSwipeys()) == null) {
            return;
        }
        String logging_identifier = swipeys.get(currentState.getCurrentSwipeyStep()).getLogging_identifier();
        String logging_identifier2 = swipeys.get(newIndex).getLogging_identifier();
        Context loggingContext = RetirementLastKnownEntryPointManager.INSTANCE.getLoggingContext();
        EventLogger.DefaultImpls.logScreenAppear$default(this.eventLogger, null, RetirementSignUpScreenKt.swipeyEventScreen(logging_identifier2), null, null, loggingContext, 13, null);
        EventLogger.DefaultImpls.logScreenDisappear$default(this.eventLogger, null, RetirementSignUpScreenKt.swipeyEventScreen(logging_identifier), null, null, loggingContext, 13, null);
    }

    /* compiled from: RetirementSignUpDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpDuxo$onSwipe$1", m3645f = "RetirementSignUpDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpDuxo$onSwipe$1 */
    static final class C272711 extends ContinuationImpl7 implements Function2<RetirementSignUpDataState, Continuation<? super RetirementSignUpDataState>, Object> {
        final /* synthetic */ int $newStep;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C272711(int i, Continuation<? super C272711> continuation) {
            super(2, continuation);
            this.$newStep = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C272711 c272711 = RetirementSignUpDuxo.this.new C272711(this.$newStep, continuation);
            c272711.L$0 = obj;
            return c272711;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RetirementSignUpDataState retirementSignUpDataState, Continuation<? super RetirementSignUpDataState> continuation) {
            return ((C272711) create(retirementSignUpDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                RetirementSignUpDataState retirementSignUpDataState = (RetirementSignUpDataState) this.L$0;
                RetirementSignUpDuxo.this.logScreenTransition(retirementSignUpDataState, this.$newStep);
                return RetirementSignUpDataState.copy$default(retirementSignUpDataState, false, null, null, this.$newStep, false, 23, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onSwipe(int newStep) {
        applyMutation(new C272711(newStep, null));
    }

    /* compiled from: RetirementSignUpDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpDuxo;", "Lcom/robinhood/android/retirement/contracts/RetirementSignupFragmentKey;", "<init>", "()V", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RetirementSignUpDuxo, RetirementSignupFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RetirementSignupFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (RetirementSignupFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RetirementSignupFragmentKey getArgs(RetirementSignUpDuxo retirementSignUpDuxo) {
            return (RetirementSignupFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, retirementSignUpDuxo);
        }
    }
}
