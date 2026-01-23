package com.salesforce.android.smi.core;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LogCategory.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m3636d2 = {"Lcom/salesforce/android/smi/core/LogCategory;", "", "packageName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getPackageName", "()Ljava/lang/String;", "SMI", "COMMON", "NETWORK", "CORE", "UI", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class LogCategory {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LogCategory[] $VALUES;
    private final String packageName;
    public static final LogCategory SMI = new LogCategory("SMI", 0, "smi");
    public static final LogCategory COMMON = new LogCategory("COMMON", 1, "common");
    public static final LogCategory NETWORK = new LogCategory("NETWORK", 2, "network");
    public static final LogCategory CORE = new LogCategory("CORE", 3, "core");

    /* renamed from: UI */
    public static final LogCategory f6351UI = new LogCategory("UI", 4, "ui");

    private static final /* synthetic */ LogCategory[] $values() {
        return new LogCategory[]{SMI, COMMON, NETWORK, CORE, f6351UI};
    }

    public static EnumEntries<LogCategory> getEntries() {
        return $ENTRIES;
    }

    private LogCategory(String str, int i, String str2) {
        this.packageName = str2;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    static {
        LogCategory[] logCategoryArr$values = $values();
        $VALUES = logCategoryArr$values;
        $ENTRIES = EnumEntries2.enumEntries(logCategoryArr$values);
    }

    public static LogCategory valueOf(String str) {
        return (LogCategory) Enum.valueOf(LogCategory.class, str);
    }

    public static LogCategory[] values() {
        return (LogCategory[]) $VALUES.clone();
    }
}
