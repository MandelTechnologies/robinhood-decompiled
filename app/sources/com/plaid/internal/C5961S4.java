package com.plaid.internal;

import com.plaid.internal.C5953R5;
import java.lang.Thread;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;

@SourceDebugExtension
/* renamed from: com.plaid.internal.S4 */
/* loaded from: classes16.dex */
public final class C5961S4 {

    /* renamed from: a */
    public final C6029a0 f1685a;

    /* renamed from: b */
    public final C7112j0 f1686b;

    /* renamed from: c */
    public final C5885K2 f1687c;

    public C5961S4(C6029a0 crashReportFactory, C7112j0 crashWorkManager, C5885K2 interceptor) {
        Intrinsics.checkNotNullParameter(crashReportFactory, "crashReportFactory");
        Intrinsics.checkNotNullParameter(crashWorkManager, "crashWorkManager");
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.f1685a = crashReportFactory;
        this.f1686b = crashWorkManager;
        this.f1687c = interceptor;
    }

    /* renamed from: a */
    public final void m1311a() {
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.plaid.internal.S4$$ExternalSyntheticLambda0
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                C5961S4.m1310a(this.f$0, defaultUncaughtExceptionHandler, thread, th);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1310a(C5961S4 this$0, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread paramThread, Throwable paramThrowable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(paramThread);
        Intrinsics.checkNotNull(paramThrowable);
        this$0.getClass();
        Intrinsics.checkNotNullParameter(paramThread, "paramThread");
        Intrinsics.checkNotNullParameter(paramThrowable, "paramThrowable");
        Throwable cause = paramThrowable.getCause();
        if (cause != null) {
            StackTraceElement[] stackTrace = cause.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = className.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (!StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "com.plaid", false, 2, (Object) null)) {
                }
            }
            StackTraceElement[] stackTrace2 = paramThrowable.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace2, "getStackTrace(...)");
            for (StackTraceElement stackTraceElement2 : stackTrace2) {
                String className2 = stackTraceElement2.getClassName();
                Intrinsics.checkNotNullExpressionValue(className2, "getClassName(...)");
                Locale US2 = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                String lowerCase2 = className2.toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                if (!StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) "com.plaid", false, 2, (Object) null)) {
                }
            }
            if (uncaughtExceptionHandler == null) {
                uncaughtExceptionHandler.uncaughtException(paramThread, paramThrowable);
                return;
            } else {
                System.exit(2);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            }
        }
        StackTraceElement[] stackTrace22 = paramThrowable.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace22, "getStackTrace(...)");
        while (i < r8) {
        }
        if (uncaughtExceptionHandler == null) {
        }
        try {
            BuildersKt__BuildersKt.runBlocking$default(null, new C5952R4(this$0, paramThrowable, null), 1, null);
            if (this$0.f1687c.m1230a(paramThrowable)) {
                return;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(paramThread, paramThrowable);
            } else {
                System.exit(2);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            }
        } catch (Exception e) {
            C5953R5.a.m1301a(C5953R5.f1671a, e);
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(paramThread, paramThrowable);
            } else {
                System.exit(2);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            }
        }
    }
}
