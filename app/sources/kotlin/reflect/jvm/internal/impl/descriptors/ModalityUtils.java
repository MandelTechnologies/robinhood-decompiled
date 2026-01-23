package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModalityUtils.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.ModalityUtilsKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ModalityUtils {
    public static final boolean isFinalClass(ClassDescriptor classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "<this>");
        return classDescriptor.getModality() == Modality.FINAL && classDescriptor.getKind() != ClassKind.ENUM_CLASS;
    }
}
