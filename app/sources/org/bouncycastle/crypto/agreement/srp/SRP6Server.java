package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.SRP6GroupParameters;

/* loaded from: classes25.dex */
public class SRP6Server {

    /* renamed from: A */
    protected BigInteger f7265A;

    /* renamed from: B */
    protected BigInteger f7266B;
    protected BigInteger Key;

    /* renamed from: M1 */
    protected BigInteger f7267M1;

    /* renamed from: M2 */
    protected BigInteger f7268M2;

    /* renamed from: N */
    protected BigInteger f7269N;

    /* renamed from: S */
    protected BigInteger f7270S;

    /* renamed from: b */
    protected BigInteger f7271b;
    protected Digest digest;

    /* renamed from: g */
    protected BigInteger f7272g;
    protected SecureRandom random;

    /* renamed from: u */
    protected BigInteger f7273u;

    /* renamed from: v */
    protected BigInteger f7274v;

    private BigInteger calculateS() {
        return this.f7274v.modPow(this.f7273u, this.f7269N).multiply(this.f7265A).mod(this.f7269N).modPow(this.f7271b, this.f7269N);
    }

    public BigInteger calculateSecret(BigInteger bigInteger) throws CryptoException {
        BigInteger bigIntegerValidatePublicValue = SRP6Util.validatePublicValue(this.f7269N, bigInteger);
        this.f7265A = bigIntegerValidatePublicValue;
        this.f7273u = SRP6Util.calculateU(this.digest, this.f7269N, bigIntegerValidatePublicValue, this.f7266B);
        BigInteger bigIntegerCalculateS = calculateS();
        this.f7270S = bigIntegerCalculateS;
        return bigIntegerCalculateS;
    }

    public BigInteger calculateServerEvidenceMessage() throws CryptoException {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.f7265A;
        if (bigInteger3 == null || (bigInteger = this.f7267M1) == null || (bigInteger2 = this.f7270S) == null) {
            throw new CryptoException("Impossible to compute M2: some data are missing from the previous operations (A,M1,S)");
        }
        BigInteger bigIntegerCalculateM2 = SRP6Util.calculateM2(this.digest, this.f7269N, bigInteger3, bigInteger, bigInteger2);
        this.f7268M2 = bigIntegerCalculateM2;
        return bigIntegerCalculateM2;
    }

    public BigInteger calculateSessionKey() throws CryptoException {
        BigInteger bigInteger = this.f7270S;
        if (bigInteger == null || this.f7267M1 == null || this.f7268M2 == null) {
            throw new CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        BigInteger bigIntegerCalculateKey = SRP6Util.calculateKey(this.digest, this.f7269N, bigInteger);
        this.Key = bigIntegerCalculateKey;
        return bigIntegerCalculateKey;
    }

    public BigInteger generateServerCredentials() {
        BigInteger bigIntegerCalculateK = SRP6Util.calculateK(this.digest, this.f7269N, this.f7272g);
        this.f7271b = selectPrivateValue();
        BigInteger bigIntegerMod = bigIntegerCalculateK.multiply(this.f7274v).mod(this.f7269N).add(this.f7272g.modPow(this.f7271b, this.f7269N)).mod(this.f7269N);
        this.f7266B = bigIntegerMod;
        return bigIntegerMod;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest, SecureRandom secureRandom) {
        this.f7269N = bigInteger;
        this.f7272g = bigInteger2;
        this.f7274v = bigInteger3;
        this.random = secureRandom;
        this.digest = digest;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, BigInteger bigInteger, Digest digest, SecureRandom secureRandom) {
        init(sRP6GroupParameters.getN(), sRP6GroupParameters.getG(), bigInteger, digest, secureRandom);
    }

    protected BigInteger selectPrivateValue() {
        return SRP6Util.generatePrivateValue(this.digest, this.f7269N, this.f7272g, this.random);
    }

    public boolean verifyClientEvidenceMessage(BigInteger bigInteger) throws CryptoException {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.f7265A;
        if (bigInteger4 == null || (bigInteger2 = this.f7266B) == null || (bigInteger3 = this.f7270S) == null) {
            throw new CryptoException("Impossible to compute and verify M1: some data are missing from the previous operations (A,B,S)");
        }
        if (!SRP6Util.calculateM1(this.digest, this.f7269N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        }
        this.f7267M1 = bigInteger;
        return true;
    }
}
