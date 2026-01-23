package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;

/* compiled from: LazyJavaAnnotations.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class LazyJavaAnnotations2 {
    public static final Annotations resolveAnnotations(context4 context4Var, JavaAnnotationOwner annotationsOwner) {
        Intrinsics.checkNotNullParameter(context4Var, "<this>");
        Intrinsics.checkNotNullParameter(annotationsOwner, "annotationsOwner");
        return new LazyJavaAnnotations(context4Var, annotationsOwner, false, 4, null);
    }
}
