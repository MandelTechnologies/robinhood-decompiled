package com.robinhood.android.referral.pastRewards;

import com.robinhood.models.p355ui.UiStockRewardSection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RewardsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/referral/pastRewards/RewardsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.referral.pastRewards.RewardsDuxo$onResume$1$1", m3645f = "RewardsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.referral.pastRewards.RewardsDuxo$onResume$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RewardsDuxo2 extends ContinuationImpl7 implements Function2<RewardsViewState, Continuation<? super RewardsViewState>, Object> {
    final /* synthetic */ List<UiStockRewardSection> $sections;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RewardsDuxo2(List<UiStockRewardSection> list, Continuation<? super RewardsDuxo2> continuation) {
        super(2, continuation);
        this.$sections = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RewardsDuxo2 rewardsDuxo2 = new RewardsDuxo2(this.$sections, continuation);
        rewardsDuxo2.L$0 = obj;
        return rewardsDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RewardsViewState rewardsViewState, Continuation<? super RewardsViewState> continuation) {
        return ((RewardsDuxo2) create(rewardsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((RewardsViewState) this.L$0).copy(this.$sections);
    }
}
