package io.ktor.utils.p478io.bits;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MemoryFactoryJvm.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, m3636d2 = {"Lio/ktor/utils/io/bits/DefaultAllocator;", "Lio/ktor/utils/io/bits/Allocator;", "<init>", "()V", "", "size", "Lio/ktor/utils/io/bits/Memory;", "alloc-gFv-Zug", "(I)Ljava/nio/ByteBuffer;", "alloc", "instance", "", "free-3GNKZMM", "(Ljava/nio/ByteBuffer;)V", "free", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@PublishedApi
@SourceDebugExtension
/* renamed from: io.ktor.utils.io.bits.DefaultAllocator, reason: use source file name */
/* loaded from: classes14.dex */
public final class MemoryFactoryJvm implements MemoryFactory {
    public static final MemoryFactoryJvm INSTANCE = new MemoryFactoryJvm();

    @Override // io.ktor.utils.p478io.bits.MemoryFactory
    /* renamed from: free-3GNKZMM */
    public void mo28467free3GNKZMM(ByteBuffer instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    private MemoryFactoryJvm() {
    }

    @Override // io.ktor.utils.p478io.bits.MemoryFactory
    /* renamed from: alloc-gFv-Zug */
    public ByteBuffer mo28466allocgFvZug(int size) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size);
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(size)");
        return MemoryJvm.m28468constructorimpl(byteBufferAllocate);
    }
}
