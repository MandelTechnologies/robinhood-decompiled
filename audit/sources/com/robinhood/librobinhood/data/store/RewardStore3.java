package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.api.ApiRewardSection;
import com.robinhood.referral.api.RewardsApi;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RewardStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/models/api/ApiRewardSection;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RewardStore$endpoint$1", m3645f = "RewardStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.RewardStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class RewardStore3 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super List<? extends ApiRewardSection>>, Object> {
    int label;
    final /* synthetic */ RewardStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RewardStore3(RewardStore rewardStore, Continuation<? super RewardStore3> continuation) {
        super(2, continuation);
        this.this$0 = rewardStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RewardStore3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Unit unit, Continuation<? super List<? extends ApiRewardSection>> continuation) {
        return invoke2(unit, (Continuation<? super List<ApiRewardSection>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Unit unit, Continuation<? super List<ApiRewardSection>> continuation) {
        return ((RewardStore3) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        RewardsApi rewardsApi = this.this$0.rewardsApi;
        this.label = 1;
        Object stockRewards = rewardsApi.getStockRewards(this);
        return stockRewards == coroutine_suspended ? coroutine_suspended : stockRewards;
    }
}
