package com.robinhood.android.settings.p254ui.notification;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationSettings4Composable.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/BottomSheetRowContentType;", "", "<init>", "(Ljava/lang/String;I)V", "BOTTOM_SHEET_ROW", "SNOOZE_BOTTOM_SHEET_ROW", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.settings.ui.notification.BottomSheetRowContentType, reason: use source file name */
/* loaded from: classes5.dex */
final class NotificationSettings4Composable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NotificationSettings4Composable[] $VALUES;
    public static final NotificationSettings4Composable BOTTOM_SHEET_ROW = new NotificationSettings4Composable("BOTTOM_SHEET_ROW", 0);
    public static final NotificationSettings4Composable SNOOZE_BOTTOM_SHEET_ROW = new NotificationSettings4Composable("SNOOZE_BOTTOM_SHEET_ROW", 1);

    private static final /* synthetic */ NotificationSettings4Composable[] $values() {
        return new NotificationSettings4Composable[]{BOTTOM_SHEET_ROW, SNOOZE_BOTTOM_SHEET_ROW};
    }

    public static EnumEntries<NotificationSettings4Composable> getEntries() {
        return $ENTRIES;
    }

    private NotificationSettings4Composable(String str, int i) {
    }

    static {
        NotificationSettings4Composable[] notificationSettings4ComposableArr$values = $values();
        $VALUES = notificationSettings4ComposableArr$values;
        $ENTRIES = EnumEntries2.enumEntries(notificationSettings4ComposableArr$values);
    }

    public static NotificationSettings4Composable valueOf(String str) {
        return (NotificationSettings4Composable) Enum.valueOf(NotificationSettings4Composable.class, str);
    }

    public static NotificationSettings4Composable[] values() {
        return (NotificationSettings4Composable[]) $VALUES.clone();
    }
}
