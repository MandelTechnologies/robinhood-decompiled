package com.robinhood.librobinhood.data.store;

import com.robinhood.api.pluto.PlutoApi;
import com.robinhood.models.api.pluto.ApiRhyReward;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RhyRewardStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/api/pluto/ApiRhyReward;", "rewardId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RhyRewardStore$rewardEndpoint$1", m3645f = "RhyRewardStore.kt", m3646l = {73}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class RhyRewardStore$rewardEndpoint$1 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super Optional<? extends ApiRhyReward>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RhyRewardStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyRewardStore$rewardEndpoint$1(RhyRewardStore rhyRewardStore, Continuation<? super RhyRewardStore$rewardEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = rhyRewardStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RhyRewardStore$rewardEndpoint$1 rhyRewardStore$rewardEndpoint$1 = new RhyRewardStore$rewardEndpoint$1(this.this$0, continuation);
        rhyRewardStore$rewardEndpoint$1.L$0 = obj;
        return rhyRewardStore$rewardEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super Optional<? extends ApiRhyReward>> continuation) {
        return ((RhyRewardStore$rewardEndpoint$1) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UUID uuid = (UUID) this.L$0;
            PlutoApi plutoApi = this.this$0.pluto;
            this.label = 1;
            obj = plutoApi.getReward(uuid, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Optional3.asOptional(obj);
    }
}
