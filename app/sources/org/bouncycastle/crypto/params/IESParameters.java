package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.util.Arrays;

/* loaded from: classes25.dex */
public class IESParameters implements CipherParameters {
    private byte[] derivation;

    /* renamed from: encoding, reason: collision with root package name */
    private byte[] f10835encoding;
    private int macKeySize;

    public IESParameters(byte[] bArr, byte[] bArr2, int i) {
        this.derivation = Arrays.clone(bArr);
        this.f10835encoding = Arrays.clone(bArr2);
        this.macKeySize = i;
    }

    public byte[] getDerivationV() {
        return Arrays.clone(this.derivation);
    }

    public byte[] getEncodingV() {
        return Arrays.clone(this.f10835encoding);
    }

    public int getMacKeySize() {
        return this.macKeySize;
    }
}
