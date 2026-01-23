package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.edit;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InvestingMonitorActionsBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/edit/DisplayAction;", "", "<init>", "(Ljava/lang/String;I)V", "MAIN", "RENAME", "EDIT_TABS", "DELETE_CONFIRMATION", "DISPLAY_DATA", "feature-investing-monitor_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class DisplayAction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DisplayAction[] $VALUES;
    public static final DisplayAction MAIN = new DisplayAction("MAIN", 0);
    public static final DisplayAction RENAME = new DisplayAction("RENAME", 1);
    public static final DisplayAction EDIT_TABS = new DisplayAction("EDIT_TABS", 2);
    public static final DisplayAction DELETE_CONFIRMATION = new DisplayAction("DELETE_CONFIRMATION", 3);
    public static final DisplayAction DISPLAY_DATA = new DisplayAction("DISPLAY_DATA", 4);

    private static final /* synthetic */ DisplayAction[] $values() {
        return new DisplayAction[]{MAIN, RENAME, EDIT_TABS, DELETE_CONFIRMATION, DISPLAY_DATA};
    }

    public static EnumEntries<DisplayAction> getEntries() {
        return $ENTRIES;
    }

    private DisplayAction(String str, int i) {
    }

    static {
        DisplayAction[] displayActionArr$values = $values();
        $VALUES = displayActionArr$values;
        $ENTRIES = EnumEntries2.enumEntries(displayActionArr$values);
    }

    public static DisplayAction valueOf(String str) {
        return (DisplayAction) Enum.valueOf(DisplayAction.class, str);
    }

    public static DisplayAction[] values() {
        return (DisplayAction[]) $VALUES.clone();
    }
}
