package co.touchlab.kermit;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Severity.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lco/touchlab/kermit/Severity;", "", "(Ljava/lang/String;I)V", "Verbose", "Debug", "Info", "Warn", "Error", "Assert", "kermit-core_debug"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class Severity {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Severity[] $VALUES;
    public static final Severity Verbose = new Severity("Verbose", 0);
    public static final Severity Debug = new Severity("Debug", 1);
    public static final Severity Info = new Severity("Info", 2);
    public static final Severity Warn = new Severity("Warn", 3);
    public static final Severity Error = new Severity("Error", 4);
    public static final Severity Assert = new Severity("Assert", 5);

    private static final /* synthetic */ Severity[] $values() {
        return new Severity[]{Verbose, Debug, Info, Warn, Error, Assert};
    }

    public static EnumEntries<Severity> getEntries() {
        return $ENTRIES;
    }

    public static Severity valueOf(String str) {
        return (Severity) Enum.valueOf(Severity.class, str);
    }

    public static Severity[] values() {
        return (Severity[]) $VALUES.clone();
    }

    private Severity(String str, int i) {
    }

    static {
        Severity[] severityArr$values = $values();
        $VALUES = severityArr$values;
        $ENTRIES = EnumEntries2.enumEntries(severityArr$values);
    }
}
