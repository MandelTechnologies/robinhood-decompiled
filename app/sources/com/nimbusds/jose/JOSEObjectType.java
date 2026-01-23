package com.nimbusds.jose;

import java.io.Serializable;

/* loaded from: classes27.dex */
public final class JOSEObjectType implements Serializable {
    public static final JOSEObjectType JOSE = new JOSEObjectType("JOSE");
    public static final JOSEObjectType JOSE_JSON = new JOSEObjectType("JOSE+JSON");
    public static final JOSEObjectType JWT = new JOSEObjectType(io.jsonwebtoken.Header.JWT_TYPE);

    /* renamed from: type, reason: collision with root package name */
    private final String f9860type;

    public JOSEObjectType(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The object type must not be null");
        }
        this.f9860type = str;
    }

    public int hashCode() {
        return this.f9860type.toLowerCase().hashCode();
    }

    public boolean equals(Object obj) {
        return (obj instanceof JOSEObjectType) && this.f9860type.equalsIgnoreCase(((JOSEObjectType) obj).f9860type);
    }

    public String toString() {
        return this.f9860type;
    }
}
