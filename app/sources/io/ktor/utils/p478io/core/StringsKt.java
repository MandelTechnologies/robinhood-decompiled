package io.ktor.utils.p478io.core;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.singular.sdk.internal.Constants;
import io.ktor.utils.p478io.charsets.CharsetJVM;
import io.ktor.utils.p478io.charsets.Encoding2;
import io.ktor.utils.p478io.core.internal.ChunkBuffer;
import io.ktor.utils.p478io.core.internal.EncodeResult;
import io.ktor.utils.p478io.core.internal.UTF83;
import io.ktor.utils.p478io.core.internal.Unsafe;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;

/* compiled from: Strings.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\f\u001a\u00020\u000b*\u00020\u00062\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\b2\b\b\u0002\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u000f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00012\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a;\u0010\u0017\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00012\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a+\u0010\u0019\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m3636d2 = {"Lio/ktor/utils/io/core/ByteReadPacket;", "", Constants.RequestParamsKeys.APP_NAME_KEY, "", "readBytes", "(Lio/ktor/utils/io/core/ByteReadPacket;I)[B", "Lio/ktor/utils/io/core/Input;", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "charset", AnalyticsStrings.MAX_WELCOME_TAG, "", "readText", "(Lio/ktor/utils/io/core/Input;Ljava/nio/charset/Charset;I)Ljava/lang/String;", "bytesCount", "readTextExactBytes", "(Lio/ktor/utils/io/core/Input;ILjava/nio/charset/Charset;)Ljava/lang/String;", "Lio/ktor/utils/io/core/Output;", "", "text", "fromIndex", "toIndex", "", "writeText", "(Lio/ktor/utils/io/core/Output;Ljava/lang/CharSequence;IILjava/nio/charset/Charset;)V", "writeTextUtf8", "(Lio/ktor/utils/io/core/Output;Ljava/lang/CharSequence;II)V", "size", "", "prematureEndOfStream", "(I)Ljava/lang/Void;", "ktor-io"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class StringsKt {
    public static /* synthetic */ byte[] readBytes$default(ByteReadPacket byteReadPacket, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            long remaining = byteReadPacket.getRemaining();
            if (remaining > 2147483647L) {
                throw new IllegalArgumentException("Unable to convert to a ByteArray: packet is too big");
            }
            i = (int) remaining;
        }
        return readBytes(byteReadPacket, i);
    }

    public static final byte[] readBytes(ByteReadPacket byteReadPacket, int i) {
        Intrinsics.checkNotNullParameter(byteReadPacket, "<this>");
        if (i != 0) {
            byte[] bArr = new byte[i];
            InputArrays.readFully(byteReadPacket, bArr, 0, i);
            return bArr;
        }
        return Unsafe.EmptyByteArray;
    }

    public static /* synthetic */ String readText$default(Input input, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        return readText(input, charset, i);
    }

    public static final String readText(Input input, Charset charset, int i) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        Intrinsics.checkNotNullExpressionValue(charsetDecoderNewDecoder, "charset.newDecoder()");
        return Encoding2.decode(charsetDecoderNewDecoder, input, i);
    }

    public static /* synthetic */ String readTextExactBytes$default(Input input, int i, Charset charset, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        return readTextExactBytes(input, i, charset);
    }

    public static final String readTextExactBytes(Input input, int i, Charset charset) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        Intrinsics.checkNotNullExpressionValue(charsetDecoderNewDecoder, "charset.newDecoder()");
        return CharsetJVM.decodeExactBytes(charsetDecoderNewDecoder, input, i);
    }

    public static /* synthetic */ void writeText$default(Output output, CharSequence charSequence, int i, int i2, Charset charset, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        if ((i3 & 8) != 0) {
            charset = Charsets.UTF_8;
        }
        writeText(output, charSequence, i, i2, charset);
    }

    public static final void writeText(Output output, CharSequence text, int i, int i2, Charset charset) {
        Intrinsics.checkNotNullParameter(output, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (charset == Charsets.UTF_8) {
            writeTextUtf8(output, text, i, i2);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
        Encoding2.encodeToImpl(charsetEncoderNewEncoder, output, text, i, i2);
    }

    @PublishedApi
    public static final Void prematureEndOfStream(int i) throws EOFException {
        throw new EOFException("Premature end of stream: expected " + i + " bytes");
    }

    private static final void writeTextUtf8(Output output, CharSequence charSequence, int i, int i2) {
        ChunkBuffer chunkBufferPrepareWriteHead = Unsafe.prepareWriteHead(output, 1, null);
        int i3 = i;
        while (true) {
            try {
                CharSequence charSequence2 = charSequence;
                int i4 = i2;
                int iM28491encodeUTF8lBXzO7A = UTF83.m28491encodeUTF8lBXzO7A(chunkBufferPrepareWriteHead.getMemory(), charSequence2, i3, i4, chunkBufferPrepareWriteHead.getWritePosition(), chunkBufferPrepareWriteHead.getLimit());
                int iM28485component1Mh2AYeg = EncodeResult.m28485component1Mh2AYeg(iM28491encodeUTF8lBXzO7A) & 65535;
                i3 += iM28485component1Mh2AYeg;
                chunkBufferPrepareWriteHead.commitWritten(EncodeResult.m28486component2Mh2AYeg(iM28491encodeUTF8lBXzO7A) & 65535);
                int i5 = (iM28485component1Mh2AYeg != 0 || i3 >= i4) ? i3 < i4 ? 1 : 0 : 8;
                if (i5 <= 0) {
                    return;
                }
                chunkBufferPrepareWriteHead = Unsafe.prepareWriteHead(output, i5, chunkBufferPrepareWriteHead);
                charSequence = charSequence2;
                i2 = i4;
            } finally {
                output.afterHeadWrite();
            }
        }
    }
}
