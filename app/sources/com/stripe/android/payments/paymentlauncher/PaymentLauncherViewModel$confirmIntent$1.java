package com.stripe.android.payments.paymentlauncher;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PaymentLauncherViewModel.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel", m3645f = "PaymentLauncherViewModel.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE}, m3647m = "confirmIntent-0E7RQCE")
/* loaded from: classes22.dex */
final class PaymentLauncherViewModel$confirmIntent$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PaymentLauncherViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentLauncherViewModel$confirmIntent$1(PaymentLauncherViewModel paymentLauncherViewModel, Continuation<? super PaymentLauncherViewModel$confirmIntent$1> continuation) {
        super(continuation);
        this.this$0 = paymentLauncherViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM26952confirmIntent0E7RQCE = this.this$0.m26952confirmIntent0E7RQCE(null, null, this);
        return objM26952confirmIntent0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM26952confirmIntent0E7RQCE : Result.m28549boximpl(objM26952confirmIntent0E7RQCE);
    }
}
