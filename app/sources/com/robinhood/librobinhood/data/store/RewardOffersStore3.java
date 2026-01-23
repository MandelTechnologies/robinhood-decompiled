package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.rewardoffer.ApiRewardOffer;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RewardOffersStore.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/models/api/rewardoffer/ApiRewardOffer;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RewardOffersStore$getRewardOffersLandingScreen$2$rewardOffersDeferred$1", m3645f = "RewardOffersStore.kt", m3646l = {27}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.RewardOffersStore$getRewardOffersLandingScreen$2$rewardOffersDeferred$1, reason: use source file name */
/* loaded from: classes13.dex */
final class RewardOffersStore3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends ApiRewardOffer>>, Object> {
    int label;
    final /* synthetic */ RewardOffersStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RewardOffersStore3(RewardOffersStore rewardOffersStore, Continuation<? super RewardOffersStore3> continuation) {
        super(2, continuation);
        this.this$0 = rewardOffersStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RewardOffersStore3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends ApiRewardOffer>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<ApiRewardOffer>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<ApiRewardOffer>> continuation) {
        return ((RewardOffersStore3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        String strMo2745id = this.this$0.installation.mo2745id();
        this.label = 1;
        Object rewardOffers = rewardsApi.getRewardOffers(strMo2745id, this);
        return rewardOffers == coroutine_suspended ? coroutine_suspended : rewardOffers;
    }
}
