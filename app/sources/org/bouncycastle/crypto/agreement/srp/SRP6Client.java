package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.SRP6GroupParameters;

/* loaded from: classes25.dex */
public class SRP6Client {

    /* renamed from: A */
    protected BigInteger f7255A;

    /* renamed from: B */
    protected BigInteger f7256B;
    protected BigInteger Key;

    /* renamed from: M1 */
    protected BigInteger f7257M1;

    /* renamed from: M2 */
    protected BigInteger f7258M2;

    /* renamed from: N */
    protected BigInteger f7259N;

    /* renamed from: S */
    protected BigInteger f7260S;

    /* renamed from: a */
    protected BigInteger f7261a;
    protected Digest digest;

    /* renamed from: g */
    protected BigInteger f7262g;
    protected SecureRandom random;

    /* renamed from: u */
    protected BigInteger f7263u;

    /* renamed from: x */
    protected BigInteger f7264x;

    private BigInteger calculateS() {
        BigInteger bigIntegerCalculateK = SRP6Util.calculateK(this.digest, this.f7259N, this.f7262g);
        return this.f7256B.subtract(this.f7262g.modPow(this.f7264x, this.f7259N).multiply(bigIntegerCalculateK).mod(this.f7259N)).mod(this.f7259N).modPow(this.f7263u.multiply(this.f7264x).add(this.f7261a), this.f7259N);
    }

    public BigInteger calculateClientEvidenceMessage() throws CryptoException {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.f7255A;
        if (bigInteger3 == null || (bigInteger = this.f7256B) == null || (bigInteger2 = this.f7260S) == null) {
            throw new CryptoException("Impossible to compute M1: some data are missing from the previous operations (A,B,S)");
        }
        BigInteger bigIntegerCalculateM1 = SRP6Util.calculateM1(this.digest, this.f7259N, bigInteger3, bigInteger, bigInteger2);
        this.f7257M1 = bigIntegerCalculateM1;
        return bigIntegerCalculateM1;
    }

    public BigInteger calculateSecret(BigInteger bigInteger) throws CryptoException {
        BigInteger bigIntegerValidatePublicValue = SRP6Util.validatePublicValue(this.f7259N, bigInteger);
        this.f7256B = bigIntegerValidatePublicValue;
        this.f7263u = SRP6Util.calculateU(this.digest, this.f7259N, this.f7255A, bigIntegerValidatePublicValue);
        BigInteger bigIntegerCalculateS = calculateS();
        this.f7260S = bigIntegerCalculateS;
        return bigIntegerCalculateS;
    }

    public BigInteger calculateSessionKey() throws CryptoException {
        BigInteger bigInteger = this.f7260S;
        if (bigInteger == null || this.f7257M1 == null || this.f7258M2 == null) {
            throw new CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        BigInteger bigIntegerCalculateKey = SRP6Util.calculateKey(this.digest, this.f7259N, bigInteger);
        this.Key = bigIntegerCalculateKey;
        return bigIntegerCalculateKey;
    }

    public BigInteger generateClientCredentials(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f7264x = SRP6Util.calculateX(this.digest, this.f7259N, bArr, bArr2, bArr3);
        BigInteger bigIntegerSelectPrivateValue = selectPrivateValue();
        this.f7261a = bigIntegerSelectPrivateValue;
        BigInteger bigIntegerModPow = this.f7262g.modPow(bigIntegerSelectPrivateValue, this.f7259N);
        this.f7255A = bigIntegerModPow;
        return bigIntegerModPow;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, Digest digest, SecureRandom secureRandom) {
        this.f7259N = bigInteger;
        this.f7262g = bigInteger2;
        this.digest = digest;
        this.random = secureRandom;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, Digest digest, SecureRandom secureRandom) {
        init(sRP6GroupParameters.getN(), sRP6GroupParameters.getG(), digest, secureRandom);
    }

    protected BigInteger selectPrivateValue() {
        return SRP6Util.generatePrivateValue(this.digest, this.f7259N, this.f7262g, this.random);
    }

    public boolean verifyServerEvidenceMessage(BigInteger bigInteger) throws CryptoException {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.f7255A;
        if (bigInteger4 == null || (bigInteger2 = this.f7257M1) == null || (bigInteger3 = this.f7260S) == null) {
            throw new CryptoException("Impossible to compute and verify M2: some data are missing from the previous operations (A,M1,S)");
        }
        if (!SRP6Util.calculateM2(this.digest, this.f7259N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        }
        this.f7258M2 = bigInteger;
        return true;
    }
}
