package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.Memoable;

/* loaded from: classes25.dex */
public class RIPEMD128Digest extends GeneralDigest {
    private static final int DIGEST_LENGTH = 16;

    /* renamed from: H0 */
    private int f7338H0;

    /* renamed from: H1 */
    private int f7339H1;

    /* renamed from: H2 */
    private int f7340H2;

    /* renamed from: H3 */
    private int f7341H3;

    /* renamed from: X */
    private int[] f7342X;
    private int xOff;

    public RIPEMD128Digest() {
        this.f7342X = new int[16];
        reset();
    }

    public RIPEMD128Digest(RIPEMD128Digest rIPEMD128Digest) {
        super(rIPEMD128Digest);
        this.f7342X = new int[16];
        copyIn(rIPEMD128Digest);
    }

    /* renamed from: F1 */
    private int m3878F1(int i, int i2, int i3, int i4, int i5, int i6) {
        return m3882RL(i + m3883f1(i2, i3, i4) + i5, i6);
    }

    /* renamed from: F2 */
    private int m3879F2(int i, int i2, int i3, int i4, int i5, int i6) {
        return m3882RL(i + m3884f2(i2, i3, i4) + i5 + 1518500249, i6);
    }

    /* renamed from: F3 */
    private int m3880F3(int i, int i2, int i3, int i4, int i5, int i6) {
        return m3882RL(i + m3885f3(i2, i3, i4) + i5 + 1859775393, i6);
    }

    /* renamed from: F4 */
    private int m3881F4(int i, int i2, int i3, int i4, int i5, int i6) {
        return m3882RL(((i + m3886f4(i2, i3, i4)) + i5) - 1894007588, i6);
    }

    private int FF1(int i, int i2, int i3, int i4, int i5, int i6) {
        return m3882RL(i + m3883f1(i2, i3, i4) + i5, i6);
    }

    private int FF2(int i, int i2, int i3, int i4, int i5, int i6) {
        return m3882RL(i + m3884f2(i2, i3, i4) + i5 + 1836072691, i6);
    }

    private int FF3(int i, int i2, int i3, int i4, int i5, int i6) {
        return m3882RL(i + m3885f3(i2, i3, i4) + i5 + 1548603684, i6);
    }

    private int FF4(int i, int i2, int i3, int i4, int i5, int i6) {
        return m3882RL(i + m3886f4(i2, i3, i4) + i5 + 1352829926, i6);
    }

    /* renamed from: RL */
    private int m3882RL(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    private void copyIn(RIPEMD128Digest rIPEMD128Digest) {
        super.copyIn((GeneralDigest) rIPEMD128Digest);
        this.f7338H0 = rIPEMD128Digest.f7338H0;
        this.f7339H1 = rIPEMD128Digest.f7339H1;
        this.f7340H2 = rIPEMD128Digest.f7340H2;
        this.f7341H3 = rIPEMD128Digest.f7341H3;
        int[] iArr = rIPEMD128Digest.f7342X;
        System.arraycopy(iArr, 0, this.f7342X, 0, iArr.length);
        this.xOff = rIPEMD128Digest.xOff;
    }

    /* renamed from: f1 */
    private int m3883f1(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    /* renamed from: f2 */
    private int m3884f2(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    /* renamed from: f3 */
    private int m3885f3(int i, int i2, int i3) {
        return (i | (~i2)) ^ i3;
    }

    /* renamed from: f4 */
    private int m3886f4(int i, int i2, int i3) {
        return (i & i3) | (i2 & (~i3));
    }

    private void unpackWord(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new RIPEMD128Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        unpackWord(this.f7338H0, bArr, i);
        unpackWord(this.f7339H1, bArr, i + 4);
        unpackWord(this.f7340H2, bArr, i + 8);
        unpackWord(this.f7341H3, bArr, i + 12);
        reset();
        return 16;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "RIPEMD128";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processBlock() {
        int i = this.f7338H0;
        int i2 = this.f7339H1;
        int i3 = this.f7340H2;
        int i4 = this.f7341H3;
        int iM3878F1 = m3878F1(i, i2, i3, i4, this.f7342X[0], 11);
        int iM3878F12 = m3878F1(i4, iM3878F1, i2, i3, this.f7342X[1], 14);
        int iM3878F13 = m3878F1(i3, iM3878F12, iM3878F1, i2, this.f7342X[2], 15);
        int iM3878F14 = m3878F1(i2, iM3878F13, iM3878F12, iM3878F1, this.f7342X[3], 12);
        int iM3878F15 = m3878F1(iM3878F1, iM3878F14, iM3878F13, iM3878F12, this.f7342X[4], 5);
        int iM3878F16 = m3878F1(iM3878F12, iM3878F15, iM3878F14, iM3878F13, this.f7342X[5], 8);
        int iM3878F17 = m3878F1(iM3878F13, iM3878F16, iM3878F15, iM3878F14, this.f7342X[6], 7);
        int iM3878F18 = m3878F1(iM3878F14, iM3878F17, iM3878F16, iM3878F15, this.f7342X[7], 9);
        int iM3878F19 = m3878F1(iM3878F15, iM3878F18, iM3878F17, iM3878F16, this.f7342X[8], 11);
        int iM3878F110 = m3878F1(iM3878F16, iM3878F19, iM3878F18, iM3878F17, this.f7342X[9], 13);
        int iM3878F111 = m3878F1(iM3878F17, iM3878F110, iM3878F19, iM3878F18, this.f7342X[10], 14);
        int iM3878F112 = m3878F1(iM3878F18, iM3878F111, iM3878F110, iM3878F19, this.f7342X[11], 15);
        int iM3878F113 = m3878F1(iM3878F19, iM3878F112, iM3878F111, iM3878F110, this.f7342X[12], 6);
        int iM3878F114 = m3878F1(iM3878F110, iM3878F113, iM3878F112, iM3878F111, this.f7342X[13], 7);
        int iM3878F115 = m3878F1(iM3878F111, iM3878F114, iM3878F113, iM3878F112, this.f7342X[14], 9);
        int iM3878F116 = m3878F1(iM3878F112, iM3878F115, iM3878F114, iM3878F113, this.f7342X[15], 8);
        int iM3879F2 = m3879F2(iM3878F113, iM3878F116, iM3878F115, iM3878F114, this.f7342X[7], 7);
        int iM3879F22 = m3879F2(iM3878F114, iM3879F2, iM3878F116, iM3878F115, this.f7342X[4], 6);
        int iM3879F23 = m3879F2(iM3878F115, iM3879F22, iM3879F2, iM3878F116, this.f7342X[13], 8);
        int iM3879F24 = m3879F2(iM3878F116, iM3879F23, iM3879F22, iM3879F2, this.f7342X[1], 13);
        int iM3879F25 = m3879F2(iM3879F2, iM3879F24, iM3879F23, iM3879F22, this.f7342X[10], 11);
        int iM3879F26 = m3879F2(iM3879F22, iM3879F25, iM3879F24, iM3879F23, this.f7342X[6], 9);
        int iM3879F27 = m3879F2(iM3879F23, iM3879F26, iM3879F25, iM3879F24, this.f7342X[15], 7);
        int iM3879F28 = m3879F2(iM3879F24, iM3879F27, iM3879F26, iM3879F25, this.f7342X[3], 15);
        int iM3879F29 = m3879F2(iM3879F25, iM3879F28, iM3879F27, iM3879F26, this.f7342X[12], 7);
        int iM3879F210 = m3879F2(iM3879F26, iM3879F29, iM3879F28, iM3879F27, this.f7342X[0], 12);
        int iM3879F211 = m3879F2(iM3879F27, iM3879F210, iM3879F29, iM3879F28, this.f7342X[9], 15);
        int iM3879F212 = m3879F2(iM3879F28, iM3879F211, iM3879F210, iM3879F29, this.f7342X[5], 9);
        int iM3879F213 = m3879F2(iM3879F29, iM3879F212, iM3879F211, iM3879F210, this.f7342X[2], 11);
        int iM3879F214 = m3879F2(iM3879F210, iM3879F213, iM3879F212, iM3879F211, this.f7342X[14], 7);
        int iM3879F215 = m3879F2(iM3879F211, iM3879F214, iM3879F213, iM3879F212, this.f7342X[11], 13);
        int iM3879F216 = m3879F2(iM3879F212, iM3879F215, iM3879F214, iM3879F213, this.f7342X[8], 12);
        int iM3880F3 = m3880F3(iM3879F213, iM3879F216, iM3879F215, iM3879F214, this.f7342X[3], 11);
        int iM3880F32 = m3880F3(iM3879F214, iM3880F3, iM3879F216, iM3879F215, this.f7342X[10], 13);
        int iM3880F33 = m3880F3(iM3879F215, iM3880F32, iM3880F3, iM3879F216, this.f7342X[14], 6);
        int iM3880F34 = m3880F3(iM3879F216, iM3880F33, iM3880F32, iM3880F3, this.f7342X[4], 7);
        int iM3880F35 = m3880F3(iM3880F3, iM3880F34, iM3880F33, iM3880F32, this.f7342X[9], 14);
        int iM3880F36 = m3880F3(iM3880F32, iM3880F35, iM3880F34, iM3880F33, this.f7342X[15], 9);
        int iM3880F37 = m3880F3(iM3880F33, iM3880F36, iM3880F35, iM3880F34, this.f7342X[8], 13);
        int iM3880F38 = m3880F3(iM3880F34, iM3880F37, iM3880F36, iM3880F35, this.f7342X[1], 15);
        int iM3880F39 = m3880F3(iM3880F35, iM3880F38, iM3880F37, iM3880F36, this.f7342X[2], 14);
        int iM3880F310 = m3880F3(iM3880F36, iM3880F39, iM3880F38, iM3880F37, this.f7342X[7], 8);
        int iM3880F311 = m3880F3(iM3880F37, iM3880F310, iM3880F39, iM3880F38, this.f7342X[0], 13);
        int iM3880F312 = m3880F3(iM3880F38, iM3880F311, iM3880F310, iM3880F39, this.f7342X[6], 6);
        int iM3880F313 = m3880F3(iM3880F39, iM3880F312, iM3880F311, iM3880F310, this.f7342X[13], 5);
        int iM3880F314 = m3880F3(iM3880F310, iM3880F313, iM3880F312, iM3880F311, this.f7342X[11], 12);
        int iM3880F315 = m3880F3(iM3880F311, iM3880F314, iM3880F313, iM3880F312, this.f7342X[5], 7);
        int iM3880F316 = m3880F3(iM3880F312, iM3880F315, iM3880F314, iM3880F313, this.f7342X[12], 5);
        int iM3881F4 = m3881F4(iM3880F313, iM3880F316, iM3880F315, iM3880F314, this.f7342X[1], 11);
        int iM3881F42 = m3881F4(iM3880F314, iM3881F4, iM3880F316, iM3880F315, this.f7342X[9], 12);
        int iM3881F43 = m3881F4(iM3880F315, iM3881F42, iM3881F4, iM3880F316, this.f7342X[11], 14);
        int iM3881F44 = m3881F4(iM3880F316, iM3881F43, iM3881F42, iM3881F4, this.f7342X[10], 15);
        int iM3881F45 = m3881F4(iM3881F4, iM3881F44, iM3881F43, iM3881F42, this.f7342X[0], 14);
        int iM3881F46 = m3881F4(iM3881F42, iM3881F45, iM3881F44, iM3881F43, this.f7342X[8], 15);
        int iM3881F47 = m3881F4(iM3881F43, iM3881F46, iM3881F45, iM3881F44, this.f7342X[12], 9);
        int iM3881F48 = m3881F4(iM3881F44, iM3881F47, iM3881F46, iM3881F45, this.f7342X[4], 8);
        int iM3881F49 = m3881F4(iM3881F45, iM3881F48, iM3881F47, iM3881F46, this.f7342X[13], 9);
        int iM3881F410 = m3881F4(iM3881F46, iM3881F49, iM3881F48, iM3881F47, this.f7342X[3], 14);
        int iM3881F411 = m3881F4(iM3881F47, iM3881F410, iM3881F49, iM3881F48, this.f7342X[7], 5);
        int iM3881F412 = m3881F4(iM3881F48, iM3881F411, iM3881F410, iM3881F49, this.f7342X[15], 6);
        int iM3881F413 = m3881F4(iM3881F49, iM3881F412, iM3881F411, iM3881F410, this.f7342X[14], 8);
        int iM3881F414 = m3881F4(iM3881F410, iM3881F413, iM3881F412, iM3881F411, this.f7342X[5], 6);
        int iM3881F415 = m3881F4(iM3881F411, iM3881F414, iM3881F413, iM3881F412, this.f7342X[6], 5);
        int iM3881F416 = m3881F4(iM3881F412, iM3881F415, iM3881F414, iM3881F413, this.f7342X[2], 12);
        int iFF4 = FF4(i, i2, i3, i4, this.f7342X[5], 8);
        int iFF42 = FF4(i4, iFF4, i2, i3, this.f7342X[14], 9);
        int iFF43 = FF4(i3, iFF42, iFF4, i2, this.f7342X[7], 9);
        int iFF44 = FF4(i2, iFF43, iFF42, iFF4, this.f7342X[0], 11);
        int iFF45 = FF4(iFF4, iFF44, iFF43, iFF42, this.f7342X[9], 13);
        int iFF46 = FF4(iFF42, iFF45, iFF44, iFF43, this.f7342X[2], 15);
        int iFF47 = FF4(iFF43, iFF46, iFF45, iFF44, this.f7342X[11], 15);
        int iFF48 = FF4(iFF44, iFF47, iFF46, iFF45, this.f7342X[4], 5);
        int iFF49 = FF4(iFF45, iFF48, iFF47, iFF46, this.f7342X[13], 7);
        int iFF410 = FF4(iFF46, iFF49, iFF48, iFF47, this.f7342X[6], 7);
        int iFF411 = FF4(iFF47, iFF410, iFF49, iFF48, this.f7342X[15], 8);
        int iFF412 = FF4(iFF48, iFF411, iFF410, iFF49, this.f7342X[8], 11);
        int iFF413 = FF4(iFF49, iFF412, iFF411, iFF410, this.f7342X[1], 14);
        int iFF414 = FF4(iFF410, iFF413, iFF412, iFF411, this.f7342X[10], 14);
        int iFF415 = FF4(iFF411, iFF414, iFF413, iFF412, this.f7342X[3], 12);
        int iFF416 = FF4(iFF412, iFF415, iFF414, iFF413, this.f7342X[12], 6);
        int iFF3 = FF3(iFF413, iFF416, iFF415, iFF414, this.f7342X[6], 9);
        int iFF32 = FF3(iFF414, iFF3, iFF416, iFF415, this.f7342X[11], 13);
        int iFF33 = FF3(iFF415, iFF32, iFF3, iFF416, this.f7342X[3], 15);
        int iFF34 = FF3(iFF416, iFF33, iFF32, iFF3, this.f7342X[7], 7);
        int iFF35 = FF3(iFF3, iFF34, iFF33, iFF32, this.f7342X[0], 12);
        int iFF36 = FF3(iFF32, iFF35, iFF34, iFF33, this.f7342X[13], 8);
        int iFF37 = FF3(iFF33, iFF36, iFF35, iFF34, this.f7342X[5], 9);
        int iFF38 = FF3(iFF34, iFF37, iFF36, iFF35, this.f7342X[10], 11);
        int iFF39 = FF3(iFF35, iFF38, iFF37, iFF36, this.f7342X[14], 7);
        int iFF310 = FF3(iFF36, iFF39, iFF38, iFF37, this.f7342X[15], 7);
        int iFF311 = FF3(iFF37, iFF310, iFF39, iFF38, this.f7342X[8], 12);
        int iFF312 = FF3(iFF38, iFF311, iFF310, iFF39, this.f7342X[12], 7);
        int iFF313 = FF3(iFF39, iFF312, iFF311, iFF310, this.f7342X[4], 6);
        int iFF314 = FF3(iFF310, iFF313, iFF312, iFF311, this.f7342X[9], 15);
        int iFF315 = FF3(iFF311, iFF314, iFF313, iFF312, this.f7342X[1], 13);
        int iFF316 = FF3(iFF312, iFF315, iFF314, iFF313, this.f7342X[2], 11);
        int iFF2 = FF2(iFF313, iFF316, iFF315, iFF314, this.f7342X[15], 9);
        int iFF22 = FF2(iFF314, iFF2, iFF316, iFF315, this.f7342X[5], 7);
        int iFF23 = FF2(iFF315, iFF22, iFF2, iFF316, this.f7342X[1], 15);
        int iFF24 = FF2(iFF316, iFF23, iFF22, iFF2, this.f7342X[3], 11);
        int iFF25 = FF2(iFF2, iFF24, iFF23, iFF22, this.f7342X[7], 8);
        int iFF26 = FF2(iFF22, iFF25, iFF24, iFF23, this.f7342X[14], 6);
        int iFF27 = FF2(iFF23, iFF26, iFF25, iFF24, this.f7342X[6], 6);
        int iFF28 = FF2(iFF24, iFF27, iFF26, iFF25, this.f7342X[9], 14);
        int iFF29 = FF2(iFF25, iFF28, iFF27, iFF26, this.f7342X[11], 12);
        int iFF210 = FF2(iFF26, iFF29, iFF28, iFF27, this.f7342X[8], 13);
        int iFF211 = FF2(iFF27, iFF210, iFF29, iFF28, this.f7342X[12], 5);
        int iFF212 = FF2(iFF28, iFF211, iFF210, iFF29, this.f7342X[2], 14);
        int iFF213 = FF2(iFF29, iFF212, iFF211, iFF210, this.f7342X[10], 13);
        int iFF214 = FF2(iFF210, iFF213, iFF212, iFF211, this.f7342X[0], 13);
        int iFF215 = FF2(iFF211, iFF214, iFF213, iFF212, this.f7342X[4], 7);
        int iFF216 = FF2(iFF212, iFF215, iFF214, iFF213, this.f7342X[13], 5);
        int iFF1 = FF1(iFF213, iFF216, iFF215, iFF214, this.f7342X[8], 15);
        int iFF12 = FF1(iFF214, iFF1, iFF216, iFF215, this.f7342X[6], 5);
        int iFF13 = FF1(iFF215, iFF12, iFF1, iFF216, this.f7342X[4], 8);
        int iFF14 = FF1(iFF216, iFF13, iFF12, iFF1, this.f7342X[1], 11);
        int iFF15 = FF1(iFF1, iFF14, iFF13, iFF12, this.f7342X[3], 14);
        int iFF16 = FF1(iFF12, iFF15, iFF14, iFF13, this.f7342X[11], 14);
        int iFF17 = FF1(iFF13, iFF16, iFF15, iFF14, this.f7342X[15], 6);
        int iFF18 = FF1(iFF14, iFF17, iFF16, iFF15, this.f7342X[0], 14);
        int iFF19 = FF1(iFF15, iFF18, iFF17, iFF16, this.f7342X[5], 6);
        int iFF110 = FF1(iFF16, iFF19, iFF18, iFF17, this.f7342X[12], 9);
        int iFF111 = FF1(iFF17, iFF110, iFF19, iFF18, this.f7342X[2], 12);
        int iFF112 = FF1(iFF18, iFF111, iFF110, iFF19, this.f7342X[13], 9);
        int iFF113 = FF1(iFF19, iFF112, iFF111, iFF110, this.f7342X[9], 12);
        int iFF114 = FF1(iFF110, iFF113, iFF112, iFF111, this.f7342X[7], 5);
        int iFF115 = FF1(iFF111, iFF114, iFF113, iFF112, this.f7342X[10], 15);
        int iFF116 = FF1(iFF112, iFF115, iFF114, iFF113, this.f7342X[14], 8);
        int i5 = iFF114 + iM3881F415 + this.f7339H1;
        this.f7339H1 = this.f7340H2 + iM3881F414 + iFF113;
        this.f7340H2 = this.f7341H3 + iM3881F413 + iFF116;
        this.f7341H3 = this.f7338H0 + iM3881F416 + iFF115;
        this.f7338H0 = i5;
        this.xOff = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.f7342X;
            if (i6 == iArr.length) {
                return;
            }
            iArr[i6] = 0;
            i6++;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.f7342X;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processWord(byte[] bArr, int i) {
        int[] iArr = this.f7342X;
        int i2 = this.xOff;
        int i3 = i2 + 1;
        this.xOff = i3;
        iArr[i2] = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i3 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f7338H0 = 1732584193;
        this.f7339H1 = -271733879;
        this.f7340H2 = -1732584194;
        this.f7341H3 = 271733878;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f7342X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((RIPEMD128Digest) memoable);
    }
}
