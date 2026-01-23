package com.truelayer.payments.core.logger;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AndroidLogger.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m3636d2 = {"Lcom/truelayer/payments/core/logger/LogLevel;", "", "priority", "", "(Ljava/lang/String;II)V", "getPriority", "()I", "Verbose", "Debug", "Info", "Warning", "Error", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.core.logger.LogLevel, reason: use source file name */
/* loaded from: classes6.dex */
public final class AndroidLogger2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AndroidLogger2[] $VALUES;
    private final int priority;
    public static final AndroidLogger2 Verbose = new AndroidLogger2("Verbose", 0, 2);
    public static final AndroidLogger2 Debug = new AndroidLogger2("Debug", 1, 3);
    public static final AndroidLogger2 Info = new AndroidLogger2("Info", 2, 4);
    public static final AndroidLogger2 Warning = new AndroidLogger2("Warning", 3, 5);
    public static final AndroidLogger2 Error = new AndroidLogger2("Error", 4, 6);

    private static final /* synthetic */ AndroidLogger2[] $values() {
        return new AndroidLogger2[]{Verbose, Debug, Info, Warning, Error};
    }

    public static EnumEntries<AndroidLogger2> getEntries() {
        return $ENTRIES;
    }

    public static AndroidLogger2 valueOf(String str) {
        return (AndroidLogger2) Enum.valueOf(AndroidLogger2.class, str);
    }

    public static AndroidLogger2[] values() {
        return (AndroidLogger2[]) $VALUES.clone();
    }

    private AndroidLogger2(String str, int i, int i2) {
        this.priority = i2;
    }

    public final int getPriority() {
        return this.priority;
    }

    static {
        AndroidLogger2[] androidLogger2Arr$values = $values();
        $VALUES = androidLogger2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(androidLogger2Arr$values);
    }
}
