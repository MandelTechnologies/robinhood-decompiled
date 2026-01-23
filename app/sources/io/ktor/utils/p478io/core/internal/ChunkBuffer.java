package io.ktor.utils.p478io.core.internal;

import androidx.concurrent.futures.C2031xc40028dd;
import io.ktor.utils.p478io.bits.MemoryFactoryJvm;
import io.ktor.utils.p478io.bits.MemoryJvm;
import io.ktor.utils.p478io.core.Buffer;
import io.ktor.utils.p478io.core.BufferFactory;
import io.ktor.utils.p478io.pool.Pool2;
import io.ktor.utils.p478io.pool.Pool3;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ChunkBuffer.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0005\b\u0017\u0018\u0000 ,2\u00020\u0001:\u0001,B,\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u0011\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u0014R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R(\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010!\u001a\u0004\u0018\u00010\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u000eR(\u0010'\u001a\u0004\u0018\u00010\u00002\b\u0010$\u001a\u0004\u0018\u00010\u00008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\u000e\"\u0004\b&\u0010\fR\u0011\u0010+\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, m3636d2 = {"Lio/ktor/utils/io/core/internal/ChunkBuffer;", "Lio/ktor/utils/io/core/Buffer;", "Lio/ktor/utils/io/bits/Memory;", "memory", "origin", "Lio/ktor/utils/io/pool/ObjectPool;", "parentPool", "<init>", "(Ljava/nio/ByteBuffer;Lio/ktor/utils/io/core/internal/ChunkBuffer;Lio/ktor/utils/io/pool/ObjectPool;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "chunk", "", "appendNext", "(Lio/ktor/utils/io/core/internal/ChunkBuffer;)V", "cleanNext", "()Lio/ktor/utils/io/core/internal/ChunkBuffer;", "duplicate", "pool", "release", "(Lio/ktor/utils/io/pool/ObjectPool;)V", "unlink$ktor_io", "()V", "unlink", "acquire$ktor_io", "acquire", "unpark$ktor_io", "unpark", "", "release$ktor_io", "()Z", "reset", "Lio/ktor/utils/io/pool/ObjectPool;", "getParentPool$ktor_io", "()Lio/ktor/utils/io/pool/ObjectPool;", "<set-?>", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "getOrigin", "newValue", "getNext", "setNext", "next", "", "getReferenceCount", "()I", "referenceCount", "Companion", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@Deprecated
@SourceDebugExtension
/* loaded from: classes14.dex */
public class ChunkBuffer extends Buffer {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ChunkBuffer Empty;
    private static final Pool3<ChunkBuffer> EmptyPool;
    private static final Pool3<ChunkBuffer> NoPool;
    private static final Pool3<ChunkBuffer> NoPoolManuallyManaged;
    private static final /* synthetic */ AtomicReferenceFieldUpdater nextRef$FU;
    private static final /* synthetic */ AtomicIntegerFieldUpdater refCount$FU;
    private volatile /* synthetic */ Object nextRef;
    private ChunkBuffer origin;
    private final Pool3<ChunkBuffer> parentPool;
    private volatile /* synthetic */ int refCount;

    public /* synthetic */ ChunkBuffer(ByteBuffer byteBuffer, ChunkBuffer chunkBuffer, Pool3 pool3, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteBuffer, chunkBuffer, pool3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ChunkBuffer(ByteBuffer memory, ChunkBuffer chunkBuffer, Pool3<ChunkBuffer> pool3) {
        super(memory, null);
        Intrinsics.checkNotNullParameter(memory, "memory");
        this.parentPool = pool3;
        if (chunkBuffer == this) {
            throw new IllegalArgumentException("A chunk couldn't be a view of itself.");
        }
        this.nextRef = null;
        this.refCount = 1;
        this.origin = chunkBuffer;
    }

    public final ChunkBuffer getOrigin() {
        return this.origin;
    }

    public final ChunkBuffer getNext() {
        return (ChunkBuffer) this.nextRef;
    }

    public final void setNext(ChunkBuffer chunkBuffer) {
        if (chunkBuffer == null) {
            cleanNext();
        } else {
            appendNext(chunkBuffer);
        }
    }

    /* renamed from: getReferenceCount, reason: from getter */
    public final int getRefCount() {
        return this.refCount;
    }

    private final void appendNext(ChunkBuffer chunk) {
        if (!C2031xc40028dd.m363m(nextRef$FU, this, null, chunk)) {
            throw new IllegalStateException("This chunk has already a next chunk.");
        }
    }

    public final ChunkBuffer cleanNext() {
        return (ChunkBuffer) nextRef$FU.getAndSet(this, null);
    }

    public ChunkBuffer duplicate() {
        ChunkBuffer chunkBuffer = this.origin;
        if (chunkBuffer == null) {
            chunkBuffer = this;
        }
        chunkBuffer.acquire$ktor_io();
        ChunkBuffer chunkBuffer2 = new ChunkBuffer(getMemory(), chunkBuffer, this.parentPool, null);
        duplicateTo(chunkBuffer2);
        return chunkBuffer2;
    }

    public void release(Pool3<ChunkBuffer> pool) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        if (release$ktor_io()) {
            ChunkBuffer chunkBuffer = this.origin;
            if (chunkBuffer != null) {
                unlink$ktor_io();
                chunkBuffer.release(pool);
            } else {
                Pool3<ChunkBuffer> pool3 = this.parentPool;
                if (pool3 != null) {
                    pool = pool3;
                }
                pool.recycle(this);
            }
        }
    }

    public final void unlink$ktor_io() {
        if (!refCount$FU.compareAndSet(this, 0, -1)) {
            throw new IllegalStateException("Unable to unlink: buffer is in use.");
        }
        cleanNext();
        this.origin = null;
    }

    @Override // io.ktor.utils.p478io.core.Buffer
    public final void reset() {
        if (this.origin != null) {
            throw new IllegalArgumentException("Unable to reset buffer with origin");
        }
        super.reset();
        this.nextRef = null;
    }

    /* compiled from: ChunkBuffer.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\u0007R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lio/ktor/utils/io/core/internal/ChunkBuffer$Companion;", "", "<init>", "()V", "Lio/ktor/utils/io/pool/ObjectPool;", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "getPool", "()Lio/ktor/utils/io/pool/ObjectPool;", "Pool", "EmptyPool", "Lio/ktor/utils/io/pool/ObjectPool;", "getEmptyPool", "Empty", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "getEmpty", "()Lio/ktor/utils/io/core/internal/ChunkBuffer;", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Pool3<ChunkBuffer> getPool() {
            return BufferFactory.getDefaultChunkedBufferPool();
        }

        public final Pool3<ChunkBuffer> getEmptyPool() {
            return ChunkBuffer.EmptyPool;
        }

        public final ChunkBuffer getEmpty() {
            return ChunkBuffer.Empty;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Pool3<ChunkBuffer> pool3 = new Pool3<ChunkBuffer>() { // from class: io.ktor.utils.io.core.internal.ChunkBuffer$Companion$EmptyPool$1
            @Override // io.ktor.utils.p478io.pool.Pool3
            public void dispose() {
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                Pool3.DefaultImpls.close(this);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.ktor.utils.p478io.pool.Pool3
            public ChunkBuffer borrow() {
                return ChunkBuffer.INSTANCE.getEmpty();
            }

            @Override // io.ktor.utils.p478io.pool.Pool3
            public void recycle(ChunkBuffer instance) {
                Intrinsics.checkNotNullParameter(instance, "instance");
                if (instance != ChunkBuffer.INSTANCE.getEmpty()) {
                    throw new IllegalArgumentException("Only ChunkBuffer.Empty instance could be recycled.");
                }
            }
        };
        EmptyPool = pool3;
        Empty = new ChunkBuffer(MemoryJvm.INSTANCE.m28472getEmptySK3TCg8(), 0 == true ? 1 : 0, pool3, 0 == true ? 1 : 0);
        NoPool = new Pool2<ChunkBuffer>() { // from class: io.ktor.utils.io.core.internal.ChunkBuffer$Companion$NoPool$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.ktor.utils.p478io.pool.Pool3
            public ChunkBuffer borrow() {
                return new ChunkBuffer(MemoryFactoryJvm.INSTANCE.mo28466allocgFvZug(4096), null, this, 0 == true ? 1 : 0);
            }

            @Override // io.ktor.utils.p478io.pool.Pool2, io.ktor.utils.p478io.pool.Pool3
            public void recycle(ChunkBuffer instance) {
                Intrinsics.checkNotNullParameter(instance, "instance");
                MemoryFactoryJvm.INSTANCE.mo28467free3GNKZMM(instance.getMemory());
            }
        };
        NoPoolManuallyManaged = new Pool2<ChunkBuffer>() { // from class: io.ktor.utils.io.core.internal.ChunkBuffer$Companion$NoPoolManuallyManaged$1
            @Override // io.ktor.utils.p478io.pool.Pool2, io.ktor.utils.p478io.pool.Pool3
            public void recycle(ChunkBuffer instance) {
                Intrinsics.checkNotNullParameter(instance, "instance");
            }

            @Override // io.ktor.utils.p478io.pool.Pool3
            public ChunkBuffer borrow() {
                throw new UnsupportedOperationException("This pool doesn't support borrow");
            }
        };
        nextRef$FU = AtomicReferenceFieldUpdater.newUpdater(ChunkBuffer.class, Object.class, "nextRef");
        refCount$FU = AtomicIntegerFieldUpdater.newUpdater(ChunkBuffer.class, "refCount");
    }

    public final void acquire$ktor_io() {
        int i;
        do {
            i = this.refCount;
            if (i <= 0) {
                throw new IllegalStateException("Unable to acquire chunk: it is already released.");
            }
        } while (!refCount$FU.compareAndSet(this, i, i + 1));
    }

    public final void unpark$ktor_io() {
        int i;
        do {
            i = this.refCount;
            if (i < 0) {
                throw new IllegalStateException("This instance is already disposed and couldn't be borrowed.");
            }
            if (i > 0) {
                throw new IllegalStateException("This instance is already in use but somehow appeared in the pool.");
            }
        } while (!refCount$FU.compareAndSet(this, i, 1));
    }

    public final boolean release$ktor_io() {
        int i;
        int i2;
        do {
            i = this.refCount;
            if (i <= 0) {
                throw new IllegalStateException("Unable to release: it is already released.");
            }
            i2 = i - 1;
        } while (!refCount$FU.compareAndSet(this, i, i2));
        return i2 == 0;
    }
}
