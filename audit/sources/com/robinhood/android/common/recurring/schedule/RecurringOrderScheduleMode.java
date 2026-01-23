package com.robinhood.android.common.recurring.schedule;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RecurringOrderScheduleMode.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleMode;", "", "<init>", "(Ljava/lang/String;I)V", "CREATE", "EDIT", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RecurringOrderScheduleMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RecurringOrderScheduleMode[] $VALUES;
    public static final RecurringOrderScheduleMode CREATE = new RecurringOrderScheduleMode("CREATE", 0);
    public static final RecurringOrderScheduleMode EDIT = new RecurringOrderScheduleMode("EDIT", 1);

    private static final /* synthetic */ RecurringOrderScheduleMode[] $values() {
        return new RecurringOrderScheduleMode[]{CREATE, EDIT};
    }

    public static EnumEntries<RecurringOrderScheduleMode> getEntries() {
        return $ENTRIES;
    }

    private RecurringOrderScheduleMode(String str, int i) {
    }

    static {
        RecurringOrderScheduleMode[] recurringOrderScheduleModeArr$values = $values();
        $VALUES = recurringOrderScheduleModeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(recurringOrderScheduleModeArr$values);
    }

    public static RecurringOrderScheduleMode valueOf(String str) {
        return (RecurringOrderScheduleMode) Enum.valueOf(RecurringOrderScheduleMode.class, str);
    }

    public static RecurringOrderScheduleMode[] values() {
        return (RecurringOrderScheduleMode[]) $VALUES.clone();
    }
}
