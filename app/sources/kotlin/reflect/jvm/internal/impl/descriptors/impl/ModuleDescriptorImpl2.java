package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import java.util.Set;

/* compiled from: ModuleDescriptorImpl.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies, reason: use source file name */
/* loaded from: classes21.dex */
public interface ModuleDescriptorImpl2 {
    List<ModuleDescriptorImpl> getAllDependencies();

    List<ModuleDescriptorImpl> getDirectExpectedByDependencies();

    Set<ModuleDescriptorImpl> getModulesWhoseInternalsAreVisible();
}
