package io.ktor.utils.p478io.charsets;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import io.ktor.utils.p478io.bits.MemoryJvm;
import io.ktor.utils.p478io.core.Buffer;
import io.ktor.utils.p478io.core.Input;
import io.ktor.utils.p478io.core.internal.ChunkBuffer;
import io.ktor.utils.p478io.core.internal.Unsafe;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.MalformedInputException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CharsetJVM.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\b\u001a\u00020\u0007*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\n\u001a\u00020\u0007*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\t\u001a7\u0010\r\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0010\u001a\u00020\u000f*\u00060\u0000j\u0002`\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a1\u0010\u0018\u001a\u00020\u0004*\u00060\u0012j\u0002`\u00132\u0006\u0010\u0003\u001a\u00020\u00142\n\u0010\f\u001a\u00060\u0015j\u0002`\u00162\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019\u001a%\u0010\u001c\u001a\u00020\u001b*\u00060\u0012j\u0002`\u00132\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001d\u001a'\u0010\u001e\u001a\u00020\u001b*\u00060\u0012j\u0002`\u00132\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001d\u001a'\u0010\u001f\u001a\u00020\u001b*\u00060\u0012j\u0002`\u00132\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010\u001d\u001a\u0013\u0010\"\u001a\u00020!*\u00020 H\u0002¢\u0006\u0004\b\"\u0010#\"\u001c\u0010&\u001a\n %*\u0004\u0018\u00010$0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\"\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*\"\u0019\u0010/\u001a\u00020\u001b*\u00060+j\u0002`,8F¢\u0006\u0006\u001a\u0004\b-\u0010.*\n\u00100\"\u00020+2\u00020+*\n\u00101\"\u00020\u00122\u00020\u0012*\n\u00102\"\u00020\u00002\u00020\u0000*\n\u00104\"\u0002032\u000203¨\u00065"}, m3636d2 = {"Ljava/nio/charset/CharsetEncoder;", "Lio/ktor/utils/io/charsets/CharsetEncoder;", "", "input", "", "fromIndex", "toIndex", "", "encodeToByteArray", "(Ljava/nio/charset/CharsetEncoder;Ljava/lang/CharSequence;II)[B", "encodeToByteArraySlow", "Lio/ktor/utils/io/core/Buffer;", "dst", "encodeImpl", "(Ljava/nio/charset/CharsetEncoder;Ljava/lang/CharSequence;IILio/ktor/utils/io/core/Buffer;)I", "", "encodeComplete", "(Ljava/nio/charset/CharsetEncoder;Lio/ktor/utils/io/core/Buffer;)Z", "Ljava/nio/charset/CharsetDecoder;", "Lio/ktor/utils/io/charsets/CharsetDecoder;", "Lio/ktor/utils/io/core/Input;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", AnalyticsStrings.MAX_WELCOME_TAG, "decode", "(Ljava/nio/charset/CharsetDecoder;Lio/ktor/utils/io/core/Input;Ljava/lang/Appendable;I)I", "inputLength", "", "decodeExactBytes", "(Ljava/nio/charset/CharsetDecoder;Lio/ktor/utils/io/core/Input;I)Ljava/lang/String;", "decodeImplByteBuffer", "decodeImplSlow", "Ljava/nio/charset/CoderResult;", "", "throwExceptionWrapped", "(Ljava/nio/charset/CoderResult;)V", "Ljava/nio/CharBuffer;", "kotlin.jvm.PlatformType", "EmptyCharBuffer", "Ljava/nio/CharBuffer;", "Ljava/nio/ByteBuffer;", "EmptyByteBuffer", "Ljava/nio/ByteBuffer;", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "getName", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "name", "Charset", "CharsetDecoder", "CharsetEncoder", "Lkotlin/text/Charsets;", "Charsets", "ktor-io"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.utils.io.charsets.CharsetJVMKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class CharsetJVM {
    private static final ByteBuffer EmptyByteBuffer;
    private static final CharBuffer EmptyCharBuffer = CharBuffer.allocate(0);

    public static final String getName(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "<this>");
        String strName = charset.name();
        Intrinsics.checkNotNullExpressionValue(strName, "name()");
        return strName;
    }

    public static final byte[] encodeToByteArray(CharsetEncoder charsetEncoder, CharSequence input, int i, int i2) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        if (input instanceof String) {
            if (i == 0 && i2 == input.length()) {
                byte[] bytes = ((String) input).getBytes(charsetEncoder.charset());
                Intrinsics.checkNotNullExpressionValue(bytes, "input as java.lang.String).getBytes(charset())");
                return bytes;
            }
            String strSubstring = ((String) input).substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes2 = strSubstring.getBytes(charsetEncoder.charset());
            Intrinsics.checkNotNullExpressionValue(bytes2, "input.substring(fromInde…ring).getBytes(charset())");
            return bytes2;
        }
        return encodeToByteArraySlow(charsetEncoder, input, i, i2);
    }

    private static final byte[] encodeToByteArraySlow(CharsetEncoder charsetEncoder, CharSequence charSequence, int i, int i2) throws CharacterCodingException {
        ByteBuffer byteBufferEncode = charsetEncoder.encode(CharBuffer.wrap(charSequence, i, i2));
        byte[] bArr = null;
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            byte[] bArrArray = byteBufferEncode.array();
            if (bArrArray.length == byteBufferEncode.remaining()) {
                bArr = bArrArray;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr2);
        return bArr2;
    }

    public static final int encodeImpl(CharsetEncoder charsetEncoder, CharSequence input, int i, int i2, Buffer dst) throws CharacterCodingException {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(dst, "dst");
        CharBuffer charBufferWrap = CharBuffer.wrap(input, i, i2);
        int iRemaining = charBufferWrap.remaining();
        ByteBuffer memory = dst.getMemory();
        int writePosition = dst.getWritePosition();
        int limit = dst.getLimit() - writePosition;
        ByteBuffer byteBufferM28471slice87lwejk = MemoryJvm.m28471slice87lwejk(memory, writePosition, limit);
        CoderResult result = charsetEncoder.encode(charBufferWrap, byteBufferM28471slice87lwejk, false);
        if (result.isMalformed() || result.isUnmappable()) {
            Intrinsics.checkNotNullExpressionValue(result, "result");
            throwExceptionWrapped(result);
        }
        if (byteBufferM28471slice87lwejk.limit() != limit) {
            throw new IllegalStateException("Buffer's limit change is not allowed");
        }
        dst.commitWritten(byteBufferM28471slice87lwejk.position());
        return iRemaining - charBufferWrap.remaining();
    }

    public static final int decode(CharsetDecoder charsetDecoder, Input input, Appendable dst, int i) {
        CoderResult cr;
        ChunkBuffer chunkBufferPrepareReadNextHead;
        Intrinsics.checkNotNullParameter(charsetDecoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(dst, "dst");
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        boolean z = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = Unsafe.prepareReadFirstHead(input, 1);
        int iRemaining = 0;
        if (chunkBufferPrepareReadFirstHead != null) {
            int i2 = 1;
            int i3 = 1;
            int iRemaining2 = 0;
            while (true) {
                try {
                    int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                    if (writePosition >= i2) {
                        int i4 = i - iRemaining2;
                        if (i4 == 0) {
                            i2 = 0;
                        } else {
                            try {
                                ByteBuffer memory = chunkBufferPrepareReadFirstHead.getMemory();
                                int readPosition = chunkBufferPrepareReadFirstHead.getReadPosition();
                                int writePosition2 = chunkBufferPrepareReadFirstHead.getWritePosition() - readPosition;
                                ByteBuffer byteBufferM28471slice87lwejk = MemoryJvm.m28471slice87lwejk(memory, readPosition, writePosition2);
                                charBufferAllocate.clear();
                                if (i4 < 8192) {
                                    charBufferAllocate.limit(i4);
                                }
                                CoderResult rc = charsetDecoder.decode(byteBufferM28471slice87lwejk, charBufferAllocate, false);
                                charBufferAllocate.flip();
                                iRemaining2 += charBufferAllocate.remaining();
                                dst.append(charBufferAllocate);
                                if (rc.isMalformed() || rc.isUnmappable()) {
                                    Intrinsics.checkNotNullExpressionValue(rc, "rc");
                                    throwExceptionWrapped(rc);
                                }
                                i3 = (rc.isUnderflow() && byteBufferM28471slice87lwejk.hasRemaining()) ? i3 + 1 : 1;
                                if (byteBufferM28471slice87lwejk.limit() != writePosition2) {
                                    throw new IllegalStateException("Buffer's limit change is not allowed");
                                }
                                chunkBufferPrepareReadFirstHead.discardExact(byteBufferM28471slice87lwejk.position());
                                i2 = i3;
                            } finally {
                                chunkBufferPrepareReadFirstHead.getWritePosition();
                                chunkBufferPrepareReadFirstHead.getReadPosition();
                            }
                        }
                        writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                    }
                    if (writePosition != 0) {
                        if (writePosition < i2 || chunkBufferPrepareReadFirstHead.getCapacity() - chunkBufferPrepareReadFirstHead.getLimit() < 8) {
                            Unsafe.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                            chunkBufferPrepareReadNextHead = Unsafe.prepareReadFirstHead(input, i2);
                        } else {
                            chunkBufferPrepareReadNextHead = chunkBufferPrepareReadFirstHead;
                        }
                    } else {
                        try {
                            chunkBufferPrepareReadNextHead = Unsafe.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (z) {
                                Unsafe.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                            }
                            throw th;
                        }
                    }
                    if (chunkBufferPrepareReadNextHead == null) {
                        break;
                    }
                    if (i2 <= 0) {
                        iRemaining = 1;
                        chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                        break;
                    }
                    chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (iRemaining != 0) {
                Unsafe.completeReadHead(input, chunkBufferPrepareReadFirstHead);
            }
            iRemaining = iRemaining2;
        }
        do {
            charBufferAllocate.clear();
            int i5 = i - iRemaining;
            if (i5 == 0) {
                break;
            }
            if (i5 < 8192) {
                charBufferAllocate.limit(i5);
            }
            cr = charsetDecoder.decode(EmptyByteBuffer, charBufferAllocate, true);
            charBufferAllocate.flip();
            iRemaining += charBufferAllocate.remaining();
            dst.append(charBufferAllocate);
            if (cr.isUnmappable() || cr.isMalformed()) {
                Intrinsics.checkNotNullExpressionValue(cr, "cr");
                throwExceptionWrapped(cr);
            }
        } while (cr.isOverflow());
        return iRemaining;
    }

    public static final String decodeExactBytes(CharsetDecoder charsetDecoder, Input input, int i) throws EOFException {
        Intrinsics.checkNotNullParameter(charsetDecoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        if (i != 0) {
            if (input.getHeadEndExclusive() - input.getHeadPosition() >= i) {
                if (input.getHeadMemory().hasArray()) {
                    ByteBuffer headMemory = input.getHeadMemory();
                    byte[] bArrArray = headMemory.array();
                    Intrinsics.checkNotNullExpressionValue(bArrArray, "bb.array()");
                    int iArrayOffset = headMemory.arrayOffset() + headMemory.position() + input.getHead().getReadPosition();
                    Charset charset = charsetDecoder.charset();
                    Intrinsics.checkNotNullExpressionValue(charset, "charset()");
                    String str = new String(bArrArray, iArrayOffset, i, charset);
                    input.discardExact(i);
                    return str;
                }
                return decodeImplByteBuffer(charsetDecoder, input, i);
            }
            return decodeImplSlow(charsetDecoder, input, i);
        }
        return "";
    }

    private static final String decodeImplByteBuffer(CharsetDecoder charsetDecoder, Input input, int i) throws CharacterCodingException, EOFException {
        CharBuffer charBufferAllocate = CharBuffer.allocate(i);
        ByteBuffer byteBufferM28471slice87lwejk = MemoryJvm.m28471slice87lwejk(input.getHeadMemory(), input.getHead().getReadPosition(), i);
        CoderResult rc = charsetDecoder.decode(byteBufferM28471slice87lwejk, charBufferAllocate, true);
        if (rc.isMalformed() || rc.isUnmappable()) {
            Intrinsics.checkNotNullExpressionValue(rc, "rc");
            throwExceptionWrapped(rc);
        }
        charBufferAllocate.flip();
        input.discardExact(byteBufferM28471slice87lwejk.position());
        String string2 = charBufferAllocate.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "cb.toString()");
        return string2;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final String decodeImplSlow(CharsetDecoder charsetDecoder, Input input, int i) throws Throwable {
        int iPosition;
        ChunkBuffer chunkBufferPrepareReadNextHead;
        CharBuffer charBufferAllocate = CharBuffer.allocate(i);
        boolean z = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = Unsafe.prepareReadFirstHead(input, 1);
        boolean z2 = false;
        if (chunkBufferPrepareReadFirstHead == null) {
            iPosition = i;
        } else {
            iPosition = i;
            int i2 = 1;
            int i3 = 1;
            boolean z3 = false;
            while (true) {
                try {
                    int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                    if (writePosition >= i2) {
                        try {
                            if (!charBufferAllocate.hasRemaining() || iPosition == 0) {
                                i2 = 0;
                            } else {
                                ByteBuffer memory = chunkBufferPrepareReadFirstHead.getMemory();
                                int readPosition = chunkBufferPrepareReadFirstHead.getReadPosition();
                                int writePosition2 = chunkBufferPrepareReadFirstHead.getWritePosition() - readPosition;
                                ByteBuffer byteBufferM28471slice87lwejk = MemoryJvm.m28471slice87lwejk(memory, readPosition, writePosition2);
                                int iLimit = byteBufferM28471slice87lwejk.limit();
                                int iPosition2 = byteBufferM28471slice87lwejk.position();
                                boolean z4 = iLimit - iPosition2 >= iPosition;
                                if (z4) {
                                    byteBufferM28471slice87lwejk.limit(iPosition2 + iPosition);
                                }
                                CoderResult rc = charsetDecoder.decode(byteBufferM28471slice87lwejk, charBufferAllocate, z4);
                                if (rc.isMalformed() || rc.isUnmappable()) {
                                    Intrinsics.checkNotNullExpressionValue(rc, "rc");
                                    throwExceptionWrapped(rc);
                                }
                                i3 = (rc.isUnderflow() && byteBufferM28471slice87lwejk.hasRemaining()) ? i3 + 1 : 1;
                                byteBufferM28471slice87lwejk.limit(iLimit);
                                iPosition -= byteBufferM28471slice87lwejk.position() - iPosition2;
                                if (byteBufferM28471slice87lwejk.limit() != writePosition2) {
                                    throw new IllegalStateException("Buffer's limit change is not allowed");
                                }
                                chunkBufferPrepareReadFirstHead.discardExact(byteBufferM28471slice87lwejk.position());
                                i2 = i3;
                                z3 = z4;
                            }
                            writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                        } catch (Throwable th) {
                            chunkBufferPrepareReadFirstHead.getWritePosition();
                            chunkBufferPrepareReadFirstHead.getReadPosition();
                            throw th;
                        }
                    }
                    if (writePosition != 0) {
                        if (writePosition < i2 || chunkBufferPrepareReadFirstHead.getCapacity() - chunkBufferPrepareReadFirstHead.getLimit() < 8) {
                            Unsafe.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                            chunkBufferPrepareReadNextHead = Unsafe.prepareReadFirstHead(input, i2);
                        } else {
                            chunkBufferPrepareReadNextHead = chunkBufferPrepareReadFirstHead;
                        }
                    } else {
                        try {
                            chunkBufferPrepareReadNextHead = Unsafe.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                        } catch (Throwable th2) {
                            th = th2;
                            z = false;
                            if (z) {
                            }
                            throw th;
                        }
                    }
                    if (chunkBufferPrepareReadNextHead == null) {
                        break;
                    }
                    if (i2 <= 0) {
                        z2 = true;
                        chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                        break;
                    }
                    chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                } catch (Throwable th3) {
                    th = th3;
                    if (z) {
                        Unsafe.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                    }
                    throw th;
                }
            }
            if (z2) {
                Unsafe.completeReadHead(input, chunkBufferPrepareReadFirstHead);
            }
            z2 = z3;
        }
        if (charBufferAllocate.hasRemaining() && !z2) {
            CoderResult rc2 = charsetDecoder.decode(EmptyByteBuffer, charBufferAllocate, true);
            if (rc2.isMalformed() || rc2.isUnmappable()) {
                Intrinsics.checkNotNullExpressionValue(rc2, "rc");
                throwExceptionWrapped(rc2);
            }
        }
        if (iPosition <= 0) {
            if (iPosition < 0) {
                throw new AssertionError("remainingInputBytes < 0");
            }
            charBufferAllocate.flip();
            String string2 = charBufferAllocate.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "cb.toString()");
            return string2;
        }
        throw new EOFException("Not enough bytes available: had only " + (i - iPosition) + " instead of " + i);
    }

    private static final void throwExceptionWrapped(CoderResult coderResult) throws CharacterCodingException {
        try {
            coderResult.throwException();
        } catch (MalformedInputException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Failed to decode bytes";
            }
            throw new CharsetJVM2(message);
        }
    }

    static {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0);
        Intrinsics.checkNotNull(byteBufferAllocate);
        EmptyByteBuffer = byteBufferAllocate;
    }

    public static final boolean encodeComplete(CharsetEncoder charsetEncoder, Buffer dst) throws CharacterCodingException {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        ByteBuffer memory = dst.getMemory();
        int writePosition = dst.getWritePosition();
        int limit = dst.getLimit() - writePosition;
        ByteBuffer byteBufferM28471slice87lwejk = MemoryJvm.m28471slice87lwejk(memory, writePosition, limit);
        CoderResult result = charsetEncoder.encode(EmptyCharBuffer, byteBufferM28471slice87lwejk, true);
        if (result.isMalformed() || result.isUnmappable()) {
            Intrinsics.checkNotNullExpressionValue(result, "result");
            throwExceptionWrapped(result);
        }
        boolean zIsUnderflow = result.isUnderflow();
        if (byteBufferM28471slice87lwejk.limit() != limit) {
            throw new IllegalStateException("Buffer's limit change is not allowed");
        }
        dst.commitWritten(byteBufferM28471slice87lwejk.position());
        return zIsUnderflow;
    }
}
