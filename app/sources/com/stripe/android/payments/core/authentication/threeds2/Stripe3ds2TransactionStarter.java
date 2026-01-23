package com.stripe.android.payments.core.authentication.threeds2;

import androidx.view.result.ActivityResultLauncher;
import com.stripe.android.StripePaymentController;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.view.AuthActivityStarter;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Stripe3ds2TransactionStarter.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionStarter;", "Lcom/stripe/android/view/AuthActivityStarter;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "Legacy", "Modern", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public interface Stripe3ds2TransactionStarter extends AuthActivityStarter<Stripe3ds2TransactionContract.Args> {

    /* compiled from: Stripe3ds2TransactionStarter.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionStarter$Legacy;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionStarter;", "host", "Lcom/stripe/android/view/AuthActivityStarterHost;", "(Lcom/stripe/android/view/AuthActivityStarterHost;)V", "start", "", "args", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Legacy implements Stripe3ds2TransactionStarter {
        private final AuthActivityStarterHost host;

        public Legacy(AuthActivityStarterHost host) {
            Intrinsics.checkNotNullParameter(host, "host");
            this.host = host;
        }

        @Override // com.stripe.android.view.AuthActivityStarter
        public void start(Stripe3ds2TransactionContract.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            this.host.startActivityForResult(Stripe3ds2TransactionActivity.class, args.toBundle(), StripePaymentController.INSTANCE.getRequestCode$payments_core_release(args.getStripeIntent()));
        }
    }

    /* compiled from: Stripe3ds2TransactionStarter.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionStarter$Modern;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionStarter;", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "(Landroidx/activity/result/ActivityResultLauncher;)V", "start", "", "args", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Modern implements Stripe3ds2TransactionStarter {
        private final ActivityResultLauncher<Stripe3ds2TransactionContract.Args> launcher;

        public Modern(ActivityResultLauncher<Stripe3ds2TransactionContract.Args> launcher) {
            Intrinsics.checkNotNullParameter(launcher, "launcher");
            this.launcher = launcher;
        }

        @Override // com.stripe.android.view.AuthActivityStarter
        public void start(Stripe3ds2TransactionContract.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            this.launcher.launch(args);
        }
    }
}
