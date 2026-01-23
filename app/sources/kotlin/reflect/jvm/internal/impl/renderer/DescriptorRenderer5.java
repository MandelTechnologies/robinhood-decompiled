package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* compiled from: DescriptorRenderer.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.renderer.ExcludedTypeAnnotations, reason: use source file name */
/* loaded from: classes21.dex */
public final class DescriptorRenderer5 {
    public static final DescriptorRenderer5 INSTANCE = new DescriptorRenderer5();
    private static final Set<FqName> internalAnnotationsForResolve = SetsKt.setOf((Object[]) new FqName[]{new FqName("kotlin.internal.NoInfer"), new FqName("kotlin.internal.Exact")});

    private DescriptorRenderer5() {
    }

    public final Set<FqName> getInternalAnnotationsForResolve() {
        return internalAnnotationsForResolve;
    }
}
