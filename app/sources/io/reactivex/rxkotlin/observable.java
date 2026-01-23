package io.reactivex.rxkotlin;

import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: observable.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0007¢\u0006\u0004\b\u0004\u0010\u0007¨\u0006\b"}, m3636d2 = {"", "T", "", "Lio/reactivex/Observable;", "toObservable", "(Ljava/lang/Iterable;)Lio/reactivex/Observable;", "Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;)Lio/reactivex/Observable;", "rxkotlin"}, m3637k = 2, m3638mv = {1, 4, 0})
/* renamed from: io.reactivex.rxkotlin.ObservableKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class observable {
    public static final <T> Observable<T> toObservable(Iterable<? extends T> toObservable) {
        Intrinsics.checkParameterIsNotNull(toObservable, "$this$toObservable");
        Observable<T> observableFromIterable = Observable.fromIterable(toObservable);
        Intrinsics.checkExpressionValueIsNotNull(observableFromIterable, "Observable.fromIterable(this)");
        return observableFromIterable;
    }

    public static final <T> Observable<T> toObservable(Sequence<? extends T> toObservable) {
        Intrinsics.checkParameterIsNotNull(toObservable, "$this$toObservable");
        return toObservable(SequencesKt.asIterable(toObservable));
    }
}
