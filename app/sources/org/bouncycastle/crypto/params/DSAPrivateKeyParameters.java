package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes25.dex */
public class DSAPrivateKeyParameters extends DSAKeyParameters {

    /* renamed from: x */
    private BigInteger f7673x;

    public DSAPrivateKeyParameters(BigInteger bigInteger, DSAParameters dSAParameters) {
        super(true, dSAParameters);
        this.f7673x = bigInteger;
    }

    public BigInteger getX() {
        return this.f7673x;
    }
}
