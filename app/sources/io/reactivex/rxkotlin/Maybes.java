package io.reactivex.rxkotlin;

import io.jsonwebtoken.Header;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.functions.BiFunction;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Maybes.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\t\"\b\b\u0000\u0010\u0004*\u00020\u0001\"\b\b\u0001\u0010\u0005*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lio/reactivex/rxkotlin/Maybes;", "", "<init>", "()V", "T", "U", "Lio/reactivex/MaybeSource;", "s1", "s2", "Lio/reactivex/Maybe;", "Lkotlin/Pair;", Header.COMPRESSION_ALGORITHM, "(Lio/reactivex/MaybeSource;Lio/reactivex/MaybeSource;)Lio/reactivex/Maybe;", "rxkotlin"}, m3637k = 1, m3638mv = {1, 4, 0})
/* loaded from: classes14.dex */
public final class Maybes {
    public static final Maybes INSTANCE = new Maybes();

    private Maybes() {
    }

    public final <T, U> Maybe<Tuples2<T, U>> zip(MaybeSource<T> s1, MaybeSource<U> s2) {
        Intrinsics.checkParameterIsNotNull(s1, "s1");
        Intrinsics.checkParameterIsNotNull(s2, "s2");
        Maybe<Tuples2<T, U>> maybeZip = Maybe.zip(s1, s2, new BiFunction<T, U, Tuples2<? extends T, ? extends U>>() { // from class: io.reactivex.rxkotlin.Maybes.zip.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
                return apply((C456762<T1, T2, R, T, U>) obj, obj2);
            }

            @Override // io.reactivex.functions.BiFunction
            public final Tuples2<T, U> apply(T t, U u) {
                Intrinsics.checkParameterIsNotNull(t, "t");
                Intrinsics.checkParameterIsNotNull(u, "u");
                return new Tuples2<>(t, u);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(maybeZip, "Maybe.zip(s1, s2,\n      …n { t, u -> Pair(t, u) })");
        return maybeZip;
    }
}
