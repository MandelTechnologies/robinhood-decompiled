package com.stripe.android.stripe3ds2.exceptions;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SDKRuntimeException.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/exceptions/SDKRuntimeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "t", "", "(Ljava/lang/Throwable;)V", "message", "", "cause", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class SDKRuntimeException extends RuntimeException {
    public /* synthetic */ SDKRuntimeException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SDKRuntimeException(String message, Throwable th) {
        super(message, th);
        Intrinsics.checkNotNullParameter(message, "message");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SDKRuntimeException(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        String message = t.getMessage();
        this(message == null ? "" : message, t.getCause());
    }
}
