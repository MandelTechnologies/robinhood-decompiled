package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.annotationArguments6;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaLiteralAnnotationArgument, reason: use source file name */
/* loaded from: classes14.dex */
public final class ReflectJavaAnnotationArguments6 extends ReflectJavaAnnotationArguments implements annotationArguments6 {
    private final Object value;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.annotationArguments6
    public Object getValue() {
        return this.value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectJavaAnnotationArguments6(Name name, Object value) {
        super(name, null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }
}
