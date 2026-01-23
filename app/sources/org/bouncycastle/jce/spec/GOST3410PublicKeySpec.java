package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* loaded from: classes25.dex */
public class GOST3410PublicKeySpec implements KeySpec {

    /* renamed from: a */
    private BigInteger f7803a;

    /* renamed from: p */
    private BigInteger f7804p;

    /* renamed from: q */
    private BigInteger f7805q;

    /* renamed from: y */
    private BigInteger f7806y;

    public GOST3410PublicKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f7806y = bigInteger;
        this.f7804p = bigInteger2;
        this.f7805q = bigInteger3;
        this.f7803a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f7803a;
    }

    public BigInteger getP() {
        return this.f7804p;
    }

    public BigInteger getQ() {
        return this.f7805q;
    }

    public BigInteger getY() {
        return this.f7806y;
    }
}
