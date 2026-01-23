package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.types.KotlinType4;

/* compiled from: TypeAliasDescriptor.kt */
/* loaded from: classes21.dex */
public interface TypeAliasDescriptor extends ClassifierDescriptorWithTypeParameters {
    ClassDescriptor getClassDescriptor();

    KotlinType4 getExpandedType();

    KotlinType4 getUnderlyingType();
}
