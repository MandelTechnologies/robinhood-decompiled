package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.KeyLengthException;
import com.robinhood.android.authlock.biometric.BiometricChangeManager;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes27.dex */
public final class CompositeKey {
    private final SecretKey encKey;
    private final SecretKey inputKey;
    private final SecretKey macKey;
    private final int truncatedMacLength;

    public CompositeKey(SecretKey secretKey) throws KeyLengthException {
        this.inputKey = secretKey;
        byte[] encoded = secretKey.getEncoded();
        if (encoded.length == 32) {
            this.macKey = new SecretKeySpec(encoded, 0, 16, "HMACSHA256");
            this.encKey = new SecretKeySpec(encoded, 16, 16, BiometricChangeManager.ALGORITHM);
            this.truncatedMacLength = 16;
        } else if (encoded.length == 48) {
            this.macKey = new SecretKeySpec(encoded, 0, 24, "HMACSHA384");
            this.encKey = new SecretKeySpec(encoded, 24, 24, BiometricChangeManager.ALGORITHM);
            this.truncatedMacLength = 24;
        } else {
            if (encoded.length == 64) {
                this.macKey = new SecretKeySpec(encoded, 0, 32, "HMACSHA512");
                this.encKey = new SecretKeySpec(encoded, 32, 32, BiometricChangeManager.ALGORITHM);
                this.truncatedMacLength = 32;
                return;
            }
            throw new KeyLengthException("Unsupported AES/CBC/PKCS5Padding/HMAC-SHA2 key length, must be 256, 384 or 512 bits");
        }
    }

    public SecretKey getMACKey() {
        return this.macKey;
    }

    public int getTruncatedMACByteLength() {
        return this.truncatedMacLength;
    }

    public SecretKey getAESKey() {
        return this.encKey;
    }
}
