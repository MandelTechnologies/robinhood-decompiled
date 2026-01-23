package org.bouncycastle.crypto.params;

import com.plaid.internal.EnumC7081g;
import com.singular.sdk.internal.Constants;
import java.math.BigInteger;
import org.bouncycastle.asn1.p518x9.X9ECParameters;
import org.bouncycastle.math.p525ec.ECAlgorithms;
import org.bouncycastle.math.p525ec.ECConstants;
import org.bouncycastle.math.p525ec.ECCurve;
import org.bouncycastle.math.p525ec.ECPoint;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes25.dex */
public class ECDomainParameters implements ECConstants {

    /* renamed from: G */
    private final ECPoint f7675G;
    private final ECCurve curve;

    /* renamed from: h */
    private final BigInteger f7676h;
    private BigInteger hInv;

    /* renamed from: n */
    private final BigInteger f7677n;
    private final byte[] seed;

    public ECDomainParameters(X9ECParameters x9ECParameters) {
        this(x9ECParameters.getCurve(), x9ECParameters.getG(), x9ECParameters.getN(), x9ECParameters.getH(), x9ECParameters.getSeed());
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger) {
        this(eCCurve, eCPoint, bigInteger, ECConstants.ONE, null);
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        this(eCCurve, eCPoint, bigInteger, bigInteger2, null);
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.hInv = null;
        if (eCCurve == null) {
            throw new NullPointerException("curve");
        }
        if (bigInteger == null) {
            throw new NullPointerException(Constants.RequestParamsKeys.APP_NAME_KEY);
        }
        this.curve = eCCurve;
        this.f7675G = validatePublicPoint(eCCurve, eCPoint);
        this.f7677n = bigInteger;
        this.f7676h = bigInteger2;
        this.seed = Arrays.clone(bArr);
    }

    static ECPoint validatePublicPoint(ECCurve eCCurve, ECPoint eCPoint) {
        if (eCPoint == null) {
            throw new NullPointerException("Point cannot be null");
        }
        ECPoint eCPointNormalize = ECAlgorithms.importPoint(eCCurve, eCPoint).normalize();
        if (eCPointNormalize.isInfinity()) {
            throw new IllegalArgumentException("Point at infinity");
        }
        if (eCPointNormalize.isValid()) {
            return eCPointNormalize;
        }
        throw new IllegalArgumentException("Point not on curve");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECDomainParameters)) {
            return false;
        }
        ECDomainParameters eCDomainParameters = (ECDomainParameters) obj;
        return this.curve.equals(eCDomainParameters.curve) && this.f7675G.equals(eCDomainParameters.f7675G) && this.f7677n.equals(eCDomainParameters.f7677n);
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    public ECPoint getG() {
        return this.f7675G;
    }

    public BigInteger getH() {
        return this.f7676h;
    }

    public synchronized BigInteger getHInv() {
        try {
            if (this.hInv == null) {
                this.hInv = BigIntegers.modOddInverseVar(this.f7677n, this.f7676h);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.hInv;
    }

    public BigInteger getN() {
        return this.f7677n;
    }

    public byte[] getSeed() {
        return Arrays.clone(this.seed);
    }

    public int hashCode() {
        return ((((this.curve.hashCode() ^ 1028) * EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE) ^ this.f7675G.hashCode()) * EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE) ^ this.f7677n.hashCode();
    }

    public BigInteger validatePrivateScalar(BigInteger bigInteger) {
        if (bigInteger == null) {
            throw new NullPointerException("Scalar cannot be null");
        }
        if (bigInteger.compareTo(ECConstants.ONE) < 0 || bigInteger.compareTo(getN()) >= 0) {
            throw new IllegalArgumentException("Scalar is not in the interval [1, n - 1]");
        }
        return bigInteger;
    }

    public ECPoint validatePublicPoint(ECPoint eCPoint) {
        return validatePublicPoint(getCurve(), eCPoint);
    }
}
