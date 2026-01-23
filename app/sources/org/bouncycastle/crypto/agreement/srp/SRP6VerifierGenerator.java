package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.SRP6GroupParameters;

/* loaded from: classes25.dex */
public class SRP6VerifierGenerator {

    /* renamed from: N */
    protected BigInteger f7275N;
    protected Digest digest;

    /* renamed from: g */
    protected BigInteger f7276g;

    public BigInteger generateVerifier(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.f7276g.modPow(SRP6Util.calculateX(this.digest, this.f7275N, bArr, bArr2, bArr3), this.f7275N);
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, Digest digest) {
        this.f7275N = bigInteger;
        this.f7276g = bigInteger2;
        this.digest = digest;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, Digest digest) {
        this.f7275N = sRP6GroupParameters.getN();
        this.f7276g = sRP6GroupParameters.getG();
        this.digest = digest;
    }
}
