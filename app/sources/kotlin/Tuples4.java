package kotlin;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Tuples.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u001a4\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0001H\u0086\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0006*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"A", "B", "that", "Lkotlin/Pair;", "to", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "T", "", "toList", "(Lkotlin/Pair;)Ljava/util/List;", "kotlin-stdlib"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmName
/* renamed from: kotlin.TuplesKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class Tuples4 {
    /* renamed from: to */
    public static final <A, B> Tuples2<A, B> m3642to(A a, B b) {
        return new Tuples2<>(a, b);
    }

    public static final <T> List<T> toList(Tuples2<? extends T, ? extends T> tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<this>");
        return CollectionsKt.listOf(tuples2.getFirst(), tuples2.getSecond());
    }
}
