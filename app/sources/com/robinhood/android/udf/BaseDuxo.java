package com.robinhood.android.udf;

import androidx.lifecycle.ViewModel;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.udf.Duxo;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.coroutines.p287rx.RxFactory3;
import com.robinhood.disposer.ClosableLifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleHostCoroutineScopeKt;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ScopedCompletable;
import com.robinhood.disposer.ScopedFlowable;
import com.robinhood.disposer.ScopedMaybe;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.disposer.ScopedSingle;
import com.robinhood.leakcanary.LeakDetector;
import dispatch.core.DispatcherProvider;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import kotlin.Inference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Supervisor3;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import timber.log.Timber;

/* compiled from: BaseDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\n\b\u0001\u0010\u0003 \u0001*\u00020\u00022\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00030\u00052\u00020\u0006:\u0001CB+\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ6\u00104\u001a\u0002052'\u00106\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\u0006\u0012\u0004\u0018\u00010\u00020-¢\u0006\u0002\b7H\u0004¢\u0006\u0002\u00108J\u001c\u00109\u001a\u0002052\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002050;H\u0004J\b\u0010<\u001a\u000205H\u0016J\b\u0010=\u001a\u000205H\u0016J\b\u0010>\u001a\u000205H\u0016J\b\u0010?\u001a\u000205H\u0016J\b\u0010@\u001a\u000205H\u0016J\b\u0010A\u001a\u000205H\u0016J\b\u0010B\u001a\u000205H\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001d¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0017\u001a\u0004\b&\u0010'R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010+\u001a$\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\u0006\u0012\u0004\u0018\u00010\u00020-0,X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010/\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u0017\u001a\u0004\b1\u00102¨\u0006D"}, m3636d2 = {"Lcom/robinhood/android/udf/BaseDuxo;", "DS", "", "VS", "Landroidx/lifecycle/ViewModel;", "Lcom/robinhood/android/udf/Duxo;", "Lcom/robinhood/coroutines/rx/RxFactoryHost;", "initialDataState", "stateProvider", "Lcom/robinhood/android/udf/StateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljava/lang/Object;Lcom/robinhood/android/udf/StateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "getRxFactory", "()Lcom/robinhood/coroutines/rx/RxFactory;", "stateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "stateFlow$delegate", "Lkotlin/Lazy;", "lifecycleScope", "Lcom/robinhood/disposer/LifecycleHostCoroutineScope;", "getLifecycleScope", "()Lcom/robinhood/disposer/LifecycleHostCoroutineScope;", "lifecycleEvents", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/disposer/LifecycleEvent;", "getLifecycleEvents", "()Lcom/jakewharton/rxrelay2/BehaviorRelay;", "lifecycleState", "Lcom/robinhood/disposer/LifecycleState;", "getLifecycleState", "closableLifecycleScope", "Lcom/robinhood/disposer/ClosableLifecycleHostCoroutineScope;", "getClosableLifecycleScope", "()Lcom/robinhood/disposer/ClosableLifecycleHostCoroutineScope;", "closableLifecycleScope$delegate", "logStrings", "Lcom/robinhood/android/udf/BaseDuxo$LogStrings;", "mutations", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "mutationsScope", "Lkotlinx/coroutines/CoroutineScope;", "getMutationsScope", "()Lkotlinx/coroutines/CoroutineScope;", "mutationsScope$delegate", "applyMutation", "", "mutator", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)V", "withDataState", "block", "Lkotlin/Function1;", "onCreate", "onStart", "onResume", "onPause", "onStop", "onDestroy", "onCleared", "LogStrings", "lib-udf_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public class BaseDuxo<DS, VS> extends ViewModel implements Duxo<VS>, RxFactory3 {
    public static final int $stable = 8;

    /* renamed from: closableLifecycleScope$delegate, reason: from kotlin metadata */
    private final Lazy closableLifecycleScope;
    private final DuxoBundle duxoBundle;
    private final BehaviorRelay<LifecycleEvent> lifecycleEvents;
    private final BehaviorRelay<LifecycleState> lifecycleState;
    private final LogStrings logStrings;
    private final SharedFlow2<Function2<DS, Continuation<? super DS>, Object>> mutations;

    /* renamed from: mutationsScope$delegate, reason: from kotlin metadata */
    private final Lazy mutationsScope;
    private final RxFactory rxFactory;

    /* renamed from: stateFlow$delegate, reason: from kotlin metadata */
    private final Lazy stateFlow;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean stateFlow_delegate$lambda$1$lambda$0(Object old, Object obj) {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(obj, "new");
        return old == obj;
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> asObservable(Flow<? extends T> flow) {
        return RxFactory3.DefaultImpls.asObservable(this, flow);
    }

    @Override // com.robinhood.disposer.LifecycleHost
    public ScopedCompletable bind(Completable completable, LifecycleEvent lifecycleEvent) {
        return Duxo.DefaultImpls.bind(this, completable, lifecycleEvent);
    }

    @Override // com.robinhood.disposer.LifecycleHost
    public <T> ScopedFlowable<T> bind(Flowable<T> flowable, LifecycleEvent lifecycleEvent) {
        return Duxo.DefaultImpls.bind(this, flowable, lifecycleEvent);
    }

    @Override // com.robinhood.disposer.LifecycleHost
    public <T> ScopedMaybe<T> bind(Maybe<T> maybe, LifecycleEvent lifecycleEvent) {
        return Duxo.DefaultImpls.bind(this, maybe, lifecycleEvent);
    }

    @Override // com.robinhood.disposer.LifecycleHost
    public <T> ScopedObservable<T> bind(Observable<T> observable, LifecycleEvent lifecycleEvent) {
        return Duxo.DefaultImpls.bind(this, observable, lifecycleEvent);
    }

    @Override // com.robinhood.disposer.LifecycleHost
    public <T> ScopedSingle<T> bind(Single<T> single, LifecycleEvent lifecycleEvent) {
        return Duxo.DefaultImpls.bind(this, single, lifecycleEvent);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3, com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> convertToObservable(Flow<? extends T> flow) {
        return RxFactory3.DefaultImpls.convertToObservable(this, flow);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3, com.robinhood.coroutines.p287rx.RxFactory
    public Completable rxCompletable(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return RxFactory3.DefaultImpls.rxCompletable(this, coroutineContext, function2);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3, com.robinhood.coroutines.p287rx.RxFactory
    public <T> Maybe<T> rxMaybe(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        return RxFactory3.DefaultImpls.rxMaybe(this, coroutineContext, function2);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3, com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> rxObservable(CoroutineContext coroutineContext, @Inference Function2<? super Produce4<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return RxFactory3.DefaultImpls.rxObservable(this, coroutineContext, function2);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3, com.robinhood.coroutines.p287rx.RxFactory
    public <T> Single<T> rxSingle(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        return RxFactory3.DefaultImpls.rxSingle(this, coroutineContext, function2);
    }

    public BaseDuxo(final DS initialDataState, final StateProvider<? super DS, ? extends VS> stateProvider, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(initialDataState, "initialDataState");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.duxoBundle = duxoBundle;
        this.rxFactory = duxoBundle.getRxFactory();
        this.stateFlow = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.udf.BaseDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseDuxo.stateFlow_delegate$lambda$1(this.f$0, initialDataState, stateProvider);
            }
        });
        BehaviorRelay<LifecycleEvent> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.lifecycleEvents = behaviorRelayCreate;
        BehaviorRelay<LifecycleState> behaviorRelayCreateDefault = BehaviorRelay.createDefault(LifecycleState.DEAD);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.lifecycleState = behaviorRelayCreateDefault;
        this.closableLifecycleScope = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.udf.BaseDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseDuxo.closableLifecycleScope_delegate$lambda$2(this.f$0);
            }
        });
        LogStrings.Companion companion = LogStrings.INSTANCE;
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        this.logStrings = companion.from(simpleName);
        this.mutations = SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
        this.mutationsScope = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.udf.BaseDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseDuxo.mutationsScope_delegate$lambda$3(this.f$0);
            }
        });
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3
    public RxFactory getRxFactory() {
        return this.rxFactory;
    }

    @Override // com.robinhood.android.udf.Duxo
    public StateFlow<VS> getStateFlow() {
        return (StateFlow) this.stateFlow.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StateFlow stateFlow_delegate$lambda$1(BaseDuxo baseDuxo, Object obj, final StateProvider stateProvider) {
        final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.drop(FlowKt.scan(baseDuxo.mutations, obj, new BaseDuxo2(null)), 1), new Function2() { // from class: com.robinhood.android.udf.BaseDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return Boolean.valueOf(BaseDuxo.stateFlow_delegate$lambda$1$lambda$0(obj2, obj3));
            }
        });
        return FlowKt.stateIn(new Flow<VS>() { // from class: com.robinhood.android.udf.BaseDuxo$stateFlow_delegate$lambda$1$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.udf.BaseDuxo$stateFlow_delegate$lambda$1$$inlined$map$1$2 */
            public static final class C312482<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ StateProvider receiver$inlined;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.udf.BaseDuxo$stateFlow_delegate$lambda$1$$inlined$map$1$2", m3645f = "BaseDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.udf.BaseDuxo$stateFlow_delegate$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes9.dex */
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
                        return C312482.this.emit(null, this);
                    }
                }

                public C312482(FlowCollector flowCollector, StateProvider stateProvider) {
                    this.$this_unsafeFlow = flowCollector;
                    this.receiver$inlined = stateProvider;
                }

                /* JADX WARN: Multi-variable type inference failed */
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
                        Object objReduce = this.receiver$inlined.reduce(obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(objReduce, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowDistinctUntilChanged.collect(new C312482(flowCollector, stateProvider), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, baseDuxo.getMutationsScope(), SharingStarted.INSTANCE.getEagerly(), stateProvider.reduce(obj));
    }

    @Override // com.robinhood.disposer.LifecycleHost
    public LifecycleHostCoroutineScope getLifecycleScope() {
        return getClosableLifecycleScope();
    }

    @Override // com.robinhood.disposer.LifecycleHost
    public final BehaviorRelay<LifecycleEvent> getLifecycleEvents() {
        return this.lifecycleEvents;
    }

    @Override // com.robinhood.disposer.LifecycleHost
    public final BehaviorRelay<LifecycleState> getLifecycleState() {
        return this.lifecycleState;
    }

    private final ClosableLifecycleHostCoroutineScope getClosableLifecycleScope() {
        return (ClosableLifecycleHostCoroutineScope) this.closableLifecycleScope.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClosableLifecycleHostCoroutineScope closableLifecycleScope_delegate$lambda$2(BaseDuxo baseDuxo) {
        return LifecycleHostCoroutineScopeKt.createDuxoLifecycleScope(baseDuxo, baseDuxo.duxoBundle.getDispatcherProvider(), baseDuxo.duxoBundle.getCoroutineExceptionHandler());
    }

    private final CoroutineScope getMutationsScope() {
        return (CoroutineScope) this.mutationsScope.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineScope mutationsScope_delegate$lambda$3(BaseDuxo baseDuxo) {
        DispatcherProvider dispatcherProvider = baseDuxo.duxoBundle.getDispatcherProvider();
        return CoroutineScope2.CoroutineScope(Supervisor3.SupervisorJob$default(null, 1, null).plus(CoroutineDispatcher.limitedParallelism$default(dispatcherProvider.getDefault(), 1, null, 2, null)).plus(dispatcherProvider));
    }

    /* compiled from: BaseDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.udf.BaseDuxo$applyMutation$1", m3645f = "BaseDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.udf.BaseDuxo$applyMutation$1 */
    /* loaded from: classes9.dex */
    static final class C312491 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<DS, Continuation<? super DS>, Object> $mutator;
        int label;
        final /* synthetic */ BaseDuxo<DS, VS> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C312491(BaseDuxo<DS, ? extends VS> baseDuxo, Function2<? super DS, ? super Continuation<? super DS>, ? extends Object> function2, Continuation<? super C312491> continuation) {
            super(2, continuation);
            this.this$0 = baseDuxo;
            this.$mutator = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C312491(this.this$0, this.$mutator, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C312491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow2 sharedFlow2 = ((BaseDuxo) this.this$0).mutations;
                Function2<DS, Continuation<? super DS>, Object> function2 = this.$mutator;
                this.label = 1;
                if (sharedFlow2.emit(function2, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: protected */
    public final void applyMutation(Function2<? super DS, ? super Continuation<? super DS>, ? extends Object> mutator) {
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        getStateFlow();
        BuildersKt__Builders_commonKt.launch$default(getMutationsScope(), null, null, new C312491(this, mutator, null), 3, null);
    }

    /* compiled from: BaseDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.udf.BaseDuxo$withDataState$1", m3645f = "BaseDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.udf.BaseDuxo$withDataState$1 */
    /* loaded from: classes9.dex */
    static final class C312501 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<DS, Unit> $block;
        int label;
        final /* synthetic */ BaseDuxo<DS, VS> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C312501(BaseDuxo<DS, ? extends VS> baseDuxo, Function1<? super DS, Unit> function1, Continuation<? super C312501> continuation) {
            super(2, continuation);
            this.this$0 = baseDuxo;
            this.$block = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C312501(this.this$0, this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C312501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: BaseDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n"}, m3636d2 = {"<anonymous>", "DS", "", "ds"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.udf.BaseDuxo$withDataState$1$1", m3645f = "BaseDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.udf.BaseDuxo$withDataState$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DS, Continuation<? super DS>, Object> {
            final /* synthetic */ Function1<DS, Unit> $block;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Function1<? super DS, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$block = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((AnonymousClass1) obj, (Continuation<? super AnonymousClass1>) obj2);
            }

            public final Object invoke(DS ds, Continuation<? super DS> continuation) {
                return ((AnonymousClass1) create(ds, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Object obj2 = this.L$0;
                this.$block.invoke(obj2);
                return obj2;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow2 sharedFlow2 = ((BaseDuxo) this.this$0).mutations;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block, null);
                this.label = 1;
                if (sharedFlow2.emit(anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: protected */
    public final void withDataState(Function1<? super DS, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        getStateFlow();
        BuildersKt__Builders_commonKt.launch$default(getMutationsScope(), null, null, new C312501(this, block, null), 3, null);
    }

    public void onCreate() {
        Timber.INSTANCE.mo3356i(this.logStrings.getOnCreate(), new Object[0]);
        Duxo.DefaultImpls.onCreate(this);
    }

    public void onStart() {
        Timber.INSTANCE.mo3356i(this.logStrings.getOnStart(), new Object[0]);
        Duxo.DefaultImpls.onStart(this);
    }

    public void onResume() {
        Timber.INSTANCE.mo3356i(this.logStrings.getOnResume(), new Object[0]);
        Duxo.DefaultImpls.onResume(this);
    }

    public void onPause() {
        Timber.INSTANCE.mo3356i(this.logStrings.getOnPause(), new Object[0]);
        Duxo.DefaultImpls.onPause(this);
    }

    public void onStop() {
        Timber.INSTANCE.mo3356i(this.logStrings.getOnStop(), new Object[0]);
        Duxo.DefaultImpls.onStop(this);
    }

    public void onDestroy() {
        Timber.INSTANCE.mo3356i(this.logStrings.getOnDestroy(), new Object[0]);
        Duxo.DefaultImpls.onDestroy(this);
    }

    @Override // androidx.lifecycle.ViewModel
    protected void onCleared() {
        super.onCleared();
        this.lifecycleEvents.accept(LifecycleEvent.ON_DESTROY);
        LeakDetector.INSTANCE.expectWeaklyReachable(this, "The owning ViewModel is being cleared");
        getClosableLifecycleScope().close();
        CoroutineScope2.cancel$default(getMutationsScope(), null, 1, null);
    }

    /* compiled from: BaseDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/udf/BaseDuxo$LogStrings;", "", "onCreate", "", "onStart", "onResume", "onPause", "onStop", "onDestroy", "onCleared", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOnCreate", "()Ljava/lang/String;", "getOnStart", "getOnResume", "getOnPause", "getOnStop", "getOnDestroy", "getOnCleared", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "lib-udf_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final /* data */ class LogStrings {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String onCleared;
        private final String onCreate;
        private final String onDestroy;
        private final String onPause;
        private final String onResume;
        private final String onStart;
        private final String onStop;

        public static /* synthetic */ LogStrings copy$default(LogStrings logStrings, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
            if ((i & 1) != 0) {
                str = logStrings.onCreate;
            }
            if ((i & 2) != 0) {
                str2 = logStrings.onStart;
            }
            if ((i & 4) != 0) {
                str3 = logStrings.onResume;
            }
            if ((i & 8) != 0) {
                str4 = logStrings.onPause;
            }
            if ((i & 16) != 0) {
                str5 = logStrings.onStop;
            }
            if ((i & 32) != 0) {
                str6 = logStrings.onDestroy;
            }
            if ((i & 64) != 0) {
                str7 = logStrings.onCleared;
            }
            String str8 = str6;
            String str9 = str7;
            String str10 = str5;
            String str11 = str3;
            return logStrings.copy(str, str2, str11, str4, str10, str8, str9);
        }

        /* renamed from: component1, reason: from getter */
        public final String getOnCreate() {
            return this.onCreate;
        }

        /* renamed from: component2, reason: from getter */
        public final String getOnStart() {
            return this.onStart;
        }

        /* renamed from: component3, reason: from getter */
        public final String getOnResume() {
            return this.onResume;
        }

        /* renamed from: component4, reason: from getter */
        public final String getOnPause() {
            return this.onPause;
        }

        /* renamed from: component5, reason: from getter */
        public final String getOnStop() {
            return this.onStop;
        }

        /* renamed from: component6, reason: from getter */
        public final String getOnDestroy() {
            return this.onDestroy;
        }

        /* renamed from: component7, reason: from getter */
        public final String getOnCleared() {
            return this.onCleared;
        }

        public final LogStrings copy(String onCreate, String onStart, String onResume, String onPause, String onStop, String onDestroy, String onCleared) {
            Intrinsics.checkNotNullParameter(onCreate, "onCreate");
            Intrinsics.checkNotNullParameter(onStart, "onStart");
            Intrinsics.checkNotNullParameter(onResume, "onResume");
            Intrinsics.checkNotNullParameter(onPause, "onPause");
            Intrinsics.checkNotNullParameter(onStop, "onStop");
            Intrinsics.checkNotNullParameter(onDestroy, "onDestroy");
            Intrinsics.checkNotNullParameter(onCleared, "onCleared");
            return new LogStrings(onCreate, onStart, onResume, onPause, onStop, onDestroy, onCleared);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LogStrings)) {
                return false;
            }
            LogStrings logStrings = (LogStrings) other;
            return Intrinsics.areEqual(this.onCreate, logStrings.onCreate) && Intrinsics.areEqual(this.onStart, logStrings.onStart) && Intrinsics.areEqual(this.onResume, logStrings.onResume) && Intrinsics.areEqual(this.onPause, logStrings.onPause) && Intrinsics.areEqual(this.onStop, logStrings.onStop) && Intrinsics.areEqual(this.onDestroy, logStrings.onDestroy) && Intrinsics.areEqual(this.onCleared, logStrings.onCleared);
        }

        public int hashCode() {
            return (((((((((((this.onCreate.hashCode() * 31) + this.onStart.hashCode()) * 31) + this.onResume.hashCode()) * 31) + this.onPause.hashCode()) * 31) + this.onStop.hashCode()) * 31) + this.onDestroy.hashCode()) * 31) + this.onCleared.hashCode();
        }

        public String toString() {
            return "LogStrings(onCreate=" + this.onCreate + ", onStart=" + this.onStart + ", onResume=" + this.onResume + ", onPause=" + this.onPause + ", onStop=" + this.onStop + ", onDestroy=" + this.onDestroy + ", onCleared=" + this.onCleared + ")";
        }

        public LogStrings(String onCreate, String onStart, String onResume, String onPause, String onStop, String onDestroy, String onCleared) {
            Intrinsics.checkNotNullParameter(onCreate, "onCreate");
            Intrinsics.checkNotNullParameter(onStart, "onStart");
            Intrinsics.checkNotNullParameter(onResume, "onResume");
            Intrinsics.checkNotNullParameter(onPause, "onPause");
            Intrinsics.checkNotNullParameter(onStop, "onStop");
            Intrinsics.checkNotNullParameter(onDestroy, "onDestroy");
            Intrinsics.checkNotNullParameter(onCleared, "onCleared");
            this.onCreate = onCreate;
            this.onStart = onStart;
            this.onResume = onResume;
            this.onPause = onPause;
            this.onStop = onStop;
            this.onDestroy = onDestroy;
            this.onCleared = onCleared;
        }

        public final String getOnCreate() {
            return this.onCreate;
        }

        public final String getOnStart() {
            return this.onStart;
        }

        public final String getOnResume() {
            return this.onResume;
        }

        public final String getOnPause() {
            return this.onPause;
        }

        public final String getOnStop() {
            return this.onStop;
        }

        public final String getOnDestroy() {
            return this.onDestroy;
        }

        public final String getOnCleared() {
            return this.onCleared;
        }

        /* compiled from: BaseDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/udf/BaseDuxo$LogStrings$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/android/udf/BaseDuxo$LogStrings;", "className", "", "lib-udf_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final LogStrings from(String className) {
                Intrinsics.checkNotNullParameter(className, "className");
                return new LogStrings(className + ": onCreate", className + ": onStart", className + ": onResume", className + ": onPause", className + ": onStop", className + ": onDestroy", className + ": onCleared");
            }
        }
    }
}
