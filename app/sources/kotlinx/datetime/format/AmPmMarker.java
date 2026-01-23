package kotlinx.datetime.format;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LocalTimeFormat.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lkotlinx/datetime/format/AmPmMarker;", "", "(Ljava/lang/String;I)V", "AM", "PM", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class AmPmMarker {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AmPmMarker[] $VALUES;

    /* renamed from: AM */
    public static final AmPmMarker f7052AM = new AmPmMarker("AM", 0);

    /* renamed from: PM */
    public static final AmPmMarker f7053PM = new AmPmMarker("PM", 1);

    private static final /* synthetic */ AmPmMarker[] $values() {
        return new AmPmMarker[]{f7052AM, f7053PM};
    }

    public static EnumEntries<AmPmMarker> getEntries() {
        return $ENTRIES;
    }

    public static AmPmMarker valueOf(String str) {
        return (AmPmMarker) Enum.valueOf(AmPmMarker.class, str);
    }

    public static AmPmMarker[] values() {
        return (AmPmMarker[]) $VALUES.clone();
    }

    private AmPmMarker(String str, int i) {
    }

    static {
        AmPmMarker[] amPmMarkerArr$values = $values();
        $VALUES = amPmMarkerArr$values;
        $ENTRIES = EnumEntries2.enumEntries(amPmMarkerArr$values);
    }
}
