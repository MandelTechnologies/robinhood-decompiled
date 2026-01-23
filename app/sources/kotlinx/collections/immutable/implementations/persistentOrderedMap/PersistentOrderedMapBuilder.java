package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableMap3;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import kotlinx.collections.immutable.internal.EndOfChain;
import kotlinx.collections.immutable.internal.MapImplementation;
import kotlinx.collections.immutable.internal.commonFunctions2;

/* compiled from: PersistentOrderedMapBuilder.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0014\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0016J\b\u0010$\u001a\u00020%H\u0016J\u0015\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020'2\b\u0010+\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\u0018\u0010,\u001a\u0004\u0018\u00018\u00012\u0006\u0010(\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010-J\b\u0010.\u001a\u00020\u001bH\u0016J\u001f\u0010/\u001a\u0004\u0018\u00018\u00012\u0006\u0010(\u001a\u00028\u00002\u0006\u00100\u001a\u00028\u0001H\u0016¢\u0006\u0002\u00101J\u0017\u00102\u001a\u0004\u0018\u00018\u00012\u0006\u0010(\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010-J\u001b\u00102\u001a\u00020'2\u0006\u0010(\u001a\u00028\u00002\u0006\u00100\u001a\u00028\u0001¢\u0006\u0002\u00103R&\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R&\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00140\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\fR\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u00064"}, m3636d2 = {"Lkotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "K", "V", "Lkotlin/collections/AbstractMutableMap;", "Lkotlinx/collections/immutable/PersistentMap$Builder;", "map", "Lkotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "(Lkotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "<set-?>", "", "firstKey", "getFirstKey$kotlinx_collections_immutable", "()Ljava/lang/Object;", "hashMapBuilder", "Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "Lkotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "getHashMapBuilder$kotlinx_collections_immutable", "()Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "keys", "getKeys", "lastKey", "size", "", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "build", "Lkotlinx/collections/immutable/PersistentMap;", "clear", "", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "equals", "other", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "kotlinx-collections-immutable"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class PersistentOrderedMapBuilder<K, V> extends AbstractMutableMap<K, V> implements ImmutableMap3.Builder<K, V> {
    private Object firstKey;
    private final PersistentHashMapBuilder<K, PersistentOrderedMap2<V>> hashMapBuilder;
    private Object lastKey;
    private PersistentOrderedMap<K, V> map;

    public PersistentOrderedMapBuilder(PersistentOrderedMap<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.map = map;
        this.firstKey = map.getFirstKey();
        this.lastKey = this.map.getLastKey();
        this.hashMapBuilder = this.map.getHashMap$kotlinx_collections_immutable().builder();
    }

    /* renamed from: getFirstKey$kotlinx_collections_immutable, reason: from getter */
    public final Object getFirstKey() {
        return this.firstKey;
    }

    public final PersistentHashMapBuilder<K, PersistentOrderedMap2<V>> getHashMapBuilder$kotlinx_collections_immutable() {
        return this.hashMapBuilder;
    }

    @Override // kotlin.collections.AbstractMutableMap
    public int getSize() {
        return this.hashMapBuilder.size();
    }

    @Override // kotlinx.collections.immutable.ImmutableMap3.Builder
    public ImmutableMap3<K, V> build() {
        PersistentOrderedMap<K, V> persistentOrderedMap;
        PersistentHashMap<K, PersistentOrderedMap2<V>> persistentHashMapBuild = this.hashMapBuilder.build();
        if (persistentHashMapBuild == this.map.getHashMap$kotlinx_collections_immutable()) {
            commonFunctions2.m28783assert(this.firstKey == this.map.getFirstKey());
            commonFunctions2.m28783assert(this.lastKey == this.map.getLastKey());
            persistentOrderedMap = this.map;
        } else {
            persistentOrderedMap = new PersistentOrderedMap<>(this.firstKey, this.lastKey, persistentHashMapBuild);
        }
        this.map = persistentOrderedMap;
        return persistentOrderedMap;
    }

    @Override // kotlin.collections.AbstractMutableMap
    public Set<Map.Entry<K, V>> getEntries() {
        return new PersistentOrderedMapBuilderContentViews(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public Set<K> getKeys() {
        return new PersistentOrderedMapBuilderContentViews2(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public Collection<V> getValues() {
        return new PersistentOrderedMapBuilderContentViews3(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object key) {
        return this.hashMapBuilder.containsKey(key);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object key) {
        PersistentOrderedMap2<V> persistentOrderedMap2 = this.hashMapBuilder.get(key);
        if (persistentOrderedMap2 != null) {
            return persistentOrderedMap2.getValue();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V put(K key, V value) {
        PersistentOrderedMap2<V> persistentOrderedMap2 = this.hashMapBuilder.get(key);
        if (persistentOrderedMap2 != null) {
            if (persistentOrderedMap2.getValue() == value) {
                return value;
            }
            this.hashMapBuilder.put(key, persistentOrderedMap2.withValue(value));
            return persistentOrderedMap2.getValue();
        }
        if (isEmpty()) {
            this.firstKey = key;
            this.lastKey = key;
            this.hashMapBuilder.put(key, new PersistentOrderedMap2<>(value));
            return null;
        }
        Object obj = this.lastKey;
        PersistentOrderedMap2<V> persistentOrderedMap22 = this.hashMapBuilder.get(obj);
        Intrinsics.checkNotNull(persistentOrderedMap22);
        commonFunctions2.m28783assert(!r2.getHasNext());
        this.hashMapBuilder.put(obj, persistentOrderedMap22.withNext(key));
        this.hashMapBuilder.put(key, new PersistentOrderedMap2<>(value, obj));
        this.lastKey = key;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object key) {
        PersistentOrderedMap2<V> persistentOrderedMap2Remove = this.hashMapBuilder.remove(key);
        if (persistentOrderedMap2Remove == null) {
            return null;
        }
        if (persistentOrderedMap2Remove.getHasPrevious()) {
            PersistentOrderedMap2<V> persistentOrderedMap2 = this.hashMapBuilder.get(persistentOrderedMap2Remove.getPrevious());
            Intrinsics.checkNotNull(persistentOrderedMap2);
            this.hashMapBuilder.put(persistentOrderedMap2Remove.getPrevious(), persistentOrderedMap2.withNext(persistentOrderedMap2Remove.getNext()));
        } else {
            this.firstKey = persistentOrderedMap2Remove.getNext();
        }
        if (persistentOrderedMap2Remove.getHasNext()) {
            PersistentOrderedMap2<V> persistentOrderedMap22 = this.hashMapBuilder.get(persistentOrderedMap2Remove.getNext());
            Intrinsics.checkNotNull(persistentOrderedMap22);
            this.hashMapBuilder.put(persistentOrderedMap2Remove.getNext(), persistentOrderedMap22.withPrevious(persistentOrderedMap2Remove.getPrevious()));
        } else {
            this.lastKey = persistentOrderedMap2Remove.getPrevious();
        }
        return persistentOrderedMap2Remove.getValue();
    }

    @Override // java.util.Map
    public final boolean remove(Object key, Object value) {
        PersistentOrderedMap2<V> persistentOrderedMap2 = this.hashMapBuilder.get(key);
        if (persistentOrderedMap2 == null || !Intrinsics.areEqual(persistentOrderedMap2.getValue(), value)) {
            return false;
        }
        remove(key);
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.hashMapBuilder.clear();
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        this.firstKey = endOfChain;
        this.lastKey = endOfChain;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Map)) {
            return false;
        }
        Map<?, ?> map = (Map) other;
        if (size() != map.size()) {
            return false;
        }
        if (map instanceof PersistentOrderedMap) {
            return this.hashMapBuilder.getNode$kotlinx_collections_immutable().equalsWith$kotlinx_collections_immutable(((PersistentOrderedMap) other).getHashMap$kotlinx_collections_immutable().getNode$kotlinx_collections_immutable(), new Function2<PersistentOrderedMap2<V>, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder.equals.1
                @Override // kotlin.jvm.functions.Function2
                public final Boolean invoke(PersistentOrderedMap2<V> a, PersistentOrderedMap2<? extends Object> b) {
                    Intrinsics.checkNotNullParameter(a, "a");
                    Intrinsics.checkNotNullParameter(b, "b");
                    return Boolean.valueOf(Intrinsics.areEqual(a.getValue(), b.getValue()));
                }
            });
        }
        if (map instanceof PersistentOrderedMapBuilder) {
            return this.hashMapBuilder.getNode$kotlinx_collections_immutable().equalsWith$kotlinx_collections_immutable(((PersistentOrderedMapBuilder) other).hashMapBuilder.getNode$kotlinx_collections_immutable(), new Function2<PersistentOrderedMap2<V>, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder.equals.2
                @Override // kotlin.jvm.functions.Function2
                public final Boolean invoke(PersistentOrderedMap2<V> a, PersistentOrderedMap2<? extends Object> b) {
                    Intrinsics.checkNotNullParameter(a, "a");
                    Intrinsics.checkNotNullParameter(b, "b");
                    return Boolean.valueOf(Intrinsics.areEqual(a.getValue(), b.getValue()));
                }
            });
        }
        if (map instanceof PersistentHashMap) {
            return this.hashMapBuilder.getNode$kotlinx_collections_immutable().equalsWith$kotlinx_collections_immutable(((PersistentHashMap) other).getNode$kotlinx_collections_immutable(), new Function2<PersistentOrderedMap2<V>, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder.equals.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Boolean invoke(Object obj, Object obj2) {
                    return invoke((PersistentOrderedMap2) obj, (Object) obj2);
                }

                public final Boolean invoke(PersistentOrderedMap2<V> a, Object obj) {
                    Intrinsics.checkNotNullParameter(a, "a");
                    return Boolean.valueOf(Intrinsics.areEqual(a.getValue(), obj));
                }
            });
        }
        if (map instanceof PersistentHashMapBuilder) {
            return this.hashMapBuilder.getNode$kotlinx_collections_immutable().equalsWith$kotlinx_collections_immutable(((PersistentHashMapBuilder) other).getNode$kotlinx_collections_immutable(), new Function2<PersistentOrderedMap2<V>, ?, Boolean>() { // from class: kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder.equals.4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Boolean invoke(Object obj, Object obj2) {
                    return invoke((PersistentOrderedMap2) obj, (Object) obj2);
                }

                public final Boolean invoke(PersistentOrderedMap2<V> a, Object obj) {
                    Intrinsics.checkNotNullParameter(a, "a");
                    return Boolean.valueOf(Intrinsics.areEqual(a.getValue(), obj));
                }
            });
        }
        return MapImplementation.INSTANCE.equals$kotlinx_collections_immutable(this, map);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return MapImplementation.INSTANCE.hashCode$kotlinx_collections_immutable(this);
    }
}
