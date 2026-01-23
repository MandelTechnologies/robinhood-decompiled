package com.robinhood.android.referral.pastRewards;

import com.robinhood.models.p320db.RewardData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.referral.pastRewards.RewardsFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class RewardsFragment2 extends FunctionReferenceImpl implements Function1<RewardData, Unit> {
    RewardsFragment2(Object obj) {
        super(1, obj, RewardsFragment.class, "claimReward", "claimReward(Lcom/robinhood/models/db/RewardData;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RewardData rewardData) {
        invoke2(rewardData);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(RewardData p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((RewardsFragment) this.receiver).claimReward(p0);
    }
}
