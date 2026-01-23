package com.robinhood.shared.update.password;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdatePasswordFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.update.password.UpdatePasswordFragment$ComposeContent$1$2$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class UpdatePasswordFragment3 extends FunctionReferenceImpl implements Function3<String, String, String, Unit> {
    UpdatePasswordFragment3(Object obj) {
        super(3, obj, UpdatePasswordDuxo.class, "onSubmit", "onSubmit(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, String str3) {
        invoke2(str, str2, str3);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0, String p1, String p2) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        ((UpdatePasswordDuxo) this.receiver).onSubmit(p0, p1, p2);
    }
}
