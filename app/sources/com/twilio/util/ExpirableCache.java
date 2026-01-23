package com.twilio.util;

import io.ktor.util.date.DateJvm;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ExpirableCache.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0002\u0010\u0011J\u0018\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0010\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0002\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019J'\u0010\u001a\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00028\u00002\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001cH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, m3636d2 = {"Lcom/twilio/util/ExpirableCache;", "K", "V", "", "flushInterval", "", "<init>", "(J)V", "map", "", "lastFlushTime", "size", "", "getSize", "()I", "remove", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "get", "set", "", "value", "(Ljava/lang/Object;Ljava/lang/Object;)V", "putAll", "items", "", "getOrPut", "getValue", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "recycle", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ExpirableCache<K, V> {
    private final long flushInterval;
    private long lastFlushTime;
    private final Map<K, V> map;

    public ExpirableCache() {
        this(0L, 1, null);
    }

    public ExpirableCache(long j) {
        this.flushInterval = j;
        this.map = new LinkedHashMap();
        this.lastFlushTime = DateJvm.getTimeMillis();
    }

    public /* synthetic */ ExpirableCache(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 60000L : j);
    }

    public final int getSize() {
        recycle();
        return this.map.size();
    }

    public final V remove(K key) {
        recycle();
        return this.map.remove(key);
    }

    public final V get(K key) {
        recycle();
        return this.map.get(key);
    }

    public final void set(K key, V value) {
        recycle();
        this.map.put(key, value);
    }

    public final void putAll(Map<K, ? extends V> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        recycle();
        this.map.putAll(items);
    }

    public final V getOrPut(K key, Function0<? extends V> getValue) {
        Intrinsics.checkNotNullParameter(getValue, "getValue");
        V v = get(key);
        if (v != null) {
            return v;
        }
        V vInvoke = getValue.invoke();
        this.map.put(key, vInvoke);
        return vInvoke;
    }

    private final void recycle() {
        if (DateJvm.getTimeMillis() - this.lastFlushTime >= this.flushInterval) {
            this.map.clear();
            this.lastFlushTime = DateJvm.getTimeMillis();
        }
    }
}
