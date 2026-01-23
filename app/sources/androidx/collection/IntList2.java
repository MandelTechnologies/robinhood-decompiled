package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IntList.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\u0005\u001a\u00020\u00002\n\u0010\b\u001a\u00020\u0007\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\t\u001a\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Landroidx/collection/IntList;", "emptyIntList", "()Landroidx/collection/IntList;", "", "element1", "intListOf", "(I)Landroidx/collection/IntList;", "", "elements", "([I)Landroidx/collection/IntList;", "Landroidx/collection/MutableIntList;", "mutableIntListOf", "(I)Landroidx/collection/MutableIntList;", "EmptyIntList", "Landroidx/collection/IntList;", "collection"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.collection.IntListKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class IntList2 {
    private static final IntList EmptyIntList = new IntList3(0);

    public static final IntList emptyIntList() {
        return EmptyIntList;
    }

    public static final IntList intListOf(int i) {
        return mutableIntListOf(i);
    }

    public static final IntList intListOf(int... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        IntList3 intList3 = new IntList3(elements.length);
        intList3.addAll(intList3._size, elements);
        return intList3;
    }

    public static final IntList3 mutableIntListOf(int i) {
        IntList3 intList3 = new IntList3(1);
        intList3.add(i);
        return intList3;
    }
}
