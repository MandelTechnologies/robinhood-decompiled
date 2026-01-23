package com.twilio.util;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMarkers;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicFU4;

/* compiled from: CopyOnWriteMap.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004B\u001b\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\u0006J\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004J\u0015\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010 J\u0015\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010 J\u0018\u0010#\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u001eH\u0016J\u001d\u0010&\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010\"\u001a\u00028\u0001¢\u0006\u0002\u0010'J)\u0010(\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001f\u001a\u00028\u00002\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010*H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010+J\u0015\u0010,\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001f\u001a\u00028\u0000¢\u0006\u0002\u0010$J \u0010-\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010\"\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0002\u0010'R&\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR.\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u000f8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006."}, m3636d2 = {"Lcom/twilio/util/CopyOnWriteMap;", "K", "", "V", "", "initWith", "(Ljava/util/Map;)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "map", "Lkotlinx/atomicfu/AtomicRef;", "getMap$annotations", "()V", "getMap", "()Lkotlinx/atomicfu/AtomicRef;", "size", "", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "clear", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putIfAbsent", "getValue", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "remove", "set", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class CopyOnWriteMap<K, V> implements Map<K, V>, KMarkers {
    private final AtomicFU4<Map<K, V>> map;

    /* JADX WARN: Multi-variable type inference failed */
    public CopyOnWriteMap() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @PublishedApi
    public static /* synthetic */ void getMap$annotations() {
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V computeIfAbsent(K k, Function<? super K, ? extends V> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V putIfAbsent(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V replace(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean replace(K k, V v, V v2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public CopyOnWriteMap(Map<K, ? extends V> initWith) {
        Intrinsics.checkNotNullParameter(initWith, "initWith");
        this.map = AtomicFU.atomic(MapsKt.toMap(initWith));
    }

    public /* synthetic */ CopyOnWriteMap(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt.emptyMap() : map);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    public final AtomicFU4<Map<K, V>> getMap() {
        return this.map;
    }

    public Set<Map.Entry<K, V>> getEntries() {
        return this.map.getValue().entrySet();
    }

    public Set<K> getKeys() {
        return this.map.getValue().keySet();
    }

    public int getSize() {
        return this.map.getValue().size();
    }

    public Collection<V> getValues() {
        return this.map.getValue().values();
    }

    @Override // java.util.Map
    public final Map<K, V> clear() {
        return this.map.getAndSet(MapsKt.emptyMap());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.map.getValue().isEmpty();
    }

    @Override // java.util.Map
    public final V remove(K key) {
        Map<K, V> value;
        Map<K, V> mutableMap;
        V vRemove;
        if (key == null) {
            return null;
        }
        do {
            value = this.map.getValue();
            if (!value.containsKey(key)) {
                return null;
            }
            mutableMap = MapsKt.toMutableMap(value);
            vRemove = mutableMap.remove(key);
        } while (!this.map.compareAndSet(value, mutableMap));
        return vRemove;
    }

    @Override // java.util.Map
    public final V put(K key, V value) {
        Map<K, V> value2;
        Map<K, V> mutableMap;
        V vPut;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        do {
            value2 = this.map.getValue();
            mutableMap = MapsKt.toMutableMap(value2);
            vPut = mutableMap.put(key, value);
        } while (!this.map.compareAndSet(value2, mutableMap));
        return vPut;
    }

    public final V putIfAbsent(K key, Function0<? extends V> getValue) {
        Map<K, V> value;
        Map<K, V> mutableMap;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(getValue, "getValue");
        V vInvoke = null;
        do {
            value = getMap().getValue();
            if (value.containsKey(key)) {
                return null;
            }
            if (vInvoke == null) {
                vInvoke = getValue.invoke();
            }
            mutableMap = MapsKt.toMutableMap(value);
            mutableMap.put(key, vInvoke);
        } while (!getMap().compareAndSet(value, mutableMap));
        return vInvoke;
    }

    public final V set(K key, V value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return put(key, value);
    }

    @Override // java.util.Map
    public V get(Object key) {
        if (key == null) {
            return null;
        }
        return this.map.getValue().get(key);
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        if (value == null) {
            return false;
        }
        return this.map.getValue().containsValue(value);
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        if (key == null) {
            return false;
        }
        return this.map.getValue().containsKey(key);
    }
}
