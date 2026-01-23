package com.withpersona.sdk2.inquiry.logger;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Logger.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/logger/LogLevel;", "", "<init>", "(Ljava/lang/String;I)V", "Debug", "Warning", "Error", "logger_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.logger.LogLevel, reason: use source file name */
/* loaded from: classes18.dex */
public final class Logger7 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Logger7[] $VALUES;
    public static final Logger7 Debug = new Logger7("Debug", 0);
    public static final Logger7 Warning = new Logger7("Warning", 1);
    public static final Logger7 Error = new Logger7("Error", 2);

    private static final /* synthetic */ Logger7[] $values() {
        return new Logger7[]{Debug, Warning, Error};
    }

    public static EnumEntries<Logger7> getEntries() {
        return $ENTRIES;
    }

    private Logger7(String str, int i) {
    }

    static {
        Logger7[] logger7Arr$values = $values();
        $VALUES = logger7Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(logger7Arr$values);
    }

    public static Logger7 valueOf(String str) {
        return (Logger7) Enum.valueOf(Logger7.class, str);
    }

    public static Logger7[] values() {
        return (Logger7[]) $VALUES.clone();
    }
}
