package com.robinhood.shared.crypto.transfer.send.address.saved;

import com.plaid.internal.EnumC7081g;
import com.robinhood.librobinhood.data.store.CryptoSavedAddressesStore;
import com.robinhood.models.api.transfer.ApiSavedAddresses;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoTransferSendSavedAddressDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/transfer/ApiSavedAddresses;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$fetchAddressLists$2$fetchSavedAddressesDeferred$1", m3645f = "CryptoTransferSendSavedAddressDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$fetchAddressLists$2$fetchSavedAddressesDeferred$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoTransferSendSavedAddressDuxo5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiSavedAddresses>, Object> {
    int label;
    final /* synthetic */ CryptoTransferSendSavedAddressDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoTransferSendSavedAddressDuxo5(CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo, Continuation<? super CryptoTransferSendSavedAddressDuxo5> continuation) {
        super(2, continuation);
        this.this$0 = cryptoTransferSendSavedAddressDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoTransferSendSavedAddressDuxo5(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiSavedAddresses> continuation) {
        return ((CryptoTransferSendSavedAddressDuxo5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        CryptoSavedAddressesStore cryptoSavedAddressesStore = this.this$0.cryptoSavedAddressesStore;
        String assetCurrencyCode = this.this$0.getAssetCurrencyCode();
        this.label = 1;
        Object objFetchSavedAddresses = cryptoSavedAddressesStore.fetchSavedAddresses(assetCurrencyCode, this);
        return objFetchSavedAddresses == coroutine_suspended ? coroutine_suspended : objFetchSavedAddresses;
    }
}
