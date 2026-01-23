package com.robinhood.disposer;

import android.view.View;
import com.robinhood.utils.extensions.Consumers;
import com.robinhood.utils.p408rx.error.RxErrorCheckpoint;
import io.reactivex.Flowable;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.reactivestreams.Subscription;

/* compiled from: ViewDisposer.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0002\b\u000eJ[\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0002\b\u000eJ<\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00152\b\b\u0002\u0010\u0011\u001a\u00020\u00162\b\b\u0002\u0010\u0013\u001a\u00020\u0016H\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/disposer/ViewScopedFlowable;", "T", "", "upstream", "Lio/reactivex/Flowable;", "view", "Landroid/view/View;", "<init>", "(Lio/reactivex/Flowable;Landroid/view/View;)V", "subscribe", "Lio/reactivex/disposables/Disposable;", "onNext", "Lkotlin/Function1;", "", "subscribeKotlin", "onError", "", "onComplete", "Lkotlin/Function0;", "onSubscribe", "Lorg/reactivestreams/Subscription;", "Lio/reactivex/functions/Consumer;", "Lio/reactivex/functions/Action;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class ViewScopedFlowable<T> {
    public static final int $stable = 8;
    private final Flowable<T> upstream;
    private final View view;

    @JvmOverloads
    public final Disposable subscribe() {
        return subscribe$default(this, null, null, null, null, 15, null);
    }

    @JvmOverloads
    public final Disposable subscribe(Consumer<T> onNext) {
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        return subscribe$default(this, onNext, null, null, null, 14, null);
    }

    @JvmOverloads
    public final Disposable subscribe(Consumer<T> onNext, Consumer<Throwable> onError) {
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Intrinsics.checkNotNullParameter(onError, "onError");
        return subscribe$default(this, onNext, onError, null, null, 12, null);
    }

    @JvmOverloads
    public final Disposable subscribe(Consumer<T> onNext, Consumer<Throwable> onError, Action onComplete) {
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        return subscribe$default(this, onNext, onError, onComplete, null, 8, null);
    }

    public ViewScopedFlowable(Flowable<T> upstream, View view) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(view, "view");
        this.upstream = upstream;
        this.view = view;
    }

    @JvmName
    public final Disposable subscribeKotlin(Function1<? super T, Unit> onNext) {
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        return subscribeKotlin$default(this, onNext, RxErrorCheckpoint.HANDLER_UNHANDLED, null, null, 12, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Disposable subscribeKotlin$default(ViewScopedFlowable viewScopedFlowable, Function1 function1, Function1 function12, Function0 function0, Function1 function13, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: com.robinhood.disposer.ViewScopedFlowable$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 8) != 0) {
            function13 = new Function1() { // from class: com.robinhood.disposer.ViewScopedFlowable$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ViewScopedFlowable.subscribe$lambda$1((Subscription) obj2);
                }
            };
        }
        return viewScopedFlowable.subscribeKotlin(function1, function12, function0, function13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribe$lambda$1(Subscription it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    @JvmName
    public final Disposable subscribeKotlin(Function1<? super T, Unit> onNext, Function1<? super Throwable, Unit> onError, Function0<Unit> onComplete, Function1<? super Subscription, Unit> onSubscribe) {
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onSubscribe, "onSubscribe");
        if (!this.view.isAttachedToWindow()) {
            throw new IllegalStateException("Can't bind to lifecycle when View is detached");
        }
        Disposable disposableSubscribe = this.upstream.subscribe(new ViewDisposerKt$sam$io_reactivex_functions_Consumer$0(onNext), new RxErrorCheckpoint(onError), new ViewDisposerKt$sam$io_reactivex_functions_Action$0(onComplete), new ViewDisposerKt$sam$io_reactivex_functions_Consumer$0(onSubscribe));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        return ViewDisposerKt.disposeWhen(disposableSubscribe, this.view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Disposable subscribe$default(ViewScopedFlowable viewScopedFlowable, Consumer consumer, Consumer consumer2, Action action, Action action2, int i, Object obj) {
        if ((i & 1) != 0) {
            consumer = Functions.emptyConsumer();
        }
        if ((i & 2) != 0) {
            consumer2 = Consumers.onError();
        }
        if ((i & 4) != 0) {
            action = new Action() { // from class: com.robinhood.disposer.ViewScopedFlowable.subscribe.4
                @Override // io.reactivex.functions.Action
                public final void run() {
                }
            };
        }
        if ((i & 8) != 0) {
            action2 = new Action() { // from class: com.robinhood.disposer.ViewScopedFlowable.subscribe.5
                @Override // io.reactivex.functions.Action
                public final void run() {
                }
            };
        }
        return viewScopedFlowable.subscribe(consumer, consumer2, action, action2);
    }

    @JvmOverloads
    public final Disposable subscribe(final Consumer<T> onNext, final Consumer<Throwable> onError, final Action onComplete, final Action onSubscribe) {
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onSubscribe, "onSubscribe");
        return subscribeKotlin(new Function1() { // from class: com.robinhood.disposer.ViewScopedFlowable$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ViewScopedFlowable.subscribe$lambda$3(onNext, obj);
            }
        }, new Function1() { // from class: com.robinhood.disposer.ViewScopedFlowable$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ViewScopedFlowable.subscribe$lambda$4(onError, (Throwable) obj);
            }
        }, new Function0() { // from class: com.robinhood.disposer.ViewScopedFlowable$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ViewScopedFlowable.subscribe$lambda$5(onComplete);
            }
        }, new Function1() { // from class: com.robinhood.disposer.ViewScopedFlowable$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ViewScopedFlowable.subscribe$lambda$6(onSubscribe, (Subscription) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribe$lambda$3(Consumer consumer, Object obj) throws Exception {
        consumer.accept(obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribe$lambda$4(Consumer consumer, Throwable it) throws Exception {
        Intrinsics.checkNotNullParameter(it, "it");
        consumer.accept(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribe$lambda$5(Action action) throws Exception {
        action.run();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribe$lambda$6(Action action, Subscription it) throws Exception {
        Intrinsics.checkNotNullParameter(it, "it");
        action.run();
        return Unit.INSTANCE;
    }
}
