package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* compiled from: PackageFragmentProvider.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized, reason: use source file name */
/* loaded from: classes21.dex */
public interface PackageFragmentProvider3 extends PackageFragmentProvider {
    void collectPackageFragments(FqName fqName, Collection<PackageFragmentDescriptor> collection);

    boolean isEmpty(FqName fqName);
}
