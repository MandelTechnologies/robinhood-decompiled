package io.ktor.utils.p478io.core;

import io.ktor.utils.p478io.core.internal.ChunkBuffer;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.Deprecated;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;

/* compiled from: Buffer.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0017\u0018\u0000 :2\u00020\u0001:\u0001:B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\nJ\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\nJ\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\nJ\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\nJ\u000f\u0010\u001b\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001d\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001c\u0010\u0017J\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001f\u0010\nJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0000H\u0014¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\bH\u0016¢\u0006\u0004\b)\u0010\u0017J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010/R$\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010%R$\u00104\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b5\u0010%R$\u0010\u0012\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b6\u0010%R$\u0010\u0019\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u00102\u001a\u0004\b7\u0010%R\u0017\u00108\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b8\u00102\u001a\u0004\b9\u0010%\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, m3636d2 = {"Lio/ktor/utils/io/core/Buffer;", "", "Lio/ktor/utils/io/bits/Memory;", "memory", "<init>", "(Ljava/nio/ByteBuffer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "count", "", "discardExact", "(I)V", "commitWritten", "position", "", "commitWrittenUntilIndex", "(I)Z", "discardUntilIndex$ktor_io", "discardUntilIndex", "startGap", "reserveStartGap", "endGap", "reserveEndGap", "resetForRead", "()V", "resetForWrite", "limit", "releaseGaps$ktor_io", "releaseGaps", "releaseEndGap$ktor_io", "releaseEndGap", "newReadPosition", "releaseStartGap$ktor_io", "releaseStartGap", "copy", "duplicateTo", "(Lio/ktor/utils/io/core/Buffer;)V", "tryPeekByte", "()I", "", "readByte", "()B", "reset", "", "toString", "()Ljava/lang/String;", "Ljava/nio/ByteBuffer;", "getMemory-SK3TCg8", "()Ljava/nio/ByteBuffer;", "<set-?>", "readPosition", "I", "getReadPosition", "writePosition", "getWritePosition", "getStartGap", "getLimit", "capacity", "getCapacity", "Companion", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@Deprecated
@SourceDebugExtension
/* loaded from: classes14.dex */
public class Buffer {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int capacity;
    private int limit;
    private final ByteBuffer memory;
    private int readPosition;
    private int startGap;
    private int writePosition;

    public /* synthetic */ Buffer(ByteBuffer byteBuffer, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteBuffer);
    }

    private Buffer(ByteBuffer memory) {
        Intrinsics.checkNotNullParameter(memory, "memory");
        this.memory = memory;
        this.limit = memory.limit();
        this.capacity = memory.limit();
    }

    /* renamed from: getMemory-SK3TCg8, reason: not valid java name and from getter */
    public final ByteBuffer getMemory() {
        return this.memory;
    }

    public final int getReadPosition() {
        return this.readPosition;
    }

    public final int getWritePosition() {
        return this.writePosition;
    }

    public final int getStartGap() {
        return this.startGap;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public final void discardExact(int count) {
        if (count == 0) {
            return;
        }
        int i = this.readPosition + count;
        if (count < 0 || i > this.writePosition) {
            Buffer2.discardFailed(count, getWritePosition() - getReadPosition());
            throw new ExceptionsH();
        }
        this.readPosition = i;
    }

    public final void commitWritten(int count) {
        int i = this.writePosition + count;
        if (count < 0 || i > this.limit) {
            Buffer2.commitWrittenFailed(count, getLimit() - getWritePosition());
            throw new ExceptionsH();
        }
        this.writePosition = i;
    }

    @PublishedApi
    public final boolean commitWrittenUntilIndex(int position) {
        int i = this.limit;
        int i2 = this.writePosition;
        if (position < i2) {
            Buffer2.commitWrittenFailed(position - i2, getLimit() - getWritePosition());
            throw new ExceptionsH();
        }
        if (position < i) {
            this.writePosition = position;
            return true;
        }
        if (position == i) {
            this.writePosition = position;
            return false;
        }
        Buffer2.commitWrittenFailed(position - i2, getLimit() - getWritePosition());
        throw new ExceptionsH();
    }

    public final void discardUntilIndex$ktor_io(int position) {
        if (position < 0 || position > this.writePosition) {
            Buffer2.discardFailed(position - this.readPosition, getWritePosition() - getReadPosition());
            throw new ExceptionsH();
        }
        if (this.readPosition != position) {
            this.readPosition = position;
        }
    }

    public final void reserveStartGap(int startGap) {
        if (startGap < 0) {
            throw new IllegalArgumentException(("startGap shouldn't be negative: " + startGap).toString());
        }
        int i = this.readPosition;
        if (i >= startGap) {
            this.startGap = startGap;
            return;
        }
        if (i == this.writePosition) {
            if (startGap > this.limit) {
                Buffer2.startGapReservationFailedDueToLimit(this, startGap);
                throw new ExceptionsH();
            }
            this.writePosition = startGap;
            this.readPosition = startGap;
            this.startGap = startGap;
            return;
        }
        Buffer2.startGapReservationFailed(this, startGap);
        throw new ExceptionsH();
    }

    public final void reserveEndGap(int endGap) {
        if (endGap < 0) {
            throw new IllegalArgumentException(("endGap shouldn't be negative: " + endGap).toString());
        }
        int i = this.capacity - endGap;
        if (i >= this.writePosition) {
            this.limit = i;
            return;
        }
        if (i < 0) {
            Buffer2.endGapReservationFailedDueToCapacity(this, endGap);
        }
        if (i < this.startGap) {
            Buffer2.endGapReservationFailedDueToStartGap(this, endGap);
        }
        if (this.readPosition == this.writePosition) {
            this.limit = i;
            this.readPosition = i;
            this.writePosition = i;
            return;
        }
        Buffer2.endGapReservationFailedDueToContent(this, endGap);
    }

    public final void resetForRead() {
        this.startGap = 0;
        this.readPosition = 0;
        this.writePosition = this.capacity;
    }

    public final void resetForWrite() {
        resetForWrite(this.capacity - this.startGap);
    }

    public final void resetForWrite(int limit) {
        int i = this.startGap;
        this.readPosition = i;
        this.writePosition = i;
        this.limit = limit;
    }

    public final void releaseGaps$ktor_io() {
        releaseStartGap$ktor_io(0);
        releaseEndGap$ktor_io();
    }

    public final void releaseEndGap$ktor_io() {
        this.limit = this.capacity;
    }

    public final void releaseStartGap$ktor_io(int newReadPosition) {
        if (newReadPosition < 0) {
            throw new IllegalArgumentException(("newReadPosition shouldn't be negative: " + newReadPosition).toString());
        }
        if (newReadPosition > this.readPosition) {
            throw new IllegalArgumentException(("newReadPosition shouldn't be ahead of the read position: " + newReadPosition + " > " + this.readPosition).toString());
        }
        this.readPosition = newReadPosition;
        if (this.startGap > newReadPosition) {
            this.startGap = newReadPosition;
        }
    }

    protected void duplicateTo(Buffer copy) {
        Intrinsics.checkNotNullParameter(copy, "copy");
        copy.limit = this.limit;
        copy.startGap = this.startGap;
        copy.readPosition = this.readPosition;
        copy.writePosition = this.writePosition;
    }

    public final int tryPeekByte() {
        int i = this.readPosition;
        if (i == this.writePosition) {
            return -1;
        }
        return this.memory.get(i) & 255;
    }

    public final byte readByte() throws EOFException {
        int i = this.readPosition;
        if (i == this.writePosition) {
            throw new EOFException("No readable bytes available.");
        }
        this.readPosition = i + 1;
        return this.memory.get(i);
    }

    public void reset() {
        releaseGaps$ktor_io();
        resetForWrite();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Buffer[0x");
        String string2 = Integer.toString(hashCode(), CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string2, "toString(this, checkRadix(radix))");
        sb.append(string2);
        sb.append("](");
        sb.append(getWritePosition() - getReadPosition());
        sb.append(" used, ");
        sb.append(getLimit() - getWritePosition());
        sb.append(" free, ");
        sb.append(this.startGap + (getCapacity() - getLimit()));
        sb.append(" reserved of ");
        sb.append(this.capacity);
        sb.append(')');
        return sb.toString();
    }

    /* compiled from: Buffer.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lio/ktor/utils/io/core/Buffer$Companion;", "", "()V", "Empty", "Lio/ktor/utils/io/core/Buffer;", "getEmpty", "()Lio/ktor/utils/io/core/Buffer;", "ReservedSize", "", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Buffer getEmpty() {
            return ChunkBuffer.INSTANCE.getEmpty();
        }
    }
}
