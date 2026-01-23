package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.retrofit.CryptoTransfersApi;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoSavedAddressesStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "request", "Lcom/robinhood/librobinhood/data/store/DeleteSavedAddressRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoSavedAddressesStore$deleteSavedAddressEndpoint$1", m3645f = "CryptoSavedAddressesStore.kt", m3646l = {94}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CryptoSavedAddressesStore$deleteSavedAddressEndpoint$1 extends ContinuationImpl7 implements Function2<DeleteSavedAddressRequest, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoSavedAddressesStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoSavedAddressesStore$deleteSavedAddressEndpoint$1(CryptoSavedAddressesStore cryptoSavedAddressesStore, Continuation<? super CryptoSavedAddressesStore$deleteSavedAddressEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = cryptoSavedAddressesStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoSavedAddressesStore$deleteSavedAddressEndpoint$1 cryptoSavedAddressesStore$deleteSavedAddressEndpoint$1 = new CryptoSavedAddressesStore$deleteSavedAddressEndpoint$1(this.this$0, continuation);
        cryptoSavedAddressesStore$deleteSavedAddressEndpoint$1.L$0 = obj;
        return cryptoSavedAddressesStore$deleteSavedAddressEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DeleteSavedAddressRequest deleteSavedAddressRequest, Continuation<? super Unit> continuation) {
        return ((CryptoSavedAddressesStore$deleteSavedAddressEndpoint$1) create(deleteSavedAddressRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DeleteSavedAddressRequest deleteSavedAddressRequest = (DeleteSavedAddressRequest) this.L$0;
            CryptoTransfersApi cryptoTransfersApi = this.this$0.cryptoTransfersApi;
            UUID id = deleteSavedAddressRequest.getId();
            this.label = 1;
            if (cryptoTransfersApi.deleteSavedAddresses(id, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
