package com.truelayer.payments.core.network.common;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TimedCache.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u0011*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002\u0011\u0012B\u0005¢\u0006\u0002\u0010\u0003J\u0017\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\fJ\u001d\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/truelayer/payments/core/network/common/TimedCache;", "T", "Lcom/truelayer/payments/core/network/common/Cache;", "()V", "cacheTimeValidityInMillis", "", "hashMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/truelayer/payments/core/network/common/TimedCache$TimedEntry;", "get", "key", "(Ljava/lang/String;)Ljava/lang/Object;", "put", "", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "Companion", "TimedEntry", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class TimedCache<T> implements TimedCache2<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long cacheTimeValidityInMillis = Long.MAX_VALUE;
    private final ConcurrentHashMap<String, TimedEntry<T>> hashMap = new ConcurrentHashMap<>();

    /* compiled from: TimedCache.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m3636d2 = {"Lcom/truelayer/payments/core/network/common/TimedCache$Companion;", "", "()V", "expiringEvery", "Lcom/truelayer/payments/core/network/common/TimedCache;", "T", "duration", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T> TimedCache<T> expiringEvery(long duration, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            TimedCache<T> timedCache = new TimedCache<>();
            ((TimedCache) timedCache).cacheTimeValidityInMillis = TimeUnit.MILLISECONDS.convert(duration, timeUnit);
            return timedCache;
        }
    }

    @Override // com.truelayer.payments.core.network.common.TimedCache2
    public T get(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        TimedEntry<T> timedEntry = this.hashMap.get(key);
        if (timedEntry == null || timedEntry.isExpired()) {
            return null;
        }
        return timedEntry.getValue();
    }

    @Override // com.truelayer.payments.core.network.common.TimedCache2
    public void put(String key, T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.hashMap.put(key, new TimedEntry<>(value, this.cacheTimeValidityInMillis));
    }

    /* compiled from: TimedCache.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0006\u0010\u0016\u001a\u00020\u0012J\b\u0010\u0017\u001a\u00020\u0005H\u0002J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, m3636d2 = {"Lcom/truelayer/payments/core/network/common/TimedCache$TimedEntry;", "T", "", "value", "maxDurationInMillis", "", "(Ljava/lang/Object;J)V", "creationTime", "getMaxDurationInMillis", "()J", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(Ljava/lang/Object;J)Lcom/truelayer/payments/core/network/common/TimedCache$TimedEntry;", "equals", "", "other", "hashCode", "", "isExpired", "now", "toString", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class TimedEntry<T> {
        private final long creationTime = now();
        private final long maxDurationInMillis;
        private final T value;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TimedEntry copy$default(TimedEntry timedEntry, Object obj, long j, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = timedEntry.value;
            }
            if ((i & 2) != 0) {
                j = timedEntry.maxDurationInMillis;
            }
            return timedEntry.copy(obj, j);
        }

        public final T component1() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final long getMaxDurationInMillis() {
            return this.maxDurationInMillis;
        }

        public final TimedEntry<T> copy(T value, long maxDurationInMillis) {
            return new TimedEntry<>(value, maxDurationInMillis);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimedEntry)) {
                return false;
            }
            TimedEntry timedEntry = (TimedEntry) other;
            return Intrinsics.areEqual(this.value, timedEntry.value) && this.maxDurationInMillis == timedEntry.maxDurationInMillis;
        }

        public int hashCode() {
            T t = this.value;
            return ((t == null ? 0 : t.hashCode()) * 31) + Long.hashCode(this.maxDurationInMillis);
        }

        public String toString() {
            return "TimedEntry(value=" + this.value + ", maxDurationInMillis=" + this.maxDurationInMillis + ")";
        }

        public TimedEntry(T t, long j) {
            this.value = t;
            this.maxDurationInMillis = j;
        }

        public final long getMaxDurationInMillis() {
            return this.maxDurationInMillis;
        }

        public final T getValue() {
            return this.value;
        }

        public final boolean isExpired() {
            return now() - this.creationTime > this.maxDurationInMillis;
        }

        private final long now() {
            return System.currentTimeMillis();
        }
    }
}
