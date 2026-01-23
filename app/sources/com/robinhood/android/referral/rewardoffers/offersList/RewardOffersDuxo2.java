package com.robinhood.android.referral.rewardoffers.offersList;

import com.robinhood.librobinhood.data.store.RewardOffersStore2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RewardOffersDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.offersList.RewardOffersDuxo$getRewardOfferDetails$3$1", m3645f = "RewardOffersDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.referral.rewardoffers.offersList.RewardOffersDuxo$getRewardOfferDetails$3$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RewardOffersDuxo2 extends ContinuationImpl7 implements Function2<RewardOffersDataState, Continuation<? super RewardOffersDataState>, Object> {
    final /* synthetic */ RewardOffersStore2.RewardOfferDetails $rewardOfferDetails;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RewardOffersDuxo2(RewardOffersStore2.RewardOfferDetails rewardOfferDetails, Continuation<? super RewardOffersDuxo2> continuation) {
        super(2, continuation);
        this.$rewardOfferDetails = rewardOfferDetails;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RewardOffersDuxo2 rewardOffersDuxo2 = new RewardOffersDuxo2(this.$rewardOfferDetails, continuation);
        rewardOffersDuxo2.L$0 = obj;
        return rewardOffersDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RewardOffersDataState rewardOffersDataState, Continuation<? super RewardOffersDataState> continuation) {
        return ((RewardOffersDuxo2) create(rewardOffersDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((RewardOffersDataState) this.L$0).copy(this.$rewardOfferDetails);
    }
}
