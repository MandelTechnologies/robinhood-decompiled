package com.robinhood.android.jointaccounts.onboarding.outro.created;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: JointAccountCreatedScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.jointaccounts.onboarding.outro.created.JointAccountCreatedScreenKt$JointAccountCreatedScreen$1$1$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class JointAccountCreatedScreen7 extends FunctionReferenceImpl implements Function0<Unit> {
    JointAccountCreatedScreen7(Object obj) {
        super(0, obj, JointAccountCreatedScreen3.class, "onDismiss", "onDismiss()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((JointAccountCreatedScreen3) this.receiver).onDismiss();
    }
}
