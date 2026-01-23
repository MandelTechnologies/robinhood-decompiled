package com.robinhood.android.p148fx.tooltip;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TooltipPopup.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/fx/tooltip/TooltipAlignment;", "", "<init>", "(Ljava/lang/String;I)V", "Top", "Bottom", "lib-fx-tooltip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.fx.tooltip.TooltipAlignment, reason: use source file name */
/* loaded from: classes10.dex */
public final class TooltipPopup2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TooltipPopup2[] $VALUES;
    public static final TooltipPopup2 Top = new TooltipPopup2("Top", 0);
    public static final TooltipPopup2 Bottom = new TooltipPopup2("Bottom", 1);

    private static final /* synthetic */ TooltipPopup2[] $values() {
        return new TooltipPopup2[]{Top, Bottom};
    }

    public static EnumEntries<TooltipPopup2> getEntries() {
        return $ENTRIES;
    }

    private TooltipPopup2(String str, int i) {
    }

    static {
        TooltipPopup2[] tooltipPopup2Arr$values = $values();
        $VALUES = tooltipPopup2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(tooltipPopup2Arr$values);
    }

    public static TooltipPopup2 valueOf(String str) {
        return (TooltipPopup2) Enum.valueOf(TooltipPopup2.class, str);
    }

    public static TooltipPopup2[] values() {
        return (TooltipPopup2[]) $VALUES.clone();
    }
}
