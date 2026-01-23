package com.robinhood.android.gold.lib.hub.store;

import com.robinhood.android.gold.lib.hub.api.ApiDepositBoostHub;
import com.robinhood.android.gold.lib.hub.api.ApiGoldDepositBoostHubQueryParams;
import com.robinhood.android.gold.lib.hub.api.GoldHubApi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: GoldHubStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/lib/hub/api/ApiDepositBoostHub;", "<destruct>", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldDepositBoostHubQueryParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gold.lib.hub.store.GoldHubStore$goldDepositBoostHubEndpoint$1", m3645f = "GoldHubStore.kt", m3646l = {61}, m3647m = "invokeSuspend")
/* loaded from: classes10.dex */
final class GoldHubStore$goldDepositBoostHubEndpoint$1 extends ContinuationImpl7 implements Function2<ApiGoldDepositBoostHubQueryParams, Continuation<? super ApiDepositBoostHub>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GoldHubStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldHubStore$goldDepositBoostHubEndpoint$1(GoldHubStore goldHubStore, Continuation<? super GoldHubStore$goldDepositBoostHubEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = goldHubStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GoldHubStore$goldDepositBoostHubEndpoint$1 goldHubStore$goldDepositBoostHubEndpoint$1 = new GoldHubStore$goldDepositBoostHubEndpoint$1(this.this$0, continuation);
        goldHubStore$goldDepositBoostHubEndpoint$1.L$0 = obj;
        return goldHubStore$goldDepositBoostHubEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiGoldDepositBoostHubQueryParams apiGoldDepositBoostHubQueryParams, Continuation<? super ApiDepositBoostHub> continuation) {
        return ((GoldHubStore$goldDepositBoostHubEndpoint$1) create(apiGoldDepositBoostHubQueryParams, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ApiGoldDepositBoostHubQueryParams apiGoldDepositBoostHubQueryParams = (ApiGoldDepositBoostHubQueryParams) this.L$0;
        String transferIds = apiGoldDepositBoostHubQueryParams.getTransferIds();
        String amountList = apiGoldDepositBoostHubQueryParams.getAmountList();
        GoldHubApi goldHubApi = this.this$0.goldHubApi;
        this.label = 1;
        Object goldDepositBoostHub = goldHubApi.getGoldDepositBoostHub(transferIds, amountList, this);
        return goldDepositBoostHub == coroutine_suspended ? coroutine_suspended : goldDepositBoostHub;
    }
}
