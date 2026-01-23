package com.robinhood.librobinhood.data.store.identi;

import com.robinhood.api.odyssey.OdysseyApi;
import com.robinhood.librobinhood.data.store.identi.ServerDrivenStore;
import com.robinhood.models.api.serverdrivenui.ApiSdComponentDataChangeResponse;
import com.robinhood.models.api.serverdrivenui.ApiSdSubmitPayloadRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ServerDrivenStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/serverdrivenui/ApiSdComponentDataChangeResponse;", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/librobinhood/data/store/identi/ServerDrivenStore$FlowConfiguration;", "Lcom/robinhood/models/api/serverdrivenui/ApiSdSubmitPayloadRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.ServerDrivenStore$validateGenericSdEntityValuesEndpoint$1", m3645f = "ServerDrivenStore.kt", m3646l = {62}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.identi.ServerDrivenStore$validateGenericSdEntityValuesEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class ServerDrivenStore8 extends ContinuationImpl7 implements Function2<Tuples2<? extends ServerDrivenStore.FlowConfiguration, ? extends ApiSdSubmitPayloadRequest>, Continuation<? super ApiSdComponentDataChangeResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ServerDrivenStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ServerDrivenStore8(ServerDrivenStore serverDrivenStore, Continuation<? super ServerDrivenStore8> continuation) {
        super(2, continuation);
        this.this$0 = serverDrivenStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ServerDrivenStore8 serverDrivenStore8 = new ServerDrivenStore8(this.this$0, continuation);
        serverDrivenStore8.L$0 = obj;
        return serverDrivenStore8;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends ServerDrivenStore.FlowConfiguration, ? extends ApiSdSubmitPayloadRequest> tuples2, Continuation<? super ApiSdComponentDataChangeResponse> continuation) {
        return invoke2((Tuples2<ServerDrivenStore.FlowConfiguration, ApiSdSubmitPayloadRequest>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<ServerDrivenStore.FlowConfiguration, ApiSdSubmitPayloadRequest> tuples2, Continuation<? super ApiSdComponentDataChangeResponse> continuation) {
        return ((ServerDrivenStore8) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Tuples2 tuples2 = (Tuples2) this.L$0;
        ServerDrivenStore.FlowConfiguration flowConfiguration = (ServerDrivenStore.FlowConfiguration) tuples2.component1();
        ApiSdSubmitPayloadRequest apiSdSubmitPayloadRequest = (ApiSdSubmitPayloadRequest) tuples2.component2();
        String flowPath = flowConfiguration.isWorkflow() ? flowConfiguration.getFlowPath() : null;
        OdysseyApi odysseyApi = this.this$0.odysseyApi;
        ApiSdSubmitPayloadRequest apiSdSubmitPayloadRequestCopy$default = ApiSdSubmitPayloadRequest.copy$default(apiSdSubmitPayloadRequest, null, flowPath, null, null, 13, null);
        String odysseyVersion = flowConfiguration.getOdysseyVersion();
        String strMo2745id = this.this$0.installation.mo2745id();
        this.label = 1;
        Object objValidateSdEntityValues = odysseyApi.validateSdEntityValues(apiSdSubmitPayloadRequestCopy$default, odysseyVersion, strMo2745id, this);
        return objValidateSdEntityValues == coroutine_suspended ? coroutine_suspended : objValidateSdEntityValues;
    }
}
