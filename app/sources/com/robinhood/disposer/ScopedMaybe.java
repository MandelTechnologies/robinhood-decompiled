package com.robinhood.disposer;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.utils.p408rx.error.RxErrorCheckpoint;
import io.reactivex.Maybe;
import io.reactivex.disposables.Disposable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Disposer.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B+\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0002\b\u0010JG\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000e2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014H\u0007¢\u0006\u0002\b\u0010R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/disposer/ScopedMaybe;", "T", "", "upstream", "Lio/reactivex/Maybe;", "lifecycle", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/disposer/LifecycleEvent;", "terminalEvent", "<init>", "(Lio/reactivex/Maybe;Lcom/jakewharton/rxrelay2/BehaviorRelay;Lcom/robinhood/disposer/LifecycleEvent;)V", "subscribe", "Lio/reactivex/disposables/Disposable;", "onNext", "Lkotlin/Function1;", "", "subscribeKotlin", "onError", "", "onComplete", "Lkotlin/Function0;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class ScopedMaybe<T> {
    public static final int $stable = 8;
    private final BehaviorRelay<LifecycleEvent> lifecycle;
    private final LifecycleEvent terminalEvent;
    private final Maybe<T> upstream;

    public ScopedMaybe(Maybe<T> upstream, BehaviorRelay<LifecycleEvent> lifecycle, LifecycleEvent terminalEvent) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(terminalEvent, "terminalEvent");
        this.upstream = upstream;
        this.lifecycle = lifecycle;
        this.terminalEvent = terminalEvent;
    }

    @JvmName
    public final Disposable subscribeKotlin(Function1<? super T, Unit> onNext) {
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        return subscribeKotlin$default(this, onNext, RxErrorCheckpoint.HANDLER_UNHANDLED, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Disposable subscribeKotlin$default(ScopedMaybe scopedMaybe, Function1 function1, Function1 function12, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function12 = RxErrorCheckpoint.HANDLER_UNHANDLED;
        }
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: com.robinhood.disposer.ScopedMaybe$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        return scopedMaybe.subscribeKotlin(function1, function12, function0);
    }

    @JvmName
    public final Disposable subscribeKotlin(Function1<? super T, Unit> onNext, Function1<? super Throwable, Unit> onError, Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        LifecycleEvent currentEvent = DisposerKt.getCurrentEvent(this.lifecycle);
        if (currentEvent.compareTo(this.terminalEvent) >= 0) {
            throw new IllegalStateException(("Can't bind to lifecycle in " + currentEvent).toString());
        }
        Disposable disposableSubscribe = this.upstream.subscribe(new DisposerKt$sam$io_reactivex_functions_Consumer$0(onNext), new RxErrorCheckpoint(onError), new DisposerKt$sam$io_reactivex_functions_Action$0(onComplete));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        return DisposerKt.disposeWhen(disposableSubscribe, this.lifecycle, this.terminalEvent);
    }
}
