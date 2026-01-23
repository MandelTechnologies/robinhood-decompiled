package io.ktor.utils.p478io.core;

import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.extensions.ResourceTypes;
import com.singular.sdk.internal.Constants;
import io.ktor.utils.p478io.bits.MemoryJvm;
import io.ktor.utils.p478io.core.internal.ChunkBuffer;
import io.ktor.utils.p478io.core.internal.UTF82;
import io.ktor.utils.p478io.core.internal.UTF83;
import io.ktor.utils.p478io.core.internal.Unsafe;
import io.ktor.utils.p478io.pool.Pool3;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.Deprecated;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: Input.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b'\u0018\u0000 \u008e\u00012\u00060\u0001j\u0002`\u0002:\u0002\u008e\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\u0010\tJ\u0010\u00107\u001a\u0002082\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0015\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\u0004H\u0000¢\u0006\u0002\b;J\u0010\u0010<\u001a\u0002082\u0006\u0010=\u001a\u00020\u0004H\u0002J\u0010\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u0017H\u0002J\u0006\u0010A\u001a\u00020\u000fJ\b\u0010B\u001a\u000208H\u0016J\b\u0010C\u001a\u000208H$J\u000e\u0010D\u001a\u00020\u00172\u0006\u0010E\u001a\u00020\u0017J\u000e\u0010D\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u0006J\u0018\u0010F\u001a\u00020\u00172\u0006\u0010E\u001a\u00020\u00172\u0006\u0010G\u001a\u00020\u0017H\u0002J\u0019\u0010F\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u0006H\u0082\u0010J\u000e\u0010H\u001a\u0002082\u0006\u0010E\u001a\u00020\u0017J\n\u0010I\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010J\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020\u0006H\u0002J\u0012\u0010K\u001a\u0004\u0018\u00010\u00042\u0006\u0010L\u001a\u00020\u0004H\u0001J\u001b\u0010K\u001a\u0004\u0018\u00010\u00042\u0006\u0010L\u001a\u00020\u00042\u0006\u0010M\u001a\u00020\u0004H\u0082\u0010J\u0017\u0010N\u001a\u0004\u0018\u00010\u00042\u0006\u0010L\u001a\u00020\u0004H\u0000¢\u0006\u0002\bOJ\n\u0010P\u001a\u0004\u0018\u00010\u0004H\u0014J-\u0010P\u001a\u00020\u00172\u0006\u0010Q\u001a\u00020\u001e2\u0006\u0010R\u001a\u00020\u00172\u0006\u0010S\u001a\u00020\u0017H$ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bT\u0010UJ\u0015\u0010V\u001a\u0002082\u0006\u0010L\u001a\u00020\u0004H\u0000¢\u0006\u0002\bWJ\u0010\u0010X\u001a\u0002082\u0006\u0010L\u001a\u00020\u0004H\u0002J \u0010Y\u001a\u0002082\u0006\u0010L\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020\u00172\u0006\u0010[\u001a\u00020\u0017H\u0002J\u000e\u0010\\\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020\u0017J\b\u0010]\u001a\u000208H\u0004J\u0018\u0010^\u001a\u00020?2\u0006\u0010@\u001a\u00020\u00172\u0006\u0010_\u001a\u00020\u0017H\u0002J\u0010\u0010`\u001a\u00020?2\u0006\u0010a\u001a\u00020\u0017H\u0002J\u0010\u0010b\u001a\u00020?2\u0006\u0010E\u001a\u00020\u0017H\u0002JA\u0010c\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u001e2\u0006\u0010d\u001a\u00020\u00062\b\b\u0002\u0010R\u001a\u00020\u00062\b\b\u0002\u0010@\u001a\u00020\u00062\b\b\u0002\u0010_\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\be\u0010fJ\u000e\u0010c\u001a\u00020\u00172\u0006\u0010g\u001a\u00020\u0004J\u0015\u0010h\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020\u0006H\u0000¢\u0006\u0002\biJ\u0018\u0010j\u001a\u00020?2\u0006\u0010@\u001a\u00020\u00172\u0006\u0010k\u001a\u00020\u0017H\u0002J\u0012\u0010l\u001a\u0004\u0018\u00010\u00042\u0006\u0010a\u001a\u00020\u0017H\u0001J\u001a\u0010l\u001a\u0004\u0018\u00010\u00042\u0006\u0010a\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0004H\u0001J\u0017\u0010m\u001a\u0004\u0018\u00010\u00042\u0006\u0010a\u001a\u00020\u0017H\u0000¢\u0006\u0002\bnJ\u001b\u0010o\u001a\u0004\u0018\u00010\u00042\u0006\u0010a\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0004H\u0082\u0010J$\u0010p\u001a\u00020\u00172\n\u0010q\u001a\u00060rj\u0002`s2\u0006\u0010@\u001a\u00020\u00172\u0006\u0010_\u001a\u00020\u0017H\u0002J)\u0010t\u001a\u00020\u00172\u0006\u0010u\u001a\u00020v2\u0006\u0010R\u001a\u00020\u00172\u0006\u0010S\u001a\u00020\u00172\u0006\u0010k\u001a\u00020\u0017H\u0082\u0010J%\u0010w\u001a\u00020\u00172\u0006\u0010Q\u001a\u00020x2\u0006\u0010y\u001a\u00020\u00172\u0006\u0010z\u001a\u00020\u0017H\u0000¢\u0006\u0002\b{J\u0006\u0010|\u001a\u00020}J\b\u0010~\u001a\u00020}H\u0002J\u001b\u0010\u007f\u001a\u00030\u0080\u00012\b\b\u0002\u0010@\u001a\u00020\u00172\b\b\u0002\u0010_\u001a\u00020\u0017J&\u0010\u007f\u001a\u00020\u00172\n\u0010q\u001a\u00060rj\u0002`s2\b\b\u0002\u0010@\u001a\u00020\u00172\b\b\u0002\u0010_\u001a\u00020\u0017J\u0011\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u0082\u0001\u001a\u00020\u0017J\u001c\u0010\u0081\u0001\u001a\u0002082\n\u0010q\u001a\u00060rj\u0002`s2\u0007\u0010\u0082\u0001\u001a\u00020\u0017J%\u0010\u0083\u0001\u001a\u00020\u00172\n\u0010q\u001a\u00060rj\u0002`s2\u0006\u0010@\u001a\u00020\u00172\u0006\u0010_\u001a\u00020\u0017H\u0002J\u0007\u0010\u0084\u0001\u001a\u000208J\u0017\u0010\u0085\u0001\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0003\b\u0086\u0001J\u0011\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0003\b\u0088\u0001J\u0011\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0003\b\u008a\u0001J\u0007\u0010\u008b\u0001\u001a\u00020\u0017J\u0017\u0010\u008c\u0001\u001a\u00020\u000f2\u0006\u0010:\u001a\u00020\u0004H\u0000¢\u0006\u0003\b\u008d\u0001R\u001e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00048@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u00020\u00178\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR/\u0010\u001d\u001a\u00020\u001e8\u0000@\u0000X\u0081\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0016\n\u0002\u0010$\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010%\u001a\u00020\u00178\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b&\u0010\u0013\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001cR\u001b\u0010)\u001a\u00020\u00178À\u0002X\u0081\u0004¢\u0006\f\u0012\u0004\b*\u0010\u0013\u001a\u0004\b+\u0010\u001aR\u000e\u0010,\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b/\u00100R,\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00068\u0000@@X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b3\u0010\u0013\u001a\u0004\b4\u00100\"\u0004\b5\u00106\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008f\u0001"}, m3636d2 = {"Lio/ktor/utils/io/core/Input;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "head", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "remaining", "", "pool", "Lio/ktor/utils/io/pool/ObjectPool;", "(Lio/ktor/utils/io/core/internal/ChunkBuffer;JLio/ktor/utils/io/pool/ObjectPool;)V", "newHead", "_head", "set_head", "(Lio/ktor/utils/io/core/internal/ChunkBuffer;)V", "endOfInput", "", "getEndOfInput", "()Z", "getHead$annotations", "()V", "getHead", "()Lio/ktor/utils/io/core/internal/ChunkBuffer;", "headEndExclusive", "", "getHeadEndExclusive$annotations", "getHeadEndExclusive", "()I", "setHeadEndExclusive", "(I)V", "headMemory", "Lio/ktor/utils/io/bits/Memory;", "getHeadMemory-SK3TCg8$annotations", "getHeadMemory-SK3TCg8", "()Ljava/nio/ByteBuffer;", "setHeadMemory-3GNKZMM", "(Ljava/nio/ByteBuffer;)V", "Ljava/nio/ByteBuffer;", "headPosition", "getHeadPosition$annotations", "getHeadPosition", "setHeadPosition", "headRemaining", "getHeadRemaining$annotations", "getHeadRemaining", "noMoreChunksAvailable", "getPool", "()Lio/ktor/utils/io/pool/ObjectPool;", "getRemaining", "()J", "newValue", "tailRemaining", "getTailRemaining$annotations", "getTailRemaining", "setTailRemaining", "(J)V", "afterRead", "", "append", TransitionReason.OPTION_TRADE_CHAIN, "append$ktor_io", "appendView", "chunk", "atLeastMinCharactersRequire", "", "min", "canRead", "close", "closeSource", AnalyticsStrings.BUTTON_LIST_DISCARD, Constants.RequestParamsKeys.APP_NAME_KEY, "discardAsMuchAsPossible", "skipped", "discardExact", "doFill", "doPrefetch", "ensureNext", "current", "empty", "ensureNextHead", "ensureNextHead$ktor_io", "fill", "destination", "offset", "length", "fill-62zg_DM", "(Ljava/nio/ByteBuffer;II)I", "fixGapAfterRead", "fixGapAfterRead$ktor_io", "fixGapAfterReadFallback", "fixGapAfterReadFallbackUnreserved", "size", "overrun", "hasBytes", "markNoMoreChunksAvailable", "minShouldBeLess", AnalyticsStrings.MAX_WELCOME_TAG, "minSizeIsTooBig", "minSize", "notEnoughBytesAvailable", "peekTo", "destinationOffset", "peekTo-9zorpBc", "(Ljava/nio/ByteBuffer;JJJJ)J", "buffer", "prefetch", "prefetch$ktor_io", "prematureEndOfStreamChars", "copied", "prepareRead", "prepareReadHead", "prepareReadHead$ktor_io", "prepareReadLoop", "readASCII", "out", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "readAsMuchAsPossible", ResourceTypes.ARRAY, "", "readAvailableCharacters", "", "off", "len", "readAvailableCharacters$ktor_io", "readByte", "", "readByteSlow", "readText", "", "readTextExact", "exactCharacters", "readUtf8", "release", "releaseHead", "releaseHead$ktor_io", "steal", "steal$ktor_io", "stealAll", "stealAll$ktor_io", "tryPeek", "tryWriteAppend", "tryWriteAppend$ktor_io", "Companion", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@Deprecated
@SourceDebugExtension
/* loaded from: classes14.dex */
public abstract class Input implements Closeable {
    private ChunkBuffer _head;
    private int headEndExclusive;
    private ByteBuffer headMemory;
    private int headPosition;
    private boolean noMoreChunksAvailable;
    private final Pool3<ChunkBuffer> pool;
    private long tailRemaining;

    public Input() {
        this(null, 0L, null, 7, null);
    }

    @PublishedApi
    public static /* synthetic */ void getHead$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getHeadEndExclusive$annotations() {
    }

    @PublishedApi
    /* renamed from: getHeadMemory-SK3TCg8$annotations, reason: not valid java name */
    public static /* synthetic */ void m28478getHeadMemorySK3TCg8$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getHeadPosition$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getHeadRemaining$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getTailRemaining$annotations() {
    }

    protected abstract void closeSource();

    /* renamed from: fill-62zg_DM */
    protected abstract int mo27243fill62zg_DM(ByteBuffer destination, int offset, int length);

    public Input(ChunkBuffer head, long j, Pool3<ChunkBuffer> pool) {
        Intrinsics.checkNotNullParameter(head, "head");
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.pool = pool;
        this._head = head;
        this.headMemory = head.getMemory();
        this.headPosition = head.getReadPosition();
        this.headEndExclusive = head.getWritePosition();
        this.tailRemaining = j - (r3 - this.headPosition);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Input(ChunkBuffer chunkBuffer, long j, Pool3 pool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        chunkBuffer = (i & 1) != 0 ? ChunkBuffer.INSTANCE.getEmpty() : chunkBuffer;
        this(chunkBuffer, (i & 2) != 0 ? Buffers.remainingAll(chunkBuffer) : j, (i & 4) != 0 ? ChunkBuffer.INSTANCE.getPool() : pool3);
    }

    public final Pool3<ChunkBuffer> getPool() {
        return this.pool;
    }

    private final void set_head(ChunkBuffer chunkBuffer) {
        this._head = chunkBuffer;
        this.headMemory = chunkBuffer.getMemory();
        this.headPosition = chunkBuffer.getReadPosition();
        this.headEndExclusive = chunkBuffer.getWritePosition();
    }

    public final ChunkBuffer getHead() {
        ChunkBuffer chunkBuffer = this._head;
        chunkBuffer.discardUntilIndex$ktor_io(this.headPosition);
        return chunkBuffer;
    }

    /* renamed from: getHeadMemory-SK3TCg8, reason: not valid java name and from getter */
    public final ByteBuffer getHeadMemory() {
        return this.headMemory;
    }

    /* renamed from: setHeadMemory-3GNKZMM, reason: not valid java name */
    public final void m28482setHeadMemory3GNKZMM(ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<set-?>");
        this.headMemory = byteBuffer;
    }

    public final int getHeadPosition() {
        return this.headPosition;
    }

    public final void setHeadPosition(int i) {
        this.headPosition = i;
    }

    public final int getHeadEndExclusive() {
        return this.headEndExclusive;
    }

    public final void setHeadEndExclusive(int i) {
        this.headEndExclusive = i;
    }

    private final void afterRead(ChunkBuffer head) {
        if (head.getWritePosition() - head.getReadPosition() == 0) {
            releaseHead$ktor_io(head);
        }
    }

    public final long getTailRemaining() {
        return this.tailRemaining;
    }

    public final void setTailRemaining(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(("tailRemaining shouldn't be negative: " + j).toString());
        }
        this.tailRemaining = j;
    }

    private final ChunkBuffer prepareReadLoop(int minSize, ChunkBuffer head) {
        while (true) {
            int headEndExclusive = getHeadEndExclusive() - getHeadPosition();
            if (headEndExclusive >= minSize) {
                return head;
            }
            ChunkBuffer next = head.getNext();
            if (next == null && (next = doFill()) == null) {
                return null;
            }
            if (headEndExclusive == 0) {
                if (head != ChunkBuffer.INSTANCE.getEmpty()) {
                    releaseHead$ktor_io(head);
                }
                head = next;
            } else {
                int iWriteBufferAppend = BufferAppend.writeBufferAppend(head, next, minSize - headEndExclusive);
                this.headEndExclusive = head.getWritePosition();
                setTailRemaining(this.tailRemaining - iWriteBufferAppend);
                if (next.getWritePosition() <= next.getReadPosition()) {
                    head.setNext(null);
                    head.setNext(next.cleanNext());
                    next.release(this.pool);
                } else {
                    next.reserveStartGap(iWriteBufferAppend);
                }
                if (head.getWritePosition() - head.getReadPosition() >= minSize) {
                    return head;
                }
                if (minSize > 8) {
                    minSizeIsTooBig(minSize);
                    throw new ExceptionsH();
                }
            }
        }
    }

    public final boolean getEndOfInput() {
        if (getHeadEndExclusive() - getHeadPosition() == 0 && this.tailRemaining == 0) {
            return this.noMoreChunksAvailable || doFill() == null;
        }
        return false;
    }

    public final int getHeadRemaining() {
        return getHeadEndExclusive() - getHeadPosition();
    }

    public final long getRemaining() {
        return (getHeadEndExclusive() - getHeadPosition()) + this.tailRemaining;
    }

    public final boolean hasBytes(int n) {
        return ((long) (getHeadEndExclusive() - getHeadPosition())) + this.tailRemaining >= ((long) n);
    }

    public final boolean prefetch$ktor_io(long min) {
        if (min <= 0) {
            return true;
        }
        long headEndExclusive = getHeadEndExclusive() - getHeadPosition();
        if (headEndExclusive >= min || headEndExclusive + this.tailRemaining >= min) {
            return true;
        }
        return doPrefetch(min);
    }

    /* renamed from: peekTo-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ long m28479peekTo9zorpBc$default(Input input, ByteBuffer byteBuffer, long j, long j2, long j3, long j4, int i, Object obj) {
        if (obj == null) {
            return input.m28481peekTo9zorpBc(byteBuffer, j, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? 1L : j3, (i & 16) != 0 ? Long.MAX_VALUE : j4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: peekTo-9zorpBc");
    }

    /* renamed from: peekTo-9zorpBc, reason: not valid java name */
    public final long m28481peekTo9zorpBc(ByteBuffer destination, long destinationOffset, long offset, long min, long max) {
        ByteBuffer destination2 = destination;
        Intrinsics.checkNotNullParameter(destination2, "destination");
        prefetch$ktor_io(min + offset);
        ChunkBuffer head = getHead();
        long jMin = Math.min(max, destination2.limit() - destinationOffset);
        long j = destinationOffset;
        ChunkBuffer next = head;
        long j2 = 0;
        long j3 = offset;
        while (j2 < min && j2 < jMin) {
            long writePosition = next.getWritePosition() - next.getReadPosition();
            if (writePosition > j3) {
                long jMin2 = Math.min(writePosition - j3, jMin - j2);
                MemoryJvm.m28470copyToJT6ljtQ(next.getMemory(), destination2, next.getReadPosition() + j3, jMin2, j);
                j2 += jMin2;
                j += jMin2;
                j3 = 0;
            } else {
                j3 -= writePosition;
            }
            next = next.getNext();
            if (next == null) {
                return j2;
            }
            destination2 = destination;
        }
        return j2;
    }

    private final boolean doPrefetch(long min) {
        ChunkBuffer chunkBufferFindTail = Buffers.findTail(this._head);
        long headEndExclusive = (getHeadEndExclusive() - getHeadPosition()) + this.tailRemaining;
        do {
            ChunkBuffer chunkBufferFill = fill();
            if (chunkBufferFill != null) {
                int writePosition = chunkBufferFill.getWritePosition() - chunkBufferFill.getReadPosition();
                if (chunkBufferFindTail == ChunkBuffer.INSTANCE.getEmpty()) {
                    set_head(chunkBufferFill);
                    chunkBufferFindTail = chunkBufferFill;
                } else {
                    chunkBufferFindTail.setNext(chunkBufferFill);
                    setTailRemaining(this.tailRemaining + writePosition);
                }
                headEndExclusive += writePosition;
            } else {
                this.noMoreChunksAvailable = true;
                return false;
            }
        } while (headEndExclusive < min);
        return true;
    }

    public final boolean canRead() {
        return (this.headPosition == this.headEndExclusive && this.tailRemaining == 0) ? false : true;
    }

    public final void release() {
        ChunkBuffer head = getHead();
        ChunkBuffer empty = ChunkBuffer.INSTANCE.getEmpty();
        if (head != empty) {
            set_head(empty);
            setTailRemaining(0L);
            Buffers.releaseAll(head, this.pool);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        release();
        if (!this.noMoreChunksAvailable) {
            this.noMoreChunksAvailable = true;
        }
        closeSource();
    }

    public final ChunkBuffer stealAll$ktor_io() {
        ChunkBuffer head = getHead();
        ChunkBuffer empty = ChunkBuffer.INSTANCE.getEmpty();
        if (head == empty) {
            return null;
        }
        set_head(empty);
        setTailRemaining(0L);
        return head;
    }

    public final ChunkBuffer steal$ktor_io() {
        ChunkBuffer head = getHead();
        ChunkBuffer next = head.getNext();
        ChunkBuffer empty = ChunkBuffer.INSTANCE.getEmpty();
        if (head == empty) {
            return null;
        }
        if (next == null) {
            set_head(empty);
            setTailRemaining(0L);
        } else {
            set_head(next);
            setTailRemaining(this.tailRemaining - (next.getWritePosition() - next.getReadPosition()));
        }
        head.setNext(null);
        return head;
    }

    public final void append$ktor_io(ChunkBuffer chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        ChunkBuffer.Companion companion = ChunkBuffer.INSTANCE;
        if (chain == companion.getEmpty()) {
            return;
        }
        long jRemainingAll = Buffers.remainingAll(chain);
        if (this._head == companion.getEmpty()) {
            set_head(chain);
            setTailRemaining(jRemainingAll - (getHeadEndExclusive() - getHeadPosition()));
        } else {
            Buffers.findTail(this._head).setNext(chain);
            setTailRemaining(this.tailRemaining + jRemainingAll);
        }
    }

    public final boolean tryWriteAppend$ktor_io(ChunkBuffer chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        ChunkBuffer chunkBufferFindTail = Buffers.findTail(getHead());
        int writePosition = chain.getWritePosition() - chain.getReadPosition();
        if (writePosition == 0 || chunkBufferFindTail.getLimit() - chunkBufferFindTail.getWritePosition() < writePosition) {
            return false;
        }
        BufferAppend.writeBufferAppend(chunkBufferFindTail, chain, writePosition);
        if (getHead() == chunkBufferFindTail) {
            this.headEndExclusive = chunkBufferFindTail.getWritePosition();
            return true;
        }
        setTailRemaining(this.tailRemaining + writePosition);
        return true;
    }

    public final byte readByte() {
        int i = this.headPosition;
        int i2 = i + 1;
        if (i2 < this.headEndExclusive) {
            this.headPosition = i2;
            return this.headMemory.get(i);
        }
        return readByteSlow();
    }

    private final byte readByteSlow() throws EOFException {
        int i = this.headPosition;
        if (i < this.headEndExclusive) {
            byte b = this.headMemory.get(i);
            this.headPosition = i;
            ChunkBuffer chunkBuffer = this._head;
            chunkBuffer.discardUntilIndex$ktor_io(i);
            ensureNext(chunkBuffer);
            return b;
        }
        ChunkBuffer chunkBufferPrepareRead = prepareRead(1);
        if (chunkBufferPrepareRead == null) {
            StringsKt.prematureEndOfStream(1);
            throw new ExceptionsH();
        }
        byte b2 = chunkBufferPrepareRead.readByte();
        Unsafe.completeReadHead(this, chunkBufferPrepareRead);
        return b2;
    }

    public final int discard(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(("Negative discard is not allowed: " + n).toString());
        }
        return discardAsMuchAsPossible(n, 0);
    }

    public final void discardExact(int n) throws EOFException {
        if (discard(n) == n) {
            return;
        }
        throw new EOFException("Unable to discard " + n + " bytes due to end of packet");
    }

    public final int tryPeek() {
        ChunkBuffer chunkBufferPrepareReadLoop;
        ChunkBuffer head = getHead();
        if (getHeadEndExclusive() - getHeadPosition() > 0) {
            return head.tryPeekByte();
        }
        if ((this.tailRemaining == 0 && this.noMoreChunksAvailable) || (chunkBufferPrepareReadLoop = prepareReadLoop(1, head)) == null) {
            return -1;
        }
        return chunkBufferPrepareReadLoop.tryPeekByte();
    }

    public final int peekTo(ChunkBuffer buffer) throws Buffer3 {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        ChunkBuffer chunkBufferPrepareReadHead$ktor_io = prepareReadHead$ktor_io(1);
        if (chunkBufferPrepareReadHead$ktor_io == null) {
            return -1;
        }
        int iMin = Math.min(buffer.getLimit() - buffer.getWritePosition(), chunkBufferPrepareReadHead$ktor_io.getWritePosition() - chunkBufferPrepareReadHead$ktor_io.getReadPosition());
        BufferPrimitives.writeFully(buffer, chunkBufferPrepareReadHead$ktor_io, iMin);
        return iMin;
    }

    public final long discard(long n) {
        if (n <= 0) {
            return 0L;
        }
        return discardAsMuchAsPossible(n, 0L);
    }

    public final int readAvailableCharacters$ktor_io(final char[] destination, final int off, int len) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (getEndOfInput()) {
            return -1;
        }
        return readText(new Appendable(off, destination) { // from class: io.ktor.utils.io.core.Input$readAvailableCharacters$out$1
            final /* synthetic */ char[] $destination;
            private int idx;

            {
                this.$destination = destination;
                this.idx = off;
            }

            @Override // java.lang.Appendable
            public Appendable append(char value) {
                char[] cArr = this.$destination;
                int i = this.idx;
                this.idx = i + 1;
                cArr[i] = value;
                return this;
            }

            @Override // java.lang.Appendable
            public Appendable append(CharSequence value) {
                if (value instanceof String) {
                    String str = (String) value;
                    StringsJVM.getCharsInternal(str, this.$destination, this.idx);
                    this.idx += str.length();
                    return this;
                }
                if (value != null) {
                    int length = value.length();
                    for (int i = 0; i < length; i++) {
                        char[] cArr = this.$destination;
                        int i2 = this.idx;
                        this.idx = i2 + 1;
                        cArr[i2] = value.charAt(i);
                    }
                }
                return this;
            }

            @Override // java.lang.Appendable
            public Appendable append(CharSequence value, int startIndex, int endIndex) {
                throw new UnsupportedOperationException();
            }
        }, 0, len);
    }

    public static /* synthetic */ int readText$default(Input input, Appendable appendable, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readText");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return input.readText(appendable, i, i2);
    }

    public final int readText(Appendable out, int min, int max) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        if (max >= getRemaining()) {
            String textExactBytes$default = StringsKt.readTextExactBytes$default(this, (int) getRemaining(), null, 2, null);
            out.append(textExactBytes$default);
            return textExactBytes$default.length();
        }
        return readASCII(out, min, max);
    }

    public final void readTextExact(Appendable out, int exactCharacters) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        readText(out, exactCharacters, exactCharacters);
    }

    public static /* synthetic */ String readText$default(Input input, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readText");
        }
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return input.readText(i, i2);
    }

    public final String readText(int min, int max) throws Throwable {
        if (min == 0 && (max == 0 || getEndOfInput())) {
            return "";
        }
        long remaining = getRemaining();
        if (remaining > 0 && max >= remaining) {
            return StringsKt.readTextExactBytes$default(this, (int) remaining, null, 2, null);
        }
        StringBuilder sb = new StringBuilder(RangesKt.coerceAtMost(RangesKt.coerceAtLeast(min, 16), max));
        readASCII(sb, min, max);
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder(capacity).…builderAction).toString()");
        return string2;
    }

    public final String readTextExact(int exactCharacters) {
        return readText(exactCharacters, exactCharacters);
    }

    private final int readASCII(Appendable out, int min, int max) throws Throwable {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (max == 0 && min == 0) {
            return 0;
        }
        if (getEndOfInput()) {
            if (min == 0) {
                return 0;
            }
            atLeastMinCharactersRequire(min);
            throw new ExceptionsH();
        }
        if (max < min) {
            minShouldBeLess(min, max);
            throw new ExceptionsH();
        }
        ChunkBuffer chunkBufferPrepareReadFirstHead = Unsafe.prepareReadFirstHead(this, 1);
        if (chunkBufferPrepareReadFirstHead == null) {
            i = 0;
        } else {
            i = 0;
            boolean z5 = false;
            while (true) {
                try {
                    ByteBuffer memory = chunkBufferPrepareReadFirstHead.getMemory();
                    int readPosition = chunkBufferPrepareReadFirstHead.getReadPosition();
                    int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition();
                    for (int i2 = readPosition; i2 < writePosition; i2++) {
                        byte b = memory.get(i2);
                        int i3 = b & 255;
                        if ((b & 128) != 128) {
                            char c = (char) i3;
                            if (i == max) {
                                z3 = false;
                            } else {
                                out.append(c);
                                i++;
                                z3 = true;
                            }
                            if (z3) {
                            }
                        }
                        chunkBufferPrepareReadFirstHead.discardExact(i2 - readPosition);
                        z = false;
                        break;
                    }
                    chunkBufferPrepareReadFirstHead.discardExact(writePosition - readPosition);
                    z = true;
                    if (z) {
                        z2 = true;
                    } else if (i == max) {
                        z2 = false;
                    } else {
                        z2 = false;
                        z5 = true;
                    }
                    if (z2) {
                        try {
                            chunkBufferPrepareReadFirstHead = Unsafe.prepareReadNextHead(this, chunkBufferPrepareReadFirstHead);
                            if (chunkBufferPrepareReadFirstHead == null) {
                                break;
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (z4) {
                                Unsafe.completeReadHead(this, chunkBufferPrepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else {
                        Unsafe.completeReadHead(this, chunkBufferPrepareReadFirstHead);
                        break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z4 = true;
                }
            }
            z4 = z5;
        }
        if (z4) {
            return i + readUtf8(out, min - i, max - i);
        }
        if (i >= min) {
            return i;
        }
        prematureEndOfStreamChars(min, i);
        throw new ExceptionsH();
    }

    private final Void atLeastMinCharactersRequire(int min) throws EOFException {
        throw new EOFException("at least " + min + " characters required but no bytes available");
    }

    private final Void minShouldBeLess(int min, int max) {
        throw new IllegalArgumentException("min should be less or equal to max but min = " + min + ", max = " + max);
    }

    private final Void prematureEndOfStreamChars(int min, int copied) throws UTF82 {
        throw new UTF82("Premature end of stream: expected at least " + min + " chars but had only " + copied);
    }

    private final long discardAsMuchAsPossible(long n, long skipped) {
        ChunkBuffer chunkBufferPrepareRead;
        while (n != 0 && (chunkBufferPrepareRead = prepareRead(1)) != null) {
            int iMin = (int) Math.min(chunkBufferPrepareRead.getWritePosition() - chunkBufferPrepareRead.getReadPosition(), n);
            chunkBufferPrepareRead.discardExact(iMin);
            this.headPosition += iMin;
            afterRead(chunkBufferPrepareRead);
            long j = iMin;
            n -= j;
            skipped += j;
        }
        return skipped;
    }

    private final int discardAsMuchAsPossible(int n, int skipped) {
        while (n != 0) {
            ChunkBuffer chunkBufferPrepareRead = prepareRead(1);
            if (chunkBufferPrepareRead == null) {
                break;
            }
            int iMin = Math.min(chunkBufferPrepareRead.getWritePosition() - chunkBufferPrepareRead.getReadPosition(), n);
            chunkBufferPrepareRead.discardExact(iMin);
            this.headPosition += iMin;
            afterRead(chunkBufferPrepareRead);
            n -= iMin;
            skipped += iMin;
        }
        return skipped;
    }

    private final int readAsMuchAsPossible(byte[] array2, int offset, int length, int copied) throws EOFException {
        while (length != 0) {
            ChunkBuffer chunkBufferPrepareRead = prepareRead(1);
            if (chunkBufferPrepareRead == null) {
                break;
            }
            int iMin = Math.min(length, chunkBufferPrepareRead.getWritePosition() - chunkBufferPrepareRead.getReadPosition());
            BufferPrimitives.readFully(chunkBufferPrepareRead, array2, offset, iMin);
            this.headPosition = chunkBufferPrepareRead.getReadPosition();
            if (iMin == length && chunkBufferPrepareRead.getWritePosition() - chunkBufferPrepareRead.getReadPosition() != 0) {
                return copied + iMin;
            }
            afterRead(chunkBufferPrepareRead);
            offset += iMin;
            length -= iMin;
            copied += iMin;
        }
        return copied;
    }

    private final Void notEnoughBytesAvailable(int n) throws EOFException {
        throw new EOFException("Not enough data in packet (" + getRemaining() + ") to read " + n + " byte(s)");
    }

    public final ChunkBuffer prepareReadHead$ktor_io(int minSize) {
        return prepareReadLoop(minSize, getHead());
    }

    public final ChunkBuffer ensureNextHead$ktor_io(ChunkBuffer current) {
        Intrinsics.checkNotNullParameter(current, "current");
        return ensureNext(current);
    }

    @PublishedApi
    public final ChunkBuffer ensureNext(ChunkBuffer current) {
        Intrinsics.checkNotNullParameter(current, "current");
        return ensureNext(current, ChunkBuffer.INSTANCE.getEmpty());
    }

    public final void fixGapAfterRead$ktor_io(ChunkBuffer current) {
        Intrinsics.checkNotNullParameter(current, "current");
        ChunkBuffer next = current.getNext();
        if (next == null) {
            fixGapAfterReadFallback(current);
            return;
        }
        int writePosition = current.getWritePosition() - current.getReadPosition();
        int iMin = Math.min(writePosition, 8 - (current.getCapacity() - current.getLimit()));
        if (next.getStartGap() < iMin) {
            fixGapAfterReadFallback(current);
            return;
        }
        Buffer2.restoreStartGap(next, iMin);
        if (writePosition > iMin) {
            current.releaseEndGap$ktor_io();
            this.headEndExclusive = current.getWritePosition();
            setTailRemaining(this.tailRemaining + iMin);
        } else {
            set_head(next);
            setTailRemaining(this.tailRemaining - ((next.getWritePosition() - next.getReadPosition()) - iMin));
            current.cleanNext();
            current.release(this.pool);
        }
    }

    private final void fixGapAfterReadFallback(ChunkBuffer current) {
        if (!this.noMoreChunksAvailable || current.getNext() != null) {
            int writePosition = current.getWritePosition() - current.getReadPosition();
            int iMin = Math.min(writePosition, 8 - (current.getCapacity() - current.getLimit()));
            if (writePosition > iMin) {
                fixGapAfterReadFallbackUnreserved(current, writePosition, iMin);
            } else {
                ChunkBuffer chunkBufferBorrow = this.pool.borrow();
                chunkBufferBorrow.reserveEndGap(8);
                chunkBufferBorrow.setNext(current.cleanNext());
                BufferAppend.writeBufferAppend(chunkBufferBorrow, current, writePosition);
                set_head(chunkBufferBorrow);
            }
            current.release(this.pool);
            return;
        }
        this.headPosition = current.getReadPosition();
        this.headEndExclusive = current.getWritePosition();
        setTailRemaining(0L);
    }

    private final void fixGapAfterReadFallbackUnreserved(ChunkBuffer current, int size, int overrun) {
        ChunkBuffer chunkBufferBorrow = this.pool.borrow();
        ChunkBuffer chunkBufferBorrow2 = this.pool.borrow();
        chunkBufferBorrow.reserveEndGap(8);
        chunkBufferBorrow2.reserveEndGap(8);
        chunkBufferBorrow.setNext(chunkBufferBorrow2);
        chunkBufferBorrow2.setNext(current.cleanNext());
        BufferAppend.writeBufferAppend(chunkBufferBorrow, current, size - overrun);
        BufferAppend.writeBufferAppend(chunkBufferBorrow2, current, overrun);
        set_head(chunkBufferBorrow);
        setTailRemaining(Buffers.remainingAll(chunkBufferBorrow2));
    }

    private final ChunkBuffer ensureNext(ChunkBuffer current, ChunkBuffer empty) {
        while (current != empty) {
            ChunkBuffer chunkBufferCleanNext = current.cleanNext();
            current.release(this.pool);
            if (chunkBufferCleanNext != null) {
                if (chunkBufferCleanNext.getWritePosition() > chunkBufferCleanNext.getReadPosition()) {
                    set_head(chunkBufferCleanNext);
                    setTailRemaining(this.tailRemaining - (chunkBufferCleanNext.getWritePosition() - chunkBufferCleanNext.getReadPosition()));
                    return chunkBufferCleanNext;
                }
                current = chunkBufferCleanNext;
            } else {
                set_head(empty);
                setTailRemaining(0L);
                current = empty;
            }
        }
        return doFill();
    }

    protected ChunkBuffer fill() {
        ChunkBuffer chunkBufferBorrow = this.pool.borrow();
        try {
            chunkBufferBorrow.reserveEndGap(8);
            int iMo27243fill62zg_DM = mo27243fill62zg_DM(chunkBufferBorrow.getMemory(), chunkBufferBorrow.getWritePosition(), chunkBufferBorrow.getLimit() - chunkBufferBorrow.getWritePosition());
            if (iMo27243fill62zg_DM == 0) {
                this.noMoreChunksAvailable = true;
                if (chunkBufferBorrow.getWritePosition() <= chunkBufferBorrow.getReadPosition()) {
                    chunkBufferBorrow.release(this.pool);
                    return null;
                }
            }
            chunkBufferBorrow.commitWritten(iMo27243fill62zg_DM);
            return chunkBufferBorrow;
        } catch (Throwable th) {
            chunkBufferBorrow.release(this.pool);
            throw th;
        }
    }

    protected final void markNoMoreChunksAvailable() {
        if (this.noMoreChunksAvailable) {
            return;
        }
        this.noMoreChunksAvailable = true;
    }

    private final ChunkBuffer doFill() {
        if (this.noMoreChunksAvailable) {
            return null;
        }
        ChunkBuffer chunkBufferFill = fill();
        if (chunkBufferFill == null) {
            this.noMoreChunksAvailable = true;
            return null;
        }
        appendView(chunkBufferFill);
        return chunkBufferFill;
    }

    private final void appendView(ChunkBuffer chunk) {
        ChunkBuffer chunkBufferFindTail = Buffers.findTail(this._head);
        if (chunkBufferFindTail == ChunkBuffer.INSTANCE.getEmpty()) {
            set_head(chunk);
            if (this.tailRemaining != 0) {
                throw new IllegalStateException("It should be no tail remaining bytes if current tail is EmptyBuffer");
            }
            ChunkBuffer next = chunk.getNext();
            setTailRemaining(next != null ? Buffers.remainingAll(next) : 0L);
            return;
        }
        chunkBufferFindTail.setNext(chunk);
        setTailRemaining(this.tailRemaining + Buffers.remainingAll(chunk));
    }

    @PublishedApi
    public final ChunkBuffer prepareRead(int minSize) {
        ChunkBuffer head = getHead();
        return this.headEndExclusive - this.headPosition >= minSize ? head : prepareReadLoop(minSize, head);
    }

    @PublishedApi
    public final ChunkBuffer prepareRead(int minSize, ChunkBuffer head) {
        Intrinsics.checkNotNullParameter(head, "head");
        return this.headEndExclusive - this.headPosition >= minSize ? head : prepareReadLoop(minSize, head);
    }

    private final Void minSizeIsTooBig(int minSize) {
        throw new IllegalStateException("minSize of " + minSize + " is too big (should be less than 8)");
    }

    public final ChunkBuffer releaseHead$ktor_io(ChunkBuffer head) {
        Intrinsics.checkNotNullParameter(head, "head");
        ChunkBuffer chunkBufferCleanNext = head.cleanNext();
        if (chunkBufferCleanNext == null) {
            chunkBufferCleanNext = ChunkBuffer.INSTANCE.getEmpty();
        }
        set_head(chunkBufferCleanNext);
        setTailRemaining(this.tailRemaining - (chunkBufferCleanNext.getWritePosition() - chunkBufferCleanNext.getReadPosition()));
        head.release(this.pool);
        return chunkBufferCleanNext;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        r5.discardExact(r11 - r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int readUtf8(Appendable out, int min, int max) throws Throwable {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ChunkBuffer chunkBufferPrepareReadNextHead;
        int i7;
        int i8 = 1;
        ChunkBuffer chunkBufferPrepareReadFirstHead = Unsafe.prepareReadFirstHead(this, 1);
        if (chunkBufferPrepareReadFirstHead == null) {
            i7 = 0;
        } else {
            int i9 = 1;
            int i10 = 0;
            while (true) {
                try {
                    int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                    if (writePosition >= i9) {
                        try {
                            ByteBuffer memory = chunkBufferPrepareReadFirstHead.getMemory();
                            int readPosition = chunkBufferPrepareReadFirstHead.getReadPosition();
                            int writePosition2 = chunkBufferPrepareReadFirstHead.getWritePosition();
                            int i11 = readPosition;
                            int i12 = 0;
                            int i13 = 0;
                            int i14 = 0;
                            while (true) {
                                if (i11 >= writePosition2) {
                                    i = i8;
                                    chunkBufferPrepareReadFirstHead.discardExact(writePosition2 - readPosition);
                                    i2 = 0;
                                    break;
                                }
                                byte b = memory.get(i11);
                                i = i8;
                                int i15 = b & 255;
                                i2 = -1;
                                if ((b & 128) == 0) {
                                    if (i12 != 0) {
                                        UTF83.malformedByteCount(i12);
                                        throw new ExceptionsH();
                                    }
                                    char c = (char) i15;
                                    if (i10 == max) {
                                        i6 = 0;
                                    } else {
                                        out.append(c);
                                        i10++;
                                        i6 = i;
                                    }
                                    if (i6 == 0) {
                                        try {
                                            break;
                                        } catch (Throwable th) {
                                            th = th;
                                            chunkBufferPrepareReadFirstHead.getWritePosition();
                                            chunkBufferPrepareReadFirstHead.getReadPosition();
                                            throw th;
                                        }
                                    }
                                    i11++;
                                    i8 = i;
                                } else if (i12 == 0) {
                                    int i16 = 128;
                                    i13 = i15;
                                    for (int i17 = i; i17 < 7 && (i13 & i16) != 0; i17++) {
                                        i13 &= ~i16;
                                        i16 >>= 1;
                                        i12++;
                                    }
                                    int i18 = i12 - 1;
                                    if (i12 > writePosition2 - i11) {
                                        chunkBufferPrepareReadFirstHead.discardExact(i11 - readPosition);
                                        i2 = i12;
                                        break;
                                    }
                                    i14 = i12;
                                    i12 = i18;
                                    i11++;
                                    i8 = i;
                                } else {
                                    i13 = (i13 << 6) | (b & 127);
                                    i12--;
                                    if (i12 != 0) {
                                        continue;
                                    } else if (UTF83.isBmpCodePoint(i13)) {
                                        char c2 = (char) i13;
                                        if (i10 == max) {
                                            i5 = 0;
                                        } else {
                                            out.append(c2);
                                            i10++;
                                            i5 = i;
                                        }
                                        if (i5 == 0) {
                                            chunkBufferPrepareReadFirstHead.discardExact(((i11 - readPosition) - i14) + 1);
                                            break;
                                        }
                                        i13 = 0;
                                    } else {
                                        if (!UTF83.isValidCodePoint(i13)) {
                                            UTF83.malformedCodePoint(i13);
                                            throw new ExceptionsH();
                                        }
                                        char cHighSurrogate = (char) UTF83.highSurrogate(i13);
                                        if (i10 == max) {
                                            i3 = 0;
                                        } else {
                                            out.append(cHighSurrogate);
                                            i10++;
                                            i3 = i;
                                        }
                                        if (i3 == 0) {
                                            break;
                                        }
                                        char cLowSurrogate = (char) UTF83.lowSurrogate(i13);
                                        if (i10 == max) {
                                            i4 = 0;
                                        } else {
                                            out.append(cLowSurrogate);
                                            i10++;
                                            i4 = i;
                                        }
                                        if (i4 == 0) {
                                            break;
                                        }
                                        i13 = 0;
                                    }
                                    i11++;
                                    i8 = i;
                                }
                            }
                            chunkBufferPrepareReadFirstHead.discardExact(((i11 - readPosition) - i14) + 1);
                            i9 = i2 == 0 ? i : i2 > 0 ? i2 : 0;
                            try {
                                writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                            } catch (Throwable th2) {
                                th = th2;
                                i8 = i;
                                if (i8 != 0) {
                                    Unsafe.completeReadHead(this, chunkBufferPrepareReadFirstHead);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            i = i8;
                        }
                    } else {
                        i = i8;
                    }
                    if (writePosition == 0) {
                        try {
                            chunkBufferPrepareReadNextHead = Unsafe.prepareReadNextHead(this, chunkBufferPrepareReadFirstHead);
                        } catch (Throwable th4) {
                            th = th4;
                            i8 = 0;
                            if (i8 != 0) {
                            }
                            throw th;
                        }
                    } else if (writePosition < i9 || chunkBufferPrepareReadFirstHead.getCapacity() - chunkBufferPrepareReadFirstHead.getLimit() < 8) {
                        Unsafe.completeReadHead(this, chunkBufferPrepareReadFirstHead);
                        chunkBufferPrepareReadNextHead = Unsafe.prepareReadFirstHead(this, i9);
                    } else {
                        chunkBufferPrepareReadNextHead = chunkBufferPrepareReadFirstHead;
                    }
                    if (chunkBufferPrepareReadNextHead == null) {
                        i8 = 0;
                        break;
                    }
                    chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                    i8 = i;
                    if (i9 <= 0) {
                        break;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
            if (i8 != 0) {
                Unsafe.completeReadHead(this, chunkBufferPrepareReadFirstHead);
            }
            i7 = i10;
        }
        if (i7 >= min) {
            return i7;
        }
        prematureEndOfStreamChars(min, i7);
        throw new ExceptionsH();
    }
}
