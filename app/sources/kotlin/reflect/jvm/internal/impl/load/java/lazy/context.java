package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner;

/* compiled from: context.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class context {
    public static final context4 child(context4 context4Var, resolvers2 typeParameterResolver) {
        Intrinsics.checkNotNullParameter(context4Var, "<this>");
        Intrinsics.checkNotNullParameter(typeParameterResolver, "typeParameterResolver");
        return new context4(context4Var.getComponents(), typeParameterResolver, context4Var.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    public static final JavaTypeQualifiersByElementType computeNewDefaultTypeQualifiers(context4 context4Var, Annotations additionalAnnotations) {
        Intrinsics.checkNotNullParameter(context4Var, "<this>");
        Intrinsics.checkNotNullParameter(additionalAnnotations, "additionalAnnotations");
        return context4Var.getComponents().getAnnotationTypeQualifierResolver().extractAndMergeDefaultQualifiers(context4Var.getDefaultTypeQualifiers(), additionalAnnotations);
    }

    public static final context4 replaceComponents(context4 context4Var, context2 components) {
        Intrinsics.checkNotNullParameter(context4Var, "<this>");
        Intrinsics.checkNotNullParameter(components, "components");
        return new context4(components, context4Var.getTypeParameterResolver(), context4Var.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    private static final context4 child(context4 context4Var, DeclarationDescriptor declarationDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i, Lazy<JavaTypeQualifiersByElementType> lazy) {
        resolvers2 typeParameterResolver;
        context2 components = context4Var.getComponents();
        if (javaTypeParameterListOwner != null) {
            typeParameterResolver = new resolvers(context4Var, declarationDescriptor, javaTypeParameterListOwner, i);
        } else {
            typeParameterResolver = context4Var.getTypeParameterResolver();
        }
        return new context4(components, typeParameterResolver, lazy);
    }

    public static /* synthetic */ context4 childForMethod$default(context4 context4Var, DeclarationDescriptor declarationDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return childForMethod(context4Var, declarationDescriptor, javaTypeParameterListOwner, i);
    }

    public static final context4 childForMethod(context4 context4Var, DeclarationDescriptor containingDeclaration, JavaTypeParameterListOwner typeParameterOwner, int i) {
        Intrinsics.checkNotNullParameter(context4Var, "<this>");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(typeParameterOwner, "typeParameterOwner");
        return child(context4Var, containingDeclaration, typeParameterOwner, i, context4Var.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    public static /* synthetic */ context4 childForClassOrPackage$default(context4 context4Var, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            javaTypeParameterListOwner = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return childForClassOrPackage(context4Var, classOrPackageFragmentDescriptor, javaTypeParameterListOwner, i);
    }

    public static final context4 childForClassOrPackage(final context4 context4Var, final ClassOrPackageFragmentDescriptor containingDeclaration, JavaTypeParameterListOwner javaTypeParameterListOwner, int i) {
        Intrinsics.checkNotNullParameter(context4Var, "<this>");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        return child(context4Var, containingDeclaration, javaTypeParameterListOwner, i, LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0(context4Var, containingDeclaration) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt$$Lambda$0
            private final context4 arg$0;
            private final ClassOrPackageFragmentDescriptor arg$1;

            {
                this.arg$0 = context4Var;
                this.arg$1 = containingDeclaration;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return context.childForClassOrPackage$lambda$1(this.arg$0, this.arg$1);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JavaTypeQualifiersByElementType childForClassOrPackage$lambda$1(context4 context4Var, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor) {
        return computeNewDefaultTypeQualifiers(context4Var, classOrPackageFragmentDescriptor.getAnnotations());
    }

    public static final context4 copyWithNewDefaultTypeQualifiers(final context4 context4Var, final Annotations additionalAnnotations) {
        Intrinsics.checkNotNullParameter(context4Var, "<this>");
        Intrinsics.checkNotNullParameter(additionalAnnotations, "additionalAnnotations");
        return additionalAnnotations.isEmpty() ? context4Var : new context4(context4Var.getComponents(), context4Var.getTypeParameterResolver(), LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0(context4Var, additionalAnnotations) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt$$Lambda$1
            private final context4 arg$0;
            private final Annotations arg$1;

            {
                this.arg$0 = context4Var;
                this.arg$1 = additionalAnnotations;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return context.computeNewDefaultTypeQualifiers(this.arg$0, this.arg$1);
            }
        }));
    }
}
