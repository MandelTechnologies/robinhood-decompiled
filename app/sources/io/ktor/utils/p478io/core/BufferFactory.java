package io.ktor.utils.p478io.core;

import io.ktor.utils.p478io.core.internal.ChunkBuffer;
import io.ktor.utils.p478io.pool.Pool3;
import kotlin.Metadata;

/* compiled from: BufferFactory.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\"&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m3636d2 = {"Lio/ktor/utils/io/pool/ObjectPool;", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "DefaultChunkedBufferPool", "Lio/ktor/utils/io/pool/ObjectPool;", "getDefaultChunkedBufferPool", "()Lio/ktor/utils/io/pool/ObjectPool;", "getDefaultChunkedBufferPool$annotations", "()V", "ktor-io"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.utils.io.core.BufferFactoryKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class BufferFactory {
    private static final Pool3<ChunkBuffer> DefaultChunkedBufferPool = new BufferFactory2(0, 0, null, 7, null);

    public static final Pool3<ChunkBuffer> getDefaultChunkedBufferPool() {
        return DefaultChunkedBufferPool;
    }
}
