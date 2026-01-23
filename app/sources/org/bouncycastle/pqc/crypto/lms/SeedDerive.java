package org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.crypto.Digest;

/* loaded from: classes25.dex */
class SeedDerive {

    /* renamed from: I */
    private final byte[] f7995I;
    private final Digest digest;

    /* renamed from: j */
    private int f7996j;
    private final byte[] masterSeed;

    /* renamed from: q */
    private int f7997q;

    public SeedDerive(byte[] bArr, byte[] bArr2, Digest digest) {
        this.f7995I = bArr;
        this.masterSeed = bArr2;
        this.digest = digest;
    }

    public void deriveSeed(byte[] bArr, boolean z) {
        deriveSeed(bArr, z, 0);
    }

    public void deriveSeed(byte[] bArr, boolean z, int i) {
        deriveSeed(bArr, i);
        if (z) {
            this.f7996j++;
        }
    }

    public byte[] deriveSeed(byte[] bArr, int i) {
        if (bArr.length < this.digest.getDigestSize()) {
            throw new IllegalArgumentException("target length is less than digest size.");
        }
        Digest digest = this.digest;
        byte[] bArr2 = this.f7995I;
        digest.update(bArr2, 0, bArr2.length);
        this.digest.update((byte) (this.f7997q >>> 24));
        this.digest.update((byte) (this.f7997q >>> 16));
        this.digest.update((byte) (this.f7997q >>> 8));
        this.digest.update((byte) this.f7997q);
        this.digest.update((byte) (this.f7996j >>> 8));
        this.digest.update((byte) this.f7996j);
        this.digest.update((byte) -1);
        Digest digest2 = this.digest;
        byte[] bArr3 = this.masterSeed;
        digest2.update(bArr3, 0, bArr3.length);
        this.digest.doFinal(bArr, i);
        return bArr;
    }

    public byte[] getI() {
        return this.f7995I;
    }

    public int getJ() {
        return this.f7996j;
    }

    public byte[] getMasterSeed() {
        return this.masterSeed;
    }

    public int getQ() {
        return this.f7997q;
    }

    public void setJ(int i) {
        this.f7996j = i;
    }

    public void setQ(int i) {
        this.f7997q = i;
    }
}
