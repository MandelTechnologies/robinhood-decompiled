package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.retrofit.CryptoBonfireApi;
import com.robinhood.models.api.transfer.ApiCryptoTransferConfig;
import com.robinhood.models.api.transfer.CryptoTransferAction;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoTransfersStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;", "request", "Lcom/robinhood/librobinhood/data/store/CryptoTransferConfigRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoTransfersStore$transferConfigEndpoint$2", m3645f = "CryptoTransfersStore.kt", m3646l = {480}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CryptoTransfersStore$transferConfigEndpoint$2 extends ContinuationImpl7 implements Function2<CryptoTransferConfigRequest, Continuation<? super CryptoTransferConfig>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoTransfersStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoTransfersStore$transferConfigEndpoint$2(CryptoTransfersStore cryptoTransfersStore, Continuation<? super CryptoTransfersStore$transferConfigEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoTransfersStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoTransfersStore$transferConfigEndpoint$2 cryptoTransfersStore$transferConfigEndpoint$2 = new CryptoTransfersStore$transferConfigEndpoint$2(this.this$0, continuation);
        cryptoTransfersStore$transferConfigEndpoint$2.L$0 = obj;
        return cryptoTransfersStore$transferConfigEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoTransferConfigRequest cryptoTransferConfigRequest, Continuation<? super CryptoTransferConfig> continuation) {
        return ((CryptoTransfersStore$transferConfigEndpoint$2) create(cryptoTransferConfigRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CryptoTransferConfigRequest cryptoTransferConfigRequest = (CryptoTransferConfigRequest) this.L$0;
            CryptoBonfireApi cryptoBonfireApi = this.this$0.cryptoBonfireApi;
            String currencyCode = cryptoTransferConfigRequest.getCurrencyCode();
            CryptoTransferAction action = cryptoTransferConfigRequest.getAction();
            this.label = 1;
            obj = cryptoBonfireApi.getCryptoTransferConfig(currencyCode, action, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return CryptoTransferConfig2.toDbModel((ApiCryptoTransferConfig) obj);
    }
}
