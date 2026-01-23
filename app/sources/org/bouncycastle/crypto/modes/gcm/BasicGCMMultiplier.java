package org.bouncycastle.crypto.modes.gcm;

/* loaded from: classes25.dex */
public class BasicGCMMultiplier implements GCMMultiplier {

    /* renamed from: H */
    private long[] f7633H;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        this.f7633H = GCMUtil.asLongs(bArr);
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void multiplyH(byte[] bArr) {
        long[] jArrAsLongs = GCMUtil.asLongs(bArr);
        GCMUtil.multiply(jArrAsLongs, this.f7633H);
        GCMUtil.asBytes(jArrAsLongs, bArr);
    }
}
