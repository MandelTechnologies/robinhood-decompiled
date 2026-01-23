package io.reactivex.rxkotlin;

import io.jsonwebtoken.Header;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function3;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Singles.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\t\"\b\b\u0000\u0010\u0004*\u00020\u0001\"\b\b\u0001\u0010\u0005*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJo\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00110\t\"\b\b\u0000\u0010\r*\u00020\u0001\"\b\b\u0001\u0010\u000e*\u00020\u0001\"\b\b\u0002\u0010\u000f*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lio/reactivex/rxkotlin/Singles;", "", "<init>", "()V", "T", "U", "Lio/reactivex/SingleSource;", "s1", "s2", "Lio/reactivex/Single;", "Lkotlin/Pair;", Header.COMPRESSION_ALGORITHM, "(Lio/reactivex/SingleSource;Lio/reactivex/SingleSource;)Lio/reactivex/Single;", "T1", "T2", "T3", "s3", "Lkotlin/Triple;", "(Lio/reactivex/SingleSource;Lio/reactivex/SingleSource;Lio/reactivex/SingleSource;)Lio/reactivex/Single;", "rxkotlin"}, m3637k = 1, m3638mv = {1, 4, 0})
/* loaded from: classes14.dex */
public final class Singles {
    public static final Singles INSTANCE = new Singles();

    private Singles() {
    }

    public final <T, U> Single<Tuples2<T, U>> zip(SingleSource<T> s1, SingleSource<U> s2) {
        Intrinsics.checkParameterIsNotNull(s1, "s1");
        Intrinsics.checkParameterIsNotNull(s2, "s2");
        Single<Tuples2<T, U>> singleZip = Single.zip(s1, s2, new BiFunction<T, U, Tuples2<? extends T, ? extends U>>() { // from class: io.reactivex.rxkotlin.Singles.zip.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
                return apply((C456822<T1, T2, R, T, U>) obj, obj2);
            }

            @Override // io.reactivex.functions.BiFunction
            public final Tuples2<T, U> apply(T t, U u) {
                Intrinsics.checkParameterIsNotNull(t, "t");
                Intrinsics.checkParameterIsNotNull(u, "u");
                return new Tuples2<>(t, u);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(singleZip, "Single.zip(s1, s2, BiFun…n { t, u -> Pair(t, u) })");
        return singleZip;
    }

    public final <T1, T2, T3> Single<Tuples3<T1, T2, T3>> zip(SingleSource<T1> s1, SingleSource<T2> s2, SingleSource<T3> s3) {
        Intrinsics.checkParameterIsNotNull(s1, "s1");
        Intrinsics.checkParameterIsNotNull(s2, "s2");
        Intrinsics.checkParameterIsNotNull(s3, "s3");
        Single<Tuples3<T1, T2, T3>> singleZip = Single.zip(s1, s2, s3, new Function3<T1, T2, T3, Tuples3<? extends T1, ? extends T2, ? extends T3>>() { // from class: io.reactivex.rxkotlin.Singles.zip.4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function3
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2, Object obj3) {
                return apply((C456834<T1, T2, T3, R>) obj, obj2, obj3);
            }

            @Override // io.reactivex.functions.Function3
            public final Tuples3<T1, T2, T3> apply(T1 t1, T2 t2, T3 t3) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                return new Tuples3<>(t1, t2, t3);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(singleZip, "Single.zip(s1, s2, s3, F… -> Triple(t1, t2, t3) })");
        return singleZip;
    }
}
