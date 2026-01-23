package com.robinhood.librobinhood.data.store;

import com.robinhood.api.pluto.PlutoApi;
import com.robinhood.models.api.pluto.ApiMerchantOfferBanner;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import retrofit2.Response;

/* compiled from: RhyRewardStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/api/pluto/ApiMerchantOfferBanner;", "id", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RhyRewardStore$bannerEndpoint$1", m3645f = "RhyRewardStore.kt", m3646l = {352}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class RhyRewardStore$bannerEndpoint$1 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super Response<ApiMerchantOfferBanner>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RhyRewardStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyRewardStore$bannerEndpoint$1(RhyRewardStore rhyRewardStore, Continuation<? super RhyRewardStore$bannerEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = rhyRewardStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RhyRewardStore$bannerEndpoint$1 rhyRewardStore$bannerEndpoint$1 = new RhyRewardStore$bannerEndpoint$1(this.this$0, continuation);
        rhyRewardStore$bannerEndpoint$1.L$0 = obj;
        return rhyRewardStore$bannerEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super Response<ApiMerchantOfferBanner>> continuation) {
        return ((RhyRewardStore$bannerEndpoint$1) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
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
        UUID uuid = (UUID) this.L$0;
        PlutoApi plutoApi = this.this$0.pluto;
        this.label = 1;
        Object historicalActivitiesBanner = plutoApi.getHistoricalActivitiesBanner(uuid, this);
        return historicalActivitiesBanner == coroutine_suspended ? coroutine_suspended : historicalActivitiesBanner;
    }
}
