package io.sentry.vendor;

import java.io.UnsupportedEncodingException;

/* loaded from: classes14.dex */
public class Base64 {

    static abstract class Coder {

        /* renamed from: op */
        public int f6656op;
        public byte[] output;

        Coder() {
        }
    }

    public static String encodeToString(byte[] bArr, int i) {
        try {
            return new String(encode(bArr, i), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static byte[] encode(byte[] bArr, int i) {
        return encode(bArr, 0, bArr.length, i);
    }

    public static byte[] encode(byte[] bArr, int i, int i2, int i3) {
        Encoder encoder = new Encoder(i3, null);
        int i4 = (i2 / 3) * 4;
        if (encoder.do_padding) {
            if (i2 % 3 > 0) {
                i4 += 4;
            }
        } else {
            int i5 = i2 % 3;
            if (i5 == 1) {
                i4 += 2;
            } else if (i5 == 2) {
                i4 += 3;
            }
        }
        if (encoder.do_newline && i2 > 0) {
            i4 += (((i2 - 1) / 57) + 1) * (encoder.do_cr ? 2 : 1);
        }
        encoder.output = new byte[i4];
        encoder.process(bArr, i, i2, true);
        return encoder.output;
    }

    static class Encoder extends Coder {
        private static final byte[] ENCODE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        private static final byte[] ENCODE_WEBSAFE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        private final byte[] alphabet;
        private int count;
        public final boolean do_cr;
        public final boolean do_newline;
        public final boolean do_padding;
        private final byte[] tail;
        int tailLen;

        public Encoder(int i, byte[] bArr) {
            this.output = bArr;
            this.do_padding = (i & 1) == 0;
            boolean z = (i & 2) == 0;
            this.do_newline = z;
            this.do_cr = (i & 4) != 0;
            this.alphabet = (i & 8) == 0 ? ENCODE : ENCODE_WEBSAFE;
            this.tail = new byte[2];
            this.tailLen = 0;
            this.count = z ? 19 : -1;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean process(byte[] bArr, int i, int i2, boolean z) {
            int i3;
            int i4;
            int i5;
            int i6;
            byte b;
            byte b2;
            byte b3;
            int i7;
            int i8;
            byte[] bArr2 = this.alphabet;
            byte[] bArr3 = this.output;
            int i9 = this.count;
            int i10 = i2 + i;
            int i11 = this.tailLen;
            char c = 2;
            int i12 = 0;
            if (i11 != 1) {
                if (i11 == 2 && (i8 = i + 1) <= i10) {
                    byte[] bArr4 = this.tail;
                    i4 = ((bArr4[1] & 255) << 8) | ((bArr4[0] & 255) << 16) | (bArr[i] & 255);
                    this.tailLen = 0;
                    i3 = i8;
                } else {
                    i3 = i;
                    i4 = -1;
                }
            } else if (i + 2 <= i10) {
                i3 = i + 2;
                i4 = (bArr[i + 1] & 255) | ((this.tail[0] & 255) << 16) | ((bArr[i] & 255) << 8);
                this.tailLen = 0;
            }
            if (i4 != -1) {
                bArr3[0] = bArr2[(i4 >> 18) & 63];
                bArr3[1] = bArr2[(i4 >> 12) & 63];
                bArr3[2] = bArr2[(i4 >> 6) & 63];
                bArr3[3] = bArr2[i4 & 63];
                i9--;
                if (i9 == 0) {
                    if (this.do_cr) {
                        bArr3[4] = 13;
                        i7 = 5;
                    } else {
                        i7 = 4;
                    }
                    i5 = i7 + 1;
                    bArr3[i7] = 10;
                    i9 = 19;
                } else {
                    i5 = 4;
                }
            } else {
                i5 = 0;
            }
            while (true) {
                int i13 = i3 + 3;
                if (i13 > i10) {
                    break;
                }
                char c2 = c;
                int i14 = ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3] & 255) << 16) | (bArr[i3 + 2] & 255);
                bArr3[i5] = bArr2[(i14 >> 18) & 63];
                bArr3[i5 + 1] = bArr2[(i14 >> 12) & 63];
                bArr3[i5 + 2] = bArr2[(i14 >> 6) & 63];
                bArr3[i5 + 3] = bArr2[i14 & 63];
                int i15 = i5 + 4;
                i9--;
                if (i9 == 0) {
                    if (this.do_cr) {
                        bArr3[i15] = 13;
                        i15 = i5 + 5;
                    }
                    i5 = i15 + 1;
                    bArr3[i15] = 10;
                    c = c2;
                    i9 = 19;
                    i3 = i13;
                } else {
                    i5 = i15;
                    i3 = i13;
                    c = c2;
                }
            }
            if (z) {
                int i16 = this.tailLen;
                if (i3 - i16 == i10 - 1) {
                    if (i16 > 0) {
                        b3 = this.tail[0];
                        i12 = 1;
                    } else {
                        b3 = bArr[i3];
                    }
                    int i17 = (b3 & 255) << 4;
                    this.tailLen = i16 - i12;
                    bArr3[i5] = bArr2[(i17 >> 6) & 63];
                    int i18 = i5 + 2;
                    bArr3[i5 + 1] = bArr2[i17 & 63];
                    if (this.do_padding) {
                        bArr3[i18] = 61;
                        i18 = i5 + 4;
                        bArr3[i5 + 3] = 61;
                    }
                    if (this.do_newline) {
                        if (this.do_cr) {
                            bArr3[i18] = 13;
                            i18++;
                        }
                        i6 = i18 + 1;
                        bArr3[i18] = 10;
                        i5 = i6;
                    } else {
                        i5 = i18;
                    }
                } else if (i3 - i16 == i10 - 2) {
                    if (i16 > 1) {
                        b = this.tail[0];
                        i12 = 1;
                    } else {
                        byte b4 = bArr[i3];
                        i3++;
                        b = b4;
                    }
                    int i19 = (b & 255) << 10;
                    if (i16 > 0) {
                        b2 = this.tail[i12];
                        i12++;
                    } else {
                        b2 = bArr[i3];
                    }
                    int i20 = i19 | ((b2 & 255) << 2);
                    this.tailLen = i16 - i12;
                    bArr3[i5] = bArr2[(i20 >> 12) & 63];
                    bArr3[i5 + 1] = bArr2[(i20 >> 6) & 63];
                    int i21 = i5 + 3;
                    bArr3[i5 + 2] = bArr2[i20 & 63];
                    if (this.do_padding) {
                        bArr3[i21] = 61;
                        i21 = i5 + 4;
                    }
                    if (this.do_newline) {
                        if (this.do_cr) {
                            bArr3[i21] = 13;
                            i21++;
                        }
                        i6 = i21 + 1;
                        bArr3[i21] = 10;
                        i5 = i6;
                    } else {
                        i5 = i21;
                    }
                } else if (this.do_newline && i5 > 0 && i9 != 19) {
                    if (this.do_cr) {
                        bArr3[i5] = 13;
                        i5++;
                    }
                    i6 = i5 + 1;
                    bArr3[i5] = 10;
                    i5 = i6;
                }
            } else if (i3 == i10 - 1) {
                byte[] bArr5 = this.tail;
                int i22 = this.tailLen;
                this.tailLen = i22 + 1;
                bArr5[i22] = bArr[i3];
            } else if (i3 == i10 - 2) {
                byte[] bArr6 = this.tail;
                int i23 = this.tailLen;
                int i24 = i23 + 1;
                this.tailLen = i24;
                bArr6[i23] = bArr[i3];
                this.tailLen = i23 + 2;
                bArr6[i24] = bArr[i3 + 1];
            }
            this.f6656op = i5;
            this.count = i9;
            return true;
        }
    }
}
