package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.pluto.ApiMerchantReward;
import com.robinhood.models.api.pluto.ApiRhyReward;
import com.robinhood.models.api.pluto.ApiRoundupReward;
import com.robinhood.models.api.pluto.Unknown;
import com.robinhood.models.dao.MerchantRewardDao;
import com.robinhood.models.dao.RoundupRewardDao;
import com.robinhood.models.p320db.MerchantReward3;
import com.robinhood.models.p320db.RoundupReward2;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RhyRewardStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "apiRoundupRewardOptional", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/api/pluto/ApiRhyReward;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RhyRewardStore$rewardEndpoint$2", m3645f = "RhyRewardStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class RhyRewardStore$rewardEndpoint$2 extends ContinuationImpl7 implements Function2<Optional<? extends ApiRhyReward>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RhyRewardStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyRewardStore$rewardEndpoint$2(RhyRewardStore rhyRewardStore, Continuation<? super RhyRewardStore$rewardEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = rhyRewardStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RhyRewardStore$rewardEndpoint$2 rhyRewardStore$rewardEndpoint$2 = new RhyRewardStore$rewardEndpoint$2(this.this$0, continuation);
        rhyRewardStore$rewardEndpoint$2.L$0 = obj;
        return rhyRewardStore$rewardEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Optional<? extends ApiRhyReward> optional, Continuation<? super Unit> continuation) {
        return ((RhyRewardStore$rewardEndpoint$2) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ApiRhyReward apiRhyReward = (ApiRhyReward) ((Optional) this.L$0).getOrNull();
        if (apiRhyReward instanceof ApiRoundupReward) {
            this.this$0.roundupRewardDao.insert((RoundupRewardDao) RoundupReward2.toDbModel((ApiRoundupReward) apiRhyReward));
        } else if (apiRhyReward instanceof ApiMerchantReward) {
            this.this$0.merchantRewardDao.insert((MerchantRewardDao) MerchantReward3.toDbModel((ApiMerchantReward) apiRhyReward));
        } else if (!(apiRhyReward instanceof Unknown) && apiRhyReward != null) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
