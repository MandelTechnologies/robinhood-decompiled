package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;

/* loaded from: classes25.dex */
public class KDFParameters implements DerivationParameters {

    /* renamed from: iv */
    byte[] f7700iv;
    byte[] shared;

    public KDFParameters(byte[] bArr, byte[] bArr2) {
        this.shared = bArr;
        this.f7700iv = bArr2;
    }

    public byte[] getIV() {
        return this.f7700iv;
    }

    public byte[] getSharedSecret() {
        return this.shared;
    }
}
