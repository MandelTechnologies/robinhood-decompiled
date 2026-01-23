package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.annotationArguments4;
import kotlin.reflect.jvm.internal.impl.load.java.structure.javaTypes4;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClassObjectAnnotationArgument, reason: use source file name */
/* loaded from: classes14.dex */
public final class ReflectJavaAnnotationArguments4 extends ReflectJavaAnnotationArguments implements annotationArguments4 {
    private final Class<?> klass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectJavaAnnotationArguments4(Name name, Class<?> klass) {
        super(name, null);
        Intrinsics.checkNotNullParameter(klass, "klass");
        this.klass = klass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.annotationArguments4
    public javaTypes4 getReferencedType() {
        return ReflectJavaType.Factory.create(this.klass);
    }
}
