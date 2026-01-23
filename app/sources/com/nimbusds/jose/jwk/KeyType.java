package com.nimbusds.jose.jwk;

import com.nimbusds.jose.Requirement;
import java.io.Serializable;

/* loaded from: classes27.dex */
public final class KeyType implements Serializable {
    public static final KeyType OCT;
    public static final KeyType OKP;
    private final Requirement requirement;
    private final String value;

    /* renamed from: EC */
    public static final KeyType f1189EC = new KeyType("EC", Requirement.RECOMMENDED);
    public static final KeyType RSA = new KeyType("RSA", Requirement.REQUIRED);

    static {
        Requirement requirement = Requirement.OPTIONAL;
        OCT = new KeyType("oct", requirement);
        OKP = new KeyType("OKP", requirement);
    }

    public KeyType(String str, Requirement requirement) {
        if (str == null) {
            throw new IllegalArgumentException("The key type value must not be null");
        }
        this.value = str;
        this.requirement = requirement;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public boolean equals(Object obj) {
        return (obj instanceof KeyType) && toString().equals(obj.toString());
    }

    public String toString() {
        return this.value;
    }

    public static KeyType parse(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The key type to parse must not be null");
        }
        KeyType keyType = f1189EC;
        if (str.equals(keyType.getValue())) {
            return keyType;
        }
        KeyType keyType2 = RSA;
        if (str.equals(keyType2.getValue())) {
            return keyType2;
        }
        KeyType keyType3 = OCT;
        if (str.equals(keyType3.getValue())) {
            return keyType3;
        }
        KeyType keyType4 = OKP;
        return str.equals(keyType4.getValue()) ? keyType4 : new KeyType(str, null);
    }
}
