package com.stripe.android;

import androidx.view.result.ActivityResultLauncher;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.StripeBrowserLauncherActivity;
import com.stripe.android.view.AuthActivityStarter;
import com.stripe.android.view.AuthActivityStarterHost;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentBrowserAuthStarter.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/PaymentBrowserAuthStarter;", "Lcom/stripe/android/view/AuthActivityStarter;", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "Legacy", "Modern", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface PaymentBrowserAuthStarter extends AuthActivityStarter<PaymentBrowserAuthContract.Args> {

    /* compiled from: PaymentBrowserAuthStarter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/PaymentBrowserAuthStarter$Legacy;", "Lcom/stripe/android/PaymentBrowserAuthStarter;", "host", "Lcom/stripe/android/view/AuthActivityStarterHost;", "defaultReturnUrl", "Lcom/stripe/android/payments/DefaultReturnUrl;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/payments/DefaultReturnUrl;)V", "start", "", "args", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Legacy implements PaymentBrowserAuthStarter {
        private final DefaultReturnUrl defaultReturnUrl;
        private final AuthActivityStarterHost host;

        public Legacy(AuthActivityStarterHost host, DefaultReturnUrl defaultReturnUrl) {
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(defaultReturnUrl, "defaultReturnUrl");
            this.host = host;
            this.defaultReturnUrl = defaultReturnUrl;
        }

        @Override // com.stripe.android.view.AuthActivityStarter
        public void start(PaymentBrowserAuthContract.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            this.host.startActivityForResult((args.hasDefaultReturnUrl$payments_core_release(this.defaultReturnUrl) || args.getIsInstantApp()) ? StripeBrowserLauncherActivity.class : PaymentAuthWebViewActivity.class, args.copy((31743 & 1) != 0 ? args.objectId : null, (31743 & 2) != 0 ? args.requestCode : 0, (31743 & 4) != 0 ? args.clientSecret : null, (31743 & 8) != 0 ? args.url : null, (31743 & 16) != 0 ? args.returnUrl : null, (31743 & 32) != 0 ? args.enableLogging : false, (31743 & 64) != 0 ? args.toolbarCustomization : null, (31743 & 128) != 0 ? args.stripeAccountId : null, (31743 & 256) != 0 ? args.shouldCancelSource : false, (31743 & 512) != 0 ? args.shouldCancelIntentOnUserNavigation : false, (31743 & 1024) != 0 ? args.statusBarColor : this.host.getStatusBarColor(), (31743 & 2048) != 0 ? args.publishableKey : null, (31743 & 4096) != 0 ? args.isInstantApp : false, (31743 & 8192) != 0 ? args.referrer : null, (31743 & 16384) != 0 ? args.forceInAppWebView : false).toBundle(), args.getRequestCode());
        }
    }

    /* compiled from: PaymentBrowserAuthStarter.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/PaymentBrowserAuthStarter$Modern;", "Lcom/stripe/android/PaymentBrowserAuthStarter;", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "(Landroidx/activity/result/ActivityResultLauncher;)V", "start", "", "args", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Modern implements PaymentBrowserAuthStarter {
        private final ActivityResultLauncher<PaymentBrowserAuthContract.Args> launcher;

        public Modern(ActivityResultLauncher<PaymentBrowserAuthContract.Args> launcher) {
            Intrinsics.checkNotNullParameter(launcher, "launcher");
            this.launcher = launcher;
        }

        @Override // com.stripe.android.view.AuthActivityStarter
        public void start(PaymentBrowserAuthContract.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            this.launcher.launch(args);
        }
    }
}
