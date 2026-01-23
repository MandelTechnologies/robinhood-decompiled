package io.ktor.utils.p478io.core;

import io.ktor.utils.p478io.bits.MemoryFactory;
import io.ktor.utils.p478io.bits.MemoryFactoryJvm;
import io.ktor.utils.p478io.core.internal.ChunkBuffer;
import io.ktor.utils.p478io.pool.DefaultPool;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BufferFactory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0014J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0002H\u0014J\b\u0010\r\u001a\u00020\u0002H\u0014J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0002H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lio/ktor/utils/io/core/DefaultBufferPool;", "Lio/ktor/utils/io/pool/DefaultPool;", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "bufferSize", "", "capacity", "allocator", "Lio/ktor/utils/io/bits/Allocator;", "(IILio/ktor/utils/io/bits/Allocator;)V", "clearInstance", "instance", "disposeInstance", "", "produceInstance", "validateInstance", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.utils.io.core.DefaultBufferPool, reason: use source file name */
/* loaded from: classes14.dex */
public final class BufferFactory2 extends DefaultPool<ChunkBuffer> {
    private final MemoryFactory allocator;
    private final int bufferSize;

    public /* synthetic */ BufferFactory2(int i, int i2, MemoryFactory memoryFactory, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 4096 : i, (i3 & 2) != 0 ? 1000 : i2, (i3 & 4) != 0 ? MemoryFactoryJvm.INSTANCE : memoryFactory);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferFactory2(int i, int i2, MemoryFactory allocator) {
        super(i2);
        Intrinsics.checkNotNullParameter(allocator, "allocator");
        this.bufferSize = i;
        this.allocator = allocator;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.ktor.utils.p478io.pool.DefaultPool
    public ChunkBuffer produceInstance() {
        return new ChunkBuffer(this.allocator.mo28466allocgFvZug(this.bufferSize), null, this, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.ktor.utils.p478io.pool.DefaultPool
    public void disposeInstance(ChunkBuffer instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.allocator.mo28467free3GNKZMM(instance.getMemory());
        super.disposeInstance((BufferFactory2) instance);
        instance.unlink$ktor_io();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.ktor.utils.p478io.pool.DefaultPool
    public void validateInstance(ChunkBuffer instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        super.validateInstance((BufferFactory2) instance);
        if (instance.getMemory().limit() != this.bufferSize) {
            StringBuilder sb = new StringBuilder();
            sb.append("Buffer size mismatch. Expected: ");
            sb.append(this.bufferSize);
            sb.append(", actual: ");
            sb.append(instance.getMemory().limit());
            throw new IllegalStateException(sb.toString().toString());
        }
        if (instance == ChunkBuffer.INSTANCE.getEmpty()) {
            throw new IllegalStateException("ChunkBuffer.Empty couldn't be recycled");
        }
        if (instance == Buffer.INSTANCE.getEmpty()) {
            throw new IllegalStateException("Empty instance couldn't be recycled");
        }
        if (instance.getRefCount() != 0) {
            throw new IllegalStateException("Unable to clear buffer: it is still in use.");
        }
        if (instance.getNext() != null) {
            throw new IllegalStateException("Recycled instance shouldn't be a part of a chain.");
        }
        if (instance.getOrigin() != null) {
            throw new IllegalStateException("Recycled instance shouldn't be a view or another buffer.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.ktor.utils.p478io.pool.DefaultPool
    public ChunkBuffer clearInstance(ChunkBuffer instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        ChunkBuffer chunkBuffer = (ChunkBuffer) super.clearInstance((BufferFactory2) instance);
        chunkBuffer.unpark$ktor_io();
        chunkBuffer.reset();
        return chunkBuffer;
    }
}
