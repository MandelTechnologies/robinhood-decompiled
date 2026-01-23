package com.robinhood.disposer;

import android.view.View;
import com.robinhood.utils.extensions.Consumers;
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

/* compiled from: ViewDisposer.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007¢\u0006\u0002\b\rJ/\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000fH\u0007¢\u0006\u0002\b\rJ\"\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00112\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/disposer/ViewScopedCompletable;", "", "upstream", "Lio/reactivex/Completable;", "view", "Landroid/view/View;", "<init>", "(Lio/reactivex/Completable;Landroid/view/View;)V", "subscribe", "Lio/reactivex/disposables/Disposable;", "onComplete", "Lkotlin/Function0;", "", "subscribeKotlin", "onError", "Lkotlin/Function1;", "", "Lio/reactivex/functions/Action;", "Lio/reactivex/functions/Consumer;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class ViewScopedCompletable {
    public static final int $stable = 8;
    private final Completable upstream;
    private final View view;

    @JvmOverloads
    public final Disposable subscribe() {
        return subscribe$default(this, null, null, 3, null);
    }

    @JvmOverloads
    public final Disposable subscribe(Action onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        return subscribe$default(this, onComplete, null, 2, null);
    }

    public ViewScopedCompletable(Completable upstream, View view) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(view, "view");
        this.upstream = upstream;
        this.view = view;
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
        if (!this.view.isAttachedToWindow()) {
            throw new IllegalStateException("Can't bind to lifecycle when View is detached");
        }
        Disposable disposableSubscribe = this.upstream.subscribe(new ViewDisposerKt$sam$io_reactivex_functions_Action$0(onComplete), new RxErrorCheckpoint(onError));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        return ViewDisposerKt.disposeWhen(disposableSubscribe, this.view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Disposable subscribe$default(ViewScopedCompletable viewScopedCompletable, Action action, Consumer consumer, int i, Object obj) {
        if ((i & 1) != 0) {
            action = new Action() { // from class: com.robinhood.disposer.ViewScopedCompletable.subscribe.2
                @Override // io.reactivex.functions.Action
                public final void run() {
                }
            };
        }
        if ((i & 2) != 0) {
            consumer = Consumers.onError();
        }
        return viewScopedCompletable.subscribe(action, consumer);
    }

    @JvmOverloads
    public final Disposable subscribe(final Action onComplete, final Consumer<Throwable> onError) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onError, "onError");
        return subscribeKotlin(new Function0() { // from class: com.robinhood.disposer.ViewScopedCompletable$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ViewScopedCompletable.subscribe$lambda$1(onComplete);
            }
        }, new Function1() { // from class: com.robinhood.disposer.ViewScopedCompletable$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ViewScopedCompletable.subscribe$lambda$2(onError, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribe$lambda$1(Action action) throws Exception {
        action.run();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribe$lambda$2(Consumer consumer, Throwable it) throws Exception {
        Intrinsics.checkNotNullParameter(it, "it");
        consumer.accept(it);
        return Unit.INSTANCE;
    }
}
