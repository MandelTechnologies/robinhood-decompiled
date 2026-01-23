package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Memoable;

/* loaded from: classes25.dex */
public class CramerShoupParameters implements CipherParameters {

    /* renamed from: H */
    private Digest f7647H;

    /* renamed from: g1 */
    private BigInteger f7648g1;

    /* renamed from: g2 */
    private BigInteger f7649g2;

    /* renamed from: p */
    private BigInteger f7650p;

    public CramerShoupParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest) {
        this.f7650p = bigInteger;
        this.f7648g1 = bigInteger2;
        this.f7649g2 = bigInteger3;
        Digest digest2 = (Digest) ((Memoable) digest).copy();
        this.f7647H = digest2;
        digest2.reset();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupParameters)) {
            return false;
        }
        CramerShoupParameters cramerShoupParameters = (CramerShoupParameters) obj;
        return cramerShoupParameters.getP().equals(this.f7650p) && cramerShoupParameters.getG1().equals(this.f7648g1) && cramerShoupParameters.getG2().equals(this.f7649g2);
    }

    public BigInteger getG1() {
        return this.f7648g1;
    }

    public BigInteger getG2() {
        return this.f7649g2;
    }

    public Digest getH() {
        return (Digest) ((Memoable) this.f7647H).copy();
    }

    public BigInteger getP() {
        return this.f7650p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG1().hashCode()) ^ getG2().hashCode();
    }
}
