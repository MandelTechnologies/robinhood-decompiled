package com.robinhood.android.cash.merchantrewards.p073ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: MerchantRewardsOverviewFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewFragment$ComposeContent$2$1, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class MerchantRewardsOverviewFragment3 extends FunctionReferenceImpl implements Function1<Instant, Unit> {
    MerchantRewardsOverviewFragment3(Object obj) {
        super(1, obj, MerchantRewardsOverviewFragment.class, "handleRewardHistoryButtonOnClick", "handleRewardHistoryButtonOnClick(Ljava/time/Instant;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Instant instant) {
        invoke2(instant);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Instant p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((MerchantRewardsOverviewFragment) this.receiver).handleRewardHistoryButtonOnClick(p0);
    }
}
