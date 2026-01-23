package com.robinhood.android.cash.merchantrewards.p073ui;

import com.robinhood.android.rhyrewards.p246ui.CashCardOffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MerchantRewardsOverviewFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class MerchantRewardsOverviewFragment2 extends FunctionReferenceImpl implements Function1<CashCardOffer, Unit> {
    MerchantRewardsOverviewFragment2(Object obj) {
        super(1, obj, MerchantRewardsOverviewFragment.class, "onClickCashCardOffer", "onClickCashCardOffer(Lcom/robinhood/android/rhyrewards/ui/CashCardOffer;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CashCardOffer cashCardOffer) {
        invoke2(cashCardOffer);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CashCardOffer p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((MerchantRewardsOverviewFragment) this.receiver).onClickCashCardOffer(p0);
    }
}
