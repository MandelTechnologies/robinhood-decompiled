package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* compiled from: AnnotationsTypeAttribute.kt */
@SourceDebugExtension
/* renamed from: kotlin.reflect.jvm.internal.impl.types.AnnotationsTypeAttributeKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class AnnotationsTypeAttribute2 {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AnnotationsTypeAttribute2.class, "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;", 1))};
    private static final Interfaces2 annotationsAttribute$delegate;

    static {
        Interfaces2 interfaces2GenerateNullableAccessor = TypeAttributes.Companion.generateNullableAccessor(Reflection.getOrCreateKotlinClass(AnnotationsTypeAttribute.class));
        Intrinsics.checkNotNull(interfaces2GenerateNullableAccessor, "null cannot be cast to non-null type kotlin.properties.ReadOnlyProperty<org.jetbrains.kotlin.types.TypeAttributes, T of org.jetbrains.kotlin.types.TypeAttributes.Companion.attributeAccessor?>");
        annotationsAttribute$delegate = interfaces2GenerateNullableAccessor;
    }

    public static final AnnotationsTypeAttribute getAnnotationsAttribute(TypeAttributes typeAttributes) {
        Intrinsics.checkNotNullParameter(typeAttributes, "<this>");
        return (AnnotationsTypeAttribute) annotationsAttribute$delegate.getValue(typeAttributes, $$delegatedProperties[0]);
    }

    public static final Annotations getAnnotations(TypeAttributes typeAttributes) {
        Annotations annotations;
        Intrinsics.checkNotNullParameter(typeAttributes, "<this>");
        AnnotationsTypeAttribute annotationsAttribute = getAnnotationsAttribute(typeAttributes);
        return (annotationsAttribute == null || (annotations = annotationsAttribute.getAnnotations()) == null) ? Annotations.Companion.getEMPTY() : annotations;
    }
}
