package com.robinhood.android.transfers.recurring.p270ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AutomaticDepositListFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.recurring.ui.AutomaticDepositListFragment$addAutomaticDepositAdapter$1$1, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class AutomaticDepositListFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    AutomaticDepositListFragment2(Object obj) {
        super(0, obj, AutomaticDepositListFragment.class, "startAchTransferActivityForAutomaticDeposit", "startAchTransferActivityForAutomaticDeposit()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AutomaticDepositListFragment) this.receiver).startAchTransferActivityForAutomaticDeposit();
    }
}
