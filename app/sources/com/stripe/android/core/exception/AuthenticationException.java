package com.stripe.android.core.exception;

import com.stripe.android.core.StripeError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AuthenticationException.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0005H\u0017¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/core/exception/AuthenticationException;", "Lcom/stripe/android/core/exception/StripeException;", "stripeError", "Lcom/stripe/android/core/StripeError;", "requestId", "", "(Lcom/stripe/android/core/StripeError;Ljava/lang/String;)V", "analyticsValue", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class AuthenticationException extends StripeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticationException(StripeError stripeError, String str) {
        super(stripeError, str, 401, null, null, 24, null);
        Intrinsics.checkNotNullParameter(stripeError, "stripeError");
    }

    @Override // com.stripe.android.core.exception.StripeException
    public String analyticsValue() {
        return "authError";
    }
}
