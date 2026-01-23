package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.findClassInModule;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;

/* compiled from: StdlibClassFinder.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.CliStdlibClassFinderImpl, reason: use source file name */
/* loaded from: classes14.dex */
final class StdlibClassFinder2 implements StdlibClassFinder {
    public static final StdlibClassFinder2 INSTANCE = new StdlibClassFinder2();

    private StdlibClassFinder2() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.StdlibClassFinder
    public ClassDescriptor findEnumEntriesClass(ModuleDescriptor moduleDescriptor) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        return findClassInModule.findClassAcrossModuleDependencies(moduleDescriptor, StandardClassIds.INSTANCE.getEnumEntries());
    }
}
