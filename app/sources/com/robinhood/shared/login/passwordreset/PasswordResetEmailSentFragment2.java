package com.robinhood.shared.login.passwordreset;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PasswordResetEmailSentFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentFragment$ComposeContent$1$1$1, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class PasswordResetEmailSentFragment2 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    PasswordResetEmailSentFragment2(Object obj) {
        super(1, obj, PasswordResetEmailSentFragment.class, "showBottomSheet", "showBottomSheet(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((PasswordResetEmailSentFragment) this.receiver).showBottomSheet(z);
    }
}
