package io.ktor.utils.p478io.core;

import io.ktor.utils.p478io.bits.MemoryJvm;
import io.ktor.utils.p478io.bits.MemoryJvm2;
import io.ktor.utils.p478io.core.internal.ChunkBuffer;
import io.ktor.utils.p478io.pool.Pool3;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BufferUtilsJvm.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u000f\u001a\u00020\b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Ljava/nio/ByteBuffer;", "buffer", "Lio/ktor/utils/io/pool/ObjectPool;", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "pool", "ChunkBuffer", "(Ljava/nio/ByteBuffer;Lio/ktor/utils/io/pool/ObjectPool;)Lio/ktor/utils/io/core/internal/ChunkBuffer;", "child", "", "resetFromContentToWrite", "(Lio/ktor/utils/io/core/internal/ChunkBuffer;Ljava/nio/ByteBuffer;)V", "Lio/ktor/utils/io/core/Buffer;", "dst", "", "length", "readFully", "(Lio/ktor/utils/io/core/Buffer;Ljava/nio/ByteBuffer;I)V", "ktor-io"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.utils.io.core.BufferUtilsJvmKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class BufferUtilsJvm {
    public static /* synthetic */ ChunkBuffer ChunkBuffer$default(ByteBuffer byteBuffer, Pool3 pool3, int i, Object obj) {
        if ((i & 2) != 0) {
            pool3 = null;
        }
        return ChunkBuffer(byteBuffer, pool3);
    }

    public static final ChunkBuffer ChunkBuffer(ByteBuffer buffer, Pool3<ChunkBuffer> pool3) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        MemoryJvm.Companion companion = MemoryJvm.INSTANCE;
        ByteBuffer byteBufferOrder = buffer.slice().order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "buffer.slice().order(ByteOrder.BIG_ENDIAN)");
        return new ChunkBuffer(MemoryJvm.m28468constructorimpl(byteBufferOrder), null, pool3, null);
    }

    public static final void resetFromContentToWrite(ChunkBuffer chunkBuffer, ByteBuffer child) {
        Intrinsics.checkNotNullParameter(chunkBuffer, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        chunkBuffer.resetForWrite(child.limit());
        chunkBuffer.commitWrittenUntilIndex(child.position());
    }

    public static final void readFully(Buffer buffer, ByteBuffer dst, int i) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition >= i) {
            int iLimit = dst.limit();
            try {
                dst.limit(dst.position() + i);
                MemoryJvm2.m28473copyTo62zg_DM(memory, dst, readPosition);
                dst.limit(iLimit);
                Unit unit = Unit.INSTANCE;
                buffer.discardExact(i);
                return;
            } catch (Throwable th) {
                dst.limit(iLimit);
                throw th;
            }
        }
        throw new EOFException("Not enough bytes to read a buffer content of size " + i + '.');
    }
}
