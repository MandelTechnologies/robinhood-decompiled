package io.ktor.utils.p478io.core;

import io.ktor.utils.p478io.core.internal.ChunkBuffer;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ByteBuffers.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a$\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0003H\u0082\u0010¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lio/ktor/utils/io/core/ByteReadPacket;", "Ljava/nio/ByteBuffer;", "dst", "", "readFully", "(Lio/ktor/utils/io/core/ByteReadPacket;Ljava/nio/ByteBuffer;)I", "bb", "copied", "readAsMuchAsPossible", "(Lio/ktor/utils/io/core/ByteReadPacket;Ljava/nio/ByteBuffer;I)I", "ktor-io"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.utils.io.core.ByteBuffersKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ByteBuffers {
    public static final int readFully(ByteReadPacket byteReadPacket, ByteBuffer dst) throws EOFException {
        Intrinsics.checkNotNullParameter(byteReadPacket, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int asMuchAsPossible = readAsMuchAsPossible(byteReadPacket, dst, 0);
        if (!dst.hasRemaining()) {
            return asMuchAsPossible;
        }
        throw new EOFException("Not enough data in packet to fill buffer: " + dst.remaining() + " more bytes required");
    }

    private static final int readAsMuchAsPossible(ByteReadPacket byteReadPacket, ByteBuffer byteBuffer, int i) throws EOFException {
        ChunkBuffer chunkBufferPrepareRead;
        while (byteBuffer.hasRemaining() && (chunkBufferPrepareRead = byteReadPacket.prepareRead(1)) != null) {
            int iRemaining = byteBuffer.remaining();
            int writePosition = chunkBufferPrepareRead.getWritePosition() - chunkBufferPrepareRead.getReadPosition();
            if (iRemaining >= writePosition) {
                BufferUtilsJvm.readFully(chunkBufferPrepareRead, byteBuffer, writePosition);
                byteReadPacket.releaseHead$ktor_io(chunkBufferPrepareRead);
                i += writePosition;
            } else {
                BufferUtilsJvm.readFully(chunkBufferPrepareRead, byteBuffer, iRemaining);
                byteReadPacket.setHeadPosition(chunkBufferPrepareRead.getReadPosition());
                return i + iRemaining;
            }
        }
        return i;
    }
}
