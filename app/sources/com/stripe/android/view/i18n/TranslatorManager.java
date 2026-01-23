package com.stripe.android.view.i18n;

import com.stripe.android.core.StripeError;
import kotlin.Metadata;

/* compiled from: TranslatorManager.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, m3636d2 = {"Lcom/stripe/android/view/i18n/TranslatorManager;", "", "<init>", "()V", "Lcom/stripe/android/view/i18n/ErrorMessageTranslator;", "getErrorMessageTranslator", "()Lcom/stripe/android/view/i18n/ErrorMessageTranslator;", "Lcom/stripe/android/view/i18n/TranslatorManager$Default;", "DEFAULT_ERROR_MESSAGE_TRANSLATOR", "Lcom/stripe/android/view/i18n/TranslatorManager$Default;", "errorMessageTranslator", "Lcom/stripe/android/view/i18n/ErrorMessageTranslator;", "Default", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class TranslatorManager {
    private static ErrorMessageTranslator errorMessageTranslator;
    public static final TranslatorManager INSTANCE = new TranslatorManager();
    private static final Default DEFAULT_ERROR_MESSAGE_TRANSLATOR = new Default();
    public static final int $stable = 8;

    private TranslatorManager() {
    }

    public final ErrorMessageTranslator getErrorMessageTranslator() {
        ErrorMessageTranslator errorMessageTranslator2 = errorMessageTranslator;
        return errorMessageTranslator2 == null ? DEFAULT_ERROR_MESSAGE_TRANSLATOR : errorMessageTranslator2;
    }

    /* compiled from: TranslatorManager.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, m3636d2 = {"Lcom/stripe/android/view/i18n/TranslatorManager$Default;", "Lcom/stripe/android/view/i18n/ErrorMessageTranslator;", "()V", "translate", "", "httpCode", "", "errorMessage", "stripeError", "Lcom/stripe/android/core/StripeError;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Default implements ErrorMessageTranslator {
        @Override // com.stripe.android.view.i18n.ErrorMessageTranslator
        public String translate(int httpCode, String errorMessage, StripeError stripeError) {
            return errorMessage == null ? "" : errorMessage;
        }
    }
}
