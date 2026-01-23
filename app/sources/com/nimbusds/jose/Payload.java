package com.nimbusds.jose;

import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.JSONObjectUtils;
import com.nimbusds.jose.util.StandardCharset;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes27.dex */
public final class Payload implements Serializable {
    private final Base64URL base64URL;
    private final byte[] bytes;
    private final Map<String, Object> jsonObject;
    private final JWSObject jwsObject;
    private final Origin origin;

    /* renamed from: string, reason: collision with root package name */
    private final String f9861string;

    public enum Origin {
        JSON,
        STRING,
        BYTE_ARRAY,
        BASE64URL,
        JWS_OBJECT,
        SIGNED_JWT
    }

    private static String byteArrayToString(byte[] bArr) {
        if (bArr != null) {
            return new String(bArr, StandardCharset.UTF_8);
        }
        return null;
    }

    private static byte[] stringToByteArray(String str) {
        if (str != null) {
            return str.getBytes(StandardCharset.UTF_8);
        }
        return null;
    }

    public Payload(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The string must not be null");
        }
        this.jsonObject = null;
        this.f9861string = str;
        this.bytes = null;
        this.base64URL = null;
        this.jwsObject = null;
        this.origin = Origin.STRING;
    }

    public Payload(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("The byte array must not be null");
        }
        this.jsonObject = null;
        this.f9861string = null;
        this.bytes = bArr;
        this.base64URL = null;
        this.jwsObject = null;
        this.origin = Origin.BYTE_ARRAY;
    }

    public Payload(Base64URL base64URL) {
        if (base64URL == null) {
            throw new IllegalArgumentException("The Base64URL-encoded object must not be null");
        }
        this.jsonObject = null;
        this.f9861string = null;
        this.bytes = null;
        this.base64URL = base64URL;
        this.jwsObject = null;
        this.origin = Origin.BASE64URL;
    }

    public String toString() {
        String str = this.f9861string;
        if (str != null) {
            return str;
        }
        JWSObject jWSObject = this.jwsObject;
        if (jWSObject != null) {
            if (jWSObject.getParsedString() != null) {
                return this.jwsObject.getParsedString();
            }
            return this.jwsObject.serialize();
        }
        Map<String, Object> map = this.jsonObject;
        if (map != null) {
            return JSONObjectUtils.toJSONString(map);
        }
        byte[] bArr = this.bytes;
        if (bArr != null) {
            return byteArrayToString(bArr);
        }
        Base64URL base64URL = this.base64URL;
        if (base64URL != null) {
            return base64URL.decodeToString();
        }
        return null;
    }

    public byte[] toBytes() {
        byte[] bArr = this.bytes;
        if (bArr != null) {
            return bArr;
        }
        Base64URL base64URL = this.base64URL;
        if (base64URL != null) {
            return base64URL.decode();
        }
        return stringToByteArray(toString());
    }

    public Base64URL toBase64URL() {
        Base64URL base64URL = this.base64URL;
        return base64URL != null ? base64URL : Base64URL.encode(toBytes());
    }
}
