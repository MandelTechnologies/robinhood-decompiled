package com.stripe.android.view.i18n;

import com.stripe.android.core.StripeError;
import kotlin.Metadata;

/* compiled from: ErrorMessageTranslator.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/view/i18n/ErrorMessageTranslator;", "", "translate", "", "httpCode", "", "errorMessage", "stripeError", "Lcom/stripe/android/core/StripeError;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface ErrorMessageTranslator {
    String translate(int httpCode, String errorMessage, StripeError stripeError);
}
