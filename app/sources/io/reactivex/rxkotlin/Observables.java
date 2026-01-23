package io.reactivex.rxkotlin;

import io.jsonwebtoken.Header;
import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function3;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Observables.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\u0006\"\b\b\u0000\u0010\u0004*\u00020\u0001\"\b\b\u0001\u0010\u0005*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJo\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e0\u0006\"\b\b\u0000\u0010\u0004*\u00020\u0001\"\b\b\u0001\u0010\u0005*\u00020\u0001\"\b\b\u0002\u0010\f*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000fJQ\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\u0006\"\b\b\u0000\u0010\u0004*\u00020\u0001\"\b\b\u0001\u0010\u0005*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u000bJo\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e0\u0006\"\b\b\u0000\u0010\u0004*\u00020\u0001\"\b\b\u0001\u0010\u0005*\u00020\u0001\"\b\b\u0002\u0010\f*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, m3636d2 = {"Lio/reactivex/rxkotlin/Observables;", "", "<init>", "()V", "T1", "T2", "Lio/reactivex/Observable;", "source1", "source2", "Lkotlin/Pair;", "combineLatest", "(Lio/reactivex/Observable;Lio/reactivex/Observable;)Lio/reactivex/Observable;", "T3", "source3", "Lkotlin/Triple;", "(Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;)Lio/reactivex/Observable;", Header.COMPRESSION_ALGORITHM, "rxkotlin"}, m3637k = 1, m3638mv = {1, 4, 0})
/* loaded from: classes21.dex */
public final class Observables {
    public static final Observables INSTANCE = new Observables();

    private Observables() {
    }

    public final <T1, T2> Observable<Tuples2<T1, T2>> combineLatest(Observable<T1> source1, Observable<T2> source2) {
        Intrinsics.checkParameterIsNotNull(source1, "source1");
        Intrinsics.checkParameterIsNotNull(source2, "source2");
        Observable<Tuples2<T1, T2>> observableCombineLatest = Observable.combineLatest(source1, source2, new BiFunction<T1, T2, Tuples2<? extends T1, ? extends T2>>() { // from class: io.reactivex.rxkotlin.Observables.combineLatest.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
                return apply((C456772<T1, T2, R>) obj, obj2);
            }

            @Override // io.reactivex.functions.BiFunction
            public final Tuples2<T1, T2> apply(T1 t1, T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                return Tuples4.m3642to(t1, t2);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…> { t1, t2 -> t1 to t2 })");
        return observableCombineLatest;
    }

    public final <T1, T2, T3> Observable<Tuples3<T1, T2, T3>> combineLatest(Observable<T1> source1, Observable<T2> source2, Observable<T3> source3) {
        Intrinsics.checkParameterIsNotNull(source1, "source1");
        Intrinsics.checkParameterIsNotNull(source2, "source2");
        Intrinsics.checkParameterIsNotNull(source3, "source3");
        Observable<Tuples3<T1, T2, T3>> observableCombineLatest = Observable.combineLatest(source1, source2, source3, new Function3<T1, T2, T3, Tuples3<? extends T1, ? extends T2, ? extends T3>>() { // from class: io.reactivex.rxkotlin.Observables.combineLatest.4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function3
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2, Object obj3) {
                return apply((C456784<T1, T2, T3, R>) obj, obj2, obj3);
            }

            @Override // io.reactivex.functions.Function3
            public final Tuples3<T1, T2, T3> apply(T1 t1, T2 t2, T3 t3) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                return new Tuples3<>(t1, t2, t3);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest… -> Triple(t1, t2, t3) })");
        return observableCombineLatest;
    }

    public final <T1, T2> Observable<Tuples2<T1, T2>> zip(Observable<T1> source1, Observable<T2> source2) {
        Intrinsics.checkParameterIsNotNull(source1, "source1");
        Intrinsics.checkParameterIsNotNull(source2, "source2");
        Observable<Tuples2<T1, T2>> observableZip = Observable.zip(source1, source2, new BiFunction<T1, T2, Tuples2<? extends T1, ? extends T2>>() { // from class: io.reactivex.rxkotlin.Observables.zip.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
                return apply((C456792<T1, T2, R>) obj, obj2);
            }

            @Override // io.reactivex.functions.BiFunction
            public final Tuples2<T1, T2> apply(T1 t1, T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                return Tuples4.m3642to(t1, t2);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableZip, "Observable.zip(source1, …> { t1, t2 -> t1 to t2 })");
        return observableZip;
    }

    public final <T1, T2, T3> Observable<Tuples3<T1, T2, T3>> zip(Observable<T1> source1, Observable<T2> source2, Observable<T3> source3) {
        Intrinsics.checkParameterIsNotNull(source1, "source1");
        Intrinsics.checkParameterIsNotNull(source2, "source2");
        Intrinsics.checkParameterIsNotNull(source3, "source3");
        Observable<Tuples3<T1, T2, T3>> observableZip = Observable.zip(source1, source2, source3, new Function3<T1, T2, T3, Tuples3<? extends T1, ? extends T2, ? extends T3>>() { // from class: io.reactivex.rxkotlin.Observables.zip.4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function3
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2, Object obj3) {
                return apply((C456804<T1, T2, T3, R>) obj, obj2, obj3);
            }

            @Override // io.reactivex.functions.Function3
            public final Tuples3<T1, T2, T3> apply(T1 t1, T2 t2, T3 t3) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                return new Tuples3<>(t1, t2, t3);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableZip, "Observable.zip(source1, … -> Triple(t1, t2, t3) })");
        return observableZip;
    }
}
