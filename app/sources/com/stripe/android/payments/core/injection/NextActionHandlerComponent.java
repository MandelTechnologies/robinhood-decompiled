package com.stripe.android.payments.core.injection;

import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* compiled from: NextActionHandlerComponent.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent;", "", "registry", "Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;", "getRegistry", "()Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;", "Builder", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public interface NextActionHandlerComponent {

    /* compiled from: NextActionHandlerComponent.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H'J\b\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH'J\u0012\u0010\t\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\nH'J\u0012\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\nH'J\u0012\u0010\r\u001a\u00020\u00002\b\b\u0001\u0010\r\u001a\u00020\nH'J\u0018\u0010\u000e\u001a\u00020\u00002\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH'J\u0018\u0010\u0011\u001a\u00020\u00002\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012H'J\u001c\u0010\u0013\u001a\u00020\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0014H'J\u0012\u0010\u0015\u001a\u00020\u00002\b\b\u0001\u0010\u0015\u001a\u00020\u0016H'J\u0012\u0010\u0017\u001a\u00020\u00002\b\b\u0001\u0010\u0017\u001a\u00020\u0016H'¨\u0006\u0018"}, m3636d2 = {"Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;", "", "analyticsRequestFactory", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "build", "Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent;", "context", "Landroid/content/Context;", "enableLogging", "", "includePaymentSheetNextActionHandlers", "includePaymentSheetNextHandlers", "isInstantApp", "productUsage", "", "", "publishableKeyProvider", "Lkotlin/Function0;", "threeDs1IntentReturnUrlMap", "", "uiContext", "Lkotlin/coroutines/CoroutineContext;", "workContext", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface Builder {
        Builder analyticsRequestFactory(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory);

        NextActionHandlerComponent build();

        Builder context(Context context);

        Builder enableLogging(boolean enableLogging);

        Builder includePaymentSheetNextActionHandlers(boolean includePaymentSheetNextHandlers);

        Builder isInstantApp(boolean isInstantApp);

        Builder productUsage(Set<String> productUsage);

        Builder publishableKeyProvider(Function0<String> publishableKeyProvider);

        Builder threeDs1IntentReturnUrlMap(Map<String, String> threeDs1IntentReturnUrlMap);

        Builder uiContext(CoroutineContext uiContext);

        Builder workContext(CoroutineContext workContext);
    }

    DefaultPaymentNextActionHandlerRegistry getRegistry();
}
