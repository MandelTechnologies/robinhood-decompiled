package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypes2;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType;

/* compiled from: SpecialTypes.kt */
@SourceDebugExtension
/* renamed from: kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt, reason: use source file name */
/* loaded from: classes23.dex */
public final class SpecialTypes5 {
    public static final SpecialTypes getAbbreviatedType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        KotlinType5 kotlinType5Unwrap = kotlinType.unwrap();
        if (kotlinType5Unwrap instanceof SpecialTypes) {
            return (SpecialTypes) kotlinType5Unwrap;
        }
        return null;
    }

    public static final KotlinType4 getAbbreviation(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        SpecialTypes abbreviatedType = getAbbreviatedType(kotlinType);
        if (abbreviatedType != null) {
            return abbreviatedType.getAbbreviation();
        }
        return null;
    }

    public static final KotlinType4 withAbbreviation(KotlinType4 kotlinType4, KotlinType4 abbreviatedType) {
        Intrinsics.checkNotNullParameter(kotlinType4, "<this>");
        Intrinsics.checkNotNullParameter(abbreviatedType, "abbreviatedType");
        return KotlinType3.isError(kotlinType4) ? kotlinType4 : new SpecialTypes(kotlinType4, abbreviatedType);
    }

    public static final boolean isDefinitelyNotNullType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        return kotlinType.unwrap() instanceof SpecialTypes2;
    }

    public static /* synthetic */ KotlinType4 makeSimpleTypeDefinitelyNotNullOrNotNull$default(KotlinType4 kotlinType4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return makeSimpleTypeDefinitelyNotNullOrNotNull(kotlinType4, z);
    }

    public static final KotlinType4 makeSimpleTypeDefinitelyNotNullOrNotNull(KotlinType4 kotlinType4, boolean z) {
        Intrinsics.checkNotNullParameter(kotlinType4, "<this>");
        SpecialTypes2 specialTypes2MakeDefinitelyNotNull$default = SpecialTypes2.Companion.makeDefinitelyNotNull$default(SpecialTypes2.Companion, kotlinType4, z, false, 4, null);
        if (specialTypes2MakeDefinitelyNotNull$default != null) {
            return specialTypes2MakeDefinitelyNotNull$default;
        }
        KotlinType4 kotlinType4MakeIntersectionTypeDefinitelyNotNullOrNotNull = makeIntersectionTypeDefinitelyNotNullOrNotNull(kotlinType4);
        return kotlinType4MakeIntersectionTypeDefinitelyNotNullOrNotNull == null ? kotlinType4.makeNullableAsSpecified(false) : kotlinType4MakeIntersectionTypeDefinitelyNotNullOrNotNull;
    }

    public static final NewCapturedType withNotNullProjection(NewCapturedType newCapturedType) {
        Intrinsics.checkNotNullParameter(newCapturedType, "<this>");
        return new NewCapturedType(newCapturedType.getCaptureStatus(), newCapturedType.getConstructor(), newCapturedType.getLowerType(), newCapturedType.getAttributes(), newCapturedType.isMarkedNullable(), true);
    }

    public static /* synthetic */ KotlinType5 makeDefinitelyNotNullOrNotNull$default(KotlinType5 kotlinType5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return makeDefinitelyNotNullOrNotNull(kotlinType5, z);
    }

    public static final KotlinType5 makeDefinitelyNotNullOrNotNull(KotlinType5 kotlinType5, boolean z) {
        Intrinsics.checkNotNullParameter(kotlinType5, "<this>");
        SpecialTypes2 specialTypes2MakeDefinitelyNotNull$default = SpecialTypes2.Companion.makeDefinitelyNotNull$default(SpecialTypes2.Companion, kotlinType5, z, false, 4, null);
        if (specialTypes2MakeDefinitelyNotNull$default != null) {
            return specialTypes2MakeDefinitelyNotNull$default;
        }
        KotlinType4 kotlinType4MakeIntersectionTypeDefinitelyNotNullOrNotNull = makeIntersectionTypeDefinitelyNotNullOrNotNull(kotlinType5);
        return kotlinType4MakeIntersectionTypeDefinitelyNotNullOrNotNull != null ? kotlinType4MakeIntersectionTypeDefinitelyNotNullOrNotNull : kotlinType5.makeNullableAsSpecified(false);
    }

    private static final KotlinType4 makeIntersectionTypeDefinitelyNotNullOrNotNull(KotlinType kotlinType) {
        IntersectionTypeConstructor intersectionTypeConstructorMakeDefinitelyNotNullOrNotNull;
        TypeConstructor constructor = kotlinType.getConstructor();
        IntersectionTypeConstructor intersectionTypeConstructor = constructor instanceof IntersectionTypeConstructor ? (IntersectionTypeConstructor) constructor : null;
        if (intersectionTypeConstructor == null || (intersectionTypeConstructorMakeDefinitelyNotNullOrNotNull = makeDefinitelyNotNullOrNotNull(intersectionTypeConstructor)) == null) {
            return null;
        }
        return intersectionTypeConstructorMakeDefinitelyNotNullOrNotNull.createType();
    }

    private static final IntersectionTypeConstructor makeDefinitelyNotNullOrNotNull(IntersectionTypeConstructor intersectionTypeConstructor) {
        KotlinType kotlinType;
        Collection<KotlinType> collectionMo28705getSupertypes = intersectionTypeConstructor.mo28705getSupertypes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMo28705getSupertypes, 10));
        Iterator<T> it = collectionMo28705getSupertypes.iterator();
        boolean z = false;
        while (true) {
            kotlinType = null;
            if (!it.hasNext()) {
                break;
            }
            KotlinType kotlinTypeMakeDefinitelyNotNullOrNotNull$default = (KotlinType) it.next();
            if (TypeUtils.isNullableType(kotlinTypeMakeDefinitelyNotNullOrNotNull$default)) {
                kotlinTypeMakeDefinitelyNotNullOrNotNull$default = makeDefinitelyNotNullOrNotNull$default(kotlinTypeMakeDefinitelyNotNullOrNotNull$default.unwrap(), false, 1, null);
                z = true;
            }
            arrayList.add(kotlinTypeMakeDefinitelyNotNullOrNotNull$default);
        }
        if (!z) {
            return null;
        }
        KotlinType alternativeType = intersectionTypeConstructor.getAlternativeType();
        if (alternativeType != null) {
            if (TypeUtils.isNullableType(alternativeType)) {
                alternativeType = makeDefinitelyNotNullOrNotNull$default(alternativeType.unwrap(), false, 1, null);
            }
            kotlinType = alternativeType;
        }
        return new IntersectionTypeConstructor(arrayList).setAlternative(kotlinType);
    }
}
