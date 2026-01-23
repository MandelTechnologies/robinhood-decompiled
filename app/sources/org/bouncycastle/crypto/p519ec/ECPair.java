package org.bouncycastle.crypto.p519ec;

import org.bouncycastle.math.p525ec.ECPoint;

/* loaded from: classes25.dex */
public class ECPair {

    /* renamed from: x */
    private final ECPoint f7421x;

    /* renamed from: y */
    private final ECPoint f7422y;

    public ECPair(ECPoint eCPoint, ECPoint eCPoint2) {
        this.f7421x = eCPoint;
        this.f7422y = eCPoint2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ECPair) {
            return equals((ECPair) obj);
        }
        return false;
    }

    public boolean equals(ECPair eCPair) {
        return eCPair.getX().equals(getX()) && eCPair.getY().equals(getY());
    }

    public ECPoint getX() {
        return this.f7421x;
    }

    public ECPoint getY() {
        return this.f7422y;
    }

    public int hashCode() {
        return this.f7421x.hashCode() + (this.f7422y.hashCode() * 37);
    }
}
