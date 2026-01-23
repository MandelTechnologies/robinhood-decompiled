package io.ktor.utils.p478io.core;

import com.plaid.internal.EnumC7081g;
import com.singular.sdk.internal.Constants;
import io.ktor.utils.p478io.bits.MemoryJvm;
import io.ktor.utils.p478io.core.internal.ChunkBuffer;
import io.ktor.utils.p478io.core.internal.ChunkBuffer5;
import io.ktor.utils.p478io.core.internal.Numbers;
import io.ktor.utils.p478io.core.internal.UTF83;
import io.ktor.utils.p478io.pool.Pool3;
import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.Deprecated;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;

/* compiled from: Output.kt */
@Deprecated
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b#\b'\u0018\u00002\u00060\u0001j\u0002`\u00022\u00060\u0003j\u0002`\u0004B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010%\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H$ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020\u000bH$¢\u0006\u0004\b&\u0010\nJ\r\u0010%\u001a\u00020\u000b¢\u0006\u0004\b%\u0010\nJ\u0011\u0010(\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b'\u0010\u000eJ\u0017\u0010,\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u0006H\u0000¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b-\u0010+J\r\u0010/\u001a\u00020\u000b¢\u0006\u0004\b/\u0010\nJ\u0017\u00101\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0015H\u0016¢\u0006\u0004\b1\u00102J\u0019\u00101\u001a\u00020\u00002\b\u00100\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b1\u00104J)\u00101\u001a\u00020\u00002\b\u00100\u001a\u0004\u0018\u0001032\u0006\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u0011H\u0016¢\u0006\u0004\b1\u00107J\u0015\u0010:\u001a\u00020\u000b2\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u0006H\u0000¢\u0006\u0004\b=\u0010+J\u001d\u0010:\u001a\u00020\u000b2\u0006\u0010?\u001a\u0002082\u0006\u0010A\u001a\u00020@¢\u0006\u0004\b:\u0010BJ\r\u0010C\u001a\u00020\u000b¢\u0006\u0004\bC\u0010\nJ\u0017\u0010D\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u0011H\u0001¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u000bH\u0001¢\u0006\u0004\bF\u0010\nJ\u000f\u0010H\u001a\u00020\u000bH\u0000¢\u0006\u0004\bG\u0010\nR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u0010I\u001a\u0004\bJ\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010N\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010MR+\u0010O\u001a\u00020\u001f8\u0000@\u0000X\u0080\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010U\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010[\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u0010V\u001a\u0004\b\\\u0010X\"\u0004\b]\u0010ZR\u0016\u0010^\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010VR\u0016\u0010_\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010VR\u0014\u0010a\u001a\u00020\u00118DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b`\u0010XR\u0014\u0010\u000f\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bb\u0010\u000e\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006c"}, m3636d2 = {"Lio/ktor/utils/io/core/Output;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lio/ktor/utils/io/pool/ObjectPool;", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "pool", "<init>", "(Lio/ktor/utils/io/pool/ObjectPool;)V", "()V", "", "flushChain", "appendNewChunk", "()Lio/ktor/utils/io/core/internal/ChunkBuffer;", "head", "newTail", "", "chainedSizeDelta", "appendChainImpl", "(Lio/ktor/utils/io/core/internal/ChunkBuffer;Lio/ktor/utils/io/core/internal/ChunkBuffer;I)V", "", "c", "appendCharFallback", "(C)V", "tail", "foreignStolen", "writePacketMerging", "(Lio/ktor/utils/io/core/internal/ChunkBuffer;Lio/ktor/utils/io/core/internal/ChunkBuffer;Lio/ktor/utils/io/pool/ObjectPool;)V", "writePacketSlowPrepend", "(Lio/ktor/utils/io/core/internal/ChunkBuffer;Lio/ktor/utils/io/core/internal/ChunkBuffer;)V", "Lio/ktor/utils/io/bits/Memory;", "source", "offset", "length", "flush-62zg_DM", "(Ljava/nio/ByteBuffer;II)V", "flush", "closeDestination", "stealAll$ktor_io", "stealAll", "buffer", "appendSingleChunk$ktor_io", "(Lio/ktor/utils/io/core/internal/ChunkBuffer;)V", "appendSingleChunk", "appendChain$ktor_io", "appendChain", "close", "value", "append", "(C)Lio/ktor/utils/io/core/Output;", "", "(Ljava/lang/CharSequence;)Lio/ktor/utils/io/core/Output;", "startIndex", "endIndex", "(Ljava/lang/CharSequence;II)Lio/ktor/utils/io/core/Output;", "Lio/ktor/utils/io/core/ByteReadPacket;", "packet", "writePacket", "(Lio/ktor/utils/io/core/ByteReadPacket;)V", "chunkBuffer", "writeChunkBuffer$ktor_io", "writeChunkBuffer", Constants.RequestParamsKeys.PLATFORM_KEY, "", Constants.RequestParamsKeys.APP_NAME_KEY, "(Lio/ktor/utils/io/core/ByteReadPacket;J)V", "release", "prepareWriteHead", "(I)Lio/ktor/utils/io/core/internal/ChunkBuffer;", "afterHeadWrite", "afterBytesStolen$ktor_io", "afterBytesStolen", "Lio/ktor/utils/io/pool/ObjectPool;", "getPool", "()Lio/ktor/utils/io/pool/ObjectPool;", "_head", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "_tail", "tailMemory", "Ljava/nio/ByteBuffer;", "getTailMemory-SK3TCg8$ktor_io", "()Ljava/nio/ByteBuffer;", "setTailMemory-3GNKZMM$ktor_io", "(Ljava/nio/ByteBuffer;)V", "tailPosition", "I", "getTailPosition$ktor_io", "()I", "setTailPosition$ktor_io", "(I)V", "tailEndExclusive", "getTailEndExclusive$ktor_io", "setTailEndExclusive$ktor_io", "tailInitialPosition", "chainedSize", "get_size", "_size", "getHead$ktor_io", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public abstract class Output implements Appendable, Closeable {
    private ChunkBuffer _head;
    private ChunkBuffer _tail;
    private int chainedSize;
    private final Pool3<ChunkBuffer> pool;
    private int tailEndExclusive;
    private int tailInitialPosition;
    private ByteBuffer tailMemory;
    private int tailPosition;

    protected abstract void closeDestination();

    /* renamed from: flush-62zg_DM */
    protected abstract void mo28477flush62zg_DM(ByteBuffer source, int offset, int length);

    public Output(Pool3<ChunkBuffer> pool) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.pool = pool;
        this.tailMemory = MemoryJvm.INSTANCE.m28472getEmptySK3TCg8();
    }

    protected final Pool3<ChunkBuffer> getPool() {
        return this.pool;
    }

    public Output() {
        this(ChunkBuffer.INSTANCE.getPool());
    }

    protected final int get_size() {
        return this.chainedSize + (this.tailPosition - this.tailInitialPosition);
    }

    public final ChunkBuffer getHead$ktor_io() {
        ChunkBuffer chunkBuffer = this._head;
        return chunkBuffer == null ? ChunkBuffer.INSTANCE.getEmpty() : chunkBuffer;
    }

    /* renamed from: getTailPosition$ktor_io, reason: from getter */
    public final int getTailPosition() {
        return this.tailPosition;
    }

    /* renamed from: getTailEndExclusive$ktor_io, reason: from getter */
    public final int getTailEndExclusive() {
        return this.tailEndExclusive;
    }

    @PublishedApi
    public final ChunkBuffer prepareWriteHead(int n) {
        ChunkBuffer chunkBuffer;
        if (getTailEndExclusive() - getTailPosition() >= n && (chunkBuffer = this._tail) != null) {
            chunkBuffer.commitWrittenUntilIndex(this.tailPosition);
            return chunkBuffer;
        }
        return appendNewChunk();
    }

    public final void flush() {
        flushChain();
    }

    private final void flushChain() {
        ChunkBuffer chunkBufferStealAll$ktor_io = stealAll$ktor_io();
        if (chunkBufferStealAll$ktor_io == null) {
            return;
        }
        ChunkBuffer next = chunkBufferStealAll$ktor_io;
        do {
            try {
                mo28477flush62zg_DM(next.getMemory(), next.getReadPosition(), next.getWritePosition() - next.getReadPosition());
                next = next.getNext();
            } finally {
                Buffers.releaseAll(chunkBufferStealAll$ktor_io, this.pool);
            }
        } while (next != null);
    }

    public final void writePacket(ByteReadPacket p, long n) throws EOFException {
        Intrinsics.checkNotNullParameter(p, "p");
        while (n > 0) {
            long headEndExclusive = p.getHeadEndExclusive() - p.getHeadPosition();
            if (headEndExclusive > n) {
                ChunkBuffer chunkBufferPrepareRead = p.prepareRead(1);
                if (chunkBufferPrepareRead == null) {
                    StringsKt.prematureEndOfStream(1);
                    throw new ExceptionsH();
                }
                int readPosition = chunkBufferPrepareRead.getReadPosition();
                try {
                    Output2.writeFully(this, chunkBufferPrepareRead, (int) n);
                    int readPosition2 = chunkBufferPrepareRead.getReadPosition();
                    if (readPosition2 < readPosition) {
                        throw new IllegalStateException("Buffer's position shouldn't be rewinded");
                    }
                    if (readPosition2 == chunkBufferPrepareRead.getWritePosition()) {
                        p.ensureNext(chunkBufferPrepareRead);
                        return;
                    } else {
                        p.setHeadPosition(readPosition2);
                        return;
                    }
                } catch (Throwable th) {
                    int readPosition3 = chunkBufferPrepareRead.getReadPosition();
                    if (readPosition3 < readPosition) {
                        throw new IllegalStateException("Buffer's position shouldn't be rewinded");
                    }
                    if (readPosition3 == chunkBufferPrepareRead.getWritePosition()) {
                        p.ensureNext(chunkBufferPrepareRead);
                    } else {
                        p.setHeadPosition(readPosition3);
                    }
                    throw th;
                }
            }
            n -= headEndExclusive;
            ChunkBuffer chunkBufferSteal$ktor_io = p.steal$ktor_io();
            if (chunkBufferSteal$ktor_io == null) {
                throw new EOFException("Unexpected end of packet");
            }
            appendSingleChunk$ktor_io(chunkBufferSteal$ktor_io);
        }
    }

    public final ChunkBuffer stealAll$ktor_io() {
        ChunkBuffer chunkBuffer = this._head;
        if (chunkBuffer == null) {
            return null;
        }
        ChunkBuffer chunkBuffer2 = this._tail;
        if (chunkBuffer2 != null) {
            chunkBuffer2.commitWrittenUntilIndex(this.tailPosition);
        }
        this._head = null;
        this._tail = null;
        this.tailPosition = 0;
        this.tailEndExclusive = 0;
        this.tailInitialPosition = 0;
        this.chainedSize = 0;
        this.tailMemory = MemoryJvm.INSTANCE.m28472getEmptySK3TCg8();
        return chunkBuffer;
    }

    public final void appendSingleChunk$ktor_io(ChunkBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (buffer.getNext() != null) {
            throw new IllegalStateException("It should be a single buffer chunk.");
        }
        appendChainImpl(buffer, buffer, 0);
    }

    public final void appendChain$ktor_io(ChunkBuffer head) {
        Intrinsics.checkNotNullParameter(head, "head");
        ChunkBuffer chunkBufferFindTail = Buffers.findTail(head);
        long jRemainingAll = Buffers.remainingAll(head) - (chunkBufferFindTail.getWritePosition() - chunkBufferFindTail.getReadPosition());
        if (jRemainingAll >= 2147483647L) {
            Numbers.failLongToIntConversion(jRemainingAll, "total size increase");
            throw new ExceptionsH();
        }
        appendChainImpl(head, chunkBufferFindTail, (int) jRemainingAll);
    }

    private final ChunkBuffer appendNewChunk() {
        ChunkBuffer chunkBufferBorrow = this.pool.borrow();
        chunkBufferBorrow.reserveEndGap(8);
        appendSingleChunk$ktor_io(chunkBufferBorrow);
        return chunkBufferBorrow;
    }

    private final void appendChainImpl(ChunkBuffer head, ChunkBuffer newTail, int chainedSizeDelta) {
        ChunkBuffer chunkBuffer = this._tail;
        if (chunkBuffer == null) {
            this._head = head;
            this.chainedSize = 0;
        } else {
            chunkBuffer.setNext(head);
            int i = this.tailPosition;
            chunkBuffer.commitWrittenUntilIndex(i);
            this.chainedSize += i - this.tailInitialPosition;
        }
        this._tail = newTail;
        this.chainedSize += chainedSizeDelta;
        this.tailMemory = newTail.getMemory();
        this.tailPosition = newTail.getWritePosition();
        this.tailInitialPosition = newTail.getReadPosition();
        this.tailEndExclusive = newTail.getLimit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            flush();
        } finally {
            closeDestination();
        }
    }

    @Override // java.lang.Appendable
    public Output append(char value) {
        int i = this.tailPosition;
        int i2 = 3;
        if (this.tailEndExclusive - i >= 3) {
            ByteBuffer byteBuffer = this.tailMemory;
            if (value >= 0 && value < 128) {
                byteBuffer.put(i, (byte) value);
                i2 = 1;
            } else if (128 <= value && value < 2048) {
                byteBuffer.put(i, (byte) (((value >> 6) & 31) | 192));
                byteBuffer.put(i + 1, (byte) ((value & '?') | 128));
                i2 = 2;
            } else if (2048 <= value && value < 0) {
                byteBuffer.put(i, (byte) (((value >> '\f') & 15) | 224));
                byteBuffer.put(i + 1, (byte) (((value >> 6) & 63) | 128));
                byteBuffer.put(i + 2, (byte) ((value & '?') | 128));
            } else {
                if (0 > value || value >= 0) {
                    UTF83.malformedCodePoint(value);
                    throw new ExceptionsH();
                }
                byteBuffer.put(i, (byte) (((value >> 18) & 7) | EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                byteBuffer.put(i + 1, (byte) (((value >> '\f') & 63) | 128));
                byteBuffer.put(i + 2, (byte) (((value >> 6) & 63) | 128));
                byteBuffer.put(i + 3, (byte) ((value & '?') | 128));
                i2 = 4;
            }
            this.tailPosition = i + i2;
            return this;
        }
        appendCharFallback(value);
        return this;
    }

    @Override // java.lang.Appendable
    public Output append(CharSequence value) {
        if (value == null) {
            append("null", 0, 4);
            return this;
        }
        append(value, 0, value.length());
        return this;
    }

    @Override // java.lang.Appendable
    public Output append(CharSequence value, int startIndex, int endIndex) {
        if (value == null) {
            return append("null", startIndex, endIndex);
        }
        StringsKt.writeText(this, value, startIndex, endIndex, Charsets.UTF_8);
        return this;
    }

    public final void writePacket(ByteReadPacket packet) {
        Intrinsics.checkNotNullParameter(packet, "packet");
        ChunkBuffer chunkBufferStealAll$ktor_io = packet.stealAll$ktor_io();
        if (chunkBufferStealAll$ktor_io == null) {
            packet.release();
            return;
        }
        ChunkBuffer chunkBuffer = this._tail;
        if (chunkBuffer == null) {
            appendChain$ktor_io(chunkBufferStealAll$ktor_io);
        } else {
            writePacketMerging(chunkBuffer, chunkBufferStealAll$ktor_io, packet.getPool());
        }
    }

    public final void writeChunkBuffer$ktor_io(ChunkBuffer chunkBuffer) {
        Intrinsics.checkNotNullParameter(chunkBuffer, "chunkBuffer");
        ChunkBuffer chunkBuffer2 = this._tail;
        if (chunkBuffer2 == null) {
            appendChain$ktor_io(chunkBuffer);
        } else {
            writePacketMerging(chunkBuffer2, chunkBuffer, this.pool);
        }
    }

    private final void writePacketMerging(ChunkBuffer tail, ChunkBuffer foreignStolen, Pool3<ChunkBuffer> pool) {
        tail.commitWrittenUntilIndex(this.tailPosition);
        int writePosition = tail.getWritePosition() - tail.getReadPosition();
        int writePosition2 = foreignStolen.getWritePosition() - foreignStolen.getReadPosition();
        int packet_max_copy_size = PacketJVM.getPACKET_MAX_COPY_SIZE();
        if (writePosition2 >= packet_max_copy_size || writePosition2 > (tail.getCapacity() - tail.getLimit()) + (tail.getLimit() - tail.getWritePosition())) {
            writePosition2 = -1;
        }
        if (writePosition >= packet_max_copy_size || writePosition > foreignStolen.getStartGap() || !ChunkBuffer5.isExclusivelyOwned(foreignStolen)) {
            writePosition = -1;
        }
        if (writePosition2 == -1 && writePosition == -1) {
            appendChain$ktor_io(foreignStolen);
            return;
        }
        if (writePosition == -1 || writePosition2 <= writePosition) {
            BufferAppend.writeBufferAppend(tail, foreignStolen, (tail.getLimit() - tail.getWritePosition()) + (tail.getCapacity() - tail.getLimit()));
            afterHeadWrite();
            ChunkBuffer chunkBufferCleanNext = foreignStolen.cleanNext();
            if (chunkBufferCleanNext != null) {
                appendChain$ktor_io(chunkBufferCleanNext);
            }
            foreignStolen.release(pool);
            return;
        }
        if (writePosition2 == -1 || writePosition < writePosition2) {
            writePacketSlowPrepend(foreignStolen, tail);
            return;
        }
        throw new IllegalStateException("prep = " + writePosition + ", app = " + writePosition2);
    }

    private final void writePacketSlowPrepend(ChunkBuffer foreignStolen, ChunkBuffer tail) {
        BufferAppend.writeBufferPrepend(foreignStolen, tail);
        ChunkBuffer chunkBuffer = this._head;
        if (chunkBuffer == null) {
            throw new IllegalStateException("head should't be null since it is already handled in the fast-path");
        }
        if (chunkBuffer == tail) {
            this._head = foreignStolen;
        } else {
            while (true) {
                ChunkBuffer next = chunkBuffer.getNext();
                Intrinsics.checkNotNull(next);
                if (next == tail) {
                    break;
                } else {
                    chunkBuffer = next;
                }
            }
            chunkBuffer.setNext(foreignStolen);
        }
        tail.release(this.pool);
        this._tail = Buffers.findTail(foreignStolen);
    }

    public final void release() {
        close();
    }

    @PublishedApi
    public final void afterHeadWrite() {
        ChunkBuffer chunkBuffer = this._tail;
        if (chunkBuffer != null) {
            this.tailPosition = chunkBuffer.getWritePosition();
        }
    }

    private final void appendCharFallback(char c) {
        int i = 3;
        ChunkBuffer chunkBufferPrepareWriteHead = prepareWriteHead(3);
        try {
            ByteBuffer memory = chunkBufferPrepareWriteHead.getMemory();
            int writePosition = chunkBufferPrepareWriteHead.getWritePosition();
            if (c >= 0 && c < 128) {
                memory.put(writePosition, (byte) c);
                i = 1;
            } else if (128 <= c && c < 2048) {
                memory.put(writePosition, (byte) (((c >> 6) & 31) | 192));
                memory.put(writePosition + 1, (byte) ((c & '?') | 128));
                i = 2;
            } else if (2048 <= c && c < 0) {
                memory.put(writePosition, (byte) (((c >> '\f') & 15) | 224));
                memory.put(writePosition + 1, (byte) (((c >> 6) & 63) | 128));
                memory.put(writePosition + 2, (byte) ((c & '?') | 128));
            } else {
                if (0 > c || c >= 0) {
                    UTF83.malformedCodePoint(c);
                    throw new ExceptionsH();
                }
                memory.put(writePosition, (byte) (((c >> 18) & 7) | EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                memory.put(writePosition + 1, (byte) (((c >> '\f') & 63) | 128));
                memory.put(writePosition + 2, (byte) (((c >> 6) & 63) | 128));
                memory.put(writePosition + 3, (byte) ((c & '?') | 128));
                i = 4;
            }
            chunkBufferPrepareWriteHead.commitWritten(i);
            if (i < 0) {
                throw new IllegalStateException("The returned value shouldn't be negative");
            }
            afterHeadWrite();
        } catch (Throwable th) {
            afterHeadWrite();
            throw th;
        }
    }

    public final void afterBytesStolen$ktor_io() {
        ChunkBuffer head$ktor_io = getHead$ktor_io();
        if (head$ktor_io != ChunkBuffer.INSTANCE.getEmpty()) {
            if (head$ktor_io.getNext() != null) {
                throw new IllegalStateException("Check failed.");
            }
            head$ktor_io.resetForWrite();
            head$ktor_io.reserveEndGap(8);
            int writePosition = head$ktor_io.getWritePosition();
            this.tailPosition = writePosition;
            this.tailInitialPosition = writePosition;
            this.tailEndExclusive = head$ktor_io.getLimit();
        }
    }
}
