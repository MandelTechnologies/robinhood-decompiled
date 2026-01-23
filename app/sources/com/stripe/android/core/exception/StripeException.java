package com.stripe.android.core.exception;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.APIConnectionException;
import java.io.IOException;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.json.JSONException;

/* compiled from: StripeException.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0006\b&\u0018\u0000 \u001e2\u00060\u0001j\u0002`\u0002:\u0001\u001eB?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\b\u0010\u0016\u001a\u00020\u0006H\u0017J\u0013\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\bH\u0016J\b\u0010\u001b\u001a\u00020\u0006H\u0016J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0000H\u0002R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, m3636d2 = {"Lcom/stripe/android/core/exception/StripeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "stripeError", "Lcom/stripe/android/core/StripeError;", "requestId", "", "statusCode", "", "cause", "", "message", "(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V", "isClientError", "", "()Z", "getRequestId", "()Ljava/lang/String;", "getStatusCode", "()I", "getStripeError", "()Lcom/stripe/android/core/StripeError;", "analyticsValue", "equals", "other", "", "hashCode", "toString", "typedEquals", "ex", "Companion", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public abstract class StripeException extends Exception {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isClientError;
    private final String requestId;
    private final int statusCode;
    private final StripeError stripeError;

    public StripeException() {
        this(null, null, 0, null, null, 31, null);
    }

    public final StripeError getStripeError() {
        return this.stripeError;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StripeException(StripeError stripeError, String str, int i, Throwable th, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        stripeError = (i2 & 1) != 0 ? null : stripeError;
        this(stripeError, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : th, (i2 & 16) != 0 ? stripeError != null ? stripeError.getMessage() : null : str2);
    }

    public StripeException(StripeError stripeError, String str, int i, Throwable th, String str2) {
        super(str2, th);
        this.stripeError = stripeError;
        this.requestId = str;
        this.statusCode = i;
        boolean z = false;
        if (400 <= i && i < 500) {
            z = true;
        }
        this.isClientError = z;
    }

    /* renamed from: isClientError, reason: from getter */
    public final boolean getIsClientError() {
        return this.isClientError;
    }

    public String analyticsValue() {
        return "stripeException";
    }

    @Override // java.lang.Throwable
    public String toString() {
        String str;
        String str2 = this.requestId;
        if (str2 != null) {
            str = "Request-id: " + str2;
        } else {
            str = null;
        }
        return CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{str, super.toString()}), "\n", null, null, 0, null, null, 62, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof StripeException) {
            return typedEquals((StripeException) other);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.stripeError, this.requestId, Integer.valueOf(this.statusCode), getMessage());
    }

    private final boolean typedEquals(StripeException ex) {
        return Intrinsics.areEqual(this.stripeError, ex.stripeError) && Intrinsics.areEqual(this.requestId, ex.requestId) && this.statusCode == ex.statusCode && Intrinsics.areEqual(getMessage(), ex.getMessage());
    }

    /* compiled from: StripeException.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/core/exception/StripeException$Companion;", "", "()V", "DEFAULT_STATUS_CODE", "", "analyticsValueForThrowable", "", "throwable", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/stripe/android/core/exception/StripeException;", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final StripeException create(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            if (throwable instanceof StripeException) {
                return (StripeException) throwable;
            }
            if (throwable instanceof JSONException) {
                return new APIException(throwable);
            }
            if (throwable instanceof IOException) {
                return APIConnectionException.Companion.create$default(APIConnectionException.INSTANCE, (IOException) throwable, null, 2, null);
            }
            if (throwable instanceof IllegalArgumentException) {
                return new InvalidRequestException(null, null, 0, throwable.getMessage(), throwable, 7, null);
            }
            return new GenericStripeException(throwable, analyticsValueForThrowable(throwable));
        }

        private final String analyticsValueForThrowable(Throwable throwable) {
            Class<?> cls = throwable.getClass();
            String name = cls.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (!StringsKt.startsWith$default(name, "android.", false, 2, (Object) null)) {
                String name2 = cls.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                if (!StringsKt.startsWith$default(name2, "java.", false, 2, (Object) null)) {
                    return null;
                }
            }
            return cls.getName();
        }
    }
}
