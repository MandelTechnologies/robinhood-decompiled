package com.robinhood.android.event.detail.p129ui.bottomsheets;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EventDetailDisplayDataBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/event/detail/ui/bottomsheets/EventDetailContractDisplayMode;", "", "<init>", "(Ljava/lang/String;I)V", "LAST_YES_PRICE", "OPEN_PNL", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.ui.bottomsheets.EventDetailContractDisplayMode, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventDetailDisplayDataBottomSheet {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EventDetailDisplayDataBottomSheet[] $VALUES;
    public static final EventDetailDisplayDataBottomSheet LAST_YES_PRICE = new EventDetailDisplayDataBottomSheet("LAST_YES_PRICE", 0);
    public static final EventDetailDisplayDataBottomSheet OPEN_PNL = new EventDetailDisplayDataBottomSheet("OPEN_PNL", 1);

    private static final /* synthetic */ EventDetailDisplayDataBottomSheet[] $values() {
        return new EventDetailDisplayDataBottomSheet[]{LAST_YES_PRICE, OPEN_PNL};
    }

    public static EnumEntries<EventDetailDisplayDataBottomSheet> getEntries() {
        return $ENTRIES;
    }

    private EventDetailDisplayDataBottomSheet(String str, int i) {
    }

    static {
        EventDetailDisplayDataBottomSheet[] eventDetailDisplayDataBottomSheetArr$values = $values();
        $VALUES = eventDetailDisplayDataBottomSheetArr$values;
        $ENTRIES = EnumEntries2.enumEntries(eventDetailDisplayDataBottomSheetArr$values);
    }

    public static EventDetailDisplayDataBottomSheet valueOf(String str) {
        return (EventDetailDisplayDataBottomSheet) Enum.valueOf(EventDetailDisplayDataBottomSheet.class, str);
    }

    public static EventDetailDisplayDataBottomSheet[] values() {
        return (EventDetailDisplayDataBottomSheet[]) $VALUES.clone();
    }
}
