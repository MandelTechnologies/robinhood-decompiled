package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TabRow.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Landroidx/compose/material/TabSlots;", "", "(Ljava/lang/String;I)V", "Tabs", "Divider", "Indicator", "material_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
final class TabSlots {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TabSlots[] $VALUES;
    public static final TabSlots Tabs = new TabSlots("Tabs", 0);
    public static final TabSlots Divider = new TabSlots("Divider", 1);
    public static final TabSlots Indicator = new TabSlots("Indicator", 2);

    private static final /* synthetic */ TabSlots[] $values() {
        return new TabSlots[]{Tabs, Divider, Indicator};
    }

    public static EnumEntries<TabSlots> getEntries() {
        return $ENTRIES;
    }

    public static TabSlots valueOf(String str) {
        return (TabSlots) Enum.valueOf(TabSlots.class, str);
    }

    public static TabSlots[] values() {
        return (TabSlots[]) $VALUES.clone();
    }

    private TabSlots(String str, int i) {
    }

    static {
        TabSlots[] tabSlotsArr$values = $values();
        $VALUES = tabSlotsArr$values;
        $ENTRIES = EnumEntries2.enumEntries(tabSlotsArr$values);
    }
}
