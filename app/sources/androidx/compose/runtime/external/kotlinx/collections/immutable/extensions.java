package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: extensions.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\bH\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "persistentListOf", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "persistentSetOf", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "persistentHashMapOf", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "runtime_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt, reason: use source file name */
/* loaded from: classes.dex */
public final class extensions {
    public static final <E> ImmutableList2<E> persistentListOf() {
        return UtilsKt.persistentVectorOf();
    }

    public static final <E> ImmutableSet2<E> persistentSetOf() {
        return PersistentOrderedSet.INSTANCE.emptyOf$runtime_release();
    }

    public static final <K, V> ImmutableMap2<K, V> persistentHashMapOf() {
        return PersistentHashMap.INSTANCE.emptyOf$runtime_release();
    }
}
