package kotlinx.datetime.format;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DateTimeFormat.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lkotlinx/datetime/format/Padding;", "", "(Ljava/lang/String;I)V", "NONE", "ZERO", "SPACE", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: kotlinx.datetime.format.Padding, reason: use source file name */
/* loaded from: classes14.dex */
public final class DateTimeFormat3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DateTimeFormat3[] $VALUES;
    public static final DateTimeFormat3 NONE = new DateTimeFormat3("NONE", 0);
    public static final DateTimeFormat3 ZERO = new DateTimeFormat3("ZERO", 1);
    public static final DateTimeFormat3 SPACE = new DateTimeFormat3("SPACE", 2);

    private static final /* synthetic */ DateTimeFormat3[] $values() {
        return new DateTimeFormat3[]{NONE, ZERO, SPACE};
    }

    public static EnumEntries<DateTimeFormat3> getEntries() {
        return $ENTRIES;
    }

    public static DateTimeFormat3 valueOf(String str) {
        return (DateTimeFormat3) Enum.valueOf(DateTimeFormat3.class, str);
    }

    public static DateTimeFormat3[] values() {
        return (DateTimeFormat3[]) $VALUES.clone();
    }

    private DateTimeFormat3(String str, int i) {
    }

    static {
        DateTimeFormat3[] dateTimeFormat3Arr$values = $values();
        $VALUES = dateTimeFormat3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(dateTimeFormat3Arr$values);
    }
}
