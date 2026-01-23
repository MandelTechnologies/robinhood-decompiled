package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* compiled from: typeEnhancementUtils.kt */
@SourceDebugExtension
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementUtilsKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class typeEnhancementUtils {
    private static final <T> T select(Set<? extends T> set, T t, T t2, T t3, boolean z) {
        Set<? extends T> set2;
        if (z) {
            T t4 = set.contains(t) ? t : set.contains(t2) ? t2 : null;
            if (Intrinsics.areEqual(t4, t) && Intrinsics.areEqual(t3, t2)) {
                return null;
            }
            return t3 == null ? t4 : t3;
        }
        if (t3 != null && (set2 = CollectionsKt.toSet(SetsKt.plus(set, t3))) != null) {
            set = set2;
        }
        return (T) CollectionsKt.singleOrNull(set);
    }

    private static final typeQualifiers3 select(Set<? extends typeQualifiers3> set, typeQualifiers3 typequalifiers3, boolean z) {
        typeQualifiers3 typequalifiers32 = typeQualifiers3.FORCE_FLEXIBILITY;
        return typequalifiers3 == typequalifiers32 ? typequalifiers32 : (typeQualifiers3) select(set, typeQualifiers3.NOT_NULL, typeQualifiers3.NULLABLE, typequalifiers3, z);
    }

    private static final typeQualifiers3 getNullabilityForErrors(typeQualifiers typequalifiers) {
        if (typequalifiers.isNullabilityQualifierForWarning()) {
            return null;
        }
        return typequalifiers.getNullability();
    }

    public static final typeQualifiers computeQualifiersForOverride(typeQualifiers typequalifiers, Collection<typeQualifiers> superQualifiers, boolean z, boolean z2, boolean z3) {
        typeQualifiers3 typequalifiers3Select;
        Intrinsics.checkNotNullParameter(typequalifiers, "<this>");
        Intrinsics.checkNotNullParameter(superQualifiers, "superQualifiers");
        Collection<typeQualifiers> collection = superQualifiers;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            typeQualifiers3 nullabilityForErrors = getNullabilityForErrors((typeQualifiers) it.next());
            if (nullabilityForErrors != null) {
                arrayList.add(nullabilityForErrors);
            }
        }
        typeQualifiers3 typequalifiers3Select2 = select(CollectionsKt.toSet(arrayList), getNullabilityForErrors(typequalifiers), z);
        if (typequalifiers3Select2 == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                typeQualifiers3 nullability = ((typeQualifiers) it2.next()).getNullability();
                if (nullability != null) {
                    arrayList2.add(nullability);
                }
            }
            typequalifiers3Select = select(CollectionsKt.toSet(arrayList2), typequalifiers.getNullability(), z);
        } else {
            typequalifiers3Select = typequalifiers3Select2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it3 = collection.iterator();
        while (it3.hasNext()) {
            typeQualifiers2 mutability = ((typeQualifiers) it3.next()).getMutability();
            if (mutability != null) {
                arrayList3.add(mutability);
            }
        }
        typeQualifiers2 typequalifiers2 = (typeQualifiers2) select(CollectionsKt.toSet(arrayList3), typeQualifiers2.MUTABLE, typeQualifiers2.READ_ONLY, typequalifiers.getMutability(), z);
        if (typequalifiers3Select == null || z3 || (z2 && typequalifiers3Select == typeQualifiers3.NULLABLE)) {
            typequalifiers3Select = null;
        }
        boolean z4 = false;
        boolean z5 = typequalifiers3Select != null && typequalifiers3Select2 == null;
        if (typequalifiers3Select == typeQualifiers3.NOT_NULL) {
            if (isDefinitelyNotNullAndSameSeverity(typequalifiers, z5)) {
                z4 = true;
                break;
            }
            if (!collection.isEmpty()) {
                Iterator<T> it4 = collection.iterator();
                while (it4.hasNext()) {
                    if (isDefinitelyNotNullAndSameSeverity((typeQualifiers) it4.next(), z5)) {
                        z4 = true;
                        break;
                    }
                }
            }
        }
        return new typeQualifiers(typequalifiers3Select, typequalifiers2, z4, z5);
    }

    private static final boolean isDefinitelyNotNullAndSameSeverity(typeQualifiers typequalifiers, boolean z) {
        return typequalifiers.isNullabilityQualifierForWarning() == z && typequalifiers.getDefinitelyNotNull();
    }

    public static final boolean hasEnhancedNullability(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker type2) {
        Intrinsics.checkNotNullParameter(typeSystemCommonBackendContext, "<this>");
        Intrinsics.checkNotNullParameter(type2, "type");
        FqName ENHANCED_NULLABILITY_ANNOTATION = JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION;
        Intrinsics.checkNotNullExpressionValue(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return typeSystemCommonBackendContext.hasAnnotation(type2, ENHANCED_NULLABILITY_ANNOTATION);
    }
}
