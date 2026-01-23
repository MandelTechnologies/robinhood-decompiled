package com.robinhood.android.trade.equity.p261ui.dollar;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EquityDollarOrderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$setState$2$1, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class EquityDollarOrderFragment6 extends FunctionReferenceImpl implements Function0<Unit> {
    EquityDollarOrderFragment6(Object obj) {
        super(0, obj, EquityDollarOrderDuxo.class, "dismissTradingSessionChangeAlert", "dismissTradingSessionChangeAlert()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((EquityDollarOrderDuxo) this.receiver).dismissTradingSessionChangeAlert();
    }
}
