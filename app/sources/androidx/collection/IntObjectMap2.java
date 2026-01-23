package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IntObjectMap.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aI\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u000f\"\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"V", "Landroidx/collection/IntObjectMap;", "emptyIntObjectMap", "()Landroidx/collection/IntObjectMap;", "intObjectMapOf", "Landroidx/collection/MutableIntObjectMap;", "mutableIntObjectMapOf", "()Landroidx/collection/MutableIntObjectMap;", "", "key1", "value1", "key2", "value2", "key3", "value3", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "", "EmptyIntObjectMap", "Landroidx/collection/MutableIntObjectMap;", "collection"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.collection.IntObjectMapKt, reason: use source file name */
/* loaded from: classes.dex */
public final class IntObjectMap2 {
    private static final IntObjectMap3 EmptyIntObjectMap = new IntObjectMap3(0);

    public static final <V> IntObjectMap<V> emptyIntObjectMap() {
        IntObjectMap3 intObjectMap3 = EmptyIntObjectMap;
        Intrinsics.checkNotNull(intObjectMap3, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
        return intObjectMap3;
    }

    public static final <V> IntObjectMap<V> intObjectMapOf() {
        IntObjectMap3 intObjectMap3 = EmptyIntObjectMap;
        Intrinsics.checkNotNull(intObjectMap3, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        return intObjectMap3;
    }

    public static final <V> IntObjectMap3<V> mutableIntObjectMapOf() {
        return new IntObjectMap3<>(0, 1, null);
    }

    public static final <V> IntObjectMap3<V> mutableIntObjectMapOf(int i, V v, int i2, V v2, int i3, V v3) {
        IntObjectMap3<V> intObjectMap3 = new IntObjectMap3<>(0, 1, null);
        intObjectMap3.set(i, v);
        intObjectMap3.set(i2, v2);
        intObjectMap3.set(i3, v3);
        return intObjectMap3;
    }
}
