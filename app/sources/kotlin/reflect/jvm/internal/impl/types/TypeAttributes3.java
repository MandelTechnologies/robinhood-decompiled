package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;

/* compiled from: TypeAttributes.kt */
@SourceDebugExtension
/* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class TypeAttributes3 {
    public static final TypeAttributes toDefaultAttributes(Annotations annotations) {
        Intrinsics.checkNotNullParameter(annotations, "<this>");
        return TypeAttributeTranslator.DefaultImpls.toAttributes$default(TypeAttributeTranslator2.INSTANCE, annotations, null, null, 6, null);
    }

    public static final TypeAttributes replaceAnnotations(TypeAttributes typeAttributes, Annotations newAnnotations) {
        TypeAttributes typeAttributesRemove;
        Intrinsics.checkNotNullParameter(typeAttributes, "<this>");
        Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
        if (AnnotationsTypeAttribute2.getAnnotations(typeAttributes) == newAnnotations) {
            return typeAttributes;
        }
        AnnotationsTypeAttribute annotationsAttribute = AnnotationsTypeAttribute2.getAnnotationsAttribute(typeAttributes);
        if (annotationsAttribute != null && (typeAttributesRemove = typeAttributes.remove(annotationsAttribute)) != null) {
            typeAttributes = typeAttributesRemove;
        }
        return (newAnnotations.iterator().hasNext() || !newAnnotations.isEmpty()) ? typeAttributes.plus(new AnnotationsTypeAttribute(newAnnotations)) : typeAttributes;
    }
}
