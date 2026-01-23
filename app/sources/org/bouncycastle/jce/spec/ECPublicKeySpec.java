package org.bouncycastle.jce.spec;

import org.bouncycastle.math.p525ec.ECPoint;

/* loaded from: classes25.dex */
public class ECPublicKeySpec extends ECKeySpec {

    /* renamed from: q */
    private ECPoint f7791q;

    public ECPublicKeySpec(ECPoint eCPoint, ECParameterSpec eCParameterSpec) {
        super(eCParameterSpec);
        if (eCPoint.getCurve() != null) {
            this.f7791q = eCPoint.normalize();
        } else {
            this.f7791q = eCPoint;
        }
    }

    public ECPoint getQ() {
        return this.f7791q;
    }
}
