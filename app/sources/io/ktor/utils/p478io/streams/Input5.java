package io.ktor.utils.p478io.streams;

import io.ktor.utils.p478io.bits.MemoryJvm;
import io.ktor.utils.p478io.core.Input;
import io.ktor.utils.p478io.core.internal.ChunkBuffer;
import io.ktor.utils.p478io.pool.Pool3;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: Input.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0014J-\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, m3636d2 = {"Lio/ktor/utils/io/streams/InputStreamAsInput;", "Lio/ktor/utils/io/core/Input;", "stream", "Ljava/io/InputStream;", "pool", "Lio/ktor/utils/io/pool/ObjectPool;", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "(Ljava/io/InputStream;Lio/ktor/utils/io/pool/ObjectPool;)V", "closeSource", "", "fill", "", "destination", "Lio/ktor/utils/io/bits/Memory;", "offset", "length", "fill-62zg_DM", "(Ljava/nio/ByteBuffer;II)I", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.utils.io.streams.InputStreamAsInput, reason: use source file name */
/* loaded from: classes14.dex */
public final class Input5 extends Input {
    private final InputStream stream;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Input5(InputStream stream, Pool3<ChunkBuffer> pool) {
        super(null, 0L, pool, 3, null);
        Intrinsics.checkNotNullParameter(stream, "stream");
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.stream = stream;
    }

    @Override // io.ktor.utils.p478io.core.Input
    /* renamed from: fill-62zg_DM */
    protected int mo27243fill62zg_DM(ByteBuffer destination, int offset, int length) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination.hasArray() && !destination.isReadOnly()) {
            return RangesKt.coerceAtLeast(this.stream.read(destination.array(), destination.arrayOffset() + offset, length), 0);
        }
        byte[] bArrBorrow = ByteArrays.getByteArrayPool().borrow();
        try {
            int i = this.stream.read(bArrBorrow, 0, Math.min(bArrBorrow.length, length));
            if (i == -1) {
                return 0;
            }
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArrBorrow, 0, i).slice().order(ByteOrder.BIG_ENDIAN);
            Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
            MemoryJvm.m28469copyToJT6ljtQ(MemoryJvm.m28468constructorimpl(byteBufferOrder), destination, 0, i, offset);
            return i;
        } finally {
            ByteArrays.getByteArrayPool().recycle(bArrBorrow);
        }
    }

    @Override // io.ktor.utils.p478io.core.Input
    protected void closeSource() throws IOException {
        this.stream.close();
    }
}
