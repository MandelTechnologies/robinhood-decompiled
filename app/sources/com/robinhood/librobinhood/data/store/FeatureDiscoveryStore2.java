package com.robinhood.librobinhood.data.store;

import com.robinhood.api.retrofit.BonfireApi;
import com.robinhood.models.api.bonfire.ApiFeatureDiscoveryResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import retrofit2.Response;

/* compiled from: FeatureDiscoveryStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/api/bonfire/ApiFeatureDiscoveryResponse;", "args", "Lcom/robinhood/librobinhood/data/store/GetFeatureDiscoveryArgs;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.FeatureDiscoveryStore$get$1", m3645f = "FeatureDiscoveryStore.kt", m3646l = {40}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.FeatureDiscoveryStore$get$1, reason: use source file name */
/* loaded from: classes13.dex */
final class FeatureDiscoveryStore2 extends ContinuationImpl7 implements Function2<GetFeatureDiscoveryArgs, Continuation<? super Response<ApiFeatureDiscoveryResponse>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FeatureDiscoveryStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeatureDiscoveryStore2(FeatureDiscoveryStore featureDiscoveryStore, Continuation<? super FeatureDiscoveryStore2> continuation) {
        super(2, continuation);
        this.this$0 = featureDiscoveryStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FeatureDiscoveryStore2 featureDiscoveryStore2 = new FeatureDiscoveryStore2(this.this$0, continuation);
        featureDiscoveryStore2.L$0 = obj;
        return featureDiscoveryStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetFeatureDiscoveryArgs getFeatureDiscoveryArgs, Continuation<? super Response<ApiFeatureDiscoveryResponse>> continuation) {
        return ((FeatureDiscoveryStore2) create(getFeatureDiscoveryArgs, continuation)).invokeSuspend(Unit.INSTANCE);
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
        GetFeatureDiscoveryArgs getFeatureDiscoveryArgs = (GetFeatureDiscoveryArgs) this.L$0;
        BonfireApi bonfireApi = this.this$0.bonfire;
        String serverValue = getFeatureDiscoveryArgs.getLocation().getServerValue();
        String accountNumber = getFeatureDiscoveryArgs.getAccountNumber();
        this.label = 1;
        Object featureDiscoveryWidget = bonfireApi.getFeatureDiscoveryWidget(serverValue, accountNumber, this);
        return featureDiscoveryWidget == coroutine_suspended ? coroutine_suspended : featureDiscoveryWidget;
    }
}
