package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.api.retrofit.CryptoTransfersApi;
import com.robinhood.models.api.transfer.ApiHigherWithdrawalLimitResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoTransfersStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/transfer/ApiHigherWithdrawalLimitResponse;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoTransfersStore$requestHigherWithdrawalLimitEndpoint$1", m3645f = "CryptoTransfersStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CryptoTransfersStore$requestHigherWithdrawalLimitEndpoint$1 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super ApiHigherWithdrawalLimitResponse>, Object> {
    int label;
    final /* synthetic */ CryptoTransfersStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoTransfersStore$requestHigherWithdrawalLimitEndpoint$1(CryptoTransfersStore cryptoTransfersStore, Continuation<? super CryptoTransfersStore$requestHigherWithdrawalLimitEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = cryptoTransfersStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoTransfersStore$requestHigherWithdrawalLimitEndpoint$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super ApiHigherWithdrawalLimitResponse> continuation) {
        return ((CryptoTransfersStore$requestHigherWithdrawalLimitEndpoint$1) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
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
        CryptoTransfersApi cryptoTransfersApi = this.this$0.cryptoTransfersApi;
        this.label = 1;
        Object objRequestHigherWithdrawalLimit = cryptoTransfersApi.requestHigherWithdrawalLimit(this);
        return objRequestHigherWithdrawalLimit == coroutine_suspended ? coroutine_suspended : objRequestHigherWithdrawalLimit;
    }
}
