package io.ktor.utils.p478io.core;

import io.ktor.utils.p478io.bits.MemoryJvm;
import io.ktor.utils.p478io.bits.MemoryJvm2;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BufferPrimitives.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u001a-\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\b\u001a#\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\f\u001a!\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lio/ktor/utils/io/core/Buffer;", "", "destination", "", "offset", "length", "", "readFully", "(Lio/ktor/utils/io/core/Buffer;[BII)V", "source", "writeFully", "dst", "(Lio/ktor/utils/io/core/Buffer;Lio/ktor/utils/io/core/Buffer;I)I", "src", "(Lio/ktor/utils/io/core/Buffer;Lio/ktor/utils/io/core/Buffer;I)V", "ktor-io"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.utils.io.core.BufferPrimitivesKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class BufferPrimitives {
    public static final void writeFully(Buffer buffer, Buffer src, int i) throws Buffer3 {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(src, "src");
        if (i >= 0) {
            if (i <= src.getWritePosition() - src.getReadPosition()) {
                if (i <= buffer.getLimit() - buffer.getWritePosition()) {
                    ByteBuffer memory = buffer.getMemory();
                    int writePosition = buffer.getWritePosition();
                    int limit = buffer.getLimit() - writePosition;
                    if (limit >= i) {
                        MemoryJvm.m28469copyToJT6ljtQ(src.getMemory(), memory, src.getReadPosition(), i, writePosition);
                        src.discardExact(i);
                        buffer.commitWritten(i);
                        return;
                    }
                    throw new Buffer3("buffer readable content", i, limit);
                }
                throw new IllegalArgumentException(("length shouldn't be greater than the destination write remaining space: " + i + " > " + (buffer.getLimit() - buffer.getWritePosition())).toString());
            }
            throw new IllegalArgumentException(("length shouldn't be greater than the source read remaining: " + i + " > " + (src.getWritePosition() - src.getReadPosition())).toString());
        }
        throw new IllegalArgumentException(("length shouldn't be negative: " + i).toString());
    }

    public static final void readFully(Buffer buffer, byte[] destination, int i, int i2) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition >= i2) {
            MemoryJvm2.m28474copyTo9zorpBc(memory, destination, readPosition, i2, i);
            Unit unit = Unit.INSTANCE;
            buffer.discardExact(i2);
        } else {
            throw new EOFException("Not enough bytes to read a byte array of size " + i2 + '.');
        }
    }

    public static final void writeFully(Buffer buffer, byte[] source, int i, int i2) throws Buffer3 {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer memory = buffer.getMemory();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        if (limit >= i2) {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(source, i, i2).slice().order(ByteOrder.BIG_ENDIAN);
            Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
            MemoryJvm.m28469copyToJT6ljtQ(MemoryJvm.m28468constructorimpl(byteBufferOrder), memory, 0, i2, writePosition);
            buffer.commitWritten(i2);
            return;
        }
        throw new Buffer3("byte array", i2, limit);
    }

    public static final int readFully(Buffer buffer, Buffer dst, int i) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        if (i >= 0) {
            if (i <= dst.getLimit() - dst.getWritePosition()) {
                ByteBuffer memory = buffer.getMemory();
                int readPosition = buffer.getReadPosition();
                if (buffer.getWritePosition() - readPosition >= i) {
                    MemoryJvm.m28469copyToJT6ljtQ(memory, dst.getMemory(), readPosition, i, dst.getWritePosition());
                    dst.commitWritten(i);
                    Unit unit = Unit.INSTANCE;
                    buffer.discardExact(i);
                    return i;
                }
                throw new EOFException("Not enough bytes to read a buffer content of size " + i + '.');
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
