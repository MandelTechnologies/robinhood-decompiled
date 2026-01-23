package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.api.retrofit.CryptoTransfersApi;
import com.robinhood.models.api.transfer.ApiCryptoTransferDepositDetails;
import com.robinhood.models.api.transfer.ApiCryptoTransferDepositRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoTransfersStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferDepositDetails;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoTransfersStore$getLatestDepositAddressEndpoint$1", m3645f = "CryptoTransfersStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CryptoTransfersStore$getLatestDepositAddressEndpoint$1 extends ContinuationImpl7 implements Function2<String, Continuation<? super ApiCryptoTransferDepositDetails>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoTransfersStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoTransfersStore$getLatestDepositAddressEndpoint$1(CryptoTransfersStore cryptoTransfersStore, Continuation<? super CryptoTransfersStore$getLatestDepositAddressEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = cryptoTransfersStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoTransfersStore$getLatestDepositAddressEndpoint$1 cryptoTransfersStore$getLatestDepositAddressEndpoint$1 = new CryptoTransfersStore$getLatestDepositAddressEndpoint$1(this.this$0, continuation);
        cryptoTransfersStore$getLatestDepositAddressEndpoint$1.L$0 = obj;
        return cryptoTransfersStore$getLatestDepositAddressEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super ApiCryptoTransferDepositDetails> continuation) {
        return ((CryptoTransfersStore$getLatestDepositAddressEndpoint$1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
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
        String str = (String) this.L$0;
        CryptoTransfersApi cryptoTransfersApi = this.this$0.cryptoTransfersApi;
        ApiCryptoTransferDepositRequest apiCryptoTransferDepositRequest = new ApiCryptoTransferDepositRequest(str);
        this.label = 1;
        Object depositDetails = cryptoTransfersApi.getDepositDetails(apiCryptoTransferDepositRequest, this);
        return depositDetails == coroutine_suspended ? coroutine_suspended : depositDetails;
    }
}
