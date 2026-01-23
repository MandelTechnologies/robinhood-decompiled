package com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit;

import android.view.KeyEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UkQueuedDepositFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositFragment$ComposeContent$2$1, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class UkQueuedDepositFragment3 extends FunctionReferenceImpl implements Function1<KeyEvent, Unit> {
    UkQueuedDepositFragment3(Object obj) {
        super(1, obj, UkQueuedDepositDuxo.class, "handleNumpadKeyPress", "handleNumpadKeyPress(Landroid/view/KeyEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(KeyEvent keyEvent) {
        invoke2(keyEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(KeyEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((UkQueuedDepositDuxo) this.receiver).handleNumpadKeyPress(p0);
    }
}
