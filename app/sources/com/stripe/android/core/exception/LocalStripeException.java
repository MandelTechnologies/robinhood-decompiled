package com.stripe.android.core.exception;

import kotlin.Metadata;

/* compiled from: LocalStripeException.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0004\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/core/exception/LocalStripeException;", "Lcom/stripe/android/core/exception/StripeException;", "", "displayMessage", "analyticsValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/lang/String;", "Ljava/lang/String;", "getDisplayMessage", "getAnalyticsValue", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class LocalStripeException extends StripeException {
    private final String analyticsValue;
    private final String displayMessage;

    public LocalStripeException(String str, String str2) {
        super(null, null, 0, null, str, 15, null);
        this.displayMessage = str;
        this.analyticsValue = str2;
    }

    @Override // com.stripe.android.core.exception.StripeException
    public String analyticsValue() {
        String str = this.analyticsValue;
        return str == null ? "unknown" : str;
    }
}
