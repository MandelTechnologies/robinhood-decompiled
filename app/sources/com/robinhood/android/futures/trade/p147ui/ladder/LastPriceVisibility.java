package com.robinhood.android.futures.trade.p147ui.ladder;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Ladder.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/LastPriceVisibility;", "", "<init>", "(Ljava/lang/String;I)V", "ONSCREEN", "OFFSCREEN_TOP", "OFFSCREEN_BOTTOM", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class LastPriceVisibility {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LastPriceVisibility[] $VALUES;
    public static final LastPriceVisibility ONSCREEN = new LastPriceVisibility("ONSCREEN", 0);
    public static final LastPriceVisibility OFFSCREEN_TOP = new LastPriceVisibility("OFFSCREEN_TOP", 1);
    public static final LastPriceVisibility OFFSCREEN_BOTTOM = new LastPriceVisibility("OFFSCREEN_BOTTOM", 2);

    private static final /* synthetic */ LastPriceVisibility[] $values() {
        return new LastPriceVisibility[]{ONSCREEN, OFFSCREEN_TOP, OFFSCREEN_BOTTOM};
    }

    public static EnumEntries<LastPriceVisibility> getEntries() {
        return $ENTRIES;
    }

    private LastPriceVisibility(String str, int i) {
    }

    static {
        LastPriceVisibility[] lastPriceVisibilityArr$values = $values();
        $VALUES = lastPriceVisibilityArr$values;
        $ENTRIES = EnumEntries2.enumEntries(lastPriceVisibilityArr$values);
    }

    public static LastPriceVisibility valueOf(String str) {
        return (LastPriceVisibility) Enum.valueOf(LastPriceVisibility.class, str);
    }

    public static LastPriceVisibility[] values() {
        return (LastPriceVisibility[]) $VALUES.clone();
    }
}
