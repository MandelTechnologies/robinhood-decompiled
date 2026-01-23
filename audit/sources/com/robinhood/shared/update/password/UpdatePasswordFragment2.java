package com.robinhood.shared.update.password;

import com.robinhood.shared.update.password.UpdatePasswordFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: UpdatePasswordFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.update.password.UpdatePasswordFragment$ComposeContent$1$1$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class UpdatePasswordFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    UpdatePasswordFragment2(Object obj) {
        super(0, obj, UpdatePasswordFragment.Callbacks.class, "onForgotPassword", "onForgotPassword()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((UpdatePasswordFragment.Callbacks) this.receiver).onForgotPassword();
    }
}
