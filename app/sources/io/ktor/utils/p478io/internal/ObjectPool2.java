package io.ktor.utils.p478io.internal;

import io.ktor.utils.p478io.internal.ReadWriteBufferState;
import io.ktor.utils.p478io.pool.ByteBufferPools2;
import io.ktor.utils.p478io.pool.DefaultPool;
import io.ktor.utils.p478io.pool.Pool2;
import io.ktor.utils.p478io.pool.Pool3;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ObjectPool.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\"\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n\"\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u0010"}, m3636d2 = {"BUFFER_OBJECT_POOL_SIZE", "", "BUFFER_POOL_SIZE", "BUFFER_SIZE", "getBUFFER_SIZE", "()I", "BufferObjectNoPool", "Lio/ktor/utils/io/pool/ObjectPool;", "Lio/ktor/utils/io/internal/ReadWriteBufferState$Initial;", "getBufferObjectNoPool", "()Lio/ktor/utils/io/pool/ObjectPool;", "BufferObjectPool", "getBufferObjectPool", "BufferPool", "Ljava/nio/ByteBuffer;", "getBufferPool", "ktor-io"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.utils.io.internal.ObjectPoolKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ObjectPool2 {
    private static final int BUFFER_OBJECT_POOL_SIZE;
    private static final int BUFFER_POOL_SIZE;
    private static final int BUFFER_SIZE;
    private static final Pool3<ReadWriteBufferState.Initial> BufferObjectNoPool;
    private static final Pool3<ReadWriteBufferState.Initial> BufferObjectPool;
    private static final Pool3<ByteBuffer> BufferPool;

    static {
        int iOIntProperty = UtilsKt.getIOIntProperty("BufferSize", 4096);
        BUFFER_SIZE = iOIntProperty;
        int iOIntProperty2 = UtilsKt.getIOIntProperty("BufferPoolSize", 2048);
        BUFFER_POOL_SIZE = iOIntProperty2;
        final int iOIntProperty3 = UtilsKt.getIOIntProperty("BufferObjectPoolSize", 1024);
        BUFFER_OBJECT_POOL_SIZE = iOIntProperty3;
        BufferPool = new ByteBufferPools2(iOIntProperty2, iOIntProperty);
        BufferObjectPool = new DefaultPool<ReadWriteBufferState.Initial>(iOIntProperty3) { // from class: io.ktor.utils.io.internal.ObjectPoolKt$BufferObjectPool$1
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.ktor.utils.p478io.pool.DefaultPool
            public ReadWriteBufferState.Initial produceInstance() {
                return new ReadWriteBufferState.Initial(ObjectPool2.getBufferPool().borrow(), 0, 2, null);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // io.ktor.utils.p478io.pool.DefaultPool
            public void disposeInstance(ReadWriteBufferState.Initial instance) {
                Intrinsics.checkNotNullParameter(instance, "instance");
                ObjectPool2.getBufferPool().recycle(instance.backingBuffer);
            }
        };
        BufferObjectNoPool = new Pool2<ReadWriteBufferState.Initial>() { // from class: io.ktor.utils.io.internal.ObjectPoolKt$BufferObjectNoPool$1
            @Override // io.ktor.utils.p478io.pool.Pool3
            public ReadWriteBufferState.Initial borrow() {
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(ObjectPool2.getBUFFER_SIZE());
                Intrinsics.checkNotNullExpressionValue(byteBufferAllocateDirect, "allocateDirect(BUFFER_SIZE)");
                return new ReadWriteBufferState.Initial(byteBufferAllocateDirect, 0, 2, null);
            }
        };
    }

    public static final int getBUFFER_SIZE() {
        return BUFFER_SIZE;
    }

    public static final Pool3<ByteBuffer> getBufferPool() {
        return BufferPool;
    }

    public static final Pool3<ReadWriteBufferState.Initial> getBufferObjectPool() {
        return BufferObjectPool;
    }

    public static final Pool3<ReadWriteBufferState.Initial> getBufferObjectNoPool() {
        return BufferObjectNoPool;
    }
}
