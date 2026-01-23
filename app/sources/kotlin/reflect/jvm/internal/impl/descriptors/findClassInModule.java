package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation3;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ResolutionAnchorProvider2;
import kotlin.sequences.SequencesKt;

/* compiled from: findClassInModule.kt */
@SourceDebugExtension
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class findClassInModule {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int findNonGenericClassAcrossDependencies$lambda$1(ClassId it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return 0;
    }

    public static final ClassDescriptor findClassAcrossModuleDependencies(ModuleDescriptor moduleDescriptor, ClassId classId) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ClassifierDescriptor classifierDescriptorFindClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (classifierDescriptorFindClassifierAcrossModuleDependencies instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorFindClassifierAcrossModuleDependencies;
        }
        return null;
    }

    public static final ClassDescriptor findNonGenericClassAcrossDependencies(ModuleDescriptor moduleDescriptor, ClassId classId, NotFoundClasses notFoundClasses) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = findClassAcrossModuleDependencies(moduleDescriptor, classId);
        return classDescriptorFindClassAcrossModuleDependencies != null ? classDescriptorFindClassAcrossModuleDependencies : notFoundClasses.getClass(classId, SequencesKt.toList(SequencesKt.map(SequencesKt.generateSequence(classId, new PropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((ClassId) obj).getOuterClassId();
            }
        }), new Function1() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$$Lambda$0
            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return Integer.valueOf(findClassInModule.findNonGenericClassAcrossDependencies$lambda$1((ClassId) obj));
            }
        })));
    }

    public static final TypeAliasDescriptor findTypeAliasAcrossModuleDependencies(ModuleDescriptor moduleDescriptor, ClassId classId) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ClassifierDescriptor classifierDescriptorFindClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (classifierDescriptorFindClassifierAcrossModuleDependencies instanceof TypeAliasDescriptor) {
            return (TypeAliasDescriptor) classifierDescriptorFindClassifierAcrossModuleDependencies;
        }
        return null;
    }

    public static final ClassifierDescriptor findClassifierAcrossModuleDependencies(ModuleDescriptor moduleDescriptor, ClassId classId) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ModuleDescriptor resolutionAnchorIfAny = ResolutionAnchorProvider2.getResolutionAnchorIfAny(moduleDescriptor);
        if (resolutionAnchorIfAny == null) {
            PackageViewDescriptor packageViewDescriptor = moduleDescriptor.getPackage(classId.getPackageFqName());
            List<Name> listPathSegments = classId.getRelativeClassName().pathSegments();
            ClassifierDescriptor classifierDescriptorMo28706getContributedClassifier = packageViewDescriptor.getMemberScope().mo28706getContributedClassifier((Name) CollectionsKt.first((List) listPathSegments), LookupLocation3.FROM_DESERIALIZATION);
            if (classifierDescriptorMo28706getContributedClassifier == null) {
                return null;
            }
            for (Name name : listPathSegments.subList(1, listPathSegments.size())) {
                if (!(classifierDescriptorMo28706getContributedClassifier instanceof ClassDescriptor)) {
                    return null;
                }
                ClassifierDescriptor classifierDescriptorMo28706getContributedClassifier2 = ((ClassDescriptor) classifierDescriptorMo28706getContributedClassifier).getUnsubstitutedInnerClassesScope().mo28706getContributedClassifier(name, LookupLocation3.FROM_DESERIALIZATION);
                classifierDescriptorMo28706getContributedClassifier = classifierDescriptorMo28706getContributedClassifier2 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo28706getContributedClassifier2 : null;
                if (classifierDescriptorMo28706getContributedClassifier == null) {
                    return null;
                }
            }
            return classifierDescriptorMo28706getContributedClassifier;
        }
        PackageViewDescriptor packageViewDescriptor2 = resolutionAnchorIfAny.getPackage(classId.getPackageFqName());
        List<Name> listPathSegments2 = classId.getRelativeClassName().pathSegments();
        ClassifierDescriptor classifierDescriptorMo28706getContributedClassifier3 = packageViewDescriptor2.getMemberScope().mo28706getContributedClassifier((Name) CollectionsKt.first((List) listPathSegments2), LookupLocation3.FROM_DESERIALIZATION);
        if (classifierDescriptorMo28706getContributedClassifier3 == null) {
            classifierDescriptorMo28706getContributedClassifier3 = null;
            break;
        }
        for (Name name2 : listPathSegments2.subList(1, listPathSegments2.size())) {
            if (classifierDescriptorMo28706getContributedClassifier3 instanceof ClassDescriptor) {
                ClassifierDescriptor classifierDescriptorMo28706getContributedClassifier4 = ((ClassDescriptor) classifierDescriptorMo28706getContributedClassifier3).getUnsubstitutedInnerClassesScope().mo28706getContributedClassifier(name2, LookupLocation3.FROM_DESERIALIZATION);
                classifierDescriptorMo28706getContributedClassifier3 = classifierDescriptorMo28706getContributedClassifier4 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo28706getContributedClassifier4 : null;
                if (classifierDescriptorMo28706getContributedClassifier3 != null) {
                }
            }
            classifierDescriptorMo28706getContributedClassifier3 = null;
        }
        if (classifierDescriptorMo28706getContributedClassifier3 != null) {
            return classifierDescriptorMo28706getContributedClassifier3;
        }
        PackageViewDescriptor packageViewDescriptor3 = moduleDescriptor.getPackage(classId.getPackageFqName());
        List<Name> listPathSegments3 = classId.getRelativeClassName().pathSegments();
        ClassifierDescriptor classifierDescriptorMo28706getContributedClassifier5 = packageViewDescriptor3.getMemberScope().mo28706getContributedClassifier((Name) CollectionsKt.first((List) listPathSegments3), LookupLocation3.FROM_DESERIALIZATION);
        if (classifierDescriptorMo28706getContributedClassifier5 == null) {
            return null;
        }
        for (Name name3 : listPathSegments3.subList(1, listPathSegments3.size())) {
            if (!(classifierDescriptorMo28706getContributedClassifier5 instanceof ClassDescriptor)) {
                return null;
            }
            ClassifierDescriptor classifierDescriptorMo28706getContributedClassifier6 = ((ClassDescriptor) classifierDescriptorMo28706getContributedClassifier5).getUnsubstitutedInnerClassesScope().mo28706getContributedClassifier(name3, LookupLocation3.FROM_DESERIALIZATION);
            classifierDescriptorMo28706getContributedClassifier5 = classifierDescriptorMo28706getContributedClassifier6 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo28706getContributedClassifier6 : null;
            if (classifierDescriptorMo28706getContributedClassifier5 == null) {
                return null;
            }
        }
        return classifierDescriptorMo28706getContributedClassifier5;
    }
}
