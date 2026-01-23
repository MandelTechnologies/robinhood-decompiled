package com.stripe.android.core.exception;

import com.stripe.android.core.StripeError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: InvalidRequestException.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0005H\u0017¨\u0006\r"}, m3636d2 = {"Lcom/stripe/android/core/exception/InvalidRequestException;", "Lcom/stripe/android/core/exception/StripeException;", "stripeError", "Lcom/stripe/android/core/StripeError;", "requestId", "", "statusCode", "", "message", "cause", "", "(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "analyticsValue", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InvalidRequestException extends StripeException {
    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InvalidRequestException(StripeError stripeError, String str, int i, String str2, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        stripeError = (i2 & 1) != 0 ? null : stripeError;
        this(stripeError, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? stripeError != null ? stripeError.getMessage() : null : str2, (i2 & 16) != 0 ? null : th);
    }

    public InvalidRequestException(StripeError stripeError, String str, int i, String str2, Throwable th) {
        super(stripeError, str, i, th, str2);
    }

    @Override // com.stripe.android.core.exception.StripeException
    public String analyticsValue() {
        return "invalidRequestError";
    }
}
