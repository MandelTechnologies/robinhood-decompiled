package com.robinhood.android.common.p088ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.common.util.p090rx.ErrorHandlers;
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
import com.robinhood.utils.RxGlobalErrorHandler;
import dispatch.core.DispatcherProvider;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RxPreferenceFragment.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0012\u0010$\u001a\u00020!2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020)2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010*\u001a\u00020!H\u0016J\b\u0010+\u001a\u00020!H\u0016J\b\u0010,\u001a\u00020!H\u0016J\b\u0010-\u001a\u00020!H\u0016J\b\u0010.\u001a\u00020!H\u0016J\b\u0010/\u001a\u00020!H\u0016J\b\u00100\u001a\u00020!H\u0016J\u0018\u00101\u001a\u0002022\u0006\u0010\"\u001a\u0002032\u0006\u00104\u001a\u000205H\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u001e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/common/ui/RxPreferenceFragment;", "Landroidx/preference/PreferenceFragmentCompat;", "Lcom/robinhood/android/common/ui/RhFragment;", "Lcom/robinhood/disposer/LifecycleHost;", "Lcom/robinhood/disposer/UiUncaughtExceptionHandler;", "<init>", "()V", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "getDispatcherProvider$lib_common_externalRelease", "()Ldispatch/core/DispatcherProvider;", "setDispatcherProvider$lib_common_externalRelease", "(Ldispatch/core/DispatcherProvider;)V", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "getRxGlobalErrorHandler$lib_common_externalRelease", "()Lcom/robinhood/utils/RxGlobalErrorHandler;", "setRxGlobalErrorHandler$lib_common_externalRelease", "(Lcom/robinhood/utils/RxGlobalErrorHandler;)V", "lifecycleEvents", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/disposer/LifecycleEvent;", "getLifecycleEvents", "()Lcom/jakewharton/rxrelay2/BehaviorRelay;", "lifecycleState", "Lcom/robinhood/disposer/LifecycleState;", "getLifecycleState", "value", "Lcom/robinhood/disposer/LifecycleHostCoroutineScope;", "lifecycleScope", "getLifecycleScope", "()Lcom/robinhood/disposer/LifecycleHostCoroutineScope;", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onStart", "onResume", "onPause", "onStop", "onDestroyView", "onDestroy", "onDetach", "handleUiUncaughtException", "", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class RxPreferenceFragment extends Hammer_RxPreferenceFragment implements RhFragment, LifecycleHost, UiUncaughtExceptionHandler {
    public static final int $stable = 8;
    public DispatcherProvider dispatcherProvider;
    private final BehaviorRelay<LifecycleEvent> lifecycleEvents;
    private LifecycleHostCoroutineScope lifecycleScope;
    private final BehaviorRelay<LifecycleState> lifecycleState;
    public RxGlobalErrorHandler rxGlobalErrorHandler;

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

    public RxPreferenceFragment() {
        super(null);
        BehaviorRelay<LifecycleEvent> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.lifecycleEvents = behaviorRelayCreate;
        BehaviorRelay<LifecycleState> behaviorRelayCreateDefault = BehaviorRelay.createDefault(LifecycleState.DEAD);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.lifecycleState = behaviorRelayCreateDefault;
    }

    public final DispatcherProvider getDispatcherProvider$lib_common_externalRelease() {
        DispatcherProvider dispatcherProvider = this.dispatcherProvider;
        if (dispatcherProvider != null) {
            return dispatcherProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dispatcherProvider");
        return null;
    }

    public final void setDispatcherProvider$lib_common_externalRelease(DispatcherProvider dispatcherProvider) {
        Intrinsics.checkNotNullParameter(dispatcherProvider, "<set-?>");
        this.dispatcherProvider = dispatcherProvider;
    }

    public final RxGlobalErrorHandler getRxGlobalErrorHandler$lib_common_externalRelease() {
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler;
        if (rxGlobalErrorHandler != null) {
            return rxGlobalErrorHandler;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rxGlobalErrorHandler");
        return null;
    }

    public final void setRxGlobalErrorHandler$lib_common_externalRelease(RxGlobalErrorHandler rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "<set-?>");
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
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

    @Override // com.robinhood.android.common.p088ui.Hammer_RxPreferenceFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.lifecycleScope = LifecycleHostCoroutineScopeKt.createLifecycleScope$default(this, getDispatcherProvider$lib_common_externalRelease(), getRxGlobalErrorHandler$lib_common_externalRelease(), this, false, 8, null);
        this.lifecycleEvents.accept(LifecycleEvent.ON_ATTACH);
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.lifecycleEvents.accept(LifecycleEvent.ON_CREATE);
        this.lifecycleState.accept(LifecycleState.CREATED);
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.lifecycleEvents.accept(LifecycleEvent.ON_CREATE_VIEW);
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
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

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onStop() {
        this.lifecycleEvents.accept(LifecycleEvent.ON_STOP);
        this.lifecycleState.accept(LifecycleState.CREATED);
        super.onStop();
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
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

    @Override // com.robinhood.disposer.UiUncaughtExceptionHandler
    public boolean handleUiUncaughtException(CoroutineContext context, Throwable exception) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(exception, "exception");
        return ErrorHandlers.handleUiUncaughtExceptionWithActivity(this, context, exception) || UiUncaughtExceptionHandler.DefaultImpls.handleUiUncaughtException(this, context, exception);
    }
}
