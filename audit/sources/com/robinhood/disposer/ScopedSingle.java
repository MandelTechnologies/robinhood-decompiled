package com.robinhood.disposer;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.utils.p408rx.error.RxErrorCheckpoint;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Disposer.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\b\rJ!\u0010\u000b\u001a\u00020\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000fH\u0007¢\u0006\u0002\b\rJ5\u0010\u000b\u001a\u00020\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00100\u000fH\u0007¢\u0006\u0002\b\rJ1\u0010\u0013\u001a\u00020\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00142\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00120\u0014H\u0007¢\u0006\u0002\b\u000bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/disposer/ScopedSingle;", "T", "", "upstream", "Lio/reactivex/Single;", "lifecycle", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/disposer/LifecycleEvent;", "terminalEvent", "<init>", "(Lio/reactivex/Single;Lcom/jakewharton/rxrelay2/BehaviorRelay;Lcom/robinhood/disposer/LifecycleEvent;)V", "subscribe", "Lio/reactivex/disposables/Disposable;", "subscribeKotlin", "onNext", "Lkotlin/Function1;", "", "onError", "", "subscribeJava", "Lio/reactivex/functions/Consumer;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class ScopedSingle<T> {
    public static final int $stable = 8;
    private final BehaviorRelay<LifecycleEvent> lifecycle;
    private final LifecycleEvent terminalEvent;
    private final Single<T> upstream;

    @JvmOverloads
    @JvmName
    public final Disposable subscribe() {
        return subscribe$default(this, null, null, 3, null);
    }

    @JvmOverloads
    @JvmName
    public final Disposable subscribe(Consumer<? super T> onNext) {
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        return subscribe$default(this, onNext, null, 2, null);
    }

    public ScopedSingle(Single<T> upstream, BehaviorRelay<LifecycleEvent> lifecycle, LifecycleEvent terminalEvent) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(terminalEvent, "terminalEvent");
        this.upstream = upstream;
        this.lifecycle = lifecycle;
        this.terminalEvent = terminalEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribe$lambda$0(Object obj) {
        return Unit.INSTANCE;
    }

    @JvmName
    public final Disposable subscribeKotlin() {
        return subscribeKotlin(new Function1() { // from class: com.robinhood.disposer.ScopedSingle$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScopedSingle.subscribe$lambda$0(obj);
            }
        }, RxErrorCheckpoint.HANDLER_UNHANDLED);
    }

    @JvmName
    public final Disposable subscribeKotlin(Function1<? super T, Unit> onNext) {
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        return subscribeKotlin(onNext, RxErrorCheckpoint.HANDLER_UNHANDLED);
    }

    @JvmName
    public final Disposable subscribeKotlin(Function1<? super T, Unit> onNext, Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Intrinsics.checkNotNullParameter(onError, "onError");
        LifecycleEvent currentEvent = DisposerKt.getCurrentEvent(this.lifecycle);
        if (currentEvent.compareTo(this.terminalEvent) >= 0) {
            throw new IllegalStateException(("Can't bind to lifecycle in " + currentEvent).toString());
        }
        Disposable disposableSubscribe = this.upstream.subscribe(new DisposerKt$sam$io_reactivex_functions_Consumer$0(onNext), new RxErrorCheckpoint(onError));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        return DisposerKt.disposeWhen(disposableSubscribe, this.lifecycle, this.terminalEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Disposable subscribe$default(ScopedSingle scopedSingle, Consumer consumer, Consumer consumer2, int i, Object obj) {
        if ((i & 1) != 0) {
            consumer = Functions.emptyConsumer();
        }
        if ((i & 2) != 0) {
            consumer2 = new DisposerKt$sam$io_reactivex_functions_Consumer$0(RxErrorCheckpoint.HANDLER_UNHANDLED);
        }
        return scopedSingle.subscribe(consumer, consumer2);
    }

    @JvmOverloads
    @JvmName
    public final Disposable subscribe(Consumer<? super T> onNext, Consumer<? super Throwable> onError) {
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Intrinsics.checkNotNullParameter(onError, "onError");
        return subscribeKotlin(new ScopedSingle$subscribeJava$1(onNext), new ScopedSingle$subscribeJava$2(onError));
    }
}
