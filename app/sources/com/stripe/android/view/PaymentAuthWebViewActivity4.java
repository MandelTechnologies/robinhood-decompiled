package com.stripe.android.view;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PaymentAuthWebViewActivity.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.view.PaymentAuthWebViewActivity$onCreate$webViewClient$1, reason: use source file name */
/* loaded from: classes26.dex */
/* synthetic */ class PaymentAuthWebViewActivity4 extends FunctionReferenceImpl implements Function1<Intent, Unit> {
    PaymentAuthWebViewActivity4(Object obj) {
        super(1, obj, PaymentAuthWebViewActivity.class, "startActivity", "startActivity(Landroid/content/Intent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Intent intent) {
        invoke2(intent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Intent intent) {
        ((PaymentAuthWebViewActivity) this.receiver).startActivity(intent);
    }
}
