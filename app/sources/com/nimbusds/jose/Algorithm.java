package com.nimbusds.jose;

import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import java.io.Serializable;

/* loaded from: classes27.dex */
public class Algorithm implements Serializable {
    public static final Algorithm NONE = new Algorithm(ApiRenderablePlatforms.VERSIONS_NONE, Requirement.REQUIRED);
    private final String name;
    private final Requirement requirement;

    public Algorithm(String str, Requirement requirement) {
        if (str == null) {
            throw new IllegalArgumentException("The algorithm name must not be null");
        }
        this.name = str;
        this.requirement = requirement;
    }

    public Algorithm(String str) {
        this(str, null);
    }

    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        return this.name.hashCode();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Algorithm) && toString().equals(obj.toString());
    }

    public final String toString() {
        return this.name;
    }

    public static Algorithm parse(String str) {
        if (str == null) {
            return null;
        }
        return new Algorithm(str);
    }
}
