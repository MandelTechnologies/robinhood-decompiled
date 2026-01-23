package com.robinhood.disposer;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.utils.p408rx.error.RxErrorCheckpoint;
import io.reactivex.Completable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Disposer.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\b\fJ\u001b\u0010\n\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0002\b\fJ/\u0010\n\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u0011H\u0007¢\u0006\u0002\b\fJ)\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00142\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00120\u0015H\u0007¢\u0006\u0002\b\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/disposer/ScopedCompletable;", "", "upstream", "Lio/reactivex/Completable;", "lifecycle", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/disposer/LifecycleEvent;", "terminalEvent", "<init>", "(Lio/reactivex/Completable;Lcom/jakewharton/rxrelay2/BehaviorRelay;Lcom/robinhood/disposer/LifecycleEvent;)V", "subscribe", "Lio/reactivex/disposables/Disposable;", "subscribeKotlin", "onComplete", "Lkotlin/Function0;", "", "onError", "Lkotlin/Function1;", "", "subscribeJava", "Lio/reactivex/functions/Action;", "Lio/reactivex/functions/Consumer;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class ScopedCompletable {
    public static final int $stable = 8;
    private final BehaviorRelay<LifecycleEvent> lifecycle;
    private final LifecycleEvent terminalEvent;
    private final Completable upstream;

    @JvmOverloads
    @JvmName
    public final Disposable subscribe() {
        return subscribe$default(this, null, null, 3, null);
    }

    @JvmOverloads
    @JvmName
    public final Disposable subscribe(Action onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        return subscribe$default(this, onComplete, null, 2, null);
    }

    public ScopedCompletable(Completable upstream, BehaviorRelay<LifecycleEvent> lifecycle, LifecycleEvent terminalEvent) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(terminalEvent, "terminalEvent");
        this.upstream = upstream;
        this.lifecycle = lifecycle;
        this.terminalEvent = terminalEvent;
    }

    @JvmName
    public final Disposable subscribeKotlin() {
        return subscribeKotlin(new Function0() { // from class: com.robinhood.disposer.ScopedCompletable$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, RxErrorCheckpoint.HANDLER_UNHANDLED);
    }

    @JvmName
    public final Disposable subscribeKotlin(Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        return subscribeKotlin(onComplete, RxErrorCheckpoint.HANDLER_UNHANDLED);
    }

    @JvmName
    public final Disposable subscribeKotlin(Function0<Unit> onComplete, Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onError, "onError");
        LifecycleEvent currentEvent = DisposerKt.getCurrentEvent(this.lifecycle);
        if (currentEvent.compareTo(this.terminalEvent) >= 0) {
            throw new IllegalStateException(("Can't bind to lifecycle in " + currentEvent).toString());
        }
        Disposable disposableSubscribe = this.upstream.subscribe(new DisposerKt$sam$io_reactivex_functions_Action$0(onComplete), new RxErrorCheckpoint(onError));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        return DisposerKt.disposeWhen(disposableSubscribe, this.lifecycle, this.terminalEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Disposable subscribe$default(ScopedCompletable scopedCompletable, Action action, Consumer consumer, int i, Object obj) {
        if ((i & 1) != 0) {
            action = new Action() { // from class: com.robinhood.disposer.ScopedCompletable$subscribeJava$1
                @Override // io.reactivex.functions.Action
                public final void run() {
                }
            };
        }
        if ((i & 2) != 0) {
            consumer = new DisposerKt$sam$io_reactivex_functions_Consumer$0(RxErrorCheckpoint.HANDLER_UNHANDLED);
        }
        return scopedCompletable.subscribe(action, consumer);
    }

    @JvmOverloads
    @JvmName
    public final Disposable subscribe(Action onComplete, Consumer<? super Throwable> onError) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onError, "onError");
        return subscribeKotlin(new ScopedCompletable$subscribeJava$2(onComplete), new ScopedCompletable$subscribeJava$3(onError));
    }
}
