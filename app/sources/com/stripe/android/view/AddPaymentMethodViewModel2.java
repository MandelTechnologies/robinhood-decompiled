package com.stripe.android.view;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AddPaymentMethodViewModel.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.view.AddPaymentMethodViewModel", m3645f = "AddPaymentMethodViewModel.kt", m3646l = {90}, m3647m = "attachPaymentMethod-0E7RQCE$payments_core_release")
/* renamed from: com.stripe.android.view.AddPaymentMethodViewModel$attachPaymentMethod$1, reason: use source file name */
/* loaded from: classes26.dex */
final class AddPaymentMethodViewModel2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AddPaymentMethodViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddPaymentMethodViewModel2(AddPaymentMethodViewModel addPaymentMethodViewModel, Continuation<? super AddPaymentMethodViewModel2> continuation) {
        super(continuation);
        this.this$0 = addPaymentMethodViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM26955attachPaymentMethod0E7RQCE$payments_core_release = this.this$0.m26955attachPaymentMethod0E7RQCE$payments_core_release(null, null, this);
        return objM26955attachPaymentMethod0E7RQCE$payments_core_release == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM26955attachPaymentMethod0E7RQCE$payments_core_release : Result.m28549boximpl(objM26955attachPaymentMethod0E7RQCE$payments_core_release);
    }
}
