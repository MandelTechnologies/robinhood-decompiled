package com.stripe.android.payments.core.injection;

import com.stripe.android.PaymentAuthConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Stripe3DSNextActionHandlerModule.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/stripe/android/payments/core/injection/Stripe3DSNextActionHandlerModule;", "", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public abstract class Stripe3DSNextActionHandlerModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: Stripe3DSNextActionHandlerModule.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/payments/core/injection/Stripe3DSNextActionHandlerModule$Companion;", "", "()V", "providePaymentAuthConfig", "Lcom/stripe/android/PaymentAuthConfig;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PaymentAuthConfig providePaymentAuthConfig() {
            return PaymentAuthConfig.INSTANCE.get();
        }
    }
}
