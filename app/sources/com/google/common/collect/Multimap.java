package com.google.common.collect;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes27.dex */
public interface Multimap<K, V> {
    Map<K, Collection<V>> asMap();

    void clear();

    boolean containsEntry(Object key, Object value);

    Collection<Map.Entry<K, V>> entries();

    Collection<V> get(K key);

    boolean put(K key, V value);

    boolean remove(Object key, Object value);

    int size();

    Collection<V> values();
}
