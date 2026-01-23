package com.robinhood.utils.extensions;

import defpackage.C0007xc1408999;
import java.util.EnumMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Maps.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a}\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0001*\u00020\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u0002H\u000126\u0010\u0007\u001a2\u0012\u0013\u0012\u0011H\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00010\bH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\r\u001a|\u0010\u000e\u001a\u00020\u000f\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0001*\u00020\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u001126\u0010\u0007\u001a2\u0012\u0013\u0012\u0011H\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00010\bH\u0086\bø\u0001\u0000\u001a\u0081\u0001\u0010\u0012\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0001*\u00020\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\b\u0010\u0006\u001a\u0004\u0018\u0001H\u000126\u0010\u0007\u001a2\u0012\u0013\u0012\u0011H\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00010\bH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\r\u001a~\u0010\u0013\u001a\u00020\u000f\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0001*\u00020\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00042\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u001126\u0010\u0007\u001a2\u0012\u0013\u0012\u0011H\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00010\bH\u0086\bø\u0001\u0000\u001a@\u0010\u0015\u001a\u00020\u000f\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0001*\u00020\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00042\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0011\u001a^\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0017\"\u0010\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u0018\"\u0004\b\u0001\u0010\u00012*\u0010\u0019\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u001b0\u001a\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u001bH\u0086\b¢\u0006\u0002\u0010\u001c\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, m3636d2 = {"mergeEntry", "V", "K", "", "", "key", "value", "remappingFunction", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "oldValue", "newValue", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "mergeWith", "", "newValues", "", "mergeOrRemoveEntry", "mergeOrRemoveWith", "other", "update", "enumMapOf", "Ljava/util/EnumMap;", "", "pairs", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)Ljava/util/EnumMap;", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.extensions.MapsKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class Maps2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> V mergeEntry(Map<K, V> map, K key, V value, Function2<? super V, ? super V, ? extends V> remappingFunction) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(remappingFunction, "remappingFunction");
        C0007xc1408999 c0007xc1408999 = (Object) map.get(key);
        V vInvoke = value;
        if (c0007xc1408999 != null) {
            vInvoke = remappingFunction.invoke(c0007xc1408999, value);
        }
        map.put(key, vInvoke);
        return vInvoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> void mergeWith(Map<K, V> map, Map<K, ? extends V> newValues, Function2<? super V, ? super V, ? extends V> remappingFunction) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(newValues, "newValues");
        Intrinsics.checkNotNullParameter(remappingFunction, "remappingFunction");
        for (Map.Entry<K, ? extends V> entry : newValues.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            C0007xc1408999 c0007xc1408999 = (Object) map.get(key);
            if (c0007xc1408999 != null) {
                value = remappingFunction.invoke(c0007xc1408999, value);
            }
            map.put(key, value);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> V mergeOrRemoveEntry(Map<K, V> map, K key, V v, Function2<? super V, ? super V, ? extends V> remappingFunction) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(remappingFunction, "remappingFunction");
        if (v != 0) {
            C0007xc1408999 c0007xc1408999 = (Object) map.get(key);
            V vInvoke = v;
            if (c0007xc1408999 != null) {
                vInvoke = remappingFunction.invoke(c0007xc1408999, v);
            }
            map.put(key, vInvoke);
            return vInvoke;
        }
        map.remove(key);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> void mergeOrRemoveWith(Map<K, V> map, Map<K, ? extends V> other, Function2<? super V, ? super V, ? extends V> remappingFunction) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(remappingFunction, "remappingFunction");
        for (Map.Entry<K, ? extends V> entry : other.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (value != null) {
                C0007xc1408999 c0007xc1408999 = (Object) map.get(key);
                if (c0007xc1408999 != null) {
                    value = remappingFunction.invoke(c0007xc1408999, value);
                }
                map.put(key, value);
            } else {
                map.remove(key);
            }
        }
    }

    public static final <K, V> void update(Map<K, V> map, Map<K, ? extends V> other) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        for (Map.Entry<K, ? extends V> entry : other.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (value != null) {
                map.get(key);
                map.put(key, value);
            } else {
                map.remove(key);
            }
        }
    }

    public static final /* synthetic */ <K extends Enum<K>, V> EnumMap<K, V> enumMapOf(Tuples2<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        Intrinsics.reifiedOperationMarker(4, "K");
        EnumMap<K, V> enumMap = new EnumMap<>(Enum.class);
        kotlin.collections.MapsKt.putAll(enumMap, pairs);
        return enumMap;
    }
}
