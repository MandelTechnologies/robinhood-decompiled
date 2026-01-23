package com.nimbusds.jose.crypto.p055bc;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* loaded from: classes27.dex */
public final class BouncyCastleProviderSingleton {
    private static BouncyCastleProvider bouncyCastleProvider;

    public static BouncyCastleProvider getInstance() {
        if (bouncyCastleProvider == null) {
            bouncyCastleProvider = new BouncyCastleProvider();
        }
        return bouncyCastleProvider;
    }
}
