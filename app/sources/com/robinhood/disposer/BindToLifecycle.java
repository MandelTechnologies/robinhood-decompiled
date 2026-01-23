package com.robinhood.disposer;

import com.jakewharton.rxrelay2.BehaviorRelay;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.ObservableConverter;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BindToLifecycle.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00042\b\u0012\u0004\u0012\u00020\b0\u0004B#\b\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u0011\u0010\u0014J#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0011\u0010\u0016J#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016¢\u0006\u0004\b\u0011\u0010\u0018J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u0011\u0010\u001aR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0016\u0010\f\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/disposer/BindToLifecycle;", "T", "Lio/reactivex/ObservableConverter;", "Lcom/robinhood/disposer/ScopedObservable;", "", "Lcom/robinhood/disposer/ScopedFlowable;", "Lcom/robinhood/disposer/ScopedMaybe;", "Lcom/robinhood/disposer/ScopedSingle;", "Lcom/robinhood/disposer/ScopedCompletable;", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/disposer/LifecycleEvent;", "lifecycle", "terminalEvent", "<init>", "(Lcom/jakewharton/rxrelay2/BehaviorRelay;Lcom/robinhood/disposer/LifecycleEvent;)V", "Lio/reactivex/Observable;", "upstream", "apply", "(Lio/reactivex/Observable;)Lcom/robinhood/disposer/ScopedObservable;", "Lio/reactivex/Flowable;", "(Lio/reactivex/Flowable;)Lcom/robinhood/disposer/ScopedFlowable;", "Lio/reactivex/Maybe;", "(Lio/reactivex/Maybe;)Lcom/robinhood/disposer/ScopedMaybe;", "Lio/reactivex/Single;", "(Lio/reactivex/Single;)Lcom/robinhood/disposer/ScopedSingle;", "Lio/reactivex/Completable;", "(Lio/reactivex/Completable;)Lcom/robinhood/disposer/ScopedCompletable;", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/disposer/LifecycleEvent;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class BindToLifecycle<T> implements ObservableConverter<T, ScopedObservable<T>> {
    public static final int $stable = 8;
    private final BehaviorRelay<LifecycleEvent> lifecycle;
    private final LifecycleEvent terminalEvent;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public BindToLifecycle(BehaviorRelay<LifecycleEvent> lifecycle) {
        this(lifecycle, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
    }

    @JvmOverloads
    public BindToLifecycle(BehaviorRelay<LifecycleEvent> lifecycle, LifecycleEvent lifecycleEvent) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.lifecycle = lifecycle;
        this.terminalEvent = lifecycleEvent;
    }

    public /* synthetic */ BindToLifecycle(BehaviorRelay behaviorRelay, LifecycleEvent lifecycleEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(behaviorRelay, (i & 2) != 0 ? null : lifecycleEvent);
    }

    @Override // io.reactivex.ObservableConverter
    public ScopedObservable<T> apply(Observable<T> upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        LifecycleEvent lifecycleEvent = this.terminalEvent;
        if (lifecycleEvent == null) {
            return DisposerKt.bindTo$default(upstream, this.lifecycle, (LifecycleEvent) null, 2, (Object) null);
        }
        return DisposerKt.bindTo(upstream, this.lifecycle, lifecycleEvent);
    }

    /* renamed from: apply, reason: merged with bridge method [inline-methods] */
    public ScopedFlowable<T> m22260apply(Flowable<T> upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        LifecycleEvent lifecycleEvent = this.terminalEvent;
        if (lifecycleEvent == null) {
            return DisposerKt.bindTo$default(upstream, this.lifecycle, (LifecycleEvent) null, 2, (Object) null);
        }
        return DisposerKt.bindTo(upstream, this.lifecycle, lifecycleEvent);
    }

    /* renamed from: apply, reason: merged with bridge method [inline-methods] */
    public ScopedMaybe<T> m22261apply(Maybe<T> upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        LifecycleEvent lifecycleEvent = this.terminalEvent;
        if (lifecycleEvent == null) {
            return DisposerKt.bindTo$default(upstream, this.lifecycle, (LifecycleEvent) null, 2, (Object) null);
        }
        return DisposerKt.bindTo(upstream, this.lifecycle, lifecycleEvent);
    }

    /* renamed from: apply, reason: merged with bridge method [inline-methods] */
    public ScopedSingle<T> m22262apply(Single<T> upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        LifecycleEvent lifecycleEvent = this.terminalEvent;
        if (lifecycleEvent == null) {
            return DisposerKt.bindTo$default(upstream, this.lifecycle, (LifecycleEvent) null, 2, (Object) null);
        }
        return DisposerKt.bindTo(upstream, this.lifecycle, lifecycleEvent);
    }

    /* renamed from: apply, reason: merged with bridge method [inline-methods] */
    public ScopedCompletable m22259apply(Completable upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        LifecycleEvent lifecycleEvent = this.terminalEvent;
        if (lifecycleEvent == null) {
            return DisposerKt.bindTo$default(upstream, this.lifecycle, (LifecycleEvent) null, 2, (Object) null);
        }
        return DisposerKt.bindTo(upstream, this.lifecycle, lifecycleEvent);
    }
}
