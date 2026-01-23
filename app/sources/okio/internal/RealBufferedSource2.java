package okio.internal;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import okio.ByteString;
import okio.SegmentedByteString;
import okio.buffer;

/* compiled from: RealBufferedSource.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aA\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\r\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lokio/RealBufferedSource;", "Lokio/ByteString;", "bytes", "", "bytesOffset", "byteCount", "", "fromIndex", "toIndex", "commonIndexOf", "(Lokio/RealBufferedSource;Lokio/ByteString;IIJJ)J", "Lokio/Buffer;", "", "isMatchPossibleByExpandingBuffer", "(Lokio/Buffer;Lokio/ByteString;IIJJ)Z", "okio"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmName
@SourceDebugExtension
/* renamed from: okio.internal.-RealBufferedSource, reason: use source file name */
/* loaded from: classes25.dex */
public final class RealBufferedSource2 {
    public static /* synthetic */ long commonIndexOf$default(buffer bufferVar, ByteString byteString, int i, int i2, long j, long j2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = byteString.size();
        }
        return commonIndexOf(bufferVar, byteString, i4, i2, j, (i3 & 16) != 0 ? Long.MAX_VALUE : j2);
    }

    public static final long commonIndexOf(buffer bufferVar, ByteString byteString, int i, int i2, long j, long j2) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        ByteString bytes = byteString;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i3 = i;
        long j3 = i2;
        SegmentedByteString.checkOffsetAndCount(bytes.size(), i3, j3);
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        long jMax = j;
        while (true) {
            long jCommonIndexOf = Buffer4.commonIndexOf(bufferVar.bufferField, bytes, jMax, j2, i3, i2);
            if (jCommonIndexOf != -1) {
                return jCommonIndexOf;
            }
            long size = (bufferVar.bufferField.getSize() - j3) + 1;
            if (size >= j2) {
                return -1L;
            }
            long j4 = jMax;
            if (!isMatchPossibleByExpandingBuffer(bufferVar.bufferField, byteString, i, i2, j4, j2) || bufferVar.source.read(bufferVar.bufferField, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(j4, size);
            bytes = byteString;
            i3 = i;
        }
    }

    private static final boolean isMatchPossibleByExpandingBuffer(Buffer buffer, ByteString byteString, int i, int i2, long j, long j2) {
        if (buffer.getSize() < j2) {
            return true;
        }
        int iMax = (int) Math.max(1L, (buffer.getSize() - j2) + 1);
        int iMin = ((int) Math.min(i2, (buffer.getSize() - j) + 1)) - 1;
        if (iMax > iMin) {
            return false;
        }
        int i3 = iMin;
        while (true) {
            Buffer buffer2 = buffer;
            ByteString byteString2 = byteString;
            int i4 = i;
            if (buffer2.rangeEquals(buffer.getSize() - i3, byteString2, i4, i3)) {
                return true;
            }
            if (i3 == iMax) {
                return false;
            }
            i3--;
            buffer = buffer2;
            byteString = byteString2;
            i = i4;
        }
    }
}
