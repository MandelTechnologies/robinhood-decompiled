package com.robinhood.analytics.converter;

import com.robinhood.rosetta.eventlogging.LoggingEvent;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LoggingEventConverter.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/analytics/converter/LoggingEventConverter;", "", "<init>", "()V", "byteArrayToLoggingEvent", "Lcom/robinhood/rosetta/eventlogging/LoggingEvent;", "byteArray", "", "loggingEventToByteArray", "loggingEvent", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class LoggingEventConverter {
    public static final LoggingEventConverter INSTANCE = new LoggingEventConverter();

    private LoggingEventConverter() {
    }

    @JvmStatic
    public static final LoggingEvent byteArrayToLoggingEvent(byte[] byteArray) {
        if (byteArray != null) {
            return LoggingEvent.ADAPTER.decode(byteArray);
        }
        return null;
    }

    @JvmStatic
    public static final byte[] loggingEventToByteArray(LoggingEvent loggingEvent) {
        if (loggingEvent != null) {
            return LoggingEvent.ADAPTER.encode(loggingEvent);
        }
        return null;
    }
}
