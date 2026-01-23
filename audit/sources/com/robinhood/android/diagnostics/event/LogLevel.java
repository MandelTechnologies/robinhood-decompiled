package com.robinhood.android.diagnostics.event;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LogLevel.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/event/LogLevel;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LOG_LEVEL_UNSPECIFIED", "LOG_LEVEL_OTHER", "LOG_LEVEL_VERBOSE", "LOG_LEVEL_DEBUG", "LOG_LEVEL_INFO", "LOG_LEVEL_WARN", "LOG_LEVEL_ERROR", "LOG_LEVEL_ASSERT", "Companion", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class LogLevel implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LogLevel[] $VALUES;

    @JvmField
    public static final ProtoAdapter<LogLevel> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final LogLevel LOG_LEVEL_ASSERT;
    public static final LogLevel LOG_LEVEL_DEBUG;
    public static final LogLevel LOG_LEVEL_ERROR;
    public static final LogLevel LOG_LEVEL_INFO;
    public static final LogLevel LOG_LEVEL_OTHER;
    public static final LogLevel LOG_LEVEL_UNSPECIFIED;
    public static final LogLevel LOG_LEVEL_VERBOSE;
    public static final LogLevel LOG_LEVEL_WARN;
    private final int value;

    private static final /* synthetic */ LogLevel[] $values() {
        return new LogLevel[]{LOG_LEVEL_UNSPECIFIED, LOG_LEVEL_OTHER, LOG_LEVEL_VERBOSE, LOG_LEVEL_DEBUG, LOG_LEVEL_INFO, LOG_LEVEL_WARN, LOG_LEVEL_ERROR, LOG_LEVEL_ASSERT};
    }

    @JvmStatic
    public static final LogLevel fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<LogLevel> getEntries() {
        return $ENTRIES;
    }

    private LogLevel(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final LogLevel logLevel = new LogLevel("LOG_LEVEL_UNSPECIFIED", 0, 0);
        LOG_LEVEL_UNSPECIFIED = logLevel;
        LOG_LEVEL_OTHER = new LogLevel("LOG_LEVEL_OTHER", 1, 1);
        LOG_LEVEL_VERBOSE = new LogLevel("LOG_LEVEL_VERBOSE", 2, 2);
        LOG_LEVEL_DEBUG = new LogLevel("LOG_LEVEL_DEBUG", 3, 3);
        LOG_LEVEL_INFO = new LogLevel("LOG_LEVEL_INFO", 4, 4);
        LOG_LEVEL_WARN = new LogLevel("LOG_LEVEL_WARN", 5, 5);
        LOG_LEVEL_ERROR = new LogLevel("LOG_LEVEL_ERROR", 6, 6);
        LOG_LEVEL_ASSERT = new LogLevel("LOG_LEVEL_ASSERT", 7, 7);
        LogLevel[] logLevelArr$values = $values();
        $VALUES = logLevelArr$values;
        $ENTRIES = EnumEntries2.enumEntries(logLevelArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LogLevel.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<LogLevel>(orCreateKotlinClass, syntax, logLevel) { // from class: com.robinhood.android.diagnostics.event.LogLevel$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public LogLevel fromValue(int value) {
                return LogLevel.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: LogLevel.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/event/LogLevel$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/android/diagnostics/event/LogLevel;", "fromValue", "value", "", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final LogLevel fromValue(int value) {
            switch (value) {
                case 0:
                    return LogLevel.LOG_LEVEL_UNSPECIFIED;
                case 1:
                    return LogLevel.LOG_LEVEL_OTHER;
                case 2:
                    return LogLevel.LOG_LEVEL_VERBOSE;
                case 3:
                    return LogLevel.LOG_LEVEL_DEBUG;
                case 4:
                    return LogLevel.LOG_LEVEL_INFO;
                case 5:
                    return LogLevel.LOG_LEVEL_WARN;
                case 6:
                    return LogLevel.LOG_LEVEL_ERROR;
                case 7:
                    return LogLevel.LOG_LEVEL_ASSERT;
                default:
                    return null;
            }
        }
    }

    public static LogLevel valueOf(String str) {
        return (LogLevel) Enum.valueOf(LogLevel.class, str);
    }

    public static LogLevel[] values() {
        return (LogLevel[]) $VALUES.clone();
    }
}
