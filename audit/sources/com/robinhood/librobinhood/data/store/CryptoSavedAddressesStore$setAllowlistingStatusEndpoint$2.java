package com.robinhood.librobinhood.data.store;

import com.robinhood.models.crypto.p314db.transfer.AllowlistStatus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoSavedAddressesStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/db/transfer/AllowlistStatus;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoSavedAddressesStore$setAllowlistingStatusEndpoint$2", m3645f = "CryptoSavedAddressesStore.kt", m3646l = {80}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CryptoSavedAddressesStore$setAllowlistingStatusEndpoint$2 extends ContinuationImpl7 implements Function2<AllowlistStatus, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoSavedAddressesStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoSavedAddressesStore$setAllowlistingStatusEndpoint$2(CryptoSavedAddressesStore cryptoSavedAddressesStore, Continuation<? super CryptoSavedAddressesStore$setAllowlistingStatusEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoSavedAddressesStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoSavedAddressesStore$setAllowlistingStatusEndpoint$2 cryptoSavedAddressesStore$setAllowlistingStatusEndpoint$2 = new CryptoSavedAddressesStore$setAllowlistingStatusEndpoint$2(this.this$0, continuation);
        cryptoSavedAddressesStore$setAllowlistingStatusEndpoint$2.L$0 = obj;
        return cryptoSavedAddressesStore$setAllowlistingStatusEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AllowlistStatus allowlistStatus, Continuation<? super Unit> continuation) {
        return ((CryptoSavedAddressesStore$setAllowlistingStatusEndpoint$2) create(allowlistStatus, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AllowlistStatus allowlistStatus = (AllowlistStatus) this.L$0;
            CryptoSavedAddressesStore cryptoSavedAddressesStore = this.this$0;
            this.label = 1;
            if (cryptoSavedAddressesStore.saveAllowlistStatus$lib_store_crypto_externalDebug(allowlistStatus, this) == coroutine_suspended) {
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
