package org.bouncycastle.crypto.modes.gcm;

/* loaded from: classes25.dex */
public interface GCMMultiplier {
    void init(byte[] bArr);

    void multiplyH(byte[] bArr);
}
