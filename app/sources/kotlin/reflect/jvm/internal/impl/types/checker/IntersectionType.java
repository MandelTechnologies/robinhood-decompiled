package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.KotlinType2;
import kotlin.reflect.jvm.internal.impl.types.KotlinType3;
import kotlin.reflect.jvm.internal.impl.types.KotlinType4;
import kotlin.reflect.jvm.internal.impl.types.KotlinType5;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.dynamicTypes2;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.flexibleTypes2;

/* compiled from: IntersectionType.kt */
@SourceDebugExtension
/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.IntersectionTypeKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class IntersectionType {
    public static final KotlinType5 intersectTypes(Collection<? extends KotlinType5> types) {
        KotlinType4 lowerBound;
        Intrinsics.checkNotNullParameter(types, "types");
        int size = types.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (KotlinType5) CollectionsKt.single(types);
        }
        Collection<? extends KotlinType5> collection = types;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        boolean z = false;
        boolean z2 = false;
        for (KotlinType5 kotlinType5 : collection) {
            z = z || KotlinType3.isError(kotlinType5);
            if (kotlinType5 instanceof KotlinType4) {
                lowerBound = (KotlinType4) kotlinType5;
            } else {
                if (!(kotlinType5 instanceof KotlinType2)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (dynamicTypes2.isDynamic(kotlinType5)) {
                    return kotlinType5;
                }
                lowerBound = ((KotlinType2) kotlinType5).getLowerBound();
                z2 = true;
            }
            arrayList.add(lowerBound);
        }
        if (z) {
            return ErrorUtils.createErrorType(ErrorTypeKind.INTERSECTION_OF_ERROR_TYPES, types.toString());
        }
        if (!z2) {
            return IntersectionType2.INSTANCE.intersectTypes$descriptors(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(flexibleTypes2.upperIfFlexible((KotlinType5) it.next()));
        }
        IntersectionType2 intersectionType2 = IntersectionType2.INSTANCE;
        return KotlinTypeFactory.flexibleType(intersectionType2.intersectTypes$descriptors(arrayList), intersectionType2.intersectTypes$descriptors(arrayList2));
    }
}
