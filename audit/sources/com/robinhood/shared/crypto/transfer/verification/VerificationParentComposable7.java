package com.robinhood.shared.crypto.transfer.verification;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VerificationParentComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt$VerificationParentContent$1$1$1$1$3, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class VerificationParentComposable7 extends FunctionReferenceImpl implements Function2<String, String, Unit> {
    VerificationParentComposable7(Object obj) {
        super(2, obj, VerificationParentContentDuxo.class, "update", "update(Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((VerificationParentContentDuxo) this.receiver).update(p0, p1);
    }
}
