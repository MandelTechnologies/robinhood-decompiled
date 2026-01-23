package com.robinhood.android.optionsupgrade;

import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.options.contracts.OptionOnboarding;
import com.robinhood.android.options.contracts.OptionOnboarding2;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.optionsupgrade.OptionOnboardingExperimentState;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.SuspendLazy;
import com.robinhood.coroutines.SuspendLazy3;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.SimpleVariant;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionOnboardingStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.options.p360uk.intro.contracts.UKOptionsOnboardingService;
import com.robinhood.options.p360uk.intro.contracts.model.UkOptionsOnboardingContent;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.OptionOnboardingContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.http.HttpStatusCode;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxAwait3;
import kotlinx.coroutines.rx2.RxConvert;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import options_product.service.GetNextOnboardingScreensRequestDto;
import options_product.service.GetNextOnboardingScreensResponseDto;
import options_product.service.OnboardingEntryPointDto;
import options_product.service.OnboardingExperimentDto;
import options_product.service.OnboardingScreenResponseDto;
import p479j$.time.Instant;

/* compiled from: OptionOnboardingDuxo.kt */
@Metadata(m3635d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 D2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001DBQ\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010'\u001a\u00020(H\u0086@¢\u0006\u0002\u0010)J\b\u0010*\u001a\u00020+H\u0016J$\u0010,\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010.\u0012\u0004\u0012\u00020/0-2\u0006\u00100\u001a\u000201H\u0086@¢\u0006\u0002\u00102J\u0006\u00103\u001a\u000204J\u0014\u00105\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010.\u0012\u0004\u0012\u00020/0-J\u0006\u00106\u001a\u00020+J*\u00107\u001a\b\u0012\u0004\u0012\u00020.0%2\f\u00108\u001a\b\u0012\u0004\u0012\u0002010%2\u0006\u00109\u001a\u00020.H\u0082@¢\u0006\u0002\u0010:J\u001e\u0010;\u001a\u00020/2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020.0%2\u0006\u0010=\u001a\u00020/H\u0002J\"\u0010>\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020A0?2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002J\b\u0010C\u001a\u000204H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006E"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingDataState;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "optionOnboardingStore", "Lcom/robinhood/librobinhood/data/store/OptionOnboardingStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingStateProvider;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/OptionOnboardingStore;Lcom/robinhood/shared/store/user/UserStore;Lmicrogram/android/inject/MicrogramComponent$Factory;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/optionsupgrade/OptionOnboardingStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "splashL0Experiment", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL0;", "getSplashL0Experiment", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL0;", "splashL2Experiment", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL2;", "getSplashL2Experiment", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL2;", "cachedExperiments", "Lcom/robinhood/coroutines/SuspendLazy;", "", "Loptions_product/service/OnboardingExperimentDto;", "getAccountNumber", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCreate", "", "goToNextScreen", "Lkotlin/Pair;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingProgress;", "currentScreenRequest", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "(Lcom/robinhood/android/optionsupgrade/ScreenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "backwardNavigationDisabled", "", "backToPreviousScreen", "resetScreenStack", "getNextScreensFromEndpoint", "screenRequests", "currentScreen", "(Ljava/util/List;Lcom/robinhood/android/optionsupgrade/ScreenArgs;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUpdatedOnboardingProgress", "newScreens", "oldProgress", "convertUpgradeExperimentDtosToState", "", "Lcom/robinhood/android/optionsupgrade/OptionUpgradeExperimentType;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState;", "dtos", "isSdpEntryPoint", "Companion", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionOnboardingDuxo extends BaseDuxo<OptionOnboardingDataState, OptionOnboardingViewState> implements HasSavedState {
    public static final String SAVED_STATE_KEY = "OptionOnboardingSavedState";
    private final AccountProvider accountProvider;
    private final SuspendLazy<List<OnboardingExperimentDto>> cachedExperiments;
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final MicrogramComponent.Factory microgramComponentFactory;
    private final OptionOnboardingStore optionOnboardingStore;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionOnboardingDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDuxo", m3645f = "OptionOnboardingDuxo.kt", m3646l = {390, HttpStatusCode.FORBIDDEN, 395}, m3647m = "getNextScreensFromEndpoint")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$getNextScreensFromEndpoint$1 */
    static final class C249481 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        C249481(Continuation<? super C249481> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OptionOnboardingDuxo.this.getNextScreensFromEndpoint(null, null, this);
        }
    }

    /* compiled from: OptionOnboardingDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDuxo", m3645f = "OptionOnboardingDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE}, m3647m = "goToNextScreen")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$goToNextScreen$1 */
    static final class C249511 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        C249511(Continuation<? super C249511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OptionOnboardingDuxo.this.goToNextScreen(null, this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OptionOnboardingDuxo(AccountProvider accountProvider, EventLogger eventLogger, ExperimentsStore experimentsStore, OptionOnboardingStore optionOnboardingStore, UserStore userStore, MicrogramComponent.Factory microgramComponentFactory, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, OptionOnboardingStateProvider stateProvider) {
        OptionOnboardingProgress onboardingProgress;
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(optionOnboardingStore, "optionOnboardingStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Companion companion = INSTANCE;
        OptionOnboardingSavedState optionOnboardingSavedState = (OptionOnboardingSavedState) savedStateHandle.get(SAVED_STATE_KEY);
        OptionOnboarding2 accountInfo = ((OptionOnboarding) companion.getExtras(savedStateHandle)).getAccountInfo();
        OptionOnboarding2.AccountNumber accountNumber = accountInfo instanceof OptionOnboarding2.AccountNumber ? (OptionOnboarding2.AccountNumber) accountInfo : null;
        String accountNumber2 = accountNumber != null ? accountNumber.getAccountNumber() : null;
        String name = ((OptionOnboarding) companion.getExtras(savedStateHandle)).getSource().getName();
        List<ScreenRequest> listEmptyList = (optionOnboardingSavedState == null || (listEmptyList = optionOnboardingSavedState.getScreenRequests()) == null) ? CollectionsKt.emptyList() : listEmptyList;
        List<ScreenArgs> listEmptyList2 = (optionOnboardingSavedState == null || (listEmptyList2 = optionOnboardingSavedState.getScreenArgsInBackstack()) == null) ? CollectionsKt.emptyList() : listEmptyList2;
        ScreenArgs initialScreenArgs = (optionOnboardingSavedState == null || (initialScreenArgs = optionOnboardingSavedState.getCurrentScreen()) == null) ? OptionOnboardingStatesKt.getInitialScreenArgs() : initialScreenArgs;
        List<ScreenArgs> listEmptyList3 = (optionOnboardingSavedState == null || (listEmptyList3 = optionOnboardingSavedState.getScreenArgsRemaining()) == null) ? CollectionsKt.emptyList() : listEmptyList3;
        UUID uuidRandomUUID = (optionOnboardingSavedState == null || (uuidRandomUUID = optionOnboardingSavedState.getSessionId()) == null) ? UUID.randomUUID() : uuidRandomUUID;
        Intrinsics.checkNotNull(uuidRandomUUID);
        super(new OptionOnboardingDataState(accountNumber2, name, listEmptyList, listEmptyList2, initialScreenArgs, listEmptyList3, uuidRandomUUID, (optionOnboardingSavedState == null || (onboardingProgress = optionOnboardingSavedState.getOnboardingProgress()) == null) ? OptionOnboardingProgress.IN_PROGRESS : onboardingProgress, null, null, CountryCode.Supported.UnitedStates.INSTANCE, MapsKt.emptyMap(), null, 4864, null), stateProvider, duxoBundle);
        this.accountProvider = accountProvider;
        this.eventLogger = eventLogger;
        this.experimentsStore = experimentsStore;
        this.optionOnboardingStore = optionOnboardingStore;
        this.userStore = userStore;
        this.microgramComponentFactory = microgramComponentFactory;
        this.savedStateHandle = savedStateHandle;
        this.cachedExperiments = SuspendLazy3.suspendLazy(new OptionOnboardingDuxo2(this, null));
    }

    public final OptionOnboardingExperimentState.SplashL0 getSplashL0Experiment() {
        OptionOnboardingExperimentState optionOnboardingExperimentState = getStateFlow().getValue().getOnboardingExperimentsAssignment().get(OptionUpgradeExperimentType.OPTIONS_L0_SPLASH_EXPERIMENT);
        OptionOnboardingExperimentState.SplashL0 splashL0 = optionOnboardingExperimentState instanceof OptionOnboardingExperimentState.SplashL0 ? (OptionOnboardingExperimentState.SplashL0) optionOnboardingExperimentState : null;
        return splashL0 == null ? OptionOnboardingExperimentState.SplashL0.Swipie.INSTANCE : splashL0;
    }

    public final OptionOnboardingExperimentState.SplashL2 getSplashL2Experiment() {
        OptionOnboardingExperimentState optionOnboardingExperimentState = getStateFlow().getValue().getOnboardingExperimentsAssignment().get(OptionUpgradeExperimentType.OPTIONS_L2_SPLASH_EXPERIMENT);
        OptionOnboardingExperimentState.SplashL2 splashL2 = optionOnboardingExperimentState instanceof OptionOnboardingExperimentState.SplashL2 ? (OptionOnboardingExperimentState.SplashL2) optionOnboardingExperimentState : null;
        return splashL2 == null ? OptionOnboardingExperimentState.SplashL2.Swipie.INSTANCE : splashL2;
    }

    public final Object getAccountNumber(Continuation<? super String> continuation) {
        final StateFlow<OptionOnboardingViewState> stateFlow = getStateFlow();
        return FlowKt.first(new Flow<String>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$getAccountNumber$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation2) {
                Object objCollect = stateFlow.collect(new C249432(flowCollector), continuation2);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$getAccountNumber$$inlined$mapNotNull$1$2 */
            public static final class C249432<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$getAccountNumber$$inlined$mapNotNull$1$2", m3645f = "OptionOnboardingDuxo.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$getAccountNumber$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        return C249432.this.emit(null, this);
                    }
                }

                public C249432(FlowCollector flowCollector) {
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
                        String accountNumber = ((OptionOnboardingViewState) obj).getAccountNumber();
                        if (accountNumber != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(accountNumber, anonymousClass1) == coroutine_suspended) {
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
        }, continuation);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        Flow flow;
        OptionOnboarding2 accountInfo = ((OptionOnboarding) INSTANCE.getExtras((HasSavedState) this)).getAccountInfo();
        if (accountInfo instanceof OptionOnboarding2.AccountNumber) {
            flow = FlowKt.flowOf(((OptionOnboarding2.AccountNumber) accountInfo).getAccountNumber());
        } else {
            if (!(accountInfo instanceof OptionOnboarding2.AccountType)) {
                throw new NoWhenBranchMatchedException();
            }
            flow = FlowKt.flow(new OptionOnboardingDuxo7(this, accountInfo, null));
        }
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.CREATED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C249531(flow, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C249542(flow, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C249553(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C249564(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C249575(null));
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C249586(null));
    }

    /* compiled from: OptionOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$onCreate$1", m3645f = "OptionOnboardingDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$onCreate$1 */
    static final class C249531 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<String> $accountNumberFlow;
        int label;
        final /* synthetic */ OptionOnboardingDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C249531(Flow<String> flow, OptionOnboardingDuxo optionOnboardingDuxo, Continuation<? super C249531> continuation) {
            super(2, continuation);
            this.$accountNumberFlow = flow;
            this.this$0 = optionOnboardingDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C249531(this.$accountNumberFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C249531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTake = FlowKt.take(this.$accountNumberFlow, 1);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTake, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: OptionOnboardingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$onCreate$1$1", m3645f = "OptionOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionOnboardingDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionOnboardingDuxo optionOnboardingDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionOnboardingDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionOnboardingDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$onCreate$1$1$1", m3645f = "OptionOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504291 extends ContinuationImpl7 implements Function2<OptionOnboardingDataState, Continuation<? super OptionOnboardingDataState>, Object> {
                final /* synthetic */ String $accountNumber;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504291(String str, Continuation<? super C504291> continuation) {
                    super(2, continuation);
                    this.$accountNumber = str;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504291 c504291 = new C504291(this.$accountNumber, continuation);
                    c504291.L$0 = obj;
                    return c504291;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionOnboardingDataState optionOnboardingDataState, Continuation<? super OptionOnboardingDataState> continuation) {
                    return ((C504291) create(optionOnboardingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionOnboardingDataState.copy$default((OptionOnboardingDataState) this.L$0, this.$accountNumber, null, null, null, null, null, null, null, null, null, null, null, null, 8190, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C504291((String) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$onCreate$2", m3645f = "OptionOnboardingDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$onCreate$2 */
    static final class C249542 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<String> $accountNumberFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C249542(Flow<String> flow, Continuation<? super C249542> continuation) {
            super(2, continuation);
            this.$accountNumberFlow = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOnboardingDuxo.this.new C249542(this.$accountNumberFlow, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C249542) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observables observables = Observables.INSTANCE;
                Observable<T> observableAsObservable = OptionOnboardingDuxo.this.asObservable(this.$accountNumberFlow);
                final OptionOnboardingDuxo optionOnboardingDuxo = OptionOnboardingDuxo.this;
                Observable observableSwitchMap = observableAsObservable.switchMap(new Function() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo.onCreate.2.1
                    @Override // io.reactivex.functions.Function
                    public final ObservableSource<? extends Account> apply(String it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return optionOnboardingDuxo.accountProvider.streamAccount(it);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
                Flow flowTake = FlowKt.take(Context7.buffer$default(RxConvert.asFlow(observables.combineLatest(observableSwitchMap, OptionOnboardingDuxo.this.userStore.getUser())), Integer.MAX_VALUE, null, 2, null), 1);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionOnboardingDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTake, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: OptionOnboardingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/db/Account;", "kotlin.jvm.PlatformType", "Lcom/robinhood/models/db/sheriff/User;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$onCreate$2$2", m3645f = "OptionOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$onCreate$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends Account, ? extends User>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionOnboardingDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionOnboardingDuxo optionOnboardingDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionOnboardingDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Account, ? extends User> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<Account, User>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<Account, User> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Tuples2 tuples2 = (Tuples2) this.L$0;
                Account account = (Account) tuples2.component1();
                User user = (User) tuples2.component2();
                if (!user.getIsUk() && !user.getIsRhsg() && account.getBrokerageAccountType() != BrokerageAccountType.JOINT_TENANCY_WITH_ROS) {
                    EventLogger.DefaultImpls.logAppear$default(this.this$0.eventLogger, null, new Screen(null, null, OptionOnboardingLoggings.OPTION_ONBOARDING_REVAMP_TRIGGER_SCREEN_IDENTIFIER, null, 11, null), null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OptionOnboardingContext(null, ((OptionOnboarding) OptionOnboardingDuxo.INSTANCE.getExtras((HasSavedState) this.this$0)).getSource().getName(), null, null, 13, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -65, 16383, null), 13, null);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: OptionOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$onCreate$3", m3645f = "OptionOnboardingDuxo.kt", m3646l = {510, EnumC7081g.SDK_ASSET_ICON_PIN_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$onCreate$3 */
    static final class C249553 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        C249553(Continuation<? super C249553> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOnboardingDuxo.this.new C249553(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C249553) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            CountryCode.Supported locality;
            Ref.ObjectRef objectRef;
            Ref.ObjectRef objectRef2;
            Ref.ObjectRef objectRef3;
            T t;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable<User> user = OptionOnboardingDuxo.this.userStore.getUser();
                this.label = 1;
                Object objAwaitFirst = RxAwait3.awaitFirst(user, this);
                obj2 = objAwaitFirst;
                if (objAwaitFirst != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef2 = (Ref.ObjectRef) this.L$2;
                objectRef3 = (Ref.ObjectRef) this.L$1;
                locality = (CountryCode.Supported) this.L$0;
                ResultKt.throwOnFailure(obj);
                t = obj;
                objectRef2.element = t;
                objectRef = objectRef3;
                OptionOnboardingDuxo.this.applyMutation(new AnonymousClass1(objectRef, locality, null));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
            locality = ((User) obj2).getOrigin().getLocality();
            boolean zAreEqual = Intrinsics.areEqual(locality, CountryCode.Supported.UnitedKingdom.INSTANCE);
            boolean zIsRhsg = locality.isRhsg();
            objectRef = new Ref.ObjectRef();
            if (zAreEqual || zIsRhsg) {
                UKOptionsOnboardingService uKOptionsOnboardingService = (UKOptionsOnboardingService) MicrogramComponent.Factory.DefaultImpls.create$default(OptionOnboardingDuxo.this.microgramComponentFactory, ViewModel2.getViewModelScope(OptionOnboardingDuxo.this), new RemoteMicrogramApplication("app-options-uk-intro", null, 2, null), null, 4, null).getServiceLocator().getClient(UKOptionsOnboardingService.class);
                this.L$0 = locality;
                this.L$1 = objectRef;
                this.L$2 = objectRef;
                this.label = 2;
                Object uKOptionsOnboardingContent = uKOptionsOnboardingService.getUKOptionsOnboardingContent(this);
                if (uKOptionsOnboardingContent != coroutine_suspended) {
                    objectRef2 = objectRef;
                    objectRef3 = objectRef2;
                    t = uKOptionsOnboardingContent;
                    objectRef2.element = t;
                    objectRef = objectRef3;
                }
                return coroutine_suspended;
            }
            OptionOnboardingDuxo.this.applyMutation(new AnonymousClass1(objectRef, locality, null));
            return Unit.INSTANCE;
        }

        /* compiled from: OptionOnboardingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$onCreate$3$1", m3645f = "OptionOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionOnboardingDataState, Continuation<? super OptionOnboardingDataState>, Object> {
            final /* synthetic */ Ref.ObjectRef<UkOptionsOnboardingContent> $i18nOptionsOnboardingContent;
            final /* synthetic */ CountryCode.Supported $userLocale;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Ref.ObjectRef<UkOptionsOnboardingContent> objectRef, CountryCode.Supported supported, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$i18nOptionsOnboardingContent = objectRef;
                this.$userLocale = supported;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$i18nOptionsOnboardingContent, this.$userLocale, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionOnboardingDataState optionOnboardingDataState, Continuation<? super OptionOnboardingDataState> continuation) {
                return ((AnonymousClass1) create(optionOnboardingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return OptionOnboardingDataState.copy$default((OptionOnboardingDataState) this.L$0, null, null, null, null, null, null, null, null, null, this.$i18nOptionsOnboardingContent.element, this.$userLocale, null, null, 6655, null);
            }
        }
    }

    /* compiled from: OptionOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$onCreate$4", m3645f = "OptionOnboardingDuxo.kt", m3646l = {225}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$onCreate$4 */
    static final class C249564 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C249564(Continuation<? super C249564> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOnboardingDuxo.this.new C249564(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C249564) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SuspendLazy suspendLazy = OptionOnboardingDuxo.this.cachedExperiments;
                this.label = 1;
                obj = suspendLazy.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            OptionOnboardingDuxo optionOnboardingDuxo = OptionOnboardingDuxo.this;
            optionOnboardingDuxo.applyMutation(new AnonymousClass1(optionOnboardingDuxo, (List) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: OptionOnboardingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$onCreate$4$1", m3645f = "OptionOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$onCreate$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionOnboardingDataState, Continuation<? super OptionOnboardingDataState>, Object> {
            final /* synthetic */ List<OnboardingExperimentDto> $experimentsAssignmentDtos;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionOnboardingDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionOnboardingDuxo optionOnboardingDuxo, List<OnboardingExperimentDto> list, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionOnboardingDuxo;
                this.$experimentsAssignmentDtos = list;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$experimentsAssignmentDtos, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionOnboardingDataState optionOnboardingDataState, Continuation<? super OptionOnboardingDataState> continuation) {
                return ((AnonymousClass1) create(optionOnboardingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return OptionOnboardingDataState.copy$default((OptionOnboardingDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, this.this$0.convertUpgradeExperimentDtosToState(this.$experimentsAssignmentDtos), null, 6143, null);
            }
        }
    }

    /* compiled from: OptionOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$onCreate$5", m3645f = "OptionOnboardingDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$onCreate$5 */
    static final class C249575 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C249575(Continuation<? super C249575> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOnboardingDuxo.this.new C249575(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C249575) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionOnboardingViewState> stateFlow = OptionOnboardingDuxo.this.getStateFlow();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<OptionOnboardingSavedState>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$onCreate$5$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionOnboardingSavedState> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new C249442(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$onCreate$5$invokeSuspend$$inlined$map$1$2 */
                    public static final class C249442<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$onCreate$5$invokeSuspend$$inlined$map$1$2", m3645f = "OptionOnboardingDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$onCreate$5$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C249442.this.emit(null, this);
                            }
                        }

                        public C249442(FlowCollector flowCollector) {
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
                                OptionOnboardingViewState optionOnboardingViewState = (OptionOnboardingViewState) obj;
                                OptionOnboardingSavedState optionOnboardingSavedState = new OptionOnboardingSavedState(optionOnboardingViewState.getScreenRequests(), optionOnboardingViewState.getScreenArgsInBackstack(), optionOnboardingViewState.getCurrentScreen(), optionOnboardingViewState.getScreenArgsRemaining(), optionOnboardingViewState.getSessionId(), optionOnboardingViewState.getOnboardingProgress());
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(optionOnboardingSavedState, anonymousClass1) == coroutine_suspended) {
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
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionOnboardingDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: OptionOnboardingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "savedState", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingSavedState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$onCreate$5$2", m3645f = "OptionOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$onCreate$5$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionOnboardingSavedState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionOnboardingDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionOnboardingDuxo optionOnboardingDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionOnboardingDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionOnboardingSavedState optionOnboardingSavedState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(optionOnboardingSavedState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.getSavedStateHandle().set(OptionOnboardingDuxo.SAVED_STATE_KEY, (OptionOnboardingSavedState) this.L$0);
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: OptionOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$onCreate$6", m3645f = "OptionOnboardingDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$onCreate$6 */
    static final class C249586 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C249586(Continuation<? super C249586> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOnboardingDuxo.this.new C249586(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C249586) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Experiment experiment;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (OptionOnboardingDuxo.this.isSdpEntryPoint()) {
                    experiment = Experiments.OptionsPostEnablementSdpEntryExperiment.INSTANCE;
                } else {
                    experiment = Experiments.OptionsPostEnablementNonSdpEntryExperiment.INSTANCE;
                }
                Flow flowCoStreamVariant = OptionOnboardingDuxo.this.experimentsStore.coStreamVariant(experiment, SimpleVariant.CONTROL, false);
                this.label = 1;
                obj = FlowKt.firstOrNull(flowCoStreamVariant, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            OptionOnboardingDuxo.this.applyMutation(new AnonymousClass1(obj == SimpleVariant.MEMBER, null));
            return Unit.INSTANCE;
        }

        /* compiled from: OptionOnboardingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$onCreate$6$1", m3645f = "OptionOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$onCreate$6$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionOnboardingDataState, Continuation<? super OptionOnboardingDataState>, Object> {
            final /* synthetic */ boolean $inOptionsPostEnableExperiment;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$inOptionsPostEnableExperiment = z;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$inOptionsPostEnableExperiment, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionOnboardingDataState optionOnboardingDataState, Continuation<? super OptionOnboardingDataState> continuation) {
                return ((AnonymousClass1) create(optionOnboardingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return OptionOnboardingDataState.copy$default((OptionOnboardingDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, boxing.boxBoolean(this.$inOptionsPostEnableExperiment), 4095, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v12, types: [T, com.robinhood.android.optionsupgrade.ScreenArgs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v3, types: [T, com.robinhood.android.optionsupgrade.ScreenArgs] */
    /* JADX WARN: Type inference failed for: r15v15, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v18, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v22, types: [T, com.robinhood.android.optionsupgrade.OptionOnboardingProgress] */
    /* JADX WARN: Type inference failed for: r15v9, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, com.robinhood.android.optionsupgrade.OptionOnboardingProgress] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object goToNextScreen(ScreenRequest screenRequest, Continuation<? super Tuples2<? extends ScreenArgs, ? extends OptionOnboardingProgress>> continuation) throws ScreenError {
        C249511 c249511;
        OptionOnboardingViewState optionOnboardingViewState;
        List<? extends ScreenRequest> listPlus;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        OptionOnboardingViewState optionOnboardingViewState2;
        Ref.ObjectRef objectRef5;
        Ref.ObjectRef objectRef6;
        if (continuation instanceof C249511) {
            c249511 = (C249511) continuation;
            int i = c249511.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c249511.label = i - Integer.MIN_VALUE;
            } else {
                c249511 = new C249511(continuation);
            }
        }
        Object obj = c249511.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c249511.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            optionOnboardingViewState = (OptionOnboardingViewState) getStateFlow().getValue();
            listPlus = CollectionsKt.plus((Collection<? extends ScreenRequest>) optionOnboardingViewState.getScreenRequests(), screenRequest);
            objectRef = new Ref.ObjectRef();
            objectRef.element = CollectionsKt.toList(optionOnboardingViewState.getScreenArgsInBackstack());
            objectRef2 = new Ref.ObjectRef();
            objectRef2.element = optionOnboardingViewState.getCurrentScreen();
            Ref.ObjectRef objectRef7 = new Ref.ObjectRef();
            objectRef7.element = CollectionsKt.toList(optionOnboardingViewState.getScreenArgsRemaining());
            Ref.ObjectRef objectRef8 = new Ref.ObjectRef();
            objectRef8.element = optionOnboardingViewState.getOnboardingProgress();
            if (((List) objectRef7.element).isEmpty()) {
                ScreenArgs screenArgs = (ScreenArgs) objectRef2.element;
                c249511.L$0 = optionOnboardingViewState;
                c249511.L$1 = listPlus;
                c249511.L$2 = objectRef;
                c249511.L$3 = objectRef2;
                c249511.L$4 = objectRef7;
                c249511.L$5 = objectRef8;
                c249511.label = 1;
                Object nextScreensFromEndpoint = getNextScreensFromEndpoint(listPlus, screenArgs, c249511);
                if (nextScreensFromEndpoint == coroutine_suspended) {
                    return coroutine_suspended;
                }
                optionOnboardingViewState2 = optionOnboardingViewState;
                obj = nextScreensFromEndpoint;
                objectRef5 = objectRef7;
                objectRef6 = objectRef8;
            } else {
                objectRef3 = objectRef7;
                objectRef4 = objectRef8;
                Ref.ObjectRef objectRef9 = objectRef2;
                Ref.ObjectRef objectRef10 = objectRef;
                List<? extends ScreenRequest> list = listPlus;
                if (!((List) objectRef3.element).isEmpty()) {
                    return Tuples4.m3642to(null, optionOnboardingViewState.getOnboardingProgress());
                }
                ?? r14 = (ScreenArgs) CollectionsKt.first((List) objectRef3.element);
                objectRef3.element = CollectionsKt.drop((Iterable) objectRef3.element, 1);
                if (((ScreenArgs) objectRef9.element).getShouldLiveInBackstack()) {
                    objectRef10.element = CollectionsKt.plus((Collection) objectRef10.element, (Object) objectRef9.element);
                }
                if (r14.getShouldClearBackstack()) {
                    objectRef10.element = CollectionsKt.emptyList();
                }
                objectRef9.element = r14;
                applyMutation(new C249522(list, objectRef10, objectRef9, objectRef3, objectRef4, null));
                return Tuples4.m3642to(r14, objectRef4.element);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef6 = (Ref.ObjectRef) c249511.L$5;
            objectRef5 = (Ref.ObjectRef) c249511.L$4;
            objectRef2 = (Ref.ObjectRef) c249511.L$3;
            objectRef = (Ref.ObjectRef) c249511.L$2;
            listPlus = (List) c249511.L$1;
            optionOnboardingViewState2 = (OptionOnboardingViewState) c249511.L$0;
            ResultKt.throwOnFailure(obj);
        }
        List<? extends ScreenArgs> list2 = (List) obj;
        objectRef5.element = CollectionsKt.plus((Collection) objectRef5.element, (Iterable) list2);
        objectRef6.element = getUpdatedOnboardingProgress(list2, (OptionOnboardingProgress) objectRef6.element);
        objectRef4 = objectRef6;
        optionOnboardingViewState = optionOnboardingViewState2;
        objectRef3 = objectRef5;
        Ref.ObjectRef objectRef92 = objectRef2;
        Ref.ObjectRef objectRef102 = objectRef;
        List<? extends ScreenRequest> list3 = listPlus;
        if (!((List) objectRef3.element).isEmpty()) {
        }
    }

    /* compiled from: OptionOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$goToNextScreen$2", m3645f = "OptionOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$goToNextScreen$2 */
    static final class C249522 extends ContinuationImpl7 implements Function2<OptionOnboardingDataState, Continuation<? super OptionOnboardingDataState>, Object> {
        final /* synthetic */ Ref.ObjectRef<ScreenArgs> $currentScreen;
        final /* synthetic */ List<ScreenRequest> $newScreenRequests;
        final /* synthetic */ Ref.ObjectRef<OptionOnboardingProgress> $onboardingProgress;
        final /* synthetic */ Ref.ObjectRef<List<ScreenArgs>> $screenArgsInBackstack;
        final /* synthetic */ Ref.ObjectRef<List<ScreenArgs>> $screenArgsRemaining;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C249522(List<? extends ScreenRequest> list, Ref.ObjectRef<List<ScreenArgs>> objectRef, Ref.ObjectRef<ScreenArgs> objectRef2, Ref.ObjectRef<List<ScreenArgs>> objectRef3, Ref.ObjectRef<OptionOnboardingProgress> objectRef4, Continuation<? super C249522> continuation) {
            super(2, continuation);
            this.$newScreenRequests = list;
            this.$screenArgsInBackstack = objectRef;
            this.$currentScreen = objectRef2;
            this.$screenArgsRemaining = objectRef3;
            this.$onboardingProgress = objectRef4;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C249522 c249522 = new C249522(this.$newScreenRequests, this.$screenArgsInBackstack, this.$currentScreen, this.$screenArgsRemaining, this.$onboardingProgress, continuation);
            c249522.L$0 = obj;
            return c249522;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionOnboardingDataState optionOnboardingDataState, Continuation<? super OptionOnboardingDataState> continuation) {
            return ((C249522) create(optionOnboardingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionOnboardingDataState.copy$default((OptionOnboardingDataState) this.L$0, null, null, this.$newScreenRequests, this.$screenArgsInBackstack.element, this.$currentScreen.element, this.$screenArgsRemaining.element, null, this.$onboardingProgress.element, null, null, null, null, null, 8003, null);
        }
    }

    public final boolean backwardNavigationDisabled() {
        return getStateFlow().getValue().getCurrentScreen().getDisableBackwardNavigation();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, kotlinx.collections.immutable.ImmutableList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.robinhood.android.optionsupgrade.ScreenArgs] */
    /* JADX WARN: Type inference failed for: r2v15, types: [T, kotlinx.collections.immutable.ImmutableList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, kotlinx.collections.immutable.ImmutableList] */
    /* JADX WARN: Type inference failed for: r2v22, types: [T, kotlinx.collections.immutable.ImmutableList] */
    /* JADX WARN: Type inference failed for: r2v29, types: [T, kotlinx.collections.immutable.PersistentList] */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, com.robinhood.android.optionsupgrade.ScreenArgs, java.lang.Object] */
    public final Tuples2<ScreenArgs, OptionOnboardingProgress> backToPreviousScreen() {
        int iNextIndex;
        OptionOnboardingViewState value = getStateFlow().getValue();
        ImmutableList<ScreenRequest> screenRequests = value.getScreenRequests();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = value.getScreenArgsInBackstack();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = value.getCurrentScreen();
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        objectRef3.element = value.getScreenArgsRemaining();
        if (((ImmutableList) objectRef.element).isEmpty() || screenRequests.isEmpty()) {
            return Tuples4.m3642to(null, value.getOnboardingProgress());
        }
        ?? r8 = (ScreenArgs) CollectionsKt.last((List) objectRef.element);
        objectRef.element = extensions2.toImmutableList(CollectionsKt.dropLast((List) objectRef.element, 1));
        if (r8.getIsCheckpoint()) {
            objectRef3.element = extensions2.persistentListOf();
        } else {
            objectRef3.element = extensions2.toImmutableList(CollectionsKt.plus((Collection) CollectionsKt.listOf(objectRef2.element), (Iterable) objectRef3.element));
        }
        Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
        ?? list = CollectionsKt.toList(screenRequests);
        objectRef4.element = list;
        List list2 = (List) list;
        ListIterator listIterator = list2.listIterator(list2.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (Intrinsics.areEqual(((ScreenRequest) listIterator.previous()).getScreenId(), r8.getScreenId())) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex >= 0) {
            T t = objectRef4.element;
            objectRef4.element = CollectionsKt.dropLast((List) t, ((List) t).size() - iNextIndex);
            objectRef2.element = r8;
            applyMutation(new C249453(objectRef4, objectRef, objectRef2, objectRef3, null));
            return Tuples4.m3642to(r8, value.getOnboardingProgress());
        }
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Screen " + ((Object) r8) + " not found in screenRequests"), true, null, 4, null);
        return Tuples4.m3642to(null, value.getOnboardingProgress());
    }

    /* compiled from: OptionOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$backToPreviousScreen$3", m3645f = "OptionOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$backToPreviousScreen$3 */
    static final class C249453 extends ContinuationImpl7 implements Function2<OptionOnboardingDataState, Continuation<? super OptionOnboardingDataState>, Object> {
        final /* synthetic */ Ref.ObjectRef<ScreenArgs> $currentScreen;
        final /* synthetic */ Ref.ObjectRef<List<ScreenRequest>> $newScreenRequests;
        final /* synthetic */ Ref.ObjectRef<ImmutableList<ScreenArgs>> $screenArgsInBackstack;
        final /* synthetic */ Ref.ObjectRef<ImmutableList<ScreenArgs>> $screenArgsRemaining;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C249453(Ref.ObjectRef<List<ScreenRequest>> objectRef, Ref.ObjectRef<ImmutableList<ScreenArgs>> objectRef2, Ref.ObjectRef<ScreenArgs> objectRef3, Ref.ObjectRef<ImmutableList<ScreenArgs>> objectRef4, Continuation<? super C249453> continuation) {
            super(2, continuation);
            this.$newScreenRequests = objectRef;
            this.$screenArgsInBackstack = objectRef2;
            this.$currentScreen = objectRef3;
            this.$screenArgsRemaining = objectRef4;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C249453 c249453 = new C249453(this.$newScreenRequests, this.$screenArgsInBackstack, this.$currentScreen, this.$screenArgsRemaining, continuation);
            c249453.L$0 = obj;
            return c249453;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionOnboardingDataState optionOnboardingDataState, Continuation<? super OptionOnboardingDataState> continuation) {
            return ((C249453) create(optionOnboardingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionOnboardingDataState.copy$default((OptionOnboardingDataState) this.L$0, null, null, this.$newScreenRequests.element, this.$screenArgsInBackstack.element, this.$currentScreen.element, this.$screenArgsRemaining.element, null, null, null, null, null, null, null, 8131, null);
        }
    }

    /* compiled from: OptionOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$resetScreenStack$1", m3645f = "OptionOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$resetScreenStack$1 */
    static final class C249591 extends ContinuationImpl7 implements Function2<OptionOnboardingDataState, Continuation<? super OptionOnboardingDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C249591(Continuation<? super C249591> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C249591 c249591 = new C249591(continuation);
            c249591.L$0 = obj;
            return c249591;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionOnboardingDataState optionOnboardingDataState, Continuation<? super OptionOnboardingDataState> continuation) {
            return ((C249591) create(optionOnboardingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionOnboardingDataState.copy$default((OptionOnboardingDataState) this.L$0, null, null, extensions2.persistentListOf(), extensions2.persistentListOf(), OptionOnboardingStatesKt.getInitialScreenArgs(), extensions2.persistentListOf(), null, null, null, null, null, null, null, 8131, null);
        }
    }

    public final void resetScreenStack() {
        applyMutation(new C249591(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013f A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:49:0x0182, B:21:0x006e, B:37:0x0135, B:39:0x013f, B:45:0x015c, B:41:0x0144, B:43:0x0156, B:44:0x0159, B:29:0x00cb, B:30:0x00e9, B:32:0x00ef, B:33:0x00fd), top: B:68:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0144 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:49:0x0182, B:21:0x006e, B:37:0x0135, B:39:0x013f, B:45:0x015c, B:41:0x0144, B:43:0x0156, B:44:0x0159, B:29:0x00cb, B:30:0x00e9, B:32:0x00ef, B:33:0x00fd), top: B:68:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r229v0, types: [com.robinhood.android.optionsupgrade.OptionOnboardingDuxo, com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.HasSavedState] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getNextScreensFromEndpoint(List<? extends ScreenRequest> list, ScreenArgs screenArgs, Continuation<? super List<? extends ScreenArgs>> continuation) throws ScreenError {
        C249481 c249481;
        OptionOnboardingViewState optionOnboardingViewState;
        List<? extends ScreenRequest> list2;
        ScreenArgs screenArgs2;
        Instant instant;
        String str;
        String str2;
        String str3;
        ArrayList arrayList;
        ScreenArgs screenArgs3;
        OptionOnboardingStore optionOnboardingStore;
        OptionOnboardingViewState optionOnboardingViewState2;
        Instant instant2;
        OptionOnboardingViewState optionOnboardingViewState3;
        ScreenArgs screenArgs4;
        GetNextOnboardingScreensResponseDto.ResponseDto response;
        if (continuation instanceof C249481) {
            c249481 = (C249481) continuation;
            int i = c249481.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c249481.label = i - Integer.MIN_VALUE;
            } else {
                c249481 = new C249481(continuation);
            }
        }
        Object nextScreens = c249481.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c249481.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(nextScreens);
                Instant instantNow = Instant.now();
                optionOnboardingViewState = (OptionOnboardingViewState) getStateFlow().getValue();
                list2 = list;
                c249481.L$0 = list2;
                screenArgs2 = screenArgs;
                c249481.L$1 = screenArgs2;
                c249481.L$2 = instantNow;
                c249481.L$3 = optionOnboardingViewState;
                c249481.label = 1;
                Object accountNumber = getAccountNumber(c249481);
                if (accountNumber != coroutine_suspended) {
                    instant = instantNow;
                    nextScreens = accountNumber;
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    optionOnboardingViewState3 = (OptionOnboardingViewState) c249481.L$2;
                    instant2 = (Instant) c249481.L$1;
                    screenArgs4 = (ScreenArgs) c249481.L$0;
                    ResultKt.throwOnFailure(nextScreens);
                    GetNextOnboardingScreensResponseDto getNextOnboardingScreensResponseDto = (GetNextOnboardingScreensResponseDto) nextScreens;
                    applyMutation(new C249503(null));
                    EventLogger.DefaultImpls.logAppear$default(this.eventLogger, null, new Screen(OptionOnboardingLoggings.getScreenName(screenArgs4), null, OptionOnboardingLoggings.OPTION_ONBOARDING_NEXT_SCREENS_DURATION_SCREEN_IDENTIFIER, null, 10, null), null, null, new Context(0, 0, 0, null, null, null, null, null, (int) (Instant.now().toEpochMilli() - instant2.toEpochMilli()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, optionOnboardingViewState3.getOptionOnboardingContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, -1, -1, -1, -1, -65, 16383, null), 13, null);
                    ((OptionOnboardingViewState) getStateFlow().getValue()).getInOptionsPostEnableExperiment();
                    response = getNextOnboardingScreensResponseDto.getResponse();
                    if (response instanceof GetNextOnboardingScreensResponseDto.ResponseDto.ScreenResponse) {
                        if (response instanceof GetNextOnboardingScreensResponseDto.ResponseDto.ErrorResponse) {
                            throw OptionOnboardingStatesKt.toScreenError(((GetNextOnboardingScreensResponseDto.ResponseDto.ErrorResponse) response).getValue());
                        }
                        if (response == null) {
                            return CollectionsKt.emptyList();
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    List<OnboardingScreenResponseDto> screen_list = ((GetNextOnboardingScreensResponseDto.ResponseDto.ScreenResponse) response).getValue().getScreen_list();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(screen_list, 10));
                    for (OnboardingScreenResponseDto onboardingScreenResponseDto : screen_list) {
                        UUID uuidRandomUUID = UUID.randomUUID();
                        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
                        arrayList2.add(OptionOnboardingStatesKt.toScreenArgs$default(onboardingScreenResponseDto, uuidRandomUUID, false, ((OptionOnboarding) INSTANCE.getExtras((HasSavedState) this)).getSource(), 2, null));
                    }
                    return arrayList2;
                }
                String str4 = (String) c249481.L$7;
                ?? r7 = (List) c249481.L$6;
                String str5 = (String) c249481.L$5;
                String str6 = (String) c249481.L$4;
                optionOnboardingStore = (OptionOnboardingStore) c249481.L$3;
                optionOnboardingViewState2 = (OptionOnboardingViewState) c249481.L$2;
                Instant instant3 = (Instant) c249481.L$1;
                screenArgs3 = (ScreenArgs) c249481.L$0;
                ResultKt.throwOnFailure(nextScreens);
                str2 = str4;
                arrayList = r7;
                str3 = str5;
                str = str6;
                instant2 = instant3;
                GetNextOnboardingScreensRequestDto getNextOnboardingScreensRequestDto = new GetNextOnboardingScreensRequestDto(str, str3, arrayList, str2, null, (List) nextScreens, !isSdpEntryPoint() ? OnboardingEntryPointDto.STOCK_DETAIL_PAGE : ((OptionOnboarding) INSTANCE.getExtras((HasSavedState) this)).getSource().isFromAcatsJointAccount() ? OnboardingEntryPointDto.JA_ACATS : OnboardingEntryPointDto.ONBOARDING_ENTRY_POINT_UNSPECIFIED, 16, null);
                c249481.L$0 = screenArgs3;
                c249481.L$1 = instant2;
                c249481.L$2 = optionOnboardingViewState2;
                c249481.L$3 = null;
                c249481.L$4 = null;
                c249481.L$5 = null;
                c249481.L$6 = null;
                c249481.L$7 = null;
                c249481.label = 3;
                nextScreens = optionOnboardingStore.getNextScreens(getNextOnboardingScreensRequestDto, c249481);
                if (nextScreens != coroutine_suspended) {
                    optionOnboardingViewState3 = optionOnboardingViewState2;
                    screenArgs4 = screenArgs3;
                    GetNextOnboardingScreensResponseDto getNextOnboardingScreensResponseDto2 = (GetNextOnboardingScreensResponseDto) nextScreens;
                    applyMutation(new C249503(null));
                    EventLogger.DefaultImpls.logAppear$default(this.eventLogger, null, new Screen(OptionOnboardingLoggings.getScreenName(screenArgs4), null, OptionOnboardingLoggings.OPTION_ONBOARDING_NEXT_SCREENS_DURATION_SCREEN_IDENTIFIER, null, 10, null), null, null, new Context(0, 0, 0, null, null, null, null, null, (int) (Instant.now().toEpochMilli() - instant2.toEpochMilli()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, optionOnboardingViewState3.getOptionOnboardingContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, -1, -1, -1, -1, -65, 16383, null), 13, null);
                    ((OptionOnboardingViewState) getStateFlow().getValue()).getInOptionsPostEnableExperiment();
                    response = getNextOnboardingScreensResponseDto2.getResponse();
                    if (response instanceof GetNextOnboardingScreensResponseDto.ResponseDto.ScreenResponse) {
                    }
                }
                return coroutine_suspended;
            }
            optionOnboardingViewState = (OptionOnboardingViewState) c249481.L$3;
            instant = (Instant) c249481.L$2;
            ScreenArgs screenArgs5 = (ScreenArgs) c249481.L$1;
            List<? extends ScreenRequest> list3 = (List) c249481.L$0;
            ResultKt.throwOnFailure(nextScreens);
            screenArgs2 = screenArgs5;
            list2 = list3;
            String str7 = (String) nextScreens;
            applyMutation(new C249492(instant, null));
            OptionOnboardingStore optionOnboardingStore2 = this.optionOnboardingStore;
            String string2 = optionOnboardingViewState.getSessionId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            List<? extends ScreenRequest> list4 = list2;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList3.add(((ScreenRequest) it.next()).toDto());
            }
            String name = ((OptionOnboarding) INSTANCE.getExtras((HasSavedState) this)).getSource().getName();
            SuspendLazy<List<OnboardingExperimentDto>> suspendLazy = this.cachedExperiments;
            c249481.L$0 = screenArgs2;
            c249481.L$1 = instant;
            c249481.L$2 = optionOnboardingViewState;
            c249481.L$3 = optionOnboardingStore2;
            c249481.L$4 = str7;
            c249481.L$5 = string2;
            c249481.L$6 = arrayList3;
            c249481.L$7 = name;
            c249481.label = 2;
            Object objInvoke = suspendLazy.invoke(c249481);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = str7;
            nextScreens = objInvoke;
            str2 = name;
            str3 = string2;
            arrayList = arrayList3;
            screenArgs3 = screenArgs2;
            optionOnboardingStore = optionOnboardingStore2;
            optionOnboardingViewState2 = optionOnboardingViewState;
            instant2 = instant;
            GetNextOnboardingScreensRequestDto getNextOnboardingScreensRequestDto2 = new GetNextOnboardingScreensRequestDto(str, str3, arrayList, str2, null, (List) nextScreens, !isSdpEntryPoint() ? OnboardingEntryPointDto.STOCK_DETAIL_PAGE : ((OptionOnboarding) INSTANCE.getExtras((HasSavedState) this)).getSource().isFromAcatsJointAccount() ? OnboardingEntryPointDto.JA_ACATS : OnboardingEntryPointDto.ONBOARDING_ENTRY_POINT_UNSPECIFIED, 16, null);
            c249481.L$0 = screenArgs3;
            c249481.L$1 = instant2;
            c249481.L$2 = optionOnboardingViewState2;
            c249481.L$3 = null;
            c249481.L$4 = null;
            c249481.L$5 = null;
            c249481.L$6 = null;
            c249481.L$7 = null;
            c249481.label = 3;
            nextScreens = optionOnboardingStore.getNextScreens(getNextOnboardingScreensRequestDto2, c249481);
            if (nextScreens != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (Throwable th) {
            applyMutation(new OptionOnboardingDuxo6(null));
            throw th;
        }
    }

    /* compiled from: OptionOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$getNextScreensFromEndpoint$2", m3645f = "OptionOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$getNextScreensFromEndpoint$2 */
    static final class C249492 extends ContinuationImpl7 implements Function2<OptionOnboardingDataState, Continuation<? super OptionOnboardingDataState>, Object> {
        final /* synthetic */ Instant $timeStart;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C249492(Instant instant, Continuation<? super C249492> continuation) {
            super(2, continuation);
            this.$timeStart = instant;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C249492 c249492 = new C249492(this.$timeStart, continuation);
            c249492.L$0 = obj;
            return c249492;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionOnboardingDataState optionOnboardingDataState, Continuation<? super OptionOnboardingDataState> continuation) {
            return ((C249492) create(optionOnboardingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionOnboardingDataState.copy$default((OptionOnboardingDataState) this.L$0, null, null, null, null, null, null, null, null, boxing.boxLong(this.$timeStart.toEpochMilli()), null, null, null, null, 7935, null);
        }
    }

    /* compiled from: OptionOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$getNextScreensFromEndpoint$3", m3645f = "OptionOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$getNextScreensFromEndpoint$3 */
    static final class C249503 extends ContinuationImpl7 implements Function2<OptionOnboardingDataState, Continuation<? super OptionOnboardingDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C249503(Continuation<? super C249503> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C249503 c249503 = new C249503(continuation);
            c249503.L$0 = obj;
            return c249503;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionOnboardingDataState optionOnboardingDataState, Continuation<? super OptionOnboardingDataState> continuation) {
            return ((C249503) create(optionOnboardingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionOnboardingDataState.copy$default((OptionOnboardingDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, 7935, null);
        }
    }

    private final OptionOnboardingProgress getUpdatedOnboardingProgress(List<? extends ScreenArgs> newScreens, OptionOnboardingProgress oldProgress) {
        OptionOnboardingProgress onboardingProgress;
        ScreenArgs screenArgs = (ScreenArgs) CollectionsKt.lastOrNull((List) newScreens);
        if (screenArgs == null || (onboardingProgress = screenArgs.getOnboardingProgress()) == null) {
            onboardingProgress = oldProgress;
        }
        if (onboardingProgress != oldProgress && onboardingProgress == OptionOnboardingProgress.SUCCESS) {
            this.accountProvider.refresh(true);
        }
        return onboardingProgress;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<OptionUpgradeExperimentType, OptionOnboardingExperimentState> convertUpgradeExperimentDtosToState(List<OnboardingExperimentDto> dtos) {
        Parcelable redesign;
        Parcelable redesign2;
        List<OnboardingExperimentDto> list = dtos;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (OnboardingExperimentDto onboardingExperimentDto : list) {
            Tuples2 tuples2M3642to = Tuples4.m3642to(onboardingExperimentDto.getName(), onboardingExperimentDto.getVariant());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str = (String) linkedHashMap.get(Experiments.OptionsOnboardingL0SplashRedesignExperiment.INSTANCE.getServerName());
        if (str != null) {
            if (Intrinsics.areEqual(str, Experiments.OptionsOnboardingL0SplashRedesignExperiment.Variant.CONTROL.getServerValue())) {
                redesign2 = OptionOnboardingExperimentState.SplashL0.Swipie.INSTANCE;
            } else {
                redesign2 = new OptionOnboardingExperimentState.SplashL0.Redesign(OptionOnboardingExperimentState.SplashL0.Redesign.RedesignL0AssetType.INSTANCE.fromServerValue(str));
            }
            linkedHashMap2.put(OptionUpgradeExperimentType.OPTIONS_L0_SPLASH_EXPERIMENT, redesign2);
        }
        String str2 = (String) linkedHashMap.get(Experiments.OptionsOnboardingL2SplashRedesignV2Experiment.INSTANCE.getServerName());
        if (str2 != null) {
            if (Intrinsics.areEqual(str2, Experiments.OptionsOnboardingL2SplashRedesignV2Experiment.Variant.CONTROL.getServerValue())) {
                redesign = OptionOnboardingExperimentState.SplashL2.Swipie.INSTANCE;
            } else {
                redesign = new OptionOnboardingExperimentState.SplashL2.Redesign(OptionOnboardingExperimentState.SplashL2.Redesign.RedesignL2AssetType.INSTANCE.fromServerValue(str2));
            }
            linkedHashMap2.put(OptionUpgradeExperimentType.OPTIONS_L2_SPLASH_EXPERIMENT, redesign);
        }
        return linkedHashMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSdpEntryPoint() {
        return ((OptionOnboarding) INSTANCE.getExtras((HasSavedState) this)).getSource() instanceof OptionOnboarding.OptionOnboardingSource.ServerDriven;
    }

    /* compiled from: OptionOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingDuxo;", "Lcom/robinhood/android/options/contracts/OptionOnboarding;", "<init>", "()V", "SAVED_STATE_KEY", "", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<OptionOnboardingDuxo, OptionOnboarding> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public OptionOnboarding getExtras(SavedStateHandle savedStateHandle) {
            return (OptionOnboarding) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public OptionOnboarding getExtras(OptionOnboardingDuxo optionOnboardingDuxo) {
            return (OptionOnboarding) DuxoCompanion2.DefaultImpls.getExtras(this, optionOnboardingDuxo);
        }
    }
}
