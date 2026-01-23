package com.robinhood.librobinhood.data.store.fee;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CryptoFeeTierStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.fee.CryptoFeeTierStore", m3645f = "CryptoFeeTierStore.kt", m3646l = {64}, m3647m = "getCryptoFeeTierInfo-IoAF18A")
/* renamed from: com.robinhood.librobinhood.data.store.fee.CryptoFeeTierStore$getCryptoFeeTierInfo$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoFeeTierStore4 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CryptoFeeTierStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoFeeTierStore4(CryptoFeeTierStore cryptoFeeTierStore, Continuation<? super CryptoFeeTierStore4> continuation) {
        super(continuation);
        this.this$0 = cryptoFeeTierStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM22810getCryptoFeeTierInfoIoAF18A = this.this$0.m22810getCryptoFeeTierInfoIoAF18A(this);
        return objM22810getCryptoFeeTierInfoIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM22810getCryptoFeeTierInfoIoAF18A : Result.m28549boximpl(objM22810getCryptoFeeTierInfoIoAF18A);
    }
}
