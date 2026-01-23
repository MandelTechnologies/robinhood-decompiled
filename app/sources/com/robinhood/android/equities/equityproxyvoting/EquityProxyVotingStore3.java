package com.robinhood.android.equities.equityproxyvoting;

import com.robinhood.models.api.ApiProxyCommunication;
import com.robinhood.models.p320db.ProxyCommunication2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import retrofit2.Response;

/* compiled from: EquityProxyVotingStore.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, m3636d2 = {"<anonymous>", "", "instrumentId", "Ljava/util/UUID;", "response", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiProxyCommunication;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingStore$proxyCommunicationEndpoint$2", m3645f = "EquityProxyVotingStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingStore$proxyCommunicationEndpoint$2, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityProxyVotingStore3 extends ContinuationImpl7 implements Function3<UUID, Response<ApiProxyCommunication>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ EquityProxyVotingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityProxyVotingStore3(EquityProxyVotingStore equityProxyVotingStore, Continuation<? super EquityProxyVotingStore3> continuation) {
        super(3, continuation);
        this.this$0 = equityProxyVotingStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(UUID uuid, Response<ApiProxyCommunication> response, Continuation<? super Unit> continuation) {
        EquityProxyVotingStore3 equityProxyVotingStore3 = new EquityProxyVotingStore3(this.this$0, continuation);
        equityProxyVotingStore3.L$0 = uuid;
        equityProxyVotingStore3.L$1 = response;
        return equityProxyVotingStore3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        ApiProxyCommunication apiProxyCommunication;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        UUID uuid = (UUID) this.L$0;
        Response response = (Response) this.L$1;
        if (response.code() == 404) {
            this.this$0.proxyCommunicationDao.deleteProxyCommunication(uuid);
        } else if (response.isSuccessful() && (apiProxyCommunication = (ApiProxyCommunication) response.body()) != null) {
            this.this$0.proxyCommunicationDao.insert(ProxyCommunication2.toDbModel(apiProxyCommunication, uuid));
        }
        return Unit.INSTANCE;
    }
}
