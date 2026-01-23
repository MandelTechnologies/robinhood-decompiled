package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiCryptoStakingHubModel;
import com.robinhood.models.api.retrofit.CryptoStakingBonfireApi;
import com.robinhood.models.crypto.p315ui.staking.CryptoStakingHubModel;
import com.robinhood.models.crypto.p315ui.staking.CryptoStakingHubModel2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoStakingStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/crypto/ui/staking/CryptoStakingHubModel;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoStakingStore$getStakingHubEndpoint$1", m3645f = "CryptoStakingStore.kt", m3646l = {104}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CryptoStakingStore$getStakingHubEndpoint$1 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super CryptoStakingHubModel>, Object> {
    int label;
    final /* synthetic */ CryptoStakingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoStakingStore$getStakingHubEndpoint$1(CryptoStakingStore cryptoStakingStore, Continuation<? super CryptoStakingStore$getStakingHubEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = cryptoStakingStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoStakingStore$getStakingHubEndpoint$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super CryptoStakingHubModel> continuation) {
        return ((CryptoStakingStore$getStakingHubEndpoint$1) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CryptoStakingBonfireApi cryptoStakingBonfireApi = this.this$0.cryptoStakingBonfireApi;
            this.label = 1;
            obj = cryptoStakingBonfireApi.getStakingHubModel(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return CryptoStakingHubModel2.toUiModel((ApiCryptoStakingHubModel) obj);
    }
}
