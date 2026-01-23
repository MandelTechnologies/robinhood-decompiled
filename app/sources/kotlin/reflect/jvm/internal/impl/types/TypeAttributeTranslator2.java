package kotlin.reflect.jvm.internal.impl.types;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* compiled from: TypeAttributeTranslator.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator, reason: use source file name */
/* loaded from: classes23.dex */
public final class TypeAttributeTranslator2 implements TypeAttributeTranslator {
    public static final TypeAttributeTranslator2 INSTANCE = new TypeAttributeTranslator2();

    private TypeAttributeTranslator2() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator
    public TypeAttributes toAttributes(Annotations annotations, TypeConstructor typeConstructor, DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (annotations.isEmpty()) {
            return TypeAttributes.Companion.getEmpty();
        }
        return TypeAttributes.Companion.create(CollectionsKt.listOf(new AnnotationsTypeAttribute(annotations)));
    }
}
