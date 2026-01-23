package com.robinhood.shared.trade.crypto.fee;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CryptoFeeTierNotificationStatusProvider.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.fee.CryptoFeeTierNotificationStatusProvider", m3645f = "CryptoFeeTierNotificationStatusProvider.kt", m3646l = {73}, m3647m = "optIn-IoAF18A")
/* renamed from: com.robinhood.shared.trade.crypto.fee.CryptoFeeTierNotificationStatusProvider$optIn$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoFeeTierNotificationStatusProvider6 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CryptoFeeTierNotificationStatusProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoFeeTierNotificationStatusProvider6(CryptoFeeTierNotificationStatusProvider cryptoFeeTierNotificationStatusProvider, Continuation<? super CryptoFeeTierNotificationStatusProvider6> continuation) {
        super(continuation);
        this.this$0 = cryptoFeeTierNotificationStatusProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM25808optInIoAF18A = this.this$0.m25808optInIoAF18A(this);
        return objM25808optInIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM25808optInIoAF18A : Result.m28549boximpl(objM25808optInIoAF18A);
    }
}
