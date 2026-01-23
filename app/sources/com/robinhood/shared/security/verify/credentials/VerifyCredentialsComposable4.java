package com.robinhood.shared.security.verify.credentials;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VerifyCredentialsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposableKt$VerifyCredentialsComposable$3$3$1, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class VerifyCredentialsComposable4 extends FunctionReferenceImpl implements Function1<String, Unit> {
    VerifyCredentialsComposable4(Object obj) {
        super(1, obj, VerifyCredentialsDuxo.class, "onUpdateEmailSuccess", "onUpdateEmailSuccess(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((VerifyCredentialsDuxo) this.receiver).onUpdateEmailSuccess(p0);
    }
}
