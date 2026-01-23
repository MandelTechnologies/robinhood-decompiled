package org.bouncycastle.crypto.modes.kgcm;

/* loaded from: classes25.dex */
public class BasicKGCMMultiplier_256 implements KGCMMultiplier {

    /* renamed from: H */
    private final long[] f7642H = new long[4];

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void init(long[] jArr) {
        KGCMUtil_256.copy(jArr, this.f7642H);
    }

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void multiplyH(long[] jArr) {
        KGCMUtil_256.multiply(jArr, this.f7642H, jArr);
    }
}
