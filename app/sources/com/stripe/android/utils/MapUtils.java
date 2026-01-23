package com.stripe.android.utils;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MapUtils.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\u001a2\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0001H\u0007¨\u0006\u0004"}, m3636d2 = {"filterNotNullValues", "", "K", "V", "payments-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.stripe.android.utils.MapUtilsKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class MapUtils {
    public static final <K, V> Map<K, V> filterNotNullValues(Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            Tuples2 tuples2M3642to = value != null ? Tuples4.m3642to(key, value) : null;
            if (tuples2M3642to != null) {
                arrayList.add(tuples2M3642to);
            }
        }
        return MapsKt.toMap(arrayList);
    }
}
