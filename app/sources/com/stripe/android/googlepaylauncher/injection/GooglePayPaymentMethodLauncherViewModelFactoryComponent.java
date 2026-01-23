package com.stripe.android.googlepaylauncher.injection;

import android.content.Context;
import com.stripe.android.googlepaylauncher.Config;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: GooglePayPaymentMethodLauncherViewModelFactoryComponent.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherViewModelFactoryComponent;", "", "subcomponentBuilder", "Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherViewModelSubcomponent$Builder;", "getSubcomponentBuilder", "()Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherViewModelSubcomponent$Builder;", "Builder", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface GooglePayPaymentMethodLauncherViewModelFactoryComponent {

    /* compiled from: GooglePayPaymentMethodLauncherViewModelFactoryComponent.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0012\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH'J\u0018\u0010\u000b\u001a\u00020\u00002\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH'J\u0018\u0010\u000e\u001a\u00020\u00002\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH'J\u001a\u0010\u0010\u001a\u00020\u00002\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000fH'¨\u0006\u0011"}, m3636d2 = {"Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherViewModelFactoryComponent$Builder;", "", "build", "Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherViewModelFactoryComponent;", "context", "Landroid/content/Context;", "enableLogging", "", "googlePayConfig", "config", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "productUsage", "", "", "publishableKeyProvider", "Lkotlin/Function0;", "stripeAccountIdProvider", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface Builder {
        GooglePayPaymentMethodLauncherViewModelFactoryComponent build();

        Builder context(Context context);

        Builder enableLogging(boolean enableLogging);

        Builder googlePayConfig(Config config);

        Builder productUsage(Set<String> productUsage);

        Builder publishableKeyProvider(Function0<String> publishableKeyProvider);

        Builder stripeAccountIdProvider(Function0<String> stripeAccountIdProvider);
    }

    GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder getSubcomponentBuilder();
}
