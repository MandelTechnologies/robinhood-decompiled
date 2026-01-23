package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes25.dex */
public class RSAPrivateCrtKeyParameters extends RSAKeyParameters {

    /* renamed from: dP */
    private BigInteger f7705dP;

    /* renamed from: dQ */
    private BigInteger f7706dQ;

    /* renamed from: e */
    private BigInteger f7707e;

    /* renamed from: p */
    private BigInteger f7708p;

    /* renamed from: q */
    private BigInteger f7709q;
    private BigInteger qInv;

    public RSAPrivateCrtKeyParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        super(true, bigInteger, bigInteger3);
        this.f7707e = bigInteger2;
        this.f7708p = bigInteger4;
        this.f7709q = bigInteger5;
        this.f7705dP = bigInteger6;
        this.f7706dQ = bigInteger7;
        this.qInv = bigInteger8;
    }

    public BigInteger getDP() {
        return this.f7705dP;
    }

    public BigInteger getDQ() {
        return this.f7706dQ;
    }

    public BigInteger getP() {
        return this.f7708p;
    }

    public BigInteger getPublicExponent() {
        return this.f7707e;
    }

    public BigInteger getQ() {
        return this.f7709q;
    }

    public BigInteger getQInv() {
        return this.qInv;
    }
}
