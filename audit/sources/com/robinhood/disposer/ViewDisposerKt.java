package com.robinhood.disposer;

import android.view.View;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ViewDisposer.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a2\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u0007*\b\u0012\u0004\u0012\u0002H\u00060\b2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n\u001a$\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000b\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\f2\u0006\u0010\u0002\u001a\u00020\u0003\u001a$\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\r\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u000e2\u0006\u0010\u0002\u001a\u00020\u0003\u001a$\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000f\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u00102\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0013"}, m3636d2 = {"disposeWhen", "Lio/reactivex/disposables/Disposable;", "view", "Landroid/view/View;", "bindTo", "Lcom/robinhood/disposer/ViewScopedObservable;", "T", "", "Lio/reactivex/Observable;", "disconnectWhenStopped", "", "Lcom/robinhood/disposer/ViewScopedFlowable;", "Lio/reactivex/Flowable;", "Lcom/robinhood/disposer/ViewScopedMaybe;", "Lio/reactivex/Maybe;", "Lcom/robinhood/disposer/ViewScopedSingle;", "Lio/reactivex/Single;", "Lcom/robinhood/disposer/ViewScopedCompletable;", "Lio/reactivex/Completable;", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class ViewDisposerKt {
    public static final Disposable disposeWhen(final Disposable disposable, final View view) {
        Intrinsics.checkNotNullParameter(disposable, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        if (!view.isAttachedToWindow()) {
            throw new IllegalStateException("Can't disposeWhen() when View is detached");
        }
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.robinhood.disposer.ViewDisposerKt$disposeWhen$attachListener$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                Intrinsics.checkNotNullParameter(v, "v");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                Intrinsics.checkNotNullParameter(v, "v");
                disposable.dispose();
                view.removeOnAttachStateChangeListener(this);
            }
        });
        return disposable;
    }

    public static /* synthetic */ ViewScopedObservable bindTo$default(Observable observable, View view, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return bindTo(observable, view, z);
    }

    public static final <T> ViewScopedObservable<T> bindTo(Observable<T> observable, View view, boolean z) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        return new ViewScopedObservable<>(observable, view, z);
    }

    public static final <T> ViewScopedFlowable<T> bindTo(Flowable<T> flowable, View view) {
        Intrinsics.checkNotNullParameter(flowable, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        return new ViewScopedFlowable<>(flowable, view);
    }

    public static final <T> ViewScopedMaybe<T> bindTo(Maybe<T> maybe, View view) {
        Intrinsics.checkNotNullParameter(maybe, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        return new ViewScopedMaybe<>(maybe, view);
    }

    public static final <T> ViewScopedSingle<T> bindTo(Single<T> single, View view) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        return new ViewScopedSingle<>(single, view);
    }

    public static final ViewScopedCompletable bindTo(Completable completable, View view) {
        Intrinsics.checkNotNullParameter(completable, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        return new ViewScopedCompletable(completable, view);
    }
}
