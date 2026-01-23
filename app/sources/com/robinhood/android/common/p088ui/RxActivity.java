package com.robinhood.android.common.p088ui;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.jakewharton.rxrelay2.BehaviorRelay;
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
import com.robinhood.hammer.android.activity.HammerActivity;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.time.android.ElapsedRealtimeClock;
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
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: RxActivity.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001-B\u0011\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u001e8\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R$\u0010)\u001a\u00020'2\u0006\u0010(\u001a\u00020'8\u0006@BX\u0086.¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/common/ui/RxActivity;", "Lcom/robinhood/hammer/android/activity/HammerActivity;", "Lcom/robinhood/disposer/LifecycleHost;", "Lcom/robinhood/disposer/UiUncaughtExceptionHandler;", "", "contentLayoutId", "<init>", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "()V", "onResume", "onPause", "onStop", "onDestroy", "j$/time/Instant", "constructionTimestamp", "Lj$/time/Instant;", "getConstructionTimestamp", "()Lj$/time/Instant;", "Ldispatch/core/DispatcherProvider;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/disposer/LifecycleEvent;", "lifecycleEvents", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "getLifecycleEvents", "()Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/disposer/LifecycleState;", "lifecycleState", "getLifecycleState", "Lcom/robinhood/disposer/LifecycleHostCoroutineScope;", "value", "lifecycleScope", "Lcom/robinhood/disposer/LifecycleHostCoroutineScope;", "getLifecycleScope", "()Lcom/robinhood/disposer/LifecycleHostCoroutineScope;", "RxActivityEntryPoint", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public class RxActivity extends HammerActivity implements LifecycleHost, UiUncaughtExceptionHandler {
    public static final int $stable = 8;
    private final Instant constructionTimestamp;
    private DispatcherProvider dispatcherProvider;
    private final BehaviorRelay<LifecycleEvent> lifecycleEvents;
    private LifecycleHostCoroutineScope lifecycleScope;
    private final BehaviorRelay<LifecycleState> lifecycleState;
    private RxGlobalErrorHandler rxGlobalErrorHandler;

    /* compiled from: RxActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/ui/RxActivity$RxActivityEntryPoint;", "", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface RxActivityEntryPoint {
        DispatcherProvider dispatcherProvider();

        RxGlobalErrorHandler rxGlobalErrorHandler();
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

    public boolean handleUiUncaughtException(CoroutineContext coroutineContext, Throwable th) {
        return UiUncaughtExceptionHandler.DefaultImpls.handleUiUncaughtException(this, coroutineContext, th);
    }

    public RxActivity(int i) {
        super(i);
        this.constructionTimestamp = ElapsedRealtimeClock.INSTANCE.instant();
        BehaviorRelay<LifecycleEvent> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.lifecycleEvents = behaviorRelayCreate;
        BehaviorRelay<LifecycleState> behaviorRelayCreateDefault = BehaviorRelay.createDefault(LifecycleState.DEAD);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.lifecycleState = behaviorRelayCreateDefault;
    }

    public final Instant getConstructionTimestamp() {
        return this.constructionTimestamp;
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

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        DispatcherProvider dispatcherProvider;
        RxGlobalErrorHandler rxGlobalErrorHandler;
        super.onCreate(savedInstanceState);
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        RxActivityEntryPoint rxActivityEntryPoint = (RxActivityEntryPoint) ((ApplicationComponentManagerHolder) ((Application) applicationContext)).getComponentManager().get();
        this.dispatcherProvider = rxActivityEntryPoint.dispatcherProvider();
        this.rxGlobalErrorHandler = rxActivityEntryPoint.rxGlobalErrorHandler();
        DispatcherProvider dispatcherProvider2 = this.dispatcherProvider;
        if (dispatcherProvider2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dispatcherProvider");
            dispatcherProvider = null;
        } else {
            dispatcherProvider = dispatcherProvider2;
        }
        RxGlobalErrorHandler rxGlobalErrorHandler2 = this.rxGlobalErrorHandler;
        if (rxGlobalErrorHandler2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rxGlobalErrorHandler");
            rxGlobalErrorHandler = null;
        } else {
            rxGlobalErrorHandler = rxGlobalErrorHandler2;
        }
        this.lifecycleScope = LifecycleHostCoroutineScopeKt.createLifecycleScope$default(this, dispatcherProvider, rxGlobalErrorHandler, this, false, 8, null);
        this.lifecycleEvents.accept(LifecycleEvent.ON_CREATE);
        this.lifecycleState.accept(LifecycleState.CREATED);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        this.lifecycleEvents.accept(LifecycleEvent.ON_START);
        this.lifecycleState.accept(LifecycleState.STARTED);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.lifecycleEvents.accept(LifecycleEvent.ON_RESUME);
        this.lifecycleState.accept(LifecycleState.RESUMED);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        this.lifecycleEvents.accept(LifecycleEvent.ON_PAUSE);
        this.lifecycleState.accept(LifecycleState.STARTED);
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        this.lifecycleEvents.accept(LifecycleEvent.ON_STOP);
        this.lifecycleState.accept(LifecycleState.CREATED);
        super.onStop();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        this.lifecycleEvents.accept(LifecycleEvent.ON_DESTROY);
        this.lifecycleState.accept(LifecycleState.DEAD);
        super.onDestroy();
    }
}
