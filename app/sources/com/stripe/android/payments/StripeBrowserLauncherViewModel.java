package com.stripe.android.payments;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.R$string;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.browser.BrowserCapabilities;
import com.stripe.android.core.browser.BrowserCapabilitiesSupplier;
import com.stripe.android.core.exception.LocalStripeException;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.utils.CreationExtrasKtx;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeBrowserLauncherViewModel.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 !2\u00020\u0001:\u0002!\"B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;", "Landroidx/lifecycle/ViewModel;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "browserCapabilities", "Lcom/stripe/android/core/browser/BrowserCapabilities;", "intentChooserTitle", "", "resolveErrorMessage", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/browser/BrowserCapabilities;Ljava/lang/String;Ljava/lang/String;Landroidx/lifecycle/SavedStateHandle;)V", "value", "", "hasLaunched", "getHasLaunched", "()Z", "setHasLaunched", "(Z)V", "createCustomTabsIntent", "Landroidx/browser/customtabs/CustomTabsIntent;", "args", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "url", "Landroid/net/Uri;", "createLaunchIntent", "Landroid/content/Intent;", "getFailureIntent", "getResultIntent", "logBrowserCapabilities", "", "Companion", "Factory", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public final class StripeBrowserLauncherViewModel extends ViewModel {
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final BrowserCapabilities browserCapabilities;
    private final String intentChooserTitle;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final String resolveErrorMessage;
    private final SavedStateHandle savedStateHandle;
    public static final int $stable = 8;

    /* compiled from: StripeBrowserLauncherViewModel.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrowserCapabilities.values().length];
            try {
                iArr[BrowserCapabilities.CustomTabs.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrowserCapabilities.Unknown.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StripeBrowserLauncherViewModel(AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, BrowserCapabilities browserCapabilities, String intentChooserTitle, String resolveErrorMessage, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(browserCapabilities, "browserCapabilities");
        Intrinsics.checkNotNullParameter(intentChooserTitle, "intentChooserTitle");
        Intrinsics.checkNotNullParameter(resolveErrorMessage, "resolveErrorMessage");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.browserCapabilities = browserCapabilities;
        this.intentChooserTitle = intentChooserTitle;
        this.resolveErrorMessage = resolveErrorMessage;
        this.savedStateHandle = savedStateHandle;
    }

    public final boolean getHasLaunched() {
        Boolean bool = (Boolean) this.savedStateHandle.get("has_launched");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void setHasLaunched(boolean z) {
        this.savedStateHandle.set("has_launched", Boolean.valueOf(z));
    }

    public final Intent createLaunchIntent(PaymentBrowserAuthContract.Args args) {
        Intent intent;
        Intrinsics.checkNotNullParameter(args, "args");
        Uri uri = Uri.parse(args.getUrl());
        logBrowserCapabilities();
        int i = WhenMappings.$EnumSwitchMapping$0[this.browserCapabilities.ordinal()];
        if (i == 1) {
            Intrinsics.checkNotNull(uri);
            intent = createCustomTabsIntent(args, uri).intent;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            intent = new Intent("android.intent.action.VIEW", uri);
        }
        Intrinsics.checkNotNull(intent);
        Intent intentCreateChooser = Intent.createChooser(intent, this.intentChooserTitle);
        Intrinsics.checkNotNullExpressionValue(intentCreateChooser, "createChooser(...)");
        return intentCreateChooser;
    }

    private final CustomTabsIntent createCustomTabsIntent(PaymentBrowserAuthContract.Args args, Uri url) {
        CustomTabColorSchemeParams customTabColorSchemeParamsBuild;
        Integer statusBarColor = args.getStatusBarColor();
        if (statusBarColor != null) {
            customTabColorSchemeParamsBuild = new CustomTabColorSchemeParams.Builder().setToolbarColor(statusBarColor.intValue()).build();
        } else {
            customTabColorSchemeParamsBuild = null;
        }
        CustomTabsIntent.Builder shareState = new CustomTabsIntent.Builder().setShareState(2);
        if (customTabColorSchemeParamsBuild != null) {
            shareState.setDefaultColorSchemeParams(customTabColorSchemeParamsBuild);
        }
        CustomTabsIntent customTabsIntentBuild = shareState.build();
        Intrinsics.checkNotNullExpressionValue(customTabsIntentBuild, "build(...)");
        customTabsIntentBuild.intent.setData(url);
        return customTabsIntentBuild;
    }

    public final Intent getResultIntent(PaymentBrowserAuthContract.Args args) {
        Intrinsics.checkNotNullParameter(args, "args");
        Uri uri = Uri.parse(args.getUrl());
        Intent intent = new Intent();
        String clientSecret = args.getClientSecret();
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        String stripeAccountId = args.getStripeAccountId();
        Intent intentPutExtras = intent.putExtras(new Unvalidated(clientSecret, 0, null, args.getShouldCancelSource(), lastPathSegment, null, stripeAccountId, 38, null).toBundle());
        Intrinsics.checkNotNullExpressionValue(intentPutExtras, "putExtras(...)");
        return intentPutExtras;
    }

    public final Intent getFailureIntent(PaymentBrowserAuthContract.Args args) {
        Intrinsics.checkNotNullParameter(args, "args");
        Uri uri = Uri.parse(args.getUrl());
        LocalStripeException localStripeException = new LocalStripeException(this.resolveErrorMessage, "failedBrowserLaunchError");
        Intent intent = new Intent();
        String clientSecret = args.getClientSecret();
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        String stripeAccountId = args.getStripeAccountId();
        Intent intentPutExtras = intent.putExtras(new Unvalidated(clientSecret, 2, localStripeException, args.getShouldCancelSource(), lastPathSegment, null, stripeAccountId, 32, null).toBundle());
        Intrinsics.checkNotNullExpressionValue(intentPutExtras, "putExtras(...)");
        return intentPutExtras;
    }

    private final void logBrowserCapabilities() {
        PaymentAnalyticsEvent paymentAnalyticsEvent;
        int i = WhenMappings.$EnumSwitchMapping$0[this.browserCapabilities.ordinal()];
        if (i == 1) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.AuthWithCustomTabs;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            paymentAnalyticsEvent = PaymentAnalyticsEvent.AuthWithDefaultBrowser;
        }
        this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, paymentAnalyticsEvent, null, null, null, null, null, 62, null));
    }

    /* compiled from: StripeBrowserLauncherViewModel.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/payments/StripeBrowserLauncherViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            Application applicationRequireApplication = CreationExtrasKtx.requireApplication(extras);
            SavedStateHandle savedStateHandleCreateSavedStateHandle = SavedStateHandleSupport.createSavedStateHandle(extras);
            PaymentConfiguration companion = PaymentConfiguration.INSTANCE.getInstance(applicationRequireApplication);
            BrowserCapabilitiesSupplier browserCapabilitiesSupplier = new BrowserCapabilitiesSupplier(applicationRequireApplication);
            DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = new DefaultAnalyticsRequestExecutor();
            PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = new PaymentAnalyticsRequestFactory(applicationRequireApplication, companion.getPublishableKey(), null, 4, null);
            BrowserCapabilities browserCapabilities = browserCapabilitiesSupplier.get();
            String string2 = applicationRequireApplication.getString(R$string.stripe_verify_your_payment);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = applicationRequireApplication.getString(R$string.stripe_failure_reason_authentication);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return new StripeBrowserLauncherViewModel(defaultAnalyticsRequestExecutor, paymentAnalyticsRequestFactory, browserCapabilities, string2, string3, savedStateHandleCreateSavedStateHandle);
        }
    }
}
