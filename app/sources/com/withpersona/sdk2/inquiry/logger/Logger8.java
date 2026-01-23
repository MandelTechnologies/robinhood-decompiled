package com.withpersona.sdk2.inquiry.logger;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Logger.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000eB\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/logger/SubsystemLogger;", "", "Lcom/withpersona/sdk2/inquiry/logger/Logger;", "logger", "", "subsystem", "<init>", "(Lcom/withpersona/sdk2/inquiry/logger/Logger;Ljava/lang/String;)V", "message", "", "error", "(Ljava/lang/String;)V", "Lcom/withpersona/sdk2/inquiry/logger/Logger;", "Ljava/lang/String;", "Factory", "logger_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.logger.SubsystemLogger, reason: use source file name */
/* loaded from: classes18.dex */
public final class Logger8 {
    private final Logger logger;
    private final String subsystem;

    /* compiled from: Logger.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/logger/SubsystemLogger$Factory;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/inquiry/logger/SubsystemLogger;", "subsystem", "", "logger_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.logger.SubsystemLogger$Factory */
    public interface Factory {
        Logger8 create(String subsystem);
    }

    public Logger8(Logger logger, String subsystem) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(subsystem, "subsystem");
        this.logger = logger;
        this.subsystem = subsystem;
    }

    public final void error(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.logger.log(this.subsystem, Logger7.Error, message);
    }
}
