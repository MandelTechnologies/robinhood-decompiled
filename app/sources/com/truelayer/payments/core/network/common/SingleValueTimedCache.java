package com.truelayer.payments.core.network.common;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SingleValueTimedCache.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0011R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/truelayer/payments/core/network/common/SingleValueTimedCache;", "T", "Lcom/truelayer/payments/core/network/common/SingleValueCache;", "duration", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "(JLjava/util/concurrent/TimeUnit;)V", "cache", "Lcom/truelayer/payments/core/network/common/TimedCache;", "key", "", "get", "()Ljava/lang/Object;", "put", "", "value", "(Ljava/lang/Object;)V", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class SingleValueTimedCache<T> implements SingleValueTimedCache2<T> {
    private final TimedCache<T> cache;
    private final String key;

    public SingleValueTimedCache() {
        this(0L, null, 3, null);
    }

    public SingleValueTimedCache(long j, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.cache = TimedCache.INSTANCE.expiringEvery(j, timeUnit);
        this.key = "VALUE";
    }

    public /* synthetic */ SingleValueTimedCache(long j, TimeUnit timeUnit, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Long.MAX_VALUE : j, (i & 2) != 0 ? TimeUnit.MILLISECONDS : timeUnit);
    }

    @Override // com.truelayer.payments.core.network.common.SingleValueTimedCache2
    public T get() {
        return this.cache.get(this.key);
    }

    @Override // com.truelayer.payments.core.network.common.SingleValueTimedCache2
    public void put(T value) {
        this.cache.put(this.key, value);
    }
}
