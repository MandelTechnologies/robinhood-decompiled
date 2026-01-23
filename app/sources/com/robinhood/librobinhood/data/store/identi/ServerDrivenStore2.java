package com.robinhood.librobinhood.data.store.identi;

import com.robinhood.api.odyssey.OdysseyApi;
import com.robinhood.librobinhood.data.store.identi.ServerDrivenStore;
import com.robinhood.models.api.serverdrivenui.ApiSdResponse;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ServerDrivenStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/serverdrivenui/ApiSdResponse;", "flowConfig", "Lcom/robinhood/librobinhood/data/store/identi/ServerDrivenStore$FlowConfiguration;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.ServerDrivenStore$getGenericSdEndpoint$1", m3645f = "ServerDrivenStore.kt", m3646l = {28}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.identi.ServerDrivenStore$getGenericSdEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class ServerDrivenStore2 extends ContinuationImpl7 implements Function2<ServerDrivenStore.FlowConfiguration, Continuation<? super ApiSdResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ServerDrivenStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ServerDrivenStore2(ServerDrivenStore serverDrivenStore, Continuation<? super ServerDrivenStore2> continuation) {
        super(2, continuation);
        this.this$0 = serverDrivenStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ServerDrivenStore2 serverDrivenStore2 = new ServerDrivenStore2(this.this$0, continuation);
        serverDrivenStore2.L$0 = obj;
        return serverDrivenStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ServerDrivenStore.FlowConfiguration flowConfiguration, Continuation<? super ApiSdResponse> continuation) {
        return ((ServerDrivenStore2) create(flowConfiguration, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ServerDrivenStore.FlowConfiguration flowConfiguration = (ServerDrivenStore.FlowConfiguration) this.L$0;
        OdysseyApi odysseyApi = this.this$0.odysseyApi;
        String odysseyVersion = flowConfiguration.getOdysseyVersion();
        String flowPath = flowConfiguration.getFlowPath();
        Map<String, String> queryParameters = flowConfiguration.getQueryParameters();
        String strMo2745id = this.this$0.installation.mo2745id();
        this.label = 1;
        Object sdFlow = odysseyApi.getSdFlow(odysseyVersion, strMo2745id, flowPath, queryParameters, this);
        return sdFlow == coroutine_suspended ? coroutine_suspended : sdFlow;
    }
}
