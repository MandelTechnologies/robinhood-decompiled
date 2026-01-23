package io.ktor.utils.p478io.charsets;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import io.ktor.utils.p478io.core.BytePacketBuilder;
import io.ktor.utils.p478io.core.ByteReadPacket;
import io.ktor.utils.p478io.core.Input;
import io.ktor.utils.p478io.core.Output;
import io.ktor.utils.p478io.core.internal.ChunkBuffer;
import io.ktor.utils.p478io.core.internal.Unsafe;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Encoding.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a1\u0010\b\u001a\u00020\u0007*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u000f\u001a\u00020\u000e*\u00060\nj\u0002`\u000b2\u0006\u0010\u0003\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0016\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a7\u0010\u0019\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Ljava/nio/charset/CharsetEncoder;", "Lio/ktor/utils/io/charsets/CharsetEncoder;", "", "input", "", "fromIndex", "toIndex", "Lio/ktor/utils/io/core/ByteReadPacket;", "encode", "(Ljava/nio/charset/CharsetEncoder;Ljava/lang/CharSequence;II)Lio/ktor/utils/io/core/ByteReadPacket;", "Ljava/nio/charset/CharsetDecoder;", "Lio/ktor/utils/io/charsets/CharsetDecoder;", "Lio/ktor/utils/io/core/Input;", AnalyticsStrings.MAX_WELCOME_TAG, "", "decode", "(Ljava/nio/charset/CharsetDecoder;Lio/ktor/utils/io/core/Input;I)Ljava/lang/String;", "", "sizeEstimate", "(Lio/ktor/utils/io/core/Input;)J", "Lio/ktor/utils/io/core/Output;", "dst", "encodeCompleteImpl", "(Ljava/nio/charset/CharsetEncoder;Lio/ktor/utils/io/core/Output;)I", "destination", "encodeToImpl", "(Ljava/nio/charset/CharsetEncoder;Lio/ktor/utils/io/core/Output;Ljava/lang/CharSequence;II)I", "ktor-io"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.utils.io.charsets.EncodingKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class Encoding2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final ByteReadPacket encode(CharsetEncoder charsetEncoder, CharSequence input, int i, int i2) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, 0 == true ? 1 : 0);
        try {
            encodeToImpl(charsetEncoder, bytePacketBuilder, input, i, i2);
            return bytePacketBuilder.build();
        } catch (Throwable th) {
            bytePacketBuilder.release();
            throw th;
        }
    }

    public static /* synthetic */ ByteReadPacket encode$default(CharsetEncoder charsetEncoder, CharSequence charSequence, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        return encode(charsetEncoder, charSequence, i, i2);
    }

    public static /* synthetic */ String decode$default(CharsetDecoder charsetDecoder, Input input, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        return decode(charsetDecoder, input, i);
    }

    public static final String decode(CharsetDecoder charsetDecoder, Input input, int i) {
        Intrinsics.checkNotNullParameter(charsetDecoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        StringBuilder sb = new StringBuilder((int) Math.min(i, sizeEstimate(input)));
        CharsetJVM.decode(charsetDecoder, input, sb, i);
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder(capacity).…builderAction).toString()");
        return string2;
    }

    public static final long sizeEstimate(Input input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        return input instanceof ByteReadPacket ? input.getRemaining() : Math.max(input.getRemaining(), 16L);
    }

    private static final int encodeCompleteImpl(CharsetEncoder charsetEncoder, Output output) {
        ChunkBuffer chunkBufferPrepareWriteHead = Unsafe.prepareWriteHead(output, 1, null);
        int i = 1;
        int limit = 0;
        while (true) {
            try {
                int limit2 = chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition();
                i = CharsetJVM.encodeComplete(charsetEncoder, chunkBufferPrepareWriteHead) ? 0 : i + 1;
                limit += limit2 - (chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition());
                if (i <= 0) {
                    return limit;
                }
                chunkBufferPrepareWriteHead = Unsafe.prepareWriteHead(output, 1, chunkBufferPrepareWriteHead);
            } finally {
                output.afterHeadWrite();
            }
        }
    }

    public static final int encodeToImpl(CharsetEncoder charsetEncoder, Output destination, CharSequence input, int i, int i2) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(input, "input");
        if (i >= i2) {
            return 0;
        }
        ChunkBuffer chunkBufferPrepareWriteHead = Unsafe.prepareWriteHead(destination, 1, null);
        int limit = 0;
        while (true) {
            try {
                int limit2 = chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition();
                int iEncodeImpl = CharsetJVM.encodeImpl(charsetEncoder, input, i, i2, chunkBufferPrepareWriteHead);
                if (iEncodeImpl >= 0) {
                    i += iEncodeImpl;
                    limit += limit2 - (chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition());
                    int i3 = i >= i2 ? 0 : iEncodeImpl == 0 ? 8 : 1;
                    if (i3 > 0) {
                        chunkBufferPrepareWriteHead = Unsafe.prepareWriteHead(destination, i3, chunkBufferPrepareWriteHead);
                    } else {
                        destination.afterHeadWrite();
                        return limit + encodeCompleteImpl(charsetEncoder, destination);
                    }
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                destination.afterHeadWrite();
                throw th;
            }
        }
    }
}
