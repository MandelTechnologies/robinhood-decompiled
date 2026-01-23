package com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: UkQueuedDepositFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class UkQueuedDepositFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    UkQueuedDepositFragment2(Object obj) {
        super(0, obj, UkQueuedDepositDuxo.class, "toggleCurrency", "toggleCurrency()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((UkQueuedDepositDuxo) this.receiver).toggleCurrency();
    }
}
