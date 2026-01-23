package com.stripe.android.core.exception;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExceptionUtils.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m3636d2 = {"", "", "getSafeAnalyticsMessage", "(Ljava/lang/Throwable;)Ljava/lang/String;", "safeAnalyticsMessage", "stripe-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.core.exception.ExceptionUtilsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class ExceptionUtils2 {
    public static final String getSafeAnalyticsMessage(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        return th instanceof StripeException ? ((StripeException) th).analyticsValue() : th instanceof IOException ? "ioException" : "unknown";
    }
}
