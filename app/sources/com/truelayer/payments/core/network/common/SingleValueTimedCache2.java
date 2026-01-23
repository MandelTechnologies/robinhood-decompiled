package com.truelayer.payments.core.network.common;

import kotlin.Metadata;

/* compiled from: SingleValueTimedCache.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u000f\u0010\u0003\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/truelayer/payments/core/network/common/SingleValueCache;", "T", "", "get", "()Ljava/lang/Object;", "put", "", "value", "(Ljava/lang/Object;)V", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.core.network.common.SingleValueCache, reason: use source file name */
/* loaded from: classes6.dex */
public interface SingleValueTimedCache2<T> {
    T get();

    void put(T value);
}
