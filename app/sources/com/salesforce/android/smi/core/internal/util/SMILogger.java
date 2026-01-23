package com.salesforce.android.smi.core.internal.util;

import com.robinhood.android.util.notification.RhGcmListenerService;
import com.salesforce.android.smi.core.LogCategory;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SMILogger.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR0\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000ej\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/salesforce/android/smi/core/internal/util/SMILogger;", "", "<init>", "()V", "Lcom/salesforce/android/smi/core/LogCategory;", RhGcmListenerService.EXTRA_CATEGORY, "Ljava/util/logging/Logger;", "getLogger", "(Lcom/salesforce/android/smi/core/LogCategory;)Ljava/util/logging/Logger;", "Ljava/util/logging/Level;", "level", "", "setLevel", "(Ljava/util/logging/Level;Lcom/salesforce/android/smi/core/LogCategory;)V", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "loggers", "Ljava/util/HashMap;", "kotlin.jvm.PlatformType", "defaultLevel", "Ljava/util/logging/Level;", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class SMILogger {
    public static final SMILogger INSTANCE = new SMILogger();
    private static final HashMap<LogCategory, Logger> loggers = new HashMap<>();
    private static final Level defaultLevel = Level.INFO;

    private SMILogger() {
    }

    static {
        for (LogCategory logCategory : LogCategory.getEntries()) {
            loggers.put(logCategory, Logger.getLogger(logCategory == LogCategory.SMI ? "com.salesforce.android.smi" : "com.salesforce.android.smi." + logCategory.getPackageName()));
        }
        SMILogger sMILogger = INSTANCE;
        Level defaultLevel2 = defaultLevel;
        Intrinsics.checkNotNullExpressionValue(defaultLevel2, "defaultLevel");
        setLevel$default(sMILogger, defaultLevel2, null, 2, null);
    }

    private final Logger getLogger(LogCategory category) {
        Logger logger = loggers.get(category);
        if (logger != null) {
            return logger;
        }
        Logger logger2 = Logger.getLogger("com.salesforce.android.smi");
        Intrinsics.checkNotNullExpressionValue(logger2, "getLogger(...)");
        return logger2;
    }

    public static /* synthetic */ void setLevel$default(SMILogger sMILogger, Level level, LogCategory logCategory, int i, Object obj) throws SecurityException {
        if ((i & 2) != 0) {
            logCategory = LogCategory.SMI;
        }
        sMILogger.setLevel(level, logCategory);
    }

    public final void setLevel(Level level, LogCategory category) throws SecurityException {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(category, "category");
        getLogger(category).setLevel(level);
    }
}
