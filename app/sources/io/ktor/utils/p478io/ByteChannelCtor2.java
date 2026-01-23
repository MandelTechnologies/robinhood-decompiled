package io.ktor.utils.p478io;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ByteChannelCtor.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"", "content", "Lio/ktor/utils/io/ByteReadChannel;", "ByteReadChannel", "([B)Lio/ktor/utils/io/ByteReadChannel;", "ktor-io"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.utils.io.ByteChannelCtorKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ByteChannelCtor2 {
    public static final ByteReadChannelJVM ByteReadChannel(byte[] content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return ByteChannel2.ByteReadChannel(content, 0, content.length);
    }
}
