package com.truelayer.payments.core.logger;

import com.singular.sdk.internal.Constants;
import com.truelayer.payments.core.domain.utils.Ok;
import com.truelayer.payments.core.domain.utils.Outcome;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Logger.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rJ$\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rJ\b\u0010\u000f\u001a\u00020\u0005H\u0002J$\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rJ\"\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0006J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0005J$\u0010\u0016\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rJ$\u0010\u0017\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rJJ\u0010\u0018\u001a\u00020\t*\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u0005H\u0002R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/truelayer/payments/core/logger/TLLogger;", "", "()V", "loggers", "Ljava/util/HashMap;", "", "Lcom/truelayer/payments/core/logger/Logger;", "Lkotlin/collections/HashMap;", "d", "", "message", "tag", "error", "", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "formatTag", Constants.RequestParamsKeys.PACKAGE_NAME_KEY, "register", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "key", "logger", "removeLogger", "v", "w", "log", "level", "Lcom/truelayer/payments/core/logger/LogLevel;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.core.logger.TLLogger, reason: use source file name */
/* loaded from: classes6.dex */
public final class Logger6 {
    public static final Logger6 INSTANCE;
    private static final HashMap<String, Logger> loggers;

    private Logger6() {
    }

    static {
        Logger6 logger6 = new Logger6();
        INSTANCE = logger6;
        loggers = new HashMap<>();
        logger6.register("TL-Android-Logger", AndroidLogger.INSTANCE);
    }

    private final void log(HashMap<String, Logger> map, AndroidLogger2 androidLogger2, String str, Throwable th, String str2) {
        Collection<Logger> collectionValues = map.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((Logger) it.next()).log(androidLogger2, str, th, str2);
        }
    }

    public final Outcome<Logger6, Throwable> register(String key, Logger logger) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(logger, "logger");
        return new Ok(this);
    }

    public final void removeLogger(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        loggers.remove(key);
    }

    private final String formatTag() {
        StackTraceElement methodStackTrace = Logger5.getMethodStackTrace();
        Intrinsics.checkNotNullExpressionValue(methodStackTrace, "access$getMethodStackTrace(...)");
        return Logger5.intoLogTag(methodStackTrace);
    }

    public static /* synthetic */ void v$default(Logger6 logger6, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = logger6.formatTag();
        }
        if ((i & 4) != 0) {
            th = null;
        }
        logger6.m3173v(str, str2, th);
    }

    /* renamed from: v */
    public final void m3173v(String message, String tag, Throwable error) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tag, "tag");
        log(loggers, AndroidLogger2.Verbose, tag, error, message);
    }

    public static /* synthetic */ void d$default(Logger6 logger6, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = logger6.formatTag();
        }
        if ((i & 4) != 0) {
            th = null;
        }
        logger6.m3170d(str, str2, th);
    }

    /* renamed from: d */
    public final void m3170d(String message, String tag, Throwable error) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tag, "tag");
        log(loggers, AndroidLogger2.Debug, tag, error, message);
    }

    public static /* synthetic */ void i$default(Logger6 logger6, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = logger6.formatTag();
        }
        if ((i & 4) != 0) {
            th = null;
        }
        logger6.m3172i(str, str2, th);
    }

    /* renamed from: i */
    public final void m3172i(String message, String tag, Throwable error) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tag, "tag");
        log(loggers, AndroidLogger2.Info, tag, error, message);
    }

    public static /* synthetic */ void w$default(Logger6 logger6, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = logger6.formatTag();
        }
        if ((i & 4) != 0) {
            th = null;
        }
        logger6.m3174w(str, str2, th);
    }

    /* renamed from: w */
    public final void m3174w(String message, String tag, Throwable error) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tag, "tag");
        log(loggers, AndroidLogger2.Warning, tag, error, message);
    }

    public static /* synthetic */ void e$default(Logger6 logger6, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = logger6.formatTag();
        }
        if ((i & 4) != 0) {
            th = null;
        }
        logger6.m3171e(str, str2, th);
    }

    /* renamed from: e */
    public final void m3171e(String message, String tag, Throwable error) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tag, "tag");
        log(loggers, AndroidLogger2.Error, tag, error, message);
    }
}
