package com.robinhood.disposer;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.utils.p408rx.error.RxErrorCheckpoint;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Disposer.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0002\b\u0010J]\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000e2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00142\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0002\b\u0010J6\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00162\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00120\u00162\b\b\u0002\u0010\u0013\u001a\u00020\u0017H\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/disposer/ScopedObservable;", "T", "", "upstream", "Lio/reactivex/Observable;", "lifecycle", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/disposer/LifecycleEvent;", "terminalEvent", "<init>", "(Lio/reactivex/Observable;Lcom/jakewharton/rxrelay2/BehaviorRelay;Lcom/robinhood/disposer/LifecycleEvent;)V", "subscribe", "Lio/reactivex/disposables/Disposable;", "onNext", "Lkotlin/Function1;", "", "subscribeKotlin", "onError", "", "onComplete", "Lkotlin/Function0;", "onSubscribe", "Lio/reactivex/functions/Consumer;", "Lio/reactivex/functions/Action;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class ScopedObservable<T> {
    public static final int $stable = 8;
    private final BehaviorRelay<LifecycleEvent> lifecycle;
    private final LifecycleEvent terminalEvent;
    private final Observable<T> upstream;

    @JvmOverloads
    public final Disposable subscribe() {
        return subscribe$default(this, null, null, null, 7, null);
    }

    @JvmOverloads
    public final Disposable subscribe(Consumer<? super T> onNext) {
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        return subscribe$default(this, onNext, null, null, 6, null);
    }

    @JvmOverloads
    public final Disposable subscribe(Consumer<? super T> onNext, Consumer<? super Throwable> onError) {
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Intrinsics.checkNotNullParameter(onError, "onError");
        return subscribe$default(this, onNext, onError, null, 4, null);
    }

    public ScopedObservable(Observable<T> upstream, BehaviorRelay<LifecycleEvent> lifecycle, LifecycleEvent terminalEvent) {
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
        return subscribeKotlin$default(this, onNext, RxErrorCheckpoint.HANDLER_UNHANDLED, null, null, 12, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Disposable subscribeKotlin$default(ScopedObservable scopedObservable, Function1 function1, Function1 function12, Function0 function0, Function1 function13, int i, Object obj) {
        if ((i & 2) != 0) {
            function12 = RxErrorCheckpoint.HANDLER_UNHANDLED;
        }
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: com.robinhood.disposer.ScopedObservable$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 8) != 0) {
            function13 = new Function1() { // from class: com.robinhood.disposer.ScopedObservable$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ScopedObservable.subscribe$lambda$1((Disposable) obj2);
                }
            };
        }
        return scopedObservable.subscribeKotlin(function1, function12, function0, function13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribe$lambda$1(Disposable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    @JvmName
    public final Disposable subscribeKotlin(Function1<? super T, Unit> onNext, Function1<? super Throwable, Unit> onError, Function0<Unit> onComplete, Function1<? super Disposable, Unit> onSubscribe) {
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onSubscribe, "onSubscribe");
        LifecycleEvent currentEvent = DisposerKt.getCurrentEvent(this.lifecycle);
        if (currentEvent.compareTo(this.terminalEvent) >= 0) {
            throw new IllegalStateException(("Can't disposeWhen in " + currentEvent).toString());
        }
        Disposable disposableSubscribe = this.upstream.subscribe(new DisposerKt$sam$io_reactivex_functions_Consumer$0(onNext), new RxErrorCheckpoint(onError), new DisposerKt$sam$io_reactivex_functions_Action$0(onComplete), new DisposerKt$sam$io_reactivex_functions_Consumer$0(onSubscribe));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        return DisposerKt.disposeWhen(disposableSubscribe, this.lifecycle, this.terminalEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Disposable subscribe$default(ScopedObservable scopedObservable, Consumer consumer, Consumer consumer2, Action action, int i, Object obj) {
        if ((i & 1) != 0) {
            consumer = Functions.emptyConsumer();
        }
        if ((i & 2) != 0) {
            consumer2 = new DisposerKt$sam$io_reactivex_functions_Consumer$0(RxErrorCheckpoint.HANDLER_UNHANDLED);
        }
        if ((i & 4) != 0) {
            action = new Action() { // from class: com.robinhood.disposer.ScopedObservable.subscribe.4
                @Override // io.reactivex.functions.Action
                public final void run() {
                }
            };
        }
        return scopedObservable.subscribe(consumer, consumer2, action);
    }

    /* compiled from: Disposer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.disposer.ScopedObservable$subscribe$5 */
    /* loaded from: classes15.dex */
    /* synthetic */ class C330855 extends FunctionReferenceImpl implements Function1<Object, Unit> {
        C330855(Object obj) {
            super(1, obj, Consumer.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) throws Exception {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj) throws Exception {
            ((Consumer) this.receiver).accept(obj);
        }
    }

    /* compiled from: Disposer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.disposer.ScopedObservable$subscribe$6 */
    /* loaded from: classes15.dex */
    /* synthetic */ class C330866 extends FunctionReferenceImpl implements Function1<Object, Unit> {
        C330866(Object obj) {
            super(1, obj, Consumer.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) throws Exception {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj) throws Exception {
            ((Consumer) this.receiver).accept(obj);
        }
    }

    @JvmOverloads
    public final Disposable subscribe(Consumer<? super T> onNext, Consumer<? super Throwable> onError, Action onComplete) {
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        return subscribeKotlin$default(this, new C330855(onNext), new C330866(onError), new C330877(onComplete), null, 8, null);
    }

    /* compiled from: Disposer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.disposer.ScopedObservable$subscribe$7 */
    /* loaded from: classes15.dex */
    /* synthetic */ class C330877 extends FunctionReferenceImpl implements Function0<Unit> {
        C330877(Object obj) {
            super(0, obj, Action.class, "run", "run()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws Exception {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() throws Exception {
            ((Action) this.receiver).run();
        }
    }
}
