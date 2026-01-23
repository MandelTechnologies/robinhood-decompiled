package com.robinhood.android.options.contracts;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionStatisticsLaunchMode.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionStatisticsLaunchMode;", "", "watchlistActionsAvailable", "", "<init>", "(Ljava/lang/String;IZ)V", "getWatchlistActionsAvailable", "()Z", "NORMAL_ORDER", "ROLL", "STRATEGY_BUILDER", "INFO_ONLY", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionStatisticsLaunchMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionStatisticsLaunchMode[] $VALUES;
    private final boolean watchlistActionsAvailable;
    public static final OptionStatisticsLaunchMode NORMAL_ORDER = new OptionStatisticsLaunchMode("NORMAL_ORDER", 0, true);
    public static final OptionStatisticsLaunchMode ROLL = new OptionStatisticsLaunchMode("ROLL", 1, false);
    public static final OptionStatisticsLaunchMode STRATEGY_BUILDER = new OptionStatisticsLaunchMode("STRATEGY_BUILDER", 2, false);
    public static final OptionStatisticsLaunchMode INFO_ONLY = new OptionStatisticsLaunchMode("INFO_ONLY", 3, false);

    private static final /* synthetic */ OptionStatisticsLaunchMode[] $values() {
        return new OptionStatisticsLaunchMode[]{NORMAL_ORDER, ROLL, STRATEGY_BUILDER, INFO_ONLY};
    }

    public static EnumEntries<OptionStatisticsLaunchMode> getEntries() {
        return $ENTRIES;
    }

    private OptionStatisticsLaunchMode(String str, int i, boolean z) {
        this.watchlistActionsAvailable = z;
    }

    public final boolean getWatchlistActionsAvailable() {
        return this.watchlistActionsAvailable;
    }

    static {
        OptionStatisticsLaunchMode[] optionStatisticsLaunchModeArr$values = $values();
        $VALUES = optionStatisticsLaunchModeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionStatisticsLaunchModeArr$values);
    }

    public static OptionStatisticsLaunchMode valueOf(String str) {
        return (OptionStatisticsLaunchMode) Enum.valueOf(OptionStatisticsLaunchMode.class, str);
    }

    public static OptionStatisticsLaunchMode[] values() {
        return (OptionStatisticsLaunchMode[]) $VALUES.clone();
    }
}
