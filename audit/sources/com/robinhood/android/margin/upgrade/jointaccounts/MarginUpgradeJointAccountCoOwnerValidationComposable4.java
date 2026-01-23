package com.robinhood.android.margin.upgrade.jointaccounts;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MarginUpgradeJointAccountCoOwnerValidationComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.upgrade.jointaccounts.MarginUpgradeJointAccountCoOwnerValidationComposableKt$JointAccountCoOwnerValidationComposable$2$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class MarginUpgradeJointAccountCoOwnerValidationComposable4 extends FunctionReferenceImpl implements Function0<Unit> {
    MarginUpgradeJointAccountCoOwnerValidationComposable4(Object obj) {
        super(0, obj, MarginUpgradeJointAccountCoOwnerValidationDuxo.class, "onSendEmailToCoOwner", "onSendEmailToCoOwner()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((MarginUpgradeJointAccountCoOwnerValidationDuxo) this.receiver).onSendEmailToCoOwner();
    }
}
