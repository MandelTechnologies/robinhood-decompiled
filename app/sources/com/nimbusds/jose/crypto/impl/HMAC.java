package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes27.dex */
public class HMAC {
    public static Mac getInitMac(SecretKey secretKey, Provider provider) throws NoSuchAlgorithmException, JOSEException, InvalidKeyException {
        Mac mac;
        try {
            if (provider != null) {
                mac = Mac.getInstance(secretKey.getAlgorithm(), provider);
            } else {
                mac = Mac.getInstance(secretKey.getAlgorithm());
            }
            mac.init(secretKey);
            return mac;
        } catch (InvalidKeyException e) {
            throw new JOSEException("Invalid HMAC key: " + e.getMessage(), e);
        } catch (NoSuchAlgorithmException e2) {
            throw new JOSEException("Unsupported HMAC algorithm: " + e2.getMessage(), e2);
        }
    }

    public static byte[] compute(String str, byte[] bArr, byte[] bArr2, Provider provider) throws JOSEException {
        return compute(new SecretKeySpec(bArr, str), bArr2, provider);
    }

    public static byte[] compute(SecretKey secretKey, byte[] bArr, Provider provider) throws IllegalStateException, NoSuchAlgorithmException, JOSEException, InvalidKeyException {
        Mac initMac = getInitMac(secretKey, provider);
        initMac.update(bArr);
        return initMac.doFinal();
    }
}
