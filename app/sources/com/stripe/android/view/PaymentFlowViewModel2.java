package com.stripe.android.view;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PaymentFlowViewModel.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.view.PaymentFlowViewModel", m3645f = "PaymentFlowViewModel.kt", m3646l = {35}, m3647m = "saveCustomerShippingInformation-gIAlu-s$payments_core_release")
/* renamed from: com.stripe.android.view.PaymentFlowViewModel$saveCustomerShippingInformation$1, reason: use source file name */
/* loaded from: classes26.dex */
final class PaymentFlowViewModel2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PaymentFlowViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentFlowViewModel2(PaymentFlowViewModel paymentFlowViewModel, Continuation<? super PaymentFlowViewModel2> continuation) {
        super(continuation);
        this.this$0 = paymentFlowViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM26970saveCustomerShippingInformationgIAlus$payments_core_release = this.this$0.m26970saveCustomerShippingInformationgIAlus$payments_core_release(null, this);
        return objM26970saveCustomerShippingInformationgIAlus$payments_core_release == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM26970saveCustomerShippingInformationgIAlus$payments_core_release : Result.m28549boximpl(objM26970saveCustomerShippingInformationgIAlus$payments_core_release);
    }
}
