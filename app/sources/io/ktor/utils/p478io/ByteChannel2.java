package io.ktor.utils.p478io;

import io.ktor.utils.p478io.pool.Pool3;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ByteChannel.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u000f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r¢\u0006\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"", "autoFlush", "Lio/ktor/utils/io/ByteChannel;", "ByteChannel", "(Z)Lio/ktor/utils/io/ByteChannel;", "", "content", "", "offset", "length", "Lio/ktor/utils/io/ByteReadChannel;", "ByteReadChannel", "([BII)Lio/ktor/utils/io/ByteReadChannel;", "Lkotlin/Function1;", "", "exceptionMapper", "(ZLkotlin/jvm/functions/Function1;)Lio/ktor/utils/io/ByteChannel;", "ktor-io"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.utils.io.ByteChannelKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ByteChannel2 {
    public static final ByteChannelCtor ByteChannel(boolean z) {
        return new ByteBufferChannel(z, null, 0, 6, null);
    }

    public static /* synthetic */ ByteChannelCtor ByteChannel$default(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return ByteChannel(z);
    }

    public static final ByteReadChannelJVM ByteReadChannel(byte[] content, int i, int i2) {
        Intrinsics.checkNotNullParameter(content, "content");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(content, i, i2);
        Intrinsics.checkNotNullExpressionValue(byteBufferWrap, "wrap(content, offset, length)");
        return new ByteBufferChannel(byteBufferWrap);
    }

    public static /* synthetic */ ByteChannelCtor ByteChannel$default(boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return ByteChannel(z, function1);
    }

    public static final ByteChannelCtor ByteChannel(boolean z, final Function1<? super Throwable, ? extends Throwable> exceptionMapper) {
        Intrinsics.checkNotNullParameter(exceptionMapper, "exceptionMapper");
        return new ByteBufferChannel(z) { // from class: io.ktor.utils.io.ByteChannelKt.ByteChannel.1
            /* JADX WARN: Multi-variable type inference failed */
            {
                int i = 6;
                DefaultConstructorMarker defaultConstructorMarker = null;
                Pool3 pool3 = null;
                int i2 = 0;
            }

            @Override // io.ktor.utils.p478io.ByteBufferChannel, io.ktor.utils.p478io.ByteWriteChannel
            public boolean close(Throwable cause) {
                return super.close(exceptionMapper.invoke(cause));
            }
        };
    }
}
