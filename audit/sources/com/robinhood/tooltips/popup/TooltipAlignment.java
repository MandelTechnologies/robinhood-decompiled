package com.robinhood.tooltips.popup;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PopupTooltip.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/tooltips/popup/TooltipAlignment;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "lib-design-system-tooltips_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class TooltipAlignment {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TooltipAlignment[] $VALUES;
    public static final TooltipAlignment TOP = new TooltipAlignment("TOP", 0);
    public static final TooltipAlignment BOTTOM = new TooltipAlignment("BOTTOM", 1);

    private static final /* synthetic */ TooltipAlignment[] $values() {
        return new TooltipAlignment[]{TOP, BOTTOM};
    }

    public static EnumEntries<TooltipAlignment> getEntries() {
        return $ENTRIES;
    }

    private TooltipAlignment(String str, int i) {
    }

    static {
        TooltipAlignment[] tooltipAlignmentArr$values = $values();
        $VALUES = tooltipAlignmentArr$values;
        $ENTRIES = EnumEntries2.enumEntries(tooltipAlignmentArr$values);
    }

    public static TooltipAlignment valueOf(String str) {
        return (TooltipAlignment) Enum.valueOf(TooltipAlignment.class, str);
    }

    public static TooltipAlignment[] values() {
        return (TooltipAlignment[]) $VALUES.clone();
    }
}
