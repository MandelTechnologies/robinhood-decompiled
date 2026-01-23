package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: classes25.dex */
public class ElGamalPrivateKeySpec extends ElGamalKeySpec {

    /* renamed from: x */
    private BigInteger f7794x;

    public ElGamalPrivateKeySpec(BigInteger bigInteger, ElGamalParameterSpec elGamalParameterSpec) {
        super(elGamalParameterSpec);
        this.f7794x = bigInteger;
    }

    public BigInteger getX() {
        return this.f7794x;
    }
}
