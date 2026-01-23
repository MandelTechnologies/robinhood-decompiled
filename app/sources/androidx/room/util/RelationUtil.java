package androidx.room.util;

import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(m3635d1 = {"androidx/room/util/RelationUtil__RelationUtilKt", "androidx/room/util/RelationUtil__RelationUtil_androidKt"}, m3637k = 4, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class RelationUtil {
    public static final <K, V> void recursiveFetchArrayMap(ArrayMap<K, V> arrayMap, boolean z, Function1<? super ArrayMap<K, V>, Unit> function1) {
        RelationUtil__RelationUtil_androidKt.recursiveFetchArrayMap(arrayMap, z, function1);
    }

    public static final <V> void recursiveFetchLongSparseArray(LongSparseArray<V> longSparseArray, boolean z, Function1<? super LongSparseArray<V>, Unit> function1) {
        RelationUtil2.recursiveFetchLongSparseArray(longSparseArray, z, function1);
    }
}
