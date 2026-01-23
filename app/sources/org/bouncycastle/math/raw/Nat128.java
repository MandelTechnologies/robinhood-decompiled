package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.util.Pack;

/* loaded from: classes25.dex */
public abstract class Nat128 {

    /* renamed from: M */
    private static final long f7937M = 4294967295L;

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & f7937M) + (iArr2[0] & f7937M);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (iArr[1] & f7937M) + (iArr2[1] & f7937M);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (iArr[2] & f7937M) + (iArr2[2] & f7937M);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (iArr[3] & f7937M) + (iArr2[3] & f7937M);
        iArr3[3] = (int) j4;
        return (int) (j4 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & f7937M) + (iArr2[0] & f7937M) + (iArr3[0] & f7937M);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (iArr[1] & f7937M) + (iArr2[1] & f7937M) + (iArr3[1] & f7937M);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (iArr[2] & f7937M) + (iArr2[2] & f7937M) + (iArr3[2] & f7937M);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (iArr[3] & f7937M) + (iArr2[3] & f7937M) + (iArr3[3] & f7937M);
        iArr3[3] = (int) j4;
        return (int) (j4 >>> 32);
    }

    public static int addTo(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        long j = (i3 & f7937M) + (iArr[i] & f7937M) + (iArr2[i2] & f7937M);
        iArr2[i2] = (int) j;
        long j2 = (j >>> 32) + (iArr[i + 1] & f7937M) + (iArr2[r6] & f7937M);
        iArr2[i2 + 1] = (int) j2;
        long j3 = (j2 >>> 32) + (iArr[i + 2] & f7937M) + (iArr2[r6] & f7937M);
        iArr2[i2 + 2] = (int) j3;
        long j4 = (j3 >>> 32) + (iArr[i + 3] & f7937M) + (f7937M & iArr2[r12]);
        iArr2[i2 + 3] = (int) j4;
        return (int) (j4 >>> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j = (iArr[0] & f7937M) + (iArr2[0] & f7937M);
        iArr2[0] = (int) j;
        long j2 = (j >>> 32) + (iArr[1] & f7937M) + (iArr2[1] & f7937M);
        iArr2[1] = (int) j2;
        long j3 = (j2 >>> 32) + (iArr[2] & f7937M) + (iArr2[2] & f7937M);
        iArr2[2] = (int) j3;
        long j4 = (j3 >>> 32) + (iArr[3] & f7937M) + (f7937M & iArr2[3]);
        iArr2[3] = (int) j4;
        return (int) (j4 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i, int[] iArr2, int i2) {
        long j = (iArr[i] & f7937M) + (iArr2[i2] & f7937M);
        int i3 = (int) j;
        iArr[i] = i3;
        iArr2[i2] = i3;
        long j2 = (j >>> 32) + (iArr[r5] & f7937M) + (iArr2[r8] & f7937M);
        int i4 = (int) j2;
        iArr[i + 1] = i4;
        iArr2[i2 + 1] = i4;
        long j3 = (j2 >>> 32) + (iArr[r5] & f7937M) + (iArr2[r8] & f7937M);
        int i5 = (int) j3;
        iArr[i + 2] = i5;
        iArr2[i2 + 2] = i5;
        long j4 = (j3 >>> 32) + (iArr[r12] & f7937M) + (f7937M & iArr2[r14]);
        int i6 = (int) j4;
        iArr[i + 3] = i6;
        iArr2[i2 + 3] = i6;
        return (int) (j4 >>> 32);
    }

    public static void copy(int[] iArr, int i, int[] iArr2, int i2) {
        iArr2[i2] = iArr[i];
        iArr2[i2 + 1] = iArr[i + 1];
        iArr2[i2 + 2] = iArr[i + 2];
        iArr2[i2 + 3] = iArr[i + 3];
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
    }

    public static void copy64(long[] jArr, int i, long[] jArr2, int i2) {
        jArr2[i2] = jArr[i];
        jArr2[i2 + 1] = jArr[i + 1];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
    }

    public static int[] create() {
        return new int[4];
    }

    public static long[] create64() {
        return new long[2];
    }

    public static int[] createExt() {
        return new int[8];
    }

    public static long[] createExt64() {
        return new long[4];
    }

    public static boolean diff(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        boolean zGte = gte(iArr, i, iArr2, i2);
        if (zGte) {
            sub(iArr, i, iArr2, i2, iArr3, i3);
            return zGte;
        }
        sub(iArr2, i2, iArr, i, iArr3, i3);
        return zGte;
    }

    /* renamed from: eq */
    public static boolean m3963eq(int[] iArr, int[] iArr2) {
        for (int i = 3; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i = 1; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        int[] iArrCreate = create();
        for (int i = 0; i < 4; i++) {
            iArrCreate[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArrCreate;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        long[] jArrCreate64 = create64();
        for (int i = 0; i < 2; i++) {
            jArrCreate64[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
        }
        return jArrCreate64;
    }

    public static int getBit(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= 4) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean gte(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 3; i3 >= 0; i3--) {
            int i4 = iArr[i + i3] ^ Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE ^ iArr2[i2 + i3];
            if (i4 < i5) {
                return false;
            }
            if (i4 > i5) {
                return true;
            }
        }
        return true;
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i = 3; i >= 0; i--) {
            int i2 = iArr[i] ^ Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static boolean isOne(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOne64(long[] jArr) {
        return jArr[0] == 1 && jArr[1] == 0;
    }

    public static boolean isZero(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i = 0; i < 2; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = iArr2[i2] & f7937M;
        long j2 = iArr2[i2 + 1] & f7937M;
        long j3 = iArr2[i2 + 2] & f7937M;
        long j4 = iArr2[i2 + 3] & f7937M;
        long j5 = iArr[i] & f7937M;
        long j6 = j5 * j;
        iArr3[i3] = (int) j6;
        char c = ' ';
        long j7 = (j6 >>> 32) + (j5 * j2);
        iArr3[i3 + 1] = (int) j7;
        long j8 = (j7 >>> 32) + (j5 * j3);
        iArr3[i3 + 2] = (int) j8;
        long j9 = (j8 >>> 32) + (j5 * j4);
        iArr3[i3 + 3] = (int) j9;
        iArr3[i3 + 4] = (int) (j9 >>> 32);
        int i4 = 1;
        int i5 = i3;
        while (i4 < 4) {
            int i6 = i5 + 1;
            long j10 = iArr[i + i4] & f7937M;
            char c2 = c;
            long j11 = (j10 * j) + (iArr3[i6] & f7937M);
            iArr3[i6] = (int) j11;
            long j12 = j;
            long j13 = (j11 >>> c2) + (j10 * j2) + (iArr3[r15] & f7937M);
            iArr3[i5 + 2] = (int) j13;
            long j14 = (j13 >>> c2) + (j10 * j3) + (iArr3[r15] & f7937M);
            iArr3[i5 + 3] = (int) j14;
            long j15 = (j14 >>> c2) + (j10 * j4) + (iArr3[r13] & f7937M);
            iArr3[i5 + 4] = (int) j15;
            iArr3[i5 + 5] = (int) (j15 >>> c2);
            i4++;
            c = c2;
            i5 = i6;
            j = j12;
        }
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0];
        long j2 = f7937M;
        long j3 = j & f7937M;
        int i = 1;
        long j4 = iArr2[1] & f7937M;
        long j5 = iArr2[2] & f7937M;
        long j6 = iArr2[3] & f7937M;
        long j7 = iArr[0] & f7937M;
        long j8 = j7 * j3;
        iArr3[0] = (int) j8;
        long j9 = (j8 >>> 32) + (j7 * j4);
        iArr3[1] = (int) j9;
        long j10 = (j9 >>> 32) + (j7 * j5);
        iArr3[2] = (int) j10;
        long j11 = (j10 >>> 32) + (j7 * j6);
        iArr3[3] = (int) j11;
        iArr3[4] = (int) (j11 >>> 32);
        for (int i2 = 4; i < i2; i2 = 4) {
            long j12 = iArr[i] & j2;
            long j13 = (j12 * j3) + (iArr3[i] & j2);
            iArr3[i] = (int) j13;
            int i3 = i + 1;
            long j14 = j2;
            long j15 = (j13 >>> 32) + (j12 * j4) + (iArr3[i3] & j14);
            iArr3[i3] = (int) j15;
            long j16 = (j15 >>> 32) + (j12 * j5) + (iArr3[r11] & j14);
            iArr3[i + 2] = (int) j16;
            long j17 = (j16 >>> 32) + (j12 * j6) + (iArr3[r3] & j14);
            iArr3[i + 3] = (int) j17;
            iArr3[i + 4] = (int) (j17 >>> 32);
            i = i3;
            j2 = j14;
        }
    }

    public static long mul33Add(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j = i & f7937M;
        long j2 = iArr[i2] & f7937M;
        long j3 = (j * j2) + (iArr2[i3] & f7937M);
        iArr3[i4] = (int) j3;
        long j4 = iArr[i2 + 1] & f7937M;
        long j5 = (j3 >>> 32) + (j * j4) + j2 + (iArr2[i3 + 1] & f7937M);
        iArr3[i4 + 1] = (int) j5;
        long j6 = j5 >>> 32;
        long j7 = iArr[i2 + 2] & f7937M;
        long j8 = j6 + (j * j7) + j4 + (iArr2[i3 + 2] & f7937M);
        iArr3[i4 + 2] = (int) j8;
        long j9 = iArr[i2 + 3] & f7937M;
        long j10 = (j8 >>> 32) + (j * j9) + j7 + (f7937M & iArr2[i3 + 3]);
        iArr3[i4 + 3] = (int) j10;
        return (j10 >>> 32) + j9;
    }

    public static int mul33DWordAdd(int i, long j, int[] iArr, int i2) {
        long j2 = i & f7937M;
        long j3 = j & f7937M;
        long j4 = (j2 * j3) + (iArr[i2] & f7937M);
        iArr[i2] = (int) j4;
        long j5 = j >>> 32;
        long j6 = (j2 * j5) + j3;
        long j7 = (j4 >>> 32) + j6 + (iArr[r4] & f7937M);
        iArr[i2 + 1] = (int) j7;
        long j8 = (j7 >>> 32) + j5 + (iArr[r4] & f7937M);
        iArr[i2 + 2] = (int) j8;
        long j9 = (j8 >>> 32) + (iArr[r14] & f7937M);
        iArr[i2 + 3] = (int) j9;
        return (int) (j9 >>> 32);
    }

    public static int mul33WordAdd(int i, int i2, int[] iArr, int i3) {
        long j = i & f7937M;
        long j2 = i2 & f7937M;
        long j3 = (j * j2) + (iArr[i3] & f7937M);
        iArr[i3] = (int) j3;
        long j4 = (j3 >>> 32) + j2 + (iArr[r5] & f7937M);
        iArr[i3 + 1] = (int) j4;
        long j5 = j4 >>> 32;
        long j6 = j5 + (iArr[r0] & f7937M);
        iArr[i3 + 2] = (int) j6;
        if ((j6 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(4, iArr, i3, 3);
    }

    public static int mulAddTo(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = iArr2[i2];
        long j2 = f7937M;
        long j3 = j & f7937M;
        long j4 = iArr2[i2 + 1] & f7937M;
        long j5 = iArr2[i2 + 2] & f7937M;
        long j6 = iArr2[i2 + 3] & f7937M;
        int i4 = 0;
        long j7 = 0;
        while (true) {
            int i5 = i3;
            if (i4 >= 4) {
                return (int) j7;
            }
            long j8 = j2;
            long j9 = iArr[i + i4] & j8;
            long j10 = (j9 * j3) + (iArr3[i5] & j8);
            long j11 = j3;
            iArr3[i5] = (int) j10;
            i3 = i5 + 1;
            long j12 = (j10 >>> 32) + (j9 * j4) + (iArr3[r1] & j8);
            iArr3[i3] = (int) j12;
            long j13 = (j12 >>> 32) + (j9 * j5) + (iArr3[r20] & j8);
            iArr3[i5 + 2] = (int) j13;
            long j14 = (j13 >>> 32) + (j9 * j6) + (iArr3[r14] & j8);
            iArr3[i5 + 3] = (int) j14;
            long j15 = j7 + (j14 >>> 32) + (iArr3[r10] & j8);
            iArr3[i5 + 4] = (int) j15;
            j7 = j15 >>> 32;
            i4++;
            j2 = j8;
            j3 = j11;
        }
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j = iArr2[0];
        long j2 = f7937M;
        long j3 = j & f7937M;
        long j4 = iArr2[1] & f7937M;
        long j5 = iArr2[2] & f7937M;
        long j6 = iArr2[3] & f7937M;
        long j7 = 0;
        while (i < 4) {
            long j8 = iArr[i] & j2;
            long j9 = j2;
            long j10 = (iArr3[i] & j9) + (j8 * j3);
            iArr3[i] = (int) j10;
            int i2 = i + 1;
            int i3 = i;
            long j11 = (j10 >>> 32) + (j8 * j4) + (iArr3[i2] & j9);
            iArr3[i2] = (int) j11;
            long j12 = (j11 >>> 32) + (j8 * j5) + (iArr3[r15] & j9);
            iArr3[i3 + 2] = (int) j12;
            long j13 = (j12 >>> 32) + (j8 * j6) + (iArr3[r3] & j9);
            iArr3[i3 + 3] = (int) j13;
            long j14 = j7 + (j13 >>> 32) + (iArr3[r2] & j9);
            iArr3[i3 + 4] = (int) j14;
            j7 = j14 >>> 32;
            i = i2;
            j2 = j9;
            j3 = j3;
        }
        return (int) j7;
    }

    public static int mulWord(int i, int[] iArr, int[] iArr2, int i2) {
        long j = i & f7937M;
        long j2 = 0;
        int i3 = 0;
        do {
            long j3 = j2 + ((iArr[i3] & f7937M) * j);
            iArr2[i2 + i3] = (int) j3;
            j2 = j3 >>> 32;
            i3++;
        } while (i3 < 4);
        return (int) j2;
    }

    public static int mulWordAddExt(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        long j = i & f7937M;
        long j2 = ((iArr[i2] & f7937M) * j) + (iArr2[i3] & f7937M);
        iArr2[i3] = (int) j2;
        long j3 = (j2 >>> 32) + ((iArr[i2 + 1] & f7937M) * j) + (iArr2[r8] & f7937M);
        iArr2[i3 + 1] = (int) j3;
        long j4 = (j3 >>> 32) + ((iArr[i2 + 2] & f7937M) * j) + (iArr2[r8] & f7937M);
        iArr2[i3 + 2] = (int) j4;
        long j5 = (j4 >>> 32) + (j * (iArr[i2 + 3] & f7937M)) + (iArr2[r15] & f7937M);
        iArr2[i3 + 3] = (int) j5;
        return (int) (j5 >>> 32);
    }

    public static int mulWordDwordAdd(int i, long j, int[] iArr, int i2) {
        long j2 = i & f7937M;
        long j3 = ((j & f7937M) * j2) + (iArr[i2] & f7937M);
        iArr[i2] = (int) j3;
        long j4 = j2 * (j >>> 32);
        long j5 = (j3 >>> 32) + j4 + (iArr[r9] & f7937M);
        iArr[i2 + 1] = (int) j5;
        long j6 = (j5 >>> 32) + (iArr[r0] & f7937M);
        iArr[i2 + 2] = (int) j6;
        if ((j6 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(4, iArr, i2, 3);
    }

    public static int mulWordsAdd(int i, int i2, int[] iArr, int i3) {
        long j = ((i2 & f7937M) * (i & f7937M)) + (iArr[i3] & f7937M);
        iArr[i3] = (int) j;
        long j2 = (j >>> 32) + (f7937M & iArr[r1]);
        iArr[i3 + 1] = (int) j2;
        if ((j2 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(4, iArr, i3, 2);
    }

    public static void square(int[] iArr, int i, int[] iArr2, int i2) {
        long j = iArr[i] & f7937M;
        int i3 = 0;
        int i4 = 8;
        int i5 = 3;
        while (true) {
            int i6 = i5 - 1;
            long j2 = iArr[i + i5] & f7937M;
            long j3 = j2 * j2;
            iArr2[i2 + (i4 - 1)] = (i3 << 31) | ((int) (j3 >>> 33));
            i4 -= 2;
            iArr2[i2 + i4] = (int) (j3 >>> 1);
            i3 = (int) j3;
            if (i6 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | ((i3 << 31) & f7937M);
                iArr2[i2] = (int) j4;
                int i7 = ((int) (j4 >>> 32)) & 1;
                long j6 = iArr[i + 1] & f7937M;
                long j7 = iArr2[r12] & f7937M;
                long j8 = j5 + (j6 * j);
                int i8 = (int) j8;
                iArr2[i2 + 1] = (i8 << 1) | i7;
                int i9 = i8 >>> 31;
                long j9 = j7 + (j8 >>> 32);
                long j10 = iArr[i + 2] & f7937M;
                long j11 = iArr2[r15] & f7937M;
                long j12 = iArr2[r18] & f7937M;
                long j13 = j9 + (j10 * j);
                int i10 = (int) j13;
                iArr2[i2 + 2] = (i10 << 1) | i9;
                long j14 = j11 + (j13 >>> 32) + (j10 * j6);
                long j15 = j12 + (j14 >>> 32);
                long j16 = j14 & f7937M;
                long j17 = iArr[i + 3] & f7937M;
                long j18 = (iArr2[r14] & f7937M) + (j15 >>> 32);
                long j19 = j15 & f7937M;
                long j20 = (iArr2[r7] & f7937M) + (j18 >>> 32);
                long j21 = j18 & f7937M;
                long j22 = j16 + (j * j17);
                int i11 = (int) j22;
                iArr2[i2 + 3] = (i11 << 1) | (i10 >>> 31);
                long j23 = j19 + (j22 >>> 32) + (j6 * j17);
                long j24 = j21 + (j23 >>> 32) + (j17 * j10);
                long j25 = j20 + (j24 >>> 32);
                int i12 = (int) j23;
                iArr2[i2 + 4] = (i11 >>> 31) | (i12 << 1);
                int i13 = (int) j24;
                iArr2[i2 + 5] = (i12 >>> 31) | (i13 << 1);
                int i14 = i13 >>> 31;
                int i15 = (int) j25;
                iArr2[i2 + 6] = i14 | (i15 << 1);
                int i16 = i15 >>> 31;
                int i17 = i2 + 7;
                iArr2[i17] = i16 | ((iArr2[i17] + ((int) (j25 >>> 32))) << 1);
                return;
            }
            i5 = i6;
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j = iArr[0] & f7937M;
        int i = 8;
        int i2 = 0;
        int i3 = 3;
        while (true) {
            int i4 = i3 - 1;
            long j2 = iArr[i3] & f7937M;
            long j3 = j2 * j2;
            iArr2[i - 1] = (i2 << 31) | ((int) (j3 >>> 33));
            i -= 2;
            iArr2[i] = (int) (j3 >>> 1);
            i2 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | ((i2 << 31) & f7937M);
                iArr2[0] = (int) j4;
                long j6 = iArr[1] & f7937M;
                long j7 = iArr2[2] & f7937M;
                long j8 = j5 + (j6 * j);
                int i5 = (int) j8;
                iArr2[1] = (i5 << 1) | (((int) (j4 >>> 32)) & 1);
                long j9 = j7 + (j8 >>> 32);
                long j10 = iArr[2] & f7937M;
                long j11 = iArr2[3] & f7937M;
                long j12 = iArr2[4] & f7937M;
                long j13 = j9 + (j10 * j);
                int i6 = (int) j13;
                iArr2[2] = (i6 << 1) | (i5 >>> 31);
                long j14 = j11 + (j13 >>> 32) + (j10 * j6);
                long j15 = j12 + (j14 >>> 32);
                long j16 = j14 & f7937M;
                long j17 = iArr[3] & f7937M;
                long j18 = (iArr2[5] & f7937M) + (j15 >>> 32);
                long j19 = j15 & f7937M;
                long j20 = (iArr2[6] & f7937M) + (j18 >>> 32);
                long j21 = j18 & f7937M;
                long j22 = j16 + (j * j17);
                int i7 = (int) j22;
                iArr2[3] = (i7 << 1) | (i6 >>> 31);
                long j23 = j19 + (j22 >>> 32) + (j6 * j17);
                long j24 = j21 + (j23 >>> 32) + (j17 * j10);
                long j25 = j20 + (j24 >>> 32);
                long j26 = j24 & f7937M;
                int i8 = (int) j23;
                iArr2[4] = (i8 << 1) | (i7 >>> 31);
                int i9 = (int) j26;
                iArr2[5] = (i9 << 1) | (i8 >>> 31);
                int i10 = (int) j25;
                iArr2[6] = (i9 >>> 31) | (i10 << 1);
                iArr2[7] = (i10 >>> 31) | ((iArr2[7] + ((int) (j25 >>> 32))) << 1);
                return;
            }
            i3 = i4;
        }
    }

    public static int sub(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = (iArr[i] & f7937M) - (iArr2[i2] & f7937M);
        iArr3[i3] = (int) j;
        long j2 = (j >> 32) + ((iArr[i + 1] & f7937M) - (iArr2[i2 + 1] & f7937M));
        iArr3[i3 + 1] = (int) j2;
        long j3 = (j2 >> 32) + ((iArr[i + 2] & f7937M) - (iArr2[i2 + 2] & f7937M));
        iArr3[i3 + 2] = (int) j3;
        long j4 = (j3 >> 32) + ((iArr[i + 3] & f7937M) - (iArr2[i2 + 3] & f7937M));
        iArr3[i3 + 3] = (int) j4;
        return (int) (j4 >> 32);
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & f7937M) - (iArr2[0] & f7937M);
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + ((iArr[1] & f7937M) - (iArr2[1] & f7937M));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + ((iArr[2] & f7937M) - (iArr2[2] & f7937M));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + ((iArr[3] & f7937M) - (iArr2[3] & f7937M));
        iArr3[3] = (int) j4;
        return (int) (j4 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((iArr3[0] & f7937M) - (iArr[0] & f7937M)) - (iArr2[0] & f7937M);
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + (((iArr3[1] & f7937M) - (iArr[1] & f7937M)) - (iArr2[1] & f7937M));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + (((iArr3[2] & f7937M) - (iArr[2] & f7937M)) - (iArr2[2] & f7937M));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + (((iArr3[3] & f7937M) - (iArr[3] & f7937M)) - (iArr2[3] & f7937M));
        iArr3[3] = (int) j4;
        return (int) (j4 >> 32);
    }

    public static int subFrom(int[] iArr, int i, int[] iArr2, int i2) {
        long j = (iArr2[i2] & f7937M) - (iArr[i] & f7937M);
        iArr2[i2] = (int) j;
        long j2 = (j >> 32) + ((iArr2[r5] & f7937M) - (iArr[i + 1] & f7937M));
        iArr2[i2 + 1] = (int) j2;
        long j3 = (j2 >> 32) + ((iArr2[r5] & f7937M) - (iArr[i + 2] & f7937M));
        iArr2[i2 + 2] = (int) j3;
        long j4 = (j3 >> 32) + ((iArr2[r13] & f7937M) - (iArr[i + 3] & f7937M));
        iArr2[i2 + 3] = (int) j4;
        return (int) (j4 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j = (iArr2[0] & f7937M) - (iArr[0] & f7937M);
        iArr2[0] = (int) j;
        long j2 = (j >> 32) + ((iArr2[1] & f7937M) - (iArr[1] & f7937M));
        iArr2[1] = (int) j2;
        long j3 = (j2 >> 32) + ((iArr2[2] & f7937M) - (iArr[2] & f7937M));
        iArr2[2] = (int) j3;
        long j4 = (j3 >> 32) + ((iArr2[3] & f7937M) - (f7937M & iArr[3]));
        iArr2[3] = (int) j4;
        return (int) (j4 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                Pack.intToBigEndian(i2, bArr, (3 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 2; i++) {
            long j = jArr[i];
            if (j != 0) {
                Pack.longToBigEndian(j, bArr, (1 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
    }
}
