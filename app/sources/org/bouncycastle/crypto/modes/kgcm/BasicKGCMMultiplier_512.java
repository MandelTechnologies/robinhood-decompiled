package org.bouncycastle.crypto.modes.kgcm;

/* loaded from: classes25.dex */
public class BasicKGCMMultiplier_512 implements KGCMMultiplier {

    /* renamed from: H */
    private final long[] f7643H = new long[8];

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void init(long[] jArr) {
        KGCMUtil_512.copy(jArr, this.f7643H);
    }

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void multiplyH(long[] jArr) {
        KGCMUtil_512.multiply(jArr, this.f7643H, jArr);
    }
}
