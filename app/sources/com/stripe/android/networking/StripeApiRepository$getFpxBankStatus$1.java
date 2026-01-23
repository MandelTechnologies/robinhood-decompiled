package com.stripe.android.networking;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StripeApiRepository.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.networking.StripeApiRepository", m3645f = "StripeApiRepository.kt", m3646l = {905}, m3647m = "getFpxBankStatus-gIAlu-s")
/* loaded from: classes22.dex */
final class StripeApiRepository$getFpxBankStatus$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripeApiRepository$getFpxBankStatus$1(StripeApiRepository stripeApiRepository, Continuation<? super StripeApiRepository$getFpxBankStatus$1> continuation) {
        super(continuation);
        this.this$0 = stripeApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo26881getFpxBankStatusgIAlus = this.this$0.mo26881getFpxBankStatusgIAlus(null, this);
        return objMo26881getFpxBankStatusgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo26881getFpxBankStatusgIAlus : Result.m28549boximpl(objMo26881getFpxBankStatusgIAlus);
    }
}
