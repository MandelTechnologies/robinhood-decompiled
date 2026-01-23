package com.robinhood.android.optionschain.sbschain.table;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TooltipOverlay.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/TriangleDirection;", "", "<init>", "(Ljava/lang/String;I)V", "UP", "DOWN", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.sbschain.table.TriangleDirection, reason: use source file name */
/* loaded from: classes11.dex */
public final class TooltipOverlay3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TooltipOverlay3[] $VALUES;

    /* renamed from: UP */
    public static final TooltipOverlay3 f4807UP = new TooltipOverlay3("UP", 0);
    public static final TooltipOverlay3 DOWN = new TooltipOverlay3("DOWN", 1);

    private static final /* synthetic */ TooltipOverlay3[] $values() {
        return new TooltipOverlay3[]{f4807UP, DOWN};
    }

    public static EnumEntries<TooltipOverlay3> getEntries() {
        return $ENTRIES;
    }

    private TooltipOverlay3(String str, int i) {
    }

    static {
        TooltipOverlay3[] tooltipOverlay3Arr$values = $values();
        $VALUES = tooltipOverlay3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(tooltipOverlay3Arr$values);
    }

    public static TooltipOverlay3 valueOf(String str) {
        return (TooltipOverlay3) Enum.valueOf(TooltipOverlay3.class, str);
    }

    public static TooltipOverlay3[] values() {
        return (TooltipOverlay3[]) $VALUES.clone();
    }
}
