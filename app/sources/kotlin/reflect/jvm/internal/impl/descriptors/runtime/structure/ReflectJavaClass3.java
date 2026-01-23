package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Member;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReflectJavaClass.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$constructors$1, reason: use source file name */
/* loaded from: classes14.dex */
/* synthetic */ class ReflectJavaClass3 extends FunctionReferenceImpl implements Function1<Member, Boolean> {
    public static final ReflectJavaClass3 INSTANCE = new ReflectJavaClass3();

    ReflectJavaClass3() {
        super(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Member p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(p0.isSynthetic());
    }
}
