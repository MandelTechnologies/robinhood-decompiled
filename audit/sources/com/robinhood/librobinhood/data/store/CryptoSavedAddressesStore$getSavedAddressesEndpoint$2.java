package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.transfer.ApiSavedAddresses;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow2;

/* compiled from: CryptoSavedAddressesStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "request", "Lcom/robinhood/librobinhood/data/store/SavedAddressListRequest;", "response", "Lcom/robinhood/models/api/transfer/ApiSavedAddresses;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoSavedAddressesStore$getSavedAddressesEndpoint$2", m3645f = "CryptoSavedAddressesStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes13.dex */
final class CryptoSavedAddressesStore$getSavedAddressesEndpoint$2 extends ContinuationImpl7 implements Function3<SavedAddressListRequest, ApiSavedAddresses, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ CryptoSavedAddressesStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoSavedAddressesStore$getSavedAddressesEndpoint$2(CryptoSavedAddressesStore cryptoSavedAddressesStore, Continuation<? super CryptoSavedAddressesStore$getSavedAddressesEndpoint$2> continuation) {
        super(3, continuation);
        this.this$0 = cryptoSavedAddressesStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(SavedAddressListRequest savedAddressListRequest, ApiSavedAddresses apiSavedAddresses, Continuation<? super Unit> continuation) {
        CryptoSavedAddressesStore$getSavedAddressesEndpoint$2 cryptoSavedAddressesStore$getSavedAddressesEndpoint$2 = new CryptoSavedAddressesStore$getSavedAddressesEndpoint$2(this.this$0, continuation);
        cryptoSavedAddressesStore$getSavedAddressesEndpoint$2.L$0 = savedAddressListRequest;
        cryptoSavedAddressesStore$getSavedAddressesEndpoint$2.L$1 = apiSavedAddresses;
        return cryptoSavedAddressesStore$getSavedAddressesEndpoint$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Map<String, ApiSavedAddresses> value;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SavedAddressListRequest savedAddressListRequest = (SavedAddressListRequest) this.L$0;
        ApiSavedAddresses apiSavedAddresses = (ApiSavedAddresses) this.L$1;
        StateFlow2<Map<String, ApiSavedAddresses>> savedAddresses = this.this$0.getSavedAddresses();
        do {
            value = savedAddresses.getValue();
        } while (!savedAddresses.compareAndSet(value, MapsKt.plus(MapsKt.toMutableMap(value), Tuples4.m3642to(savedAddressListRequest.getCurrencyCode(), apiSavedAddresses))));
        return Unit.INSTANCE;
    }
}
