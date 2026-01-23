package com.robinhood.android.doc.p109ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LoggingUtil.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/CombinedDocumentType;", "", "log", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getLog", "()Ljava/lang/String;", "GOV_ID_SELFIE", "GOV_ID", "SELFIE", "OTHER", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.doc.ui.CombinedDocumentType, reason: use source file name */
/* loaded from: classes7.dex */
final class LoggingUtil {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LoggingUtil[] $VALUES;
    private final String log;
    public static final LoggingUtil GOV_ID_SELFIE = new LoggingUtil("GOV_ID_SELFIE", 0, "govid_selfie");
    public static final LoggingUtil GOV_ID = new LoggingUtil("GOV_ID", 1, "govid");
    public static final LoggingUtil SELFIE = new LoggingUtil("SELFIE", 2, "selfie");
    public static final LoggingUtil OTHER = new LoggingUtil("OTHER", 3, "other");

    private static final /* synthetic */ LoggingUtil[] $values() {
        return new LoggingUtil[]{GOV_ID_SELFIE, GOV_ID, SELFIE, OTHER};
    }

    public static EnumEntries<LoggingUtil> getEntries() {
        return $ENTRIES;
    }

    private LoggingUtil(String str, int i, String str2) {
        this.log = str2;
    }

    public final String getLog() {
        return this.log;
    }

    static {
        LoggingUtil[] loggingUtilArr$values = $values();
        $VALUES = loggingUtilArr$values;
        $ENTRIES = EnumEntries2.enumEntries(loggingUtilArr$values);
    }

    public static LoggingUtil valueOf(String str) {
        return (LoggingUtil) Enum.valueOf(LoggingUtil.class, str);
    }

    public static LoggingUtil[] values() {
        return (LoggingUtil[]) $VALUES.clone();
    }
}
