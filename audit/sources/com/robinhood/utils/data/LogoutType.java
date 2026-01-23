package com.robinhood.utils.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LogoutType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/utils/data/LogoutType;", "", "<init>", "(Ljava/lang/String;I)V", "USER_INITIATED", "HTTP_401", "OTHER", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class LogoutType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LogoutType[] $VALUES;
    public static final LogoutType USER_INITIATED = new LogoutType("USER_INITIATED", 0);
    public static final LogoutType HTTP_401 = new LogoutType("HTTP_401", 1);
    public static final LogoutType OTHER = new LogoutType("OTHER", 2);

    private static final /* synthetic */ LogoutType[] $values() {
        return new LogoutType[]{USER_INITIATED, HTTP_401, OTHER};
    }

    public static EnumEntries<LogoutType> getEntries() {
        return $ENTRIES;
    }

    private LogoutType(String str, int i) {
    }

    static {
        LogoutType[] logoutTypeArr$values = $values();
        $VALUES = logoutTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(logoutTypeArr$values);
    }

    public static LogoutType valueOf(String str) {
        return (LogoutType) Enum.valueOf(LogoutType.class, str);
    }

    public static LogoutType[] values() {
        return (LogoutType[]) $VALUES.clone();
    }
}
