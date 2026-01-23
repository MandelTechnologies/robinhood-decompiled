package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes25.dex */
public class ElGamalParameterSpec implements AlgorithmParameterSpec {

    /* renamed from: g */
    private BigInteger f7792g;

    /* renamed from: p */
    private BigInteger f7793p;

    public ElGamalParameterSpec(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f7793p = bigInteger;
        this.f7792g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f7792g;
    }

    public BigInteger getP() {
        return this.f7793p;
    }
}
