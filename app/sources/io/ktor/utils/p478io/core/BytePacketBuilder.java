package io.ktor.utils.p478io.core;

import io.ktor.utils.p478io.core.internal.ChunkBuffer;
import io.ktor.utils.p478io.pool.Pool3;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BytePacketBuilder.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0014\u0010\u0017J)\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0011\u0010#\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010%\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, m3636d2 = {"Lio/ktor/utils/io/core/BytePacketBuilder;", "Lio/ktor/utils/io/core/Output;", "Lio/ktor/utils/io/pool/ObjectPool;", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "pool", "<init>", "(Lio/ktor/utils/io/pool/ObjectPool;)V", "", "closeDestination", "()V", "Lio/ktor/utils/io/bits/Memory;", "source", "", "offset", "length", "flush-62zg_DM", "(Ljava/nio/ByteBuffer;II)V", "flush", "", "value", "append", "(C)Lio/ktor/utils/io/core/BytePacketBuilder;", "", "(Ljava/lang/CharSequence;)Lio/ktor/utils/io/core/BytePacketBuilder;", "startIndex", "endIndex", "(Ljava/lang/CharSequence;II)Lio/ktor/utils/io/core/BytePacketBuilder;", "Lio/ktor/utils/io/core/ByteReadPacket;", "build", "()Lio/ktor/utils/io/core/ByteReadPacket;", "", "toString", "()Ljava/lang/String;", "getSize", "()I", "size", "", "isEmpty", "()Z", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class BytePacketBuilder extends Output {
    /* JADX WARN: Multi-variable type inference failed */
    public BytePacketBuilder() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.ktor.utils.p478io.core.Output
    protected final void closeDestination() {
    }

    @Override // io.ktor.utils.p478io.core.Output
    /* renamed from: flush-62zg_DM, reason: not valid java name */
    protected final void mo28477flush62zg_DM(ByteBuffer source, int offset, int length) {
        Intrinsics.checkNotNullParameter(source, "source");
    }

    public /* synthetic */ BytePacketBuilder(Pool3 pool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ChunkBuffer.INSTANCE.getPool() : pool3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BytePacketBuilder(Pool3<ChunkBuffer> pool) {
        super(pool);
        Intrinsics.checkNotNullParameter(pool, "pool");
    }

    public final int getSize() {
        return get_size();
    }

    public final boolean isEmpty() {
        return get_size() == 0;
    }

    @Override // io.ktor.utils.p478io.core.Output, java.lang.Appendable
    public BytePacketBuilder append(char value) {
        Output outputAppend = super.append(value);
        Intrinsics.checkNotNull(outputAppend, "null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return (BytePacketBuilder) outputAppend;
    }

    @Override // io.ktor.utils.p478io.core.Output, java.lang.Appendable
    public BytePacketBuilder append(CharSequence value) {
        Output outputAppend = super.append(value);
        Intrinsics.checkNotNull(outputAppend, "null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return (BytePacketBuilder) outputAppend;
    }

    @Override // io.ktor.utils.p478io.core.Output, java.lang.Appendable
    public BytePacketBuilder append(CharSequence value, int startIndex, int endIndex) {
        Output outputAppend = super.append(value, startIndex, endIndex);
        Intrinsics.checkNotNull(outputAppend, "null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return (BytePacketBuilder) outputAppend;
    }

    public final ByteReadPacket build() {
        int size = getSize();
        ChunkBuffer chunkBufferStealAll$ktor_io = stealAll$ktor_io();
        if (chunkBufferStealAll$ktor_io == null) {
            return ByteReadPacket.INSTANCE.getEmpty();
        }
        return new ByteReadPacket(chunkBufferStealAll$ktor_io, size, getPool());
    }

    public String toString() {
        return "BytePacketBuilder[0x" + hashCode() + ']';
    }
}
