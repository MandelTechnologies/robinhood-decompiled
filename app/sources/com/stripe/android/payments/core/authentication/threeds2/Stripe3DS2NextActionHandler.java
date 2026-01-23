package com.stripe.android.payments.core.authentication.threeds2;

import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultCaller;
import androidx.view.result.ActivityResultLauncher;
import com.stripe.android.PaymentAuthConfig;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.Unvalidated;
import com.stripe.android.payments.core.authentication.PaymentNextActionHandler;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionStarter;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.view.AuthActivityStarterHost;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Stripe3DS2NextActionHandler.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0094@¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R0\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b%\u0010&\u0012\u0004\b+\u0010\u0017\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, m3636d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2NextActionHandler;", "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;", "Lcom/stripe/android/model/StripeIntent;", "Lcom/stripe/android/PaymentAuthConfig;", "config", "", "enableLogging", "Lkotlin/Function0;", "", "publishableKeyProvider", "", "productUsage", "<init>", "(Lcom/stripe/android/PaymentAuthConfig;ZLkotlin/jvm/functions/Function0;Ljava/util/Set;)V", "Landroidx/activity/result/ActivityResultCaller;", "activityResultCaller", "Landroidx/activity/result/ActivityResultCallback;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "activityResultCallback", "", "onNewActivityResultCaller", "(Landroidx/activity/result/ActivityResultCaller;Landroidx/activity/result/ActivityResultCallback;)V", "onLauncherInvalidated", "()V", "Lcom/stripe/android/view/AuthActivityStarterHost;", "host", "actionable", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "requestOptions", "performNextActionOnResumed", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/PaymentAuthConfig;", "Z", "Lkotlin/jvm/functions/Function0;", "Ljava/util/Set;", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "stripe3ds2CompletionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "getStripe3ds2CompletionLauncher$payments_core_release", "()Landroidx/activity/result/ActivityResultLauncher;", "setStripe3ds2CompletionLauncher$payments_core_release", "(Landroidx/activity/result/ActivityResultLauncher;)V", "getStripe3ds2CompletionLauncher$payments_core_release$annotations", "Lkotlin/Function1;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionStarter;", "stripe3ds2CompletionStarterFactory", "Lkotlin/jvm/functions/Function1;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public final class Stripe3DS2NextActionHandler extends PaymentNextActionHandler<StripeIntent> {
    private final PaymentAuthConfig config;
    private final boolean enableLogging;
    private final Set<String> productUsage;
    private final Function0<String> publishableKeyProvider;
    private ActivityResultLauncher<Stripe3ds2TransactionContract.Args> stripe3ds2CompletionLauncher;
    private final Function1<AuthActivityStarterHost, Stripe3ds2TransactionStarter> stripe3ds2CompletionStarterFactory;

    @Override // com.stripe.android.payments.core.authentication.PaymentNextActionHandler
    public /* bridge */ /* synthetic */ Object performNextActionOnResumed(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, Continuation continuation) {
        return performNextActionOnResumed2(authActivityStarterHost, stripeIntent, options, (Continuation<? super Unit>) continuation);
    }

    public Stripe3DS2NextActionHandler(PaymentAuthConfig config, boolean z, Function0<String> publishableKeyProvider, Set<String> productUsage) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(productUsage, "productUsage");
        this.config = config;
        this.enableLogging = z;
        this.publishableKeyProvider = publishableKeyProvider;
        this.productUsage = productUsage;
        this.stripe3ds2CompletionStarterFactory = new Function1<AuthActivityStarterHost, Stripe3ds2TransactionStarter>() { // from class: com.stripe.android.payments.core.authentication.threeds2.Stripe3DS2NextActionHandler$stripe3ds2CompletionStarterFactory$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Stripe3ds2TransactionStarter invoke(AuthActivityStarterHost host) {
                Intrinsics.checkNotNullParameter(host, "host");
                ActivityResultLauncher<Stripe3ds2TransactionContract.Args> stripe3ds2CompletionLauncher$payments_core_release = this.this$0.getStripe3ds2CompletionLauncher$payments_core_release();
                if (stripe3ds2CompletionLauncher$payments_core_release != null) {
                    return new Stripe3ds2TransactionStarter.Modern(stripe3ds2CompletionLauncher$payments_core_release);
                }
                return new Stripe3ds2TransactionStarter.Legacy(host);
            }
        };
    }

    public final ActivityResultLauncher<Stripe3ds2TransactionContract.Args> getStripe3ds2CompletionLauncher$payments_core_release() {
        return this.stripe3ds2CompletionLauncher;
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentNextActionHandler, com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onNewActivityResultCaller(ActivityResultCaller activityResultCaller, ActivityResultCallback<Unvalidated> activityResultCallback) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(activityResultCallback, "activityResultCallback");
        this.stripe3ds2CompletionLauncher = activityResultCaller.registerForActivityResult(new Stripe3ds2TransactionContract(), activityResultCallback);
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentNextActionHandler, com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onLauncherInvalidated() {
        ActivityResultLauncher<Stripe3ds2TransactionContract.Args> activityResultLauncher = this.stripe3ds2CompletionLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        this.stripe3ds2CompletionLauncher = null;
    }

    /* renamed from: performNextActionOnResumed, reason: avoid collision after fix types in other method */
    protected Object performNextActionOnResumed2(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, Continuation<? super Unit> continuation) {
        Stripe3ds2TransactionStarter stripe3ds2TransactionStarterInvoke = this.stripe3ds2CompletionStarterFactory.invoke(authActivityStarterHost);
        SdkTransactionId sdkTransactionIdCreate = SdkTransactionId.INSTANCE.create();
        PaymentAuthConfig.Stripe3ds2Config stripe3ds2Config = this.config.getStripe3ds2Config();
        StripeIntent.NextActionData nextActionData = stripeIntent.getNextActionData();
        Intrinsics.checkNotNull(nextActionData, "null cannot be cast to non-null type com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2");
        stripe3ds2TransactionStarterInvoke.start(new Stripe3ds2TransactionContract.Args(sdkTransactionIdCreate, stripe3ds2Config, stripeIntent, (StripeIntent.NextActionData.SdkData.Use3DS2) nextActionData, options, this.enableLogging, authActivityStarterHost.getStatusBarColor(), this.publishableKeyProvider.invoke(), this.productUsage));
        return Unit.INSTANCE;
    }
}
