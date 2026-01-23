package io.ktor.utils.p478io.core.internal;

import com.plaid.internal.EnumC7081g;
import java.nio.ByteBuffer;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: UTF8.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\b\u0004\u001aA\u0010\u000b\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001aQ\u0010\u0012\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001aQ\u0010\u0014\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0011\u001a\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u001a\u0010\u0018\u001a\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0017\u0010 \u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0003H\u0001¢\u0006\u0004\b \u0010\u001e\u001a\u0017\u0010!\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0003H\u0001¢\u0006\u0004\b!\u0010\"\u001a\u0017\u0010#\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0003H\u0001¢\u0006\u0004\b#\u0010\"\u001a\u001f\u0010\u001f\u001a\u00020\u00032\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0000¢\u0006\u0004\b\u001f\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006("}, m3636d2 = {"Lio/ktor/utils/io/bits/Memory;", "", "text", "", "from", "to", "dstOffset", "dstLimit", "Lio/ktor/utils/io/core/internal/EncodeResult;", "encodeUTF8-lBXzO7A", "(Ljava/nio/ByteBuffer;Ljava/lang/CharSequence;IIII)I", "encodeUTF8", "index1", "lastCharIndex", "resultPosition1", "resultLimit", "encodeUTF8Stage1-Vm9B2pQ", "(Ljava/nio/ByteBuffer;Ljava/lang/CharSequence;IIIIII)I", "encodeUTF8Stage1", "encodeUTF8Stage2-Vm9B2pQ", "encodeUTF8Stage2", "byteCount", "", "malformedByteCount", "(I)Ljava/lang/Void;", "value", "malformedCodePoint", "cp", "", "isBmpCodePoint", "(I)Z", "codePoint", "isValidCodePoint", "lowSurrogate", "(I)I", "highSurrogate", "", "high", "low", "(CC)I", "ktor-io"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.utils.io.core.internal.UTF8Kt, reason: use source file name */
/* loaded from: classes14.dex */
public final class UTF83 {
    public static final int codePoint(char c, char c2) {
        return ((c - 55232) << 10) | (c2 - 56320);
    }

    @PublishedApi
    public static final int highSurrogate(int i) {
        return (i >>> 10) + 55232;
    }

    @PublishedApi
    public static final boolean isBmpCodePoint(int i) {
        return (i >>> 16) == 0;
    }

    @PublishedApi
    public static final boolean isValidCodePoint(int i) {
        return i <= 1114111;
    }

    @PublishedApi
    public static final int lowSurrogate(int i) {
        return (i & 1023) + 56320;
    }

    /* renamed from: encodeUTF8-lBXzO7A, reason: not valid java name */
    public static final int m28491encodeUTF8lBXzO7A(ByteBuffer encodeUTF8, CharSequence text, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(encodeUTF8, "$this$encodeUTF8");
        Intrinsics.checkNotNullParameter(text, "text");
        int iMin = Math.min(i2, i + Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        int iCoerceAtMost = RangesKt.coerceAtMost(i4, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        int i5 = i;
        int i6 = i3;
        while (i6 < iCoerceAtMost && i5 < iMin) {
            int i7 = i5 + 1;
            char cCharAt = text.charAt(i5);
            int i8 = cCharAt & 65535;
            if ((cCharAt & 65408) == 0) {
                encodeUTF8.put(i6, (byte) i8);
                i5 = i7;
                i6++;
            } else {
                return m28492encodeUTF8Stage1Vm9B2pQ(encodeUTF8, text, i5, iMin, i, i6, iCoerceAtMost, i3);
            }
        }
        return EncodeResult.m28488constructorimpl(UShort.m28629constructorimpl((short) (i5 - i)), UShort.m28629constructorimpl((short) (i6 - i3)));
    }

    /* renamed from: encodeUTF8Stage1-Vm9B2pQ, reason: not valid java name */
    private static final int m28492encodeUTF8Stage1Vm9B2pQ(ByteBuffer byteBuffer, CharSequence charSequence, int i, int i2, int i3, int i4, int i5, int i6) {
        int iCodePoint;
        int i7;
        int i8 = i5 - 3;
        while (i8 - i4 > 0 && i < i2) {
            int i9 = i + 1;
            char cCharAt = charSequence.charAt(i);
            if (!Character.isHighSurrogate(cCharAt)) {
                i = i9;
                iCodePoint = cCharAt;
            } else if (i9 == i2 || !Character.isLowSurrogate(charSequence.charAt(i9))) {
                i = i9;
                iCodePoint = 63;
            } else {
                i += 2;
                iCodePoint = codePoint(cCharAt, charSequence.charAt(i9));
            }
            if (iCodePoint >= 0 && iCodePoint < 128) {
                byteBuffer.put(i4, (byte) iCodePoint);
                i7 = 1;
            } else if (128 <= iCodePoint && iCodePoint < 2048) {
                byteBuffer.put(i4, (byte) (((iCodePoint >> 6) & 31) | 192));
                byteBuffer.put(i4 + 1, (byte) (128 | (iCodePoint & 63)));
                i7 = 2;
            } else if (2048 <= iCodePoint && iCodePoint < 65536) {
                byteBuffer.put(i4, (byte) (((iCodePoint >> 12) & 15) | 224));
                byteBuffer.put(i4 + 1, (byte) ((63 & (iCodePoint >> 6)) | 128));
                byteBuffer.put(i4 + 2, (byte) (128 | (iCodePoint & 63)));
                i7 = 3;
            } else {
                if (65536 > iCodePoint || iCodePoint >= 1114112) {
                    malformedCodePoint(iCodePoint);
                    throw new ExceptionsH();
                }
                byteBuffer.put(i4, (byte) (((iCodePoint >> 18) & 7) | EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                byteBuffer.put(i4 + 1, (byte) (((iCodePoint >> 12) & 63) | 128));
                byteBuffer.put(i4 + 2, (byte) ((63 & (iCodePoint >> 6)) | 128));
                byteBuffer.put(i4 + 3, (byte) (128 | (iCodePoint & 63)));
                i7 = 4;
            }
            i4 += i7;
        }
        if (i4 == i8) {
            return m28493encodeUTF8Stage2Vm9B2pQ(byteBuffer, charSequence, i, i2, i3, i4, i5, i6);
        }
        return EncodeResult.m28488constructorimpl(UShort.m28629constructorimpl((short) (i - i3)), UShort.m28629constructorimpl((short) (i4 - i6)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e2, code lost:
    
        malformedCodePoint(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ea, code lost:
    
        throw new kotlin.ExceptionsH();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fd, code lost:
    
        return io.ktor.utils.p478io.core.internal.EncodeResult.m28488constructorimpl(kotlin.UShort.m28629constructorimpl((short) (r3 - r20)), kotlin.UShort.m28629constructorimpl((short) (r4 - r23)));
     */
    /* renamed from: encodeUTF8Stage2-Vm9B2pQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final int m28493encodeUTF8Stage2Vm9B2pQ(ByteBuffer byteBuffer, CharSequence charSequence, int i, int i2, int i3, int i4, int i5, int i6) {
        int iCodePoint;
        int i7;
        int i8;
        int i9 = i;
        int i10 = i4;
        while (true) {
            int i11 = i5 - i10;
            if (i11 <= 0 || i9 >= i2) {
                break;
            }
            int i12 = i9 + 1;
            char cCharAt = charSequence.charAt(i9);
            if (!Character.isHighSurrogate(cCharAt)) {
                i9 = i12;
                iCodePoint = cCharAt;
            } else if (i12 == i2 || !Character.isLowSurrogate(charSequence.charAt(i12))) {
                i9 = i12;
                iCodePoint = 63;
            } else {
                i9 += 2;
                iCodePoint = codePoint(cCharAt, charSequence.charAt(i12));
            }
            if (1 <= iCodePoint && iCodePoint < 128) {
                i7 = 1;
            } else if (128 <= iCodePoint && iCodePoint < 2048) {
                i7 = 2;
            } else if (2048 <= iCodePoint && iCodePoint < 65536) {
                i7 = 3;
            } else {
                if (65536 > iCodePoint || iCodePoint >= 1114112) {
                    break;
                }
                i7 = 4;
            }
            if (i7 > i11) {
                i9--;
                break;
            }
            if (iCodePoint >= 0 && iCodePoint < 128) {
                byteBuffer.put(i10, (byte) iCodePoint);
                i8 = 1;
            } else if (128 <= iCodePoint && iCodePoint < 2048) {
                byteBuffer.put(i10, (byte) (((iCodePoint >> 6) & 31) | 192));
                byteBuffer.put(i10 + 1, (byte) ((iCodePoint & 63) | 128));
                i8 = 2;
            } else if (2048 <= iCodePoint && iCodePoint < 65536) {
                byteBuffer.put(i10, (byte) (((iCodePoint >> 12) & 15) | 224));
                byteBuffer.put(i10 + 1, (byte) (((iCodePoint >> 6) & 63) | 128));
                byteBuffer.put(i10 + 2, (byte) ((iCodePoint & 63) | 128));
                i8 = 3;
            } else {
                if (65536 > iCodePoint || iCodePoint >= 1114112) {
                    break;
                }
                byteBuffer.put(i10, (byte) (((iCodePoint >> 18) & 7) | EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                byteBuffer.put(i10 + 1, (byte) (((iCodePoint >> 12) & 63) | 128));
                byteBuffer.put(i10 + 2, (byte) (((iCodePoint >> 6) & 63) | 128));
                byteBuffer.put(i10 + 3, (byte) ((iCodePoint & 63) | 128));
                i8 = 4;
            }
            i10 += i8;
        }
        malformedCodePoint(iCodePoint);
        throw new ExceptionsH();
    }

    @PublishedApi
    public static final Void malformedByteCount(int i) throws UTF82 {
        throw new UTF82("Expected " + i + " more character bytes");
    }

    @PublishedApi
    public static final Void malformedCodePoint(int i) {
        throw new IllegalArgumentException("Malformed code-point " + i + " found");
    }
}
