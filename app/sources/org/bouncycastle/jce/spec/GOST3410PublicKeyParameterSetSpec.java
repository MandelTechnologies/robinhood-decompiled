package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: classes25.dex */
public class GOST3410PublicKeyParameterSetSpec {

    /* renamed from: a */
    private BigInteger f7800a;

    /* renamed from: p */
    private BigInteger f7801p;

    /* renamed from: q */
    private BigInteger f7802q;

    public GOST3410PublicKeyParameterSetSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f7801p = bigInteger;
        this.f7802q = bigInteger2;
        this.f7800a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GOST3410PublicKeyParameterSetSpec) {
            GOST3410PublicKeyParameterSetSpec gOST3410PublicKeyParameterSetSpec = (GOST3410PublicKeyParameterSetSpec) obj;
            if (this.f7800a.equals(gOST3410PublicKeyParameterSetSpec.f7800a) && this.f7801p.equals(gOST3410PublicKeyParameterSetSpec.f7801p) && this.f7802q.equals(gOST3410PublicKeyParameterSetSpec.f7802q)) {
                return true;
            }
        }
        return false;
    }

    public BigInteger getA() {
        return this.f7800a;
    }

    public BigInteger getP() {
        return this.f7801p;
    }

    public BigInteger getQ() {
        return this.f7802q;
    }

    public int hashCode() {
        return (this.f7800a.hashCode() ^ this.f7801p.hashCode()) ^ this.f7802q.hashCode();
    }
}
