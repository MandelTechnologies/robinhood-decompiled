package com.stripe.android.core.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GenericStripeException.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0004\u001a\u00020\u0005H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/core/exception/GenericStripeException;", "Lcom/stripe/android/core/exception/StripeException;", "cause", "", "analyticsValue", "", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GenericStripeException extends StripeException {
    private final String analyticsValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericStripeException(Throwable cause, String str) {
        super(null, null, 0, cause, cause.getMessage(), 7, null);
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.analyticsValue = str;
    }

    @Override // com.stripe.android.core.exception.StripeException
    public String analyticsValue() {
        String str = this.analyticsValue;
        return str == null ? "unknown" : str;
    }
}
