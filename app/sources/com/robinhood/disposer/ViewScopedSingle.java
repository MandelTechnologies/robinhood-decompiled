package com.robinhood.disposer;

import android.view.View;
import com.robinhood.utils.extensions.Consumers;
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

/* compiled from: ViewDisposer.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0002\b\u000eJ5\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0002\b\u000eJ(\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0011H\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/disposer/ViewScopedSingle;", "T", "", "upstream", "Lio/reactivex/Single;", "view", "Landroid/view/View;", "<init>", "(Lio/reactivex/Single;Landroid/view/View;)V", "subscribe", "Lio/reactivex/disposables/Disposable;", "onNext", "Lkotlin/Function1;", "", "subscribeKotlin", "onError", "", "Lio/reactivex/functions/Consumer;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class ViewScopedSingle<T> {
    public static final int $stable = 8;
    private final Single<T> upstream;
    private final View view;

    @JvmOverloads
    public final Disposable subscribe() {
        return subscribe$default(this, null, null, 3, null);
    }

    @JvmOverloads
    public final Disposable subscribe(Consumer<T> onNext) {
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        return subscribe$default(this, onNext, null, 2, null);
    }

    public ViewScopedSingle(Single<T> upstream, View view) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(view, "view");
        this.upstream = upstream;
        this.view = view;
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
        if (!this.view.isAttachedToWindow()) {
            throw new IllegalStateException("Can't bind to lifecycle when View is detached");
        }
        Disposable disposableSubscribe = this.upstream.subscribe(new ViewDisposerKt$sam$io_reactivex_functions_Consumer$0(onNext), new RxErrorCheckpoint(onError));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        return ViewDisposerKt.disposeWhen(disposableSubscribe, this.view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Disposable subscribe$default(ViewScopedSingle viewScopedSingle, Consumer consumer, Consumer consumer2, int i, Object obj) {
        if ((i & 1) != 0) {
            consumer = Functions.emptyConsumer();
        }
        if ((i & 2) != 0) {
            consumer2 = Consumers.onError();
        }
        return viewScopedSingle.subscribe(consumer, consumer2);
    }

    @JvmOverloads
    public final Disposable subscribe(final Consumer<T> onNext, final Consumer<Throwable> onError) {
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Intrinsics.checkNotNullParameter(onError, "onError");
        return subscribeKotlin(new Function1() { // from class: com.robinhood.disposer.ViewScopedSingle$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ViewScopedSingle.subscribe$lambda$1(onNext, obj);
            }
        }, new Function1() { // from class: com.robinhood.disposer.ViewScopedSingle$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ViewScopedSingle.subscribe$lambda$2(onError, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribe$lambda$1(Consumer consumer, Object obj) throws Exception {
        consumer.accept(obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribe$lambda$2(Consumer consumer, Throwable it) throws Exception {
        Intrinsics.checkNotNullParameter(it, "it");
        consumer.accept(it);
        return Unit.INSTANCE;
    }
}
