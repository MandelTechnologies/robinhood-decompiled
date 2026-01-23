package io.ktor.utils.p478io.core;

import io.ktor.utils.p478io.core.internal.ChunkBuffer;
import io.ktor.utils.p478io.pool.Pool4;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ByteReadPacketExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lio/ktor/utils/io/core/SingleByteBufferPool;", "Lio/ktor/utils/io/pool/SingleInstancePool;", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "Ljava/nio/ByteBuffer;", "instance", "Lkotlin/Function1;", "", "release", "<init>", "(Ljava/nio/ByteBuffer;Lkotlin/jvm/functions/Function1;)V", "produceInstance", "()Lio/ktor/utils/io/core/internal/ChunkBuffer;", "disposeInstance", "(Lio/ktor/utils/io/core/internal/ChunkBuffer;)V", "Ljava/nio/ByteBuffer;", "getInstance", "()Ljava/nio/ByteBuffer;", "Lkotlin/jvm/functions/Function1;", "getRelease", "()Lkotlin/jvm/functions/Function1;", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.utils.io.core.SingleByteBufferPool, reason: use source file name */
/* loaded from: classes14.dex */
final class ByteReadPacketExtensions3 extends Pool4<ChunkBuffer> {
    private final ByteBuffer instance;
    private final Function1<ByteBuffer, Unit> release;

    /* JADX WARN: Multi-variable type inference failed */
    public ByteReadPacketExtensions3(ByteBuffer instance, Function1<? super ByteBuffer, Unit> release) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(release, "release");
        this.instance = instance;
        this.release = release;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.ktor.utils.p478io.pool.Pool4
    public ChunkBuffer produceInstance() {
        return BufferUtilsJvm.ChunkBuffer(this.instance, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.ktor.utils.p478io.pool.Pool4
    public void disposeInstance(ChunkBuffer instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.release.invoke(this.instance);
    }
}
