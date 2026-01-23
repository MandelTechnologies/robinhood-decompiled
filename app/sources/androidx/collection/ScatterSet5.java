package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ScatterSet.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a)\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0002\u0010\u0006\"\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"E", "Landroidx/collection/MutableScatterSet;", "mutableScatterSetOf", "()Landroidx/collection/MutableScatterSet;", "element1", "element2", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableScatterSet;", "", "EmptyScatterSet", "Landroidx/collection/MutableScatterSet;", "collection"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.collection.ScatterSetKt, reason: use source file name */
/* loaded from: classes.dex */
public final class ScatterSet5 {
    private static final ScatterSet2<Object> EmptyScatterSet = new ScatterSet2<>(0);

    public static final <E> ScatterSet2<E> mutableScatterSetOf() {
        return new ScatterSet2<>(0, 1, null);
    }

    public static final <E> ScatterSet2<E> mutableScatterSetOf(E e, E e2) {
        ScatterSet2<E> scatterSet2 = new ScatterSet2<>(2);
        scatterSet2.plusAssign((ScatterSet2<E>) e);
        scatterSet2.plusAssign((ScatterSet2<E>) e2);
        return scatterSet2;
    }
}
