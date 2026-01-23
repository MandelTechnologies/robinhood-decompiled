package com.robinhood.librobinhood.data.store.fee.monetizationModel;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TraderCryptoOrderMonetizationModelProvider.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.fee.monetizationModel.TraderCryptoOrderMonetizationModelProvider", m3645f = "TraderCryptoOrderMonetizationModelProvider.kt", m3646l = {34, 38, 42}, m3647m = "get$lib_store_crypto_externalDebug")
/* renamed from: com.robinhood.librobinhood.data.store.fee.monetizationModel.TraderCryptoOrderMonetizationModelProvider$get$1, reason: use source file name */
/* loaded from: classes13.dex */
final class TraderCryptoOrderMonetizationModelProvider2 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TraderCryptoOrderMonetizationModelProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TraderCryptoOrderMonetizationModelProvider2(TraderCryptoOrderMonetizationModelProvider traderCryptoOrderMonetizationModelProvider, Continuation<? super TraderCryptoOrderMonetizationModelProvider2> continuation) {
        super(continuation);
        this.this$0 = traderCryptoOrderMonetizationModelProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.get$lib_store_crypto_externalDebug(null, this);
    }
}
