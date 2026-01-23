package io.ktor.utils.p478io.core;

import io.ktor.utils.p478io.bits.MemoryJvm2;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BufferPrimitivesJvm.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lio/ktor/utils/io/core/Buffer;", "Ljava/nio/ByteBuffer;", "source", "", "writeFully", "(Lio/ktor/utils/io/core/Buffer;Ljava/nio/ByteBuffer;)V", "ktor-io"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.utils.io.core.BufferPrimitivesJvmKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class BufferPrimitivesJvm {
    public static final void writeFully(Buffer buffer, ByteBuffer source) throws Buffer3 {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        int iRemaining = source.remaining();
        ByteBuffer memory = buffer.getMemory();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        if (limit >= iRemaining) {
            MemoryJvm2.m28475copyToSG11BkQ(source, memory, writePosition);
            buffer.commitWritten(iRemaining);
            return;
        }
        throw new Buffer3("buffer content", iRemaining, limit);
    }
}
