package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes25.dex */
public class GOST3410Parameters implements CipherParameters {

    /* renamed from: a */
    private BigInteger f7685a;

    /* renamed from: p */
    private BigInteger f7686p;

    /* renamed from: q */
    private BigInteger f7687q;
    private GOST3410ValidationParameters validation;

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f7686p = bigInteger;
        this.f7687q = bigInteger2;
        this.f7685a = bigInteger3;
    }

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, GOST3410ValidationParameters gOST3410ValidationParameters) {
        this.f7685a = bigInteger3;
        this.f7686p = bigInteger;
        this.f7687q = bigInteger2;
        this.validation = gOST3410ValidationParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410Parameters)) {
            return false;
        }
        GOST3410Parameters gOST3410Parameters = (GOST3410Parameters) obj;
        return gOST3410Parameters.getP().equals(this.f7686p) && gOST3410Parameters.getQ().equals(this.f7687q) && gOST3410Parameters.getA().equals(this.f7685a);
    }

    public BigInteger getA() {
        return this.f7685a;
    }

    public BigInteger getP() {
        return this.f7686p;
    }

    public BigInteger getQ() {
        return this.f7687q;
    }

    public GOST3410ValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (this.f7686p.hashCode() ^ this.f7687q.hashCode()) ^ this.f7685a.hashCode();
    }
}
