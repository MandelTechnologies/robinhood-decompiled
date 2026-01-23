package io.ktor.utils.p478io.core;

import io.ktor.utils.p478io.bits.MemoryJvm;
import io.ktor.utils.p478io.core.internal.ChunkBuffer;
import io.ktor.utils.p478io.core.internal.Unsafe;
import java.nio.ByteBuffer;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InputArrays.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\u001a-\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\n\u001a/\u0010\u0010\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0010\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, m3636d2 = {"Lio/ktor/utils/io/core/Input;", "", "dst", "", "offset", "length", "", "readFully", "(Lio/ktor/utils/io/core/Input;[BII)V", "Lio/ktor/utils/io/core/Buffer;", "(Lio/ktor/utils/io/core/Input;Lio/ktor/utils/io/core/Buffer;I)V", "Lio/ktor/utils/io/bits/Memory;", "destination", "destinationOffset", "readAvailable-UAd2zVI", "(Lio/ktor/utils/io/core/Input;Ljava/nio/ByteBuffer;II)I", "readAvailable", "", "(Lio/ktor/utils/io/core/Input;Ljava/nio/ByteBuffer;JJ)J", "ktor-io"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.utils.io.core.InputArraysKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class InputArrays {
    /* renamed from: readAvailable-UAd2zVI, reason: not valid java name */
    public static final int m28483readAvailableUAd2zVI(Input readAvailable, ByteBuffer destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(readAvailable, "$this$readAvailable");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return (int) m28484readAvailableUAd2zVI(readAvailable, destination, i, i2);
    }

    /* renamed from: readAvailable-UAd2zVI, reason: not valid java name */
    public static final long m28484readAvailableUAd2zVI(Input readAvailable, ByteBuffer byteBuffer, long j, long j2) throws Throwable {
        long j3;
        Intrinsics.checkNotNullParameter(readAvailable, "$this$readAvailable");
        ByteBuffer destination = byteBuffer;
        Intrinsics.checkNotNullParameter(destination, "destination");
        boolean z = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = Unsafe.prepareReadFirstHead(readAvailable, 1);
        if (chunkBufferPrepareReadFirstHead == null) {
            j3 = j2;
        } else {
            long j4 = j;
            j3 = j2;
            ChunkBuffer chunkBufferPrepareReadNextHead = chunkBufferPrepareReadFirstHead;
            while (true) {
                try {
                    int iMin = (int) Math.min(j3, chunkBufferPrepareReadNextHead.getWritePosition() - chunkBufferPrepareReadNextHead.getReadPosition());
                    long j5 = iMin;
                    MemoryJvm.m28470copyToJT6ljtQ(chunkBufferPrepareReadNextHead.getMemory(), destination, chunkBufferPrepareReadNextHead.getReadPosition(), j5, j4);
                    chunkBufferPrepareReadNextHead.discardExact(iMin);
                    j3 -= j5;
                    j4 += j5;
                    if (j3 > 0) {
                        try {
                            chunkBufferPrepareReadNextHead = Unsafe.prepareReadNextHead(readAvailable, chunkBufferPrepareReadNextHead);
                            if (chunkBufferPrepareReadNextHead == null) {
                                break;
                            }
                            destination = byteBuffer;
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (z) {
                                Unsafe.completeReadHead(readAvailable, chunkBufferPrepareReadNextHead);
                            }
                            throw th;
                        }
                    } else {
                        Unsafe.completeReadHead(readAvailable, chunkBufferPrepareReadNextHead);
                        break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        long j6 = j2 - j3;
        if (j6 == 0 && readAvailable.getEndOfInput()) {
            return -1L;
        }
        return j6;
    }

    public static final void readFully(Input input, Buffer dst, int i) throws Throwable {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        boolean z = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = Unsafe.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead != null) {
            while (true) {
                try {
                    int iMin = Math.min(i, chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition());
                    BufferPrimitives.readFully(chunkBufferPrepareReadFirstHead, dst, iMin);
                    i -= iMin;
                    if (i > 0) {
                        try {
                            chunkBufferPrepareReadFirstHead = Unsafe.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                            if (chunkBufferPrepareReadFirstHead == null) {
                                break;
                            }
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (z) {
                                Unsafe.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else {
                        Unsafe.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        if (i <= 0) {
            return;
        }
        StringsKt.prematureEndOfStream(i);
        throw new ExceptionsH();
    }

    public static final void readFully(Input input, byte[] dst, int i, int i2) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        boolean z = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = Unsafe.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead != null) {
            while (true) {
                try {
                    int iMin = Math.min(i2, chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition());
                    BufferPrimitives.readFully(chunkBufferPrepareReadFirstHead, dst, i, iMin);
                    i2 -= iMin;
                    i += iMin;
                    if (i2 > 0) {
                        try {
                            chunkBufferPrepareReadFirstHead = Unsafe.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                            if (chunkBufferPrepareReadFirstHead == null) {
                                break;
                            }
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (z) {
                                Unsafe.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else {
                        Unsafe.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        if (i2 <= 0) {
            return;
        }
        StringsKt.prematureEndOfStream(i2);
        throw new ExceptionsH();
    }
}
