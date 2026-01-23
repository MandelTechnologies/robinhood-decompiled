package com.robinhood.android.investmentstracker;

import bff_money_movement.service.p019v1.InvestmentsTrackerActionDto;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentsTrackerFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class InvestmentsTrackerFragment$ComposeContent$1$1$3$2$1$1 extends FunctionReferenceImpl implements Function2<InvestmentsTrackerActionDto, Object, Unit> {
    InvestmentsTrackerFragment$ComposeContent$1$1$3$2$1$1(Object obj) {
        super(2, obj, InvestmentsTrackerDuxo.class, "handleAction", "handleAction(Lbff_money_movement/service/v1/InvestmentsTrackerActionDto;Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InvestmentsTrackerActionDto investmentsTrackerActionDto, Object obj) {
        invoke2(investmentsTrackerActionDto, obj);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InvestmentsTrackerActionDto p0, Object p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((InvestmentsTrackerDuxo) this.receiver).handleAction(p0, p1);
    }
}
