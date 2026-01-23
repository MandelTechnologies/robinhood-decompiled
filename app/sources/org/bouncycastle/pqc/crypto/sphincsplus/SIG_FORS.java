package org.bouncycastle.pqc.crypto.sphincsplus;

/* loaded from: classes25.dex */
class SIG_FORS {
    final byte[][] authPath;

    /* renamed from: sk */
    final byte[] f8057sk;

    SIG_FORS(byte[] bArr, byte[][] bArr2) {
        this.authPath = bArr2;
        this.f8057sk = bArr;
    }

    public byte[][] getAuthPath() {
        return this.authPath;
    }

    byte[] getSK() {
        return this.f8057sk;
    }
}
