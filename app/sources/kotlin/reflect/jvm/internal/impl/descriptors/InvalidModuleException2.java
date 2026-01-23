package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvalidModuleException.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleExceptionKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class InvalidModuleException2 {
    private static final ModuleCapability<InvalidModuleException3> INVALID_MODULE_NOTIFIER_CAPABILITY = new ModuleCapability<>("InvalidModuleNotifier");

    public static final void moduleInvalidated(ModuleDescriptor moduleDescriptor) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        InvalidModuleException3 invalidModuleException3 = (InvalidModuleException3) moduleDescriptor.getCapability(INVALID_MODULE_NOTIFIER_CAPABILITY);
        if (invalidModuleException3 != null) {
            invalidModuleException3.notifyModuleInvalidated(moduleDescriptor);
            return;
        }
        throw new InvalidModuleException("Accessing invalid module descriptor " + moduleDescriptor);
    }
}
