package com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit.confirmation;

import com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit.confirmation.UkQueuedDepositConfirmationFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: UkQueuedDepositConfirmationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.confirmation.UkQueuedDepositConfirmationFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class UkQueuedDepositConfirmationFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    UkQueuedDepositConfirmationFragment2(Object obj) {
        super(0, obj, UkQueuedDepositConfirmationFragment.Callbacks.class, "onFlowCompleted", "onFlowCompleted()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((UkQueuedDepositConfirmationFragment.Callbacks) this.receiver).onFlowCompleted();
    }
}
