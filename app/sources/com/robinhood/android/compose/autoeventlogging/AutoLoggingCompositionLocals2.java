package com.robinhood.android.compose.autoeventlogging;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.PerformanceIndicatorDispatcher;
import com.robinhood.android.performancelogger.PerformanceLogger;
import kotlin.Metadata;

/* compiled from: AutoLoggingCompositionLocals.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/compose/autoeventlogging/AutoLoggingEntryPoint;", "", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "performanceIndicatorDispatcherFactory", "Lcom/robinhood/android/compose/autoeventlogging/PerformanceIndicatorDispatcher$Factory;", "lib-compose-auto-event-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.compose.autoeventlogging.AutoLoggingEntryPoint, reason: use source file name */
/* loaded from: classes17.dex */
public interface AutoLoggingCompositionLocals2 {
    EventLogger eventLogger();

    PerformanceIndicatorDispatcher.Factory performanceIndicatorDispatcherFactory();

    PerformanceLogger performanceLogger();
}
