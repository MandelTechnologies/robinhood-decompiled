package io.ktor.util.cio;

import io.ktor.utils.p478io.pool.ByteBufferPools;
import io.ktor.utils.p478io.pool.Pool3;
import java.nio.ByteBuffer;
import kotlin.Metadata;

/* compiled from: ByteBufferPool.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001d\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "KtorDefaultPool", "Lio/ktor/utils/io/pool/ObjectPool;", "getKtorDefaultPool", "()Lio/ktor/utils/io/pool/ObjectPool;", "ktor-utils"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.util.cio.ByteBufferPoolKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ByteBufferPool2 {
    private static final Pool3<ByteBuffer> KtorDefaultPool = new ByteBufferPools(2048, 4098);

    public static final Pool3<ByteBuffer> getKtorDefaultPool() {
        return KtorDefaultPool;
    }
}
