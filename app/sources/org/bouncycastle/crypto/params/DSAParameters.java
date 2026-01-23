package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes25.dex */
public class DSAParameters implements CipherParameters {

    /* renamed from: g */
    private BigInteger f7670g;

    /* renamed from: p */
    private BigInteger f7671p;

    /* renamed from: q */
    private BigInteger f7672q;
    private DSAValidationParameters validation;

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f7670g = bigInteger3;
        this.f7671p = bigInteger;
        this.f7672q = bigInteger2;
    }

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, DSAValidationParameters dSAValidationParameters) {
        this.f7670g = bigInteger3;
        this.f7671p = bigInteger;
        this.f7672q = bigInteger2;
        this.validation = dSAValidationParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAParameters)) {
            return false;
        }
        DSAParameters dSAParameters = (DSAParameters) obj;
        return dSAParameters.getP().equals(this.f7671p) && dSAParameters.getQ().equals(this.f7672q) && dSAParameters.getG().equals(this.f7670g);
    }

    public BigInteger getG() {
        return this.f7670g;
    }

    public BigInteger getP() {
        return this.f7671p;
    }

    public BigInteger getQ() {
        return this.f7672q;
    }

    public DSAValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getQ().hashCode()) ^ getG().hashCode();
    }
}
