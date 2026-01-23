package p479j$.sun.nio.p480cs;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.Objects;

/* renamed from: j$.sun.nio.cs.b */
/* loaded from: classes29.dex */
public final class C45717b extends CharsetEncoder {

    /* renamed from: a */
    public final C45720e f6658a;

    @Override // java.nio.charset.CharsetEncoder
    public final boolean canEncode(char c) {
        return c <= 255;
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean isLegalReplacement(byte[] bArr) {
        return true;
    }

    public C45717b(C45718c c45718c) {
        super(c45718c, 1.0f, 1.0f);
        C45720e c45720e = new C45720e();
        c45720e.f6661a = CoderResult.UNDERFLOW;
        this.f6658a = c45720e;
    }

    /* renamed from: a */
    public static int m3365a(char[] cArr, int i, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        if (i3 <= 0) {
            return 0;
        }
        Objects.requireNonNull(cArr);
        Objects.requireNonNull(bArr);
        if (i < 0 || i >= cArr.length) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        if (i2 < 0 || i2 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i2);
        }
        int i5 = (i + i3) - 1;
        if (i5 < 0 || i5 >= cArr.length) {
            throw new ArrayIndexOutOfBoundsException(i5);
        }
        int i6 = (i2 + i3) - 1;
        if (i6 < 0 || i6 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i6);
        }
        while (i4 < i3) {
            int i7 = i + 1;
            char c = cArr[i];
            if (c > 255) {
                break;
            }
            bArr[i2] = (byte) c;
            i4++;
            i = i7;
            i2++;
        }
        return i4;
    }

    @Override // java.nio.charset.CharsetEncoder
    public final CoderResult encodeLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
        CoderResult coderResultUnmappableForLength;
        CoderResult coderResultUnmappableForLength2;
        int i = 2;
        if (!charBuffer.hasArray() || !byteBuffer.hasArray()) {
            int iPosition = charBuffer.position();
            while (true) {
                try {
                    if (!charBuffer.hasRemaining()) {
                        coderResultUnmappableForLength = CoderResult.UNDERFLOW;
                        break;
                    }
                    char c = charBuffer.get();
                    if (c <= 255) {
                        if (!byteBuffer.hasRemaining()) {
                            coderResultUnmappableForLength = CoderResult.OVERFLOW;
                            break;
                        }
                        byteBuffer.put((byte) c);
                        iPosition++;
                    } else if (this.f6658a.m3366a(c, charBuffer) < 0) {
                        coderResultUnmappableForLength = this.f6658a.f6661a;
                    } else {
                        if (!this.f6658a.f6662b) {
                            i = 1;
                        }
                        coderResultUnmappableForLength = CoderResult.unmappableForLength(i);
                    }
                } finally {
                }
            }
            return coderResultUnmappableForLength;
        }
        char[] cArrArray = charBuffer.array();
        int iArrayOffset = charBuffer.arrayOffset();
        int iPosition2 = charBuffer.position() + iArrayOffset;
        int iLimit = charBuffer.limit() + iArrayOffset;
        if (iPosition2 > iLimit) {
            iPosition2 = iLimit;
        }
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset2 = byteBuffer.arrayOffset();
        int iPosition3 = byteBuffer.position() + iArrayOffset2;
        int iLimit2 = byteBuffer.limit() + iArrayOffset2;
        if (iPosition3 > iLimit2) {
            iPosition3 = iLimit2;
        }
        int i2 = iLimit2 - iPosition3;
        int i3 = iLimit - iPosition2;
        if (i2 >= i3) {
            i2 = i3;
        }
        try {
            int iM3365a = m3365a(cArrArray, iPosition2, bArrArray, iPosition3, i2);
            int i4 = iPosition2 + iM3365a;
            int i5 = iPosition3 + iM3365a;
            if (iM3365a == i2) {
                coderResultUnmappableForLength2 = i2 < i3 ? CoderResult.OVERFLOW : CoderResult.UNDERFLOW;
            } else if (this.f6658a.m3367b(cArrArray[i4], cArrArray, i4, iLimit) < 0) {
                coderResultUnmappableForLength2 = this.f6658a.f6661a;
            } else {
                if (!this.f6658a.f6662b) {
                    i = 1;
                }
                coderResultUnmappableForLength2 = CoderResult.unmappableForLength(i);
            }
            return coderResultUnmappableForLength2;
        } catch (Throwable th) {
            throw th;
        }
    }
}
