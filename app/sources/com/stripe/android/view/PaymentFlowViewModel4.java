package com.stripe.android.view;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PaymentFlowViewModel.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.view.PaymentFlowViewModel", m3645f = "PaymentFlowViewModel.kt", m3646l = {70}, m3647m = "validateShippingInformation-BWLJW6A$payments_core_release")
/* renamed from: com.stripe.android.view.PaymentFlowViewModel$validateShippingInformation$1, reason: use source file name */
/* loaded from: classes26.dex */
final class PaymentFlowViewModel4 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PaymentFlowViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentFlowViewModel4(PaymentFlowViewModel paymentFlowViewModel, Continuation<? super PaymentFlowViewModel4> continuation) {
        super(continuation);
        this.this$0 = paymentFlowViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM26971validateShippingInformationBWLJW6A$payments_core_release = this.this$0.m26971validateShippingInformationBWLJW6A$payments_core_release(null, null, null, this);
        return objM26971validateShippingInformationBWLJW6A$payments_core_release == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM26971validateShippingInformationBWLJW6A$payments_core_release : Result.m28549boximpl(objM26971validateShippingInformationBWLJW6A$payments_core_release);
    }
}
