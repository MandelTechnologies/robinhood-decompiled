package org.bouncycastle.crypto.p519ec;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.math.p525ec.ECPoint;

/* loaded from: classes25.dex */
public interface ECEncryptor {
    ECPair encrypt(ECPoint eCPoint);

    void init(CipherParameters cipherParameters);
}
