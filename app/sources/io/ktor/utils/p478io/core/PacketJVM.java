package io.ktor.utils.p478io.core;

import io.ktor.utils.p478io.utils.Atomic;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PacketJVM.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0017\u0010\u0001\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004*\n\u0010\u0006\"\u00020\u00052\u00020\u0005¨\u0006\u0007"}, m3636d2 = {"", "PACKET_MAX_COPY_SIZE", "I", "getPACKET_MAX_COPY_SIZE", "()I", "Ljava/io/EOFException;", "EOFException", "ktor-io"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.utils.io.core.PacketJVMKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class PacketJVM {
    private static final int PACKET_MAX_COPY_SIZE = Atomic.getIOIntProperty("max.copy.size", 500);

    public static final int getPACKET_MAX_COPY_SIZE() {
        return PACKET_MAX_COPY_SIZE;
    }
}
