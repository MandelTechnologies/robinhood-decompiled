package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiCryptobility;
import com.robinhood.models.crypto.p314db.Cryptobility2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import retrofit2.Response;

/* compiled from: CryptobilityStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiCryptobility;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptobilityStore$getCryptobilityEndpoint$2", m3645f = "CryptobilityStore.kt", m3646l = {49}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.CryptobilityStore$getCryptobilityEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptobilityStore3 extends ContinuationImpl7 implements Function2<Response<ApiCryptobility>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptobilityStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptobilityStore3(CryptobilityStore cryptobilityStore, Continuation<? super CryptobilityStore3> continuation) {
        super(2, continuation);
        this.this$0 = cryptobilityStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptobilityStore3 cryptobilityStore3 = new CryptobilityStore3(this.this$0, continuation);
        cryptobilityStore3.L$0 = obj;
        return cryptobilityStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Response<ApiCryptobility> response, Continuation<? super Unit> continuation) {
        return ((CryptobilityStore3) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Response response;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Response response2 = (Response) this.L$0;
            Flow<Boolean> flowStreamCryptoMibExperiment = this.this$0.cryptoExperimentsStore.streamCryptoMibExperiment();
            this.L$0 = response2;
            this.label = 1;
            Object objFirstOrNull = FlowKt.firstOrNull(flowStreamCryptoMibExperiment, this);
            if (objFirstOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
            response = response2;
            obj = objFirstOrNull;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            response = (Response) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        ApiCryptobility apiCryptobility = (ApiCryptobility) response.body();
        if (apiCryptobility != null) {
            this.this$0.cryptobilityDao.insert(Cryptobility2.toDbModel(apiCryptobility, zBooleanValue));
        }
        return Unit.INSTANCE;
    }
}
