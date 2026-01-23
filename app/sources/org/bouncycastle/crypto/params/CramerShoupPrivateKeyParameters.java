package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes25.dex */
public class CramerShoupPrivateKeyParameters extends CramerShoupKeyParameters {

    /* renamed from: pk */
    private CramerShoupPublicKeyParameters f7651pk;

    /* renamed from: x1 */
    private BigInteger f7652x1;

    /* renamed from: x2 */
    private BigInteger f7653x2;

    /* renamed from: y1 */
    private BigInteger f7654y1;

    /* renamed from: y2 */
    private BigInteger f7655y2;

    /* renamed from: z */
    private BigInteger f7656z;

    public CramerShoupPrivateKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        super(true, cramerShoupParameters);
        this.f7652x1 = bigInteger;
        this.f7653x2 = bigInteger2;
        this.f7654y1 = bigInteger3;
        this.f7655y2 = bigInteger4;
        this.f7656z = bigInteger5;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPrivateKeyParameters)) {
            return false;
        }
        CramerShoupPrivateKeyParameters cramerShoupPrivateKeyParameters = (CramerShoupPrivateKeyParameters) obj;
        return cramerShoupPrivateKeyParameters.getX1().equals(this.f7652x1) && cramerShoupPrivateKeyParameters.getX2().equals(this.f7653x2) && cramerShoupPrivateKeyParameters.getY1().equals(this.f7654y1) && cramerShoupPrivateKeyParameters.getY2().equals(this.f7655y2) && cramerShoupPrivateKeyParameters.getZ().equals(this.f7656z) && super.equals(obj);
    }

    public CramerShoupPublicKeyParameters getPk() {
        return this.f7651pk;
    }

    public BigInteger getX1() {
        return this.f7652x1;
    }

    public BigInteger getX2() {
        return this.f7653x2;
    }

    public BigInteger getY1() {
        return this.f7654y1;
    }

    public BigInteger getY2() {
        return this.f7655y2;
    }

    public BigInteger getZ() {
        return this.f7656z;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((((this.f7652x1.hashCode() ^ this.f7653x2.hashCode()) ^ this.f7654y1.hashCode()) ^ this.f7655y2.hashCode()) ^ this.f7656z.hashCode()) ^ super.hashCode();
    }

    public void setPk(CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters) {
        this.f7651pk = cramerShoupPublicKeyParameters;
    }
}
