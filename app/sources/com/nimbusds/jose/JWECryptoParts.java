package com.nimbusds.jose;

import com.nimbusds.jose.util.Base64URL;

/* loaded from: classes27.dex */
public final class JWECryptoParts {
    private final Base64URL authenticationTag;
    private final Base64URL cipherText;
    private final Base64URL encryptedKey;
    private final JWEHeader header;

    /* renamed from: iv */
    private final Base64URL f1178iv;

    public JWECryptoParts(JWEHeader jWEHeader, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4) {
        this.header = jWEHeader;
        this.encryptedKey = base64URL;
        this.f1178iv = base64URL2;
        if (base64URL3 == null) {
            throw new IllegalArgumentException("The cipher text must not be null");
        }
        this.cipherText = base64URL3;
        this.authenticationTag = base64URL4;
    }

    public JWEHeader getHeader() {
        return this.header;
    }

    public Base64URL getEncryptedKey() {
        return this.encryptedKey;
    }

    public Base64URL getInitializationVector() {
        return this.f1178iv;
    }

    public Base64URL getCipherText() {
        return this.cipherText;
    }

    public Base64URL getAuthenticationTag() {
        return this.authenticationTag;
    }
}
