package com.robinhood.tooltips.popup;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PopupTooltip.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/tooltips/popup/PopupPositioning;", "", "<init>", "(Ljava/lang/String;I)V", "FREE", "ABOVE", "BELOW", "lib-design-system-tooltips_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class PopupPositioning {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PopupPositioning[] $VALUES;
    public static final PopupPositioning FREE = new PopupPositioning("FREE", 0);
    public static final PopupPositioning ABOVE = new PopupPositioning("ABOVE", 1);
    public static final PopupPositioning BELOW = new PopupPositioning("BELOW", 2);

    private static final /* synthetic */ PopupPositioning[] $values() {
        return new PopupPositioning[]{FREE, ABOVE, BELOW};
    }

    public static EnumEntries<PopupPositioning> getEntries() {
        return $ENTRIES;
    }

    private PopupPositioning(String str, int i) {
    }

    static {
        PopupPositioning[] popupPositioningArr$values = $values();
        $VALUES = popupPositioningArr$values;
        $ENTRIES = EnumEntries2.enumEntries(popupPositioningArr$values);
    }

    public static PopupPositioning valueOf(String str) {
        return (PopupPositioning) Enum.valueOf(PopupPositioning.class, str);
    }

    public static PopupPositioning[] values() {
        return (PopupPositioning[]) $VALUES.clone();
    }
}
