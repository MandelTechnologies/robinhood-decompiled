package com.truelayer.payments.core.logger;

import kotlin.Metadata;

/* compiled from: Logger.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\nH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000e"}, m3636d2 = {"Lcom/truelayer/payments/core/logger/Logger;", "", "logLevel", "Lcom/truelayer/payments/core/logger/LogLevel;", "getLogLevel", "()Lcom/truelayer/payments/core/logger/LogLevel;", "log", "", "level", "tag", "", "error", "", "message", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface Logger {
    AndroidLogger2 getLogLevel();

    void log(AndroidLogger2 level, String tag, Throwable error, String message);

    /* compiled from: Logger.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void log$default(Logger logger, AndroidLogger2 androidLogger2, String str, Throwable th, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
            }
            if ((i & 4) != 0) {
                th = null;
            }
            logger.log(androidLogger2, str, th, str2);
        }
    }
}
