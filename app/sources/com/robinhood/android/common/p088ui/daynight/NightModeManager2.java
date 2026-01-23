package com.robinhood.android.common.p088ui.daynight;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NightModeManager.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/ui/daynight/DayNightMode;", "", "<init>", "(Ljava/lang/String;I)V", "DAY", "NIGHT", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.ui.daynight.DayNightMode, reason: use source file name */
/* loaded from: classes17.dex */
public final class NightModeManager2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NightModeManager2[] $VALUES;
    public static final NightModeManager2 DAY = new NightModeManager2("DAY", 0);
    public static final NightModeManager2 NIGHT = new NightModeManager2("NIGHT", 1);

    private static final /* synthetic */ NightModeManager2[] $values() {
        return new NightModeManager2[]{DAY, NIGHT};
    }

    public static EnumEntries<NightModeManager2> getEntries() {
        return $ENTRIES;
    }

    private NightModeManager2(String str, int i) {
    }

    static {
        NightModeManager2[] nightModeManager2Arr$values = $values();
        $VALUES = nightModeManager2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(nightModeManager2Arr$values);
    }

    public static NightModeManager2 valueOf(String str) {
        return (NightModeManager2) Enum.valueOf(NightModeManager2.class, str);
    }

    public static NightModeManager2[] values() {
        return (NightModeManager2[]) $VALUES.clone();
    }
}
