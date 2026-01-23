package com.robinhood.android.directdeposit.p101ui.p102v3;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DirectDepositV3ManualSetupFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directdeposit.ui.v3.DirectDepositV3ManualSetupFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes27.dex */
/* synthetic */ class DirectDepositV3ManualSetupFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    DirectDepositV3ManualSetupFragment2(Object obj) {
        super(0, obj, DirectDepositV3ManualSetupDuxo.class, "emailDirectDepositInformation", "emailDirectDepositInformation()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((DirectDepositV3ManualSetupDuxo) this.receiver).emailDirectDepositInformation();
    }
}
