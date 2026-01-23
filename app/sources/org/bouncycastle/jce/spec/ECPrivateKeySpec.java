package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: classes25.dex */
public class ECPrivateKeySpec extends ECKeySpec {

    /* renamed from: d */
    private BigInteger f7790d;

    public ECPrivateKeySpec(BigInteger bigInteger, ECParameterSpec eCParameterSpec) {
        super(eCParameterSpec);
        this.f7790d = bigInteger;
    }

    public BigInteger getD() {
        return this.f7790d;
    }
}
