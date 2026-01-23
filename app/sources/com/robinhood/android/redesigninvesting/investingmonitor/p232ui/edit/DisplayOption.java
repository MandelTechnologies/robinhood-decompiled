package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.edit;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InvestingMonitorActionsBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/edit/DisplayOption;", "", "<init>", "(Ljava/lang/String;I)V", "CHART_1D", "MARKET_CAP", "VOLUME", "feature-investing-monitor_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class DisplayOption {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DisplayOption[] $VALUES;
    public static final DisplayOption CHART_1D = new DisplayOption("CHART_1D", 0);
    public static final DisplayOption MARKET_CAP = new DisplayOption("MARKET_CAP", 1);
    public static final DisplayOption VOLUME = new DisplayOption("VOLUME", 2);

    private static final /* synthetic */ DisplayOption[] $values() {
        return new DisplayOption[]{CHART_1D, MARKET_CAP, VOLUME};
    }

    public static EnumEntries<DisplayOption> getEntries() {
        return $ENTRIES;
    }

    private DisplayOption(String str, int i) {
    }

    static {
        DisplayOption[] displayOptionArr$values = $values();
        $VALUES = displayOptionArr$values;
        $ENTRIES = EnumEntries2.enumEntries(displayOptionArr$values);
    }

    public static DisplayOption valueOf(String str) {
        return (DisplayOption) Enum.valueOf(DisplayOption.class, str);
    }

    public static DisplayOption[] values() {
        return (DisplayOption[]) $VALUES.clone();
    }
}
