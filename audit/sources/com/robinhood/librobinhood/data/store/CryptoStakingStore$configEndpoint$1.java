package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.api.retrofit.CryptoStakingBonfireApi;
import com.robinhood.models.api.staking.ApiCryptoStakingOrder;
import com.robinhood.models.api.staking.ApiStakingConfig;
import com.robinhood.models.crypto.p314db.staking.StakingConfig;
import com.robinhood.models.crypto.p314db.staking.StakingConfig2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoStakingStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/crypto/db/staking/StakingConfig;", "request", "Lcom/robinhood/models/api/staking/ApiStakingConfig$Request;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoStakingStore$configEndpoint$1", m3645f = "CryptoStakingStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CryptoStakingStore$configEndpoint$1 extends ContinuationImpl7 implements Function2<ApiStakingConfig.Request, Continuation<? super StakingConfig>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoStakingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoStakingStore$configEndpoint$1(CryptoStakingStore cryptoStakingStore, Continuation<? super CryptoStakingStore$configEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = cryptoStakingStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoStakingStore$configEndpoint$1 cryptoStakingStore$configEndpoint$1 = new CryptoStakingStore$configEndpoint$1(this.this$0, continuation);
        cryptoStakingStore$configEndpoint$1.L$0 = obj;
        return cryptoStakingStore$configEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiStakingConfig.Request request, Continuation<? super StakingConfig> continuation) {
        return ((CryptoStakingStore$configEndpoint$1) create(request, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ApiStakingConfig.Request request = (ApiStakingConfig.Request) this.L$0;
            CryptoStakingBonfireApi cryptoStakingBonfireApi = this.this$0.cryptoStakingBonfireApi;
            UUID currency_pair_id = request.getCurrency_pair_id();
            ApiCryptoStakingOrder.OrderType order_type = request.getOrder_type();
            ApiCryptoStakingOrder.YieldType yield_type = request.getYield_type();
            this.label = 1;
            obj = cryptoStakingBonfireApi.getConfig(currency_pair_id, order_type, yield_type, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return StakingConfig2.toDbModel((ApiStakingConfig) obj);
    }
}
