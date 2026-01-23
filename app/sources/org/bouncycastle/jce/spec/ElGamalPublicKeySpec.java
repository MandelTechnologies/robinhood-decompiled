package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: classes25.dex */
public class ElGamalPublicKeySpec extends ElGamalKeySpec {

    /* renamed from: y */
    private BigInteger f7795y;

    public ElGamalPublicKeySpec(BigInteger bigInteger, ElGamalParameterSpec elGamalParameterSpec) {
        super(elGamalParameterSpec);
        this.f7795y = bigInteger;
    }

    public BigInteger getY() {
        return this.f7795y;
    }
}
