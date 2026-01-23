package com.robinhood.android.investmentstracker;

import bff_money_movement.service.p019v1.InvestmentsTrackerScrubPointDto;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: InvestmentsTrackerFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class InvestmentsTrackerFragment$ComposeContent$1$1$3$2$4$1 extends FunctionReferenceImpl implements Function1<InvestmentsTrackerScrubPointDto, Unit> {
    InvestmentsTrackerFragment$ComposeContent$1$1$3$2$4$1(Object obj) {
        super(1, obj, InvestmentsTrackerDuxo.class, "onScrub", "onScrub(Lbff_money_movement/service/v1/InvestmentsTrackerScrubPointDto;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InvestmentsTrackerScrubPointDto investmentsTrackerScrubPointDto) {
        invoke2(investmentsTrackerScrubPointDto);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InvestmentsTrackerScrubPointDto investmentsTrackerScrubPointDto) {
        ((InvestmentsTrackerDuxo) this.receiver).onScrub(investmentsTrackerScrubPointDto);
    }
}
