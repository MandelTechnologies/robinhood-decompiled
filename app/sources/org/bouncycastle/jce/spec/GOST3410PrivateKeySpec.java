package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* loaded from: classes25.dex */
public class GOST3410PrivateKeySpec implements KeySpec {

    /* renamed from: a */
    private BigInteger f7796a;

    /* renamed from: p */
    private BigInteger f7797p;

    /* renamed from: q */
    private BigInteger f7798q;

    /* renamed from: x */
    private BigInteger f7799x;

    public GOST3410PrivateKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f7799x = bigInteger;
        this.f7797p = bigInteger2;
        this.f7798q = bigInteger3;
        this.f7796a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f7796a;
    }

    public BigInteger getP() {
        return this.f7797p;
    }

    public BigInteger getQ() {
        return this.f7798q;
    }

    public BigInteger getX() {
        return this.f7799x;
    }
}
