package com.robinhood.android.equitydetail.p123ui.tradebar;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DisplayType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/tradebar/DisplayType;", "", "<init>", "(Ljava/lang/String;I)V", "VOLUME", "QUOTE", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class DisplayType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DisplayType[] $VALUES;
    public static final DisplayType VOLUME = new DisplayType("VOLUME", 0);
    public static final DisplayType QUOTE = new DisplayType("QUOTE", 1);

    private static final /* synthetic */ DisplayType[] $values() {
        return new DisplayType[]{VOLUME, QUOTE};
    }

    public static EnumEntries<DisplayType> getEntries() {
        return $ENTRIES;
    }

    private DisplayType(String str, int i) {
    }

    static {
        DisplayType[] displayTypeArr$values = $values();
        $VALUES = displayTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(displayTypeArr$values);
    }

    public static DisplayType valueOf(String str) {
        return (DisplayType) Enum.valueOf(DisplayType.class, str);
    }

    public static DisplayType[] values() {
        return (DisplayType[]) $VALUES.clone();
    }
}
