package com.robinhood.android.udf;

import android.annotation.SuppressLint;
import androidx.lifecycle.ViewModel;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.jakewharton.rxrelay2.Relay;
import com.robinhood.android.udf.OldDuxo;
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
import com.robinhood.utils.RxGlobalErrorHandler;
import defpackage.C0007xc1408999;
import dispatch.core.DispatcherProvider;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import kotlin.Deprecated;
import kotlin.Inference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import timber.log.Timber;

/* compiled from: OldBaseDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005:\u0001KB\u0019\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010?\u001a\u00020@2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000$J\u001f\u0010B\u001a\u00020@2\u0017\u0010A\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000$¢\u0006\u0002\bCJ\b\u0010D\u001a\u00020@H\u0016J\b\u0010E\u001a\u00020@H\u0016J\b\u0010F\u001a\u00020@H\u0016J\b\u0010G\u001a\u00020@H\u0016J\b\u0010H\u001a\u00020@H\u0016J\b\u0010I\u001a\u00020@H\u0016J\b\u0010J\u001a\u00020@H\u0014R$\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\"\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000 %*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010$0$0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010&\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00018\u00008\u00000'X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000)¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0017\u00102\u001a\b\u0012\u0004\u0012\u0002030'¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0017\u00106\u001a\b\u0012\u0004\u0012\u0002070'¢\u0006\b\n\u0000\u001a\u0004\b8\u00105R\u0010\u00109\u001a\u0004\u0018\u00010:X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010;\u001a\u00020<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006L"}, m3636d2 = {"Lcom/robinhood/android/udf/OldBaseDuxo;", "VS", "", "Landroidx/lifecycle/ViewModel;", "Lcom/robinhood/android/udf/OldDuxo;", "Lcom/robinhood/coroutines/rx/RxFactoryHost;", "initialState", "mutationScheduler", "Lio/reactivex/Scheduler;", "<init>", "(Ljava/lang/Object;Lio/reactivex/Scheduler;)V", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "getDispatcherProvider$annotations", "()V", "getDispatcherProvider", "()Ldispatch/core/DispatcherProvider;", "setDispatcherProvider", "(Ldispatch/core/DispatcherProvider;)V", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "getRxFactory", "()Lcom/robinhood/coroutines/rx/RxFactory;", "setRxFactory", "(Lcom/robinhood/coroutines/rx/RxFactory;)V", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "getRxGlobalErrorHandler$annotations", "getRxGlobalErrorHandler", "()Lcom/robinhood/utils/RxGlobalErrorHandler;", "setRxGlobalErrorHandler", "(Lcom/robinhood/utils/RxGlobalErrorHandler;)V", "logStrings", "Lcom/robinhood/android/udf/OldBaseDuxo$LogStrings;", "mutations", "Lcom/jakewharton/rxrelay2/Relay;", "Lkotlin/Function1;", "kotlin.jvm.PlatformType", "stateRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "states", "Lio/reactivex/Observable;", "getStates", "()Lio/reactivex/Observable;", "mutableStatesFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "statesFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getStatesFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "lifecycleEvents", "Lcom/robinhood/disposer/LifecycleEvent;", "getLifecycleEvents", "()Lcom/jakewharton/rxrelay2/BehaviorRelay;", "lifecycleState", "Lcom/robinhood/disposer/LifecycleState;", "getLifecycleState", "closableLifecycleScope", "Lcom/robinhood/disposer/ClosableLifecycleHostCoroutineScope;", "lifecycleScope", "Lcom/robinhood/disposer/LifecycleHostCoroutineScope;", "getLifecycleScope", "()Lcom/robinhood/disposer/LifecycleHostCoroutineScope;", "mutate", "", "mutator", "applyMutation", "Lkotlin/ExtensionFunctionType;", "onCreate", "onStart", "onResume", "onPause", "onStop", "onDestroy", "onCleared", "LogStrings", "lib-udf_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"CheckResult"})
@Deprecated
/* loaded from: classes20.dex */
public class OldBaseDuxo<VS> extends ViewModel implements OldDuxo<VS>, RxFactory3 {
    public static final int $stable = 8;
    private ClosableLifecycleHostCoroutineScope closableLifecycleScope;
    public DispatcherProvider dispatcherProvider;
    private final BehaviorRelay<LifecycleEvent> lifecycleEvents;
    private final BehaviorRelay<LifecycleState> lifecycleState;
    private final LogStrings logStrings;
    private final StateFlow2<VS> mutableStatesFlow;
    private final Relay<Function1<VS, VS>> mutations;
    public RxFactory rxFactory;
    public RxGlobalErrorHandler rxGlobalErrorHandler;
    private final BehaviorRelay<VS> stateRelay;
    private final Observable<VS> states;

    public static /* synthetic */ void getDispatcherProvider$annotations() {
    }

    public static /* synthetic */ void getRxGlobalErrorHandler$annotations() {
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> asObservable(Flow<? extends T> flow) {
        return OldDuxo.DefaultImpls.asObservable(this, flow);
    }

    @Override // com.robinhood.disposer.LifecycleHost
    public ScopedCompletable bind(Completable completable, LifecycleEvent lifecycleEvent) {
        return OldDuxo.DefaultImpls.bind(this, completable, lifecycleEvent);
    }

    @Override // com.robinhood.disposer.LifecycleHost
    public <T> ScopedFlowable<T> bind(Flowable<T> flowable, LifecycleEvent lifecycleEvent) {
        return OldDuxo.DefaultImpls.bind(this, flowable, lifecycleEvent);
    }

    @Override // com.robinhood.disposer.LifecycleHost
    public <T> ScopedMaybe<T> bind(Maybe<T> maybe, LifecycleEvent lifecycleEvent) {
        return OldDuxo.DefaultImpls.bind(this, maybe, lifecycleEvent);
    }

    @Override // com.robinhood.disposer.LifecycleHost
    public <T> ScopedObservable<T> bind(Observable<T> observable, LifecycleEvent lifecycleEvent) {
        return OldDuxo.DefaultImpls.bind(this, observable, lifecycleEvent);
    }

    @Override // com.robinhood.disposer.LifecycleHost
    public <T> ScopedSingle<T> bind(Single<T> single, LifecycleEvent lifecycleEvent) {
        return OldDuxo.DefaultImpls.bind(this, single, lifecycleEvent);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> convertToObservable(Flow<? extends T> flow) {
        return RxFactory3.DefaultImpls.convertToObservable(this, flow);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public Completable rxCompletable(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return RxFactory3.DefaultImpls.rxCompletable(this, coroutineContext, function2);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Maybe<T> rxMaybe(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        return RxFactory3.DefaultImpls.rxMaybe(this, coroutineContext, function2);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> rxObservable(CoroutineContext coroutineContext, @Inference Function2<? super Produce4<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return RxFactory3.DefaultImpls.rxObservable(this, coroutineContext, function2);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Single<T> rxSingle(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        return RxFactory3.DefaultImpls.rxSingle(this, coroutineContext, function2);
    }

    public /* synthetic */ OldBaseDuxo(Object obj, Scheduler scheduler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? Schedulers.single() : scheduler);
    }

    public OldBaseDuxo(VS initialState, Scheduler mutationScheduler) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(mutationScheduler, "mutationScheduler");
        LogStrings.Companion companion = LogStrings.INSTANCE;
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        this.logStrings = companion.from(simpleName);
        Relay<Function1<VS, VS>> relay = (Relay<Function1<VS, VS>>) BehaviorRelay.create().toSerialized();
        Intrinsics.checkNotNullExpressionValue(relay, "toSerialized(...)");
        this.mutations = relay;
        BehaviorRelay<VS> behaviorRelayCreateDefault = BehaviorRelay.createDefault(initialState);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.stateRelay = behaviorRelayCreateDefault;
        Observable<VS> observableHide = behaviorRelayCreateDefault.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        this.states = observableHide;
        this.mutableStatesFlow = StateFlow4.MutableStateFlow(initialState);
        BehaviorRelay<LifecycleEvent> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.lifecycleEvents = behaviorRelayCreate;
        BehaviorRelay<LifecycleState> behaviorRelayCreateDefault2 = BehaviorRelay.createDefault(LifecycleState.DEAD);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault2, "createDefault(...)");
        this.lifecycleState = behaviorRelayCreateDefault2;
        relay.observeOn(mutationScheduler).map(new Function(this) { // from class: com.robinhood.android.udf.OldBaseDuxo.1
            final /* synthetic */ OldBaseDuxo<VS> this$0;

            {
                this.this$0 = this;
            }

            @Override // io.reactivex.functions.Function
            public final VS apply(Function1<? super VS, ? extends VS> mutation) {
                Intrinsics.checkNotNullParameter(mutation, "mutation");
                C0007xc1408999 c0007xc1408999 = (Object) ((OldBaseDuxo) this.this$0).stateRelay.getValue();
                Intrinsics.checkNotNull(c0007xc1408999);
                return mutation.invoke(c0007xc1408999);
            }
        }).subscribe((Consumer<? super R>) new Consumer(this) { // from class: com.robinhood.android.udf.OldBaseDuxo.2
            final /* synthetic */ OldBaseDuxo<VS> this$0;

            {
                this.this$0 = this;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(VS vs) {
                ((OldBaseDuxo) this.this$0).stateRelay.accept(vs);
                StateFlow2 stateFlow2 = ((OldBaseDuxo) this.this$0).mutableStatesFlow;
                Intrinsics.checkNotNull(vs);
                stateFlow2.setValue(vs);
            }
        });
    }

    public final DispatcherProvider getDispatcherProvider() {
        DispatcherProvider dispatcherProvider = this.dispatcherProvider;
        if (dispatcherProvider != null) {
            return dispatcherProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dispatcherProvider");
        return null;
    }

    public final void setDispatcherProvider(DispatcherProvider dispatcherProvider) {
        Intrinsics.checkNotNullParameter(dispatcherProvider, "<set-?>");
        this.dispatcherProvider = dispatcherProvider;
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3
    public RxFactory getRxFactory() {
        RxFactory rxFactory = this.rxFactory;
        if (rxFactory != null) {
            return rxFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rxFactory");
        return null;
    }

    public void setRxFactory(RxFactory rxFactory) {
        Intrinsics.checkNotNullParameter(rxFactory, "<set-?>");
        this.rxFactory = rxFactory;
    }

    public final RxGlobalErrorHandler getRxGlobalErrorHandler() {
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler;
        if (rxGlobalErrorHandler != null) {
            return rxGlobalErrorHandler;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rxGlobalErrorHandler");
        return null;
    }

    public final void setRxGlobalErrorHandler(RxGlobalErrorHandler rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "<set-?>");
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // com.robinhood.android.udf.OldDuxo
    public final Observable<VS> getStates() {
        return this.states;
    }

    @Override // com.robinhood.android.udf.OldDuxo
    public StateFlow<VS> getStatesFlow() {
        return FlowKt.asStateFlow(this.mutableStatesFlow);
    }

    @Override // com.robinhood.disposer.LifecycleHost
    public final BehaviorRelay<LifecycleEvent> getLifecycleEvents() {
        return this.lifecycleEvents;
    }

    @Override // com.robinhood.disposer.LifecycleHost
    public final BehaviorRelay<LifecycleState> getLifecycleState() {
        return this.lifecycleState;
    }

    @Override // com.robinhood.disposer.LifecycleHost
    public LifecycleHostCoroutineScope getLifecycleScope() {
        ClosableLifecycleHostCoroutineScope closableLifecycleHostCoroutineScopeCreateLifecycleScope = this.closableLifecycleScope;
        if (closableLifecycleHostCoroutineScopeCreateLifecycleScope == null) {
            closableLifecycleHostCoroutineScopeCreateLifecycleScope = LifecycleHostCoroutineScopeKt.createLifecycleScope(this, getDispatcherProvider(), getRxGlobalErrorHandler(), null, false);
        }
        this.closableLifecycleScope = closableLifecycleHostCoroutineScopeCreateLifecycleScope;
        return closableLifecycleHostCoroutineScopeCreateLifecycleScope;
    }

    @Override // com.robinhood.android.udf.OldDuxo
    public final void mutate(Function1<? super VS, ? extends VS> mutator) {
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        this.mutations.accept(mutator);
    }

    @Override // com.robinhood.android.udf.OldDuxo
    public final void applyMutation(Function1<? super VS, ? extends VS> mutator) {
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        this.mutations.accept(mutator);
    }

    public void onCreate() {
        Timber.INSTANCE.mo3356i(this.logStrings.getOnCreate(), new Object[0]);
        OldDuxo.DefaultImpls.onCreate(this);
    }

    public void onStart() {
        Timber.INSTANCE.mo3356i(this.logStrings.getOnStart(), new Object[0]);
        OldDuxo.DefaultImpls.onStart(this);
    }

    public void onResume() {
        Timber.INSTANCE.mo3356i(this.logStrings.getOnResume(), new Object[0]);
        OldDuxo.DefaultImpls.onResume(this);
    }

    public void onPause() {
        Timber.INSTANCE.mo3356i(this.logStrings.getOnPause(), new Object[0]);
        OldDuxo.DefaultImpls.onPause(this);
    }

    public void onStop() {
        Timber.INSTANCE.mo3356i(this.logStrings.getOnStop(), new Object[0]);
        OldDuxo.DefaultImpls.onStop(this);
    }

    public void onDestroy() {
        Timber.INSTANCE.mo3356i(this.logStrings.getOnDestroy(), new Object[0]);
        OldDuxo.DefaultImpls.onDestroy(this);
    }

    @Override // androidx.lifecycle.ViewModel
    protected void onCleared() {
        Timber.INSTANCE.mo3356i(this.logStrings.getOnCleared(), new Object[0]);
        super.onCleared();
        this.lifecycleEvents.accept(LifecycleEvent.ON_DESTROY);
        LeakDetector.INSTANCE.expectWeaklyReachable(this, "The owning ViewModel is being cleared");
        ClosableLifecycleHostCoroutineScope closableLifecycleHostCoroutineScope = this.closableLifecycleScope;
        if (closableLifecycleHostCoroutineScope != null) {
            closableLifecycleHostCoroutineScope.close();
        }
    }

    /* compiled from: OldBaseDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/udf/OldBaseDuxo$LogStrings;", "", "onCreate", "", "onStart", "onResume", "onPause", "onStop", "onDestroy", "onCleared", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOnCreate", "()Ljava/lang/String;", "getOnStart", "getOnResume", "getOnPause", "getOnStop", "getOnDestroy", "getOnCleared", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "lib-udf_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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

        /* compiled from: OldBaseDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/udf/OldBaseDuxo$LogStrings$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/android/udf/OldBaseDuxo$LogStrings;", "className", "", "lib-udf_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
