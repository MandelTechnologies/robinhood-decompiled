package com.withpersona.sdk2.inquiry.internal.error_reporting;

import android.content.Context;
import com.singular.sdk.internal.Constants;
import com.withpersona.sdk2.inquiry.error_reporting.ExceptionLogger;
import java.io.File;
import java.lang.Thread;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.FilesKt;

/* compiled from: ErrorHandler.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\bJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\bR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/error_reporting/ErrorHandler;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "registerExceptionHandler", "()V", "", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "recordError", "(Ljava/lang/Throwable;)V", "unregisterExceptionHandler", "clearLastError", "", "isExceptionHandlerRegistered", "Z", "isErrorHandlerEnabled", "Lcom/withpersona/sdk2/inquiry/error_reporting/ExceptionLogger;", "exceptionLogger", "Lcom/withpersona/sdk2/inquiry/error_reporting/ExceptionLogger;", "", "Ljava/io/File;", "directoriesToDeleteOnError", "Ljava/util/List;", "getDirectoriesToDeleteOnError", "()Ljava/util/List;", "setDirectoriesToDeleteOnError", "(Ljava/util/List;)V", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class ErrorHandler {
    private List<? extends File> directoriesToDeleteOnError;
    private final ExceptionLogger exceptionLogger;
    private boolean isErrorHandlerEnabled;
    private boolean isExceptionHandlerRegistered;

    public ErrorHandler(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.isErrorHandlerEnabled = true;
        this.exceptionLogger = new ExceptionLogger(context);
        this.directoriesToDeleteOnError = CollectionsKt.emptyList();
    }

    public final void setDirectoriesToDeleteOnError(List<? extends File> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.directoriesToDeleteOnError = list;
    }

    public final synchronized void registerExceptionHandler() {
        if (this.isExceptionHandlerRegistered) {
            return;
        }
        this.isExceptionHandlerRegistered = true;
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.withpersona.sdk2.inquiry.internal.error_reporting.ErrorHandler$$ExternalSyntheticLambda0
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                ErrorHandler.registerExceptionHandler$lambda$0(this.f$0, defaultUncaughtExceptionHandler, thread, th);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerExceptionHandler$lambda$0(ErrorHandler errorHandler, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
        Intrinsics.checkNotNull(th);
        errorHandler.recordError(th);
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            System.exit(1);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
    }

    public final void recordError(Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (this.isErrorHandlerEnabled) {
            try {
                this.exceptionLogger.logException(e);
            } catch (Exception unused) {
            }
            try {
                Iterator<T> it = this.directoriesToDeleteOnError.iterator();
                while (it.hasNext()) {
                    FilesKt.deleteRecursively((File) it.next());
                }
            } catch (Exception unused2) {
            }
        }
    }

    public final synchronized void unregisterExceptionHandler() {
        if (this.isExceptionHandlerRegistered) {
            this.isErrorHandlerEnabled = false;
        }
    }

    public final void clearLastError() {
        this.exceptionLogger.clearLastError();
    }
}
