package com.robinhood.shared.update.password.reset;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CheckEmailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.update.password.reset.CheckEmailFragment$ComposeContent$3$1$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class CheckEmailFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    CheckEmailFragment2(Object obj) {
        super(0, obj, CheckEmailDuxo.class, "resendEmail", "resendEmail()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((CheckEmailDuxo) this.receiver).resendEmail();
    }
}
