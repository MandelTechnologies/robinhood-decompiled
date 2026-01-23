package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes25.dex */
public class SRP6GroupParameters {

    /* renamed from: N */
    private BigInteger f7710N;

    /* renamed from: g */
    private BigInteger f7711g;

    public SRP6GroupParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f7710N = bigInteger;
        this.f7711g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f7711g;
    }

    public BigInteger getN() {
        return this.f7710N;
    }
}
