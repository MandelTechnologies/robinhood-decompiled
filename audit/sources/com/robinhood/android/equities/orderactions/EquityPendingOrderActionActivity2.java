package com.robinhood.android.equities.orderactions;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EquityPendingOrderActionActivity.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.orderactions.EquityPendingOrderActionActivity$CancelFailedDialog$1$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class EquityPendingOrderActionActivity2 extends FunctionReferenceImpl implements Function0<Unit> {
    EquityPendingOrderActionActivity2(Object obj) {
        super(0, obj, EquityPendingOrderActionActivity.class, "finish", "finish()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((EquityPendingOrderActionActivity) this.receiver).finish();
    }
}
