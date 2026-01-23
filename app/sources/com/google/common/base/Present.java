package com.google.common.base;

/* loaded from: classes.dex */
final class Present<T> extends Optional<T> {
    private final T reference;

    @Override // com.google.common.base.Optional
    public boolean isPresent() {
        return true;
    }

    Present(T reference) {
        this.reference = reference;
    }

    @Override // com.google.common.base.Optional
    public T get() {
        return this.reference;
    }

    public boolean equals(Object object) {
        if (object instanceof Present) {
            return this.reference.equals(((Present) object).reference);
        }
        return false;
    }

    public int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    public String toString() {
        return "Optional.of(" + this.reference + ")";
    }
}
