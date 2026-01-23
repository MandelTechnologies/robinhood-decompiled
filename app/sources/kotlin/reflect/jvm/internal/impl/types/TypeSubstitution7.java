package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.FilteredAnnotations;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;

/* compiled from: TypeSubstitution.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class TypeSubstitution7 {
    @JvmOverloads
    public static final KotlinType replace(KotlinType kotlinType, List<? extends TypeProjection> newArguments, Annotations newAnnotations) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        Intrinsics.checkNotNullParameter(newArguments, "newArguments");
        Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
        return replace$default(kotlinType, newArguments, newAnnotations, null, 4, null);
    }

    public static /* synthetic */ KotlinType replace$default(KotlinType kotlinType, List list, Annotations annotations, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = kotlinType.getArguments();
        }
        if ((i & 2) != 0) {
            annotations = kotlinType.getAnnotations();
        }
        if ((i & 4) != 0) {
            list2 = list;
        }
        return replace(kotlinType, list, annotations, list2);
    }

    @JvmOverloads
    public static final KotlinType replace(KotlinType kotlinType, List<? extends TypeProjection> newArguments, Annotations newAnnotations, List<? extends TypeProjection> newArgumentsForUpperBound) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        Intrinsics.checkNotNullParameter(newArguments, "newArguments");
        Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
        Intrinsics.checkNotNullParameter(newArgumentsForUpperBound, "newArgumentsForUpperBound");
        if ((newArguments.isEmpty() || newArguments == kotlinType.getArguments()) && newAnnotations == kotlinType.getAnnotations()) {
            return kotlinType;
        }
        TypeAttributes attributes = kotlinType.getAttributes();
        if ((newAnnotations instanceof FilteredAnnotations) && ((FilteredAnnotations) newAnnotations).isEmpty()) {
            newAnnotations = Annotations.Companion.getEMPTY();
        }
        TypeAttributes typeAttributesReplaceAnnotations = TypeAttributes3.replaceAnnotations(attributes, newAnnotations);
        KotlinType5 kotlinType5Unwrap = kotlinType.unwrap();
        if (kotlinType5Unwrap instanceof KotlinType2) {
            KotlinType2 kotlinType2 = (KotlinType2) kotlinType5Unwrap;
            return KotlinTypeFactory.flexibleType(replace(kotlinType2.getLowerBound(), newArguments, typeAttributesReplaceAnnotations), replace(kotlinType2.getUpperBound(), newArgumentsForUpperBound, typeAttributesReplaceAnnotations));
        }
        if (kotlinType5Unwrap instanceof KotlinType4) {
            return replace((KotlinType4) kotlinType5Unwrap, newArguments, typeAttributesReplaceAnnotations);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ KotlinType4 replace$default(KotlinType4 kotlinType4, List list, TypeAttributes typeAttributes, int i, Object obj) {
        if ((i & 1) != 0) {
            list = kotlinType4.getArguments();
        }
        if ((i & 2) != 0) {
            typeAttributes = kotlinType4.getAttributes();
        }
        return replace(kotlinType4, (List<? extends TypeProjection>) list, typeAttributes);
    }

    @JvmOverloads
    public static final KotlinType4 replace(KotlinType4 kotlinType4, List<? extends TypeProjection> newArguments, TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(kotlinType4, "<this>");
        Intrinsics.checkNotNullParameter(newArguments, "newArguments");
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        if (newArguments.isEmpty() && newAttributes == kotlinType4.getAttributes()) {
            return kotlinType4;
        }
        if (newArguments.isEmpty()) {
            return kotlinType4.replaceAttributes(newAttributes);
        }
        if (kotlinType4 instanceof ErrorType) {
            return ((ErrorType) kotlinType4).replaceArguments(newArguments);
        }
        return KotlinTypeFactory.simpleType$default(newAttributes, kotlinType4.getConstructor(), newArguments, kotlinType4.isMarkedNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
    }

    public static final KotlinType4 asSimpleType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        KotlinType5 kotlinType5Unwrap = kotlinType.unwrap();
        KotlinType4 kotlinType4 = kotlinType5Unwrap instanceof KotlinType4 ? (KotlinType4) kotlinType5Unwrap : null;
        if (kotlinType4 != null) {
            return kotlinType4;
        }
        throw new IllegalStateException(("This is should be simple type: " + kotlinType).toString());
    }
}
