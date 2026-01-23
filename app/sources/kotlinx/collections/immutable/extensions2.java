package kotlinx.collections.immutable;

import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.ImmutableMap3;
import kotlinx.collections.immutable.ImmutableSet3;
import kotlinx.collections.immutable.implementations.immutableList.UtilsKt;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder;
import kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet;
import kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetBuilder;

/* compiled from: extensions.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a4\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a4\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0007\u001a4\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\t\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n\"\u00028\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u000b\u0010\r\u001a-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n\"\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u000e\u0010\u0010\u001aQ\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0015\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\u00122*\u0010\u0014\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00130\n\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017\u001a%\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0015\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\u0012¢\u0006\u0004\b\u0016\u0010\u0018\u001a#\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u0019*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a#\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u0019*\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u001b\u0010\u001d\u001a#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0019*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0019*\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u001e\u0010 \u001a#\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!\"\u0004\b\u0000\u0010\u0019*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\"\u0010#\u001a#\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0019*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b$\u0010%\u001a5\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\u0012*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&¢\u0006\u0004\b(\u0010)\u001a5\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0015\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\u0012*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&¢\u0006\u0004\b*\u0010+¨\u0006,"}, m3636d2 = {"E", "Lkotlinx/collections/immutable/PersistentList;", "", "elements", "plus", "(Lkotlinx/collections/immutable/PersistentList;Ljava/lang/Iterable;)Lkotlinx/collections/immutable/PersistentList;", "Lkotlin/sequences/Sequence;", "(Lkotlinx/collections/immutable/PersistentList;Lkotlin/sequences/Sequence;)Lkotlinx/collections/immutable/PersistentList;", "Lkotlinx/collections/immutable/PersistentSet;", "(Lkotlinx/collections/immutable/PersistentSet;Ljava/lang/Iterable;)Lkotlinx/collections/immutable/PersistentSet;", "", "persistentListOf", "([Ljava/lang/Object;)Lkotlinx/collections/immutable/PersistentList;", "()Lkotlinx/collections/immutable/PersistentList;", "persistentSetOf", "([Ljava/lang/Object;)Lkotlinx/collections/immutable/PersistentSet;", "()Lkotlinx/collections/immutable/PersistentSet;", "K", "V", "Lkotlin/Pair;", "pairs", "Lkotlinx/collections/immutable/PersistentMap;", "persistentMapOf", "([Lkotlin/Pair;)Lkotlinx/collections/immutable/PersistentMap;", "()Lkotlinx/collections/immutable/PersistentMap;", "T", "Lkotlinx/collections/immutable/ImmutableList;", "toImmutableList", "(Ljava/lang/Iterable;)Lkotlinx/collections/immutable/ImmutableList;", "(Lkotlin/sequences/Sequence;)Lkotlinx/collections/immutable/ImmutableList;", "toPersistentList", "(Ljava/lang/Iterable;)Lkotlinx/collections/immutable/PersistentList;", "(Lkotlin/sequences/Sequence;)Lkotlinx/collections/immutable/PersistentList;", "Lkotlinx/collections/immutable/ImmutableSet;", "toImmutableSet", "(Ljava/lang/Iterable;)Lkotlinx/collections/immutable/ImmutableSet;", "toPersistentSet", "(Ljava/lang/Iterable;)Lkotlinx/collections/immutable/PersistentSet;", "", "Lkotlinx/collections/immutable/ImmutableMap;", "toImmutableMap", "(Ljava/util/Map;)Lkotlinx/collections/immutable/ImmutableMap;", "toPersistentMap", "(Ljava/util/Map;)Lkotlinx/collections/immutable/PersistentMap;", "kotlinx-collections-immutable"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.collections.immutable.ExtensionsKt, reason: use source file name */
/* loaded from: classes23.dex */
public final class extensions2 {
    public static final <E> ImmutableList3<E> plus(ImmutableList3<? extends E> immutableList3, Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(immutableList3, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        ImmutableList3.Builder<? extends E> builder = immutableList3.builder();
        CollectionsKt.addAll(builder, elements);
        return builder.build();
    }

    public static final <E> ImmutableList3<E> plus(ImmutableList3<? extends E> immutableList3, Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(immutableList3, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            return immutableList3.addAll((Collection<? extends Object>) elements);
        }
        ImmutableList3.Builder<? extends E> builder = immutableList3.builder();
        CollectionsKt.addAll(builder, elements);
        return builder.build();
    }

    public static final <E> ImmutableSet3<E> plus(ImmutableSet3<? extends E> immutableSet3, Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(immutableSet3, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            return immutableSet3.addAll((Collection<? extends Object>) elements);
        }
        ImmutableSet3.Builder<? extends E> builder = immutableSet3.builder();
        CollectionsKt.addAll(builder, elements);
        return builder.build();
    }

    public static final <E> ImmutableList3<E> persistentListOf(E... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return UtilsKt.persistentVectorOf().addAll((Collection) ArraysKt.asList(elements));
    }

    public static final <E> ImmutableList3<E> persistentListOf() {
        return UtilsKt.persistentVectorOf();
    }

    public static final <E> ImmutableSet3<E> persistentSetOf(E... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return PersistentOrderedSet.INSTANCE.emptyOf$kotlinx_collections_immutable().addAll((Collection) ArraysKt.asList(elements));
    }

    public static final <E> ImmutableSet3<E> persistentSetOf() {
        return PersistentOrderedSet.INSTANCE.emptyOf$kotlinx_collections_immutable();
    }

    public static final <K, V> ImmutableMap3<K, V> persistentMapOf(Tuples2<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        PersistentOrderedMap<K, V> persistentOrderedMapEmptyOf$kotlinx_collections_immutable = PersistentOrderedMap.INSTANCE.emptyOf$kotlinx_collections_immutable();
        Intrinsics.checkNotNull(persistentOrderedMapEmptyOf$kotlinx_collections_immutable, "null cannot be cast to non-null type kotlinx.collections.immutable.PersistentMap<K of kotlinx.collections.immutable.ExtensionsKt.mutate, V of kotlinx.collections.immutable.ExtensionsKt.mutate>");
        ImmutableMap3.Builder<K, V> builder = persistentOrderedMapEmptyOf$kotlinx_collections_immutable.builder();
        MapsKt.putAll(builder, pairs);
        return builder.build();
    }

    public static final <K, V> ImmutableMap3<K, V> persistentMapOf() {
        return PersistentOrderedMap.INSTANCE.emptyOf$kotlinx_collections_immutable();
    }

    public static final <T> ImmutableList<T> toImmutableList(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ImmutableList<T> immutableList = iterable instanceof ImmutableList ? (ImmutableList) iterable : null;
        return immutableList == null ? toPersistentList(iterable) : immutableList;
    }

    public static final <T> ImmutableList<T> toImmutableList(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return toPersistentList(sequence);
    }

    public static final <T> ImmutableList3<T> toPersistentList(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ImmutableList3<T> immutableList3 = iterable instanceof ImmutableList3 ? (ImmutableList3) iterable : null;
        if (immutableList3 != null) {
            return immutableList3;
        }
        ImmutableList3.Builder builder = iterable instanceof ImmutableList3.Builder ? (ImmutableList3.Builder) iterable : null;
        ImmutableList3<T> immutableList3Build = builder != null ? builder.build() : null;
        return immutableList3Build == null ? plus(persistentListOf(), iterable) : immutableList3Build;
    }

    public static final <T> ImmutableList3<T> toPersistentList(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return plus(persistentListOf(), sequence);
    }

    public static final <T> ImmutableSet<T> toImmutableSet(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ImmutableSet<T> immutableSet = iterable instanceof ImmutableSet ? (ImmutableSet) iterable : null;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet3.Builder builder = iterable instanceof ImmutableSet3.Builder ? (ImmutableSet3.Builder) iterable : null;
        ImmutableSet3 immutableSet3Build = builder != null ? builder.build() : null;
        return immutableSet3Build != null ? immutableSet3Build : plus(persistentSetOf(), iterable);
    }

    public static final <T> ImmutableSet3<T> toPersistentSet(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        PersistentOrderedSet persistentOrderedSet = iterable instanceof PersistentOrderedSet ? (PersistentOrderedSet) iterable : null;
        if (persistentOrderedSet != null) {
            return persistentOrderedSet;
        }
        PersistentOrderedSetBuilder persistentOrderedSetBuilder = iterable instanceof PersistentOrderedSetBuilder ? (PersistentOrderedSetBuilder) iterable : null;
        ImmutableSet3<T> immutableSet3Build = persistentOrderedSetBuilder != null ? persistentOrderedSetBuilder.build() : null;
        return immutableSet3Build == null ? plus(PersistentOrderedSet.INSTANCE.emptyOf$kotlinx_collections_immutable(), iterable) : immutableSet3Build;
    }

    public static final <K, V> ImmutableMap<K, V> toImmutableMap(Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        ImmutableMap<K, V> immutableMap = map instanceof ImmutableMap ? (ImmutableMap) map : null;
        if (immutableMap != null) {
            return immutableMap;
        }
        ImmutableMap3.Builder builder = map instanceof ImmutableMap3.Builder ? (ImmutableMap3.Builder) map : null;
        ImmutableMap3<K, V> immutableMap3Build = builder != null ? builder.build() : null;
        return immutableMap3Build != null ? immutableMap3Build : persistentMapOf().putAll((Map) map);
    }

    public static final <K, V> ImmutableMap3<K, V> toPersistentMap(Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        PersistentOrderedMap persistentOrderedMap = map instanceof PersistentOrderedMap ? (PersistentOrderedMap) map : null;
        if (persistentOrderedMap != null) {
            return persistentOrderedMap;
        }
        PersistentOrderedMapBuilder persistentOrderedMapBuilder = map instanceof PersistentOrderedMapBuilder ? (PersistentOrderedMapBuilder) map : null;
        ImmutableMap3<K, V> immutableMap3Build = persistentOrderedMapBuilder != null ? persistentOrderedMapBuilder.build() : null;
        return immutableMap3Build == null ? PersistentOrderedMap.INSTANCE.emptyOf$kotlinx_collections_immutable().putAll((Map) map) : immutableMap3Build;
    }
}
