package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Constructor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReflectJavaClass.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$constructors$2, reason: use source file name */
/* loaded from: classes14.dex */
/* synthetic */ class ReflectJavaClass4 extends FunctionReferenceImpl implements Function1<Constructor<?>, ReflectJavaConstructor> {
    public static final ReflectJavaClass4 INSTANCE = new ReflectJavaClass4();

    ReflectJavaClass4() {
        super(1, ReflectJavaConstructor.class, "<init>", "<init>(Ljava/lang/reflect/Constructor;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ReflectJavaConstructor invoke(Constructor<?> p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new ReflectJavaConstructor(p0);
    }
}
