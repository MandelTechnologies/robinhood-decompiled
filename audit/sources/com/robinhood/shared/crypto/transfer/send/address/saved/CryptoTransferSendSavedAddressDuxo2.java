package com.robinhood.shared.crypto.transfer.send.address.saved;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CryptoTransferSendSavedAddressDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo", m3645f = "CryptoTransferSendSavedAddressDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE}, m3647m = "fetchAddressLists$feature_crypto_transfer_externalDebug")
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$fetchAddressLists$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoTransferSendSavedAddressDuxo2 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CryptoTransferSendSavedAddressDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoTransferSendSavedAddressDuxo2(CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo, Continuation<? super CryptoTransferSendSavedAddressDuxo2> continuation) {
        super(continuation);
        this.this$0 = cryptoTransferSendSavedAddressDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchAddressLists$feature_crypto_transfer_externalDebug(this);
    }
}
