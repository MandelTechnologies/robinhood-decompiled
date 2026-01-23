package p479j$.util;

import java.util.Arrays;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import p479j$.sun.nio.p480cs.C45718c;

/* loaded from: classes29.dex */
public class Base64 {
    public static Encoder getEncoder() {
        return Encoder.f7007c;
    }

    public static Decoder getDecoder() {
        return Decoder.f7004c;
    }

    public static class Encoder {

        /* renamed from: a */
        public static final char[] f7005a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

        /* renamed from: b */
        public static final char[] f7006b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};

        /* renamed from: c */
        public static final Encoder f7007c = new Encoder();

        public byte[] encode(byte[] bArr) {
            int length = ((bArr.length + 2) / 3) * 4;
            byte[] bArr2 = new byte[length];
            int length2 = bArr.length;
            int i = (length2 / 3) * 3;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                char[] cArr = f7005a;
                if (i2 >= i) {
                    if (i2 < length2) {
                        int i4 = i2 + 1;
                        int i5 = bArr[i2] & 255;
                        int i6 = i3 + 1;
                        bArr2[i3] = (byte) cArr[i5 >> 2];
                        if (i4 == length2) {
                            bArr2[i6] = (byte) cArr[(i5 << 4) & 63];
                            int i7 = i3 + 3;
                            bArr2[i3 + 2] = 61;
                            i3 += 4;
                            bArr2[i7] = 61;
                        } else {
                            int i8 = bArr[i4] & 255;
                            bArr2[i6] = (byte) cArr[((i5 << 4) & 63) | (i8 >> 4)];
                            int i9 = i3 + 3;
                            bArr2[i3 + 2] = (byte) cArr[(i8 << 2) & 63];
                            i3 += 4;
                            bArr2[i9] = 61;
                        }
                    }
                    return i3 != length ? Arrays.copyOf(bArr2, i3) : bArr2;
                }
                int iMin = Math.min(i2 + i, i);
                int i10 = i2;
                int i11 = i3;
                while (i10 < iMin) {
                    int i12 = i10 + 2;
                    int i13 = ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10] & 255) << 16);
                    i10 += 3;
                    int i14 = i13 | (bArr[i12] & 255);
                    bArr2[i11] = (byte) cArr[(i14 >>> 18) & 63];
                    bArr2[i11 + 1] = (byte) cArr[(i14 >>> 12) & 63];
                    int i15 = i11 + 3;
                    bArr2[i11 + 2] = (byte) cArr[(i14 >>> 6) & 63];
                    i11 += 4;
                    bArr2[i15] = (byte) cArr[i14 & 63];
                }
                int i16 = ((iMin - i2) / 3) * 4;
                i3 += i16;
                if (i16 == -1 && iMin < length2) {
                    throw null;
                }
                i2 = iMin;
            }
        }
    }

    public static class Decoder {

        /* renamed from: a */
        public static final int[] f7002a;

        /* renamed from: b */
        public static final int[] f7003b;

        /* renamed from: c */
        public static final Decoder f7004c;

        static {
            int[] iArr = new int[256];
            f7002a = iArr;
            Arrays.fill(iArr, -1);
            for (int i = 0; i < 64; i++) {
                f7002a[Encoder.f7005a[i]] = i;
            }
            f7002a[61] = -2;
            int[] iArr2 = new int[256];
            f7003b = iArr2;
            Arrays.fill(iArr2, -1);
            for (int i2 = 0; i2 < 64; i2++) {
                f7003b[Encoder.f7006b[i2]] = i2;
            }
            f7003b[61] = -2;
            f7004c = new Decoder();
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
        
            if (r9 != 18) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x010a, code lost:
        
            if (r9 != 6) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x010c, code lost:
        
            r5[r10] = (byte) (r11 >> 16);
            r10 = r10 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0117, code lost:
        
            if (r9 != 0) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0119, code lost:
        
            r0 = r10 + 1;
            r5[r10] = (byte) (r11 >> 16);
            r10 = r10 + 2;
            r5[r0] = (byte) (r11 >> 8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x012a, code lost:
        
            if (r9 == 12) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x012c, code lost:
        
            if (r8 < r6) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x012e, code lost:
        
            if (r10 == r1) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0134, code lost:
        
            return java.util.Arrays.copyOf(r5, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0135, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0149, code lost:
        
            throw new java.lang.IllegalArgumentException("Input byte array has incorrect ending byte at " + r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0151, code lost:
        
            throw new java.lang.IllegalArgumentException("Last unit does not have enough valid bits");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public byte[] decode(String str) {
            int i;
            int i2;
            int i3;
            char c;
            byte[] bytes = str.getBytes(C45718c.f6659a);
            int length = bytes.length;
            char c2 = 2;
            if (length == 0) {
                i2 = 0;
            } else {
                if (length < 2) {
                    throw new IllegalArgumentException("Input byte[] should at least have 2 bytes for base64 bytes");
                }
                if (bytes[length - 1] == 61) {
                    i = bytes[length + (-2)] == 61 ? 2 : 1;
                } else {
                    i = 0;
                }
                if (i == 0 && (i3 = length & 3) != 0) {
                    i = 4 - i3;
                }
                i2 = (((length + 3) / 4) * 3) - i;
            }
            byte[] bArr = new byte[i2];
            int length2 = bytes.length;
            int i4 = 18;
            int i5 = 18;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (i6 >= length2) {
                    break;
                }
                int[] iArr = f7002a;
                if (i5 == i4 && i6 + 4 < length2) {
                    int i9 = ((length2 - i6) & (-4)) + i6;
                    while (true) {
                        if (i6 >= i9) {
                            c = c2;
                            break;
                        }
                        int i10 = iArr[bytes[i6] & 255];
                        c = c2;
                        int i11 = iArr[bytes[i6 + 1] & 255];
                        int i12 = iArr[bytes[i6 + 2] & 255];
                        int i13 = i6 + 4;
                        int i14 = iArr[bytes[i6 + 3] & 255];
                        if ((i10 | i11 | i12 | i14) < 0) {
                            break;
                        }
                        int i15 = (i10 << 18) | (i11 << 12) | (i12 << 6) | i14;
                        bArr[i7] = (byte) (i15 >> 16);
                        int i16 = i7 + 2;
                        bArr[i7 + 1] = (byte) (i15 >> 8);
                        i7 += 3;
                        bArr[i16] = (byte) i15;
                        i6 = i13;
                        c2 = c;
                    }
                    if (i6 < length2) {
                        break;
                        break;
                    }
                    break;
                }
                c = c2;
                int i17 = i6 + 1;
                int i18 = iArr[bytes[i6] & 255];
                if (i18 >= 0) {
                    i4 = 18;
                    int i19 = (i18 << i5) | i8;
                    i5 -= 6;
                    if (i5 < 0) {
                        bArr[i7] = (byte) (i19 >> 16);
                        int i20 = i7 + 2;
                        bArr[i7 + 1] = (byte) (i19 >> 8);
                        i7 += 3;
                        bArr[i20] = (byte) i19;
                        i5 = 18;
                        i8 = 0;
                    } else {
                        i8 = i19;
                    }
                    i6 = i17;
                    c2 = c;
                } else {
                    if (i18 != -2) {
                        throw new IllegalArgumentException("Illegal base64 character " + Integer.toString(bytes[i6], 16));
                    }
                    if (i5 == 6) {
                        if (i17 != length2) {
                            i6 += 2;
                            if (bytes[i17] == 61) {
                            }
                        }
                        throw new IllegalArgumentException("Input byte array has wrong 4-byte ending unit");
                    }
                    i6 = i17;
                }
            }
        }
    }
}
