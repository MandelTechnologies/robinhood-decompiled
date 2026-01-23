package io.ktor.utils.p478io.streams;

import io.ktor.utils.p478io.pool.DefaultPool;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ByteArrays.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\" \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lio/ktor/utils/io/pool/DefaultPool;", "", "ByteArrayPool", "Lio/ktor/utils/io/pool/DefaultPool;", "getByteArrayPool", "()Lio/ktor/utils/io/pool/DefaultPool;", "ktor-io"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.utils.io.streams.ByteArraysKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ByteArrays {
    private static final DefaultPool<byte[]> ByteArrayPool = new DefaultPool<byte[]>() { // from class: io.ktor.utils.io.streams.ByteArraysKt$ByteArrayPool$1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.ktor.utils.p478io.pool.DefaultPool
        public final byte[] produceInstance() {
            return new byte[4096];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.ktor.utils.p478io.pool.DefaultPool
        public final void validateInstance(byte[] instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            if (instance.length != 4096) {
                throw new IllegalArgumentException(("Unable to recycle buffer of wrong size: " + instance.length + " != 4096").toString());
            }
            super.validateInstance((ByteArrays2) instance);
        }
    };

    public static final DefaultPool<byte[]> getByteArrayPool() {
        return ByteArrayPool;
    }
}
