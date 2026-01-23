package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes25.dex */
public class SHA512Digest extends LongDigest {
    private static final int DIGEST_LENGTH = 64;

    public SHA512Digest() {
    }

    public SHA512Digest(SHA512Digest sHA512Digest) {
        super(sHA512Digest);
    }

    public SHA512Digest(byte[] bArr) {
        restoreState(bArr);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA512Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.longToBigEndian(this.f7314H1, bArr, i);
        Pack.longToBigEndian(this.f7315H2, bArr, i + 8);
        Pack.longToBigEndian(this.f7316H3, bArr, i + 16);
        Pack.longToBigEndian(this.f7317H4, bArr, i + 24);
        Pack.longToBigEndian(this.f7318H5, bArr, i + 32);
        Pack.longToBigEndian(this.f7319H6, bArr, i + 40);
        Pack.longToBigEndian(this.f7320H7, bArr, i + 48);
        Pack.longToBigEndian(this.f7321H8, bArr, i + 56);
        reset();
        return 64;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA-512";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 64;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        byte[] bArr = new byte[getEncodedStateSize()];
        super.populateState(bArr);
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.LongDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f7314H1 = 7640891576956012808L;
        this.f7315H2 = -4942790177534073029L;
        this.f7316H3 = 4354685564936845355L;
        this.f7317H4 = -6534734903238641935L;
        this.f7318H5 = 5840696475078001361L;
        this.f7319H6 = -7276294671716946913L;
        this.f7320H7 = 2270897969802886507L;
        this.f7321H8 = 6620516959819538809L;
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((SHA512Digest) memoable);
    }
}
