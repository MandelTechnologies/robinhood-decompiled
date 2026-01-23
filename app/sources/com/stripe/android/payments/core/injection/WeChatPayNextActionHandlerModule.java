package com.stripe.android.payments.core.injection;

import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.core.authentication.PaymentNextActionHandler;
import com.stripe.android.payments.core.authentication.UnsupportedNextActionHandler;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WeChatPayNextActionHandlerModule.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/payments/core/injection/WeChatPayNextActionHandlerModule;", "", "()V", "provideWeChatNextActionHandler", "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;", "Lcom/stripe/android/model/StripeIntent;", "unsupportedNextActionHandler", "Lcom/stripe/android/payments/core/authentication/UnsupportedNextActionHandler;", "provideWeChatNextActionHandler$payments_core_release", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public final class WeChatPayNextActionHandlerModule {
    /* JADX WARN: Multi-variable type inference failed */
    public final PaymentNextActionHandler<StripeIntent> provideWeChatNextActionHandler$payments_core_release(UnsupportedNextActionHandler unsupportedNextActionHandler) {
        UnsupportedNextActionHandler unsupportedNextActionHandlerM28550constructorimpl;
        Intrinsics.checkNotNullParameter(unsupportedNextActionHandler, "unsupportedNextActionHandler");
        try {
            Result.Companion companion = Result.INSTANCE;
            Object objNewInstance = Class.forName("com.stripe.android.payments.wechatpay.WeChatPayNextActionHandler").getConstructor(null).newInstance(null);
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentNextActionHandler<com.stripe.android.model.StripeIntent>");
            unsupportedNextActionHandlerM28550constructorimpl = Result.m28550constructorimpl((PaymentNextActionHandler) objNewInstance);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            unsupportedNextActionHandlerM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (!Result.m28555isFailureimpl(unsupportedNextActionHandlerM28550constructorimpl)) {
            unsupportedNextActionHandler = unsupportedNextActionHandlerM28550constructorimpl;
        }
        return unsupportedNextActionHandler;
    }
}
