package com.robinhood.disposer;

import android.view.View;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.ObservableConverter;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BindToView.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00012\b\u0012\u0004\u0012\u00020\b0\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u000f\u0010\u0012J#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u000f\u0010\u0014J#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u000f\u0010\u0016J\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u000f\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/disposer/BindToView;", "", "T", "Lio/reactivex/ObservableConverter;", "Lcom/robinhood/disposer/ViewScopedObservable;", "Lcom/robinhood/disposer/ViewScopedFlowable;", "Lcom/robinhood/disposer/ViewScopedMaybe;", "Lcom/robinhood/disposer/ViewScopedSingle;", "Lcom/robinhood/disposer/ViewScopedCompletable;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lio/reactivex/Observable;", "upstream", "apply", "(Lio/reactivex/Observable;)Lcom/robinhood/disposer/ViewScopedObservable;", "Lio/reactivex/Flowable;", "(Lio/reactivex/Flowable;)Lcom/robinhood/disposer/ViewScopedFlowable;", "Lio/reactivex/Maybe;", "(Lio/reactivex/Maybe;)Lcom/robinhood/disposer/ViewScopedMaybe;", "Lio/reactivex/Single;", "(Lio/reactivex/Single;)Lcom/robinhood/disposer/ViewScopedSingle;", "Lio/reactivex/Completable;", "(Lio/reactivex/Completable;)Lcom/robinhood/disposer/ViewScopedCompletable;", "Landroid/view/View;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class BindToView<T> implements ObservableConverter<T, ViewScopedObservable<T>> {
    public static final int $stable = 8;
    private final View view;

    public BindToView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    @Override // io.reactivex.ObservableConverter
    public ViewScopedObservable<T> apply(Observable<T> upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        return ViewDisposerKt.bindTo$default(upstream, this.view, false, 2, null);
    }

    /* renamed from: apply, reason: merged with bridge method [inline-methods] */
    public ViewScopedFlowable<T> m22264apply(Flowable<T> upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        return ViewDisposerKt.bindTo(upstream, this.view);
    }

    /* renamed from: apply, reason: merged with bridge method [inline-methods] */
    public ViewScopedMaybe<T> m22265apply(Maybe<T> upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        return ViewDisposerKt.bindTo(upstream, this.view);
    }

    /* renamed from: apply, reason: merged with bridge method [inline-methods] */
    public ViewScopedSingle<T> m22266apply(Single<T> upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        return ViewDisposerKt.bindTo(upstream, this.view);
    }

    /* renamed from: apply, reason: merged with bridge method [inline-methods] */
    public ViewScopedCompletable m22263apply(Completable upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        return ViewDisposerKt.bindTo(upstream, this.view);
    }
}
