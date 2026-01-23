package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;

/* compiled from: methodSignatureBuildingUtils.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class methodSignatureBuildingUtils {
    public static final String signature(SignatureBuildingComponents signatureBuildingComponents, ClassDescriptor classDescriptor, String jvmDescriptor) {
        Intrinsics.checkNotNullParameter(signatureBuildingComponents, "<this>");
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        Intrinsics.checkNotNullParameter(jvmDescriptor, "jvmDescriptor");
        return signatureBuildingComponents.signature(methodSignatureMapping3.getInternalName(classDescriptor), jvmDescriptor);
    }
}
