package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: typeQualifiers.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers, reason: use source file name */
/* loaded from: classes14.dex */
public final class typeQualifiers {
    public static final Companion Companion = new Companion(null);
    private static final typeQualifiers NONE = new typeQualifiers(null, null, false, false, 8, null);
    private final boolean definitelyNotNull;
    private final boolean isNullabilityQualifierForWarning;
    private final typeQualifiers2 mutability;
    private final typeQualifiers3 nullability;

    public static /* synthetic */ typeQualifiers copy$default(typeQualifiers typequalifiers, typeQualifiers3 typequalifiers3, typeQualifiers2 typequalifiers2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            typequalifiers3 = typequalifiers.nullability;
        }
        if ((i & 2) != 0) {
            typequalifiers2 = typequalifiers.mutability;
        }
        if ((i & 4) != 0) {
            z = typequalifiers.definitelyNotNull;
        }
        if ((i & 8) != 0) {
            z2 = typequalifiers.isNullabilityQualifierForWarning;
        }
        return typequalifiers.copy(typequalifiers3, typequalifiers2, z, z2);
    }

    public final typeQualifiers copy(typeQualifiers3 typequalifiers3, typeQualifiers2 typequalifiers2, boolean z, boolean z2) {
        return new typeQualifiers(typequalifiers3, typequalifiers2, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof typeQualifiers)) {
            return false;
        }
        typeQualifiers typequalifiers = (typeQualifiers) obj;
        return this.nullability == typequalifiers.nullability && this.mutability == typequalifiers.mutability && this.definitelyNotNull == typequalifiers.definitelyNotNull && this.isNullabilityQualifierForWarning == typequalifiers.isNullabilityQualifierForWarning;
    }

    public int hashCode() {
        typeQualifiers3 typequalifiers3 = this.nullability;
        int iHashCode = (typequalifiers3 == null ? 0 : typequalifiers3.hashCode()) * 31;
        typeQualifiers2 typequalifiers2 = this.mutability;
        return ((((iHashCode + (typequalifiers2 != null ? typequalifiers2.hashCode() : 0)) * 31) + Boolean.hashCode(this.definitelyNotNull)) * 31) + Boolean.hashCode(this.isNullabilityQualifierForWarning);
    }

    public String toString() {
        return "JavaTypeQualifiers(nullability=" + this.nullability + ", mutability=" + this.mutability + ", definitelyNotNull=" + this.definitelyNotNull + ", isNullabilityQualifierForWarning=" + this.isNullabilityQualifierForWarning + ')';
    }

    public typeQualifiers(typeQualifiers3 typequalifiers3, typeQualifiers2 typequalifiers2, boolean z, boolean z2) {
        this.nullability = typequalifiers3;
        this.mutability = typequalifiers2;
        this.definitelyNotNull = z;
        this.isNullabilityQualifierForWarning = z2;
    }

    public /* synthetic */ typeQualifiers(typeQualifiers3 typequalifiers3, typeQualifiers2 typequalifiers2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(typequalifiers3, typequalifiers2, z, (i & 8) != 0 ? false : z2);
    }

    public final typeQualifiers3 getNullability() {
        return this.nullability;
    }

    public final typeQualifiers2 getMutability() {
        return this.mutability;
    }

    public final boolean getDefinitelyNotNull() {
        return this.definitelyNotNull;
    }

    public final boolean isNullabilityQualifierForWarning() {
        return this.isNullabilityQualifierForWarning;
    }

    /* compiled from: typeQualifiers.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers$Companion */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final typeQualifiers getNONE() {
            return typeQualifiers.NONE;
        }
    }
}
