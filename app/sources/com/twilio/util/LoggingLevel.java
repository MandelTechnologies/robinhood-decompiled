package com.twilio.util;

import java.util.logging.Level;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: LoggingLevel.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006\u0082\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/twilio/util/LoggingLevel;", "Ljava/util/logging/Level;", "name", "", "value", "", "(Ljava/lang/String;I)V", "DEBUG", "ERROR", "INFO", "VERBOSE", "WARN", "Lcom/twilio/util/LoggingLevel$DEBUG;", "Lcom/twilio/util/LoggingLevel$ERROR;", "Lcom/twilio/util/LoggingLevel$INFO;", "Lcom/twilio/util/LoggingLevel$VERBOSE;", "Lcom/twilio/util/LoggingLevel$WARN;", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class LoggingLevel extends Level {
    public /* synthetic */ LoggingLevel(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    /* compiled from: LoggingLevel.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/twilio/util/LoggingLevel$VERBOSE;", "Lcom/twilio/util/LoggingLevel;", "()V", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class VERBOSE extends LoggingLevel {
        public static final VERBOSE INSTANCE = new VERBOSE();

        private VERBOSE() {
            super("VERBOSE", Level.INFO.intValue(), null);
        }
    }

    private LoggingLevel(String str, int i) {
        super(str, i);
    }

    /* compiled from: LoggingLevel.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/twilio/util/LoggingLevel$DEBUG;", "Lcom/twilio/util/LoggingLevel;", "()V", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class DEBUG extends LoggingLevel {
        public static final DEBUG INSTANCE = new DEBUG();

        private DEBUG() {
            super("DEBUG", Level.INFO.intValue(), null);
        }
    }

    /* compiled from: LoggingLevel.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/twilio/util/LoggingLevel$INFO;", "Lcom/twilio/util/LoggingLevel;", "()V", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class INFO extends LoggingLevel {
        public static final INFO INSTANCE = new INFO();

        private INFO() {
            super("INFO", Level.INFO.intValue(), null);
        }
    }

    /* compiled from: LoggingLevel.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/twilio/util/LoggingLevel$WARN;", "Lcom/twilio/util/LoggingLevel;", "()V", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class WARN extends LoggingLevel {
        public static final WARN INSTANCE = new WARN();

        private WARN() {
            super("WARN", Level.WARNING.intValue(), null);
        }
    }

    /* compiled from: LoggingLevel.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/twilio/util/LoggingLevel$ERROR;", "Lcom/twilio/util/LoggingLevel;", "()V", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class ERROR extends LoggingLevel {
        public static final ERROR INSTANCE = new ERROR();

        private ERROR() {
            super("ERROR", Level.SEVERE.intValue(), null);
        }
    }
}
