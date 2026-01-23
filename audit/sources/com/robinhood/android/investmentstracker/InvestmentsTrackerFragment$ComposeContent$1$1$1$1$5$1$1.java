package com.robinhood.android.investmentstracker;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentsTrackerFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class InvestmentsTrackerFragment$ComposeContent$1$1$1$1$5$1$1 extends FunctionReferenceImpl implements Function2<InvestmentsTrackerNativeAction, Object, Unit> {
    InvestmentsTrackerFragment$ComposeContent$1$1$1$1$5$1$1(Object obj) {
        super(2, obj, InvestmentsTrackerDuxo.class, "handleNativeAction", "handleNativeAction(Lcom/robinhood/android/investmentstracker/InvestmentsTrackerNativeAction;Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InvestmentsTrackerNativeAction investmentsTrackerNativeAction, Object obj) {
        invoke2(investmentsTrackerNativeAction, obj);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InvestmentsTrackerNativeAction p0, Object obj) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((InvestmentsTrackerDuxo) this.receiver).handleNativeAction(p0, obj);
    }
}
