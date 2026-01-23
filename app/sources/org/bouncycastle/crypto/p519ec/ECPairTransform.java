package org.bouncycastle.crypto.p519ec;

import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes25.dex */
public interface ECPairTransform {
    void init(CipherParameters cipherParameters);

    ECPair transform(ECPair eCPair);
}
