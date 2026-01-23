package io.reactivex.rxkotlin;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Observables.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"", "T", "U", "Lio/reactivex/Observable;", "Lio/reactivex/ObservableSource;", "other", "Lkotlin/Pair;", "withLatestFrom", "(Lio/reactivex/Observable;Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;", "rxkotlin"}, m3637k = 2, m3638mv = {1, 4, 0})
/* loaded from: classes14.dex */
public final class ObservablesKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, U> Observable<Tuples2<T, U>> withLatestFrom(Observable<T> withLatestFrom, ObservableSource<U> other) {
        Intrinsics.checkParameterIsNotNull(withLatestFrom, "$this$withLatestFrom");
        Intrinsics.checkParameterIsNotNull(other, "other");
        Observable<Tuples2<T, U>> observable = (Observable<Tuples2<T, U>>) withLatestFrom.withLatestFrom(other, new BiFunction<T, U, Tuples2<? extends T, ? extends U>>() { // from class: io.reactivex.rxkotlin.ObservablesKt.withLatestFrom.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
                return apply((C456812<T1, T2, R, T, U>) obj, obj2);
            }

            @Override // io.reactivex.functions.BiFunction
            public final Tuples2<T, U> apply(T t, U u) {
                Intrinsics.checkParameterIsNotNull(t, "t");
                Intrinsics.checkParameterIsNotNull(u, "u");
                return new Tuples2<>(t, u);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable, "withLatestFrom(other, Bi…n { t, u -> Pair(t, u) })");
        return observable;
    }
}
