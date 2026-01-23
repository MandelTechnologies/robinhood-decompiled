package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.functions.Function0;

/* compiled from: storage.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues, reason: use source file name */
/* loaded from: classes21.dex */
public interface storage<K, V> {
    V computeIfAbsent(K k, Function0<? extends V> function0);
}
