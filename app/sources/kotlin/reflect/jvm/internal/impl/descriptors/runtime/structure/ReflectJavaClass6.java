package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Field;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReflectJavaClass.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$fields$2, reason: use source file name */
/* loaded from: classes14.dex */
/* synthetic */ class ReflectJavaClass6 extends FunctionReferenceImpl implements Function1<Field, ReflectJavaField> {
    public static final ReflectJavaClass6 INSTANCE = new ReflectJavaClass6();

    ReflectJavaClass6() {
        super(1, ReflectJavaField.class, "<init>", "<init>(Ljava/lang/reflect/Field;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ReflectJavaField invoke(Field p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new ReflectJavaField(p0);
    }
}
