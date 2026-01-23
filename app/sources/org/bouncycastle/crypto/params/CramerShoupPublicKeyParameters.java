package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes25.dex */
public class CramerShoupPublicKeyParameters extends CramerShoupKeyParameters {

    /* renamed from: c */
    private BigInteger f7657c;

    /* renamed from: d */
    private BigInteger f7658d;

    /* renamed from: h */
    private BigInteger f7659h;

    public CramerShoupPublicKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        super(false, cramerShoupParameters);
        this.f7657c = bigInteger;
        this.f7658d = bigInteger2;
        this.f7659h = bigInteger3;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPublicKeyParameters)) {
            return false;
        }
        CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = (CramerShoupPublicKeyParameters) obj;
        return cramerShoupPublicKeyParameters.getC().equals(this.f7657c) && cramerShoupPublicKeyParameters.getD().equals(this.f7658d) && cramerShoupPublicKeyParameters.getH().equals(this.f7659h) && super.equals(obj);
    }

    public BigInteger getC() {
        return this.f7657c;
    }

    public BigInteger getD() {
        return this.f7658d;
    }

    public BigInteger getH() {
        return this.f7659h;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((this.f7657c.hashCode() ^ this.f7658d.hashCode()) ^ this.f7659h.hashCode()) ^ super.hashCode();
    }
}
