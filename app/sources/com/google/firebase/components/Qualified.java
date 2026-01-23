package com.google.firebase.components;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import java.lang.annotation.Annotation;

/* loaded from: classes.dex */
public final class Qualified<T> {
    private final Class<? extends Annotation> qualifier;

    /* renamed from: type, reason: collision with root package name */
    private final Class<T> f9834type;

    private @interface Unqualified {
    }

    public Qualified(Class<? extends Annotation> cls, Class<T> cls2) {
        this.qualifier = cls;
        this.f9834type = cls2;
    }

    public static <T> Qualified<T> unqualified(Class<T> cls) {
        return new Qualified<>(Unqualified.class, cls);
    }

    public static <T> Qualified<T> qualified(Class<? extends Annotation> cls, Class<T> cls2) {
        return new Qualified<>(cls, cls2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Qualified.class != obj.getClass()) {
            return false;
        }
        Qualified qualified = (Qualified) obj;
        if (this.f9834type.equals(qualified.f9834type)) {
            return this.qualifier.equals(qualified.qualifier);
        }
        return false;
    }

    public int hashCode() {
        return (this.f9834type.hashCode() * 31) + this.qualifier.hashCode();
    }

    public String toString() {
        if (this.qualifier == Unqualified.class) {
            return this.f9834type.getName();
        }
        return "@" + this.qualifier.getName() + PlaceholderUtils.XXShortPlaceholderText + this.f9834type.getName();
    }
}
