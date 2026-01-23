package io.ktor.utils.p478io.bits;

import io.ktor.utils.p478io.core.internal.Numbers;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MemoryJvm.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0012ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, m3636d2 = {"Lio/ktor/utils/io/bits/Memory;", "", "Ljava/nio/ByteBuffer;", "buffer", "constructor-impl", "(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;", "", "offset", "length", "slice-87lwejk", "(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;", "slice", "destination", "destinationOffset", "", "copyTo-JT6ljtQ", "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;III)V", "copyTo", "", "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;JJJ)V", "Companion", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@JvmInline
@SourceDebugExtension
/* renamed from: io.ktor.utils.io.bits.Memory, reason: use source file name */
/* loaded from: classes14.dex */
public final class MemoryJvm {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ByteBuffer Empty;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static ByteBuffer m28468constructorimpl(ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        return buffer;
    }

    /* renamed from: slice-87lwejk, reason: not valid java name */
    public static final ByteBuffer m28471slice87lwejk(ByteBuffer byteBuffer, int i, int i2) {
        return m28468constructorimpl(MemoryJvm2.sliceSafe(byteBuffer, i, i2));
    }

    /* renamed from: copyTo-JT6ljtQ, reason: not valid java name */
    public static final void m28469copyToJT6ljtQ(ByteBuffer byteBuffer, ByteBuffer destination, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (byteBuffer.hasArray() && destination.hasArray() && !byteBuffer.isReadOnly() && !destination.isReadOnly()) {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i, destination.array(), destination.arrayOffset() + i3, i2);
            return;
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i);
        byteBufferDuplicate.limit(i + i2);
        ByteBuffer byteBufferDuplicate2 = destination.duplicate();
        byteBufferDuplicate2.position(i3);
        byteBufferDuplicate2.put(byteBufferDuplicate);
    }

    /* renamed from: copyTo-JT6ljtQ, reason: not valid java name */
    public static final void m28470copyToJT6ljtQ(ByteBuffer byteBuffer, ByteBuffer destination, long j, long j2, long j3) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (j >= 2147483647L) {
            Numbers.failLongToIntConversion(j, "offset");
            throw new ExceptionsH();
        }
        int i = (int) j;
        if (j2 >= 2147483647L) {
            Numbers.failLongToIntConversion(j2, "length");
            throw new ExceptionsH();
        }
        int i2 = (int) j2;
        if (j3 >= 2147483647L) {
            Numbers.failLongToIntConversion(j3, "destinationOffset");
            throw new ExceptionsH();
        }
        m28469copyToJT6ljtQ(byteBuffer, destination, i, i2, (int) j3);
    }

    /* compiled from: MemoryJvm.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, m3636d2 = {"Lio/ktor/utils/io/bits/Memory$Companion;", "", "()V", "Empty", "Lio/ktor/utils/io/bits/Memory;", "getEmpty-SK3TCg8", "()Ljava/nio/ByteBuffer;", "Ljava/nio/ByteBuffer;", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: io.ktor.utils.io.bits.Memory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getEmpty-SK3TCg8, reason: not valid java name */
        public final ByteBuffer m28472getEmptySK3TCg8() {
            return MemoryJvm.Empty;
        }
    }

    static {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(0).order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "allocate(0).order(ByteOrder.BIG_ENDIAN)");
        Empty = m28468constructorimpl(byteBufferOrder);
    }
}
