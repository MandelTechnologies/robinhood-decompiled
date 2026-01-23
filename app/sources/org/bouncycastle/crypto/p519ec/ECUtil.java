package org.bouncycastle.crypto.p519ec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.p525ec.ECConstants;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes25.dex */
class ECUtil {
    ECUtil() {
    }

    static BigInteger generateK(BigInteger bigInteger, SecureRandom secureRandom) {
        int iBitLength = bigInteger.bitLength();
        while (true) {
            BigInteger bigIntegerCreateRandomBigInteger = BigIntegers.createRandomBigInteger(iBitLength, secureRandom);
            if (!bigIntegerCreateRandomBigInteger.equals(ECConstants.ZERO) && bigIntegerCreateRandomBigInteger.compareTo(bigInteger) < 0) {
                return bigIntegerCreateRandomBigInteger;
            }
        }
    }
}
