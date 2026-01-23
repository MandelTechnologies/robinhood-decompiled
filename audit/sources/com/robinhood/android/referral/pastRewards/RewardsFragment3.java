package com.robinhood.android.referral.pastRewards;

import com.robinhood.models.p320db.RewardReferral;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.referral.pastRewards.RewardsFragment$ComposeContent$2$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class RewardsFragment3 extends FunctionReferenceImpl implements Function1<RewardReferral, Unit> {
    RewardsFragment3(Object obj) {
        super(1, obj, RewardsDuxo.class, "remindReferral", "remindReferral(Lcom/robinhood/models/db/RewardReferral;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RewardReferral rewardReferral) {
        invoke2(rewardReferral);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(RewardReferral p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((RewardsDuxo) this.receiver).remindReferral(p0);
    }
}
