package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* compiled from: DescriptorRenderer.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions, reason: use source file name */
/* loaded from: classes21.dex */
public interface DescriptorRenderer4 {
    DescriptorRenderer2 getAnnotationArgumentsRenderingPolicy();

    boolean getDebugMode();

    boolean getEnhancedTypes();

    Set<FqName> getExcludedTypeAnnotationClasses();

    void setAnnotationArgumentsRenderingPolicy(DescriptorRenderer2 descriptorRenderer2);

    void setClassifierNamePolicy(ClassifierNamePolicy classifierNamePolicy);

    void setDebugMode(boolean z);

    void setExcludedTypeAnnotationClasses(Set<FqName> set);

    void setModifiers(Set<? extends DescriptorRenderer3> set);

    void setParameterNameRenderingPolicy(DescriptorRenderer7 descriptorRenderer7);

    void setReceiverAfterName(boolean z);

    void setRenderCompanionObjectName(boolean z);

    void setStartFromName(boolean z);

    void setTextFormat(DescriptorRenderer9 descriptorRenderer9);

    void setVerbose(boolean z);

    void setWithDefinedIn(boolean z);

    void setWithoutSuperTypes(boolean z);

    void setWithoutTypeParameters(boolean z);

    /* compiled from: DescriptorRenderer.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions$DefaultImpls */
    /* loaded from: classes14.dex */
    public static final class DefaultImpls {
        public static boolean getIncludeAnnotationArguments(DescriptorRenderer4 descriptorRenderer4) {
            return descriptorRenderer4.getAnnotationArgumentsRenderingPolicy().getIncludeAnnotationArguments();
        }

        public static boolean getIncludeEmptyAnnotationArguments(DescriptorRenderer4 descriptorRenderer4) {
            return descriptorRenderer4.getAnnotationArgumentsRenderingPolicy().getIncludeEmptyAnnotationArguments();
        }
    }
}
