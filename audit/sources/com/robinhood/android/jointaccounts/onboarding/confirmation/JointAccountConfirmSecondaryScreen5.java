package com.robinhood.android.jointaccounts.onboarding.confirmation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: JointAccountConfirmSecondaryScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryScreenKt$ConfirmSecondaryLoadedScreen$1$2$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class JointAccountConfirmSecondaryScreen5 extends FunctionReferenceImpl implements Function0<Unit> {
    JointAccountConfirmSecondaryScreen5(Object obj) {
        super(0, obj, JointAccountConfirmSecondaryScreen.class, "onRejectClicked", "onRejectClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((JointAccountConfirmSecondaryScreen) this.receiver).onRejectClicked();
    }
}
