package com.stripe.android.analytics;

import android.content.Context;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.utils.DurationProvider2;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;

/* compiled from: PaymentSessionEventReporterFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/analytics/PaymentSessionEventReporterFactory;", "", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/stripe/android/analytics/PaymentSessionEventReporter;", "context", "Landroid/content/Context;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class PaymentSessionEventReporterFactory {
    public static final PaymentSessionEventReporterFactory INSTANCE = new PaymentSessionEventReporterFactory();

    private PaymentSessionEventReporterFactory() {
    }

    public final PaymentSessionEventReporter create(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new DefaultPaymentSessionEventReporter(new DefaultAnalyticsRequestExecutor(Logger.INSTANCE.getInstance(false), Dispatchers.getIO()), new PaymentAnalyticsRequestFactory(context, PaymentConfiguration.INSTANCE.getInstance(context).getPublishableKey(), null, 4, null), DurationProvider2.INSTANCE.getInstance(), Dispatchers.getIO());
    }
}
