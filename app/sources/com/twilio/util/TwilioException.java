package com.twilio.util;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TwilioException.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/twilio/util/TwilioException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errorInfo", "Lcom/twilio/util/ErrorInfo;", "cause", "", "(Lcom/twilio/util/ErrorInfo;Ljava/lang/Throwable;)V", "getErrorInfo", "()Lcom/twilio/util/ErrorInfo;", "shared-public_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class TwilioException extends Exception {
    private final ErrorInfo errorInfo;

    public /* synthetic */ TwilioException(ErrorInfo errorInfo, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(errorInfo, (i & 2) != 0 ? null : th);
    }

    public final ErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwilioException(ErrorInfo errorInfo, Throwable th) {
        super(String.valueOf(errorInfo), th);
        Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
        this.errorInfo = errorInfo;
    }
}
