package com.stripe.android.payments.core.analytics;

import android.content.Context;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: ErrorReporter.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterComponent;", "", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "getErrorReporter", "()Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "Builder", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.payments.core.analytics.DefaultErrorReporterComponent, reason: use source file name */
/* loaded from: classes22.dex */
public interface ErrorReporter2 {

    /* compiled from: ErrorReporter.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0018\u0010\u0006\u001a\u00020\u00002\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterComponent$Builder;", "", "build", "Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterComponent;", "context", "Landroid/content/Context;", "productUsage", "", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.stripe.android.payments.core.analytics.DefaultErrorReporterComponent$Builder */
    public interface Builder {
        ErrorReporter2 build();

        Builder context(Context context);

        Builder productUsage(Set<String> productUsage);
    }

    ErrorReporter getErrorReporter();
}
