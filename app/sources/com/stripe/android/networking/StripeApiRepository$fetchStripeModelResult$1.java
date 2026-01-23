package com.stripe.android.networking;

import com.stripe.android.core.model.StripeModel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StripeApiRepository.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.networking.StripeApiRepository", m3645f = "StripeApiRepository.kt", m3646l = {1525}, m3647m = "fetchStripeModelResult-BWLJW6A")
/* loaded from: classes22.dex */
final class StripeApiRepository$fetchStripeModelResult$1<ModelType extends StripeModel> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripeApiRepository$fetchStripeModelResult$1(StripeApiRepository stripeApiRepository, Continuation<? super StripeApiRepository$fetchStripeModelResult$1> continuation) {
        super(continuation);
        this.this$0 = stripeApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM26863fetchStripeModelResultBWLJW6A = this.this$0.m26863fetchStripeModelResultBWLJW6A(null, null, null, this);
        return objM26863fetchStripeModelResultBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM26863fetchStripeModelResultBWLJW6A : Result.m28549boximpl(objM26863fetchStripeModelResultBWLJW6A);
    }
}
