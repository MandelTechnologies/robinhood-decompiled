package com.nimbusds.jose.jwk;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Objects;

/* loaded from: classes27.dex */
public final class KeyUse implements Serializable {
    private final String identifier;
    public static final KeyUse SIGNATURE = new KeyUse("sig");
    public static final KeyUse ENCRYPTION = new KeyUse("enc");

    public KeyUse(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The key use identifier must not be null");
        }
        this.identifier = str;
    }

    public String identifier() {
        return this.identifier;
    }

    public String toString() {
        return identifier();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeyUse) {
            return Objects.equals(this.identifier, ((KeyUse) obj).identifier);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.identifier);
    }

    public static KeyUse parse(String str) throws ParseException {
        if (str == null) {
            return null;
        }
        KeyUse keyUse = SIGNATURE;
        if (str.equals(keyUse.identifier())) {
            return keyUse;
        }
        KeyUse keyUse2 = ENCRYPTION;
        if (str.equals(keyUse2.identifier())) {
            return keyUse2;
        }
        if (str.trim().isEmpty()) {
            throw new ParseException("JWK use value must not be empty or blank", 0);
        }
        return new KeyUse(str);
    }
}
