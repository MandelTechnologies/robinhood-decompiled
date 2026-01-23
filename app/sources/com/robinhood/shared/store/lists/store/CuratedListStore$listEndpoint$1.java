package com.robinhood.shared.store.lists.store;

import com.robinhood.android.api.discovery.DiscoveryApi;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.shared.store.lists.store.CuratedListStore;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CuratedListStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiCuratedList;", "it", "Lcom/robinhood/shared/store/lists/store/CuratedListStore$ListEndpointParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.CuratedListStore$listEndpoint$1", m3645f = "CuratedListStore.kt", m3646l = {67}, m3647m = "invokeSuspend")
/* loaded from: classes6.dex */
final class CuratedListStore$listEndpoint$1 extends ContinuationImpl7 implements Function2<CuratedListStore.ListEndpointParams, Continuation<? super ApiCuratedList>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CuratedListStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CuratedListStore$listEndpoint$1(CuratedListStore curatedListStore, Continuation<? super CuratedListStore$listEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = curatedListStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CuratedListStore$listEndpoint$1 curatedListStore$listEndpoint$1 = new CuratedListStore$listEndpoint$1(this.this$0, continuation);
        curatedListStore$listEndpoint$1.L$0 = obj;
        return curatedListStore$listEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CuratedListStore.ListEndpointParams listEndpointParams, Continuation<? super ApiCuratedList> continuation) {
        return ((CuratedListStore$listEndpoint$1) create(listEndpointParams, continuation)).invokeSuspend(Unit.INSTANCE);
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
        CuratedListStore.ListEndpointParams listEndpointParams = (CuratedListStore.ListEndpointParams) this.L$0;
        DiscoveryApi discoveryApi = this.this$0.discoveryApi;
        UUID id = listEndpointParams.getId();
        String serverValue = listEndpointParams.getOwnerType().getServerValue();
        this.label = 1;
        Object list = discoveryApi.getList(id, serverValue, this);
        return list == coroutine_suspended ? coroutine_suspended : list;
    }
}
