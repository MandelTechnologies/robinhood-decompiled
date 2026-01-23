package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.bonfire.ApiFeatureDiscoveryResponse;
import com.robinhood.models.p320db.bonfire.FeatureDiscoveryResponse;
import com.robinhood.models.p320db.bonfire.FeatureDiscoveryResponse2;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow2;
import retrofit2.Response;

/* compiled from: FeatureDiscoveryStore.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, m3636d2 = {"<anonymous>", "", "args", "Lcom/robinhood/librobinhood/data/store/GetFeatureDiscoveryArgs;", "response", "Lretrofit2/Response;", "Lcom/robinhood/models/api/bonfire/ApiFeatureDiscoveryResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.FeatureDiscoveryStore$get$2", m3645f = "FeatureDiscoveryStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.FeatureDiscoveryStore$get$2, reason: use source file name */
/* loaded from: classes13.dex */
final class FeatureDiscoveryStore3 extends ContinuationImpl7 implements Function3<GetFeatureDiscoveryArgs, Response<ApiFeatureDiscoveryResponse>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ FeatureDiscoveryStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeatureDiscoveryStore3(FeatureDiscoveryStore featureDiscoveryStore, Continuation<? super FeatureDiscoveryStore3> continuation) {
        super(3, continuation);
        this.this$0 = featureDiscoveryStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(GetFeatureDiscoveryArgs getFeatureDiscoveryArgs, Response<ApiFeatureDiscoveryResponse> response, Continuation<? super Unit> continuation) {
        FeatureDiscoveryStore3 featureDiscoveryStore3 = new FeatureDiscoveryStore3(this.this$0, continuation);
        featureDiscoveryStore3.L$0 = getFeatureDiscoveryArgs;
        featureDiscoveryStore3.L$1 = response;
        return featureDiscoveryStore3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Map<GetFeatureDiscoveryArgs, FeatureDiscoveryResponse> value;
        Map<GetFeatureDiscoveryArgs, FeatureDiscoveryResponse> mapMinus;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        GetFeatureDiscoveryArgs getFeatureDiscoveryArgs = (GetFeatureDiscoveryArgs) this.L$0;
        Response response = (Response) this.L$1;
        StateFlow2<Map<GetFeatureDiscoveryArgs, FeatureDiscoveryResponse>> featureDiscoveryCache$lib_store_discovery_externalDebug = this.this$0.getFeatureDiscoveryCache$lib_store_discovery_externalDebug();
        FeatureDiscoveryStore featureDiscoveryStore = this.this$0;
        do {
            value = featureDiscoveryCache$lib_store_discovery_externalDebug.getValue();
            Map mapEmptyMap = (Map) CollectionsKt.firstOrNull((List) featureDiscoveryStore.getFeatureDiscoveryCache$lib_store_discovery_externalDebug().getReplayCache());
            if (mapEmptyMap == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            ApiFeatureDiscoveryResponse apiFeatureDiscoveryResponse = (ApiFeatureDiscoveryResponse) response.body();
            FeatureDiscoveryResponse dbModel = apiFeatureDiscoveryResponse != null ? FeatureDiscoveryResponse2.toDbModel(apiFeatureDiscoveryResponse) : null;
            if (dbModel != null) {
                mapMinus = MapsKt.plus(mapEmptyMap, Tuples4.m3642to(getFeatureDiscoveryArgs, dbModel));
            } else {
                mapMinus = MapsKt.minus((Map<? extends GetFeatureDiscoveryArgs, ? extends V>) mapEmptyMap, getFeatureDiscoveryArgs);
            }
        } while (!featureDiscoveryCache$lib_store_discovery_externalDebug.compareAndSet(value, mapMinus));
        return Unit.INSTANCE;
    }
}
