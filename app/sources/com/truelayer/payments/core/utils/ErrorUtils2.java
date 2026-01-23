package com.truelayer.payments.core.utils;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: ErrorUtils.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\"\u0019\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"callerStackTrace", "Lkotlin/Function0;", "Ljava/lang/StackTraceElement;", "getCallerStackTrace", "()Lkotlin/jvm/functions/Function0;", "fileName", "", "getFileName", "()Ljava/lang/String;", "lineNumber", "", "getLineNumber", "()Ljava/lang/Integer;", "payments-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.core.utils.ErrorUtilsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class ErrorUtils2 {
    private static final Function0<StackTraceElement> callerStackTrace = new Function0<StackTraceElement>() { // from class: com.truelayer.payments.core.utils.ErrorUtilsKt$callerStackTrace$1
        @Override // kotlin.jvm.functions.Function0
        public final StackTraceElement invoke() {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace.length > 3) {
                return stackTrace[3];
            }
            return null;
        }
    };

    public static final Integer getLineNumber() {
        StackTraceElement stackTraceElementInvoke = callerStackTrace.invoke();
        if (stackTraceElementInvoke != null) {
            return Integer.valueOf(stackTraceElementInvoke.getLineNumber());
        }
        return null;
    }

    public static final String getFileName() {
        StackTraceElement stackTraceElementInvoke = callerStackTrace.invoke();
        if (stackTraceElementInvoke != null) {
            return stackTraceElementInvoke.getFileName();
        }
        return null;
    }

    public static final Function0<StackTraceElement> getCallerStackTrace() {
        return callerStackTrace;
    }
}
