package com.robinhood.shared.crypto.transfer.send.address.saved;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoTransferSendSavedAddressDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/address/saved/CryptoTransferSendSavedAddressDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$fetchAddressLists$3", m3645f = "CryptoTransferSendSavedAddressDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$fetchAddressLists$3, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoTransferSendSavedAddressDuxo6 extends ContinuationImpl7 implements Function2<CryptoTransferSendSavedAddressDataState, Continuation<? super CryptoTransferSendSavedAddressDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    CryptoTransferSendSavedAddressDuxo6(Continuation<? super CryptoTransferSendSavedAddressDuxo6> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoTransferSendSavedAddressDuxo6 cryptoTransferSendSavedAddressDuxo6 = new CryptoTransferSendSavedAddressDuxo6(continuation);
        cryptoTransferSendSavedAddressDuxo6.L$0 = obj;
        return cryptoTransferSendSavedAddressDuxo6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoTransferSendSavedAddressDataState cryptoTransferSendSavedAddressDataState, Continuation<? super CryptoTransferSendSavedAddressDataState> continuation) {
        return ((CryptoTransferSendSavedAddressDuxo6) create(cryptoTransferSendSavedAddressDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CryptoTransferSendSavedAddressDataState.copy$default((CryptoTransferSendSavedAddressDataState) this.L$0, false, true, 0, false, null, null, null, null, false, null, null, 2045, null);
    }
}
