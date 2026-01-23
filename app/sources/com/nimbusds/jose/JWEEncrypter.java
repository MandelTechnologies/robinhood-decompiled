package com.nimbusds.jose;

/* loaded from: classes27.dex */
public interface JWEEncrypter extends JWEProvider {
    JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr) throws JOSEException;
}
