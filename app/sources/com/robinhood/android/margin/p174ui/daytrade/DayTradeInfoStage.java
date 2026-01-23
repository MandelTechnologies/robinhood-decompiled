package com.robinhood.android.margin.p174ui.daytrade;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DayTradeInfoStage.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStage;", "", "<init>", "(Ljava/lang/String;I)V", "INTRO", "TUTORIAL_STEPS", "PROTECTION_ENABLED", "RECOMMEND_PROTECTION", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class DayTradeInfoStage {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DayTradeInfoStage[] $VALUES;
    public static final DayTradeInfoStage INTRO = new DayTradeInfoStage("INTRO", 0);
    public static final DayTradeInfoStage TUTORIAL_STEPS = new DayTradeInfoStage("TUTORIAL_STEPS", 1);
    public static final DayTradeInfoStage PROTECTION_ENABLED = new DayTradeInfoStage("PROTECTION_ENABLED", 2);
    public static final DayTradeInfoStage RECOMMEND_PROTECTION = new DayTradeInfoStage("RECOMMEND_PROTECTION", 3);

    private static final /* synthetic */ DayTradeInfoStage[] $values() {
        return new DayTradeInfoStage[]{INTRO, TUTORIAL_STEPS, PROTECTION_ENABLED, RECOMMEND_PROTECTION};
    }

    public static EnumEntries<DayTradeInfoStage> getEntries() {
        return $ENTRIES;
    }

    private DayTradeInfoStage(String str, int i) {
    }

    static {
        DayTradeInfoStage[] dayTradeInfoStageArr$values = $values();
        $VALUES = dayTradeInfoStageArr$values;
        $ENTRIES = EnumEntries2.enumEntries(dayTradeInfoStageArr$values);
    }

    public static DayTradeInfoStage valueOf(String str) {
        return (DayTradeInfoStage) Enum.valueOf(DayTradeInfoStage.class, str);
    }

    public static DayTradeInfoStage[] values() {
        return (DayTradeInfoStage[]) $VALUES.clone();
    }
}
