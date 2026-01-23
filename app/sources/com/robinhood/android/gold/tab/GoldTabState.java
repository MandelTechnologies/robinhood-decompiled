package com.robinhood.android.gold.tab;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GoldTabState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/gold/tab/GoldTabState;", "", "<init>", "(Ljava/lang/String;I)V", "SHOW_GOLD_UPGRADE", "SHOW_GOLD_HUB", "NONE", "lib-gold-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldTabState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GoldTabState[] $VALUES;
    public static final GoldTabState SHOW_GOLD_UPGRADE = new GoldTabState("SHOW_GOLD_UPGRADE", 0);
    public static final GoldTabState SHOW_GOLD_HUB = new GoldTabState("SHOW_GOLD_HUB", 1);
    public static final GoldTabState NONE = new GoldTabState("NONE", 2);

    private static final /* synthetic */ GoldTabState[] $values() {
        return new GoldTabState[]{SHOW_GOLD_UPGRADE, SHOW_GOLD_HUB, NONE};
    }

    public static EnumEntries<GoldTabState> getEntries() {
        return $ENTRIES;
    }

    private GoldTabState(String str, int i) {
    }

    static {
        GoldTabState[] goldTabStateArr$values = $values();
        $VALUES = goldTabStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(goldTabStateArr$values);
    }

    public static GoldTabState valueOf(String str) {
        return (GoldTabState) Enum.valueOf(GoldTabState.class, str);
    }

    public static GoldTabState[] values() {
        return (GoldTabState[]) $VALUES.clone();
    }
}
