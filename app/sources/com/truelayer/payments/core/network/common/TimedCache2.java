package com.truelayer.payments.core.network.common;

import kotlin.Metadata;

/* compiled from: TimedCache.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/truelayer/payments/core/network/common/Cache;", "T", "", "get", "key", "", "(Ljava/lang/String;)Ljava/lang/Object;", "put", "", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.core.network.common.Cache, reason: use source file name */
/* loaded from: classes6.dex */
public interface TimedCache2<T> {
    T get(String key);

    void put(String key, T value);
}
