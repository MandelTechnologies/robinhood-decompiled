package com.robinhood.android.jointaccounts.onboarding.confirmation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: JointAccountConfirmSecondaryScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryScreenKt$ConfirmSecondaryScreen$1$1$1$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class JointAccountConfirmSecondaryScreen6 extends FunctionReferenceImpl implements Function0<Unit> {
    JointAccountConfirmSecondaryScreen6(Object obj) {
        super(0, obj, JointAccountConfirmSecondaryScreen.class, "onRetryClicked", "onRetryClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((JointAccountConfirmSecondaryScreen) this.receiver).onRetryClicked();
    }
}
