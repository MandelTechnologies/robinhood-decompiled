package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes25.dex */
public class ElGamalParameters implements CipherParameters {

    /* renamed from: g */
    private BigInteger f7680g;

    /* renamed from: l */
    private int f7681l;

    /* renamed from: p */
    private BigInteger f7682p;

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.f7680g = bigInteger2;
        this.f7682p = bigInteger;
        this.f7681l = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ElGamalParameters)) {
            return false;
        }
        ElGamalParameters elGamalParameters = (ElGamalParameters) obj;
        return elGamalParameters.getP().equals(this.f7682p) && elGamalParameters.getG().equals(this.f7680g) && elGamalParameters.getL() == this.f7681l;
    }

    public BigInteger getG() {
        return this.f7680g;
    }

    public int getL() {
        return this.f7681l;
    }

    public BigInteger getP() {
        return this.f7682p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) + this.f7681l;
    }
}
