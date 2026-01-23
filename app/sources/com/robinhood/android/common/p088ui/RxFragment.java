package com.robinhood.android.common.p088ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.common.util.p090rx.ErrorHandlers;
import com.robinhood.coroutines.p287rx.RxFactory3;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleHostCoroutineScopeKt;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ScopedCompletable;
import com.robinhood.disposer.ScopedFlowable;
import com.robinhood.disposer.ScopedMaybe;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.disposer.ScopedSingle;
import com.robinhood.disposer.UiUncaughtExceptionHandler;
import com.robinhood.hammer.android.fragment.HammerFragment;
import com.robinhood.utils.RxGlobalErrorHandler;
import dispatch.core.DispatcherProvider;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import kotlin.Inference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RxFragment.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0006B\u0013\b\u0016\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0012\u0010#\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020(2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010)\u001a\u00020 H\u0016J\b\u0010*\u001a\u00020 H\u0016J\b\u0010+\u001a\u00020 H\u0016J\b\u0010,\u001a\u00020 H\u0016J\b\u0010-\u001a\u00020 H\u0016J\b\u0010.\u001a\u00020 H\u0016J\b\u0010/\u001a\u00020 H\u0016J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0014H\u0004J\u0010\u00103\u001a\u0002012\u0006\u00102\u001a\u00020\u0014H\u0004J\u0018\u00104\u001a\u0002012\u0006\u0010!\u001a\u0002052\u0006\u00106\u001a\u000207H\u0016R\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u001e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/common/ui/RxFragment;", "Lcom/robinhood/hammer/android/fragment/HammerFragment;", "Lcom/robinhood/disposer/LifecycleHost;", "Lcom/robinhood/coroutines/rx/RxFactoryHost;", "Lcom/robinhood/disposer/UiUncaughtExceptionHandler;", "<init>", "()V", "layoutRes", "", "(I)V", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "getDispatcherProvider", "()Ldispatch/core/DispatcherProvider;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "getRxGlobalErrorHandler", "()Lcom/robinhood/utils/RxGlobalErrorHandler;", "lifecycleEvents", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/disposer/LifecycleEvent;", "getLifecycleEvents", "()Lcom/jakewharton/rxrelay2/BehaviorRelay;", "lifecycleState", "Lcom/robinhood/disposer/LifecycleState;", "getLifecycleState", "value", "Lcom/robinhood/disposer/LifecycleHostCoroutineScope;", "lifecycleScope", "getLifecycleScope", "()Lcom/robinhood/disposer/LifecycleHostCoroutineScope;", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onStart", "onResume", "onPause", "onStop", "onDestroyView", "onDestroy", "onDetach", "isAtLeast", "", "lifecycleEvent", "isAtMost", "handleUiUncaughtException", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public abstract class RxFragment extends HammerFragment implements LifecycleHost, RxFactory3, UiUncaughtExceptionHandler {
    public static final int $stable = 8;
    private final BehaviorRelay<LifecycleEvent> lifecycleEvents;
    private LifecycleHostCoroutineScope lifecycleScope;
    private final BehaviorRelay<LifecycleState> lifecycleState;

    public abstract DispatcherProvider getDispatcherProvider();

    public abstract RxGlobalErrorHandler getRxGlobalErrorHandler();

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> asObservable(Flow<? extends T> flow) {
        return RxFactory3.DefaultImpls.asObservable(this, flow);
    }

    @Override // com.robinhood.disposer.LifecycleHost
    public ScopedCompletable bind(Completable completable, LifecycleEvent lifecycleEvent) {
        return LifecycleHost.DefaultImpls.bind(this, completable, lifecycleEvent);
    }

    @Override // com.robinhood.disposer.LifecycleHost
    public <T> ScopedFlowable<T> bind(Flowable<T> flowable, LifecycleEvent lifecycleEvent) {
        return LifecycleHost.DefaultImpls.bind(this, flowable, lifecycleEvent);
    }

    @Override // com.robinhood.disposer.LifecycleHost
    public <T> ScopedMaybe<T> bind(Maybe<T> maybe, LifecycleEvent lifecycleEvent) {
        return LifecycleHost.DefaultImpls.bind(this, maybe, lifecycleEvent);
    }

    @Override // com.robinhood.disposer.LifecycleHost
    public <T> ScopedObservable<T> bind(Observable<T> observable, LifecycleEvent lifecycleEvent) {
        return LifecycleHost.DefaultImpls.bind(this, observable, lifecycleEvent);
    }

    @Override // com.robinhood.disposer.LifecycleHost
    public <T> ScopedSingle<T> bind(Single<T> single, LifecycleEvent lifecycleEvent) {
        return LifecycleHost.DefaultImpls.bind(this, single, lifecycleEvent);
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

    public RxFragment() {
        BehaviorRelay<LifecycleEvent> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.lifecycleEvents = behaviorRelayCreate;
        BehaviorRelay<LifecycleState> behaviorRelayCreateDefault = BehaviorRelay.createDefault(LifecycleState.DEAD);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.lifecycleState = behaviorRelayCreateDefault;
    }

    public RxFragment(int i) {
        super(i);
        BehaviorRelay<LifecycleEvent> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.lifecycleEvents = behaviorRelayCreate;
        BehaviorRelay<LifecycleState> behaviorRelayCreateDefault = BehaviorRelay.createDefault(LifecycleState.DEAD);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.lifecycleState = behaviorRelayCreateDefault;
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
    public final LifecycleHostCoroutineScope getLifecycleScope() {
        LifecycleHostCoroutineScope lifecycleHostCoroutineScope = this.lifecycleScope;
        if (lifecycleHostCoroutineScope != null) {
            return lifecycleHostCoroutineScope;
        }
        Intrinsics.throwUninitializedPropertyAccessException("lifecycleScope");
        return null;
    }

    @Override // com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.lifecycleScope = LifecycleHostCoroutineScopeKt.createLifecycleScope$default(this, getDispatcherProvider(), getRxGlobalErrorHandler(), this, false, 8, null);
        this.lifecycleEvents.accept(LifecycleEvent.ON_ATTACH);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.lifecycleEvents.accept(LifecycleEvent.ON_CREATE);
        this.lifecycleState.accept(LifecycleState.CREATED);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.lifecycleEvents.accept(LifecycleEvent.ON_CREATE_VIEW);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.lifecycleEvents.accept(LifecycleEvent.ON_START);
        this.lifecycleState.accept(LifecycleState.STARTED);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.lifecycleEvents.accept(LifecycleEvent.ON_RESUME);
        this.lifecycleState.accept(LifecycleState.RESUMED);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        this.lifecycleEvents.accept(LifecycleEvent.ON_PAUSE);
        this.lifecycleState.accept(LifecycleState.STARTED);
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        this.lifecycleEvents.accept(LifecycleEvent.ON_STOP);
        this.lifecycleState.accept(LifecycleState.CREATED);
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.lifecycleEvents.accept(LifecycleEvent.ON_DESTROY_VIEW);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.lifecycleEvents.accept(LifecycleEvent.ON_DESTROY);
        this.lifecycleState.accept(LifecycleState.DEAD);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        this.lifecycleEvents.accept(LifecycleEvent.ON_DETACH);
        super.onDetach();
    }

    protected final boolean isAtLeast(LifecycleEvent lifecycleEvent) {
        Intrinsics.checkNotNullParameter(lifecycleEvent, "lifecycleEvent");
        LifecycleEvent value = this.lifecycleEvents.getValue();
        return value != null && value.isAtLeast(lifecycleEvent);
    }

    protected final boolean isAtMost(LifecycleEvent lifecycleEvent) {
        Intrinsics.checkNotNullParameter(lifecycleEvent, "lifecycleEvent");
        LifecycleEvent value = this.lifecycleEvents.getValue();
        return value != null && value.isAtMost(lifecycleEvent);
    }

    @Override // com.robinhood.disposer.UiUncaughtExceptionHandler
    public boolean handleUiUncaughtException(CoroutineContext context, Throwable exception) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(exception, "exception");
        return ErrorHandlers.handleUiUncaughtExceptionWithActivity(this, context, exception) || UiUncaughtExceptionHandler.DefaultImpls.handleUiUncaughtException(this, context, exception);
    }
}
