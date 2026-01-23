package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiCryptoPositionDetails;
import com.robinhood.models.crypto.p314db.CryptoPositionDetails;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Response;

/* compiled from: CryptoPositionDetailsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiCryptoPositionDetails;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoPositionDetailsStore$getCryptoPositionDetailsEndpoint$2", m3645f = "CryptoPositionDetailsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.CryptoPositionDetailsStore$getCryptoPositionDetailsEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoPositionDetailsStore3 extends ContinuationImpl7 implements Function2<Response<ApiCryptoPositionDetails>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoPositionDetailsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoPositionDetailsStore3(CryptoPositionDetailsStore cryptoPositionDetailsStore, Continuation<? super CryptoPositionDetailsStore3> continuation) {
        super(2, continuation);
        this.this$0 = cryptoPositionDetailsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoPositionDetailsStore3 cryptoPositionDetailsStore3 = new CryptoPositionDetailsStore3(this.this$0, continuation);
        cryptoPositionDetailsStore3.L$0 = obj;
        return cryptoPositionDetailsStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Response<ApiCryptoPositionDetails> response, Continuation<? super Unit> continuation) {
        return ((CryptoPositionDetailsStore3) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        CryptoPositionDetails dbModel;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ApiCryptoPositionDetails apiCryptoPositionDetails = (ApiCryptoPositionDetails) ((Response) this.L$0).body();
        if (apiCryptoPositionDetails != null && (dbModel = CryptoPositionDetailsStore5.getDbModel(apiCryptoPositionDetails)) != null) {
            this.this$0.cryptoPositionDetailsDao.insert(dbModel);
        }
        return Unit.INSTANCE;
    }
}
