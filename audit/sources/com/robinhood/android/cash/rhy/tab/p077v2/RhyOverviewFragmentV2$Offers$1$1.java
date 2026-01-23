package com.robinhood.android.cash.rhy.tab.p077v2;

import com.robinhood.android.rhyrewards.p246ui.CashCardOffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyOverviewFragmentV2.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class RhyOverviewFragmentV2$Offers$1$1 extends FunctionReferenceImpl implements Function1<CashCardOffer, Unit> {
    RhyOverviewFragmentV2$Offers$1$1(Object obj) {
        super(1, obj, RhyOverviewFragmentV2.class, "onClickCashCardOffer", "onClickCashCardOffer(Lcom/robinhood/android/rhyrewards/ui/CashCardOffer;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CashCardOffer cashCardOffer) {
        invoke2(cashCardOffer);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CashCardOffer p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((RhyOverviewFragmentV2) this.receiver).onClickCashCardOffer(p0);
    }
}
