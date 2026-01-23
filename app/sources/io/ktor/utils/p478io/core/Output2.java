package io.ktor.utils.p478io.core;

import io.ktor.utils.p478io.core.internal.ChunkBuffer;
import io.ktor.utils.p478io.core.internal.Unsafe;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Output.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lio/ktor/utils/io/core/Output;", "", "src", "", "offset", "length", "", "writeFully", "(Lio/ktor/utils/io/core/Output;[BII)V", "Lio/ktor/utils/io/core/Buffer;", "(Lio/ktor/utils/io/core/Output;Lio/ktor/utils/io/core/Buffer;I)V", "ktor-io"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.utils.io.core.OutputKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class Output2 {
    public static /* synthetic */ void writeFully$default(Output output, Buffer buffer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = buffer.getWritePosition() - buffer.getReadPosition();
        }
        writeFully(output, buffer, i);
    }

    public static /* synthetic */ void writeFully$default(Output output, byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length - i;
        }
        writeFully(output, bArr, i, i2);
    }

    public static final void writeFully(Output output, Buffer src, int i) {
        Intrinsics.checkNotNullParameter(output, "<this>");
        Intrinsics.checkNotNullParameter(src, "src");
        ChunkBuffer chunkBufferPrepareWriteHead = Unsafe.prepareWriteHead(output, 1, null);
        while (true) {
            try {
                int iMin = Math.min(i, chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition());
                BufferPrimitives.writeFully(chunkBufferPrepareWriteHead, src, iMin);
                i -= iMin;
                if (i <= 0) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = Unsafe.prepareWriteHead(output, 1, chunkBufferPrepareWriteHead);
                }
            } finally {
                output.afterHeadWrite();
            }
        }
    }

    public static final void writeFully(Output output, byte[] src, int i, int i2) {
        Intrinsics.checkNotNullParameter(output, "<this>");
        Intrinsics.checkNotNullParameter(src, "src");
        ChunkBuffer chunkBufferPrepareWriteHead = Unsafe.prepareWriteHead(output, 1, null);
        while (true) {
            try {
                int iMin = Math.min(i2, chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition());
                BufferPrimitives.writeFully(chunkBufferPrepareWriteHead, src, i, iMin);
                i += iMin;
                i2 -= iMin;
                if (i2 <= 0) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = Unsafe.prepareWriteHead(output, 1, chunkBufferPrepareWriteHead);
                }
            } finally {
                output.afterHeadWrite();
            }
        }
    }
}
