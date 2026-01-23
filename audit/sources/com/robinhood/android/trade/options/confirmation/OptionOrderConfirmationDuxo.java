package com.robinhood.android.trade.options.confirmation;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.options.utils.PairUtils;
import com.robinhood.android.lib.margin.MarginAccountUpsellStore;
import com.robinhood.android.margin.experiments.PdtRevampExpV2;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.prefs.OptionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionOrderStore;
import com.robinhood.librobinhood.usecase.CheckOptionUpgradeToLevel3EligibilityUseCase;
import com.robinhood.librobinhood.usecase.CheckOptionUpgradeToLevel3EligibilityUseCase3;
import com.robinhood.models.api.AccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OptionOrder;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionOrder;
import com.robinhood.prefs.LongPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.OptionsCancelNewContext;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
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
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxAwait3;
import kotlinx.coroutines.rx2.RxConvert;
import kotlinx.datetime.Clock2;

/* compiled from: OptionOrderConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001/Bc\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016J\u000e\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020'J\u000e\u0010(\u001a\u00020 2\u0006\u0010#\u001a\u00020$J\u0010\u0010)\u001a\u00020 2\b\u0010*\u001a\u0004\u0018\u00010+J\u0006\u0010,\u001a\u00020 J\u0006\u0010-\u001a\u00020 J\u0006\u0010.\u001a\u00020 R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationDataState;", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "optionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref", "Lcom/robinhood/prefs/LongPreference;", "checkOptionUpgradeToLevel3EligibilityUseCase", "Lcom/robinhood/librobinhood/usecase/CheckOptionUpgradeToLevel3EligibilityUseCase;", "marginAccountUpsellStore", "Lcom/robinhood/android/lib/margin/MarginAccountUpsellStore;", "stateProvider", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/OptionOrderStore;Lcom/robinhood/android/performancelogger/PerformanceLogger;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/prefs/LongPreference;Lcom/robinhood/librobinhood/usecase/CheckOptionUpgradeToLevel3EligibilityUseCase;Lcom/robinhood/android/lib/margin/MarginAccountUpsellStore;Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onStart", "setAccount", "account", "Lcom/robinhood/models/db/Account;", "checkIsEligibleToShowL3EntryPoint", "accountNumber", "", "checkIsEligibleToShowMarginAccountUpsell", "bindOptionOrder", "uiOptionOrder", "Lcom/robinhood/models/ui/UiOptionOrder;", "logConfirmationShown", "logReplaceButtonTap", "logGoToOptionOnboarding", "Companion", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OptionOrderConfirmationDuxo extends BaseDuxo<OptionOrderConfirmationDataState, OptionOrderConfirmationViewState> implements HasSavedState {
    private final CheckOptionUpgradeToLevel3EligibilityUseCase checkOptionUpgradeToLevel3EligibilityUseCase;
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final MarginAccountUpsellStore marginAccountUpsellStore;
    private final LongPreference optionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref;
    private final OptionOrderStore optionOrderStore;
    private final PerformanceLogger performanceLogger;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OptionOrderConfirmationDuxo(EventLogger eventLogger, ExperimentsStore experimentsStore, OptionOrderStore optionOrderStore, PerformanceLogger performanceLogger, UserStore userStore, @OptionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref LongPreference optionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref, CheckOptionUpgradeToLevel3EligibilityUseCase checkOptionUpgradeToLevel3EligibilityUseCase, MarginAccountUpsellStore marginAccountUpsellStore, OptionOrderConfirmationStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(optionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref, "optionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref");
        Intrinsics.checkNotNullParameter(checkOptionUpgradeToLevel3EligibilityUseCase, "checkOptionUpgradeToLevel3EligibilityUseCase");
        Intrinsics.checkNotNullParameter(marginAccountUpsellStore, "marginAccountUpsellStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        OptionOrderConfirmationFragment.Args.PassthroughContext passthroughContext = ((OptionOrderConfirmationFragment.Args) companion.getArgs(savedStateHandle)).getPassthroughContext();
        UiOptionChain singleUiOptionChain = passthroughContext != null ? passthroughContext.getSingleUiOptionChain() : null;
        OptionOrderConfirmationFragment.Args.PassthroughContext passthroughContext2 = ((OptionOrderConfirmationFragment.Args) companion.getArgs(savedStateHandle)).getPassthroughContext();
        super(new OptionOrderConfirmationDataState(null, null, singleUiOptionChain, false, false, passthroughContext2 != null ? passthroughContext2.getUiOptionOrderFee() : null, null, null, false, false, 987, null), stateProvider, duxoBundle);
        this.eventLogger = eventLogger;
        this.experimentsStore = experimentsStore;
        this.optionOrderStore = optionOrderStore;
        this.performanceLogger = performanceLogger;
        this.userStore = userStore;
        this.optionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref = optionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref;
        this.checkOptionUpgradeToLevel3EligibilityUseCase = checkOptionUpgradeToLevel3EligibilityUseCase;
        this.marginAccountUpsellStore = marginAccountUpsellStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C297831(null), 3, null);
        Observable observableDistinctUntilChanged = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiments.OptionsCatFeesCopyKillSwitch.INSTANCE}, false, null, 6, null).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderConfirmationDuxo.onCreate$lambda$0(this.f$0, (Boolean) obj);
            }
        });
        Observable observableDistinctUntilChanged2 = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiments.OptionsCatFeesKillSwitch.INSTANCE}, false, null, 6, null).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderConfirmationDuxo.onCreate$lambda$1(this.f$0, (Boolean) obj);
            }
        });
    }

    /* compiled from: OptionOrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$onCreate$1", m3645f = "OptionOrderConfirmationDuxo.kt", m3646l = {255}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$onCreate$1 */
    static final class C297831 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C297831(Continuation<? super C297831> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOrderConfirmationDuxo.this.new C297831(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C297831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable<User> user = OptionOrderConfirmationDuxo.this.userStore.getUser();
                this.label = 1;
                obj = RxAwait3.awaitFirst(user, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            OptionOrderConfirmationDuxo.this.applyMutation(new AnonymousClass1((User) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: OptionOrderConfirmationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$onCreate$1$1", m3645f = "OptionOrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionOrderConfirmationDataState, Continuation<? super OptionOrderConfirmationDataState>, Object> {
            final /* synthetic */ User $user;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(User user, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$user = user;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$user, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionOrderConfirmationDataState optionOrderConfirmationDataState, Continuation<? super OptionOrderConfirmationDataState> continuation) {
                return ((AnonymousClass1) create(optionOrderConfirmationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return OptionOrderConfirmationDataState.copy$default((OptionOrderConfirmationDataState) this.L$0, null, null, null, false, false, null, this.$user.getOrigin().getLocality(), null, false, false, 959, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(OptionOrderConfirmationDuxo optionOrderConfirmationDuxo, Boolean bool) {
        optionOrderConfirmationDuxo.applyMutation(new OptionOrderConfirmationDuxo2(bool, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(OptionOrderConfirmationDuxo optionOrderConfirmationDuxo, Boolean bool) {
        optionOrderConfirmationDuxo.applyMutation(new OptionOrderConfirmationDuxo3(bool, null));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        OptionOrderConfirmationFragment.Args.PassthroughContext passthroughContext = ((OptionOrderConfirmationFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getPassthroughContext();
        Observable observableJust = Observable.just(Optional3.asOptional(passthroughContext != null ? passthroughContext.getOrderIdToReplace() : null));
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        Observable map = observableJust.map(new Function() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$onStart$$inlined$mapDistinctNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional((UUID) ((Optional) it).getOrNull());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C29776x4f44695d<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        Observable observableRefCount = observableDistinctUntilChanged.replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        Observable observableSwitchMap = observableRefCount.switchMap(new Function() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo.onStart.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends OptionOrder> apply(UUID orderIdToReplace) {
                Intrinsics.checkNotNullParameter(orderIdToReplace, "orderIdToReplace");
                return OptionOrderStore.pollWhileNonFinal$default(OptionOrderConfirmationDuxo.this.optionOrderStore, orderIdToReplace, null, 2, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null);
        Observable observableDistinctUntilChanged2 = observableRefCount.switchMap(new Function() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo.onStart.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends UiOptionOrder> apply(UUID orderIdToReplace) {
                Intrinsics.checkNotNullParameter(orderIdToReplace, "orderIdToReplace");
                return OptionOrderConfirmationDuxo.this.optionOrderStore.getOptionOrder(orderIdToReplace);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderConfirmationDuxo.onStart$lambda$3(this.f$0, (UiOptionOrder) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C297864(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(OptionOrderConfirmationDuxo optionOrderConfirmationDuxo, UiOptionOrder uiOptionOrder) {
        optionOrderConfirmationDuxo.applyMutation(new OptionOrderConfirmationDuxo4(uiOptionOrder, null));
        return Unit.INSTANCE;
    }

    /* compiled from: OptionOrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$onStart$4", m3645f = "OptionOrderConfirmationDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$onStart$4 */
    static final class C297864 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C297864(Continuation<? super C297864> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOrderConfirmationDuxo.this.new C297864(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C297864) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionOrderConfirmationViewState> stateFlow = OptionOrderConfirmationDuxo.this.getStateFlow();
                final Flow<OptionsCancelNewContextData> flow = new Flow<OptionsCancelNewContextData>() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$onStart$4$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionsCancelNewContextData> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$onStart$4$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$onStart$4$invokeSuspend$$inlined$map$1$2", m3645f = "OptionOrderConfirmationDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$onStart$4$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                OptionsCancelNewContextData optionsCancelNewContextData = ((OptionOrderConfirmationViewState) obj).getOptionsCancelNewContextData();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(optionsCancelNewContextData, anonymousClass1) == coroutine_suspended) {
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
                };
                Flow flowTake = FlowKt.take(new Flow<Tuples2<? extends String, ? extends String>>() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$onStart$4$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Tuples2<? extends String, ? extends String>> flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$onStart$4$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$onStart$4$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionOrderConfirmationDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$onStart$4$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionsCancelNewContextData optionsCancelNewContextData = (OptionsCancelNewContextData) obj;
                                Tuples2 nullable = PairUtils.toNullable(Tuples4.m3642to(optionsCancelNewContextData.getCurrentOrderId(), optionsCancelNewContextData.getOrderToReplaceId()));
                                if (nullable != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(nullable, anonymousClass1) == coroutine_suspended) {
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
                }, 1);
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(OptionOrderConfirmationDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTake, anonymousClass3, this) == coroutine_suspended) {
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

        /* compiled from: OptionOrderConfirmationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$onStart$4$3", m3645f = "OptionOrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$onStart$4$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends String>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionOrderConfirmationDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(OptionOrderConfirmationDuxo optionOrderConfirmationDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = optionOrderConfirmationDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends String> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<String, String>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<String, String> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    Tuples2 tuples2 = (Tuples2) this.L$0;
                    String str = (String) tuples2.component1();
                    String str2 = (String) tuples2.component2();
                    EventLogger.DefaultImpls.logAppear$default(this.this$0.eventLogger, null, new Screen(Screen.Name.OPTION_ORDER_CONFIRMATION, null, null, null, 14, null), null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OptionsCancelNewContext(str2, str, OptionOrderConfirmationStateProvider2.OPTIONS_ORDER_CONFIRMATION_CANCEL_NEW_IDENTIFIER, Clock2.INSTANCE.now().toEpochMilliseconds(), null, 16, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1073741825, -1, 16383, null), 13, null);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void setAccount(Account account) {
        Intrinsics.checkNotNullParameter(account, "account");
        checkIsEligibleToShowL3EntryPoint(account.getAccountNumber());
        checkIsEligibleToShowMarginAccountUpsell(account);
        applyMutation(new C297871(account, null));
    }

    /* compiled from: OptionOrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$setAccount$1", m3645f = "OptionOrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$setAccount$1 */
    static final class C297871 extends ContinuationImpl7 implements Function2<OptionOrderConfirmationDataState, Continuation<? super OptionOrderConfirmationDataState>, Object> {
        final /* synthetic */ Account $account;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C297871(Account account, Continuation<? super C297871> continuation) {
            super(2, continuation);
            this.$account = account;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C297871 c297871 = new C297871(this.$account, continuation);
            c297871.L$0 = obj;
            return c297871;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionOrderConfirmationDataState optionOrderConfirmationDataState, Continuation<? super OptionOrderConfirmationDataState> continuation) {
            return ((C297871) create(optionOrderConfirmationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionOrderConfirmationDataState.copy$default((OptionOrderConfirmationDataState) this.L$0, null, null, null, false, false, null, null, this.$account, false, false, 895, null);
        }
    }

    /* compiled from: OptionOrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$checkIsEligibleToShowL3EntryPoint$1", m3645f = "OptionOrderConfirmationDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$checkIsEligibleToShowL3EntryPoint$1 */
    static final class C297801 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C297801(String str, Continuation<? super C297801> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOrderConfirmationDuxo.this.new C297801(this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C297801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowInvoke = OptionOrderConfirmationDuxo.this.checkOptionUpgradeToLevel3EligibilityUseCase.invoke(this.$accountNumber, CheckOptionUpgradeToLevel3EligibilityUseCase3.POST_TRADE_UPSELL);
                final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(OptionOrderConfirmationDuxo.this.optionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref.changes()), Integer.MAX_VALUE, null, 2, null);
                Flow flowConnectWhen = Operators.connectWhen(new Flow<Boolean>() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$checkIsEligibleToShowL3EntryPoint$1$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                        Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$checkIsEligibleToShowL3EntryPoint$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$checkIsEligibleToShowL3EntryPoint$1$invokeSuspend$$inlined$map$1$2", m3645f = "OptionOrderConfirmationDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$checkIsEligibleToShowL3EntryPoint$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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

                        /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
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
                                Long l = (Long) ((Optional) obj).getOrNull();
                                boolean z = l != null && l.longValue() == 0;
                                long epochMilliseconds = Clock2.INSTANCE.now().toEpochMilliseconds();
                                if (l != null) {
                                    long jLongValue = epochMilliseconds - l.longValue();
                                    Duration.Companion companion = Duration.INSTANCE;
                                    boolean z2 = jLongValue >= Duration.m28738getInWholeMillisecondsimpl(Duration3.toDuration(90, DurationUnitJvm.DAYS));
                                    Boolean boolBoxBoolean = boxing.boxBoolean(z || z2);
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
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
                }, flowInvoke, FlowKt.flowOf(boxing.boxBoolean(false)));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionOrderConfirmationDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowConnectWhen, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: OptionOrderConfirmationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isEligible", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$checkIsEligibleToShowL3EntryPoint$1$1", m3645f = "OptionOrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$checkIsEligibleToShowL3EntryPoint$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ OptionOrderConfirmationDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionOrderConfirmationDuxo optionOrderConfirmationDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionOrderConfirmationDuxo;
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

            /* compiled from: OptionOrderConfirmationDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$checkIsEligibleToShowL3EntryPoint$1$1$1", m3645f = "OptionOrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$checkIsEligibleToShowL3EntryPoint$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505881 extends ContinuationImpl7 implements Function2<OptionOrderConfirmationDataState, Continuation<? super OptionOrderConfirmationDataState>, Object> {
                final /* synthetic */ boolean $isEligible;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505881(boolean z, Continuation<? super C505881> continuation) {
                    super(2, continuation);
                    this.$isEligible = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505881 c505881 = new C505881(this.$isEligible, continuation);
                    c505881.L$0 = obj;
                    return c505881;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionOrderConfirmationDataState optionOrderConfirmationDataState, Continuation<? super OptionOrderConfirmationDataState> continuation) {
                    return ((C505881) create(optionOrderConfirmationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionOrderConfirmationDataState.copy$default((OptionOrderConfirmationDataState) this.L$0, null, null, null, false, false, null, null, null, this.$isEligible, false, 767, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C505881(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void checkIsEligibleToShowL3EntryPoint(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C297801(accountNumber, null), 3, null);
    }

    /* compiled from: OptionOrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$checkIsEligibleToShowMarginAccountUpsell$1", m3645f = "OptionOrderConfirmationDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$checkIsEligibleToShowMarginAccountUpsell$1 */
    static final class C297811 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Account $account;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C297811(Account account, Continuation<? super C297811> continuation) {
            super(2, continuation);
            this.$account = account;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOrderConfirmationDuxo.this.new C297811(this.$account, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C297811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                boolean zShowMarginAccountUpsell = OptionOrderConfirmationDuxo.this.marginAccountUpsellStore.showMarginAccountUpsell();
                if (this.$account.getType() != AccountType.CASH || !zShowMarginAccountUpsell) {
                    OptionOrderConfirmationDuxo.this.applyMutation(new AnonymousClass1(null));
                } else {
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(OptionOrderConfirmationDuxo.this.experimentsStore, new Experiment[]{PdtRevampExpV2.INSTANCE}, false, null, 6, null);
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionOrderConfirmationDuxo.this, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: OptionOrderConfirmationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$checkIsEligibleToShowMarginAccountUpsell$1$1", m3645f = "OptionOrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$checkIsEligibleToShowMarginAccountUpsell$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionOrderConfirmationDataState, Continuation<? super OptionOrderConfirmationDataState>, Object> {
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
            public final Object invoke(OptionOrderConfirmationDataState optionOrderConfirmationDataState, Continuation<? super OptionOrderConfirmationDataState> continuation) {
                return ((AnonymousClass1) create(optionOrderConfirmationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return OptionOrderConfirmationDataState.copy$default((OptionOrderConfirmationDataState) this.L$0, null, null, null, false, false, null, null, null, false, false, 511, null);
            }
        }

        /* compiled from: OptionOrderConfirmationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isMember", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$checkIsEligibleToShowMarginAccountUpsell$1$2", m3645f = "OptionOrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$checkIsEligibleToShowMarginAccountUpsell$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ OptionOrderConfirmationDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionOrderConfirmationDuxo optionOrderConfirmationDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionOrderConfirmationDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionOrderConfirmationDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$checkIsEligibleToShowMarginAccountUpsell$1$2$1", m3645f = "OptionOrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$checkIsEligibleToShowMarginAccountUpsell$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionOrderConfirmationDataState, Continuation<? super OptionOrderConfirmationDataState>, Object> {
                final /* synthetic */ boolean $isMember;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$isMember = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isMember, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionOrderConfirmationDataState optionOrderConfirmationDataState, Continuation<? super OptionOrderConfirmationDataState> continuation) {
                    return ((AnonymousClass1) create(optionOrderConfirmationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionOrderConfirmationDataState.copy$default((OptionOrderConfirmationDataState) this.L$0, null, null, null, false, false, null, null, null, false, this.$isMember, 511, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void checkIsEligibleToShowMarginAccountUpsell(Account account) {
        Intrinsics.checkNotNullParameter(account, "account");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C297811(account, null), 3, null);
    }

    /* compiled from: OptionOrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$bindOptionOrder$1", m3645f = "OptionOrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$bindOptionOrder$1 */
    static final class C297791 extends ContinuationImpl7 implements Function2<OptionOrderConfirmationDataState, Continuation<? super OptionOrderConfirmationDataState>, Object> {
        final /* synthetic */ UiOptionOrder $uiOptionOrder;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C297791(UiOptionOrder uiOptionOrder, Continuation<? super C297791> continuation) {
            super(2, continuation);
            this.$uiOptionOrder = uiOptionOrder;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C297791 c297791 = new C297791(this.$uiOptionOrder, continuation);
            c297791.L$0 = obj;
            return c297791;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionOrderConfirmationDataState optionOrderConfirmationDataState, Continuation<? super OptionOrderConfirmationDataState> continuation) {
            return ((C297791) create(optionOrderConfirmationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionOrderConfirmationDataState.copy$default((OptionOrderConfirmationDataState) this.L$0, this.$uiOptionOrder, null, null, false, false, null, null, null, false, false, 1022, null);
        }
    }

    public final void bindOptionOrder(UiOptionOrder uiOptionOrder) {
        applyMutation(new C297791(uiOptionOrder, null));
    }

    public final void logConfirmationShown() {
        PerformanceLogger.DefaultImpls.completeMetric$default(this.performanceLogger, PerformanceMetricEventData.Name.SWIPE_TO_SUBMIT_OPTION_CONFIRMATION, null, 2, null);
    }

    /* compiled from: OptionOrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$logReplaceButtonTap$1", m3645f = "OptionOrderConfirmationDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$logReplaceButtonTap$1 */
    static final class C297821 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C297821(Continuation<? super C297821> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOrderConfirmationDuxo.this.new C297821(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C297821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionOrderConfirmationViewState> stateFlow = OptionOrderConfirmationDuxo.this.getStateFlow();
                Flow flowTake = FlowKt.take(new Flow<String>() { // from class: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$logReplaceButtonTap$1$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$logReplaceButtonTap$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$logReplaceButtonTap$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionOrderConfirmationDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$logReplaceButtonTap$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                String currentOrderId = ((OptionOrderConfirmationViewState) obj).getOptionsCancelNewContextData().getCurrentOrderId();
                                if (currentOrderId != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(currentOrderId, anonymousClass1) == coroutine_suspended) {
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
                }, 1);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionOrderConfirmationDuxo.this, null);
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

        /* compiled from: OptionOrderConfirmationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "currentOrderId", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$logReplaceButtonTap$1$2", m3645f = "OptionOrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationDuxo$logReplaceButtonTap$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionOrderConfirmationDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionOrderConfirmationDuxo optionOrderConfirmationDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionOrderConfirmationDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    String str = (String) this.L$0;
                    EventLogger.DefaultImpls.logTap$default(this.this$0.eventLogger, null, new Screen(Screen.Name.OPTION_ORDER_CONFIRMATION, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OptionsCancelNewContext(str, "", OptionOrderConfirmationStateProvider2.OPTIONS_ORDER_CONFIRMATION_CANCEL_NEW_IDENTIFIER, Clock2.INSTANCE.now().toEpochMilliseconds(), null, 16, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1073741825, -1, 16383, null), false, 41, null);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void logReplaceButtonTap() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C297821(null), 3, null);
    }

    public final void logGoToOptionOnboarding() {
        this.optionLevel3EntryPointPostTradeUpsellSplashLastSeenTimePref.set(Clock2.INSTANCE.now().toEpochMilliseconds());
    }

    /* compiled from: OptionOrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationDuxo;", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationFragment$Args;", "<init>", "()V", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OptionOrderConfirmationDuxo, OptionOrderConfirmationFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionOrderConfirmationFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (OptionOrderConfirmationFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionOrderConfirmationFragment.Args getArgs(OptionOrderConfirmationDuxo optionOrderConfirmationDuxo) {
            return (OptionOrderConfirmationFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, optionOrderConfirmationDuxo);
        }
    }
}
