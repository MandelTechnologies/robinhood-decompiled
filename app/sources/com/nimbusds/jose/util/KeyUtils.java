package com.nimbusds.jose.util;

import com.robinhood.android.authlock.biometric.BiometricChangeManager;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes27.dex */
public class KeyUtils {
    public static SecretKey toAESKey(SecretKey secretKey) {
        if (secretKey == null) {
            return null;
        }
        return new SecretKeySpec(secretKey.getEncoded(), BiometricChangeManager.ALGORITHM);
    }
}
