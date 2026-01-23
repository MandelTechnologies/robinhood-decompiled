package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReflectJavaClass.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$methods$2, reason: use source file name */
/* loaded from: classes14.dex */
/* synthetic */ class ReflectJavaClass7 extends FunctionReferenceImpl implements Function1<Method, ReflectJavaMethod> {
    public static final ReflectJavaClass7 INSTANCE = new ReflectJavaClass7();

    ReflectJavaClass7() {
        super(1, ReflectJavaMethod.class, "<init>", "<init>(Ljava/lang/reflect/Method;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ReflectJavaMethod invoke(Method p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new ReflectJavaMethod(p0);
    }
}
