package com.stripe.android.payments;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.payments.StripeBrowserLauncherViewModel;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StripeBrowserLauncherActivity.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, m3636d2 = {"Lcom/stripe/android/payments/StripeBrowserLauncherActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "viewModel", "Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;", "getViewModel", "()Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "finishWithFailure", "", "args", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "finishWithSuccess", "launchBrowser", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes22.dex */
public final class StripeBrowserLauncherActivity extends AppCompatActivity {

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public StripeBrowserLauncherActivity() {
        Function0 function0 = new Function0<ViewModelProvider.Factory>() { // from class: com.stripe.android.payments.StripeBrowserLauncherActivity$viewModel$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return new StripeBrowserLauncherViewModel.Factory();
            }
        };
        final Function0 function02 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(StripeBrowserLauncherViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.payments.StripeBrowserLauncherActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, function0 == null ? new Function0<ViewModelProvider.Factory>() { // from class: com.stripe.android.payments.StripeBrowserLauncherActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        } : function0, new Function0<CreationExtras>() { // from class: com.stripe.android.payments.StripeBrowserLauncherActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                return (function03 == null || (creationExtras = (CreationExtras) function03.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    private final StripeBrowserLauncherViewModel getViewModel() {
        return (StripeBrowserLauncherViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PaymentBrowserAuthContract.Companion companion = PaymentBrowserAuthContract.INSTANCE;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        PaymentBrowserAuthContract.Args args$payments_core_release = companion.parseArgs$payments_core_release(intent);
        if (args$payments_core_release == null) {
            finish();
            ErrorReporter.Companion companion2 = ErrorReporter.INSTANCE;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            ErrorReporter.DefaultImpls.report$default(ErrorReporter.Companion.createFallbackInstance$default(companion2, applicationContext, null, 2, null), ErrorReporter.ExpectedErrorEvent.BROWSER_LAUNCHER_NULL_ARGS, null, null, 6, null);
            return;
        }
        if (getViewModel().getHasLaunched()) {
            finishWithSuccess(args$payments_core_release);
        } else {
            launchBrowser(args$payments_core_release);
        }
    }

    private final void launchBrowser(final PaymentBrowserAuthContract.Args args) {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.stripe.android.payments.StripeBrowserLauncherActivity$$ExternalSyntheticLambda0
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                StripeBrowserLauncherActivity.launchBrowser$lambda$0(this.f$0, args, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        try {
            activityResultLauncherRegisterForActivityResult.launch(getViewModel().createLaunchIntent(args));
            getViewModel().setHasLaunched(true);
        } catch (ActivityNotFoundException e) {
            ErrorReporter.Companion companion = ErrorReporter.INSTANCE;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            ErrorReporter.DefaultImpls.report$default(ErrorReporter.Companion.createFallbackInstance$default(companion, applicationContext, null, 2, null), ErrorReporter.ExpectedErrorEvent.BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND, StripeException.INSTANCE.create(e), null, 4, null);
            finishWithFailure(args);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void launchBrowser$lambda$0(StripeBrowserLauncherActivity this$0, PaymentBrowserAuthContract.Args args, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(args, "$args");
        this$0.finishWithSuccess(args);
    }

    private final void finishWithSuccess(PaymentBrowserAuthContract.Args args) {
        setResult(-1, getViewModel().getResultIntent(args));
        finish();
    }

    private final void finishWithFailure(PaymentBrowserAuthContract.Args args) {
        setResult(-1, getViewModel().getFailureIntent(args));
        finish();
    }
}
