package com.stripe.android.payments.core.authentication;

import com.stripe.android.payments.core.ActivityResultLauncherHost;
import kotlin.Metadata;

/* compiled from: PaymentNextActionHandlerRegistry.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0004H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerRegistry;", "Lcom/stripe/android/payments/core/ActivityResultLauncherHost;", "getNextActionHandler", "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;", "Actionable", "actionable", "(Ljava/lang/Object;)Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public interface PaymentNextActionHandlerRegistry extends ActivityResultLauncherHost {
    <Actionable> PaymentNextActionHandler<Actionable> getNextActionHandler(Actionable actionable);
}
