package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes25.dex */
public class SHA256Digest extends GeneralDigest implements EncodableDigest {
    private static final int DIGEST_LENGTH = 32;

    /* renamed from: K */
    static final int[] f7389K = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* renamed from: H1 */
    private int f7390H1;

    /* renamed from: H2 */
    private int f7391H2;

    /* renamed from: H3 */
    private int f7392H3;

    /* renamed from: H4 */
    private int f7393H4;

    /* renamed from: H5 */
    private int f7394H5;

    /* renamed from: H6 */
    private int f7395H6;

    /* renamed from: H7 */
    private int f7396H7;

    /* renamed from: H8 */
    private int f7397H8;

    /* renamed from: X */
    private int[] f7398X;
    private int xOff;

    public SHA256Digest() {
        this.f7398X = new int[64];
        reset();
    }

    public SHA256Digest(SHA256Digest sHA256Digest) {
        super(sHA256Digest);
        this.f7398X = new int[64];
        copyIn(sHA256Digest);
    }

    public SHA256Digest(byte[] bArr) {
        super(bArr);
        this.f7398X = new int[64];
        this.f7390H1 = Pack.bigEndianToInt(bArr, 16);
        this.f7391H2 = Pack.bigEndianToInt(bArr, 20);
        this.f7392H3 = Pack.bigEndianToInt(bArr, 24);
        this.f7393H4 = Pack.bigEndianToInt(bArr, 28);
        this.f7394H5 = Pack.bigEndianToInt(bArr, 32);
        this.f7395H6 = Pack.bigEndianToInt(bArr, 36);
        this.f7396H7 = Pack.bigEndianToInt(bArr, 40);
        this.f7397H8 = Pack.bigEndianToInt(bArr, 44);
        this.xOff = Pack.bigEndianToInt(bArr, 48);
        for (int i = 0; i != this.xOff; i++) {
            this.f7398X[i] = Pack.bigEndianToInt(bArr, (i * 4) + 52);
        }
    }

    /* renamed from: Ch */
    private static int m3912Ch(int i, int i2, int i3) {
        return ((~i) & i3) ^ (i2 & i);
    }

    private static int Maj(int i, int i2, int i3) {
        return ((i ^ i2) & i3) | (i & i2);
    }

    private static int Sum0(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    private static int Sum1(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    private static int Theta0(int i) {
        return (i >>> 3) ^ (((i >>> 7) | (i << 25)) ^ ((i >>> 18) | (i << 14)));
    }

    private static int Theta1(int i) {
        return (i >>> 10) ^ (((i >>> 17) | (i << 15)) ^ ((i >>> 19) | (i << 13)));
    }

    private void copyIn(SHA256Digest sHA256Digest) {
        super.copyIn((GeneralDigest) sHA256Digest);
        this.f7390H1 = sHA256Digest.f7390H1;
        this.f7391H2 = sHA256Digest.f7391H2;
        this.f7392H3 = sHA256Digest.f7392H3;
        this.f7393H4 = sHA256Digest.f7393H4;
        this.f7394H5 = sHA256Digest.f7394H5;
        this.f7395H6 = sHA256Digest.f7395H6;
        this.f7396H7 = sHA256Digest.f7396H7;
        this.f7397H8 = sHA256Digest.f7397H8;
        int[] iArr = sHA256Digest.f7398X;
        System.arraycopy(iArr, 0, this.f7398X, 0, iArr.length);
        this.xOff = sHA256Digest.xOff;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA256Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.intToBigEndian(this.f7390H1, bArr, i);
        Pack.intToBigEndian(this.f7391H2, bArr, i + 4);
        Pack.intToBigEndian(this.f7392H3, bArr, i + 8);
        Pack.intToBigEndian(this.f7393H4, bArr, i + 12);
        Pack.intToBigEndian(this.f7394H5, bArr, i + 16);
        Pack.intToBigEndian(this.f7395H6, bArr, i + 20);
        Pack.intToBigEndian(this.f7396H7, bArr, i + 24);
        Pack.intToBigEndian(this.f7397H8, bArr, i + 28);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA-256";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        byte[] bArr = new byte[(this.xOff * 4) + 52];
        super.populateState(bArr);
        Pack.intToBigEndian(this.f7390H1, bArr, 16);
        Pack.intToBigEndian(this.f7391H2, bArr, 20);
        Pack.intToBigEndian(this.f7392H3, bArr, 24);
        Pack.intToBigEndian(this.f7393H4, bArr, 28);
        Pack.intToBigEndian(this.f7394H5, bArr, 32);
        Pack.intToBigEndian(this.f7395H6, bArr, 36);
        Pack.intToBigEndian(this.f7396H7, bArr, 40);
        Pack.intToBigEndian(this.f7397H8, bArr, 44);
        Pack.intToBigEndian(this.xOff, bArr, 48);
        for (int i = 0; i != this.xOff; i++) {
            Pack.intToBigEndian(this.f7398X[i], bArr, (i * 4) + 52);
        }
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processBlock() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.f7398X;
            int iTheta1 = Theta1(iArr[i - 2]);
            int[] iArr2 = this.f7398X;
            iArr[i] = iTheta1 + iArr2[i - 7] + Theta0(iArr2[i - 15]) + this.f7398X[i - 16];
        }
        int iSum0 = this.f7390H1;
        int iSum02 = this.f7391H2;
        int iSum03 = this.f7392H3;
        int iSum04 = this.f7393H4;
        int i2 = this.f7394H5;
        int i3 = this.f7395H6;
        int i4 = this.f7396H7;
        int i5 = this.f7397H8;
        int i6 = 0;
        for (int i7 = 0; i7 < 8; i7++) {
            int iSum1 = Sum1(i2) + m3912Ch(i2, i3, i4);
            int[] iArr3 = f7389K;
            int i8 = i5 + iSum1 + iArr3[i6] + this.f7398X[i6];
            int i9 = iSum04 + i8;
            int iSum05 = i8 + Sum0(iSum0) + Maj(iSum0, iSum02, iSum03);
            int i10 = i6 + 1;
            int iSum12 = i4 + Sum1(i9) + m3912Ch(i9, i2, i3) + iArr3[i10] + this.f7398X[i10];
            int i11 = iSum03 + iSum12;
            int iSum06 = iSum12 + Sum0(iSum05) + Maj(iSum05, iSum0, iSum02);
            int i12 = i6 + 2;
            int iSum13 = i3 + Sum1(i11) + m3912Ch(i11, i9, i2) + iArr3[i12] + this.f7398X[i12];
            int i13 = iSum02 + iSum13;
            int iSum07 = iSum13 + Sum0(iSum06) + Maj(iSum06, iSum05, iSum0);
            int i14 = i6 + 3;
            int iSum14 = i2 + Sum1(i13) + m3912Ch(i13, i11, i9) + iArr3[i14] + this.f7398X[i14];
            int i15 = iSum0 + iSum14;
            int iSum08 = iSum14 + Sum0(iSum07) + Maj(iSum07, iSum06, iSum05);
            int i16 = i6 + 4;
            int iSum15 = i9 + Sum1(i15) + m3912Ch(i15, i13, i11) + iArr3[i16] + this.f7398X[i16];
            i5 = iSum05 + iSum15;
            iSum04 = iSum15 + Sum0(iSum08) + Maj(iSum08, iSum07, iSum06);
            int i17 = i6 + 5;
            int iSum16 = i11 + Sum1(i5) + m3912Ch(i5, i15, i13) + iArr3[i17] + this.f7398X[i17];
            i4 = iSum06 + iSum16;
            iSum03 = iSum16 + Sum0(iSum04) + Maj(iSum04, iSum08, iSum07);
            int i18 = i6 + 6;
            int iSum17 = i13 + Sum1(i4) + m3912Ch(i4, i5, i15) + iArr3[i18] + this.f7398X[i18];
            i3 = iSum07 + iSum17;
            iSum02 = iSum17 + Sum0(iSum03) + Maj(iSum03, iSum04, iSum08);
            int i19 = i6 + 7;
            int iSum18 = i15 + Sum1(i3) + m3912Ch(i3, i4, i5) + iArr3[i19] + this.f7398X[i19];
            i2 = iSum08 + iSum18;
            iSum0 = iSum18 + Sum0(iSum02) + Maj(iSum02, iSum03, iSum04);
            i6 += 8;
        }
        this.f7390H1 += iSum0;
        this.f7391H2 += iSum02;
        this.f7392H3 += iSum03;
        this.f7393H4 += iSum04;
        this.f7394H5 += i2;
        this.f7395H6 += i3;
        this.f7396H7 += i4;
        this.f7397H8 += i5;
        this.xOff = 0;
        for (int i20 = 0; i20 < 16; i20++) {
            this.f7398X[i20] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.f7398X;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processWord(byte[] bArr, int i) {
        int i2 = (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        int[] iArr = this.f7398X;
        int i3 = this.xOff;
        iArr[i3] = i2;
        int i4 = i3 + 1;
        this.xOff = i4;
        if (i4 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f7390H1 = 1779033703;
        this.f7391H2 = -1150833019;
        this.f7392H3 = 1013904242;
        this.f7393H4 = -1521486534;
        this.f7394H5 = 1359893119;
        this.f7395H6 = -1694144372;
        this.f7396H7 = 528734635;
        this.f7397H8 = 1541459225;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f7398X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((SHA256Digest) memoable);
    }
}
