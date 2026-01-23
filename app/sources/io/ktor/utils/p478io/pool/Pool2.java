package io.ktor.utils.p478io.pool;

import io.ktor.utils.p478io.pool.Pool3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Pool.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u0005¨\u0006\u000b"}, m3636d2 = {"Lio/ktor/utils/io/pool/NoPoolImpl;", "", "T", "Lio/ktor/utils/io/pool/ObjectPool;", "<init>", "()V", "instance", "", "recycle", "(Ljava/lang/Object;)V", "dispose", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.utils.io.pool.NoPoolImpl, reason: use source file name */
/* loaded from: classes14.dex */
public abstract class Pool2<T> implements Pool3<T> {
    @Override // io.ktor.utils.p478io.pool.Pool3
    public void dispose() {
    }

    @Override // io.ktor.utils.p478io.pool.Pool3
    public void recycle(T instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Pool3.DefaultImpls.close(this);
    }
}
