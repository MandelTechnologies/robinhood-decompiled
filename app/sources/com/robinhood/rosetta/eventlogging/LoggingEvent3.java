package com.robinhood.rosetta.eventlogging;

import android.annotation.SuppressLint;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;
import p479j$.time.ZoneOffset;
import p479j$.time.format.DateTimeFormatter;

/* compiled from: LoggingEvent.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\b\u001aA\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aI\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016\u001aC\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001a\u0010\u001b\"\u001c\u0010\u001e\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0015\u0010\"\u001a\u00020\u001c*\u00020\f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppEvent;", "event", "Lcom/robinhood/rosetta/eventlogging/User;", "user", "Lcom/robinhood/rosetta/eventlogging/Application;", "app", "Lcom/robinhood/rosetta/eventlogging/Device;", "device", "j$/time/Instant", "timestamp", "Lcom/robinhood/rosetta/eventlogging/NetworkConnection;", "network_connection", "Lcom/robinhood/rosetta/eventlogging/LoggingEvent;", "LoggingEvent", "(Lcom/robinhood/rosetta/eventlogging/AppEvent;Lcom/robinhood/rosetta/eventlogging/User;Lcom/robinhood/rosetta/eventlogging/Application;Lcom/robinhood/rosetta/eventlogging/Device;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/NetworkConnection;)Lcom/robinhood/rosetta/eventlogging/LoggingEvent;", "Lcom/robinhood/rosetta/eventlogging/NcwAppEvent;", "", "veritasDeviceId", "walletId", "networkConnection", "Lcom/robinhood/rosetta/eventlogging/NcwLoggingEvent;", "createNcwLoggingEvent", "(Lcom/robinhood/rosetta/eventlogging/NcwAppEvent;Lcom/robinhood/rosetta/eventlogging/Application;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Device;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/NetworkConnection;)Lcom/robinhood/rosetta/eventlogging/NcwLoggingEvent;", "Lcom/robinhood/rosetta/eventlogging/RhGlobalAppEvent;", "appEvent", "Lcom/robinhood/rosetta/eventlogging/RhGlobalLoggingEvent;", "createRhGlobalLoggingEventBuilder", "(Lcom/robinhood/rosetta/eventlogging/RhGlobalAppEvent;Lcom/robinhood/rosetta/eventlogging/User;Lcom/robinhood/rosetta/eventlogging/Application;Lcom/robinhood/rosetta/eventlogging/Device;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/NetworkConnection;)Lcom/robinhood/rosetta/eventlogging/RhGlobalLoggingEvent;", "j$/time/format/DateTimeFormatter", "kotlin.jvm.PlatformType", "formatter", "Lj$/time/format/DateTimeFormatter;", "getTimestampFormatter", "(Lcom/robinhood/rosetta/eventlogging/LoggingEvent;)Lj$/time/format/DateTimeFormatter;", "timestampFormatter", "lib-rosetta_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rosetta.eventlogging.LoggingEventKt, reason: use source file name */
/* loaded from: classes19.dex */
public final class LoggingEvent3 {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS").withLocale(Locale.US).withZone(ZoneOffset.UTC);

    public static final DateTimeFormatter getTimestampFormatter(LoggingEvent loggingEvent) {
        Intrinsics.checkNotNullParameter(loggingEvent, "<this>");
        DateTimeFormatter formatter2 = formatter;
        Intrinsics.checkNotNullExpressionValue(formatter2, "formatter");
        return formatter2;
    }

    @SuppressLint({"UnsafeTemporalApi"})
    public static final LoggingEvent LoggingEvent(AppEvent event, User user, Application app, Device device, Instant timestamp, NetworkConnection network_connection) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(network_connection, "network_connection");
        String str = formatter.format(timestamp);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return new LoggingEvent(user, device, app, event, str, null, null, null, null, 0, network_connection, null, null, null, 15328, null);
    }

    public static final NcwLoggingEvent createNcwLoggingEvent(NcwAppEvent event, Application app, String str, String str2, Device device, Instant timestamp, NetworkConnection networkConnection) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(networkConnection, "networkConnection");
        String str3 = str == null ? "" : str;
        String str4 = str2 == null ? "" : str2;
        String str5 = formatter.format(timestamp);
        Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
        return new NcwLoggingEvent(device, app, event, str5, null, null, null, null, 0, networkConnection, str3, str4, null, 4592, null);
    }

    public static /* synthetic */ RhGlobalLoggingEvent createRhGlobalLoggingEventBuilder$default(RhGlobalAppEvent rhGlobalAppEvent, User user, Application application, Device device, Instant instant, NetworkConnection networkConnection, int i, Object obj) {
        if ((i & 32) != 0) {
            networkConnection = null;
        }
        return createRhGlobalLoggingEventBuilder(rhGlobalAppEvent, user, application, device, instant, networkConnection);
    }

    public static final RhGlobalLoggingEvent createRhGlobalLoggingEventBuilder(RhGlobalAppEvent appEvent, User user, Application app, Device device, Instant timestamp, NetworkConnection networkConnection) {
        Intrinsics.checkNotNullParameter(appEvent, "appEvent");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        String str = formatter.format(timestamp);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return new RhGlobalLoggingEvent(user, device, app, appEvent, str, null, null, null, null, 0, networkConnection, null, null, null, 15328, null);
    }
}
