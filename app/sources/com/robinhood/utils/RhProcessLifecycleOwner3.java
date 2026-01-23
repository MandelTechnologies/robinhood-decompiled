package com.robinhood.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Duration;

/* compiled from: RhProcessLifecycleOwner.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0003R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0015j\b\u0012\u0004\u0012\u00020\f`\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, m3636d2 = {"Lcom/robinhood/utils/RealRhProcessLifecycleOwner;", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "<init>", "()V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "", "onStart", "(Landroidx/lifecycle/LifecycleOwner;)V", "onResume", "onPause", "onStop", "Lcom/robinhood/utils/ProcessLifecycleObserver;", "observer", "register", "(Lcom/robinhood/utils/ProcessLifecycleObserver;)V", "unregisterAll", "useExtendedTimeout", "Landroidx/lifecycle/LifecycleRegistry;", "registry", "Landroidx/lifecycle/LifecycleRegistry;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "registeredObservers", "Ljava/util/HashSet;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "emitStopEventCallback", "Ljava/lang/Runnable;", "", "timeout", "J", "", "isUsingExtendedTimeout", "()Z", "j$/time/Duration", "getExtendedTimeoutDuration", "()Lj$/time/Duration;", "extendedTimeoutDuration", "getLifecycle", "()Landroidx/lifecycle/LifecycleRegistry;", "lifecycle", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.RealRhProcessLifecycleOwner, reason: use source file name */
/* loaded from: classes21.dex */
public final class RhProcessLifecycleOwner3 implements RhProcessLifecycleOwner {
    private final LifecycleRegistry registry = new LifecycleRegistry(this);
    private final HashSet<RhProcessLifecycleOwner2> registeredObservers = new HashSet<>();
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final Runnable emitStopEventCallback = new Runnable() { // from class: com.robinhood.utils.RealRhProcessLifecycleOwner$emitStopEventCallback$1
        @Override // java.lang.Runnable
        public final void run() {
            this.this$0.registry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        }
    };
    private long timeout = 5000;

    @Override // com.robinhood.utils.RhProcessLifecycleOwner
    public boolean isUsingExtendedTimeout() {
        return this.timeout == 120000;
    }

    @Override // com.robinhood.utils.RhProcessLifecycleOwner
    public Duration getExtendedTimeoutDuration() {
        Duration durationOfMillis = Duration.ofMillis(120000L);
        Intrinsics.checkNotNullExpressionValue(durationOfMillis, "ofMillis(...)");
        return durationOfMillis;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        onStart();
    }

    @Override // com.robinhood.utils.RhProcessLifecycleOwner
    public void onStart() {
        this.handler.removeCallbacks(this.emitStopEventCallback);
        this.registry.handleLifecycleEvent(Lifecycle.Event.ON_START);
        this.timeout = 5000L;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.registry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.registry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.handler.postDelayed(this.emitStopEventCallback, this.timeout);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    /* renamed from: getLifecycle, reason: from getter */
    public LifecycleRegistry getRegistry() {
        return this.registry;
    }

    @Override // com.robinhood.utils.RhProcessLifecycleOwner
    public void register(RhProcessLifecycleOwner2 observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.registry.addObserver(observer);
        this.registeredObservers.add(observer);
    }

    @Override // com.robinhood.utils.RhProcessLifecycleOwner
    public void unregisterAll() {
        Iterator<T> it = this.registeredObservers.iterator();
        while (it.hasNext()) {
            this.registry.removeObserver((RhProcessLifecycleOwner2) it.next());
        }
        this.registeredObservers.clear();
    }

    @Override // com.robinhood.utils.RhProcessLifecycleOwner
    public void useExtendedTimeout() {
        this.timeout = 120000L;
    }
}
