package io.ktor.utils.p478io.pool;

import kotlin.Metadata;

/* compiled from: ByteArrayPool.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"ByteArrayPool", "Lio/ktor/utils/io/pool/ObjectPool;", "", "getByteArrayPool", "()Lio/ktor/utils/io/pool/ObjectPool;", "ktor-io"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.utils.io.pool.ByteArrayPoolKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ByteArrayPool2 {
    private static final Pool3<byte[]> ByteArrayPool = new DefaultPool<byte[]>() { // from class: io.ktor.utils.io.pool.ByteArrayPoolKt$ByteArrayPool$1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.ktor.utils.p478io.pool.DefaultPool
        public byte[] produceInstance() {
            return new byte[4096];
        }
    };

    public static final Pool3<byte[]> getByteArrayPool() {
        return ByteArrayPool;
    }
}
