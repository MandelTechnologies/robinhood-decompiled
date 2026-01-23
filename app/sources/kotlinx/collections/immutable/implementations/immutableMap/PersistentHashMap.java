package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.AbstractMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableCollection;
import kotlinx.collections.immutable.ImmutableMap3;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap2;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder;

/* compiled from: PersistentHashMap.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 2*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u00012B#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0014\u0010\u001c\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00132\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b$\u0010\u0015J\u000f\u0010%\u001a\u00020\u0007H\u0016¢\u0006\u0004\b%\u0010&R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010&R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u000eR\u001a\u00101\u001a\b\u0012\u0004\u0012\u00028\u00010.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00063"}, m3636d2 = {"Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "K", "V", "Lkotlin/collections/AbstractMap;", "Lkotlinx/collections/immutable/PersistentMap;", "Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "node", "", "size", "<init>", "(Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V", "Lkotlinx/collections/immutable/ImmutableSet;", "", "createEntries", "()Lkotlinx/collections/immutable/ImmutableSet;", "", "getEntries", "()Ljava/util/Set;", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "", "m", "putAll", "(Ljava/util/Map;)Lkotlinx/collections/immutable/PersistentMap;", "Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "builder", "()Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "", "other", "equals", "hashCode", "()I", "Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "getNode$kotlinx_collections_immutable", "()Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "I", "getSize", "getKeys", "keys", "Lkotlinx/collections/immutable/ImmutableCollection;", "getValues", "()Lkotlinx/collections/immutable/ImmutableCollection;", "values", "Companion", "kotlinx-collections-immutable"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class PersistentHashMap<K, V> extends AbstractMap<K, V> implements ImmutableMap3<K, V> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final PersistentHashMap EMPTY = new PersistentHashMap(TrieNode.INSTANCE.getEMPTY$kotlinx_collections_immutable(), 0);
    private final TrieNode<K, V> node;
    private final int size;

    public final TrieNode<K, V> getNode$kotlinx_collections_immutable() {
        return this.node;
    }

    public PersistentHashMap(TrieNode<K, V> node, int i) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.node = node;
        this.size = i;
    }

    @Override // kotlin.collections.AbstractMap
    public int getSize() {
        return this.size;
    }

    @Override // kotlin.collections.AbstractMap
    public ImmutableSet<K> getKeys() {
        return new PersistentHashMapContentViews5(this);
    }

    @Override // kotlin.collections.AbstractMap
    public ImmutableCollection<V> getValues() {
        return new PersistentHashMapContentViews6(this);
    }

    private final ImmutableSet<Map.Entry<K, V>> createEntries() {
        return new PersistentHashMapContentViews4(this);
    }

    @Override // kotlin.collections.AbstractMap
    @PublishedApi
    public final Set<Map.Entry<K, V>> getEntries() {
        return createEntries();
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public boolean containsKey(Object key) {
        return this.node.containsKey(key != null ? key.hashCode() : 0, key, 0);
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public V get(Object key) {
        return this.node.get(key != null ? key.hashCode() : 0, key, 0);
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public PersistentHashMap<K, V> put(K key, V value) {
        TrieNode.ModificationResult<K, V> modificationResultPut = this.node.put(key != null ? key.hashCode() : 0, key, value, 0);
        return modificationResultPut == null ? this : new PersistentHashMap<>(modificationResultPut.getNode(), size() + modificationResultPut.getSizeDelta());
    }

    @Override // java.util.Map, kotlinx.collections.immutable.ImmutableMap3
    public ImmutableMap3<K, V> putAll(Map<? extends K, ? extends V> m) {
        Intrinsics.checkNotNullParameter(m, "m");
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlinx.collections.immutable.PersistentMap<K of kotlinx.collections.immutable.ExtensionsKt.mutate, V of kotlinx.collections.immutable.ExtensionsKt.mutate>");
        ImmutableMap3.Builder<K, V> builder = builder();
        builder.putAll(m);
        return builder.build();
    }

    @Override // kotlinx.collections.immutable.ImmutableMap3
    public PersistentHashMapBuilder<K, V> builder() {
        return new PersistentHashMapBuilder<>(this);
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Map)) {
            return false;
        }
        Map map = (Map) other;
        if (size() != map.size()) {
            return false;
        }
        if (map instanceof PersistentOrderedMap) {
            return this.node.equalsWith$kotlinx_collections_immutable(((PersistentOrderedMap) other).getHashMap$kotlinx_collections_immutable().node, new Function2<V, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.equals.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Boolean invoke(Object obj, Object obj2) {
                    return invoke((C460401) obj, (PersistentOrderedMap2<? extends Object>) obj2);
                }

                public final Boolean invoke(V v, PersistentOrderedMap2<? extends Object> b) {
                    Intrinsics.checkNotNullParameter(b, "b");
                    return Boolean.valueOf(Intrinsics.areEqual(v, b.getValue()));
                }
            });
        }
        if (map instanceof PersistentOrderedMapBuilder) {
            return this.node.equalsWith$kotlinx_collections_immutable(((PersistentOrderedMapBuilder) other).getHashMapBuilder$kotlinx_collections_immutable().getNode$kotlinx_collections_immutable(), new Function2<V, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.equals.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Boolean invoke(Object obj, Object obj2) {
                    return invoke((C460412) obj, (PersistentOrderedMap2<? extends Object>) obj2);
                }

                public final Boolean invoke(V v, PersistentOrderedMap2<? extends Object> b) {
                    Intrinsics.checkNotNullParameter(b, "b");
                    return Boolean.valueOf(Intrinsics.areEqual(v, b.getValue()));
                }
            });
        }
        if (map instanceof PersistentHashMap) {
            return this.node.equalsWith$kotlinx_collections_immutable(((PersistentHashMap) other).node, new Function2<V, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.equals.3
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function2
                public final Boolean invoke(V v, Object obj) {
                    return Boolean.valueOf(Intrinsics.areEqual(v, obj));
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Boolean invoke(Object obj, Object obj2) {
                    return invoke((C460423) obj, obj2);
                }
            });
        }
        if (map instanceof PersistentHashMapBuilder) {
            return this.node.equalsWith$kotlinx_collections_immutable(((PersistentHashMapBuilder) other).getNode$kotlinx_collections_immutable(), new Function2<V, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.equals.4
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function2
                public final Boolean invoke(V v, Object obj) {
                    return Boolean.valueOf(Intrinsics.areEqual(v, obj));
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Boolean invoke(Object obj, Object obj2) {
                    return invoke((C460434) obj, obj2);
                }
            });
        }
        return super.equals(other);
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public int hashCode() {
        return super.hashCode();
    }

    /* compiled from: PersistentHashMap.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u0004\"\u0004\b\u0002\u0010\u0007\"\u0004\b\u0003\u0010\bH\u0000¢\u0006\u0002\b\tR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap$Companion;", "", "()V", "EMPTY", "Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "", "emptyOf", "K", "V", "emptyOf$kotlinx_collections_immutable", "kotlinx-collections-immutable"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <K, V> PersistentHashMap<K, V> emptyOf$kotlinx_collections_immutable() {
            PersistentHashMap<K, V> persistentHashMap = PersistentHashMap.EMPTY;
            Intrinsics.checkNotNull(persistentHashMap, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return persistentHashMap;
        }
    }
}
