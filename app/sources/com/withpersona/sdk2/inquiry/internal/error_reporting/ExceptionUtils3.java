package com.withpersona.sdk2.inquiry.internal.error_reporting;

import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExceptionUtils.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u001a\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0010\u0010\f\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"errorHandler", "Lcom/withpersona/sdk2/inquiry/internal/error_reporting/ErrorHandler;", "getErrorHandler", "context", "Landroid/content/Context;", "registerExceptionHandler", "", "directoriesToDeleteOnError", "", "Ljava/io/File;", "unregisterExceptionHandler", "clearLastError", "createAndSetErrorHandler", "inquiry-internal_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.internal.error_reporting.ExceptionUtilsKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class ExceptionUtils3 {
    private static ErrorHandler errorHandler;

    public static final ErrorHandler getErrorHandler(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ErrorHandler errorHandler2 = errorHandler;
        return errorHandler2 == null ? createAndSetErrorHandler(context) : errorHandler2;
    }

    public static final void registerExceptionHandler(Context context, List<? extends File> directoriesToDeleteOnError) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(directoriesToDeleteOnError, "directoriesToDeleteOnError");
        ErrorHandler errorHandler2 = getErrorHandler(context);
        errorHandler2.registerExceptionHandler();
        errorHandler2.setDirectoriesToDeleteOnError(directoriesToDeleteOnError);
    }

    public static final void unregisterExceptionHandler(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        getErrorHandler(context).unregisterExceptionHandler();
    }

    public static final void clearLastError(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        getErrorHandler(context).clearLastError();
    }

    private static final synchronized ErrorHandler createAndSetErrorHandler(Context context) {
        ErrorHandler errorHandler2 = errorHandler;
        if (errorHandler2 != null) {
            return errorHandler2;
        }
        ErrorHandler errorHandler3 = new ErrorHandler(context);
        errorHandler = errorHandler3;
        return errorHandler3;
    }
}
