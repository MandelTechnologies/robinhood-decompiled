package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.retrofit.CryptoBonfireApi;
import com.robinhood.models.api.transfer.ApiCryptoTransferOptions;
import com.robinhood.models.api.transfer.CryptoTransferAction;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoTransfersStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferOptions;", "it", "Lcom/robinhood/librobinhood/data/store/TransferOptionsRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoTransfersStore$transferOptionsEndpoint$1", m3645f = "CryptoTransfersStore.kt", m3646l = {550}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CryptoTransfersStore$transferOptionsEndpoint$1 extends ContinuationImpl7 implements Function2<TransferOptionsRequest, Continuation<? super ApiCryptoTransferOptions>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoTransfersStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoTransfersStore$transferOptionsEndpoint$1(CryptoTransfersStore cryptoTransfersStore, Continuation<? super CryptoTransfersStore$transferOptionsEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = cryptoTransfersStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoTransfersStore$transferOptionsEndpoint$1 cryptoTransfersStore$transferOptionsEndpoint$1 = new CryptoTransfersStore$transferOptionsEndpoint$1(this.this$0, continuation);
        cryptoTransfersStore$transferOptionsEndpoint$1.L$0 = obj;
        return cryptoTransfersStore$transferOptionsEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TransferOptionsRequest transferOptionsRequest, Continuation<? super ApiCryptoTransferOptions> continuation) {
        return ((CryptoTransfersStore$transferOptionsEndpoint$1) create(transferOptionsRequest, continuation)).invokeSuspend(Unit.INSTANCE);
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
        TransferOptionsRequest transferOptionsRequest = (TransferOptionsRequest) this.L$0;
        CryptoBonfireApi cryptoBonfireApi = this.this$0.cryptoBonfireApi;
        String accountNumber = transferOptionsRequest.getAccountNumber();
        CryptoTransferAction action = transferOptionsRequest.getAction();
        String entryPointIdentifier = transferOptionsRequest.getEntryPointIdentifier();
        this.label = 1;
        Object cryptoTransferOptions = cryptoBonfireApi.getCryptoTransferOptions(accountNumber, action, entryPointIdentifier, this);
        return cryptoTransferOptions == coroutine_suspended ? coroutine_suspended : cryptoTransferOptions;
    }
}
