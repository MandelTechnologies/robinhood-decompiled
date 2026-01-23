package com.robinhood.android.futures.history.p142ui.settlement;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FuturesCashSettlementDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.history.ui.settlement.FuturesCashSettlementDetailFragmentKt$FuturesCashSettlementContent$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class FuturesCashSettlementDetailFragment3 extends FunctionReferenceImpl implements Function0<Unit> {
    FuturesCashSettlementDetailFragment3(Object obj) {
        super(0, obj, FuturesCashSettlementDetailScreenCallbacks.class, "onBack", "onBack()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((FuturesCashSettlementDetailScreenCallbacks) this.receiver).onBack();
    }
}
