package com.stripe.android.payments.core.injection;

import android.content.Context;
import androidx.view.result.ActivityResultLauncher;
import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry;
import com.stripe.android.view.AuthActivityStarterHost;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NextActionHandlerModule.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/stripe/android/payments/core/injection/NextActionHandlerModule;", "", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public abstract class NextActionHandlerModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: NextActionHandlerModule.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J*\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J\"\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/stripe/android/payments/core/injection/NextActionHandlerModule$Companion;", "", "()V", "provideDefaultReturnUrl", "Lcom/stripe/android/payments/DefaultReturnUrl;", "context", "Landroid/content/Context;", "providePaymentBrowserAuthStarterFactory", "Lkotlin/Function1;", "Lcom/stripe/android/view/AuthActivityStarterHost;", "Lcom/stripe/android/PaymentBrowserAuthStarter;", "lazyRegistry", "Ldagger/Lazy;", "Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;", "defaultReturnUrl", "providePaymentRelayStarterFactory", "Lcom/stripe/android/PaymentRelayStarter;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DefaultReturnUrl provideDefaultReturnUrl(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return DefaultReturnUrl.INSTANCE.create(context);
        }

        public final Function1<AuthActivityStarterHost, PaymentRelayStarter> providePaymentRelayStarterFactory(final Lazy<DefaultPaymentNextActionHandlerRegistry> lazyRegistry) {
            Intrinsics.checkNotNullParameter(lazyRegistry, "lazyRegistry");
            return new Function1<AuthActivityStarterHost, PaymentRelayStarter>() { // from class: com.stripe.android.payments.core.injection.NextActionHandlerModule$Companion$providePaymentRelayStarterFactory$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final PaymentRelayStarter invoke(AuthActivityStarterHost host) {
                    Intrinsics.checkNotNullParameter(host, "host");
                    ActivityResultLauncher<PaymentRelayStarter.Args> paymentRelayLauncher$payments_core_release = lazyRegistry.get().getPaymentRelayLauncher$payments_core_release();
                    if (paymentRelayLauncher$payments_core_release != null) {
                        return new PaymentRelayStarter.Modern(paymentRelayLauncher$payments_core_release);
                    }
                    return new PaymentRelayStarter.Legacy(host);
                }
            };
        }

        public final Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter> providePaymentBrowserAuthStarterFactory(final Lazy<DefaultPaymentNextActionHandlerRegistry> lazyRegistry, final DefaultReturnUrl defaultReturnUrl) {
            Intrinsics.checkNotNullParameter(lazyRegistry, "lazyRegistry");
            Intrinsics.checkNotNullParameter(defaultReturnUrl, "defaultReturnUrl");
            return new Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter>() { // from class: com.stripe.android.payments.core.injection.NextActionHandlerModule$Companion$providePaymentBrowserAuthStarterFactory$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final PaymentBrowserAuthStarter invoke(AuthActivityStarterHost host) {
                    Intrinsics.checkNotNullParameter(host, "host");
                    ActivityResultLauncher<PaymentBrowserAuthContract.Args> paymentBrowserAuthLauncher$payments_core_release = lazyRegistry.get().getPaymentBrowserAuthLauncher$payments_core_release();
                    if (paymentBrowserAuthLauncher$payments_core_release != null) {
                        return new PaymentBrowserAuthStarter.Modern(paymentBrowserAuthLauncher$payments_core_release);
                    }
                    return new PaymentBrowserAuthStarter.Legacy(host, defaultReturnUrl);
                }
            };
        }
    }
}
