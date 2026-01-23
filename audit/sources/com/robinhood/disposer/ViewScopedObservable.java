package com.robinhood.disposer;

import android.view.View;
import androidx.core.view.KeyEventDispatcher;
import com.robinhood.utils.extensions.Consumers;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p408rx.error.RxErrorCheckpoint;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ViewDisposer.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0002\b\u0010J[\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00142\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0002\b\u0010J2\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00162\b\b\u0002\u0010\u0013\u001a\u00020\u0017H\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/disposer/ViewScopedObservable;", "T", "", "upstream", "Lio/reactivex/Observable;", "view", "Landroid/view/View;", "disconnectWhenStopped", "", "<init>", "(Lio/reactivex/Observable;Landroid/view/View;Z)V", "subscribe", "Lio/reactivex/disposables/Disposable;", "onNext", "Lkotlin/Function1;", "", "subscribeKotlin", "onError", "", "onComplete", "Lkotlin/Function0;", "onSubscribe", "Lio/reactivex/functions/Consumer;", "Lio/reactivex/functions/Action;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class ViewScopedObservable<T> {
    public static final int $stable = 8;
    private final boolean disconnectWhenStopped;
    private final Observable<T> upstream;
    private final View view;

    @JvmOverloads
    public final Disposable subscribe() {
        return subscribe$default(this, null, null, null, 7, null);
    }

    @JvmOverloads
    public final Disposable subscribe(Consumer<T> onNext) {
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        return subscribe$default(this, onNext, null, null, 6, null);
    }

    @JvmOverloads
    public final Disposable subscribe(Consumer<T> onNext, Consumer<Throwable> onError) {
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Intrinsics.checkNotNullParameter(onError, "onError");
        return subscribe$default(this, onNext, onError, null, 4, null);
    }

    public ViewScopedObservable(Observable<T> upstream, View view, boolean z) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(view, "view");
        this.upstream = upstream;
        this.view = view;
        this.disconnectWhenStopped = z;
    }

    public /* synthetic */ ViewScopedObservable(Observable observable, View view, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(observable, view, (i & 4) != 0 ? false : z);
    }

    @JvmName
    public final Disposable subscribeKotlin(Function1<? super T, Unit> onNext) {
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        return subscribeKotlin$default(this, onNext, RxErrorCheckpoint.HANDLER_UNHANDLED, null, null, 12, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Disposable subscribeKotlin$default(ViewScopedObservable viewScopedObservable, Function1 function1, Function1 function12, Function0 function0, Function1 function13, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: com.robinhood.disposer.ViewScopedObservable$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 8) != 0) {
            function13 = new Function1() { // from class: com.robinhood.disposer.ViewScopedObservable$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ViewScopedObservable.subscribe$lambda$1((Disposable) obj2);
                }
            };
        }
        return viewScopedObservable.subscribeKotlin(function1, function12, function0, function13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribe$lambda$1(Disposable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    @JvmName
    public final Disposable subscribeKotlin(Function1<? super T, Unit> onNext, Function1<? super Throwable, Unit> onError, Function0<Unit> onComplete, Function1<? super Disposable, Unit> onSubscribe) {
        Observable<T> observableConnectWhen$default;
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onSubscribe, "onSubscribe");
        if (!this.view.isAttachedToWindow()) {
            throw new IllegalStateException("Can't bind to lifecycle when View is detached");
        }
        if (this.disconnectWhenStopped) {
            KeyEventDispatcher.Component activityContext = ViewsKt.getActivityContext(this.view);
            Intrinsics.checkNotNull(activityContext, "null cannot be cast to non-null type com.robinhood.disposer.LifecycleHost");
            Observable<T> observable = this.upstream;
            Observable<R> map = ((LifecycleHost) activityContext).getLifecycleState().map(new Function() { // from class: com.robinhood.disposer.ViewScopedObservable$subscribe$observable$1
                @Override // io.reactivex.functions.Function
                public final Boolean apply(LifecycleState it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(it.compareTo(LifecycleState.STARTED) >= 0);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            observableConnectWhen$default = ObservablesKt.connectWhen$default(observable, map, null, 2, null);
        } else {
            observableConnectWhen$default = this.upstream;
        }
        Disposable disposableSubscribe = observableConnectWhen$default.subscribe(new ViewDisposerKt$sam$io_reactivex_functions_Consumer$0(onNext), new RxErrorCheckpoint(onError), new ViewDisposerKt$sam$io_reactivex_functions_Action$0(onComplete), new ViewDisposerKt$sam$io_reactivex_functions_Consumer$0(onSubscribe));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        return ViewDisposerKt.disposeWhen(disposableSubscribe, this.view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Disposable subscribe$default(ViewScopedObservable viewScopedObservable, Consumer consumer, Consumer consumer2, Action action, int i, Object obj) {
        if ((i & 1) != 0) {
            consumer = Functions.emptyConsumer();
        }
        if ((i & 2) != 0) {
            consumer2 = Consumers.onError();
        }
        if ((i & 4) != 0) {
            action = new Action() { // from class: com.robinhood.disposer.ViewScopedObservable.subscribe.4
                @Override // io.reactivex.functions.Action
                public final void run() {
                }
            };
        }
        return viewScopedObservable.subscribe(consumer, consumer2, action);
    }

    @JvmOverloads
    public final Disposable subscribe(final Consumer<T> onNext, final Consumer<Throwable> onError, final Action onComplete) {
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        return subscribeKotlin$default(this, new Function1() { // from class: com.robinhood.disposer.ViewScopedObservable$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ViewScopedObservable.subscribe$lambda$3(onNext, obj);
            }
        }, new Function1() { // from class: com.robinhood.disposer.ViewScopedObservable$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ViewScopedObservable.subscribe$lambda$4(onError, (Throwable) obj);
            }
        }, new Function0() { // from class: com.robinhood.disposer.ViewScopedObservable$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ViewScopedObservable.subscribe$lambda$5(onComplete);
            }
        }, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribe$lambda$3(Consumer consumer, Object it) throws Exception {
        Intrinsics.checkNotNullParameter(it, "it");
        consumer.accept(it);
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
}
