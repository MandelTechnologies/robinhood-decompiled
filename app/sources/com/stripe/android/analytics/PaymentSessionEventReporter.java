package com.stripe.android.analytics;

import kotlin.Metadata;

/* compiled from: PaymentSessionEventReporter.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00022\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00022\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H&¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0004J\u001b\u0010\f\u001a\u00020\u00022\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H&¢\u0006\u0004\b\f\u0010\t¨\u0006\r"}, m3636d2 = {"Lcom/stripe/android/analytics/PaymentSessionEventReporter;", "", "", "onLoadStarted", "()V", "", "Lcom/stripe/android/model/PaymentMethodCode;", "code", "onFormShown", "(Ljava/lang/String;)V", "onFormInteracted", "onCardNumberCompleted", "onDoneButtonTapped", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface PaymentSessionEventReporter {
    void onCardNumberCompleted();

    void onDoneButtonTapped(String code);

    void onFormInteracted(String code);

    void onFormShown(String code);

    void onLoadStarted();
}
