package com.robinhood.shared.update.password;

import com.robinhood.shared.update.password.UpdatePasswordSuccessFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: UpdatePasswordSuccessFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.update.password.UpdatePasswordSuccessFragment$ComposeContent$1$1$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class UpdatePasswordSuccessFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    UpdatePasswordSuccessFragment2(Object obj) {
        super(0, obj, UpdatePasswordSuccessFragment.Callbacks.class, "onUpdatePasswordComplete", "onUpdatePasswordComplete()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((UpdatePasswordSuccessFragment.Callbacks) this.receiver).onUpdatePasswordComplete();
    }
}
