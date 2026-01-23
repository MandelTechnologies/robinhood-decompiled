package com.stripe.android.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PaymentAuthWebViewActivity.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.view.PaymentAuthWebViewActivity$onCreate$webViewClient$2, reason: use source file name */
/* loaded from: classes26.dex */
/* synthetic */ class PaymentAuthWebViewActivity5 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
    PaymentAuthWebViewActivity5(Object obj) {
        super(1, obj, PaymentAuthWebViewActivity.class, "onAuthComplete", "onAuthComplete$payments_core_release(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        ((PaymentAuthWebViewActivity) this.receiver).onAuthComplete$payments_core_release(th);
    }
}
