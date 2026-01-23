package kotlin.reflect;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TypesJVM.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: kotlin.reflect.TypesJVMKt$typeToString$unwrap$1, reason: use source file name */
/* loaded from: classes14.dex */
/* synthetic */ class TypesJVM6 extends FunctionReferenceImpl implements Function1<Class<?>, Class<?>> {
    public static final TypesJVM6 INSTANCE = new TypesJVM6();

    TypesJVM6() {
        super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Class<?> invoke(Class<?> p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.getComponentType();
    }
}
